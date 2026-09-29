package bi;

import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.l */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1472l implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8577a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1404c f8578b;

    public CallableC1472l(C1404c c1404c, ArrayList arrayList) {
        this.f8578b = c1404c;
        this.f8577a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1404c c1404c = this.f8578b;
        RoomDatabase roomDatabase = c1404c.f8337a;
        roomDatabase.m4552c();
        try {
            c1404c.f8338b.m13170f(this.f8577a);
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
