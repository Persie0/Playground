package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.language.UserLanguage;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.x0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1557x0 implements Callable<List<UserLanguage>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8929a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1543v0 f8930b;

    public CallableC1557x0(C1543v0 c1543v0, C6595o c6595o) {
        this.f8930b = c1543v0;
        this.f8929a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<UserLanguage> call() throws Exception {
        C1543v0 c1543v0 = this.f8930b;
        RoomDatabase roomDatabase = c1543v0.f8879a;
        C1405c0 c1405c0 = c1543v0.f8881c;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8929a);
        try {
            ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
            while (cursorM16698S0.moveToNext()) {
                String string = null;
                String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                int i10 = cursorM16698S0.getInt(1);
                String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                int i11 = cursorM16698S0.getInt(3);
                String string4 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                int i12 = cursorM16698S0.getInt(5);
                String string5 = cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6);
                c1405c0.getClass();
                List listM4992l = C1405c0.m4992l(string5);
                boolean z10 = cursorM16698S0.getInt(7) != 0;
                String string6 = cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8);
                String string7 = cursorM16698S0.isNull(9) ? null : cursorM16698S0.getString(9);
                int i13 = cursorM16698S0.getInt(10);
                String string8 = cursorM16698S0.isNull(11) ? null : cursorM16698S0.getString(11);
                if (!cursorM16698S0.isNull(12)) {
                    string = cursorM16698S0.getString(12);
                }
                arrayList.add(new UserLanguage(string2, i10, string3, listM4992l, z10, string6, string7, i13, null, string8, null, string4, i12, i11, null, null, C1405c0.m4992l(string)));
            }
            return arrayList;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8929a.m13198q();
    }
}
