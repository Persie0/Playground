package p000;

/* JADX INFO: loaded from: classes.dex */
public final class am7 extends AbstractC3572sf {

    /* JADX INFO: renamed from: H */
    public eg4 f831H;

    /* JADX INFO: renamed from: I */
    public e74 f832I;

    /* JADX INFO: renamed from: J */
    public uo3 f833J;

    /* JADX INFO: renamed from: K */
    public hx3 f834K;

    /* JADX INFO: renamed from: L */
    public bl8 f835L;

    /* JADX INFO: renamed from: M */
    public by5 f836M;

    /* JADX INFO: renamed from: b */
    public l67 f837b;

    /* JADX INFO: renamed from: c */
    public e32 f838c;

    /* JADX INFO: renamed from: d */
    public long f839d;

    /* JADX INFO: renamed from: e */
    public long f840e;

    /* JADX INFO: renamed from: f */
    public boolean f841f;

    /* JADX INFO: renamed from: g */
    public boolean f842g;

    /* JADX INFO: renamed from: h */
    public eg4 f843h;

    /* JADX INFO: renamed from: i */
    public boolean f844i;

    /* JADX INFO: renamed from: j */
    public long f845j;

    /* JADX INFO: renamed from: k */
    public eg4 f846k;

    /* JADX INFO: renamed from: l */
    public eg4 f847l;

    /* JADX INFO: renamed from: E */
    public final synchronized dg4 m558E() {
        return ((dg4) this.f847l).m10336f();
    }

    /* JADX INFO: renamed from: F */
    public final synchronized dg4 m559F() {
        return ((dg4) this.f831H).m10336f();
    }

    /* JADX INFO: renamed from: G */
    public final synchronized dg4 m560G() {
        return ((dg4) this.f846k).m10336f();
    }

    /* JADX INFO: renamed from: H */
    public final synchronized e32 m561H() {
        return this.f838c;
    }

    /* JADX INFO: renamed from: I */
    public final synchronized boolean m562I() {
        return this.f839d > 0;
    }

