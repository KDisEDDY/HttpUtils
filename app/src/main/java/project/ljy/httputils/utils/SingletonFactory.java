package project.ljy.httputils.utils;

import android.util.Log;

import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Title: SingletonFactory
 * Description:
 * Copyright: Copyright (c) 2014-2016 gjfax.com
 * Company: 广金所
 * Author: 刘加彦
 * Date: 2016/7/8
 * Version: 1.0
 */
public class SingletonFactory {
    private static final String TAG = SingletonFactory.class.getSimpleName();
    private static Map<String, Object> objectCache = Collections.synchronizedMap(new HashMap());

    public SingletonFactory() {
    }

    public static <T> T getInstance(Class<T> clazz) {
        Object result = null;
        Class var2 = SingletonFactory.class;
        synchronized(SingletonFactory.class) {
            if(objectCache == null) {
                objectCache = Collections.synchronizedMap(new HashMap());
            }
        }

        Map var5 = objectCache;
        synchronized(objectCache) {
            result = objectCache.get(clazz.getName());
            if(result == null) {
                result = createInstance(clazz);
                if(result != null) {
                    objectCache.put(clazz.getName(), result);
                }
            }

            return (T) result;
        }
    }

    public static <T> T getInstance(Class<T> clazz, Class<?>[] parameterTypes, Object[] paramValues) {
        String key = clazz.getName();
        Object result = null;
        Class var5 = SingletonFactory.class;
        synchronized(SingletonFactory.class) {
            if(objectCache == null) {
                objectCache = Collections.synchronizedMap(new HashMap());
            }
        }

        Map var9 = objectCache;
        synchronized(objectCache) {
            if(paramValues != null) {
                for(int nIndex = 0; nIndex < paramValues.length; ++nIndex) {
                    key = key + "|";
                    key = key + paramValues[nIndex].toString();
                }
            }

            result = objectCache.get(key);
            if(result == null) {
                result = createInstance(clazz, parameterTypes, paramValues);
                if(result != null) {
                    objectCache.put(key, result);
                }
            }

            return (T) result;
        }
    }

    private static <T> T createInstance(Class<T> clazz) {
        try {
            Object e = clazz.newInstance();
            return (T) e;
        } catch (InstantiationException var2) {
            Log.e(TAG, "创建对象实例失败!" + var2.toString());
            return null;
        } catch (IllegalAccessException var3) {
            Log.e(TAG, "创建对象实例失败!" + var3.toString());
            return null;
        }
    }

    private static <T> T createInstance(Class<T> clazz, Class<?>[] parameterTypes, Object[] paramValues) {
        try {
            Constructor e = clazz.getConstructor(parameterTypes);
            Object result = e.newInstance(paramValues);
            return (T) result;
        } catch (InstantiationException var5) {
            Log.e(TAG, "创建对象实例失败!" + var5.toString());
            return null;
        } catch (Exception var6) {
            Log.e(TAG, "创建对象实例失败!" + var6.toString());
            return null;
        }
    }

    public static void releaseCache() {
        if(objectCache != null) {
            objectCache.clear();
        }

    }

    protected void finalize() throws Throwable {
        releaseCache();
        super.finalize();
    }
}
