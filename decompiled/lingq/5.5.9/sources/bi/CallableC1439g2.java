package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.library.CollectionsFilterUser;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.g2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1439g2 implements Callable<List<CollectionsFilterUser>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8473a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8474b;

    public CallableC1439g2(C1502p1 c1502p1, C6595o c6595o) {
        this.f8474b = c1502p1;
        this.f8473a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<CollectionsFilterUser> call() throws Exception {
        RoomDatabase roomDatabase = this.f8474b.f8725a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8473a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    int i10 = cursorM16698S0.getInt(0);
                    String string = null;
                    String string2 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    if (!cursorM16698S0.isNull(3)) {
                        string = cursorM16698S0.getString(3);
                    }
                    arrayList.add(new CollectionsFilterUser(string3, i10, string2, string));
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
        this.f8473a.m13198q();
    }
}
