package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import p000.ayc;
import p000.azp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static final String f1810a = ayc.m2100b("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ayc.m2099a();
        StringBuilder sb = new StringBuilder();
        sb.append("Received intent ");
        sb.append(intent);
        try {
            azp azpVarM2125e = azp.m2125e(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (azp.f2777a) {
                BroadcastReceiver.PendingResult pendingResult = azpVarM2125e.f2786h;
                if (pendingResult != null) {
                    pendingResult.finish();
                }
                azpVarM2125e.f2786h = pendingResultGoAsync;
                if (azpVarM2125e.f2785g) {
                    azpVarM2125e.f2786h.finish();
                    azpVarM2125e.f2786h = null;
                }
            }
        } catch (IllegalStateException e) {
            ayc.m2099a();
            Log.e(f1810a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
