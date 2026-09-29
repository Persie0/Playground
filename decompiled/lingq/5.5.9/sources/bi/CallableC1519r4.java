package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.r4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1519r4 implements Callable<Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8815a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8816b;

    public CallableC1519r4(C1560x3 c1560x3, C6595o c6595o) {
        this.f8816b = c1560x3;
        this.f8815a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Integer call() throws Exception {
        RoomDatabase roomDatabase = this.f8816b.f8940a;
        C6595o c6595o = this.f8815a;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
        try {
            Integer numValueOf = (!cursorM16698S0.moveToFirst() || cursorM16698S0.isNull(0)) ? null : Integer.valueOf(cursorM16698S0.getInt(0));
            cursorM16698S0.close();
            c6595o.m13198q();
            return numValueOf;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            c6595o.m13198q();
            throw th2;
        }
    }
}
