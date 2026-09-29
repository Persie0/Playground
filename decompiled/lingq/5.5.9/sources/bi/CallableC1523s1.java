package bi;

import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.s1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1523s1 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8821a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8822b;

    public CallableC1523s1(C1502p1 c1502p1, ArrayList arrayList) {
        this.f8822b = c1502p1;
        this.f8821a = arrayList;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1502p1 c1502p1 = this.f8822b;
        RoomDatabase roomDatabase = c1502p1.f8725a;
        roomDatabase.m4552c();
        try {
            c1502p1.f8730f.m1226n(this.f8821a);
            roomDatabase.m4568s();
            return C9072e.f47360a;
        } finally {
            roomDatabase.m4563n();
        }
    }
}
