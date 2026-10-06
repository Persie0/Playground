package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.work.impl.workers.DiagnosticsWorker;
import com.google.android.apps.camera.cameravisionkit.olQ.BEeWZPor;
import java.util.Collections;
import java.util.List;
import p000.ayc;
import p000.ayj;
import p000.azg;
import p000.azp;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static final String f1817a = ayc.m2100b(BEeWZPor.QMHDYqgr);

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        ayc.m2099a();
        try {
            azp azpVarM2125e = azp.m2125e(context);
            List listSingletonList = Collections.singletonList(new ayj(DiagnosticsWorker.class).m2106b());
            if (listSingletonList.isEmpty()) {
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            }
            new azg(azpVarM2125e, null, 2, listSingletonList).m2122h();
        } catch (IllegalStateException e) {
            ayc.m2099a();
            Log.e(f1817a, "WorkManager is not initialized", e);
        }
    }
}
