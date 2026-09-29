package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.library.CollectionsFilterLessonTag;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.f2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1431f2 implements Callable<List<CollectionsFilterLessonTag>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8455a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8456b;

    public CallableC1431f2(C1502p1 c1502p1, C6595o c6595o) {
        this.f8456b = c1502p1;
        this.f8455a = c6595o;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // java.util.concurrent.Callable
    public final List<CollectionsFilterLessonTag> call() throws Exception {
        RoomDatabase roomDatabase = this.f8456b.f8725a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8455a);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "title");
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    arrayList.add(new CollectionsFilterLessonTag(cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0)));
                }
                roomDatabase.m4568s();
                cursorM16698S0.close();
                roomDatabase.m4563n();
                return arrayList;
            } catch (Throwable th2) {
                cursorM16698S0.close();
                throw th2;
            }
        } catch (Throwable th3) {
            roomDatabase.m4563n();
            throw th3;
        }
    }

    public final void finalize() {
        this.f8455a.m13198q();
    }
}
