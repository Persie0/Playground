package bi;

import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;
import p367rh.C8788b;

/* JADX INFO: renamed from: bi.r */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1514r implements Callable<Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8788b f8807a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1493o f8808b;

    public CallableC1514r(C1493o c1493o, C8788b c8788b) {
        this.f8808b = c1493o;
        this.f8807a = c8788b;
    }

    @Override // java.util.concurrent.Callable
    public final Long call() throws Exception {
        C1493o c1493o = this.f8808b;
        RoomDatabase roomDatabase = c1493o.f8679a;
        RoomDatabase roomDatabase2 = c1493o.f8679a;
        roomDatabase.m4552c();
        try {
            long jM1227o = c1493o.f8685g.m1227o(this.f8807a);
            roomDatabase2.m4568s();
            return Long.valueOf(jM1227o);
        } finally {
            roomDatabase2.m4563n();
        }
    }
}
