package p000;

/* JADX INFO: loaded from: classes.dex */
public final class w30 extends kq1 {

    /* JADX INFO: renamed from: a */
    public final String f66313a;

    /* JADX INFO: renamed from: b */
    public final int f66314b;

    /* JADX INFO: renamed from: c */
    public final int f66315c;

    /* JADX INFO: renamed from: d */
    public final boolean f66316d;

    public w30(int i, int i2, String str, boolean z) {
        this.f66313a = str;
        this.f66314b = i;
        this.f66315c = i2;
        this.f66316d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kq1) {
            w30 w30Var = (w30) ((kq1) obj);
            if (this.f66313a.equals(w30Var.f66313a) && this.f66314b == w30Var.f66314b && this.f66315c == w30Var.f66315c && this.f66316d == w30Var.f66316d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f66316d ? 1231 : 1237) ^ ((((((this.f66313a.hashCode() ^ 1000003) * 1000003) ^ this.f66314b) * 1000003) ^ this.f66315c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.f66313a);
        sb.append(", pid=");
        sb.append(this.f66314b);
        sb.append(", importance=");
        sb.append(this.f66315c);
        sb.append(", defaultProcess=");
        return AbstractC3393o1.m17740o(sb, this.f66316d, "}");
    }
}
