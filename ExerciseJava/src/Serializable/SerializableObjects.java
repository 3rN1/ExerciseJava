package Serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableObjects {
    /*La serializacion es el proceso de convertir un objeto en una secuencia de bytes para
    almacenarlo o transmitirlo a la memoria, a una DB o a un archivo. Su proposito gral es
    guardar el estado de un objeto para poder volver a crearlo cuando sea necesario.*/

    public static boolean serializeObjet(String pathDir, Serializable object) {
        boolean sw = false;
        try (FileOutputStream fos = new FileOutputStream(pathDir);
             ObjectOutputStream output = new ObjectOutputStream(fos);) {
            output.writeObject(object);
            sw = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return sw;
    }

    public static <E> E deserializeObjet(String pathDir, Class<E> classObject) {
        E object = null;
        try (FileInputStream fis = new FileInputStream(pathDir);
             ObjectInputStream input = new ObjectInputStream(fis);) {
            object = (E) input.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }

}
