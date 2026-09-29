package p000;

/* JADX INFO: loaded from: classes.dex */
public final class al7 {

    /* JADX INFO: renamed from: a */
    public final String f807a;

    /* JADX INFO: renamed from: b */
    public final int f808b;

    /* JADX INFO: renamed from: c */
    public final int f809c;

    /* JADX INFO: renamed from: d */
    public final boolean f810d;

    public al7(int i, int i2, String str, boolean z) {
        this.f807a = str;
        this.f808b = i;
        this.f809c = i2;
        this.f810d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al7)) {
            return false;
        }
        al7 al7Var = (al7) obj;
        return this.f807a.equals(al7Var.f807a) && this.f808b == al7Var.f808b && this.f809c == al7Var.f809c && this.f810d == al7Var.f810d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f810d) + wq1.m24106b(this.f809c, wq1.m24106b(this.f808b, this.f807a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails(processName=");
        sb.append(this.f807a);
        sb.append(", pid=");
        sb.append(this.f808b);
        sb.append(", importance=");
        sb.append(this.f809c);
        sb.append(", isDefaultProcess=");
        return ux5.m22993p(sb, this.f810d, ')');
    }
}
