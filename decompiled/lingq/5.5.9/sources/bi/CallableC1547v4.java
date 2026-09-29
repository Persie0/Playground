package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import ki.C6698d;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.v4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1547v4 implements Callable<C6698d> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8906a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8907b;

    public CallableC1547v4(C1560x3 c1560x3, C6595o c6595o) {
        this.f8907b = c1560x3;
        this.f8906a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final C6698d call() throws Exception {
        C6698d c6698d;
        RoomDatabase roomDatabase = this.f8907b.f8940a;
        C6595o c6595o = this.f8906a;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
        try {
            if (cursorM16698S0.moveToFirst()) {
                boolean z10 = false;
                int i10 = cursorM16698S0.getInt(0);
                if (cursorM16698S0.getInt(1) != 0) {
                    z10 = true;
                }
                c6698d = new C6698d(i10, cursorM16698S0.getInt(2), z10);
            } else {
                c6698d = null;
            }
            cursorM16698S0.close();
            c6595o.m13198q();
            return c6698d;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            c6595o.m13198q();
            throw th2;
        }
    }
}
