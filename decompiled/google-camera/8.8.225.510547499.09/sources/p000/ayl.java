package p000;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class ayl {

    /* JADX INFO: renamed from: a */
    private static final String f2725a = ayc.m2100b("WorkerFactory");

    /* JADX INFO: renamed from: a */
    public abstract ayb mo2093a(Context context, String str, WorkerParameters workerParameters);

    /* JADX INFO: renamed from: b */
    public final ayb m2107b(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        ayb aybVarMo2093a = mo2093a(context, str, workerParameters);
        if (aybVarMo2093a == null) {
            try {
                clsAsSubclass = Class.forName(str).asSubclass(ayb.class);
            } catch (Throwable th) {
                ayc.m2099a();
                Log.e(f2725a, "Invalid class: ".concat(String.valueOf(str)), th);
                clsAsSubclass = null;
            }
            if (clsAsSubclass != null) {
                try {
                    aybVarMo2093a = (ayb) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    ayc.m2099a();
                    Log.e(f2725a, "Could not instantiate ".concat(String.valueOf(str)), th2);
                }
            }
        }
        if (aybVarMo2093a == null || !aybVarMo2093a.f2708f) {
            return aybVarMo2093a;
        }
        throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
    }
}
