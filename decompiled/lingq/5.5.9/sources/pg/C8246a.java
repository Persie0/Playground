package pg;

import androidx.view.C1031f;
import p534zf.C10487e;
import p534zf.InterfaceC10488f;

/* JADX INFO: renamed from: pg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8246a {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10488f f44532a;

    /* JADX INFO: renamed from: b */
    public final long f44533b;

    /* JADX INFO: renamed from: c */
    public final String f44534c;

    /* JADX INFO: renamed from: d */
    public final boolean f44535d;

    public C8246a() {
        this.f44532a = C10487e.m19445u();
        this.f44533b = 0L;
        this.f44534c = "";
        this.f44535d = false;
    }

    public C8246a(InterfaceC10488f interfaceC10488f, long j10, String str, boolean z10) {
        this.f44532a = interfaceC10488f;
        this.f44533b = j10;
        this.f44534c = str;
        this.f44535d = z10;
    }

    /* JADX INFO: renamed from: a */
    public static C8246a m16394a(InterfaceC10488f interfaceC10488f) {
        return new C8246a(interfaceC10488f.mo19454d("raw", true), interfaceC10488f.mo19459i("retrieved_time_millis", 0L).longValue(), interfaceC10488f.mo19467q("device_id", ""), interfaceC10488f.mo19468r("first_install", Boolean.FALSE).booleanValue());
    }

    /* JADX INFO: renamed from: b */
    public final C1031f m16395b() {
        long j10 = this.f44533b;
        boolean z10 = true;
        boolean z11 = j10 > 0;
        boolean z12 = j10 > 0;
        InterfaceC10488f interfaceC10488f = this.f44532a;
        if (!z12 || interfaceC10488f.length() <= 0 || interfaceC10488f.mo19467q("network_id", "").isEmpty()) {
            z10 = false;
        }
        return new C1031f(interfaceC10488f, z11, z10, this.f44535d);
    }

    /* JADX INFO: renamed from: c */
    public final C10487e m16396c() {
        C10487e c10487eM19445u = C10487e.m19445u();
        c10487eM19445u.m19448B(this.f44532a, "raw");
        c10487eM19445u.m19449C("retrieved_time_millis", this.f44533b);
        c10487eM19445u.m19450D("device_id", this.f44534c);
        c10487eM19445u.m19472x("first_install", this.f44535d);
        return c10487eM19445u;
    }
}
