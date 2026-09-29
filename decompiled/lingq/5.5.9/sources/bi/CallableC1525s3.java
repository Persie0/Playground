package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p203ji.C6479a;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.s3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1525s3 implements Callable<List<C6479a>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8825a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1532t3 f8826b;

    public CallableC1525s3(C1532t3 c1532t3, C6595o c6595o) {
        this.f8826b = c1532t3;
        this.f8825a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<C6479a> call() throws Exception {
        RoomDatabase roomDatabase = this.f8826b.f8851a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8825a);
            try {
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    boolean z10 = false;
                    int i10 = cursorM16698S0.getInt(0);
                    String string = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                    String string2 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                    String string3 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                    String string4 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                    String string5 = cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5);
                    if (cursorM16698S0.getInt(6) != 0) {
                        z10 = true;
                    }
                    arrayList.add(new C6479a(i10, string3, string4, string5, string, string2, z10, cursorM16698S0.isNull(7) ? null : cursorM16698S0.getString(7)));
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
        this.f8825a.m13198q();
    }
}
