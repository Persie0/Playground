package p158hh;

import com.kochava.tracker.samsungreferrer.SamsungReferrerStatus;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: hh.b */
/* JADX INFO: loaded from: classes.dex */
public final class C6047b {

    /* JADX INFO: renamed from: a */
    public final long f35699a;

    /* JADX INFO: renamed from: b */
    public final int f35700b;

    /* JADX INFO: renamed from: c */
    public final double f35701c;

    /* JADX INFO: renamed from: d */
    public final SamsungReferrerStatus f35702d;

    /* JADX INFO: renamed from: e */
    public final String f35703e;

    /* JADX INFO: renamed from: f */
    public final Long f35704f;

    /* JADX INFO: renamed from: g */
    public final Long f35705g;

    public C6047b(long j10, int i10, double d10, SamsungReferrerStatus samsungReferrerStatus, String str, Long l10, Long l11) {
        this.f35699a = j10;
        this.f35700b = i10;
        this.f35701c = d10;
        this.f35702d = samsungReferrerStatus;
        this.f35703e = str;
        this.f35704f = l10;
        this.f35705g = l11;
    }

    /* JADX INFO: renamed from: b */
    public static C6047b m12491b(InterfaceC10488f interfaceC10488f) {
        return new C6047b(interfaceC10488f.mo19459i("gather_time_millis", 0L).longValue(), interfaceC10488f.mo19466p(0, "attempt_count").intValue(), interfaceC10488f.mo19462l("duration", Double.valueOf(0.0d)).doubleValue(), SamsungReferrerStatus.fromKey(interfaceC10488f.mo19467q("status", "")), interfaceC10488f.mo19467q("referrer", null), interfaceC10488f.mo19459i("install_begin_time", null), interfaceC10488f.mo19459i("referrer_click_time", null));
    }

    /* JADX INFO: renamed from: a */
    public final C10487e m12492a() {
        C10487e c10487eM19445u = C10487e.m19445u();
        c10487eM19445u.m19474z("attempt_count", this.f35700b);
        c10487eM19445u.m19473y("duration", this.f35701c);
        c10487eM19445u.m19450D("status", this.f35702d.key);
        String str = this.f35703e;
        if (str != null) {
            c10487eM19445u.m19450D("referrer", str);
        }
        Long l10 = this.f35704f;
        if (l10 != null) {
            c10487eM19445u.m19449C("install_begin_time", l10.longValue());
        }
        Long l11 = this.f35705g;
        if (l11 != null) {
            c10487eM19445u.m19449C("referrer_click_time", l11.longValue());
        }
        return c10487eM19445u;
    }

    /* JADX INFO: renamed from: c */
    public final C10487e m12493c() {
        C10487e c10487eM19445u = C10487e.m19445u();
        c10487eM19445u.m19449C("gather_time_millis", this.f35699a);
        c10487eM19445u.m19474z("attempt_count", this.f35700b);
        c10487eM19445u.m19473y("duration", this.f35701c);
        c10487eM19445u.m19450D("status", this.f35702d.key);
        String str = this.f35703e;
        if (str != null) {
            c10487eM19445u.m19450D("referrer", str);
        }
        Long l10 = this.f35704f;
        if (l10 != null) {
            c10487eM19445u.m19449C("install_begin_time", l10.longValue());
        }
        Long l11 = this.f35705g;
        if (l11 != null) {
            c10487eM19445u.m19449C("referrer_click_time", l11.longValue());
        }
        return c10487eM19445u;
    }
}
