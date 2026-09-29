package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ir1 extends jr1 {

    /* JADX INFO: renamed from: a */
    public final int f44451a;

    /* JADX INFO: renamed from: b */
    public final String f44452b;

    public ir1(int i, String str) {
        this.f44451a = i;
        this.f44452b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir1)) {
            return false;
        }
        ir1 ir1Var = (ir1) obj;
        return this.f44451a == ir1Var.f44451a && this.f44452b.equals(ir1Var.f44452b);
    }

    public final int hashCode() {
        return this.f44452b.hashCode() + (Integer.hashCode(this.f44451a) * 31);
    }

    public final String toString() {
        return hn1.m13354d(this.f44451a, "Streaming(chatId=", ", text=", this.f44452b, ")");
    }
}
