package p000;

import java.util.concurrent.Executor;
import java.util.logging.Logger;

/* JADX INFO: renamed from: qj */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorC0932qj implements Executor {

    /* JADX INFO: renamed from: e */
    private final /* synthetic */ int f47489e;

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ ExecutorC0932qj f47488d = new ExecutorC0932qj(5);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ ExecutorC0932qj f47487c = new ExecutorC0932qj(4);

    /* JADX INFO: renamed from: b */
    public static final /* synthetic */ ExecutorC0932qj f47486b = new ExecutorC0932qj(3);

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ ExecutorC0932qj f47485a = new ExecutorC0932qj(2);

    public ExecutorC0932qj(int i) {
        this.f47489e = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f47489e) {
            case 0:
                ((C0935qm) C0933qk.m19346b().f47492b).f47496b.execute(runnable);
                break;
            case 1:
                new Thread(runnable).start();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            case 4:
                runnable.run();
                break;
            default:
                Logger logger = kbl.f35533a;
                break;
        }
    }
}
