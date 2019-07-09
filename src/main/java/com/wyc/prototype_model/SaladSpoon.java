package com.wyc.prototype_model;

import java.io.*;

public class SaladSpoon extends AbstractSpoon implements Serializable {
    public SaladSpoon(){
        setSpoonName("salad spoon");
    }

    public Object deepClone() {
        //通过序列化方法实现深拷贝
        Object obj=null;
        try {
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            obj=(SaladSpoon)ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}
