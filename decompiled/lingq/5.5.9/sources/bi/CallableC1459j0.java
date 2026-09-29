package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p264mi.C7565e;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.j0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1459j0 implements Callable<List<C7565e>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1421e0 f8509b;

    public CallableC1459j0(C1421e0 c1421e0, C6595o c6595o) {
        this.f8509b = c1421e0;
        this.f8508a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final List<C7565e> call() throws Exception {
        RoomDatabase roomDatabase = this.f8509b.f8386a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8508a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    arrayList.add(new C7565e(cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1), cursorM16698S0.getInt(0)));
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
        this.f8508a.m13198q();
    }
}
