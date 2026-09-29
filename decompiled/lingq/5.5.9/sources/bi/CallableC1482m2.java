package bi;

import androidx.room.RoomDatabase;
import com.lingq.entity.LibraryData;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bi.m2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1482m2 implements Callable<Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LibraryData f8646a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f8647b;

    public CallableC1482m2(C1461j2 c1461j2, LibraryData libraryData) {
        this.f8647b = c1461j2;
        this.f8646a = libraryData;
    }

    @Override // java.util.concurrent.Callable
    public final Long call() throws Exception {
        C1461j2 c1461j2 = this.f8647b;
        RoomDatabase roomDatabase = c1461j2.f8514a;
        RoomDatabase roomDatabase2 = c1461j2.f8514a;
        roomDatabase.m4552c();
        try {
            long jM1227o = c1461j2.f8521h.m1227o(this.f8646a);
            roomDatabase2.m4568s();
            return Long.valueOf(jM1227o);
        } finally {
            roomDatabase2.m4563n();
        }
    }
}
