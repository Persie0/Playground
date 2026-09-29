package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class uj2 extends vj2 {

    /* JADX INFO: renamed from: a */
    public final Object f63987a;

    /* JADX INFO: renamed from: b */
    public final int f63988b;

    public uj2(Object obj, int i) {
        obj.getClass();
        this.f63987a = obj;
        this.f63988b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj2)) {
            return false;
        }
        uj2 uj2Var = (uj2) obj;
        return fa4.m11650l(this.f63987a, uj2Var.f63987a) && this.f63988b == uj2Var.f63988b;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + wq1.m24106b(this.f63988b, this.f63987a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "InProgress(item=" + this.f63987a + ", progress=" + this.f63988b + ", autoPause=true)";
    }
}
