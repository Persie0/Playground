package bi;

import android.database.Cursor;
import com.lingq.shared.uimodel.library.LessonMediaSource;
import java.util.List;
import java.util.concurrent.Callable;
import p181ii.C6332a;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.s2 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1524s2 implements Callable<C6332a> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8823a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1461j2 f8824b;

    public CallableC1524s2(C1461j2 c1461j2, C6595o c6595o) {
        this.f8824b = c1461j2;
        this.f8823a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final C6332a call() throws Exception {
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean boolValueOf3;
        Boolean boolValueOf4;
        LessonMediaSource lessonMediaSource;
        C1461j2 c1461j2 = this.f8824b;
        Cursor cursorM16698S0 = C8573r0.m16698S0(c1461j2.f8514a, this.f8823a);
        try {
            C6332a c6332a = null;
            String string = null;
            if (cursorM16698S0.moveToFirst()) {
                int i10 = cursorM16698S0.getInt(0);
                String string2 = cursorM16698S0.isNull(1) ? null : cursorM16698S0.getString(1);
                String string3 = cursorM16698S0.isNull(2) ? null : cursorM16698S0.getString(2);
                String string4 = cursorM16698S0.isNull(3) ? null : cursorM16698S0.getString(3);
                Integer numValueOf = cursorM16698S0.isNull(4) ? null : Integer.valueOf(cursorM16698S0.getInt(4));
                String string5 = cursorM16698S0.isNull(5) ? null : cursorM16698S0.getString(5);
                String string6 = cursorM16698S0.isNull(6) ? null : cursorM16698S0.getString(6);
                Integer numValueOf2 = cursorM16698S0.isNull(7) ? null : Integer.valueOf(cursorM16698S0.getInt(7));
                String string7 = cursorM16698S0.isNull(8) ? null : cursorM16698S0.getString(8);
                String string8 = cursorM16698S0.isNull(9) ? null : cursorM16698S0.getString(9);
                String string9 = cursorM16698S0.isNull(10) ? null : cursorM16698S0.getString(10);
                String string10 = cursorM16698S0.isNull(11) ? null : cursorM16698S0.getString(11);
                String string11 = cursorM16698S0.isNull(12) ? null : cursorM16698S0.getString(12);
                String string12 = cursorM16698S0.isNull(13) ? null : cursorM16698S0.getString(13);
                String string13 = cursorM16698S0.isNull(14) ? null : cursorM16698S0.getString(14);
                String string14 = cursorM16698S0.isNull(15) ? null : cursorM16698S0.getString(15);
                String string15 = cursorM16698S0.isNull(16) ? null : cursorM16698S0.getString(16);
                Integer numValueOf3 = cursorM16698S0.isNull(17) ? null : Integer.valueOf(cursorM16698S0.getInt(17));
                Integer numValueOf4 = cursorM16698S0.isNull(18) ? null : Integer.valueOf(cursorM16698S0.getInt(18));
                int i11 = cursorM16698S0.getInt(19);
                Integer numValueOf5 = cursorM16698S0.isNull(20) ? null : Integer.valueOf(cursorM16698S0.getInt(20));
                Integer numValueOf6 = cursorM16698S0.isNull(21) ? null : Integer.valueOf(cursorM16698S0.getInt(21));
                Integer numValueOf7 = cursorM16698S0.isNull(22) ? null : Integer.valueOf(cursorM16698S0.getInt(22));
                Integer numValueOf8 = cursorM16698S0.isNull(23) ? null : Integer.valueOf(cursorM16698S0.getInt(23));
                String string16 = cursorM16698S0.isNull(24) ? null : cursorM16698S0.getString(24);
                double d10 = cursorM16698S0.getDouble(25);
                Integer numValueOf9 = cursorM16698S0.isNull(26) ? null : Integer.valueOf(cursorM16698S0.getInt(26));
                if (numValueOf9 == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(numValueOf9.intValue() != 0);
                }
                String string17 = cursorM16698S0.isNull(27) ? null : cursorM16698S0.getString(27);
                c1461j2.f8522i.getClass();
                List listM4992l = C1405c0.m4992l(string17);
                String string18 = cursorM16698S0.isNull(28) ? null : cursorM16698S0.getString(28);
                Float fValueOf = cursorM16698S0.isNull(29) ? null : Float.valueOf(cursorM16698S0.getFloat(29));
                Integer numValueOf10 = cursorM16698S0.isNull(30) ? null : Integer.valueOf(cursorM16698S0.getInt(30));
                if (numValueOf10 == null) {
                    boolValueOf2 = null;
                } else {
                    boolValueOf2 = Boolean.valueOf(numValueOf10.intValue() != 0);
                }
                Double dValueOf = cursorM16698S0.isNull(31) ? null : Double.valueOf(cursorM16698S0.getDouble(31));
                Double dValueOf2 = cursorM16698S0.isNull(32) ? null : Double.valueOf(cursorM16698S0.getDouble(32));
                Integer numValueOf11 = cursorM16698S0.isNull(33) ? null : Integer.valueOf(cursorM16698S0.getInt(33));
                if (numValueOf11 == null) {
                    boolValueOf3 = null;
                } else {
                    boolValueOf3 = Boolean.valueOf(numValueOf11.intValue() != 0);
                }
                Integer numValueOf12 = cursorM16698S0.isNull(34) ? null : Integer.valueOf(cursorM16698S0.getInt(34));
                if (numValueOf12 == null) {
                    boolValueOf4 = null;
                } else {
                    boolValueOf4 = Boolean.valueOf(numValueOf12.intValue() != 0);
                }
                if (cursorM16698S0.isNull(35) && cursorM16698S0.isNull(36) && cursorM16698S0.isNull(37)) {
                    lessonMediaSource = null;
                } else {
                    String string19 = cursorM16698S0.isNull(35) ? null : cursorM16698S0.getString(35);
                    String string20 = cursorM16698S0.isNull(36) ? null : cursorM16698S0.getString(36);
                    if (!cursorM16698S0.isNull(37)) {
                        string = cursorM16698S0.getString(37);
                    }
                    lessonMediaSource = new LessonMediaSource(string19, string20, string);
                }
                c6332a = new C6332a(i10, string2, string5, numValueOf, string3, string4, string18, string6, numValueOf7, null, null, numValueOf6, numValueOf8, string16, dValueOf2, dValueOf, boolValueOf3, lessonMediaSource, numValueOf3, numValueOf5, null, null, null, boolValueOf4, string15, null, null, null, null, null, numValueOf2, string7, string8, string9, string10, string11, string12, string13, string14, d10, fValueOf, boolValueOf2, numValueOf4, boolValueOf, listM4992l, i11);
            }
            return c6332a;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8823a.m13198q();
    }
}
