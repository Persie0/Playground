package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.m4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1484m4 implements Callable<List<UserPlaylist>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8650a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8651b;

    public CallableC1484m4(C1560x3 c1560x3, C6595o c6595o) {
        this.f8651b = c1560x3;
        this.f8650a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<UserPlaylist> call() throws Exception {
        RoomDatabase roomDatabase = this.f8651b.f8940a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8650a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    String string = null;
                    String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                    String string3 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    if (!cursorM16698S0.isNull(2)) {
                        string = cursorM16698S0.getString(2);
                    }
                    arrayList.add(new UserPlaylist(string2, string3, string, cursorM16698S0.getInt(3), cursorM16698S0.getInt(4) != 0, cursorM16698S0.getInt(5) != 0));
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
        this.f8650a.m13198q();
    }
}
