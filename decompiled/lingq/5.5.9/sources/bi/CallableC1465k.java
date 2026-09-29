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

/* JADX INFO: renamed from: bi.k */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1465k implements Callable<List<C6052c>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8565a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1404c f8566b;

    public CallableC1465k(C1404c c1404c, C6595o c6595o) {
        this.f8566b = c1404c;
        this.f8565a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<C6052c> call() throws Exception {
        C1404c c1404c = this.f8566b;
        RoomDatabase roomDatabase = c1404c.f8337a;
        C1405c0 c1405c0 = c1404c.f8340d;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8565a);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "term");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "status");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "extendedStatus");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "srsDueDate");
                int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "meanings");
                int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "tags");
                int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "gTags");
                int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "isPhrase");
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                    int i10 = cursorM16698S0.getInt(iM16742n1);
                    Integer numValueOf = cursorM16698S0.isNull(iM16742n2) ? null : Integer.valueOf(cursorM16698S0.getInt(iM16742n2));
                    String string3 = cursorM16698S0.isNull(iM16742n3) ? null : cursorM16698S0.getString(iM16742n3);
                    List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4));
                    List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getString(iM16742n5));
                    if (!cursorM16698S0.isNull(iM16742n6)) {
                        string = cursorM16698S0.getString(iM16742n6);
                    }
                    arrayList.add(new C6052c(string2, listM5007r, listM4992l, C1405c0.m4992l(string), cursorM16698S0.getInt(iM16742n7) != 0, i10, numValueOf, string3));
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
        this.f8565a.m13198q();
    }
}
