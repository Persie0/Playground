package cc;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* JADX INFO: renamed from: cc.p3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1905p3 extends AbstractC1774a7 {
    public C1905p3(C1846i7 c1846i7) {
        super(c1846i7);
    }

    @Override // cc.AbstractC1774a7
    /* JADX INFO: renamed from: k */
    public final void mo5496k() {
    }

    /* JADX INFO: renamed from: l */
    public final boolean m5850l() {
        m5494h();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((C1897o4) this.f10430a).f10076a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
