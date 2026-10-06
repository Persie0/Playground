package p000;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class caz implements Executor {

    /* JADX INFO: renamed from: a */
    public static final caz f4940a = new caz(4);

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f4941b;

    public caz(int i) {
        this.f4941b = i;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f4941b) {
            case 0:
                cbi.m3388i(runnable);
                break;
            case 1:
                runnable.run();
                break;
            case 2:
                runnable.run();
                break;
            case 3:
                runnable.run();
                break;
            default:
                runnable.getClass();
                runnable.run();
                break;
        }
    }
}
