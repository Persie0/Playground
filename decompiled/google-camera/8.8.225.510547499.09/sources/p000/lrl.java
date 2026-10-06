package p000;

import android.content.Context;
import android.content.pm.ProviderInfo;
import com.google.android.libraries.social.licenses.GWO.HEePJw;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lrl extends lrp {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f39089a = HEePJw.MTidHIeVRCbUZ;

    @Override // p000.lrp
    /* JADX INFO: renamed from: a */
    protected final int mo15914a(Context context, lpe lpeVar, boolean z) {
        if (context.getPackageName().equals(((ProviderInfo) lpeVar.f38884c).packageName)) {
            return z ? 1 : 2;
        }
        if (z) {
            return 2;
        }
        return this.f39089a.equals(((ProviderInfo) lpeVar.f38884c).packageName) ? 1 : 3;
    }
}
