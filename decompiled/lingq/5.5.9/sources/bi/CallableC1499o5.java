package bi;

import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.o5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1499o5 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8716a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1492n5 f8717b;

    public CallableC1499o5(C1492n5 c1492n5, ArrayList arrayList) {
        this.f8717b = c1492n5;
        this.f8716a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1492n5 c1492n5 = this.f8717b;
        RoomDatabase roomDatabase = c1492n5.f8662a;
        roomDatabase.m4552c();
        try {
            c1492n5.f8666e.m1226n(this.f8716a);
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
