package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import fi.C5537a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.w */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1549w implements Callable<List<C5537a>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8910a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1493o f8911b;

    public CallableC1549w(C1493o c1493o, C6595o c6595o) {
        this.f8911b = c1493o;
        this.f8910a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<C5537a> call() throws Exception {
        RoomDatabase roomDatabase = this.f8911b.f8679a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8910a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    int i10 = cursorM16698S0.getInt(0);
                    String string = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    String string2 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    String string3 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                    String string4 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                    String string5 = cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5);
                    int i11 = cursorM16698S0.getInt(6);
                    String string6 = cursorM16698S0.isNull(7) ? null : cursorM16698S0.getString(7);
                    boolean z10 = cursorM16698S0.getInt(8) != 0;
                    boolean z11 = cursorM16698S0.getInt(9) != 0;
                    arrayList.add(new C5537a(i10, string, string2, i11, cursorM16698S0.getInt(11), string6, cursorM16698S0.getInt(10) != 0, z11, string4, string5, string3, z10, cursorM16698S0.getInt(12), cursorM16698S0.isNull(13) ? null : cursorM16698S0.getString(13)));
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
        this.f8910a.m13198q();
    }
}
