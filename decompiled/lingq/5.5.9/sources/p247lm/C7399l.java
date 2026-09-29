package p247lm;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: lm.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C7399l {

    /* JADX INFO: renamed from: a */
    public final WeakReference<ClassLoader> f41213a;

    /* JADX INFO: renamed from: b */
    public final int f41214b;

    public C7399l(ClassLoader classLoader) {
        this.f41213a = new WeakReference<>(classLoader);
        this.f41214b = System.identityHashCode(classLoader);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C7399l) && this.f41213a.get() == ((C7399l) obj).f41213a.get();
    }

    public final int hashCode() {
        return this.f41214b;
    }

    public final String toString() {
        String string;
        ClassLoader classLoader = this.f41213a.get();
        if (classLoader == null || (string = classLoader.toString()) == null) {
            string = "<null>";
        }
        return string;
    }
}
