package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.token.TokenMeaning;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p159hi.C6054e;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.c6 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1411c6 implements Callable<List<C6054e>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8367a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1576z5 f8368b;

    public CallableC1411c6(C1576z5 c1576z5, C6595o c6595o) {
        this.f8368b = c1576z5;
        this.f8367a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<C6054e> call() throws Exception {
        C1576z5 c1576z5 = this.f8368b;
        RoomDatabase roomDatabase = c1576z5.f9019a;
        C1405c0 c1405c0 = c1576z5.f9021c;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8367a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                    int i10 = cursorM16698S0.getInt(1);
                    String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3));
                    List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4));
                    if (!cursorM16698S0.isNull(5)) {
                        string = cursorM16698S0.getString(5);
                    }
                    arrayList.add(new C6054e(string2, listM5007r, listM4992l, C1405c0.m4992l(string), i10, string3));
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
        this.f8367a.m13198q();
    }
}
