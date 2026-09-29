package bi;

import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.j1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1460j1 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8510a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1422e1 f8511b;

    public CallableC1460j1(C1422e1 c1422e1, ArrayList arrayList) {
        this.f8511b = c1422e1;
        this.f8510a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1422e1 c1422e1 = this.f8511b;
        RoomDatabase roomDatabase = c1422e1.f8402a;
        roomDatabase.m4552c();
        try {
            c1422e1.f8411j.m1226n(this.f8510a);
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
