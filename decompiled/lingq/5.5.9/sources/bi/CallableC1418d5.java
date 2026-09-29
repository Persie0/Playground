package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.library.FastSearchData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.d5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1418d5 implements Callable<List<FastSearchData>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8380a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1426e5 f8381b;

    public CallableC1418d5(C1426e5 c1426e5, C6595o c6595o) {
        this.f8381b = c1426e5;
        this.f8380a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<FastSearchData> call() throws Exception {
        RoomDatabase roomDatabase = this.f8381b.f8440a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8380a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                    String string3 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    String string4 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    if (!cursorM16698S0.isNull(3)) {
                        string = cursorM16698S0.getString(3);
                    }
                    arrayList.add(new FastSearchData(string2, string3, string4, string, null));
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
        this.f8380a.m13198q();
    }
}
