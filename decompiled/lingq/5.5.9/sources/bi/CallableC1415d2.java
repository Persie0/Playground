package bi;

import android.database.Cursor;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.d2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1415d2 implements Callable<Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8374a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8375b;

    public CallableC1415d2(C1502p1 c1502p1, C6595o c6595o) {
        this.f8375b = c1502p1;
        this.f8374a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Integer call() throws Exception {
        Cursor cursorM16698S0 = C8573r0.m16698S0(this.f8375b.f8725a, this.f8374a);
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
        this.f8374a.m13198q();
    }
}
