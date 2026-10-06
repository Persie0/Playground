package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import androidx.wear.ambient.AmbientMode;
import java.util.ArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lqu extends BroadcastReceiver {

    /* JADX INFO: renamed from: b */
    public static volatile boolean f39014b;

    /* JADX INFO: renamed from: a */
    public static final Object f39013a = new Object();

    /* JADX INFO: renamed from: c */
    static final lpw f39015c = lpw.m15847b();

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        AmbientMode.AmbientController ambientController;
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            Log.w("PhUpdateBroadcastRecv", "Got an invalid config package for P/H that includes '..': " + stringExtra + ". Exiting.");
            return;
        }
        ArrayList arrayList = new ArrayList(f39015c.keySet());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mrn mrnVar = (mrn) arrayList.get(i);
            if (((String) mrnVar.f41479a).equals(stringExtra) && (ambientController = (AmbientMode.AmbientController) f39015c.get(mrnVar)) != null) {
                ((lql) ambientController.f1697a).m15883b();
            }
        }
    }
}
