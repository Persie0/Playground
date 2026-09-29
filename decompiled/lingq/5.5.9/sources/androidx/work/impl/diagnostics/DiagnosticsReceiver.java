package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import p026b5.AbstractC1314g;
import p026b5.C1315h;
import p041c5.C1699a0;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f7893a = AbstractC1314g.m4868f("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        AbstractC1314g abstractC1314gM4867d = AbstractC1314g.m4867d();
        String str = f7893a;
        abstractC1314gM4867d.mo4869a(str, "Requesting diagnostics");
        try {
            C1699a0.m5430d(context).m4877b(new C1315h.a(DiagnosticsWorker.class).m4879a());
        } catch (IllegalStateException e10) {
            AbstractC1314g.m4867d().mo4871c(str, "WorkManager is not initialized", e10);
        }
    }
}
