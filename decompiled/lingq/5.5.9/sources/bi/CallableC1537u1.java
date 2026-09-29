package bi;

import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.u1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1537u1 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8870b;

    public CallableC1537u1(C1502p1 c1502p1, ArrayList arrayList) {
        this.f8870b = c1502p1;
        this.f8869a = arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1502p1 c1502p1 = this.f8870b;
        RoomDatabase roomDatabase = c1502p1.f8725a;
        roomDatabase.m4552c();
        try {
            c1502p1.f8735k.m1226n(this.f8869a);
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
