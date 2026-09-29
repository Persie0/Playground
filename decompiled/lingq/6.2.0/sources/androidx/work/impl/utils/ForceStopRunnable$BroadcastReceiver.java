package androidx.work.impl.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import p000.fc3;
import p000.oj5;

/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable$BroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f7262a = oj5.m18041h("ForceStopRunnable$Rcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
            return;
        }
        if (oj5.m18040f().f54464a <= 2) {
            Log.v(f7262a, "Rescheduling alarm that keeps track of force-stops.");
        }
        fc3.m11765c(context);
    }
}
