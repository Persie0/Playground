package bi;

import androidx.room.RoomDatabase;
import java.util.List;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.w0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1550w0 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8912a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1543v0 f8913b;

    public CallableC1550w0(C1543v0 c1543v0, List list) {
        this.f8913b = c1543v0;
        this.f8912a = list;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1543v0 c1543v0 = this.f8913b;
        RoomDatabase roomDatabase = c1543v0.f8879a;
        roomDatabase.m4552c();
        try {
            c1543v0.f8883e.m1226n(this.f8912a);
            roomDatabase.m4568s();
            return C9072e.f47360a;
        } finally {
            roomDatabase.m4563n();
        }
    }
}
