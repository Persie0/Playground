package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.notification.UserNotice;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.q3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1511q3 implements Callable<List<UserNotice>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8801a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1504p3 f8802b;

    public CallableC1511q3(C1504p3 c1504p3, C6595o c6595o) {
        this.f8802b = c1504p3;
        this.f8801a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final List<UserNotice> call() throws Exception {
        RoomDatabase roomDatabase = this.f8802b.f8780a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8801a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    arrayList.add(new UserNotice(cursorM16698S0.getInt(0), cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1), cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3), cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2), cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4)));
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
        this.f8801a.m13198q();
    }
}
