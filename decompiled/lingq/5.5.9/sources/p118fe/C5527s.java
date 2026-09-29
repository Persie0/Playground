package p118fe;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: fe.s */
/* JADX INFO: loaded from: classes.dex */
public final class C5527s<T> {

    /* JADX INFO: renamed from: a */
    public final Class<? extends Annotation> f34198a;

    /* JADX INFO: renamed from: b */
    public final Class<T> f34199b;

    /* JADX INFO: renamed from: fe.s$a */
    public @interface a {
    }

    public C5527s(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f34198a = cls;
        this.f34199b = cls2;
    }

    /* JADX INFO: renamed from: a */
    public static <T> C5527s<T> m11765a(Class<T> cls) {
        return new C5527s<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5527s.class == obj.getClass()) {
            C5527s c5527s = (C5527s) obj;
            if (this.f34199b.equals(c5527s.f34199b)) {
                return this.f34198a.equals(c5527s.f34198a);
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f34198a.hashCode() + (this.f34199b.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.f34199b;
        Class<? extends Annotation> cls2 = this.f34198a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
