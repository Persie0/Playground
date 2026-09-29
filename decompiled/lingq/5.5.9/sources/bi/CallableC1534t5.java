package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.t5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1534t5 implements Callable<Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8863a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1527s5 f8864b;

    public CallableC1534t5(C1527s5 c1527s5, C6595o c6595o) {
        this.f8864b = c1527s5;
        this.f8863a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Integer call() throws Exception {
        RoomDatabase roomDatabase = this.f8864b.f8829a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8863a);
            try {
                Integer numValueOf = (!cursorM16698S0.moveToFirst() || cursorM16698S0.isNull(0)) ? null : Integer.valueOf(cursorM16698S0.getInt(0));
                roomDatabase.m4568s();
                cursorM16698S0.close();
                roomDatabase.m4563n();
                return numValueOf;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                throw th2;
            }
        } catch (Throwable th3) {
            roomDatabase.m4563n();
            throw th3;
        }
    }

    public final void finalize() {
        this.f8863a.m13198q();
    }
}
