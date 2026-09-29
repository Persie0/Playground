package p336qb;

import dalvik.system.PathClassLoader;

/* JADX INFO: renamed from: qb.e */
/* JADX INFO: loaded from: classes.dex */
public final class C8513e extends PathClassLoader {
    public C8513e(ClassLoader classLoader, String str) {
        super(str, classLoader);
    }

    @Override // java.lang.ClassLoader
    public final Class loadClass(String str, boolean z10) throws ClassNotFoundException {
        if (!str.startsWith("java.") && !str.startsWith("android.")) {
            try {
                return findClass(str);
            } catch (ClassNotFoundException unused) {
            }
        }
        return super.loadClass(str, z10);
    }
}
