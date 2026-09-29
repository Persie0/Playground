package bi;

import android.database.Cursor;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.k4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1470k4 implements Callable<Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8573a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8574b;

    public CallableC1470k4(C1560x3 c1560x3, C6595o c6595o) {
        this.f8574b = c1560x3;
        this.f8573a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Integer call() throws Exception {
        Cursor cursorM16698S0 = C8573r0.m16698S0(this.f8574b.f8940a, this.f8573a);
        try {
            Integer numValueOf = (!cursorM16698S0.moveToFirst() || cursorM16698S0.isNull(0)) ? null : Integer.valueOf(cursorM16698S0.getInt(0));
            cursorM16698S0.close();
            return numValueOf;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            throw th2;
        }
    }

    public final void finalize() {
        this.f8573a.m13198q();
    }
}
