package p000;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class t13 {

    /* JADX INFO: renamed from: a */
    public final List f61743a;

    /* JADX INFO: renamed from: b */
    public final List f61744b;

    public t13(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.f61743a = list;
        this.f61744b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t13)) {
            return false;
        }
        t13 t13Var = (t13) obj;
        return fa4.m11650l(this.f61743a, t13Var.f61743a) && fa4.m11650l(this.f61744b, t13Var.f61744b);
    }

    public final int hashCode() {
        return this.f61744b.hashCode() + (this.f61743a.hashCode() * 31);
    }

    public final String toString() {
        return "Result(library=" + this.f61743a + ", imports=" + this.f61744b + ")";
    }
}
