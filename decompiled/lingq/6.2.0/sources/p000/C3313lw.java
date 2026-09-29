package p000;

/* JADX INFO: renamed from: lw */
/* JADX INFO: loaded from: classes.dex */
public final class C3313lw extends AbstractC3387nw {

    /* JADX INFO: renamed from: a */
    public final y27 f50199a;

    public C3313lw(y27 y27Var) {
        this.f50199a = y27Var;
    }

    @Override // p000.AbstractC3387nw
    /* JADX INFO: renamed from: a */
    public final y27 mo14691a() {
        return this.f50199a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3313lw) && fa4.m11650l(this.f50199a, ((C3313lw) obj).f50199a);
    }

    public final int hashCode() {
        y27 y27Var = this.f50199a;
        if (y27Var == null) {
            return 0;
        }
        return y27Var.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.f50199a + ')';
    }
}
