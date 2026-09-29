package p000;

/* JADX INFO: loaded from: classes.dex */
public final class mm7 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public l67 f51526b;

    /* JADX INFO: renamed from: c */
    public long f51527c;

    /* JADX INFO: renamed from: d */
    public long f51528d;

    /* JADX INFO: renamed from: e */
    public boolean f51529e;

    /* JADX INFO: renamed from: f */
    public long f51530f;

    /* JADX INFO: renamed from: g */
    public int f51531g;

    /* JADX INFO: renamed from: E */
    public final synchronized void m16919E() {
        try {
            eg4 eg4VarM4775c = ((cj9) this.f60774a).m4775c("session.pause_payload", false);
            this.f51526b = eg4VarM4775c != null ? l67.m15901d(eg4VarM4775c) : null;
            this.f51527c = ((cj9) this.f60774a).m4776d("window_count", 0L).longValue();
            this.f51528d = ((cj9) this.f60774a).m4776d("session.window_start_time_millis", 0L).longValue();
            this.f51529e = ((cj9) this.f60774a).m4773a("session.window_pause_sent", Boolean.FALSE).booleanValue();
            this.f51530f = ((cj9) this.f60774a).m4776d("session.window_uptime_millis", 0L).longValue();
            this.f51531g = ((cj9) this.f60774a).m4774b("session.window_state_active_count").intValue();
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: F */
    public final synchronized void m16920F(l67 l67Var) {
        try {
            this.f51526b = l67Var;
            cj9 cj9Var = (cj9) this.f60774a;
            if (l67Var != null) {
                cj9Var.m4781i("session.pause_payload", l67Var.m15905h());
            } else {
                cj9Var.m4778f("session.pause_payload");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: G */
    public final synchronized void m16921G(int i) {
        this.f51531g = i;
        ((cj9) this.f60774a).m4780h(i, "session.window_state_active_count");
    }

    /* JADX INFO: renamed from: H */
    public final synchronized void m16922H(long j) {
        this.f51530f = j;
        ((cj9) this.f60774a).m4782j("session.window_uptime_millis", j);
    }
}
