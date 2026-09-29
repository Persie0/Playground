package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p367rh.C8805s;
import sl.C9072e;

/* JADX INFO: renamed from: bi.d4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1417d4 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8805s f8378a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8379b;

    public CallableC1417d4(C1560x3 c1560x3, C8805s c8805s) {
        this.f8379b = c1560x3;
        this.f8378a = c8805s;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1560x3 c1560x3 = this.f8379b;
        RoomDatabase roomDatabase = c1560x3.f8940a;
        RoomDatabase roomDatabase2 = c1560x3.f8940a;
        roomDatabase.m4552c();
        try {
            c1560x3.f8937J.m1225m(this.f8378a);
            roomDatabase2.m4568s();
            C9072e c9072e = C9072e.f47360a;
            roomDatabase2.m4563n();
            return c9072e;
        } catch (Throwable th2) {
            roomDatabase2.m4563n();
            throw th2;
        }
    }
}
