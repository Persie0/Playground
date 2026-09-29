package bi;

import android.database.Cursor;
import java.util.concurrent.Callable;
import ki.C6698d;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.u4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1540u4 implements Callable<C6698d> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8873a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8874b;

    public CallableC1540u4(C1560x3 c1560x3, C6595o c6595o) {
        this.f8874b = c1560x3;
        this.f8873a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C6698d call() throws Exception {
        C6698d c6698d;
        Cursor cursorM16698S0 = C8573r0.m16698S0(this.f8874b.f8940a, this.f8873a);
        try {
            if (cursorM16698S0.moveToFirst()) {
                boolean z10 = false;
                int i10 = cursorM16698S0.getInt(0);
                if (cursorM16698S0.getInt(1) != 0) {
                    z10 = true;
                }
                c6698d = new C6698d(i10, cursorM16698S0.getInt(2), z10);
            } else {
                c6698d = null;
            }
            return c6698d;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8873a.m13198q();
    }
}
