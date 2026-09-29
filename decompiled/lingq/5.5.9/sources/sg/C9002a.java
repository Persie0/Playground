package sg;

import p534zf.C10487e;

/* JADX INFO: renamed from: sg.a */
/* JADX INFO: loaded from: classes.dex */
public final class C9002a {

    /* JADX INFO: renamed from: a */
    public final String f47210a;

    /* JADX INFO: renamed from: b */
    public final String f47211b;

    /* JADX INFO: renamed from: c */
    public final long f47212c;

    public C9002a(long j10, String str, String str2) {
        this.f47210a = str;
        this.f47211b = str2;
        this.f47212c = j10;
    }

    /* JADX INFO: renamed from: a */
    public final C10487e m17265a() {
        C10487e c10487eM19445u = C10487e.m19445u();
        c10487eM19445u.m19450D("install_app_id", this.f47210a);
        c10487eM19445u.m19450D("install_url", this.f47211b);
        c10487eM19445u.m19449C("install_time", this.f47212c);
        return c10487eM19445u;
    }
}
