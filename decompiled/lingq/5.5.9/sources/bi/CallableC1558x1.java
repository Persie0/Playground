package bi;

import android.database.Cursor;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.x1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1558x1 implements Callable<LessonInfo> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8931a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1502p1 f8932b;

    public CallableC1558x1(C1502p1 c1502p1, C6595o c6595o) {
        this.f8932b = c1502p1;
        this.f8931a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final LessonInfo call() throws Exception {
        LessonInfo lessonInfo;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        LessonMediaSource lessonMediaSource;
        C1502p1 c1502p1 = this.f8932b;
        Cursor cursorM16698S0 = C8573r0.m16698S0(c1502p1.f8725a, this.f8931a);
        try {
            if (cursorM16698S0.moveToFirst()) {
                int i10 = cursorM16698S0.getInt(0);
                String string = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                String string2 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                String string3 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                String string4 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                String string5 = cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5);
                int i11 = cursorM16698S0.getInt(6);
                String string6 = cursorM16698S0.isNull(7) ? null : cursorM16698S0.getString(7);
                String string7 = cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8);
                Integer numValueOf = cursorM16698S0.isNull(9) ? null : Integer.valueOf(cursorM16698S0.getInt(9));
                Integer numValueOf2 = cursorM16698S0.isNull(10) ? null : Integer.valueOf(cursorM16698S0.getInt(10));
                int i12 = cursorM16698S0.getInt(11);
                int i13 = cursorM16698S0.getInt(12);
                String string8 = cursorM16698S0.isNull(13) ? null : cursorM16698S0.getString(13);
                Integer numValueOf3 = cursorM16698S0.isNull(14) ? null : Integer.valueOf(cursorM16698S0.getInt(14));
                Integer numValueOf4 = cursorM16698S0.isNull(15) ? null : Integer.valueOf(cursorM16698S0.getInt(15));
                Integer numValueOf5 = cursorM16698S0.isNull(16) ? null : Integer.valueOf(cursorM16698S0.getInt(16));
                if (numValueOf5 == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf5.intValue() != 0);
                }
                int i14 = cursorM16698S0.getInt(17);
                int i15 = cursorM16698S0.getInt(18);
                Integer numValueOf6 = cursorM16698S0.isNull(19) ? null : Integer.valueOf(cursorM16698S0.getInt(19));
                if (numValueOf6 == null) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(numValueOf6.intValue() != 0);
                }
                String string9 = cursorM16698S0.isNull(20) ? null : cursorM16698S0.getString(20);
                int i16 = cursorM16698S0.getInt(21);
                String string10 = cursorM16698S0.isNull(22) ? null : cursorM16698S0.getString(22);
                Integer numValueOf7 = cursorM16698S0.isNull(23) ? null : Integer.valueOf(cursorM16698S0.getInt(23));
                String string11 = cursorM16698S0.isNull(24) ? null : cursorM16698S0.getString(24);
                String string12 = cursorM16698S0.isNull(25) ? null : cursorM16698S0.getString(25);
                String string13 = cursorM16698S0.isNull(26) ? null : cursorM16698S0.getString(26);
                String string14 = cursorM16698S0.isNull(27) ? null : cursorM16698S0.getString(27);
                String string15 = cursorM16698S0.isNull(28) ? null : cursorM16698S0.getString(28);
                String string16 = cursorM16698S0.isNull(29) ? null : cursorM16698S0.getString(29);
                String string17 = cursorM16698S0.isNull(30) ? null : cursorM16698S0.getString(30);
                String string18 = cursorM16698S0.isNull(31) ? null : cursorM16698S0.getString(31);
                Integer numValueOf8 = cursorM16698S0.isNull(32) ? null : Integer.valueOf(cursorM16698S0.getInt(32));
                if (numValueOf8 == null) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(numValueOf8.intValue() != 0);
                }
                String string19 = cursorM16698S0.isNull(33) ? null : cursorM16698S0.getString(33);
                String string20 = cursorM16698S0.isNull(34) ? null : cursorM16698S0.getString(34);
                c1502p1.f8727c.getClass();
                List listM4992l = C1405c0.m4992l(string20);
                String string21 = cursorM16698S0.isNull(35) ? null : cursorM16698S0.getString(35);
                String string22 = cursorM16698S0.isNull(36) ? null : cursorM16698S0.getString(36);
                Integer numValueOf9 = cursorM16698S0.isNull(37) ? null : Integer.valueOf(cursorM16698S0.getInt(37));
                String string23 = cursorM16698S0.isNull(38) ? null : cursorM16698S0.getString(38);
                if (cursorM16698S0.isNull(39) && cursorM16698S0.isNull(40) && cursorM16698S0.isNull(41)) {
                    cursorM16698S0 = cursorM16698S0;
                    lessonMediaSource = null;
                } else {
                    try {
                        lessonMediaSource = new LessonMediaSource(cursorM16698S0.isNull(39) ? null : cursorM16698S0.getString(39), cursorM16698S0.isNull(40) ? null : cursorM16698S0.getString(40), cursorM16698S0.isNull(41) ? null : cursorM16698S0.getString(41));
                    } catch (Throwable th2) {
                        th = th2;
                        cursorM16698S0.close();
                        throw th;
                    }
                }
                lessonInfo = new LessonInfo(i10, string2, string3, string4, string5, string6, i11, i13, string8, numValueOf3, numValueOf4, boolValueOf, string21, string22, numValueOf, numValueOf2, i12, i14, i15, boolValueOf2, string9, numValueOf9, numValueOf7, string11, string12, string13, string14, string15, string16, string17, string18, boolValueOf3, listM4992l, string23, string, string19, lessonMediaSource, i16, string7, string10);
            } else {
                cursorM16698S0 = cursorM16698S0;
                lessonInfo = null;
            }
            cursorM16698S0.close();
            return lessonInfo;
        } catch (Throwable th3) {
            th = th3;
            cursorM16698S0 = cursorM16698S0;
        }
    }

    public final void finalize() {
        this.f8931a.m13198q();
    }
}
