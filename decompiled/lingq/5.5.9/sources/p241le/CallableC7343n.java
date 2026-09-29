package p241le;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.C3213b;
import java.io.File;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p136gc.AbstractC5751g;
import p339qe.C8596a;
import p339qe.C8597b;

/* JADX INFO: renamed from: le.n */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC7343n implements Callable<AbstractC5751g<Void>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Boolean f41074a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7344o f41075b;

    public CallableC7343n(C7344o c7344o, Boolean bool) {
        this.f41075b = c7344o;
        this.f41074a = bool;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final AbstractC5751g<Void> call() throws Exception {
        Boolean bool = this.f41074a;
        boolean zBooleanValue = bool.booleanValue();
        C7344o c7344o = this.f41075b;
        if (zBooleanValue) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue2 = bool.booleanValue();
            C7323a0 c7323a0 = c7344o.f41077b.f16206b;
            if (!zBooleanValue2) {
                c7323a0.getClass();
                throw new IllegalStateException("An invalid data collection token was used.");
            }
            c7323a0.f41026f.m12116d(null);
            Executor executor = c7344o.f41077b.f16209e.f41050a;
            return c7344o.f41076a.mo12112n(executor, new C7342m(this, executor));
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        C3213b c3213b = c7344o.f41077b;
        Iterator it = C8597b.m16818e(c3213b.f16211g.f46076b.listFiles(C3213b.f16204q)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        C3213b c3213b2 = c7344o.f41077b;
        C8597b c8597b = c3213b2.f16216l.f41057b.f46073b;
        C8596a.m16810a(C8597b.m16818e(c8597b.f46078d.listFiles()));
        C8596a.m16810a(C8597b.m16818e(c8597b.f46079e.listFiles()));
        C8596a.m16810a(C8597b.m16818e(c8597b.f46080f.listFiles()));
        c3213b2.f16220p.m12116d(null);
        return Tasks.m8539c(null);
    }
}
