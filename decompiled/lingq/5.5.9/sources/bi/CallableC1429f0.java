package bi;

import androidx.room.RoomDatabase;
import com.lingq.entity.LibraryData;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bi.f0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1429f0 implements Callable<Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LibraryData f8449a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1421e0 f8450b;

    public CallableC1429f0(C1421e0 c1421e0, LibraryData libraryData) {
        this.f8450b = c1421e0;
        this.f8449a = libraryData;
    }

    @Override // java.util.concurrent.Callable
    public final Long call() throws Exception {
        C1421e0 c1421e0 = this.f8450b;
        RoomDatabase roomDatabase = c1421e0.f8386a;
        RoomDatabase roomDatabase2 = c1421e0.f8386a;
        roomDatabase.m4552c();
        try {
            long jM1227o = c1421e0.f8387b.m1227o(this.f8449a);
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
