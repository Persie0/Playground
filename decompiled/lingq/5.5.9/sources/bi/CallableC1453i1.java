package bi;

import androidx.room.RoomDatabase;
import com.lingq.entity.LanguageProgress;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bi.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1453i1 implements Callable<Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LanguageProgress f8498a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1422e1 f8499b;

    public CallableC1453i1(C1422e1 c1422e1, LanguageProgress languageProgress) {
        this.f8499b = c1422e1;
        this.f8498a = languageProgress;
    }

    @Override // java.util.concurrent.Callable
    public final Long call() throws Exception {
        C1422e1 c1422e1 = this.f8499b;
        RoomDatabase roomDatabase = c1422e1.f8402a;
        RoomDatabase roomDatabase2 = c1422e1.f8402a;
        roomDatabase.m4552c();
        try {
            long jM1227o = c1422e1.f8409h.m1227o(this.f8498a);
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
