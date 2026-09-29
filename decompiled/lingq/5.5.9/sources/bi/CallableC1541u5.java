package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.token.TokenMeaning;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p264mi.C7563c;
import p288o4.C7915a;
import p288o4.InterfaceC7919e;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.u5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1541u5 implements Callable<List<C7563c>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7919e f8875a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1527s5 f8876b;

    public CallableC1541u5(C1527s5 c1527s5, C7915a c7915a) {
        this.f8876b = c1527s5;
        this.f8875a = c7915a;
    }

    @Override // java.util.concurrent.Callable
    public final List<C7563c> call() throws Exception {
        List<TokenMeaning> listM5007r;
        List listM4992l;
        List listM4992l2;
        C1527s5 c1527s5 = this.f8876b;
        RoomDatabase roomDatabase = c1527s5.f8829a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8875a);
            try {
                int iM16739m0 = C8573r0.m16739m0(cursorM16698S0, "id");
                int iM16739m1 = C8573r0.m16739m0(cursorM16698S0, "term");
                int iM16739m2 = C8573r0.m16739m0(cursorM16698S0, "status");
                int iM16739m3 = C8573r0.m16739m0(cursorM16698S0, "extendedStatus");
                int iM16739m4 = C8573r0.m16739m0(cursorM16698S0, "isPhrase");
                int iM16739m5 = C8573r0.m16739m0(cursorM16698S0, "meanings");
                int iM16739m6 = C8573r0.m16739m0(cursorM16698S0, "tags");
                int iM16739m7 = C8573r0.m16739m0(cursorM16698S0, "gTags");
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    boolean z10 = false;
                    int i10 = iM16739m0 == -1 ? 0 : cursorM16698S0.getInt(iM16739m0);
                    String string = (iM16739m1 == -1 || cursorM16698S0.isNull(iM16739m1)) ? null : cursorM16698S0.getString(iM16739m1);
                    int i11 = iM16739m2 == -1 ? 0 : cursorM16698S0.getInt(iM16739m2);
                    int i12 = iM16739m3 == -1 ? 0 : cursorM16698S0.getInt(iM16739m3);
                    if (iM16739m4 != -1 && cursorM16698S0.getInt(iM16739m4) != 0) {
                        z10 = true;
                    }
                    boolean z11 = z10;
                    C1405c0 c1405c0 = c1527s5.f8830b;
                    if (iM16739m5 == -1) {
                        listM5007r = null;
                    } else {
                        listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(iM16739m5) ? null : cursorM16698S0.getString(iM16739m5));
                    }
                    if (iM16739m6 == -1) {
                        listM4992l = null;
                    } else {
                        String string2 = cursorM16698S0.isNull(iM16739m6) ? null : cursorM16698S0.getString(iM16739m6);
                        c1405c0.getClass();
                        listM4992l = C1405c0.m4992l(string2);
                    }
                    if (iM16739m7 == -1) {
                        listM4992l2 = null;
                    } else {
                        String string3 = cursorM16698S0.isNull(iM16739m7) ? null : cursorM16698S0.getString(iM16739m7);
                        c1405c0.getClass();
                        listM4992l2 = C1405c0.m4992l(string3);
                    }
                    arrayList.add(new C7563c(i10, string, i11, i12, z11, listM5007r, listM4992l, listM4992l2));
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
}
