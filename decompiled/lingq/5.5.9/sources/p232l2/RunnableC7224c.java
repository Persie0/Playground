package p232l2;

import android.app.Application;

/* JADX INFO: renamed from: l2.c */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC7224c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Application f40607a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7226e.a f40608b;

    public RunnableC7224c(Application application, C7226e.a aVar) {
        this.f40607a = application;
        this.f40608b = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40607a.unregisterActivityLifecycleCallbacks(this.f40608b);
    }
}
