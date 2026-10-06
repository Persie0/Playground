package p000;

import android.graphics.Rect;
import android.util.Size;
import java.math.BigInteger;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kan {

    /* JADX INFO: renamed from: a */
    public static final kan f35486a = m13874k(4, 3);

    /* JADX INFO: renamed from: b */
    public static final kan f35487b = m13874k(16, 9);

    /* JADX INFO: renamed from: c */
    public static final kan f35488c = m13874k(3, 4);

    /* JADX INFO: renamed from: d */
    public final int f35489d;

    /* JADX INFO: renamed from: e */
    public final int f35490e;

    static {
        m13874k(9, 16);
    }

    private kan(int i, int i2) {
        this.f35489d = i;
        this.f35490e = i2;
    }

    /* JADX INFO: renamed from: i */
    public static kan m13872i(Size size) {
        return m13874k(size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: j */
    public static kan m13873j(kbc kbcVar) {
        return m13874k(kbcVar.f35517a, kbcVar.f35518b);
    }

    /* JADX INFO: renamed from: k */
    public static kan m13874k(int i, int i2) {
        int iIntValue = BigInteger.valueOf(i).gcd(BigInteger.valueOf(i2)).intValue();
        if (iIntValue != 0) {
            i /= iIntValue;
        }
        if (iIntValue != 0) {
            i2 /= iIntValue;
        }
        return new kan(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public final double m13875a() {
        double d = this.f35489d;
        double d2 = this.f35490e;
        Double.isNaN(d);
        Double.isNaN(d2);
        return d / d2;
    }

    /* JADX INFO: renamed from: b */
    public final float m13876b(float f) {
        return (f * this.f35490e) / this.f35489d;
    }

    /* JADX INFO: renamed from: c */
    public final float m13877c() {
        return this.f35489d / this.f35490e;
    }

    /* JADX INFO: renamed from: d */
    public final Rect m13878d(Rect rect) {
        if (!m13884n(m13874k(rect.width(), rect.height()))) {
            int iHeight = (rect.height() * this.f35489d) / this.f35490e;
            int iWidth = rect.left + ((rect.width() - iHeight) / 2);
            return new Rect(iWidth, rect.top, iHeight + iWidth, rect.top + rect.height());
        }
        int iWidth2 = (rect.width() * this.f35490e) / this.f35489d;
        int iHeight2 = rect.top + ((rect.height() - iWidth2) / 2);
        return new Rect(rect.left, iHeight2, rect.left + rect.width(), iWidth2 + iHeight2);
    }

    /* JADX INFO: renamed from: e */
    public final Rect m13879e(kbc kbcVar) {
        return m13878d(new Rect(0, 0, kbcVar.f35517a, kbcVar.f35518b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kan)) {
            return false;
        }
        kan kanVar = (kan) obj;
        return this.f35490e == kanVar.f35490e && this.f35489d == kanVar.f35489d;
    }

    /* JADX INFO: renamed from: f */
    public final kan m13880f() {
        return this.f35489d >= this.f35490e ? this : m13882l();
    }

    /* JADX INFO: renamed from: h */
    public final kan m13881h() {
        return this.f35489d <= this.f35490e ? this : m13882l();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f35489d), Integer.valueOf(this.f35490e)});
    }

    /* JADX INFO: renamed from: l */
    public final kan m13882l() {
        return m13874k(this.f35490e, this.f35489d);
    }

    /* JADX INFO: renamed from: m */
    public final boolean m13883m(kan kanVar) {
        return ((double) Math.abs(m13877c() - kanVar.m13877c())) < 0.025d;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m13884n(kan kanVar) {
        return this.f35489d * kanVar.f35490e > kanVar.f35489d * this.f35490e;
    }

    public final String toString() {
        return String.format(null, "AspectRatio[%d:%d]", Integer.valueOf(this.f35489d), Integer.valueOf(this.f35490e));
    }

    /* JADX INFO: renamed from: g */
    public static kan m13871g(kbc kbcVar) {
        return kbcVar.m13911k() ? m13874k(kbcVar.f35517a, kbcVar.f35518b) : m13874k(kbcVar.f35518b, kbcVar.f35517a);
    }
}
