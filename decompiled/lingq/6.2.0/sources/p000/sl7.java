package p000;

/* JADX INFO: loaded from: classes.dex */
public final class sl7 extends AbstractC3572sf {

    /* JADX INFO: renamed from: b */
    public Object f60980b;

    /* JADX INFO: renamed from: E */
    public synchronized String m21447E() {
        return (String) this.f60980b;
    }

    /* JADX INFO: renamed from: F */
    public synchronized void m21448F() {
        ((cj9) this.f60774a).m4773a("engagement.push_watchlist_initialized", Boolean.FALSE).getClass();
        ((cj9) this.f60774a).m4775c("engagement.push_watchlist", true);
        this.f60980b = ((cj9) this.f60774a).m4777e("engagement.push_token", null);
        ((cj9) this.f60774a).m4773a("engagement.push_enabled", Boolean.TRUE).getClass();
        ((cj9) this.f60774a).m4776d("engagement.push_token_sent_time_millis", 0L).getClass();
        cj9 cj9Var = (cj9) this.f60774a;
        synchronized (cj9Var) {
            String strM3217L = b34.m3217L(cj9Var.f10176a.getAll().get("engagement.push_message_id_history"));
            b34.m3213H(strM3217L != null ? strM3217L : null, true);
        }
    }

    /* JADX INFO: renamed from: G */
    public synchronized void m21449G(dg4 dg4Var) {
        ((cj9) this.f60774a).m4781i("engagement.push_watchlist", dg4Var);
    }

    /* JADX INFO: renamed from: H */
    public synchronized void m21450H() {
        ((cj9) this.f60774a).m4779g("engagement.push_watchlist_initialized", false);
    }
}
