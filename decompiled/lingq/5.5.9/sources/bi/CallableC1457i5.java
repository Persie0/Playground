package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.token.TokenRelatedPhrase;
import dm.C5207g;
import java.util.List;
import java.util.concurrent.Callable;
import li.C7377d;
import p213k4.C6595o;
import p338qd.C8573r0;
import tk.C9312p;

/* JADX INFO: renamed from: bi.i5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1457i5 implements Callable<C7377d> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8504a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1478l5 f8505b;

    public CallableC1457i5(C1478l5 c1478l5, C6595o c6595o) {
        this.f8505b = c1478l5;
        this.f8504a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C7377d call() throws Exception {
        C1478l5 c1478l5 = this.f8505b;
        RoomDatabase roomDatabase = c1478l5.f8600a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8504a);
            try {
                C7377d c7377d = null;
                String string = null;
                if (cursorM16698S0.moveToFirst()) {
                    if (!cursorM16698S0.isNull(0)) {
                        string = cursorM16698S0.getString(0);
                    }
                    C1405c0 c1405c0 = c1478l5.f8602c;
                    c1405c0.getClass();
                    C5207g.m11111f(string, "data");
                    Object objM10532b = c1405c0.f8356a.m10564b(C9312p.m17659d(List.class, TokenRelatedPhrase.class)).m10532b(string);
                    C5207g.m11108c(objM10532b);
                    c7377d = new C7377d((List) objM10532b);
                }
                roomDatabase.m4568s();
                cursorM16698S0.close();
                roomDatabase.m4563n();
                return c7377d;
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
        this.f8504a.m13198q();
    }
}
