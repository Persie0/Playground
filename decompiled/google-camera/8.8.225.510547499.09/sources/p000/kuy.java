package p000;

import android.os.Handler;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kuy implements Executor {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f37264a;

    /* JADX INFO: renamed from: b */
    private final Object f37265b;

    public kuy(Handler handler, int i) {
        this.f37264a = i;
        this.f37265b = handler;
    }

    public kuy(jvd jvdVar, int i) {
        this.f37264a = i;
        this.f37265b = jvdVar;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        switch (this.f37264a) {
            case 0:
                ((Handler) this.f37265b).post(runnable);
                return;
            default:
                if (jvd.m13540d()) {
                    runnable.run();
                    return;
                }
                final nqf nqfVarM17621g = nqf.m17621g();
                ((jvd) this.f37265b).execute(new Runnable() { // from class: jvg
                    @Override // java.lang.Runnable
                    public final void run() {
                        Runnable runnable2 = runnable;
                        nqf nqfVar = nqfVarM17621g;
                        try {
                            runnable2.run();
                            nqfVar.mo14894e(true);
                        } catch (Throwable th) {
                            try {
                                nqfVar.mo8566a(th);
                            } finally {
                                nqfVar.mo14894e(false);
                            }
                        }
                    }
                });
                try {
                    nqfVarM17621g.get();
                    return;
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    throw new RuntimeException(e);
                } catch (ExecutionException e2) {
                    throw new RuntimeException(e2);
                }
        }
    }
}
