package bi;

import android.database.Cursor;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.i */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1451i implements Callable<Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8494a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1404c f8495b;

    public CallableC1451i(C1404c c1404c, C6595o c6595o) {
        this.f8495b = c1404c;
        this.f8494a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Integer call() throws Exception {
        Cursor cursorM16698S0 = C8573r0.m16698S0(this.f8495b.f8337a, this.f8494a);
        try {
            return (!cursorM16698S0.moveToFirst() || cursorM16698S0.isNull(0)) ? null : Integer.valueOf(cursorM16698S0.getInt(0));
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8494a.m13198q();
    }
}
