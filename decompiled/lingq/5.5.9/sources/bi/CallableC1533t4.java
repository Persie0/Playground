package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import ki.C6698d;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.t4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1533t4 implements Callable<List<C6698d>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8861a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8862b;

    public CallableC1533t4(C1560x3 c1560x3, C6595o c6595o) {
        this.f8862b = c1560x3;
        this.f8861a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<C6698d> call() throws Exception {
        RoomDatabase roomDatabase = this.f8862b.f8940a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8861a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    boolean z10 = false;
                    int i10 = cursorM16698S0.getInt(0);
                    if (cursorM16698S0.getInt(1) != 0) {
                        z10 = true;
                    }
                    arrayList.add(new C6698d(i10, cursorM16698S0.getInt(2), z10));
                }
                roomDatabase.m4568s();
                cursorM16698S0.close();
                roomDatabase.m4563n();
                return arrayList;
            } finally {
                cursorM16698S0.close();
            }
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            throw th2;
        }
    }

    public final void finalize() {
        this.f8861a.m13198q();
    }
}
