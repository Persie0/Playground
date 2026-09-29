package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.UserReferral;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.a5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1394a5 implements Callable<List<UserReferral>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8318a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1575z4 f8319b;

    public CallableC1394a5(C1575z4 c1575z4, C6595o c6595o) {
        this.f8319b = c1575z4;
        this.f8318a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<UserReferral> call() throws Exception {
        RoomDatabase roomDatabase = this.f8319b.f9015a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8318a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    arrayList.add(new UserReferral(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0)));
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
        this.f8318a.m13198q();
    }
}
