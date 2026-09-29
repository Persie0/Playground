package bi;

import android.database.Cursor;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.e2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1423e2 implements Callable<Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8434a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8435b;

    public CallableC1423e2(C1502p1 c1502p1, C6595o c6595o) {
        this.f8435b = c1502p1;
        this.f8434a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() throws Exception {
        Cursor cursorM16698S0 = C8573r0.m16698S0(this.f8435b.f8725a, this.f8434a);
        try {
            return (!cursorM16698S0.moveToFirst() || cursorM16698S0.isNull(0)) ? null : Integer.valueOf(cursorM16698S0.getInt(0));
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8434a.m13198q();
    }
}
