package p479xa;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: renamed from: xa.r */
/* JADX INFO: loaded from: classes.dex */
public final class C10149r extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* JADX INFO: renamed from: a */
    public final C10150s f51428a;

    public C10149r(C10150s c10150s) {
        this.f51428a = c10150s;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001f  */
    @Override // android.telephony.TelephonyCallback.DisplayInfoListener
    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        boolean z10;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        if (overrideNetworkType != 3 && overrideNetworkType != 4) {
            if (overrideNetworkType != 5) {
                z10 = false;
            }
            C10150s.m19118a(this.f51428a, z10 ? 10 : 5);
        }
        z10 = true;
        C10150s.m19118a(this.f51428a, z10 ? 10 : 5);
    }
}
