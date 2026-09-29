package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.token.TokenMeaning;
import com.lingq.shared.uimodel.token.TokenReadings;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import li.C7378e;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.f6 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1435f6 implements Callable<List<C7378e>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8463a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1576z5 f8464b;

    public CallableC1435f6(C1576z5 c1576z5, C6595o c6595o) {
        this.f8464b = c1576z5;
        this.f8463a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<C7378e> call() throws Exception {
        int i10;
        C1576z5 c1576z5 = this.f8464b;
        RoomDatabase roomDatabase = c1576z5.f9019a;
        C1405c0 c1405c0 = c1576z5.f9021c;
        roomDatabase.m4552c();
        try {
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8463a);
                try {
                    int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "term");
                    int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "id");
                    int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "status");
                    int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "importance");
                    int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "isPhrase");
                    int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "meanings");
                    int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "tags");
                    int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "gTags");
                    int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "romaji");
                    int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "hiragana");
                    int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "pinyin");
                    int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "hant");
                    try {
                        int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "hans");
                        ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                        while (cursorM16698S0.moveToNext()) {
                            String string = null;
                            TokenReadings tokenReadings = null;
                            String string2 = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                            int i11 = cursorM16698S0.getInt(iM16742n1);
                            String string3 = cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2);
                            int i12 = cursorM16698S0.getInt(iM16742n3);
                            boolean z10 = cursorM16698S0.getInt(iM16742n4) != 0;
                            List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(iM16742n5) ? null : cursorM16698S0.getString(iM16742n5));
                            List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n6) ? null : cursorM16698S0.getString(iM16742n6));
                            List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n7) ? null : cursorM16698S0.getString(iM16742n7));
                            if (cursorM16698S0.isNull(iM16742n8) && cursorM16698S0.isNull(iM16742n9) && cursorM16698S0.isNull(iM16742n10) && cursorM16698S0.isNull(iM16742n11)) {
                                i10 = iM16742n12;
                                if (!cursorM16698S0.isNull(i10)) {
                                }
                                C1405c0 c1405c1 = c1405c0;
                                arrayList.add(new C7378e(string2, z10, listM4992l, listM4992l2, listM5007r, i12, i11, string3, tokenReadings));
                                c1405c0 = c1405c1;
                                iM16742n12 = i10;
                            } else {
                                i10 = iM16742n12;
                            }
                            List listM4992l3 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n8) ? null : cursorM16698S0.getString(iM16742n8));
                            List listM4992l4 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n9) ? null : cursorM16698S0.getString(iM16742n9));
                            List listM4992l5 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n10) ? null : cursorM16698S0.getString(iM16742n10));
                            List listM4992l6 = C1405c0.m4992l(cursorM16698S0.isNull(iM16742n11) ? null : cursorM16698S0.getString(iM16742n11));
                            if (!cursorM16698S0.isNull(i10)) {
                                string = cursorM16698S0.getString(i10);
                            }
                            tokenReadings = new TokenReadings(listM4992l3, listM4992l4, listM4992l5, listM4992l6, C1405c0.m4992l(string), null);
                            C1405c0 c1405c2 = c1405c0;
                            arrayList.add(new C7378e(string2, z10, listM4992l, listM4992l2, listM5007r, i12, i11, string3, tokenReadings));
                            c1405c0 = c1405c2;
                            iM16742n12 = i10;
                        }
                        roomDatabase.m4568s();
                        cursorM16698S0.close();
                        roomDatabase.m4563n();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        cursorM16698S0.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                roomDatabase.m4563n();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            roomDatabase.m4563n();
            throw th;
        }
    }

    public final void finalize() {
        this.f8463a.m13198q();
    }
}
