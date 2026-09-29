package p000;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class yed {
    /* JADX INFO: renamed from: a */
    public static boolean m25107a(h62 h62Var, boolean z) throws EOFException, InterruptedIOException {
        int i;
        k47 k47Var = new k47(16);
        boolean z2 = true;
        while (true) {
            k47Var.m14815J(8);
            if (!h62Var.mo13076d(k47Var.f46700a, 0, 8, true)) {
                break;
            }
            long jM14807B = k47Var.m14807B();
            int iM14829m = k47Var.m14829m();
            if (jM14807B != 1) {
                i = 8;
            } else {
                if (!h62Var.mo13076d(k47Var.f46700a, 8, 8, true)) {
                    break;
                }
                jM14807B = k47Var.m14811F();
                i = 16;
            }
            long j = i;
            if (jM14807B < j) {
                break;
            }
            int i2 = (int) (jM14807B - j);
            if (z2) {
                if (iM14829m != 1718909296 || i2 < 8) {
                    break;
                }
                k47Var.m14815J(4);
                h62Var.mo13076d(k47Var.f46700a, 0, 4, false);
                if (k47Var.m14829m() != 1751476579) {
                    break;
                }
                if (!z) {
                    return true;
                }
                h62Var.m13081j(i2 - 4, false);
                z2 = false;
            } else {
                if (iM14829m == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    h62Var.m13081j(i2, false);
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static String m25108b(AbstractList abstractList) {
        Iterator it = abstractList.iterator();
        StringBuilder sb = new StringBuilder();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                sb.append(next instanceof CharSequence ? (CharSequence) next : next.toString());
                while (it.hasNext()) {
                    sb.append((CharSequence) "\n");
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    sb.append(next2 instanceof CharSequence ? (CharSequence) next2 : next2.toString());
                }
            }
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
