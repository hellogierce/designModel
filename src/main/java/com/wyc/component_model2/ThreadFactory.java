package com.wyc.component_model2;

import data.DataColumn;
import data.DataRow;
import data.DataTable;

import java.util.ArrayList;
import java.util.List;

public class ThreadFactory {
    DataTable table=new DataTable();
    public ThreadFactory(){
        DataRow row=new DataRow();
        row.getCol().add(new DataColumn("content","love"));
        row.getCol().add(new DataColumn("isTop","true"));
        row.getCol().add(new DataColumn("isMessage","false"));
        row.getCol().add(new DataColumn("id","1"));
        row.getCol().add(new DataColumn("parentId","0"));
        table.getRows().add(row);
        DataRow row1=new DataRow();
        row1.getCol().add(new DataColumn("content","love is beautiful"));
        row1.getCol().add(new DataColumn("isTop","false"));
        row1.getCol().add(new DataColumn("isMessage","true"));
        row1.getCol().add(new DataColumn("id","2"));
        row1.getCol().add(new DataColumn("parentId","1"));
        table.getRows().add(row1);
        DataRow row2=new DataRow();
        row2.getCol().add(new DataColumn("content","food"));
        row2.getCol().add(new DataColumn("isTop","true"));
        row2.getCol().add(new DataColumn("isMessage","false"));
        row2.getCol().add(new DataColumn("id","3"));
        row2.getCol().add(new DataColumn("parentId","0"));
        table.getRows().add(row2);
        DataRow row3=new DataRow();
        row3.getCol().add(new DataColumn("content","i like noodles"));
        row3.getCol().add(new DataColumn("isTop","false"));
        row3.getCol().add(new DataColumn("isMessage","true"));
        row3.getCol().add(new DataColumn("id","4"));
        row3.getCol().add(new DataColumn("parentId","3"));
        table.getRows().add(row3);
        DataRow row4=new DataRow();
        row4.getCol().add(new DataColumn("content","i like dumplings"));
        row4.getCol().add(new DataColumn("isTop","false"));
        row4.getCol().add(new DataColumn("isMessage","true"));
        row4.getCol().add(new DataColumn("id","5"));
        row4.getCol().add(new DataColumn("parentId","3"));
        table.getRows().add(row4);
    }
    public List<IThread> getTopThreads(){
        List<IThread> list=new ArrayList<>();
        List<DataRow> list1=table.select(new DataColumn("isTop", "true"), table);
        for(DataRow row:list1){
            Thread t=new Thread();
            t.setContent((String) row.getColumn("content"));
            t.setTop(true);
            List<DataRow> list2=table.select(new DataColumn("parentId", row.getColumn("id")), table);
            for (DataRow obj:list2){
                if(obj.getColumn("isMessage").toString().equals("true")){
                    Message m=new Message();
                    m.setContent((String)obj.getColumn("content"));
                    m.setTop(false);
                    t.add(m);
                }else{
                    Thread tt=new Thread();
                    tt.setContent((String) obj.getColumn("content"));
                    t.setTop(true);
                    t.add(tt);
                }
            }
            list.add(t);
        }
        return list;
    }

    public static void main(String[] args) {
        ThreadFactory factory=new ThreadFactory();
        List<IThread> threads=factory.getTopThreads();
        for (IThread t:threads){
            t.renderContent();
        }
    }
}
