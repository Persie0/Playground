package bi;

import androidx.room.RoomDatabase;
import com.lingq.entity.TranslationSentence;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.q1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1509q1 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ TranslationSentence f8797a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8798b;

    public CallableC1509q1(C1502p1 c1502p1, TranslationSentence translationSentence) {
        this.f8798b = c1502p1;
        this.f8797a = translationSentence;
    }

    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1502p1 c1502p1 = this.f8798b;
        RoomDatabase roomDatabase = c1502p1.f8725a;
        roomDatabase.m4552c();
        try {
            c1502p1.f8726b.m13169e(this.f8797a);
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
