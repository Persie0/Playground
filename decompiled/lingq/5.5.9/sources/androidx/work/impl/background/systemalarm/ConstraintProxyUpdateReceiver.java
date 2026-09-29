package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.activity.result.C0204c;
import p026b5.AbstractC1314g;
import p041c5.C1699a0;
import p235l5.C7267n;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f7844a = AbstractC1314g.m4868f("ConstrntProxyUpdtRecvr");

    /* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver$a */
    public class RunnableC1249a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Intent f7845a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Context f7846b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ BroadcastReceiver.PendingResult f7847c;

        public RunnableC1249a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f7845a = intent;
            this.f7846b = context;
            this.f7847c = pendingResult;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BroadcastReceiver.PendingResult pendingResult = this.f7847c;
            Context context = this.f7846b;
            Intent intent = this.f7845a;
            try {
                boolean booleanExtra = intent.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = intent.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = intent.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = intent.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                AbstractC1314g.m4867d().mo4869a(ConstraintProxyUpdateReceiver.f7844a, "Updating proxies: (BatteryNotLowProxy (" + booleanExtra + "), BatteryChargingProxy (" + booleanExtra2 + "), StorageNotLowProxy (" + booleanExtra3 + "), NetworkStateProxy (" + booleanExtra4 + "), ");
                C7267n.m14658a(context, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                C7267n.m14658a(context, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                C7267n.m14658a(context, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                C7267n.m14658a(context, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                pendingResult.finish();
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            C1699a0.m5430d(context).f9478d.m14863a(new RunnableC1249a(intent, context, goAsync()));
        } else {
            AbstractC1314g.m4867d().mo4869a(f7844a, C0204c.m852k("Ignoring unknown action ", action));
        }
    }
}
