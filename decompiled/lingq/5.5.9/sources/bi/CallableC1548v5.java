package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p288o4.C7915a;
import p288o4.InterfaceC7919e;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.v5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1548v5 implements Callable<List<Integer>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7919e f8908a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1527s5 f8909b;

    public CallableC1548v5(C1527s5 c1527s5, C7915a c7915a) {
        this.f8909b = c1527s5;
        this.f8908a = c7915a;
    }

    @Override // java.util.concurrent.Callable
    public final List<Integer> call() throws Exception {
        RoomDatabase roomDatabase = this.f8909b.f8829a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8908a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    arrayList.add(cursorM16698S0.isNull(0) ? null : Integer.valueOf(cursorM16698S0.getInt(0)));
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
