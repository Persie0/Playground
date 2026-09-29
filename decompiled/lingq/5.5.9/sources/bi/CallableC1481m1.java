package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.language.UserLanguageProgressChartEntry;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.m1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1481m1 implements Callable<List<UserLanguageProgressChartEntry>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8644a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1422e1 f8645b;

    public CallableC1481m1(C1422e1 c1422e1, C6595o c6595o) {
        this.f8645b = c1422e1;
        this.f8644a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<UserLanguageProgressChartEntry> call() throws Exception {
        RoomDatabase roomDatabase = this.f8645b.f8402a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8644a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                    String string3 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    if (!cursorM16698S0.isNull(2)) {
                        string = cursorM16698S0.getString(2);
                    }
                    arrayList.add(new UserLanguageProgressChartEntry(string2, string3, string, cursorM16698S0.getDouble(3), cursorM16698S0.getDouble(4)));
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
        this.f8644a.m13198q();
    }
}
