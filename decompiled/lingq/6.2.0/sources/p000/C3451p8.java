package p000;

/* JADX INFO: renamed from: p8 */
/* JADX INFO: loaded from: classes2.dex */
public final class C3451p8 {

    /* JADX INFO: renamed from: a */
    public int f55717a;

    /* JADX INFO: renamed from: b */
    public int f55718b;

    /* JADX INFO: renamed from: c */
    public int f55719c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof C3451p8)) {
                return false;
            }
            C3451p8 c3451p8 = (C3451p8) obj;
            int i = this.f55717a;
            if (i != c3451p8.f55717a) {
                return false;
            }
            if (i != 8 || Math.abs(this.f55719c - this.f55718b) != 1 || this.f55719c != c3451p8.f55718b || this.f55718b != c3451p8.f55719c) {
                return this.f55719c == c3451p8.f55719c && this.f55718b == c3451p8.f55718b;
            }
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f55717a * 31) + this.f55718b) * 31) + this.f55719c;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f55717a;
        if (i == 1) {
            str = "add";
        } else if (i == 2) {
            str = "rm";
        } else if (i != 4) {
            str = i != 8 ? "??" : "mv";
        } else {
            str = "up";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f55718b);
        sb.append("c:");
        return wq1.m24123s(sb, this.f55719c, ",p:null]");
    }
}
