package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class rp9 {

    /* JADX INFO: renamed from: a */
    public final String f59687a;

    /* JADX INFO: renamed from: b */
    public final int f59688b;

    /* JADX INFO: renamed from: c */
    public final int f59689c;

    public rp9(String str, int i, int i2) {
        str.getClass();
        this.f59687a = str;
        this.f59688b = i;
        this.f59689c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m20741a() {
        return this.f59688b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp9)) {
            return false;
        }
        rp9 rp9Var = (rp9) obj;
        return fa4.m11650l(this.f59687a, rp9Var.f59687a) && this.f59688b == rp9Var.f59688b && this.f59689c == rp9Var.f59689c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59689c) + wq1.m24106b(this.f59688b, this.f59687a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SystemIdInfo(workSpecId=");
        sb.append(this.f59687a);
        sb.append(", generation=");
        sb.append(this.f59688b);
        sb.append(", systemId=");
        return wq1.m24122r(sb, this.f59689c, ')');
    }
}
