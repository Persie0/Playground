package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.UserMilestone;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.n3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1490n3 implements Callable<List<UserMilestone>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8658a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1476l3 f8659b;

    public CallableC1490n3(C1476l3 c1476l3, C6595o c6595o) {
        this.f8659b = c1476l3;
        this.f8658a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final List<UserMilestone> call() throws Exception {
        C6595o c6595o = this.f8658a;
        RoomDatabase roomDatabase = this.f8659b.f8586a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                    String string3 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    int i10 = cursorM16698S0.getInt(2);
                    if (!cursorM16698S0.isNull(3)) {
                        string = cursorM16698S0.getString(3);
                    }
                    arrayList.add(new UserMilestone(string2, i10, string3, string));
                }
                roomDatabase.m4568s();
                cursorM16698S0.close();
                c6595o.m13198q();
                roomDatabase.m4563n();
                return arrayList;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th2;
            }
        } catch (Throwable th3) {
            roomDatabase.m4563n();
            throw th3;
        }
    }
}
