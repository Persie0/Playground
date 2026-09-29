package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenReadings;
import java.util.List;
import java.util.concurrent.Callable;
import li.C7378e;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.b6 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1403b6 implements Callable<C7378e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8335a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1576z5 f8336b;

    public CallableC1403b6(C1576z5 c1576z5, C6595o c6595o) {
        this.f8336b = c1576z5;
        this.f8335a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final C7378e call() throws Exception {
        C7378e c7378e;
        TokenReadings tokenReadings;
        C1576z5 c1576z5 = this.f8336b;
        RoomDatabase roomDatabase = c1576z5.f9019a;
        C1405c0 c1405c0 = c1576z5.f9021c;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8335a);
        try {
            if (cursorM16698S0.moveToFirst()) {
                String string = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                int i10 = cursorM16698S0.getInt(1);
                String string2 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                int i11 = cursorM16698S0.getInt(3);
                boolean z10 = cursorM16698S0.getInt(4) != 0;
                List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5));
                List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6));
                List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(7) ? null : cursorM16698S0.getString(7));
                if (cursorM16698S0.isNull(8) && cursorM16698S0.isNull(9) && cursorM16698S0.isNull(10) && cursorM16698S0.isNull(11) && cursorM16698S0.isNull(12)) {
                    tokenReadings = null;
                } else {
                    tokenReadings = new TokenReadings(C1405c0.m4992l(cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8)), C1405c0.m4992l(cursorM16698S0.isNull(9) ? null : cursorM16698S0.getString(9)), C1405c0.m4992l(cursorM16698S0.isNull(10) ? null : cursorM16698S0.getString(10)), C1405c0.m4992l(cursorM16698S0.isNull(11) ? null : cursorM16698S0.getString(11)), C1405c0.m4992l(cursorM16698S0.isNull(12) ? null : cursorM16698S0.getString(12)), null);
                }
                c7378e = new C7378e(string, z10, listM4992l, listM4992l2, listM5007r, i11, i10, string2, tokenReadings);
            } else {
                c7378e = null;
            }
            return c7378e;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8335a.m13198q();
    }
}
