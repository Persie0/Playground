package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import ki.C6696b;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.h4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1449h4 implements Callable<List<C6696b>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8492a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8493b;

    public CallableC1449h4(C1560x3 c1560x3, C6595o c6595o) {
        this.f8493b = c1560x3;
        this.f8492a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<C6696b> call() throws Exception {
        RoomDatabase roomDatabase = this.f8493b.f8940a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8492a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    arrayList.add(new C6696b(cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1), cursorM16698S0.getInt(0), cursorM16698S0.getInt(2)));
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
        this.f8492a.m13198q();
    }
}
