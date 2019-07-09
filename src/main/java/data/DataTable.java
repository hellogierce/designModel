package data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class DataTable {

    List<DataRow> rows =new ArrayList<>();

    public DataTable() {
    }

    public DataTable(List<DataRow> rows) {
        this.rows = rows;
    }

    public List<DataRow> getRows() {
        return rows;
    }

    public void setRows(List<DataRow> rows) {
        this.rows = rows;
    }

    public static List<DataRow> select(DataColumn dc,DataTable table){
        List<DataRow> result=new ArrayList<>();
        for(DataRow obj:table.getRows()){
            for(DataColumn column:obj.getCol()){
                if (column.equals(dc)){
                    result.add(obj);
                    break;
                }
            }
        }
        return result;
    }
}
