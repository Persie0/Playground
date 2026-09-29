package p000;

import com.kochava.tracker.store.samsung.referrer.internal.SamsungReferrerStatus;

/* JADX INFO: loaded from: classes2.dex */
public final class al8 implements bl8 {

    /* JADX INFO: renamed from: a */
    public final long f811a;

    /* JADX INFO: renamed from: b */
    public final int f812b;

    /* JADX INFO: renamed from: c */
    public final double f813c;

    /* JADX INFO: renamed from: d */
    public final SamsungReferrerStatus f814d;

    /* JADX INFO: renamed from: e */
    public final String f815e;

    /* JADX INFO: renamed from: f */
    public final Long f816f;

    /* JADX INFO: renamed from: g */
    public final Long f817g;

    public al8(long j, int i, double d, SamsungReferrerStatus samsungReferrerStatus, String str, Long l, Long l2) {
        this.f811a = j;
        this.f812b = i;
        this.f813c = d;
        this.f814d = samsungReferrerStatus;
        this.f815e = str;
        this.f816f = l;
        this.f817g = l2;
    }

    /* JADX INFO: renamed from: b */
    public static al8 m540b(eg4 eg4Var) {
        dg4 dg4Var = (dg4) eg4Var;
        return new al8(dg4Var.m10343m("gather_time_millis", 0L).longValue(), dg4Var.m10339i(0, "attempt_count").intValue(), dg4Var.m10338h("duration", Double.valueOf(0.0d)).doubleValue(), SamsungReferrerStatus.fromKey(dg4Var.m10344n("status", "")), dg4Var.m10344n("referrer", null), dg4Var.m10343m("install_begin_time", null), dg4Var.m10343m("referrer_click_time", null));
    }

    /* JADX INFO: renamed from: a */
    public final dg4 m541a() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10353w(this.f812b, "attempt_count");
        dg4VarM10328c.m10352v(this.f813c, "duration");
        dg4VarM10328c.m10331B("status", this.f814d.key);
        String str = this.f815e;
        if (str != null) {
            dg4VarM10328c.m10331B("referrer", str);
        }
        Long l = this.f816f;
        if (l != null) {
            dg4VarM10328c.m10330A("install_begin_time", l.longValue());
        }
        Long l2 = this.f817g;
        if (l2 != null) {
            dg4VarM10328c.m10330A("referrer_click_time", l2.longValue());
        }
        return dg4VarM10328c;
    }

    /* JADX INFO: renamed from: c */
    public final long m542c() {
        return this.f811a;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m543d() {
        return this.f814d != SamsungReferrerStatus.NotGathered;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m544e() {
        SamsungReferrerStatus samsungReferrerStatus = SamsungReferrerStatus.FeatureNotSupported;
        SamsungReferrerStatus samsungReferrerStatus2 = this.f814d;
        return (samsungReferrerStatus2 == samsungReferrerStatus || samsungReferrerStatus2 == SamsungReferrerStatus.MissingDependency) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m545f() {
        SamsungReferrerStatus samsungReferrerStatus = SamsungReferrerStatus.Ok;
        SamsungReferrerStatus samsungReferrerStatus2 = this.f814d;
        return samsungReferrerStatus2 == samsungReferrerStatus || samsungReferrerStatus2 == SamsungReferrerStatus.NoData;
    }

    /* JADX INFO: renamed from: g */
    public final dg4 m546g() {
        dg4 dg4VarM10328c = dg4.m10328c();
        dg4VarM10328c.m10330A("gather_time_millis", this.f811a);
        dg4VarM10328c.m10353w(this.f812b, "attempt_count");
        dg4VarM10328c.m10352v(this.f813c, "duration");
        dg4VarM10328c.m10331B("status", this.f814d.key);
        String str = this.f815e;
        if (str != null) {
            dg4VarM10328c.m10331B("referrer", str);
        }
        Long l = this.f816f;
        if (l != null) {
            dg4VarM10328c.m10330A("install_begin_time", l.longValue());
        }
        Long l2 = this.f817g;
        if (l2 != null) {
            dg4VarM10328c.m10330A("referrer_click_time", l2.longValue());
        }
        return dg4VarM10328c;
    }
}
