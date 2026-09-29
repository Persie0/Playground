package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.entity.Playlist;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.q4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1512q4 implements Callable<Playlist> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8803a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8804b;

    public CallableC1512q4(C1560x3 c1560x3, C6595o c6595o) {
        this.f8804b = c1560x3;
        this.f8803a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final Playlist call() throws Exception {
        RoomDatabase roomDatabase = this.f8804b.f8940a;
        C6595o c6595o = this.f8803a;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "nameWithLanguage");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "language");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "name");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "pk");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "isDefault");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "isFeatured");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "order");
            Playlist playlist = null;
            if (cursorM16698S0.moveToFirst()) {
                playlist = new Playlist(cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0), cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1), cursorM16698S0.isNull(iM16742n2) ? null : cursorM16698S0.getString(iM16742n2), cursorM16698S0.getInt(iM16742n3), cursorM16698S0.getInt(iM16742n4) != 0, cursorM16698S0.getInt(iM16742n5) != 0, cursorM16698S0.getInt(iM16742n6));
            }
            return playlist;
        } finally {
            cursorM16698S0.close();
            c6595o.m13198q();
        }
    }
}
