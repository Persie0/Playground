package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class hw0 implements iw0 {

    /* JADX INFO: renamed from: a */
    public final int f43028a;

    /* JADX INFO: renamed from: b */
    public final String f43029b;

    public hw0(int i, String str) {
        this.f43028a = i;
        this.f43029b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw0)) {
            return false;
        }
        hw0 hw0Var = (hw0) obj;
        return this.f43028a == hw0Var.f43028a && this.f43029b.equals(hw0Var.f43029b);
    }

    public final int hashCode() {
        return this.f43029b.hashCode() + (Integer.hashCode(this.f43028a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f43028a, "ChatItem(id=", ", title=", this.f43029b, ")");
    }
}
