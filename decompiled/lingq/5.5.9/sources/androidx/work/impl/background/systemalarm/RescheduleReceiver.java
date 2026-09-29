package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import p026b5.AbstractC1314g;
import p041c5.C1699a0;

/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f7848a = AbstractC1314g.m4868f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AbstractC1314g.m4867d().mo4869a(f7848a, "Received intent " + intent);
        try {
            C1699a0 c1699a0M5430d = C1699a0.m5430d(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            c1699a0M5430d.getClass();
            synchronized (C1699a0.f9474m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = c1699a0M5430d.f9483i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    c1699a0M5430d.f9483i = pendingResultGoAsync;
                    if (c1699a0M5430d.f9482h) {
                        pendingResultGoAsync.finish();
                        c1699a0M5430d.f9483i = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (IllegalStateException e10) {
            AbstractC1314g.m4867d().mo4871c(f7848a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
        }
    }
}
