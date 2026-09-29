package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;
import p367rh.C8805s;

/* JADX INFO: renamed from: bi.e4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1425e4 implements Callable<C8805s> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8438a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8439b;

    public CallableC1425e4(C1560x3 c1560x3, C6595o c6595o) {
        this.f8439b = c1560x3;
        this.f8438a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final C8805s call() throws Exception {
        C6595o c6595o = this.f8438a;
        RoomDatabase roomDatabase = this.f8439b.f8940a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "nameWithLanguage");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "language");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "contentId");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "order");
                int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "isCourse");
                C8805s c8805s = null;
                if (cursorM16698S0.moveToFirst()) {
                    c8805s = new C8805s(cursorM16698S0.getInt(iM16742n2), cursorM16698S0.isNull(iM16742n3) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n3)), cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0), cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1), cursorM16698S0.getInt(iM16742n4) != 0);
                }
                roomDatabase.m4568s();
                cursorM16698S0.close();
                c6595o.m13198q();
                roomDatabase.m4563n();
                return c8805s;
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
