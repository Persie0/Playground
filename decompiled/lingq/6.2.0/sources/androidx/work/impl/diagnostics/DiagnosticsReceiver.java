package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.C0773b;
import androidx.work.impl.workers.DiagnosticsWorker;
import p000.oj5;
import p000.tx6;
import p000.ux6;

/* JADX INFO: loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f7253a = oj5.m18041h("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        oj5 oj5VarM18040f = oj5.m18040f();
        String str = f7253a;
        oj5VarM18040f.m18042a(str, "Requesting diagnostics");
        try {
            context.getClass();
            C0773b c0773bM2910c = C0773b.m2910c(context);
            c0773bM2910c.getClass();
            c0773bM2910c.m2912a((ux6) new tx6(DiagnosticsWorker.class).m15004a());
        } catch (IllegalStateException e) {
            oj5.m18040f().m18044e(str, "WorkManager is not initialized", e);
        }
    }
}
