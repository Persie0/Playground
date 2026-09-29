package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mx9 {

    /* JADX INFO: renamed from: a */
    public final long f52001a;

    /* JADX INFO: renamed from: b */
    public final long f52002b;

    public mx9(long j, long j2) {
        this.f52001a = j;
        this.f52002b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx9)) {
            return false;
        }
        mx9 mx9Var = (mx9) obj;
        return aa1.m199c(this.f52001a, mx9Var.f52001a) && aa1.m199c(this.f52002b, mx9Var.f52002b);
    }

    public final int hashCode() {
        int i = aa1.f413l;
        return Long.hashCode(this.f52002b) + (Long.hashCode(this.f52001a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SelectionColors(selectionHandleColor=");
        ux5.m23002y(this.f52001a, ", selectionBackgroundColor=", sb);
        sb.append((Object) aa1.m205i(this.f52002b));
        sb.append(')');
        return sb.toString();
    }
}
