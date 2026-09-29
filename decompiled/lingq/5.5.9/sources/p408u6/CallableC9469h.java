package p408u6;

import com.clevertap.android.sdk.inbox.CTInboxMessage;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: u6.h */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC9469h implements Callable<Void> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ CTInboxMessage f48548a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9471j f48549b;

    public CallableC9469h(C9471j c9471j, CTInboxMessage cTInboxMessage) {
        this.f48549b = c9471j;
        this.f48548a = cTInboxMessage;
    }

    @Override // java.util.concurrent.Callable
    public final Void call() throws Exception {
        synchronized (this.f48549b.f48557f.f43257b) {
            if (this.f48549b.m17886b(this.f48548a.f11287l)) {
                this.f48549b.f48558g.mo597h();
            }
        }
        return null;
    }
}
