package p485xg;

import p534zf.C10487e;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: xg.d */
/* JADX INFO: loaded from: classes.dex */
public final class C10188d {

    /* JADX INFO: renamed from: a */
    public final String f51536a;

    /* JADX INFO: renamed from: b */
    public final String f51537b;

    /* JADX INFO: renamed from: c */
    public final String f51538c;

    /* JADX INFO: renamed from: d */
    public final String f51539d;

    /* JADX INFO: renamed from: e */
    public final String f51540e;

    /* JADX INFO: renamed from: f */
    public final Long f51541f;

    /* JADX INFO: renamed from: g */
    public final Boolean f51542g;

    /* JADX INFO: renamed from: h */
    public final long f51543h;

    public C10188d() {
        this.f51536a = null;
        this.f51537b = null;
        this.f51538c = null;
        this.f51539d = null;
        this.f51540e = null;
        this.f51541f = null;
        this.f51542g = null;
        this.f51543h = 0L;
    }

    public C10188d(String str, String str2, String str3, String str4, String str5, Long l10, Boolean bool, long j10) {
        this.f51536a = str;
        this.f51537b = str2;
        this.f51538c = str3;
        this.f51539d = str4;
        this.f51540e = str5;
        this.f51541f = l10;
        this.f51542g = bool;
        this.f51543h = j10;
    }

    /* JADX INFO: renamed from: a */
    public static C10188d m19199a(InterfaceC10488f interfaceC10488f) {
        return new C10188d(interfaceC10488f.mo19467q("kochava_device_id", null), interfaceC10488f.mo19467q("kochava_app_id", null), interfaceC10488f.mo19467q("sdk_version", null), interfaceC10488f.mo19467q("app_version", null), interfaceC10488f.mo19467q("os_version", null), interfaceC10488f.mo19459i("time", null), interfaceC10488f.mo19468r("sdk_disabled", null), interfaceC10488f.mo19459i("count", 0L).longValue());
    }

    /* JADX INFO: renamed from: b */
    public final C10487e m19200b() {
        C10487e c10487eM19445u = C10487e.m19445u();
        String str = this.f51536a;
        if (str != null) {
            c10487eM19445u.m19450D("kochava_device_id", str);
        }
        String str2 = this.f51537b;
        if (str2 != null) {
            c10487eM19445u.m19450D("kochava_app_id", str2);
        }
        String str3 = this.f51538c;
        if (str3 != null) {
            c10487eM19445u.m19450D("sdk_version", str3);
        }
        String str4 = this.f51539d;
        if (str4 != null) {
            c10487eM19445u.m19450D("app_version", str4);
        }
        String str5 = this.f51540e;
        if (str5 != null) {
            c10487eM19445u.m19450D("os_version", str5);
        }
        Long l10 = this.f51541f;
        if (l10 != null) {
            c10487eM19445u.m19449C("time", l10.longValue());
        }
        Boolean bool = this.f51542g;
        if (bool != null) {
            c10487eM19445u.m19472x("sdk_disabled", bool.booleanValue());
        }
        c10487eM19445u.m19449C("count", this.f51543h);
        return c10487eM19445u;
    }
}
