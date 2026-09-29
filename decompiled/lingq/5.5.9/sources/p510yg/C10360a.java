package p510yg;

import com.kochava.tracker.installreferrer.internal.InstallReferrerStatus;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: yg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C10360a {

    /* JADX INFO: renamed from: a */
    public final int f52085a;

    /* JADX INFO: renamed from: b */
    public final double f52086b;

    /* JADX INFO: renamed from: c */
    public final InstallReferrerStatus f52087c;

    /* JADX INFO: renamed from: d */
    public final String f52088d;

    /* JADX INFO: renamed from: e */
    public final Long f52089e;

    /* JADX INFO: renamed from: f */
    public final Long f52090f;

    /* JADX INFO: renamed from: g */
    public final Long f52091g;

    /* JADX INFO: renamed from: h */
    public final Long f52092h;

    /* JADX INFO: renamed from: i */
    public final Boolean f52093i;

    /* JADX INFO: renamed from: j */
    public final String f52094j;

    public C10360a(int i10, double d10, InstallReferrerStatus installReferrerStatus, String str, Long l10, Long l11, Long l12, Long l13, Boolean bool, String str2) {
        this.f52085a = i10;
        this.f52086b = d10;
        this.f52087c = installReferrerStatus;
        this.f52088d = str;
        this.f52089e = l10;
        this.f52090f = l11;
        this.f52091g = l12;
        this.f52092h = l13;
        this.f52093i = bool;
        this.f52094j = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C10360a m19382a(InterfaceC10488f interfaceC10488f) {
        return new C10360a(interfaceC10488f.mo19466p(0, "attempt_count").intValue(), interfaceC10488f.mo19462l("duration", Double.valueOf(0.0d)).doubleValue(), InstallReferrerStatus.fromKey(interfaceC10488f.mo19467q("status", "")), interfaceC10488f.mo19467q("referrer", null), interfaceC10488f.mo19459i("install_begin_time", null), interfaceC10488f.mo19459i("install_begin_server_time", null), interfaceC10488f.mo19459i("referrer_click_time", null), interfaceC10488f.mo19459i("referrer_click_server_time", null), interfaceC10488f.mo19468r("google_play_instant", null), interfaceC10488f.mo19467q("install_version", null));
    }

    /* JADX INFO: renamed from: b */
    public final C10487e m19383b() {
        C10487e c10487eM19445u = C10487e.m19445u();
        c10487eM19445u.m19474z("attempt_count", this.f52085a);
        c10487eM19445u.m19473y("duration", this.f52086b);
        c10487eM19445u.m19450D("status", this.f52087c.key);
        String str = this.f52088d;
        if (str != null) {
            c10487eM19445u.m19450D("referrer", str);
        }
        Long l10 = this.f52089e;
        if (l10 != null) {
            c10487eM19445u.m19449C("install_begin_time", l10.longValue());
        }
        Long l11 = this.f52090f;
        if (l11 != null) {
            c10487eM19445u.m19449C("install_begin_server_time", l11.longValue());
        }
        Long l12 = this.f52091g;
        if (l12 != null) {
            c10487eM19445u.m19449C("referrer_click_time", l12.longValue());
        }
        Long l13 = this.f52092h;
        if (l13 != null) {
            c10487eM19445u.m19449C("referrer_click_server_time", l13.longValue());
        }
        Boolean bool = this.f52093i;
        if (bool != null) {
            c10487eM19445u.m19472x("google_play_instant", bool.booleanValue());
        }
        String str2 = this.f52094j;
        if (str2 != null) {
            c10487eM19445u.m19450D("install_version", str2);
        }
        return c10487eM19445u;
    }
}