    /* JADX INFO: renamed from: J */
    public final synchronized void m563J() {
        try {
            eg4 eg4VarM4775c = ((cj9) this.f60774a).m4775c("install.payload", false);
            this.f837b = eg4VarM4775c != null ? l67.m15901d(eg4VarM4775c) : null;
            this.f838c = e32.m10816i(((cj9) this.f60774a).m4775c("install.last_install_info", true));
            this.f839d = ((cj9) this.f60774a).m4776d("install.sent_time_millis", 0L).longValue();
            this.f840e = ((cj9) this.f60774a).m4776d("install.sent_count", 0L).longValue();
            cj9 cj9Var = (cj9) this.f60774a;
            Boolean bool = Boolean.FALSE;
            this.f841f = cj9Var.m4773a("install.sent_locally", bool).booleanValue();
            this.f842g = ((cj9) this.f60774a).m4773a("install.update_watchlist_initialized", bool).booleanValue();
            this.f843h = ((cj9) this.f60774a).m4775c("install.update_watchlist", true);
            this.f844i = ((cj9) this.f60774a).m4773a("install.app_limit_ad_tracking", bool).booleanValue();
            this.f845j = ((cj9) this.f60774a).m4776d("install.app_limit_ad_tracking_updated_time_millis", 0L).longValue();
            this.f846k = ((cj9) this.f60774a).m4775c("install.identity_link", true);
            this.f847l = ((cj9) this.f60774a).m4775c("install.custom_device_identifiers", true);
            this.f831H = ((cj9) this.f60774a).m4775c("install.custom_values", true);
            dg4 dg4Var = (dg4) ((cj9) this.f60774a).m4775c("install.attribution", true);
            dg4Var.m10342l("raw", true);
            dg4Var.m10343m("retrieved_time_millis", 0L).getClass();
            dg4Var.m10344n("device_id", "");
            dg4Var.m10337g("first_install", bool).getClass();
            eg4 eg4VarM4775c2 = ((cj9) this.f60774a).m4775c("install.instant_app_deeplink", false);
            if (eg4VarM4775c2 != null) {
                this.f832I = e74.m10904j(eg4VarM4775c2);
            } else {
                this.f832I = null;
            }
            eg4 eg4VarM4775c3 = ((cj9) this.f60774a).m4775c("install.install_referrer", false);
            if (eg4VarM4775c3 != null) {
                this.f833J = uo3.m22844c(eg4VarM4775c3);
            } else {
                this.f833J = null;
            }
            eg4 eg4VarM4775c4 = ((cj9) this.f60774a).m4775c("install.huawei_referrer", false);
            if (eg4VarM4775c4 != null) {
                this.f834K = gx3.m12957b(eg4VarM4775c4);
            } else {
                this.f834K = null;
            }
            eg4 eg4VarM4775c5 = ((cj9) this.f60774a).m4775c("install.samsung_referrer", false);
            if (eg4VarM4775c5 != null) {
                this.f835L = al8.m540b(eg4VarM4775c5);
            } else {
                this.f835L = null;
            }
            eg4 eg4VarM4775c6 = ((cj9) this.f60774a).m4775c("install.meta_referrer", false);
            if (eg4VarM4775c6 != null) {
                this.f836M = ay5.m3121c(eg4VarM4775c6);
            } else {
                this.f836M = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: K */
    public final synchronized void m564K(uo3 uo3Var) {
        try {
            this.f833J = uo3Var;
            cj9 cj9Var = (cj9) this.f60774a;
            if (uo3Var != null) {
                cj9Var.m4781i("install.install_referrer", uo3Var.m22846d());
            } else {
                cj9Var.m4778f("install.install_referrer");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: L */
    public final synchronized void m565L(hx3 hx3Var) {
        try {
            this.f834K = hx3Var;
            cj9 cj9Var = (cj9) this.f60774a;
            if (hx3Var != null) {
                cj9Var.m4781i("install.huawei_referrer", ((gx3) hx3Var).m12963g());
            } else {
                cj9Var.m4778f("install.huawei_referrer");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: M */
    public final synchronized void m566M(e32 e32Var) {
        this.f838c = e32Var;
        ((cj9) this.f60774a).m4781i("install.last_install_info", e32Var.m10823j());
    }

    /* JADX INFO: renamed from: N */
    public final synchronized void m567N(by5 by5Var) {
        try {
            this.f836M = by5Var;
            cj9 cj9Var = (cj9) this.f60774a;
            if (by5Var != null) {
                cj9Var.m4781i("install.meta_referrer", ((ay5) by5Var).m3125f());
            } else {
                cj9Var.m4778f("install.meta_referrer");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: O */
    public final synchronized void m568O(l67 l67Var) {
        try {
            this.f837b = l67Var;
            cj9 cj9Var = (cj9) this.f60774a;
            if (l67Var != null) {
                cj9Var.m4781i("install.payload", l67Var.m15905h());
            } else {
                cj9Var.m4778f("install.payload");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: P */
    public final synchronized void m569P(bl8 bl8Var) {
        try {
            this.f835L = bl8Var;
            cj9 cj9Var = (cj9) this.f60774a;
            if (bl8Var != null) {
                cj9Var.m4781i("install.samsung_referrer", ((al8) bl8Var).m546g());
            } else {
                cj9Var.m4778f("install.samsung_referrer");
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final synchronized void m570Q(long j) {
        this.f840e = j;
        ((cj9) this.f60774a).m4782j("install.sent_count", j);
    }

    /* JADX INFO: renamed from: R */
    public final synchronized void m571R(boolean z) {
        this.f841f = z;
        ((cj9) this.f60774a).m4779g("install.sent_locally", z);
    }

    /* JADX INFO: renamed from: S */
    public final synchronized void m572S(long j) {
        this.f839d = j;
        ((cj9) this.f60774a).m4782j("install.sent_time_millis", j);
    }

    /* JADX INFO: renamed from: T */
    public final synchronized void m573T(dg4 dg4Var) {
        this.f843h = dg4Var;
        ((cj9) this.f60774a).m4781i("install.update_watchlist", dg4Var);
    }
}
