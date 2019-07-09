package data;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @功能描述 数据列，也是最简单的数据项，相当于表格中的一个单元项目。
 * 采用健值对思想，key为列名，value对应key值的单元格元素，为Object类型
 * @可能的错误
 * @作者 王磊
 * @修改说明
 * @修改人
 */
public class DataColumn {
    String key;
    Object value;

    public DataColumn(String k, Object v) {
        key = k;
        value = v;
    }

    public String getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object obj) {
        DataColumn col=(DataColumn)obj;
        if(this.key.equals(col.getKey())&&this.value.equals(col.getValue())){
            return true;
        }else{
            return false;
        }
    }
}
