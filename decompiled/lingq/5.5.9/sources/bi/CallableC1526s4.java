package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.playlist.UserPlaylist;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.s4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1526s4 implements Callable<UserPlaylist> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8827a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8828b;

    public CallableC1526s4(C1560x3 c1560x3, C6595o c6595o) {
        this.f8828b = c1560x3;
        this.f8827a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final UserPlaylist call() throws Exception {
        RoomDatabase roomDatabase = this.f8828b.f8940a;
        C6595o c6595o = this.f8827a;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
        try {
            UserPlaylist userPlaylist = null;
            if (cursorM16698S0.moveToFirst()) {
                userPlaylist = new UserPlaylist(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0), cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1), cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2), cursorM16698S0.getInt(3), cursorM16698S0.getInt(4) != 0, cursorM16698S0.getInt(5) != 0);
            }
            cursorM16698S0.close();
            c6595o.m13198q();
            return userPlaylist;
        } catch (Throwable th2) {
            cursorM16698S0.close();
            c6595o.m13198q();
            throw th2;
        }
    }
}
