package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.lesson.LessonStudyTranslationSentence;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1391a2 implements Callable<List<LessonStudyTranslationSentence>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8311a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8312b;

    public CallableC1391a2(C1502p1 c1502p1, C6595o c6595o) {
        this.f8312b = c1502p1;
        this.f8311a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final List<LessonStudyTranslationSentence> call() throws Exception {
        C1502p1 c1502p1 = this.f8312b;
        RoomDatabase roomDatabase = c1502p1.f8725a;
        roomDatabase.m4552c();
        try {
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8311a);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "index");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "lessonId");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "audio");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "audioEnd");
                int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "text");
                int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "translations");
                ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                while (cursorM16698S0.moveToNext()) {
                    int i10 = cursorM16698S0.getInt(iM16742n0);
                    int i11 = cursorM16698S0.getInt(iM16742n1);
                    String string = null;
                    Double dValueOf = cursorM16698S0.isNull(iM16742n2) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n2));
                    Double dValueOf2 = cursorM16698S0.isNull(iM16742n3) ? null : Double.valueOf(cursorM16698S0.getDouble(iM16742n3));
                    String string2 = cursorM16698S0.isNull(iM16742n4) ? null : cursorM16698S0.getString(iM16742n4);
                    if (!cursorM16698S0.isNull(iM16742n5)) {
                        string = cursorM16698S0.getString(iM16742n5);
                    }
                    arrayList.add(new LessonStudyTranslationSentence(i10, i11, dValueOf, dValueOf2, string2, c1502p1.f8727c.m5004o(string)));
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
        this.f8311a.m13198q();
    }
}
