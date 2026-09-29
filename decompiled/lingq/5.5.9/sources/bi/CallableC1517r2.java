package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.library.LibraryShelf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.r2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1517r2 implements Callable<List<LibraryShelf>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8813a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f8814b;

    public CallableC1517r2(C1461j2 c1461j2, C6595o c6595o) {
        this.f8814b = c1461j2;
        this.f8813a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<LibraryShelf> call() throws Exception {
        C1461j2 c1461j2 = this.f8814b;
        RoomDatabase roomDatabase = c1461j2.f8514a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8813a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    arrayList.add(new LibraryShelf(cursorM16698S0.getInt(0) != 0, c1461j2.f8522i.m5001k(cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1)), cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2), cursorM16698S0.getInt(3), cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4), cursorM16698S0.getInt(5)));
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
        this.f8813a.m13198q();
    }
}
