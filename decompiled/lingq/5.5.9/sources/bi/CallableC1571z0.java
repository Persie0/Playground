package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.language.UserLanguage;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1571z0 implements Callable<UserLanguage> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f9006a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1543v0 f9007b;

    public CallableC1571z0(C1543v0 c1543v0, C6595o c6595o) {
        this.f9007b = c1543v0;
        this.f9006a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final UserLanguage call() throws Exception {
        C1543v0 c1543v0 = this.f9007b;
        RoomDatabase roomDatabase = c1543v0.f8879a;
        C1405c0 c1405c0 = c1543v0.f8881c;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f9006a);
        try {
            UserLanguage userLanguage = null;
            if (cursorM16698S0.moveToFirst()) {
                String string = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                int i10 = cursorM16698S0.getInt(1);
                String string2 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                int i11 = cursorM16698S0.getInt(3);
                String string3 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                int i12 = cursorM16698S0.getInt(5);
                String string4 = cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6);
                c1405c0.getClass();
                userLanguage = new UserLanguage(string, i10, string2, C1405c0.m4992l(string4), cursorM16698S0.getInt(7) != 0, cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8), cursorM16698S0.isNull(9) ? null : cursorM16698S0.getString(9), cursorM16698S0.getInt(10), null, cursorM16698S0.isNull(11) ? null : cursorM16698S0.getString(11), null, string3, i12, i11, cursorM16698S0.isNull(13) ? null : cursorM16698S0.getString(13), cursorM16698S0.isNull(14) ? null : cursorM16698S0.getString(14), C1405c0.m4992l(cursorM16698S0.isNull(12) ? null : cursorM16698S0.getString(12)));
            }
            return userLanguage;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f9006a.m13198q();
    }
}
