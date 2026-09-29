package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p367rh.C8794h;
import sl.C9072e;

/* JADX INFO: renamed from: bi.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1487n0 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8794h f8652a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1480m0 f8653b;

    public CallableC1487n0(C1480m0 c1480m0, C8794h c8794h) {
        this.f8653b = c1480m0;
        this.f8652a = c8794h;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1480m0 c1480m0 = this.f8653b;
        RoomDatabase roomDatabase = c1480m0.f8621a;
        RoomDatabase roomDatabase2 = c1480m0.f8621a;
        roomDatabase.m4552c();
        try {
            c1480m0.f8626f.m1225m(this.f8652a);
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
