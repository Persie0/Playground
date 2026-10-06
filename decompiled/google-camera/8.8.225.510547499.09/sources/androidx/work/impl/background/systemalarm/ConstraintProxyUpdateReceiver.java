package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p000.ayc;
import p000.azp;
import p000.bdx;
import p000.bmj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f1809a = 0;

    static {
        ayc.m2100b("ConstrntProxyUpdtRecvr");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(intent != null ? intent.getAction() : null)) {
            bdx.m2257b(azp.m2125e(context).f2789k, new bmj(intent, context, goAsync(), 1));
        } else {
            ayc.m2099a();
        }
    }
}
