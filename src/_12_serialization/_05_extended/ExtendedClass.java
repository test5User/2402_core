package _12_serialization._05_extended;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.Base64;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ExtendedClass implements Externalizable {
    private String firstName;
    private String lastName;
    private String password;

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        //записываем значения полей объекта в файл
        out.writeObject(firstName);
        out.writeObject(lastName);
        //поле пароль мы дополнительно зашифруем перед записью
        out.writeObject(encryptString(password));
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        //вот тут создается объект конструктором по умолчанию
        //и заполняются поля этого объекта
        firstName = (String) in.readObject();
        lastName = (String) in.readObject();
        password = decryptString((String) in.readObject());
    }

    private String encryptString(String data) {
        //Используем стандартный механизм шифрования Джава
        //метод encodeToString принимает на вход массив байт и возвращает строку (входная
        //строка в зашифрованном виде)
        var encryptedData = Base64.getEncoder().encodeToString(data.getBytes());
        System.out.println(encryptedData);
        return encryptedData;
    }

    private String decryptString(String data) {
        //Используем стандартный механизм шифрования Джава
        //метод decode принимает на вход массив байт и возвращает строку
        //т.е. наши расшифрованные данные
        var decryptedData = new String(Base64.getDecoder().decode(data));
        System.out.println(decryptedData);
        return decryptedData;
    }
}
