package com.google.android.gms.internal.vision;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p000.doc;
import p000.f0d;
import p000.fpc;
import p000.gfc;
import p000.ij6;
import p000.ovc;
import p000.ozc;
import p000.uk9;

/* JADX INFO: renamed from: com.google.android.gms.internal.vision.s */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC1034s extends gfc {
    private static Map<Object, AbstractC1034s> zzd = new ConcurrentHashMap();
    protected ozc zzb;
    private int zzc;

    public AbstractC1034s() {
        this.zza = 0;
        this.zzb = ozc.f55341f;
        this.zzc = -1;
    }

    /* JADX INFO: renamed from: d */
    public static AbstractC1034s m5740d(Class cls) {
        AbstractC1034s abstractC1034s = zzd.get(cls);
        if (abstractC1034s == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC1034s = zzd.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC1034s != null) {
            return abstractC1034s;
        }
        AbstractC1034s abstractC1034s2 = (AbstractC1034s) ((AbstractC1034s) f0d.m11435b(cls)).mo5699e(6);
        if (abstractC1034s2 != null) {
            zzd.put(cls, abstractC1034s2);
            return abstractC1034s2;
        }
        uk9.m22770c();
        return null;
    }

    /* JADX INFO: renamed from: f */
    public static Object m5741f(Method method, AbstractC1034s abstractC1034s, Object... objArr) {
        try {
            return method.invoke(abstractC1034s, objArr);
        } catch (IllegalAccessException e) {
            ij6.m13958p("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            ij6.m13958p("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m5742g(Class cls, AbstractC1034s abstractC1034s) {
        zzd.put(cls, abstractC1034s);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [doc, fpc] */
    /* JADX INFO: renamed from: i */
    public static fpc m5743i() {
        return doc.f35978d;
    }

    @Override // p000.gfc
    /* JADX INFO: renamed from: b */
    public final void mo5744b(int i) {
        this.zzc = i;
    }

    @Override // p000.gfc
    /* JADX INFO: renamed from: c */
    public final int mo5745c() {
        return this.zzc;
    }

    /* JADX INFO: renamed from: e */
    public abstract Object mo5699e(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ovc ovcVar = ovc.f55046c;
        ovcVar.getClass();
        return ovcVar.m18526a(getClass()).mo5766h(this, (AbstractC1034s) obj);
    }

    /* JADX INFO: renamed from: h */
    public final int m5746h() {
        if (this.zzc == -1) {
            ovc ovcVar = ovc.f55046c;
            ovcVar.getClass();
            this.zzc = ovcVar.m18526a(getClass()).mo5763e(this);
        }
        return this.zzc;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        ovc ovcVar = ovc.f55046c;
        ovcVar.getClass();
        int iMo5761c = ovcVar.m18526a(getClass()).mo5761c(this);
        this.zza = iMo5761c;
        return iMo5761c;
    }

    public final String toString() {
        String string = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        AbstractC1037v.m5783b(this, sb, 0);
        return sb.toString();
    }
}
