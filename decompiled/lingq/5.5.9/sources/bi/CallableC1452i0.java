package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p264mi.C7564d;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.i0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1452i0 implements Callable<List<C7564d>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8496a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1421e0 f8497b;

    public CallableC1452i0(C1421e0 c1421e0, C6595o c6595o) {
        this.f8497b = c1421e0;
        this.f8496a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final List<C7564d> call() throws Exception {
        RoomDatabase roomDatabase = this.f8497b.f8386a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8496a);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "title");
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    arrayList.add(new C7564d(cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1), cursorM16698S0.getInt(iM16742n0)));
                }
                roomDatabase.m4568s();
                cursorM16698S0.close();
                roomDatabase.m4563n();
                return arrayList;
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
        this.f8496a.m13198q();
    }
}
