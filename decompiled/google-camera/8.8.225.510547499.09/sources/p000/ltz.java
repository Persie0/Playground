package p000;

import android.os.Handler;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ltz implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Handler f39205a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f39206b;

    public /* synthetic */ ltz(Handler handler, int i) {
        this.f39206b = i;
        this.f39205a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f39206b) {
            case 0:
                this.f39205a.post(runnable);
                break;
            default:
                this.f39205a.post(runnable);
                break;
        }
    }
}
