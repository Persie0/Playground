package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lua extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    public static final String f39207a = lua.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private static final Handler f39208b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: c */
    private lud f39209c;

    private lua() {
    }

    /* JADX INFO: renamed from: a */
    public static void m15982a(BroadcastReceiver.PendingResult pendingResult) {
        pendingResult.abortBroadcast();
        pendingResult.finish();
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        try {
            View viewM16003a = luk.m16003a();
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            lud ludVar = this.f39209c;
            ArrayList arrayList = new ArrayList();
            for (AmbientMode.AmbientController ambientController : ludVar.f39213b) {
                arrayList.add(npp.f44031a);
            }
            nps npsVarM17553i = nod.m17553i(kxk.m14961G(arrayList), new mrf() { // from class: lub
                @Override // p000.mrf
                public final Object apply(Object obj) {
                    String str = lud.f39212a;
                    return null;
                }
            }, not.INSTANCE);
            cwx cwxVar = new cwx(ludVar, viewM16003a, pendingResultGoAsync, 5);
            Handler handler = f39208b;
            handler.getClass();
            kxk.m14975U(npsVarM17553i, cwxVar, new ltz(handler, 0));
        } catch (luf e) {
            Log.e(f39207a, "Failed to snapshot hierarchy. Could not find any window to capture.");
        }
    }

    public lua(lud ludVar) {
        this.f39209c = ludVar;
    }
}
