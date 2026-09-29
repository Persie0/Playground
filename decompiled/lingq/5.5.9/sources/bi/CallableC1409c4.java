package bi;

import androidx.room.RoomDatabase;
import com.lingq.entity.Playlist;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bi.c4 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1409c4 implements Callable<Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Playlist f8363a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1560x3 f8364b;

    public CallableC1409c4(C1560x3 c1560x3, Playlist playlist) {
        this.f8364b = c1560x3;
        this.f8363a = playlist;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Long call() throws Exception {
        C1560x3 c1560x3 = this.f8364b;
        RoomDatabase roomDatabase = c1560x3.f8940a;
        RoomDatabase roomDatabase2 = c1560x3.f8940a;
        roomDatabase.m4552c();
        try {
            long jM1227o = c1560x3.f8936I.m1227o(this.f8363a);
            roomDatabase2.m4568s();
            return Long.valueOf(jM1227o);
        } finally {
            roomDatabase2.m4563n();
        }
    }
}
