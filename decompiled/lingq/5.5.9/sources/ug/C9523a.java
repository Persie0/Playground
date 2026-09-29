package ug;

import com.kochava.tracker.huaweireferrer.internal.HuaweiReferrerStatus;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: ug.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9523a {

    /* JADX INFO: renamed from: a */
    public final int f49037a;

    /* JADX INFO: renamed from: b */
    public final double f49038b;

    /* JADX INFO: renamed from: c */
    public final HuaweiReferrerStatus f49039c;

    /* JADX INFO: renamed from: d */
    public final String f49040d;

    /* JADX INFO: renamed from: e */
    public final Long f49041e;

    /* JADX INFO: renamed from: f */
    public final Long f49042f;

    public C9523a(int i10, double d10, HuaweiReferrerStatus huaweiReferrerStatus, String str, Long l10, Long l11) {
        this.f49037a = i10;
        this.f49038b = d10;
        this.f49039c = huaweiReferrerStatus;
        this.f49040d = str;
        this.f49041e = l10;
        this.f49042f = l11;
    }

    /* JADX INFO: renamed from: a */
    public static C9523a m17984a(InterfaceC10488f interfaceC10488f) {
        return new C9523a(interfaceC10488f.mo19466p(0, "attempt_count").intValue(), interfaceC10488f.mo19462l("duration", Double.valueOf(0.0d)).doubleValue(), HuaweiReferrerStatus.fromKey(interfaceC10488f.mo19467q("status", "")), interfaceC10488f.mo19467q("referrer", null), interfaceC10488f.mo19459i("install_begin_time", null), interfaceC10488f.mo19459i("referrer_click_time", null));
    }

    /* JADX INFO: renamed from: b */
    public final C10487e m17985b() {
        C10487e c10487eM19445u = C10487e.m19445u();
        c10487eM19445u.m19474z("attempt_count", this.f49037a);
        c10487eM19445u.m19473y("duration", this.f49038b);
        c10487eM19445u.m19450D("status", this.f49039c.key);
        String str = this.f49040d;
        if (str != null) {
            c10487eM19445u.m19450D("referrer", str);
        }
        Long l10 = this.f49041e;
        if (l10 != null) {
            c10487eM19445u.m19449C("install_begin_time", l10.longValue());
        }
        Long l11 = this.f49042f;
        if (l11 != null) {
            c10487eM19445u.m19449C("referrer_click_time", l11.longValue());
        }
        return c10487eM19445u;
    }
}
