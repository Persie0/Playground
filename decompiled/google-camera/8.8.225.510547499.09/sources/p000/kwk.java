package p000;

import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kwk extends ClassLoader {

    /* JADX INFO: renamed from: a */
    private final ClassLoader f37512a;

    /* JADX INFO: renamed from: b */
    private final Set f37513b;

    public kwk(ClassLoader classLoader, Set set) {
        super(classLoader.getParent());
        this.f37512a = classLoader;
        this.f37513b = set;
    }

    @Override // java.lang.ClassLoader
    protected final Class findClass(String str) {
        return this.f37513b.contains(str) ? this.f37512a.loadClass(str) : super.findClass(str);
    }
}
