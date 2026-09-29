package bi;

import androidx.room.RoomDatabase;
import com.lingq.entity.Word;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bi.y5 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1569y5 implements Callable<Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Word f9002a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1576z5 f9003b;

    public CallableC1569y5(C1576z5 c1576z5, Word word) {
        this.f9003b = c1576z5;
        this.f9002a = word;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final Long call() throws Exception {
        C1576z5 c1576z5 = this.f9003b;
        RoomDatabase roomDatabase = c1576z5.f9019a;
        RoomDatabase roomDatabase2 = c1576z5.f9019a;
        roomDatabase.m4552c();
        try {
            long jM1227o = c1576z5.f9022d.m1227o(this.f9002a);
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
