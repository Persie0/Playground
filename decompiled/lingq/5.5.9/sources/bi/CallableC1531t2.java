package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.entity.LibraryCounter;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.t2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1531t2 implements Callable<LibraryCounter> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8849a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f8850b;

    public CallableC1531t2(C1461j2 c1461j2, C6595o c6595o) {
        this.f8850b = c1461j2;
        this.f8849a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final LibraryCounter call() throws Exception {
        RoomDatabase roomDatabase = this.f8850b.f8514a;
        C6595o c6595o = this.f8849a;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595o);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "type");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "roseGiven");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "progress");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "listenTimes");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "readTimes");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "isTaken");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "difficulty");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "rosesCount");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "newWordsCount");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "knownWordsCount");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "cardsCount");
            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "lessonsCount");
            int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "isCompletelyTaken");
            LibraryCounter libraryCounter = null;
            if (cursorM16698S0.moveToFirst()) {
                libraryCounter = new LibraryCounter(cursorM16698S0.getInt(iM16742n0), cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1), cursorM16698S0.getInt(iM16742n2) != 0, cursorM16698S0.isNull(iM16742n3) ? null : Float.valueOf(cursorM16698S0.getFloat(iM16742n3)), cursorM16698S0.isNull(iM16742n4) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n4)), cursorM16698S0.isNull(iM16742n5) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n5)), cursorM16698S0.getInt(iM16742n6) != 0, cursorM16698S0.getFloat(iM16742n7), cursorM16698S0.getInt(iM16742n8), cursorM16698S0.getInt(iM16742n9), cursorM16698S0.getInt(iM16742n10), cursorM16698S0.getInt(iM16742n11), cursorM16698S0.getInt(iM16742n12), cursorM16698S0.getInt(iM16742n13) != 0);
            }
            return libraryCounter;
        } finally {
            cursorM16698S0.close();
            c6595o.m13198q();
        }
    }
}
