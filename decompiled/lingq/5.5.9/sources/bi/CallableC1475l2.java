package bi;

import androidx.room.RoomDatabase;
import com.lingq.entity.LibraryCounter;
import java.util.concurrent.Callable;
import sl.C9072e;

/* JADX INFO: renamed from: bi.l2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1475l2 implements Callable<C9072e> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ LibraryCounter f8584a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f8585b;

    public CallableC1475l2(C1461j2 c1461j2, LibraryCounter libraryCounter) {
        this.f8585b = c1461j2;
        this.f8584a = libraryCounter;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final C9072e call() throws Exception {
        C1461j2 c1461j2 = this.f8585b;
        RoomDatabase roomDatabase = c1461j2.f8514a;
        roomDatabase.m4552c();
        try {
            c1461j2.f8516c.m13169e(this.f8584a);
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
