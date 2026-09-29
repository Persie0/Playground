package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import fi.C5539c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.b0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1397b0 implements Callable<List<C5539c>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8324a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1493o f8325b;

    public CallableC1397b0(C1493o c1493o, C6595o c6595o) {
        this.f8325b = c1493o;
        this.f8324a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<C5539c> call() throws Exception {
        RoomDatabase roomDatabase = this.f8325b.f8679a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8324a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    arrayList.add(new C5539c(cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0), cursorM16698S0.getDouble(1), cursorM16698S0.getDouble(2), cursorM16698S0.getDouble(3)));
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
        this.f8324a.m13198q();
    }
}
