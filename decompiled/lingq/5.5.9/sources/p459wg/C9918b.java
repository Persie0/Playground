package p459wg;

import com.android.installreferrer.api.InstallReferrerClient;
import p534zf.C10487e;

/* JADX INFO: renamed from: wg.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9918b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f50570a;

    /* JADX INFO: renamed from: b */
    public final double f50571b;

    /* JADX INFO: renamed from: c */
    public final boolean f50572c;

    public C9918b(double d10, boolean z10) {
        this.f50570a = 1;
        this.f50571b = d10;
        this.f50572c = z10;
    }

    public C9918b(int i10) {
        this.f50570a = i10;
        if (i10 != 1) {
            this.f50572c = true;
            this.f50571b = 3.0d;
        } else {
            this.f50571b = 10.0d;
            this.f50572c = true;
        }
    }

    public C9918b(boolean z10, double d10) {
        this.f50570a = 0;
        this.f50572c = z10;
        this.f50571b = d10;
    }

    /* JADX INFO: renamed from: a */
    public final C10487e m18413a() {
        int i10 = this.f50570a;
        double d10 = this.f50571b;
        boolean z10 = this.f50572c;
        switch (i10) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C10487e c10487eM19445u = C10487e.m19445u();
                c10487eM19445u.m19472x("enabled", z10);
                c10487eM19445u.m19473y("wait", d10);
                return c10487eM19445u;
            default:
                C10487e c10487eM19445u2 = C10487e.m19445u();
                c10487eM19445u2.m19473y("install_deeplink_wait", d10);
                c10487eM19445u2.m19472x("install_deeplink_clicks_kill", z10);
                return c10487eM19445u2;
        }
    }
}
