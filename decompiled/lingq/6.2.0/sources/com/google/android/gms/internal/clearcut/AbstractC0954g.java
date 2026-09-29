package com.google.android.gms.internal.clearcut;

import java.util.Arrays;
import p000.a4c;
import p000.u3c;

/* JADX INFO: renamed from: com.google.android.gms.internal.clearcut.g */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0954g {

    /* JADX INFO: renamed from: a */
    public static final Class f11797a;

    /* JADX INFO: renamed from: b */
    public static final a4c f11798b;

    /* JADX INFO: renamed from: c */
    public static final a4c f11799c;

    /* JADX INFO: renamed from: d */
    public static final a4c f11800d;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        f11797a = cls;
        f11798b = m5328b(false);
        f11799c = m5328b(true);
        f11800d = new a4c();
    }

    /* JADX INFO: renamed from: a */
    public static void m5327a(a4c a4cVar, Object obj, Object obj2) {
        a4cVar.getClass();
        AbstractC0949b abstractC0949b = (AbstractC0949b) obj;
        u3c u3cVar = abstractC0949b.zzjp;
        u3c u3cVar2 = ((AbstractC0949b) obj2).zzjp;
        if (!u3cVar2.equals(u3c.f63367e)) {
            int i = u3cVar.f63368a + u3cVar2.f63368a;
            int[] iArrCopyOf = Arrays.copyOf(u3cVar.f63369b, i);
            System.arraycopy(u3cVar2.f63369b, 0, iArrCopyOf, u3cVar.f63368a, u3cVar2.f63368a);
            Object[] objArrCopyOf = Arrays.copyOf(u3cVar.f63370c, i);
            System.arraycopy(u3cVar2.f63370c, 0, objArrCopyOf, u3cVar.f63368a, u3cVar2.f63368a);
            u3cVar = new u3c(i, iArrCopyOf, objArrCopyOf, true);
        }
        abstractC0949b.zzjp = u3cVar;
    }

    /* JADX INFO: renamed from: b */
    public static a4c m5328b(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            cls = null;
        }
        if (cls != null) {
            try {
                return (a4c) cls.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m5329c(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
