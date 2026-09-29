package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p181ii.C6334c;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.z2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1573z2 implements Callable<List<C6334c>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f9010a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f9011b;

    public CallableC1573z2(C1461j2 c1461j2, C6595o c6595o) {
        this.f9011b = c1461j2;
        this.f9010a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final List<C6334c> call() throws Exception {
        RoomDatabase roomDatabase = this.f9011b.f8514a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f9010a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    boolean z10 = false;
                    int i10 = cursorM16698S0.getInt(0);
                    if (cursorM16698S0.getInt(1) != 0) {
                        z10 = true;
                    }
                    arrayList.add(new C6334c(i10, cursorM16698S0.getInt(2), z10));
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
        this.f9010a.m13198q();
    }
}
