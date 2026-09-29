package bi;

import android.database.Cursor;
import java.util.concurrent.Callable;
import ki.C6695a;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.b3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1400b3 implements Callable<C6695a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8330a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f8331b;

    public CallableC1400b3(C1461j2 c1461j2, C6595o c6595o) {
        this.f8331b = c1461j2;
        this.f8330a = c6595o;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final C6695a call() throws Exception {
        Cursor cursorM16698S0 = C8573r0.m16698S0(this.f8331b.f8514a, this.f8330a);
        try {
            String str = null;
            C6695a c6695a = str;
            if (cursorM16698S0.moveToFirst()) {
                c6695a = new C6695a(cursorM16698S0.isNull(0) ? null : Integer.valueOf(cursorM16698S0.getInt(0)), cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1), cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2), cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3), cursorM16698S0.isNull(5) ? str : cursorM16698S0.getString(5), cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4));
            }
            return c6695a;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8330a.m13198q();
    }
}
