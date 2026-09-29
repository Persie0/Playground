package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.g5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1442g5 implements Callable<List<LibraryItemCounter>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8477a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1426e5 f8478b;

    public CallableC1442g5(C1426e5 c1426e5, C6595o c6595o) {
        this.f8478b = c1426e5;
        this.f8477a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<LibraryItemCounter> call() throws Exception {
        RoomDatabase roomDatabase = this.f8478b.f8440a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8477a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    int i10 = cursorM16698S0.getInt(0);
                    boolean z10 = cursorM16698S0.getInt(1) != 0;
                    Double dValueOf = null;
                    Float fValueOf = cursorM16698S0.isNull(2) ? null : Float.valueOf(cursorM16698S0.getFloat(2));
                    Double dValueOf2 = cursorM16698S0.isNull(3) ? null : Double.valueOf(cursorM16698S0.getDouble(3));
                    if (!cursorM16698S0.isNull(4)) {
                        dValueOf = Double.valueOf(cursorM16698S0.getDouble(4));
                    }
                    arrayList.add(new LibraryItemCounter(i10, z10, fValueOf, dValueOf2, dValueOf, cursorM16698S0.getInt(5) != 0, cursorM16698S0.getFloat(6), cursorM16698S0.getInt(7), cursorM16698S0.getInt(11), cursorM16698S0.getInt(8), cursorM16698S0.getInt(9), cursorM16698S0.getInt(10), cursorM16698S0.getInt(12) != 0));
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
        this.f8477a.m13198q();
    }
}
