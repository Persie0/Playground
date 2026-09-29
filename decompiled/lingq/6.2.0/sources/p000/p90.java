package p000;

import org.joda.time.DateTimeFieldType;
import org.joda.time.LocalDateTime;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p90 implements ir7, Comparable {
    private static final long serialVersionUID = 276453175381783L;

    /* JADX INFO: renamed from: a */
    public final DateTimeFieldType m18991a(int i) {
        f12 f12VarMo18386I;
        s11 s11VarM18369c = ((LocalDateTime) this).m18369c();
        if (i == 0) {
            f12VarMo18386I = s11VarM18369c.mo18386I();
        } else if (i == 1) {
            f12VarMo18386I = s11VarM18369c.mo18415w();
        } else if (i == 2) {
            f12VarMo18386I = s11VarM18369c.mo18398e();
        } else {
            if (i != 3) {
                v63.m23143u(ux5.m22988k(i, "Invalid index: "));
                return null;
            }
            f12VarMo18386I = s11VarM18369c.mo18410r();
        }
        return f12VarMo18386I.mo11491r();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ir7) {
            ir7 ir7Var = (ir7) obj;
            for (int i = 0; i < 4; i++) {
                if (((LocalDateTime) this).m18370d(i) == ((LocalDateTime) ir7Var).m18370d(i) && m18991a(i) == ((p90) ir7Var).m18991a(i)) {
                }
            }
            s11 s11VarM18369c = ((LocalDateTime) this).m18369c();
            s11 s11VarM18369c2 = ((LocalDateTime) ir7Var).m18369c();
            if (s11VarM18369c == s11VarM18369c2) {
                return true;
            }
            if (s11VarM18369c == null || s11VarM18369c2 == null) {
                return false;
            }
            return s11VarM18369c.equals(s11VarM18369c2);
        }
        return false;
    }
}
