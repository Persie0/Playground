package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.library.LibraryItemCounter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1538u2 implements Callable<List<LibraryItemCounter>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8871a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f8872b;

    public CallableC1538u2(C1461j2 c1461j2, C6595o c6595o) {
        this.f8872b = c1461j2;
        this.f8871a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<LibraryItemCounter> call() throws Exception {
        RoomDatabase roomDatabase = this.f8872b.f8514a;
        roomDatabase.m4552c();
        try {
            try {
                Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8871a);
                try {
                    int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
                    int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "roseGiven");
                    int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "progress");
                    int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "listenTimes");
                    int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "readTimes");
                    int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "isTaken");
                    int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "difficulty");
                    int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "rosesCount");
                    int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "newWordsCount");
                    int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "knownWordsCount");
                    int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "cardsCount");
                    int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "lessonsCount");
                    int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "isCompletelyTaken");
                    try {
                        ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                        while (cursorM16698S0.moveToNext()) {
                            int i10 = iM16742n0;
                            arrayList.add(new LibraryItemCounter(cursorM16698S0.getInt(iM16742n0), cursorM16698S0.getInt(iM16742n1) != 0, cursorM16698S0.isNull(iM16742n2) ? null : Float.valueOf(cursorM16698S0.getFloat(iM16742n2)), cursorM16698S0.isNull(iM16742n3) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n3)), cursorM16698S0.isNull(iM16742n4) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n4)), cursorM16698S0.getInt(iM16742n5) != 0, cursorM16698S0.getFloat(iM16742n6), cursorM16698S0.getInt(iM16742n7), cursorM16698S0.getInt(iM16742n11), cursorM16698S0.getInt(iM16742n8), cursorM16698S0.getInt(iM16742n9), cursorM16698S0.getInt(iM16742n10), cursorM16698S0.getInt(iM16742n12) != 0));
                            iM16742n0 = i10;
                        }
                        roomDatabase.m4568s();
                        cursorM16698S0.close();
                        roomDatabase.m4563n();
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        cursorM16698S0.close();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                roomDatabase.m4563n();
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
            roomDatabase.m4563n();
            throw th;
        }
    }

    public final void finalize() {
        this.f8871a.m13198q();
    }
}
