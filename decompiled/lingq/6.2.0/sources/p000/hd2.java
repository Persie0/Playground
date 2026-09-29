package p000;

/* JADX INFO: loaded from: classes.dex */
public final class hd2 extends kd2 {

    /* JADX INFO: renamed from: a */
    public final String f42207a;

    /* JADX INFO: renamed from: b */
    public final String f42208b;

    public hd2(String str, String str2) {
        str2.getClass();
        this.f42207a = str;
        this.f42208b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd2)) {
            return false;
        }
        hd2 hd2Var = (hd2) obj;
        return this.f42207a.equals(hd2Var.f42207a) && fa4.m11650l(this.f42208b, hd2Var.f42208b);
    }

    public final int hashCode() {
        return this.f42208b.hashCode() + (this.f42207a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetTag(key=");
        sb.append(this.f42207a);
        sb.append(", value=");
        return ux5.m22992o(sb, this.f42208b, ')');
    }
}
