package bi;

import android.database.Cursor;
import java.util.concurrent.Callable;
import p159hi.C6050a;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1572z1 implements Callable<C6050a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f9008a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f9009b;

    public CallableC1572z1(C1502p1 c1502p1, C6595o c6595o) {
        this.f9009b = c1502p1;
        this.f9008a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final C6050a call() throws Exception {
        Cursor cursorM16698S0 = C8573r0.m16698S0(this.f9009b.f8725a, this.f9008a);
        try {
            C6050a c6050a = null;
            if (cursorM16698S0.moveToFirst()) {
                int i10 = cursorM16698S0.getInt(0);
                String string = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                String string2 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                String string3 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                int i11 = cursorM16698S0.getInt(4);
                String string4 = cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5);
                c6050a = new C6050a(i10, cursorM16698S0.isNull(6) ? null : Integer.valueOf(cursorM16698S0.getInt(6)), i11, string4, cursorM16698S0.getDouble(7), cursorM16698S0.getDouble(8), cursorM16698S0.getInt(11) != 0, cursorM16698S0.getInt(9) != 0, string, string2, cursorM16698S0.isNull(12) ? null : cursorM16698S0.getString(12), string3, cursorM16698S0.getInt(10));
            }
            return c6050a;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f9008a.m13198q();
    }
}
