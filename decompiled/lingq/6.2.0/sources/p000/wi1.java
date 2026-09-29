package p000;

import com.amplitude.common.Logger$LogMode;

/* JADX INFO: loaded from: classes2.dex */
public final class wi1 implements pj5 {

    /* JADX INFO: renamed from: b */
    public static final wi1 f66846b;

    /* JADX INFO: renamed from: a */
    public Logger$LogMode f66847a;

    static {
        wi1 wi1Var = new wi1();
        wi1Var.f66847a = Logger$LogMode.INFO;
        f66846b = wi1Var;
    }

    @Override // p000.pj5
    /* JADX INFO: renamed from: a */
    public final void mo16255a(String str) {
        m23977d(Logger$LogMode.ERROR, str);
    }

    @Override // p000.pj5
    /* JADX INFO: renamed from: b */
    public final void mo16256b(String str) {
        m23977d(Logger$LogMode.DEBUG, str);
    }

    @Override // p000.pj5
    /* JADX INFO: renamed from: c */
    public final void mo16257c(String str) {
        m23977d(Logger$LogMode.WARN, str);
    }

    /* JADX INFO: renamed from: d */
    public final void m23977d(Logger$LogMode logger$LogMode, String str) {
        if (this.f66847a.compareTo(logger$LogMode) <= 0) {
            System.out.println((Object) str);
        }
    }
}
