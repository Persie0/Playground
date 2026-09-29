package p000;

/* JADX INFO: loaded from: classes.dex */
public final class zl7 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public final long f71704b;

    /* JADX INFO: renamed from: c */
    public boolean f71705c;

    /* JADX INFO: renamed from: d */
    public long f71706d;

    /* JADX INFO: renamed from: e */
    public p44 f71707e;

    /* JADX INFO: renamed from: f */
    public int f71708f;

    /* JADX INFO: renamed from: g */
    public int f71709g;

    /* JADX INFO: renamed from: h */
    public boolean f71710h;

    public zl7(cj9 cj9Var, long j) {
        super(cj9Var);
        this.f71705c = false;
        this.f71706d = 0L;
        this.f71707e = new p44();
        this.f71708f = 0;
        this.f71709g = 0;
        this.f71710h = false;
        this.f71704b = j;
    }

    /* JADX INFO: renamed from: E */
    public final synchronized long m25691E() {
        return this.f71706d;
    }

    /* JADX INFO: renamed from: F */
    public final synchronized p44 m25692F() {
        return this.f71707e;
    }

    /* JADX INFO: renamed from: G */
    public final synchronized boolean m25693G() {
        return this.f71705c;
    }

    /* JADX INFO: renamed from: H */
    public final synchronized boolean m25694H() {
        return this.f71706d >= this.f71704b;
    }

    /* JADX INFO: renamed from: I */
    public final synchronized void m25695I() {
        cj9 cj9Var = (cj9) this.f60774a;
        Boolean bool = Boolean.FALSE;
        this.f71705c = cj9Var.m4773a("init.ready", bool).booleanValue();
        ((cj9) this.f60774a).m4776d("init.sent_time_millis", 0L).getClass();
        this.f71706d = ((cj9) this.f60774a).m4776d("init.received_time_millis", 0L).longValue();
        this.f71707e = p44.m18883a(((cj9) this.f60774a).m4775c("init.response", true));
        this.f71708f = ((cj9) this.f60774a).m4774b("init.rotation_url_date").intValue();
        this.f71709g = ((cj9) this.f60774a).m4774b("init.rotation_url_index").intValue();
        this.f71710h = ((cj9) this.f60774a).m4773a("init.rotation_url_rotated", bool).booleanValue();
    }
}
