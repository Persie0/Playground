package p515yl;

import am.C0126a;
import dm.C5207g;
import p540zl.C10515a;

/* JADX INFO: renamed from: yl.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C10415b {

    /* JADX INFO: renamed from: a */
    public static final C10414a f52219a;

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    static {
        C10414a c10414a;
        try {
            Object objNewInstance = C0126a.class.newInstance();
            C5207g.m11110e(objNewInstance, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    c10414a = (C10414a) objNewInstance;
                } catch (ClassNotFoundException unused) {
                    Object objNewInstance2 = C10515a.class.newInstance();
                    C5207g.m11110e(objNewInstance2, "forName(\"kotlin.internal…entations\").newInstance()");
                    try {
                        try {
                            c10414a = (C10414a) objNewInstance2;
                        } catch (ClassNotFoundException unused2) {
                            c10414a = new C10414a();
                        }
                    } catch (ClassCastException e10) {
                        ClassLoader classLoader = objNewInstance2.getClass().getClassLoader();
                        ClassLoader classLoader2 = C10414a.class.getClassLoader();
                        if (C5207g.m11106a(classLoader, classLoader2)) {
                            throw e10;
                        }
                        throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e10);
                    }
                }
            } catch (ClassCastException e11) {
                ClassLoader classLoader3 = objNewInstance.getClass().getClassLoader();
                ClassLoader classLoader4 = C10414a.class.getClassLoader();
                if (C5207g.m11106a(classLoader3, classLoader4)) {
                    throw e11;
                }
                throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader3 + ", base type classloader: " + classLoader4, e11);
            }
        } catch (ClassNotFoundException unused3) {
            Object objNewInstance3 = Class.forName("kotlin.internal.JRE8PlatformImplementations").newInstance();
            C5207g.m11110e(objNewInstance3, "forName(\"kotlin.internal…entations\").newInstance()");
            try {
                try {
                    c10414a = (C10414a) objNewInstance3;
                } catch (ClassCastException e12) {
                    ClassLoader classLoader5 = objNewInstance3.getClass().getClassLoader();
                    ClassLoader classLoader6 = C10414a.class.getClassLoader();
                    if (C5207g.m11106a(classLoader5, classLoader6)) {
                        throw e12;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader5 + ", base type classloader: " + classLoader6, e12);
                }
            } catch (ClassNotFoundException unused4) {
                Object objNewInstance4 = Class.forName("kotlin.internal.JRE7PlatformImplementations").newInstance();
                C5207g.m11110e(objNewInstance4, "forName(\"kotlin.internal…entations\").newInstance()");
                try {
                    c10414a = (C10414a) objNewInstance4;
                } catch (ClassCastException e13) {
                    ClassLoader classLoader7 = objNewInstance4.getClass().getClassLoader();
                    ClassLoader classLoader8 = C10414a.class.getClassLoader();
                    if (C5207g.m11106a(classLoader7, classLoader8)) {
                        throw e13;
                    }
                    throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader7 + ", base type classloader: " + classLoader8, e13);
                }
            }
        }
        f52219a = c10414a;
    }
}
