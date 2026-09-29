package bi;

import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.u */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1535u implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ List f8865a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1493o f8866b;

    public CallableC1535u(C1493o c1493o, ArrayList arrayList) {
        this.f8866b = c1493o;
        this.f8865a = arrayList;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1493o c1493o = this.f8866b;
        RoomDatabase roomDatabase = c1493o.f8679a;
        roomDatabase.m4552c();
        try {
            c1493o.f8689k.m1226n(this.f8865a);
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
