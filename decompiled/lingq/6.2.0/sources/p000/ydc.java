package p000;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.measurement.internal.C1045d;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ydc extends h8d {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f69702d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ydc(C1045d c1045d, int i) {
        super(c1045d);
        this.f69702d = i;
    }

    /* JADX INFO: renamed from: I */
    private final void m25100I() {
    }

    /* JADX INFO: renamed from: J */
    private final void m25101J() {
    }

    @Override // p000.h8d
    /* JADX INFO: renamed from: G */
    public final void mo4333G() {
        int i = this.f69702d;
    }

    /* JADX INFO: renamed from: H */
    public boolean m25102H() {
        m13144E();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((kjc) this.f60774a).f47433a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    /* JADX INFO: renamed from: K */
    public void m25103K(String str, k8d k8dVar, fjc fjcVar, idc idcVar) {
        String str2;
        String str3 = k8dVar.f46876a;
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        m13144E();
        try {
            URL url = new URI(str3).toURL();
            this.f55716b.m5926j0();
            byte[] bArrM3725a = fjcVar.m3725a();
            tic ticVar = kjcVar.f47439g;
            kjc.m15280l(ticVar);
            Map map = k8dVar.f46877b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                ticVar.m22079P(new sdc(this, str2, url, bArrM3725a, map, idcVar));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17925c("Failed to parse URL. Not uploading MeasurementBatch. appId", xcc.m24449L(str2), str3);
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }
}
