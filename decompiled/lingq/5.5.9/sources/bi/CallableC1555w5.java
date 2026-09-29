package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p288o4.C7915a;
import p288o4.InterfaceC7919e;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.w5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1555w5 implements Callable<Integer> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7919e f8925a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1527s5 f8926b;

    public CallableC1555w5(C1527s5 c1527s5, C7915a c7915a) {
        this.f8926b = c1527s5;
        this.f8925a = c7915a;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Integer call() throws Exception {
        RoomDatabase roomDatabase = this.f8926b.f8829a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8925a);
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
}
