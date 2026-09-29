package p000;

/* JADX INFO: loaded from: classes.dex */
public abstract class bnd implements cnd {

    /* JADX INFO: renamed from: a */
    public static final zmd f8756a = new zmd();

    /* JADX INFO: renamed from: a */
    public abstract String mo623a();

    /* JADX INFO: renamed from: b */
    public abstract String mo624b();

    /* JADX INFO: renamed from: c */
    public abstract int mo625c();

    /* JADX INFO: renamed from: d */
    public abstract String mo626d();

    /* JADX INFO: renamed from: e */
    public String mo627e() {
        return null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LogSite{ class=");
        sb.append(mo623a());
        sb.append(", method=");
        sb.append(mo624b());
        sb.append(", line=");
        sb.append(mo625c());
        if (mo626d() != null) {
            sb.append(", file=");
            sb.append(mo626d());
        }
        if (mo627e() != null) {
            sb.append(", filePath=");
            sb.append(mo627e());
        }
        sb.append(" }");
        return sb.toString();
    }
}
