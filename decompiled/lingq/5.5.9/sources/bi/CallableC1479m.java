package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p367rh.C8787a;
import sl.C9072e;

/* JADX INFO: renamed from: bi.m */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1479m implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8787a f8619a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1404c f8620b;

    public CallableC1479m(C1404c c1404c, C8787a c8787a) {
        this.f8620b = c1404c;
        this.f8619a = c8787a;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1404c c1404c = this.f8620b;
        RoomDatabase roomDatabase = c1404c.f8337a;
        roomDatabase.m4552c();
        try {
            c1404c.f8339c.m13169e(this.f8619a);
            roomDatabase.m4568s();
            return C9072e.f47360a;
        } finally {
            roomDatabase.m4563n();
        }
    }
}
