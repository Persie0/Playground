package p241le;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.C3213b;
import java.util.concurrent.Executor;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5750f;
import se.C8992b;

/* JADX INFO: renamed from: le.m */
/* JADX INFO: loaded from: classes.dex */
public final class C7342m implements InterfaceC5750f<C8992b, Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Executor f41072a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ CallableC7343n f41073b;

    public C7342m(CallableC7343n callableC7343n, Executor executor) {
        this.f41073b = callableC7343n;
        this.f41072a = executor;
    }

    @Override // p136gc.InterfaceC5750f
    /* JADX INFO: renamed from: f */
    public final AbstractC5751g<Void> mo428f(C8992b c8992b) throws Exception {
        if (c8992b == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings at app startup. Cannot send cached reports", null);
            return Tasks.m8539c(null);
        }
        CallableC7343n callableC7343n = this.f41073b;
        C3213b.m9163b(callableC7343n.f41075b.f41077b);
        C7344o c7344o = callableC7343n.f41075b;
        c7344o.f41077b.f16216l.m14754e(null, this.f41072a);
        c7344o.f41077b.f16220p.m12116d(null);
        return Tasks.m8539c(null);
    }
}
