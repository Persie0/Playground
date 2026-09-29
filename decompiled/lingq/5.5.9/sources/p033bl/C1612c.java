package p033bl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dm.C5207g;

/* JADX INFO: renamed from: bl.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1612c extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1614e f9114a;

    public C1612c(C1614e c1614e) {
        this.f9114a = c1614e;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context != null && intent != null) {
            String action = intent.getAction();
            if (action == null || action.hashCode() != -1500940653) {
                return;
            }
            if (action.equals("com.tonyodev.fetch2.action.QUEUE_BACKOFF_RESET") && !this.f9114a.f9125d && !this.f9114a.f9124c && C5207g.m11106a(this.f9114a.f9120L, intent.getStringExtra("com.tonyodev.fetch2.extra.NAMESPACE"))) {
                this.f9114a.m5271l();
            }
        }
    }
}
