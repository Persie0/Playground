package bi;

import android.database.Cursor;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.y1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1565y1 implements Callable<String> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8995a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8996b;

    public CallableC1565y1(C1502p1 c1502p1, C6595o c6595o) {
        this.f8996b = c1502p1;
        this.f8995a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final String call() throws Exception {
        Cursor cursorM16698S0 = C8573r0.m16698S0(this.f8996b.f8725a, this.f8995a);
        try {
            return (!cursorM16698S0.moveToFirst() || cursorM16698S0.isNull(0)) ? null : cursorM16698S0.getString(0);
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8995a.m13198q();
    }
}
