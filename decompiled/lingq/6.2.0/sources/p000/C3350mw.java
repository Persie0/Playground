package p000;

/* JADX INFO: renamed from: mw */
/* JADX INFO: loaded from: classes.dex */
public final class C3350mw extends AbstractC3387nw {

    /* JADX INFO: renamed from: a */
    public final y27 f51904a;

    /* JADX INFO: renamed from: b */
    public final hn9 f51905b;

    public C3350mw(y27 y27Var, hn9 hn9Var) {
        this.f51904a = y27Var;
        this.f51905b = hn9Var;
    }

    @Override // p000.AbstractC3387nw
    /* JADX INFO: renamed from: a */
    public final y27 mo14691a() {
        return this.f51904a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3350mw)) {
            return false;
        }
        C3350mw c3350mw = (C3350mw) obj;
        return this.f51904a.equals(c3350mw.f51904a) && this.f51905b.equals(c3350mw.f51905b);
    }

    public final int hashCode() {
        return this.f51905b.hashCode() + (this.f51904a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.f51904a + ", result=" + this.f51905b + ')';
    }
}
