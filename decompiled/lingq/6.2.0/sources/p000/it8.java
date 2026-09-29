package p000;

/* JADX INFO: loaded from: classes3.dex */
public final class it8 {

    /* JADX INFO: renamed from: a */
    public final gt8 f44535a;

    /* JADX INFO: renamed from: b */
    public final jp8 f44536b;

    public it8(gt8 gt8Var, jp8 jp8Var) {
        gt8Var.getClass();
        jp8Var.getClass();
        this.f44535a = gt8Var;
        this.f44536b = jp8Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof it8)) {
            return false;
        }
        it8 it8Var = (it8) obj;
        return fa4.m11650l(this.f44535a, it8Var.f44535a) && fa4.m11650l(this.f44536b, it8Var.f44536b);
    }

    public final int hashCode() {
        return this.f44536b.hashCode() + (this.f44535a.hashCode() * 31);
    }

    public final String toString() {
        return "DialogScreenData(filterState=" + this.f44535a + ", collectionsState=" + this.f44536b + ")";
    }
}
