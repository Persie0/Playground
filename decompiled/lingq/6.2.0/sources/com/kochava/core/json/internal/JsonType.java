package com.kochava.core.json.internal;

import java.lang.reflect.Type;
import p000.dg4;
import p000.ef4;
import p000.eg4;
import p000.ff4;
import p000.rf4;

/* JADX INFO: loaded from: classes.dex */
public enum JsonType {
    Invalid,
    Null,
    String,
    Boolean,
    Int,
    Long,
    Float,
    Double,
    JsonObject,
    JsonArray;

    public static JsonType getType(Object obj) {
        if (obj == null || obj == rf4.f59201b) {
            return Null;
        }
        if (obj == rf4.f59202c) {
            return Invalid;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return String;
        }
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            return Boolean;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            return Int;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            return Long;
        }
        if (cls == Float.TYPE || cls == Float.class) {
            return Float;
        }
        if (cls == Double.TYPE || cls == Double.class) {
            return Double;
        }
        if (cls == eg4.class || cls == dg4.class) {
            return JsonObject;
        }
        return (cls == ff4.class || cls == ef4.class) ? JsonArray : Invalid;
    }

    public static JsonType getType(Type type) {
        if (type == null) {
            return Null;
        }
        if (type == String.class) {
            return String;
        }
        if (type != Boolean.TYPE && type != Boolean.class) {
            if (type != Integer.TYPE && type != Integer.class) {
                if (type != Long.TYPE && type != Long.class) {
                    if (type != Float.TYPE && type != Float.class) {
                        if (type != Double.TYPE && type != Double.class) {
                            if (type != eg4.class && type != dg4.class) {
                                if (type != ff4.class && type != ef4.class) {
                                    return Invalid;
                                }
                                return JsonArray;
                            }
                            return JsonObject;
                        }
                        return Double;
                    }
                    return Float;
                }
                return Long;
            }
            return Int;
        }
        return Boolean;
    }
}
