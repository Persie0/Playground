package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public abstract class nbq implements nbr {

    /* JADX INFO: renamed from: a */
    public static final nbq f41957a = new nbo();

    /* JADX INFO: renamed from: a */
    public abstract int mo17302a();

    /* JADX INFO: renamed from: b */
    public abstract String mo17303b();

    /* JADX INFO: renamed from: c */
    public abstract String mo17304c();

    /* JADX INFO: renamed from: d */
    public abstract String mo17305d();

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LogSite{ class=");
        sb.append(mo17303b());
        sb.append(", method=");
        sb.append(mo17305d());
        sb.append(", line=");
        sb.append(mo17302a());
        if (mo17304c() != null) {
            sb.append(", file=");
            sb.append(mo17304c());
        }
        sb.append(" }");
        return sb.toString();
    }
}
