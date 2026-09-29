package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.language.UserDictionaryLocale;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1522s0 implements Callable<List<UserDictionaryLocale>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8819a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1480m0 f8820b;

    public CallableC1522s0(C1480m0 c1480m0, C6595o c6595o) {
        this.f8820b = c1480m0;
        this.f8819a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<UserDictionaryLocale> call() throws Exception {
        RoomDatabase roomDatabase = this.f8820b.f8621a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8819a);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "code");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "title");
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    if (!cursorM16698S0.isNull(iM16742n1)) {
                        string = cursorM16698S0.getString(iM16742n1);
                    }
                    arrayList.add(new UserDictionaryLocale(string2, string));
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
        this.f8819a.m13198q();
    }
}
