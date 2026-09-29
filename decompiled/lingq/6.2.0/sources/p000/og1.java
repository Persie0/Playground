package p000;

import java.io.FileOutputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class og1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54301a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f54302b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f54303c;

    public /* synthetic */ og1(int i, Object obj, Object obj2) {
        this.f54301a = i;
        this.f54302b = obj;
        this.f54303c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f54301a) {
            case 0:
                qg1 qg1Var = (qg1) this.f54302b;
                sg1 sg1Var = (sg1) this.f54303c;
                fh1 fh1Var = qg1Var.f57744b;
                synchronized (fh1Var) {
                    FileOutputStream fileOutputStreamOpenFileOutput = fh1Var.f39101a.openFileOutput(fh1Var.f39102b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(sg1Var.f60805a.toString().getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th;
                    }
                }
                return null;
            default:
                bl2 bl2Var = (bl2) this.f54302b;
                ry2 ry2Var = (ry2) this.f54303c;
                CountDownLatch countDownLatch = (CountDownLatch) bl2Var.f8656b;
                try {
                    bl2Var.f8655a = ry2Var.call();
                    return null;
                } finally {
                    if (countDownLatch != null) {
                        countDownLatch.countDown();
                    }
                }
        }
    }
}
