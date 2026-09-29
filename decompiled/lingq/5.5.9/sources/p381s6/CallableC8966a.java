package p381s6;

import com.clevertap.android.sdk.C2181a;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: s6.a */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC8966a implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8967b f46974a;

    public CallableC8966a(C8967b c8967b) {
        this.f46974a = c8967b;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        C8967b c8967b = this.f46974a;
        try {
            c8967b.f46978d.mo605v();
        } catch (Exception e10) {
            C2181a c2181aM17193c = c8967b.m17193c();
            String strM17194d = c8967b.m17194d();
            String localizedMessage = e10.getLocalizedMessage();
            c2181aM17193c.getClass();
            C2181a.m6460m(strM17194d, localizedMessage);
        }
        return null;
    }
}
