package bi;

import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.v1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1544v1 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8902a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8903b;

    public CallableC1544v1(C1502p1 c1502p1, ArrayList arrayList) {
        this.f8903b = c1502p1;
        this.f8902a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1502p1 c1502p1 = this.f8903b;
        RoomDatabase roomDatabase = c1502p1.f8725a;
        roomDatabase.m4552c();
        try {
            c1502p1.f8724H.m1226n(this.f8902a);
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
