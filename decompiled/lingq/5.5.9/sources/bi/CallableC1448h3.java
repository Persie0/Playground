package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p367rh.C8797k;
import sl.C9072e;

/* JADX INFO: renamed from: bi.h3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1448h3 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8797k f8490a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1462j3 f8491b;

    public CallableC1448h3(C1462j3 c1462j3, C8797k c8797k) {
        this.f8491b = c1462j3;
        this.f8490a = c8797k;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1462j3 c1462j3 = this.f8491b;
        RoomDatabase roomDatabase = c1462j3.f8554a;
        RoomDatabase roomDatabase2 = c1462j3.f8554a;
        roomDatabase.m4552c();
        try {
            c1462j3.f8556c.m1225m(this.f8490a);
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
