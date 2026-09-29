package bi;

import android.database.Cursor;
import gi.C5803a;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.b1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1398b1 implements Callable<C5803a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8326a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1543v0 f8327b;

    public CallableC1398b1(C1543v0 c1543v0, C6595o c6595o) {
        this.f8327b = c1543v0;
        this.f8326a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final C5803a call() throws Exception {
        C1543v0 c1543v0 = this.f8327b;
        Cursor cursorM16698S0 = C8573r0.m16698S0(c1543v0.f8879a, this.f8326a);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "code");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "tags");
            C5803a c5803a = null;
            String string = null;
            if (cursorM16698S0.moveToFirst()) {
                String string2 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                if (!cursorM16698S0.isNull(iM16742n1)) {
                    string = cursorM16698S0.getString(iM16742n1);
                }
                c1543v0.f8881c.getClass();
                c5803a = new C5803a(C1405c0.m4992l(string), string2);
            }
            cursorM16698S0.close();
            return c5803a;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            throw th2;
        }
    }

    public final void finalize() {
        this.f8326a.m13198q();
    }
}
