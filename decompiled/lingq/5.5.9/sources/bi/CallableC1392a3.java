package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.a3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1392a3 implements Callable<Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8313a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f8314b;

    public CallableC1392a3(C1461j2 c1461j2, C6595o c6595o) {
        this.f8314b = c1461j2;
        this.f8313a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() throws Exception {
        RoomDatabase roomDatabase = this.f8314b.f8514a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8313a);
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
        this.f8313a.m13198q();
    }
}
