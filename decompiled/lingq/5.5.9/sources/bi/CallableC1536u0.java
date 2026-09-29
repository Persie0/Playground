package bi;

import androidx.room.RoomDatabase;
import com.lingq.entity.LanguageContext;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: bi.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1536u0 implements Callable<Long> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LanguageContext f8867a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1543v0 f8868b;

    public CallableC1536u0(C1543v0 c1543v0, LanguageContext languageContext) {
        this.f8868b = c1543v0;
        this.f8867a = languageContext;
    }

    @Override // java.util.concurrent.Callable
    public final Long call() throws Exception {
        C1543v0 c1543v0 = this.f8868b;
        RoomDatabase roomDatabase = c1543v0.f8879a;
        RoomDatabase roomDatabase2 = c1543v0.f8879a;
        roomDatabase.m4552c();
        try {
            long jM1227o = c1543v0.f8880b.m1227o(this.f8867a);
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
