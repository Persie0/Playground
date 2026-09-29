package p241le;

import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.common.C3213b;
import java.util.Arrays;
import java.util.concurrent.Executor;
import p136gc.AbstractC5751g;
import p136gc.InterfaceC5750f;
import se.C8992b;

/* JADX INFO: renamed from: le.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7339j implements InterfaceC5750f<C8992b, Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Executor f41063a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f41064b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ CallableC7340k f41065c;

    public C7339j(CallableC7340k callableC7340k, Executor executor, String str) {
        this.f41065c = callableC7340k;
        this.f41063a = executor;
        this.f41064b = str;
    }

    @Override // p136gc.InterfaceC5750f
    /* JADX INFO: renamed from: f */
    public final AbstractC5751g<Void> mo428f(C8992b c8992b) throws Exception {
        if (c8992b == null) {
            Log.w("FirebaseCrashlytics", "Received null app settings, cannot send reports at crash time.", null);
            return Tasks.m8539c(null);
        }
        AbstractC5751g[] abstractC5751gArr = new AbstractC5751g[2];
        CallableC7340k callableC7340k = this.f41065c;
        abstractC5751gArr[0] = C3213b.m9163b(callableC7340k.f41071f);
        abstractC5751gArr[1] = callableC7340k.f41071f.f16216l.m14754e(callableC7340k.f41070e ? this.f41064b : null, this.f41063a);
        return Tasks.m8540d(Arrays.asList(abstractC5751gArr));
    }
}
