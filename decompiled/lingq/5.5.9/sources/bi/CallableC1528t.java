package bi;

import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.t */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1528t implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8845a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1493o f8846b;

    public CallableC1528t(C1493o c1493o, ArrayList arrayList) {
        this.f8846b = c1493o;
        this.f8845a = arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1493o c1493o = this.f8846b;
        RoomDatabase roomDatabase = c1493o.f8679a;
        roomDatabase.m4552c();
        try {
            c1493o.f8688j.m1226n(this.f8845a);
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
