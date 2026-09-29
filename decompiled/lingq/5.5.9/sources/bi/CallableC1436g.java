package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.token.TokenMeaning;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p159hi.C6052c;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.g */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1436g implements Callable<List<C6052c>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8465a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1404c f8466b;

    public CallableC1436g(C1404c c1404c, C6595o c6595o) {
        this.f8466b = c1404c;
        this.f8465a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<C6052c> call() throws Exception {
        C1404c c1404c = this.f8466b;
        RoomDatabase roomDatabase = c1404c.f8337a;
        C1405c0 c1405c0 = c1404c.f8340d;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8465a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                    int i10 = cursorM16698S0.getInt(1);
                    Integer numValueOf = cursorM16698S0.isNull(2) ? null : Integer.valueOf(cursorM16698S0.getInt(2));
                    String string3 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                    List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4));
                    List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5));
                    if (!cursorM16698S0.isNull(6)) {
                        string = cursorM16698S0.getString(6);
                    }
                    arrayList.add(new C6052c(string2, listM5007r, listM4992l, C1405c0.m4992l(string), cursorM16698S0.getInt(7) != 0, i10, numValueOf, string3));
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
        this.f8465a.m13198q();
    }
}
