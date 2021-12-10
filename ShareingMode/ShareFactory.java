package designPattern.ShareingMode;

import java.util.HashMap;

/**
 *  共享模式-共享工厂
 * @data2021/9/18,14:59
 * @authorMSI
 */
public class ShareFactory implements ShareAwire{

    // 对象共享池
    private HashMap<String, ShareAwire> objectSharingpool;

    ShareFactory(){
        this.objectSharingpool = new HashMap<>();
    }

    // 获取某个对象 , 必须是全量类名
    public  ShareAwire getObjectSharingpool(String name) {

        ShareAwire shareAwire = objectSharingpool.get(name);
        if (shareAwire == null) {
            Class clc = null;
            try {
                clc = Class.forName(name);
                try {
                   shareAwire = (ShareAwire) clc.newInstance();
                    objectSharingpool.put(name,shareAwire);
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return shareAwire;
    }
}
