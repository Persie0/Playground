package bi;

import android.database.Cursor;
import gi.C5804b;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.n1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1488n1 implements Callable<C5804b> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8654a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1422e1 f8655b;

    public CallableC1488n1(C1422e1 c1422e1, C6595o c6595o) {
        this.f8655b = c1422e1;
        this.f8654a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final C5804b call() throws Exception {
        Cursor cursorM16698S0 = C8573r0.m16698S0(this.f8655b.f8402a, this.f8654a);
        try {
            C5804b c5804b = null;
            String string = null;
            if (cursorM16698S0.moveToFirst()) {
                if (!cursorM16698S0.isNull(0)) {
                    string = cursorM16698S0.getString(0);
                }
                c5804b = new C5804b(string, cursorM16698S0.getInt(2), cursorM16698S0.getInt(3) != 0, cursorM16698S0.getDouble(1));
            }
            cursorM16698S0.close();
            return c5804b;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            throw th2;
        }
    }

    public final void finalize() {
        this.f8654a.m13198q();
    }
}
