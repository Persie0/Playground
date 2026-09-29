package bi;

import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1437g0 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8467a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1421e0 f8468b;

    public CallableC1437g0(C1421e0 c1421e0, ArrayList arrayList) {
        this.f8468b = c1421e0;
        this.f8467a = arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1421e0 c1421e0 = this.f8468b;
        RoomDatabase roomDatabase = c1421e0.f8386a;
        roomDatabase.m4552c();
        try {
            c1421e0.f8391f.m1226n(this.f8467a);
            roomDatabase.m4568s();
            C9072e c9072e = C9072e.f47360a;
            roomDatabase.m4563n();
            return c9072e;
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            throw th2;
        }
    }
}
