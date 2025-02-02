package com.jskno.n_reflection;

import com.jskno.n_reflection.model.SingletonEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;

public class E2_SerializingSingletonEnum {

    private final static Logger logger = LoggerFactory.getLogger(E2_SerializingSingletonEnum.class.getName());

    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        singleton.setName("firstName");

        // Serialize
        try {
            FileOutputStream fileOut = new FileOutputStream("out.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(singleton);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            logger.error(e.getMessage());
        }

        //singleton.setName("secondName");
        singleton.setName(null);

        // Deserialize
        SingletonEnum singleton2 = null;
        try {
            FileInputStream fileIn = new FileInputStream("out.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            singleton2 = (SingletonEnum) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException i) {
            logger.error(i.getMessage());
        } catch (ClassNotFoundException c) {
            System.out.println("singletons.SingletonEnum class not found");
            logger.error(c.getMessage());
        }

        if (singleton == singleton2) {
            System.out.println("Two objects are same");
        } else {
            System.out.println("Two objects are not same");
        }

        System.out.println(singleton.getName());
        assert singleton2 != null;
        System.out.println(singleton2.getName());

    }
}
