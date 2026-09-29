package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.C0773b;
import p000.oj5;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f7214a = oj5.m18041h("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        oj5.m18040f().m18042a(f7214a, "Received intent " + intent);
        try {
            C0773b c0773bM2910c = C0773b.m2910c(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            c0773bM2910c.getClass();
            synchronized (C0773b.f7203m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = c0773bM2910c.f7212i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    c0773bM2910c.f7212i = pendingResultGoAsync;
                    if (c0773bM2910c.f7211h) {
                        pendingResultGoAsync.finish();
                        c0773bM2910c.f7212i = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (IllegalStateException e) {
            oj5.m18040f().m18044e(f7214a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e);
        }
    }
}
