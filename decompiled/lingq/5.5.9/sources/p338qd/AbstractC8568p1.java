package p338qd;

/* JADX INFO: renamed from: qd.p1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8568p1 {
    /* JADX INFO: renamed from: a */
    public abstract int mo16641a();

    /* JADX INFO: renamed from: b */
    public abstract long mo16642b();

    /* JADX INFO: renamed from: c */
    public abstract String mo16643c();

    /* JADX INFO: renamed from: d */
    public abstract boolean mo16644d();

    /* JADX INFO: renamed from: e */
    public abstract boolean mo16645e();

    /* JADX INFO: renamed from: f */
    public abstract byte[] mo16646f();

    /* JADX INFO: renamed from: g */
    public final boolean m16659g() {
        if (mo16643c() == null) {
            return false;
        }
        return mo16643c().endsWith("/");
    }
}
