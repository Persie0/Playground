package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.l4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1477l4 implements Callable<List<UserPlaylist>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8598a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8599b;

    public CallableC1477l4(C1560x3 c1560x3, C6595o c6595o) {
        this.f8599b = c1560x3;
        this.f8598a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<UserPlaylist> call() throws Exception {
        RoomDatabase roomDatabase = this.f8599b.f8940a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8598a);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "nameWithLanguage");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "language");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "name");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "pk");
                int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "isDefault");
                int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "isFeatured");
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    arrayList.add(new UserPlaylist(cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0), cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1), cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2), cursorM16698S0.getInt(iM16742n3), cursorM16698S0.getInt(iM16742n4) != 0, cursorM16698S0.getInt(iM16742n5) != 0));
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
        this.f8598a.m13198q();
    }
}
