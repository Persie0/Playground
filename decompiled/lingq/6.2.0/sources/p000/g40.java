package p000;

/* JADX INFO: loaded from: classes.dex */
public final class g40 extends sq1 {

    /* JADX INFO: renamed from: a */
    public final int f40157a;

    /* JADX INFO: renamed from: b */
    public final String f40158b;

    /* JADX INFO: renamed from: c */
    public final String f40159c;

    /* JADX INFO: renamed from: d */
    public final boolean f40160d;

    public g40(String str, int i, String str2, boolean z) {
        this.f40157a = i;
        this.f40158b = str;
        this.f40159c = str2;
        this.f40160d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sq1) {
            g40 g40Var = (g40) ((sq1) obj);
            if (this.f40157a == g40Var.f40157a && this.f40158b.equals(g40Var.f40158b) && this.f40159c.equals(g40Var.f40159c) && this.f40160d == g40Var.f40160d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f40160d ? 1231 : 1237) ^ ((((((this.f40157a ^ 1000003) * 1000003) ^ this.f40158b.hashCode()) * 1000003) ^ this.f40159c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OperatingSystem{platform=");
        sb.append(this.f40157a);
        sb.append(", version=");
        sb.append(this.f40158b);
        sb.append(", buildVersion=");
        sb.append(this.f40159c);
        sb.append(", jailbroken=");
        return AbstractC3393o1.m17740o(sb, this.f40160d, "}");
    }
}
