package bi;

import androidx.room.RoomDatabase;
import com.lingq.entity.Lesson;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bi.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1516r1 implements Callable<Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Lesson f8811a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8812b;

    public CallableC1516r1(C1502p1 c1502p1, Lesson lesson) {
        this.f8812b = c1502p1;
        this.f8811a = lesson;
    }

    @Override // java.util.concurrent.Callable
    public final Long call() throws Exception {
        C1502p1 c1502p1 = this.f8812b;
        RoomDatabase roomDatabase = c1502p1.f8725a;
        RoomDatabase roomDatabase2 = c1502p1.f8725a;
        roomDatabase.m4552c();
        try {
            long jM1227o = c1502p1.f8728d.m1227o(this.f8811a);
            roomDatabase2.m4568s();
            return Long.valueOf(jM1227o);
        } finally {
            roomDatabase2.m4563n();
        }
    }
}
