package bi;

import android.database.Cursor;
import com.lingq.shared.uimodel.library.LessonInfo;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import java.util.List;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.e3 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1424e3 implements Callable<LessonInfo> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8436a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f8437b;

    public CallableC1424e3(C1461j2 c1461j2, C6595o c6595o) {
        this.f8437b = c1461j2;
        this.f8436a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final LessonInfo call() throws Exception {
        Boolean boolValueOf;
        LessonMediaSource lessonMediaSource;
        C1461j2 c1461j2 = this.f8437b;
        Cursor cursorM16698S0 = C8573r0.m16698S0(c1461j2.f8514a, this.f8436a);
        try {
            LessonInfo lessonInfo = null;
            String string = null;
            if (cursorM16698S0.moveToFirst()) {
                int i10 = cursorM16698S0.getInt(0);
                String string2 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                String string4 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                String string5 = cursorM16698S0.isNull(4) ? null : cursorM16698S0.getString(4);
                Integer numValueOf = cursorM16698S0.isNull(5) ? null : Integer.valueOf(cursorM16698S0.getInt(5));
                String string6 = cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6);
                String string7 = cursorM16698S0.isNull(7) ? null : cursorM16698S0.getString(7);
                String string8 = cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8);
                String string9 = cursorM16698S0.isNull(9) ? null : cursorM16698S0.getString(9);
                String string10 = cursorM16698S0.isNull(10) ? null : cursorM16698S0.getString(10);
                String string11 = cursorM16698S0.isNull(11) ? null : cursorM16698S0.getString(11);
                String string12 = cursorM16698S0.isNull(12) ? null : cursorM16698S0.getString(12);
                String string13 = cursorM16698S0.isNull(13) ? null : cursorM16698S0.getString(13);
                String string14 = cursorM16698S0.isNull(14) ? null : cursorM16698S0.getString(14);
                int i11 = cursorM16698S0.getInt(15);
                int i12 = cursorM16698S0.getInt(16);
                int i13 = cursorM16698S0.getInt(17);
                int i14 = cursorM16698S0.getInt(18);
                int i15 = cursorM16698S0.getInt(19);
                int i16 = cursorM16698S0.getInt(20);
                String string15 = cursorM16698S0.isNull(21) ? null : cursorM16698S0.getString(21);
                String string16 = cursorM16698S0.isNull(22) ? null : cursorM16698S0.getString(22);
                c1461j2.f8522i.getClass();
                List listM4992l = C1405c0.m4992l(string16);
                String string17 = cursorM16698S0.isNull(23) ? null : cursorM16698S0.getString(23);
                String string18 = cursorM16698S0.isNull(24) ? null : cursorM16698S0.getString(24);
                String string19 = cursorM16698S0.isNull(25) ? null : cursorM16698S0.getString(25);
                Integer numValueOf2 = cursorM16698S0.isNull(26) ? null : Integer.valueOf(cursorM16698S0.getInt(26));
                if (numValueOf2 == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf2.intValue() != 0);
                }
                String string20 = cursorM16698S0.isNull(27) ? null : cursorM16698S0.getString(27);
                if (cursorM16698S0.isNull(28) && cursorM16698S0.isNull(29) && cursorM16698S0.isNull(30)) {
                    lessonMediaSource = null;
                } else {
                    String string21 = cursorM16698S0.isNull(28) ? null : cursorM16698S0.getString(28);
                    String string22 = cursorM16698S0.isNull(29) ? null : cursorM16698S0.getString(29);
                    if (!cursorM16698S0.isNull(30)) {
                        string = cursorM16698S0.getString(30);
                    }
                    lessonMediaSource = new LessonMediaSource(string21, string22, string);
                }
                lessonInfo = new LessonInfo(i10, string2, string3, string5, string19, string17, i15, i16, string15, null, null, boolValueOf, null, null, null, null, i14, i11, i13, null, null, null, numValueOf, string6, string7, string8, string9, string10, string11, string12, string13, null, listM4992l, string18, string4, string14, lessonMediaSource, i12, null, string20);
            }
            return lessonInfo;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8436a.m13198q();
    }
}
