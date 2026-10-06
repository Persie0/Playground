package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ohx implements ohw {

    /* JADX INFO: renamed from: a */
    public static final lpv f46043a;

    /* JADX INFO: renamed from: b */
    public static final lpv f46044b;

    /* JADX INFO: renamed from: c */
    public static final lpv f46045c;

    /* JADX INFO: renamed from: d */
    public static final lpv f46046d;

    /* JADX INFO: renamed from: e */
    public static final lpv f46047e;

    static {
        lpt lptVarM15833b = new lpt(lph.m15821a("com.google.android.apps.camera")).m15834c().m15832a().m15833b();
        f46043a = lptVarM15833b.m15838g("Primes__enable_battery_logging", false);
        f46044b = lptVarM15833b.m15838g("Primes__enable_crash_logging", false);
        f46045c = lptVarM15833b.m15838g("Primes__enable_memory_logging", false);
        f46046d = lptVarM15833b.m15838g("Primes__enable_package_metrics_logging", false);
        f46047e = lptVarM15833b.m15838g("Primes__enable_timer_logging", false);
    }

    @Override // p000.ohw
    /* JADX INFO: renamed from: a */
    public final boolean mo18507a() {
        return ((Boolean) f46043a.m15845e()).booleanValue();
    }

    @Override // p000.ohw
    /* JADX INFO: renamed from: b */
    public final boolean mo18508b() {
        return ((Boolean) f46044b.m15845e()).booleanValue();
    }

    @Override // p000.ohw
    /* JADX INFO: renamed from: c */
    public final boolean mo18509c() {
        return ((Boolean) f46045c.m15845e()).booleanValue();
    }

    @Override // p000.ohw
    /* JADX INFO: renamed from: d */
    public final boolean mo18510d() {
        return ((Boolean) f46046d.m15845e()).booleanValue();
    }

    @Override // p000.ohw
    /* JADX INFO: renamed from: e */
    public final boolean mo18511e() {
        return ((Boolean) f46047e.m15845e()).booleanValue();
    }
}
