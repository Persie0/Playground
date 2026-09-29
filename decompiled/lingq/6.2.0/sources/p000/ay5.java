package p000;

/* JADX INFO: loaded from: classes2.dex */
public final class ay5 implements by5 {

    /* JADX INFO: renamed from: a */
    public final long f7666a;

    /* JADX INFO: renamed from: b */
    public final int f7667b;

    /* JADX INFO: renamed from: c */
    public final long f7668c;

    /* JADX INFO: renamed from: d */
    public final eg4 f7669d;

    public ay5(long j, int i, long j2, eg4 eg4Var) {
        this.f7666a = j;
        this.f7667b = i;
        this.f7668c = j2;
        this.f7669d = eg4Var;
    }

    /* JADX INFO: renamed from: b */
    public static ay5 m3120b(int i, long j, dg4 dg4Var) {
        return new ay5(System.currentTimeMillis(), i, j, dg4Var);
    }

    /* JADX INFO: renamed from: c */
    public static ay5 m3121c(eg4 eg4Var) {
        dg4 dg4Var = (dg4) eg4Var;
        return new ay5(dg4Var.m10343m("gather_time_millis", 0L).longValue(), dg4Var.m10339i(0, "is_ct").intValue(), dg4Var.m10343m("actual_timestamp", 0L).longValue(), dg4Var.m10342l("install_referrer", true));
    }

    /* JADX INFO: renamed from: a */
    public final dg4 m3122a() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10353w(this.f7667b, "is_ct");
        dg4VarM10328c.m10330A("actual_timestamp", this.f7668c);
        dg4VarM10328c.m10356z("install_referrer", this.f7669d);
        return dg4VarM10328c;
    }

    /* JADX INFO: renamed from: d */
    public final long m3123d() {
        return this.f7666a;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m3124e() {
        return this.f7666a > 0 && ((dg4) this.f7669d).m10348r() > 0;
    }

    /* JADX INFO: renamed from: f */
    public final dg4 m3125f() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10330A("gather_time_millis", this.f7666a);
        dg4VarM10328c.m10353w(this.f7667b, "is_ct");
        dg4VarM10328c.m10330A("actual_timestamp", this.f7668c);
        dg4VarM10328c.m10356z("install_referrer", this.f7669d);
        return dg4VarM10328c;
    }
}
