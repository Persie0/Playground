package bi;

import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.n2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1489n2 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8656a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f8657b;

    public CallableC1489n2(C1461j2 c1461j2, ArrayList arrayList) {
        this.f8657b = c1461j2;
        this.f8656a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1461j2 c1461j2 = this.f8657b;
        RoomDatabase roomDatabase = c1461j2.f8514a;
        roomDatabase.m4552c();
        try {
            c1461j2.f8523j.m1226n(this.f8656a);
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
