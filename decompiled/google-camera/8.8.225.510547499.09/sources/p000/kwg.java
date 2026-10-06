package p000;

import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwg {

    /* JADX INFO: renamed from: a */
    private static ClassLoader f37506a;

    /* JADX INFO: renamed from: b */
    private static volatile int f37507b = 1;

    /* JADX INFO: renamed from: a */
    static boolean m14937a() {
        if (f37507b == 1) {
            m14942f();
        }
        return f37507b == 3;
    }

    /* JADX INFO: renamed from: b */
    static boolean m14938b() {
        if (f37507b == 1) {
            m14942f();
        }
        return f37507b == 2;
    }

    /* JADX INFO: renamed from: c */
    static boolean m14939c() {
        if (f37507b == 1) {
            m14942f();
        }
        return f37507b == 5;
    }

    /* JADX INFO: renamed from: d */
    static void m14940d() {
        if (f37507b == 1) {
            m14942f();
        }
    }

    /* JADX INFO: renamed from: e */
    static void m14941e() {
        "robolectric".equals(Build.FINGERPRINT);
    }

    /* JADX INFO: renamed from: f */
    private static synchronized void m14942f() {
        if (f37507b != 1) {
            return;
        }
        ClassLoader classLoader = f37506a;
        if (classLoader == null) {
            classLoader = kwf.class.getClassLoader();
            f37506a = classLoader;
            if (classLoader == null) {
                throw new RuntimeException("Classloader is null! This should never happen.");
            }
        }
        try {
            classLoader.loadClass("com.google.android.libraries.lens.lenslite.configs.ReleaseLite");
            f37507b = 4;
        } catch (Exception e) {
            try {
                f37506a.loadClass("com.google.android.libraries.lens.lenslite.configs.LinkZero");
                f37507b = 5;
            } catch (Exception e2) {
                try {
                    f37506a.loadClass("com.google.android.libraries.lens.lenslite.configs.Kent");
                    f37507b = 6;
                } catch (Exception e3) {
                    try {
                        f37506a.loadClass("com.google.android.libraries.lens.lenslite.configs.Experimental");
                        f37507b = 2;
                    } catch (Exception e4) {
                        try {
                            f37506a.loadClass("com.google.android.libraries.lens.lenslite.configs.Dev");
                            f37507b = 3;
                        } catch (Exception e5) {
                            e5.printStackTrace();
                            throw new RuntimeException("Failed to determine build type.", e5);
                        }
                    }
                }
            }
        }
    }
}
