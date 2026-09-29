package bi;

import android.database.Cursor;
import java.util.concurrent.Callable;
import ki.C6695a;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.w1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1551w1 implements Callable<C6695a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8914a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8915b;

    public CallableC1551w1(C1502p1 c1502p1, C6595o c6595o) {
        this.f8915b = c1502p1;
        this.f8914a = c6595o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C6695a call() throws Exception {
        Cursor cursorM16698S0 = C8573r0.m16698S0(this.f8915b.f8725a, this.f8914a);
        try {
            String str = null;
            C6695a c6695a = str;
            if (cursorM16698S0.moveToFirst()) {
                c6695a = new C6695a(cursorM16698S0.isNull(0) ? null : Integer.valueOf(cursorM16698S0.getInt(0)), cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1), cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2), cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4), cursorM16698S0.isNull(5) ? str : cursorM16698S0.getString(5), cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3));
            }
            return c6695a;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8914a.m13198q();
    }
}
