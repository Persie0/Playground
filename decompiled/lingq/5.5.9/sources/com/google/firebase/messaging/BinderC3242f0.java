package com.google.firebase.messaging;

import android.os.Binder;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Executor;
import p402u0.C9369l;

/* JADX INFO: renamed from: com.google.firebase.messaging.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC3242f0 extends Binder {

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ int f16380b = 0;

    /* JADX INFO: renamed from: a */
    public final a f16381a;

    /* JADX INFO: renamed from: com.google.firebase.messaging.f0$a */
    public interface a {
    }

    public BinderC3242f0(AbstractServiceC3245h.a aVar) {
        this.f16381a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final void m9255a(ServiceConnectionC3244g0.a aVar) {
        if (Binder.getCallingUid() != Process.myUid()) {
            throw new SecurityException("Binding only allowed within app");
        }
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "service received new intent via bind strategy");
        }
        AbstractServiceC3245h.this.processIntent(aVar.f16391a).mo12101c(new Executor() { // from class: com.google.firebase.messaging.e0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, new C9369l(18, aVar));
    }
}
