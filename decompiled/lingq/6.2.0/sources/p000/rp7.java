package p000;

/* JADX INFO: loaded from: classes.dex */
public final class rp7 {

    /* JADX INFO: renamed from: a */
    public final Class f59683a;

    /* JADX INFO: renamed from: b */
    public final Class f59684b;

    public rp7(Class cls, Class cls2) {
        this.f59683a = cls;
        this.f59684b = cls2;
    }

    /* JADX INFO: renamed from: a */
    public static rp7 m20740a(Class cls) {
        return new rp7(qp7.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rp7.class != obj.getClass()) {
            return false;
        }
        rp7 rp7Var = (rp7) obj;
        if (this.f59684b.equals(rp7Var.f59684b)) {
            return this.f59683a.equals(rp7Var.f59683a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f59683a.hashCode() + (this.f59684b.hashCode() * 31);
    }

    public final String toString() {
        Class cls = this.f59684b;
        Class cls2 = this.f59683a;
        if (cls2 == qp7.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
