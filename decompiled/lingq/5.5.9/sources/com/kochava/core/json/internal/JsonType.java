package com.kochava.core.json.internal;

import java.lang.reflect.Type;
import p534zf.C10483a;
import p534zf.C10485c;
import p534zf.C10487e;
import p534zf.InterfaceC10484b;
import p534zf.InterfaceC10488f;

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
        if (obj != null && obj != C10485c.f52415b) {
            if (obj == C10485c.f52416c) {
                return Invalid;
            }
            Class<?> cls = obj.getClass();
            if (cls == String.class) {
                return String;
            }
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                return Boolean;
            }
            if (cls != Integer.TYPE && cls != Integer.class) {
                if (cls != Long.TYPE && cls != Long.class) {
                    if (cls != Float.TYPE && cls != Float.class) {
                        if (cls == Double.TYPE || cls == Double.class) {
                            return Double;
                        }
                        if (cls == InterfaceC10488f.class || cls == C10487e.class) {
                            return JsonObject;
                        }
                        return (cls == InterfaceC10484b.class || cls == C10483a.class) ? JsonArray : Invalid;
                    }
                    return Float;
                }
                return Long;
            }
            return Int;
        }
        return Null;
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
                if (type == Long.TYPE || type == Long.class) {
                    return Long;
                }
                if (type != Float.TYPE && type != Float.class) {
                    if (type != Double.TYPE && type != Double.class) {
                        if (type == InterfaceC10488f.class || type == C10487e.class) {
                            return JsonObject;
                        }
                        return (type == InterfaceC10484b.class || type == C10483a.class) ? JsonArray : Invalid;
                    }
                    return Double;
                }
                return Float;
            }
            return Int;
        }
        return Boolean;
    }
}
