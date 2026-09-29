package p000;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class iw2 implements Executor {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44698a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f44699b;

    public /* synthetic */ iw2(Object obj, int i) {
        this.f44698a = i;
        this.f44699b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        int i = this.f44698a;
        Object obj = this.f44699b;
        switch (i) {
            case 0:
                ((qp9) obj).m20098c(runnable);
                break;
            default:
                ((Choreographer) obj).postFrameCallback(new cm7(runnable));
                break;
        }
    }
}
