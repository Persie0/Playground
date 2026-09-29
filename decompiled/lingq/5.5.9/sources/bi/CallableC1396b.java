package bi;

import androidx.room.RoomDatabase;
import com.lingq.entity.Card;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bi.b */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1396b implements Callable<Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Card f8322a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1404c f8323b;

    public CallableC1396b(C1404c c1404c, Card card) {
        this.f8323b = c1404c;
        this.f8322a = card;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Long call() throws Exception {
        C1404c c1404c = this.f8323b;
        RoomDatabase roomDatabase = c1404c.f8337a;
        RoomDatabase roomDatabase2 = c1404c.f8337a;
        roomDatabase.m4552c();
        try {
            long jM1227o = c1404c.f8342f.m1227o(this.f8322a);
            roomDatabase2.m4568s();
            Long lValueOf = Long.valueOf(jM1227o);
            roomDatabase2.m4563n();
            return lValueOf;
        } catch (Throwable th2) {
            roomDatabase2.m4563n();
            throw th2;
        }
    }
}
