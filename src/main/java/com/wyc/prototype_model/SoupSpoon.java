package com.wyc.prototype_model;

import java.io.*;

public class SoupSpoon extends AbstractSpoon implements Serializable,Cloneable {
    String material;

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public SoupSpoon() {
        setSpoonName("soup spoon");
    }
    public SoupSpoon(String material) {
        setSpoonName("soup spoon");
        this.material=material;
    }
    /**
     * 浅拷贝
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object object=super.clone();
        return object;
    }
    public SoupSpoon deepClone() {
        //通过序列化方法实现深拷贝
        SoupSpoon obj=null;
        try {
            ByteArrayOutputStream bos=new ByteArrayOutputStream();
            ObjectOutputStream oos=new ObjectOutputStream(bos);
            oos.writeObject(this);
            oos.flush();
            ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));
            obj=(SoupSpoon)ois.readObject();
        }catch (Exception e){
            e.printStackTrace();
        }
        return obj;
    }
}
