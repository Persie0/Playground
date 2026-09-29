package bi;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import com.lingq.shared.uimodel.lesson.LessonStudyTransliteration;
import com.lingq.shared.uimodel.token.TokenMeaning;
import java.util.List;
import java.util.concurrent.Callable;
import li.C7374a;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.f */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1428f implements Callable<C7374a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8447a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1404c f8448b;

    public CallableC1428f(C1404c c1404c, C6595o c6595o) {
        this.f8448b = c1404c;
        this.f8447a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final C7374a call() throws Exception {
        C7374a c7374a;
        String string;
        int i10;
        LessonStudyTransliteration lessonStudyTransliteration;
        C1404c c1404c = this.f8448b;
        RoomDatabase roomDatabase = c1404c.f8337a;
        C1405c0 c1405c0 = c1404c.f8340d;
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, this.f8447a);
        try {
            if (cursorM16698S0.moveToFirst()) {
                String string2 = cursorM16698S0.isNull(0) ? null : cursorM16698S0.getString(0);
                int i11 = cursorM16698S0.getInt(1);
                String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                int i12 = cursorM16698S0.getInt(3);
                Integer numValueOf = cursorM16698S0.isNull(4) ? null : Integer.valueOf(cursorM16698S0.getInt(4));
                String string4 = cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5);
                String string5 = cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6);
                int i13 = cursorM16698S0.getInt(7);
                List<TokenMeaning> listM5007r = c1405c0.m5007r(cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8));
                List listM4992l = C1405c0.m4992l(cursorM16698S0.isNull(9) ? null : cursorM16698S0.getString(9));
                List listM4992l2 = C1405c0.m4992l(cursorM16698S0.isNull(10) ? null : cursorM16698S0.getString(10));
                List listM4992l3 = C1405c0.m4992l(cursorM16698S0.isNull(11) ? null : cursorM16698S0.getString(11));
                boolean z10 = cursorM16698S0.getInt(12) != 0;
                if (cursorM16698S0.isNull(13) && cursorM16698S0.isNull(14) && cursorM16698S0.isNull(15) && cursorM16698S0.isNull(16) && cursorM16698S0.isNull(17) && cursorM16698S0.isNull(18)) {
                    lessonStudyTransliteration = null;
                } else {
                    String string6 = cursorM16698S0.isNull(13) ? null : cursorM16698S0.getString(13);
                    String string7 = cursorM16698S0.isNull(14) ? null : cursorM16698S0.getString(14);
                    String string8 = cursorM16698S0.isNull(15) ? null : cursorM16698S0.getString(15);
                    String string9 = cursorM16698S0.isNull(16) ? null : cursorM16698S0.getString(16);
                    if (cursorM16698S0.isNull(17)) {
                        i10 = 18;
                        string = null;
                    } else {
                        string = cursorM16698S0.getString(17);
                        i10 = 18;
                    }
                    lessonStudyTransliteration = new LessonStudyTransliteration(string6, string7, string8, string9, string, cursorM16698S0.isNull(i10) ? null : cursorM16698S0.getString(i10));
                }
                c7374a = new C7374a(string2, listM4992l, listM4992l2, z10, listM5007r, i13, string3, i11, i12, numValueOf, string4, string5, listM4992l3, lessonStudyTransliteration);
            } else {
                c7374a = null;
            }
            return c7374a;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8447a.m13198q();
    }
}
