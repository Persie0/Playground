package p000;

import android.content.Context;
import android.net.ConnectivityManager;
import android.util.Log;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bbk extends bbh {

    /* JADX INFO: renamed from: e */
    public final ConnectivityManager f2903e;

    /* JADX INFO: renamed from: f */
    private final bbj f2904f;

    public bbk(Context context, C1058va c1058va, byte[] bArr) {
        super(context, c1058va, null);
        Object systemService = this.f2896a.getSystemService("connectivity");
        systemService.getClass();
        this.f2903e = (ConnectivityManager) systemService;
        this.f2904f = new bbj(this);
    }

    @Override // p000.bbh
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo2174b() {
        return bbl.m2180a(this.f2903e);
    }

    @Override // p000.bbh
    /* JADX INFO: renamed from: d */
    public final void mo2176d() {
        try {
            ayc.m2099a();
            String str = bbl.f2905a;
            bdy.m2258a(this.f2903e, this.f2904f);
        } catch (IllegalArgumentException e) {
            ayc.m2099a();
            Log.e(bbl.f2905a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            ayc.m2099a();
            Log.e(bbl.f2905a, "Received exception while registering network callback", e2);
        }
    }

    @Override // p000.bbh
    /* JADX INFO: renamed from: e */
    public final void mo2177e() {
        try {
            ayc.m2099a();
            String str = bbl.f2905a;
            bdw.m2253b(this.f2903e, this.f2904f);
        } catch (IllegalArgumentException e) {
            ayc.m2099a();
            Log.e(bbl.f2905a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            ayc.m2099a();
            Log.e(bbl.f2905a, "Received exception while unregistering network callback", e2);
        }
    }
}
