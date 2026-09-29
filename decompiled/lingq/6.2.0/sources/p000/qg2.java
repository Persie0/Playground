package p000;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class qg2 implements Executor {

    /* JADX INFO: renamed from: b */
    public static final qg2 f57746b = new qg2(0);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ qg2 f57747c = new qg2(1);

    /* JADX INFO: renamed from: d */
    public static final /* synthetic */ qg2 f57748d = new qg2(3);

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57749a;

    public /* synthetic */ qg2(int i) {
        this.f57749a = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f57749a) {
            case 0:
                runnable.run();
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                new Thread(runnable).start();
                break;
            case 3:
                runnable.run();
                break;
            default:
                runnable.run();
                break;
        }
    }
}
