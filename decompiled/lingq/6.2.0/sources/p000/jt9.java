package p000;

/* JADX INFO: loaded from: classes.dex */
public final class jt9 extends bt9 {

    /* JADX INFO: renamed from: b */
    public final String f46133b;

    /* JADX INFO: renamed from: c */
    public final int f46134c;

    /* JADX INFO: renamed from: d */
    public final vi3 f46135d;

    public jt9(int i, vi3 vi3Var, Object obj, String str) {
        super(obj);
        this.f46133b = str;
        this.f46134c = i;
        this.f46135d = vi3Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextContextMenuItem(key=");
        sb.append(this.f8993a);
        sb.append(", label=\"");
        sb.append(this.f46133b);
        sb.append("\", leadingIcon=");
        return wq1.m24122r(sb, this.f46134c, ')');
    }
}
