package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class mpj implements Callable {

    /* JADX INFO: renamed from: a */
    private final /* synthetic */ int f41257a;

    public mpj(int i) {
        this.f41257a = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.f41257a) {
            case 0:
                try {
                    System.loadLibrary("speechenhancer_jni_avenhrealtimenative");
                    return true;
                } catch (Throwable th) {
                    return false;
                }
            default:
                return Thread.currentThread();
        }
    }
}
