package p000;

import android.content.pm.PackageInfo;
import android.os.UserManager;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class hbz {

    /* JADX INFO: renamed from: a */
    public final hah f27208a;

    /* JADX INFO: renamed from: b */
    public final hai f27209b;

    /* JADX INFO: renamed from: c */
    public final long f27210c;

    /* JADX INFO: renamed from: d */
    private final UserManager f27211d;

    /* JADX INFO: renamed from: e */
    private final dhv f27212e;

    /* JADX INFO: renamed from: f */
    private final kpa f27213f;

    /* JADX INFO: renamed from: g */
    private final oju f27214g;

    /* JADX INFO: renamed from: h */
    private final lih f27215h;

    public hbz(UserManager userManager, dhv dhvVar, kpa kpaVar, hah hahVar, hai haiVar, lih lihVar, oju ojuVar, PackageInfo packageInfo, byte[] bArr) {
        this.f27211d = userManager;
        this.f27212e = dhvVar;
        this.f27213f = kpaVar;
        this.f27208a = hahVar;
        this.f27209b = haiVar;
        this.f27215h = lihVar;
        this.f27214g = ojuVar;
        this.f27210c = packageInfo.getLongVersionCode();
    }

    /* JADX INFO: renamed from: b */
    public final boolean m10097b() {
        boolean z = this.f27213f.f36762e;
        return this.f27211d.isSystemUser() && this.f27212e.mo6184l(dib.f11310bQ) && !ohp.f46028a.mo6051a().mo18499d();
    }

    /* JADX INFO: renamed from: a */
    public final void m10096a() {
        int i;
        int i2 = this.f27215h.f38303a;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        switch (i3) {
            case 0:
            case 3:
                hbv hbvVar = (hbv) this.f27214g.get();
                if (((Integer) hbvVar.f27182l.mo10031c(gzy.f27027ak)).intValue() > ohp.m18494c()) {
                    ((nbe) ((nbe) hbv.f27171a.m17252c()).mo17276G(3430)).mo17292q("Attempted HAL update for more than %d times. Skipping update.", ohp.m18494c());
                    hbvVar.m10095c();
                    i = 4;
                } else {
                    kxk.m14975U(kxk.m14969O(new bdv(hbvVar, 11), hbvVar.f27175e), new cmo(hbvVar, 15), hbvVar.f27178h);
                    i = 2;
                }
                lih lihVar = hbvVar.f27190t;
                if (i != lihVar.f38303a) {
                    lihVar.m15386c(i);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
