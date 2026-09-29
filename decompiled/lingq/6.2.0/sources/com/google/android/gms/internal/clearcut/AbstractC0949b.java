package com.google.android.gms.internal.clearcut;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.ij6;
import p000.r0c;
import p000.u3c;
import p000.zmb;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.b */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0949b extends zmb {
    private static Map<Object, AbstractC0949b> zzjr = new ConcurrentHashMap();
    protected u3c zzjp;
    private int zzjq;

    public AbstractC0949b() {
        this.zzex = 0;
        this.zzjp = u3c.f63367e;
        this.zzjq = -1;
    }

    /* JADX INFO: renamed from: b */
    public static Object m5290b(Method method, AbstractC0949b abstractC0949b, Object... objArr) {
        Throwable e;
        String str;
        try {
            return method.invoke(abstractC0949b, objArr);
        } catch (IllegalAccessException e2) {
            e = e2;
            str = "Couldn't use Java reflection to implement protocol message reflection.";
            ij6.m13958p(str, e);
            return null;
        } catch (InvocationTargetException e3) {
            e = e3.getCause();
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            if (e instanceof Error) {
                throw ((Error) e);
            }
            str = "Unexpected exception thrown by generated accessor method.";
            ij6.m13958p(str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m5291c(Class cls, AbstractC0949b abstractC0949b) {
        zzjr.put(cls, abstractC0949b);
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC0949b m5292d(Class cls) {
        AbstractC0949b abstractC0949b = zzjr.get(cls);
        if (abstractC0949b == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0949b = zzjr.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC0949b != null) {
            return abstractC0949b;
        }
        String name = cls.getName();
        throw new IllegalStateException(name.length() != 0 ? "Unable to get default instance for: ".concat(name) : new String("Unable to get default instance for: "));
    }

    /* JADX INFO: renamed from: a */
    public abstract Object mo5293a(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!((AbstractC0949b) mo5293a(6)).getClass().isInstance(obj)) {
            return false;
        }
        r0c r0cVar = r0c.f58470c;
        r0cVar.getClass();
        return r0cVar.m20230a(getClass()).mo5308c(this, (AbstractC0949b) obj);
    }

    public final int hashCode() {
        int i = this.zzex;
        if (i != 0) {
            return i;
        }
        r0c r0cVar = r0c.f58470c;
        r0cVar.getClass();
        int iMo5309d = r0cVar.m20230a(getClass()).mo5309d(this);
        this.zzex = iMo5309d;
        return iMo5309d;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC0951d.m5297a(this, sb, 0);
        return sb.toString();
    }
}
