package p000;

import android.content.Context;
import android.util.Log;
import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class axu extends ayl {

    /* JADX INFO: renamed from: b */
    private static final String f2692b = ayc.m2100b("DelegatingWkrFctry");

    /* JADX INFO: renamed from: a */
    public final List f2693a = new CopyOnWriteArrayList();

    @Override // p000.ayl
    /* JADX INFO: renamed from: a */
    public final ayb mo2093a(Context context, String str, WorkerParameters workerParameters) {
        Iterator it = this.f2693a.iterator();
        while (it.hasNext()) {
            try {
                ayb aybVarMo2093a = ((ayl) it.next()).mo2093a(context, str, workerParameters);
                if (aybVarMo2093a != null) {
                    return aybVarMo2093a;
                }
            } catch (Throwable th) {
                ayc.m2099a();
                Log.e(f2692b, "Unable to instantiate a ListenableWorker (" + str + ")", th);
                throw th;
            }
        }
        return null;
    }
}
