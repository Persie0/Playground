package p000;

import android.app.Application;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hjl implements hjk {

    /* JADX INFO: renamed from: a */
    public final Object f28051a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f28052b;

    /* JADX INFO: renamed from: c */
    private final Object f28053c;

    public hjl(Application application, ent entVar, int i) {
        this.f28052b = i;
        this.f28053c = application;
        this.f28051a = entVar;
    }

    public hjl(Runnable runnable, int i) {
        this.f28052b = i;
        this.f28051a = new AtomicBoolean(false);
        this.f28053c = runnable;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f28052b) {
            case 0:
                if (!((AtomicBoolean) this.f28051a).getAndSet(true)) {
                    this.f28053c.run();
                }
                break;
            default:
                ((Application) this.f28053c).registerActivityLifecycleCallbacks(new enx(this, null));
                break;
        }
    }
}
