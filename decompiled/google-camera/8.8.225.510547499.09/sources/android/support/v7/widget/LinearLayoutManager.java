package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import p000.AbstractC0803lp;
import p000.AbstractC0812ly;
import p000.C0168et;
import p000.C0778kr;
import p000.C0784kx;
import p000.C0785ky;
import p000.C0786kz;
import p000.C0788la;
import p000.C0811lx;
import p000.C0813lz;
import p000.C0818md;
import p000.C0825mk;
import p000.C0826ml;
import p000.C0829mo;
import p000.InterfaceC0824mj;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutManager extends AbstractC0812ly implements InterfaceC0824mj {

    /* JADX INFO: renamed from: a */
    private C0786kz f1040a;

    /* JADX INFO: renamed from: b */
    private boolean f1041b;

    /* JADX INFO: renamed from: c */
    private boolean f1042c;

    /* JADX INFO: renamed from: d */
    private boolean f1043d;

    /* JADX INFO: renamed from: e */
    private boolean f1044e;

    /* JADX INFO: renamed from: f */
    private final C0785ky f1045f;

    /* JADX INFO: renamed from: g */
    private int f1046g;

    /* JADX INFO: renamed from: h */
    private int[] f1047h;

    /* JADX INFO: renamed from: i */
    public int f1048i;

    /* JADX INFO: renamed from: j */
    AbstractC0803lp f1049j;

    /* JADX INFO: renamed from: k */
    boolean f1050k;

    /* JADX INFO: renamed from: l */
    int f1051l;

    /* JADX INFO: renamed from: m */
    int f1052m;

    /* JADX INFO: renamed from: n */
    C0788la f1053n;

    /* JADX INFO: renamed from: o */
    final C0784kx f1054o;

    public LinearLayoutManager() {
        this(1);
    }

    /* JADX INFO: renamed from: bA */
    private final View m1124bA() {
        return m16174av(this.f1050k ? m16164aj() - 1 : 0);
    }

    /* JADX INFO: renamed from: bB */
    private final void m1125bB(C0818md c0818md, C0786kz c0786kz) {
        if (!c0786kz.f37752a || c0786kz.f37764m) {
            return;
        }
        int i = c0786kz.f37758g;
        int i2 = c0786kz.f37760i;
        if (c0786kz.f37757f == -1) {
            int iM16164aj = m16164aj();
            if (i < 0) {
                return;
            }
            int iMo15750e = (this.f1049j.mo15750e() - i) + i2;
            if (this.f1050k) {
                for (int i3 = 0; i3 < iM16164aj; i3++) {
                    View viewM16174av = m16174av(i3);
                    if (this.f1049j.mo15749d(viewM16174av) < iMo15750e || this.f1049j.mo15758m(viewM16174av) < iMo15750e) {
                        m1126bC(c0818md, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = iM16164aj - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View viewM16174av2 = m16174av(i5);
                if (this.f1049j.mo15749d(viewM16174av2) < iMo15750e || this.f1049j.mo15758m(viewM16174av2) < iMo15750e) {
                    m1126bC(c0818md, i4, i5);
                    return;
                }
            }
            return;
        }
        if (i >= 0) {
            int i6 = i - i2;
            int iM16164aj2 = m16164aj();
            if (!this.f1050k) {
                for (int i7 = 0; i7 < iM16164aj2; i7++) {
                    View viewM16174av3 = m16174av(i7);
                    if (this.f1049j.mo15746a(viewM16174av3) > i6 || this.f1049j.mo15757l(viewM16174av3) > i6) {
                        m1126bC(c0818md, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = iM16164aj2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View viewM16174av4 = m16174av(i9);
                if (this.f1049j.mo15746a(viewM16174av4) > i6 || this.f1049j.mo15757l(viewM16174av4) > i6) {
                    m1126bC(c0818md, i8, i9);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: bD */
    private final void m1127bD() {
        this.f1050k = (this.f1048i == 1 || !m1165Y()) ? this.f1042c : !this.f1042c;
    }

    /* JADX INFO: renamed from: bE */
    private final void m1128bE(int i, int i2, boolean z, C0826ml c0826ml) {
        int iMo15755j;
        this.f1040a.f37764m = m1166Z();
        this.f1040a.f37757f = i;
        int[] iArr = this.f1047h;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1155O(c0826ml, iArr);
        int iMax = Math.max(0, this.f1047h[0]);
        int iMax2 = Math.max(0, this.f1047h[1]);
        int i3 = i == 1 ? iMax2 : iMax;
        C0786kz c0786kz = this.f1040a;
        c0786kz.f37759h = i3;
        if (i != 1) {
            iMax = iMax2;
        }
        c0786kz.f37760i = iMax;
        if (i == 1) {
            c0786kz.f37759h = i3 + this.f1049j.mo15752g();
            View viewM1139bz = m1139bz();
            C0786kz c0786kz2 = this.f1040a;
            c0786kz2.f37756e = true == this.f1050k ? -1 : 1;
            int iBe = m16136be(viewM1139bz);
            C0786kz c0786kz3 = this.f1040a;
            c0786kz2.f37755d = iBe + c0786kz3.f37756e;
            c0786kz3.f37753b = this.f1049j.mo15746a(viewM1139bz);
            iMo15755j = this.f1049j.mo15746a(viewM1139bz) - this.f1049j.mo15751f();
        } else {
            View viewM1124bA = m1124bA();
            this.f1040a.f37759h += this.f1049j.mo15755j();
            C0786kz c0786kz4 = this.f1040a;
            c0786kz4.f37756e = true != this.f1050k ? -1 : 1;
            int iBe2 = m16136be(viewM1124bA);
            C0786kz c0786kz5 = this.f1040a;
            c0786kz4.f37755d = iBe2 + c0786kz5.f37756e;
            c0786kz5.f37753b = this.f1049j.mo15749d(viewM1124bA);
            iMo15755j = (-this.f1049j.mo15749d(viewM1124bA)) + this.f1049j.mo15755j();
        }
        C0786kz c0786kz6 = this.f1040a;
        c0786kz6.f37754c = i2;
        if (z) {
            c0786kz6.f37754c = i2 - iMo15755j;
        }
        c0786kz6.f37758g = iMo15755j;
    }

    /* JADX INFO: renamed from: bF */
    private final void m1129bF(C0784kx c0784kx) {
        m1130bG(c0784kx.f37591b, c0784kx.f37592c);
    }

    /* JADX INFO: renamed from: bG */
    private final void m1130bG(int i, int i2) {
        this.f1040a.f37754c = this.f1049j.mo15751f() - i2;
        C0786kz c0786kz = this.f1040a;
        c0786kz.f37756e = true != this.f1050k ? 1 : -1;
        c0786kz.f37755d = i;
        c0786kz.f37757f = 1;
        c0786kz.f37753b = i2;
        c0786kz.f37758g = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: bH */
    private final void m1131bH(C0784kx c0784kx) {
        m1132bI(c0784kx.f37591b, c0784kx.f37592c);
    }

    /* JADX INFO: renamed from: bI */
    private final void m1132bI(int i, int i2) {
        this.f1040a.f37754c = i2 - this.f1049j.mo15755j();
        C0786kz c0786kz = this.f1040a;
        c0786kz.f37755d = i;
        c0786kz.f37756e = true != this.f1050k ? -1 : 1;
        c0786kz.f37757f = -1;
        c0786kz.f37753b = i2;
        c0786kz.f37758g = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: bt */
    private final int m1133bt(C0826ml c0826ml) {
        if (m16164aj() == 0) {
            return 0;
        }
        m1156P();
        return C0168et.m7837f(c0826ml, this.f1049j, m1171ae(!this.f1044e), m1170ad(!this.f1044e), this, this.f1044e, this.f1050k);
    }

    /* JADX INFO: renamed from: bu */
    private final int m1134bu(C0826ml c0826ml) {
        if (m16164aj() == 0) {
            return 0;
        }
        m1156P();
        return C0168et.m7838g(c0826ml, this.f1049j, m1171ae(!this.f1044e), m1170ad(!this.f1044e), this, this.f1044e);
    }

    /* JADX INFO: renamed from: bv */
    private final int m1135bv(int i, C0818md c0818md, C0826ml c0826ml, boolean z) {
        int iMo15751f;
        int iMo15751f2 = this.f1049j.mo15751f() - i;
        if (iMo15751f2 <= 0) {
            return 0;
        }
        int i2 = -m1149I(-iMo15751f2, c0818md, c0826ml);
        int i3 = i + i2;
        if (!z || (iMo15751f = this.f1049j.mo15751f() - i3) <= 0) {
            return i2;
        }
        this.f1049j.mo15759n(iMo15751f);
        return iMo15751f + i2;
    }

    /* JADX INFO: renamed from: bw */
    private final int m1136bw(int i, C0818md c0818md, C0826ml c0826ml, boolean z) {
        int iMo15755j;
        int iMo15755j2 = i - this.f1049j.mo15755j();
        if (iMo15755j2 <= 0) {
            return 0;
        }
        int i2 = -m1149I(iMo15755j2, c0818md, c0826ml);
        int i3 = i + i2;
        if (!z || (iMo15755j = i3 - this.f1049j.mo15755j()) <= 0) {
            return i2;
        }
        this.f1049j.mo15759n(-iMo15755j);
        return i2 - iMo15755j;
    }

    /* JADX INFO: renamed from: bx */
    private final View m1137bx() {
        return m1152L(0, m16164aj());
    }

    /* JADX INFO: renamed from: by */
    private final View m1138by() {
        return m1152L(m16164aj() - 1, -1);
    }

    /* JADX INFO: renamed from: bz */
    private final View m1139bz() {
        return m16174av(this.f1050k ? 0 : m16164aj() - 1);
    }

    /* JADX INFO: renamed from: c */
    private final int m1140c(C0826ml c0826ml) {
        if (m16164aj() == 0) {
            return 0;
        }
        m1156P();
        return C0168et.m7836e(c0826ml, this.f1049j, m1171ae(!this.f1044e), m1170ad(!this.f1044e), this, this.f1044e);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: A */
    public final int mo1141A(C0826ml c0826ml) {
        return m1133bt(c0826ml);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: B */
    public final int mo1142B(C0826ml c0826ml) {
        return m1134bu(c0826ml);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: C */
    public int mo1143C(C0826ml c0826ml) {
        return m1140c(c0826ml);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: D */
    public final int mo1144D(C0826ml c0826ml) {
        return m1133bt(c0826ml);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: E */
    public final int mo1145E(C0826ml c0826ml) {
        return m1134bu(c0826ml);
    }

    /* JADX INFO: renamed from: G */
    final int m1147G(C0818md c0818md, C0786kz c0786kz, C0826ml c0826ml, boolean z) {
        int i = c0786kz.f37754c;
        int i2 = c0786kz.f37758g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                c0786kz.f37758g = i2 + i;
            }
            m1125bB(c0818md, c0786kz);
        }
        int i3 = c0786kz.f37754c + c0786kz.f37759h;
        C0785ky c0785ky = this.f1045f;
        while (true) {
            if ((!c0786kz.f37764m && i3 <= 0) || !c0786kz.m15083d(c0826ml)) {
                break;
            }
            c0785ky.f37700a = 0;
            c0785ky.f37701b = false;
            c0785ky.f37702c = false;
            c0785ky.f37703d = false;
            mo1103k(c0818md, c0826ml, c0786kz, c0785ky);
            if (!c0785ky.f37701b) {
                int i4 = c0786kz.f37753b;
                int i5 = c0785ky.f37700a;
                c0786kz.f37753b = i4 + (c0786kz.f37757f * i5);
                if (!c0785ky.f37702c || c0786kz.f37763l != null || !c0826ml.f40922g) {
                    c0786kz.f37754c -= i5;
                    i3 -= i5;
                }
                int i6 = c0786kz.f37758g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    c0786kz.f37758g = i7;
                    int i8 = c0786kz.f37754c;
                    if (i8 < 0) {
                        c0786kz.f37758g = i7 + i8;
                    }
                    m1125bB(c0818md, c0786kz);
                }
                if (z && c0785ky.f37703d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - c0786kz.f37754c;
    }

    /* JADX INFO: renamed from: H */
    public final int m1148H() {
        View viewM1172af = m1172af(0, m16164aj(), false);
        if (viewM1172af == null) {
            return -1;
        }
        return m16136be(viewM1172af);
    }

    /* JADX INFO: renamed from: I */
    final int m1149I(int i, C0818md c0818md, C0826ml c0826ml) {
        if (m16164aj() == 0 || i == 0) {
            return 0;
        }
        m1156P();
        this.f1040a.f37752a = true;
        int i2 = i > 0 ? 1 : -1;
        int iAbs = Math.abs(i);
        m1128bE(i2, iAbs, true, c0826ml);
        C0786kz c0786kz = this.f1040a;
        int iM1147G = c0786kz.f37758g + m1147G(c0818md, c0786kz, c0826ml, false);
        if (iM1147G < 0) {
            return 0;
        }
        if (iAbs > iM1147G) {
            i = i2 * iM1147G;
        }
        this.f1049j.mo15759n(-i);
        this.f1040a.f37762k = i;
        return i;
    }

    @Override // p000.InterfaceC0824mj
    /* JADX INFO: renamed from: J */
    public final PointF mo1150J(int i) {
        if (m16164aj() == 0) {
            return null;
        }
        int i2 = (i < m16136be(m16174av(0))) != this.f1050k ? -1 : 1;
        return this.f1048i == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: K */
    public final Parcelable mo1151K() {
        C0788la c0788la = this.f1053n;
        if (c0788la != null) {
            return new C0788la(c0788la);
        }
        C0788la c0788la2 = new C0788la();
        if (m16164aj() > 0) {
            m1156P();
            boolean z = this.f1041b ^ this.f1050k;
            c0788la2.f37800c = z;
            if (z) {
                View viewM1139bz = m1139bz();
                c0788la2.f37799b = this.f1049j.mo15751f() - this.f1049j.mo15746a(viewM1139bz);
                c0788la2.f37798a = m16136be(viewM1139bz);
            } else {
                View viewM1124bA = m1124bA();
                c0788la2.f37798a = m16136be(viewM1124bA);
                c0788la2.f37799b = this.f1049j.mo15749d(viewM1124bA) - this.f1049j.mo15755j();
            }
        } else {
            c0788la2.m15112a();
        }
        return c0788la2;
    }

    /* JADX INFO: renamed from: L */
    final View m1152L(int i, int i2) {
        m1156P();
        if (i2 <= i && i2 >= i) {
            return m16174av(i);
        }
        int iMo15749d = this.f1049j.mo15749d(m16174av(i));
        int iMo15755j = this.f1049j.mo15755j();
        int i3 = iMo15749d < iMo15755j ? 16388 : 4097;
        int i4 = iMo15749d < iMo15755j ? 16644 : 4161;
        return this.f1048i == 0 ? this.f39545C.m767l(i, i2, i4, i3) : this.f39546D.m767l(i, i2, i4, i3);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: M */
    public final View mo1153M(int i) {
        int iM16164aj = m16164aj();
        if (iM16164aj == 0) {
            return null;
        }
        int iBe = i - m16136be(m16174av(0));
        if (iBe >= 0 && iBe < iM16164aj) {
            View viewM16174av = m16174av(iBe);
            if (m16136be(viewM16174av) == i) {
                return viewM16174av;
            }
        }
        return super.mo1153M(i);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: N */
    public final void mo1154N(String str) {
        if (this.f1053n == null) {
            super.mo1154N(str);
        }
    }

    /* JADX INFO: renamed from: O */
    protected void mo1155O(C0826ml c0826ml, int[] iArr) {
        int iMo15756k = c0826ml.m16587c() ? this.f1049j.mo15756k() : 0;
        int i = this.f1040a.f37757f;
        int i2 = i == -1 ? 0 : iMo15756k;
        if (i != -1) {
            iMo15756k = 0;
        }
        iArr[0] = iMo15756k;
        iArr[1] = i2;
    }

    /* JADX INFO: renamed from: P */
    final void m1156P() {
        if (this.f1040a == null) {
            this.f1040a = new C0786kz();
        }
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: Q */
    public final void mo1157Q(AccessibilityEvent accessibilityEvent) {
        super.mo1157Q(accessibilityEvent);
        if (m16164aj() > 0) {
            accessibilityEvent.setFromIndex(m1148H());
            View viewM1172af = m1172af(m16164aj() - 1, -1, false);
            accessibilityEvent.setToIndex(viewM1172af != null ? m16136be(viewM1172af) : -1);
        }
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: R */
    public final void mo1158R(Parcelable parcelable) {
        if (parcelable instanceof C0788la) {
            C0788la c0788la = (C0788la) parcelable;
            this.f1053n = c0788la;
            if (this.f1051l != -1) {
                c0788la.m15112a();
            }
            m16155aP();
        }
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: S */
    public final void mo1159S(int i) {
        this.f1051l = i;
        this.f1052m = Integer.MIN_VALUE;
        C0788la c0788la = this.f1053n;
        if (c0788la != null) {
            c0788la.m15112a();
        }
        m16155aP();
    }

    /* JADX INFO: renamed from: T */
    public final void m1160T(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        mo1154N(null);
        if (i != this.f1048i || this.f1049j == null) {
            AbstractC0803lp abstractC0803lpM15797q = AbstractC0803lp.m15797q(this, i);
            this.f1049j = abstractC0803lpM15797q;
            this.f1054o.f37590a = abstractC0803lpM15797q;
            this.f1048i = i;
            m16155aP();
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m1161U(boolean z) {
        mo1154N(null);
        if (z == this.f1042c) {
            return;
        }
        this.f1042c = z;
        m16155aP();
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: V */
    public final boolean mo1162V() {
        return this.f1048i == 0;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: W */
    public final boolean mo1163W() {
        return this.f1048i == 1;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: X */
    public final boolean mo1164X() {
        return true;
    }

    /* JADX INFO: renamed from: Y */
    protected final boolean m1165Y() {
        return m16166am() == 1;
    }

    /* JADX INFO: renamed from: Z */
    final boolean m1166Z() {
        return this.f1049j.mo15753h() == 0 && this.f1049j.mo15750e() == 0;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: aa */
    public final boolean mo1167aa() {
        if (this.f39559z != 1073741824 && this.f39558y != 1073741824) {
            int iM16164aj = m16164aj();
            for (int i = 0; i < iM16164aj; i++) {
                ViewGroup.LayoutParams layoutParams = m16174av(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: ab */
    public final void mo1168ab(int i, int i2, C0826ml c0826ml, C0778kr c0778kr) {
        if (1 == this.f1048i) {
            i = i2;
        }
        if (m16164aj() == 0 || i == 0) {
            return;
        }
        m1156P();
        m1128bE(i > 0 ? 1 : -1, Math.abs(i), true, c0826ml);
        mo1113u(c0826ml, this.f1040a, c0778kr);
    }

    /* JADX INFO: renamed from: ad */
    final View m1170ad(boolean z) {
        return this.f1050k ? m1172af(0, m16164aj(), z) : m1172af(m16164aj() - 1, -1, z);
    }

    /* JADX INFO: renamed from: ae */
    final View m1171ae(boolean z) {
        return this.f1050k ? m1172af(m16164aj() - 1, -1, z) : m1172af(0, m16164aj(), z);
    }

    /* JADX INFO: renamed from: af */
    final View m1172af(int i, int i2, boolean z) {
        m1156P();
        int i3 = this.f1048i;
        int i4 = true != z ? 320 : 24579;
        return i3 == 0 ? this.f39545C.m767l(i, i2, i4, 320) : this.f39546D.m767l(i, i2, i4, 320);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: ag */
    public void mo1173ag(RecyclerView recyclerView) {
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: ah */
    public final void mo1174ah(RecyclerView recyclerView, int i) {
        C0825mk c0825mk = new C0825mk(recyclerView.getContext());
        c0825mk.f40796b = i;
        m16161aV(c0825mk);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: d */
    public int mo1096d(int i, C0818md c0818md, C0826ml c0826ml) {
        if (this.f1048i == 1) {
            return 0;
        }
        return m1149I(i, c0818md, c0826ml);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: e */
    public int mo1097e(int i, C0818md c0818md, C0826ml c0826ml) {
        if (this.f1048i == 0) {
            return 0;
        }
        return m1149I(i, c0818md, c0826ml);
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: f */
    public C0813lz mo1098f() {
        return new C0813lz(-2, -2);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0073  */
    /* JADX WARN: Code duplicated, block: B:35:0x0077  */
    /* JADX INFO: renamed from: i */
    public View mo1101i(C0818md c0818md, C0826ml c0826ml, boolean z, boolean z2) {
        int i;
        int iM16164aj;
        int i2;
        m1156P();
        int iM16164aj2 = m16164aj();
        if (z2) {
            i = -1;
            iM16164aj = m16164aj() - 1;
            i2 = -1;
        } else {
            i = iM16164aj2;
            iM16164aj = 0;
            i2 = 1;
        }
        int iM16585a = c0826ml.m16585a();
        int iMo15755j = this.f1049j.mo15755j();
        int iMo15751f = this.f1049j.mo15751f();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (iM16164aj != i) {
            View viewM16174av = m16174av(iM16164aj);
            int iBe = m16136be(viewM16174av);
            int iMo15749d = this.f1049j.mo15749d(viewM16174av);
            int iMo15746a = this.f1049j.mo15746a(viewM16174av);
            if (iBe >= 0 && iBe < iM16585a) {
                if (!((C0813lz) viewM16174av.getLayoutParams()).m16220c()) {
                    boolean z3 = iMo15746a <= iMo15755j && iMo15749d < iMo15755j;
                    boolean z4 = iMo15749d >= iMo15751f && iMo15746a > iMo15751f;
                    if (!z3 && !z4) {
                        return viewM16174av;
                    }
                    if (z) {
                        if (z4) {
                            view2 = viewM16174av;
                        } else if (view == null) {
                            view = viewM16174av;
                        }
                    } else if (z3) {
                        view2 = viewM16174av;
                    } else if (view == null) {
                        view = viewM16174av;
                    }
                } else if (view3 == null) {
                    view3 = viewM16174av;
                }
            }
            iM16164aj += i2;
        }
        if (view != null) {
            return view;
        }
        return view2 != null ? view2 : view3;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: j */
    public View mo1102j(View view, int i, C0818md c0818md, C0826ml c0826ml) {
        int iM1146F;
        View viewM1137bx;
        m1127bD();
        if (m16164aj() == 0 || (iM1146F = m1146F(i)) == Integer.MIN_VALUE) {
            return null;
        }
        m1156P();
        m1128bE(iM1146F, (int) (this.f1049j.mo15756k() * 0.33333334f), false, c0826ml);
        C0786kz c0786kz = this.f1040a;
        c0786kz.f37758g = Integer.MIN_VALUE;
        c0786kz.f37752a = false;
        m1147G(c0818md, c0786kz, c0826ml, true);
        if (iM1146F == -1) {
            viewM1137bx = this.f1050k ? m1138by() : m1137bx();
            iM1146F = -1;
        } else {
            viewM1137bx = this.f1050k ? m1137bx() : m1138by();
        }
        View viewM1124bA = iM1146F == -1 ? m1124bA() : m1139bz();
        if (!viewM1124bA.hasFocusable()) {
            return viewM1137bx;
        }
        if (viewM1137bx == null) {
            return null;
        }
        return viewM1124bA;
    }

    /* JADX INFO: renamed from: k */
    public void mo1103k(C0818md c0818md, C0826ml c0826ml, C0786kz c0786kz, C0785ky c0785ky) {
        int iM16170aq;
        int i;
        int i2;
        int iMo15748c;
        View viewM15080a = c0786kz.m15080a(c0818md);
        if (viewM15080a == null) {
            c0785ky.f37701b = true;
            return;
        }
        C0813lz c0813lz = (C0813lz) viewM15080a.getLayoutParams();
        if (c0786kz.f37763l == null) {
            if (this.f1050k == (c0786kz.f37757f == -1)) {
                m16178az(viewM15080a);
            } else {
                m16144aA(viewM15080a, 0);
            }
        } else {
            if (this.f1050k == (c0786kz.f37757f == -1)) {
                m16176ax(viewM15080a);
            } else {
                m16177ay(viewM15080a, 0);
            }
        }
        C0813lz c0813lz2 = (C0813lz) viewM15080a.getLayoutParams();
        Rect rectM1253e = this.f39550q.m1253e(viewM15080a);
        int i3 = rectM1253e.left + rectM1253e.right;
        int i4 = rectM1253e.top + rectM1253e.bottom;
        int iM16129ak = AbstractC0812ly.m16129ak(this.f39543A, this.f39558y, m16170aq() + m16171ar() + c0813lz2.leftMargin + c0813lz2.rightMargin + i3, c0813lz2.width, mo1162V());
        int iM16129ak2 = AbstractC0812ly.m16129ak(this.f39544B, this.f39559z, m16172as() + m16169ap() + c0813lz2.topMargin + c0813lz2.bottomMargin + i4, c0813lz2.height, mo1163W());
        if (m16163aZ(viewM15080a, iM16129ak, iM16129ak2, c0813lz2)) {
            viewM15080a.measure(iM16129ak, iM16129ak2);
        }
        c0785ky.f37700a = this.f1049j.mo15747b(viewM15080a);
        if (this.f1048i == 1) {
            if (m1165Y()) {
                iMo15748c = this.f39543A - m16171ar();
                iM16170aq = iMo15748c - this.f1049j.mo15748c(viewM15080a);
            } else {
                iM16170aq = m16170aq();
                iMo15748c = this.f1049j.mo15748c(viewM15080a) + iM16170aq;
            }
            if (c0786kz.f37757f == -1) {
                i = c0786kz.f37753b;
                i2 = i - c0785ky.f37700a;
            } else {
                i2 = c0786kz.f37753b;
                i = c0785ky.f37700a + i2;
            }
        } else {
            int iM16172as = m16172as();
            int iMo15748c2 = this.f1049j.mo15748c(viewM15080a) + iM16172as;
            if (c0786kz.f37757f == -1) {
                int i5 = c0786kz.f37753b;
                int i6 = i5 - c0785ky.f37700a;
                iMo15748c = i5;
                i = iMo15748c2;
                iM16170aq = i6;
                i2 = iM16172as;
            } else {
                int i7 = c0786kz.f37753b;
                int i8 = c0785ky.f37700a + i7;
                iM16170aq = i7;
                i = iMo15748c2;
                i2 = iM16172as;
                iMo15748c = i8;
            }
        }
        m16139bj(viewM15080a, iM16170aq, i2, iMo15748c, i);
        if (c0813lz.m16220c() || c0813lz.m16219b()) {
            c0785ky.f37702c = true;
        }
        c0785ky.f37703d = viewM15080a.hasFocusable();
    }

    /* JADX INFO: renamed from: l */
    public void mo1104l(C0818md c0818md, C0826ml c0826ml, C0784kx c0784kx, int i) {
    }

    /* JADX WARN: Code duplicated, block: B:114:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:116:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:117:0x0200  */
    /* JADX WARN: Code duplicated, block: B:81:0x0177  */
    /* JADX WARN: Code duplicated, block: B:83:0x017d  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:92:0x01a7  */
    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: o */
    public void mo1107o(C0818md c0818md, C0826ml c0826ml) {
        int iM16585a;
        View viewM16175aw;
        boolean z;
        boolean z2;
        View viewMo1101i;
        C0813lz c0813lz;
        int i;
        int i2;
        int i3;
        int i4;
        View viewMo1153M;
        int i5 = -1;
        if (!(this.f1053n == null && this.f1051l == -1) && c0826ml.m16585a() == 0) {
            m16150aK(c0818md);
            return;
        }
        C0788la c0788la = this.f1053n;
        if (c0788la != null && c0788la.m15113b()) {
            this.f1051l = c0788la.f37798a;
        }
        m1156P();
        this.f1040a.f37752a = false;
        m1127bD();
        View viewM16175aw2 = m16175aw();
        C0784kx c0784kx = this.f1054o;
        if (!c0784kx.f37594e || this.f1051l != -1 || this.f1053n != null) {
            c0784kx.m14953d();
            C0784kx c0784kx2 = this.f1054o;
            c0784kx2.f37593d = this.f1050k ^ this.f1043d;
            if (c0826ml.f40922g || (i = this.f1051l) == -1) {
                if (m16164aj() != 0) {
                    viewM16175aw = m16175aw();
                    if (viewM16175aw != null) {
                        c0813lz = (C0813lz) viewM16175aw.getLayoutParams();
                        if (!c0813lz.m16220c() || c0813lz.m16218a() < 0 || c0813lz.m16218a() >= c0826ml.m16585a()) {
                            z = this.f1041b;
                            z2 = this.f1043d;
                            if (z == z2 || (viewMo1101i = mo1101i(c0818md, c0826ml, c0784kx2.f37593d, z2)) == null) {
                                c0784kx2.m14950a();
                                if (this.f1043d) {
                                    iM16585a = c0826ml.m16585a() - 1;
                                } else {
                                    iM16585a = 0;
                                }
                                c0784kx2.f37591b = iM16585a;
                            } else {
                                c0784kx2.m14951b(viewMo1101i, m16136be(viewMo1101i));
                                if (!c0826ml.f40922g && mo1112t()) {
                                    int iMo15749d = this.f1049j.mo15749d(viewMo1101i);
                                    int iMo15746a = this.f1049j.mo15746a(viewMo1101i);
                                    int iMo15755j = this.f1049j.mo15755j();
                                    int iMo15751f = this.f1049j.mo15751f();
                                    boolean z3 = iMo15746a <= iMo15755j && iMo15749d < iMo15755j;
                                    boolean z4 = iMo15749d >= iMo15751f && iMo15746a > iMo15751f;
                                    if (z3 || z4) {
                                        if (true == c0784kx2.f37593d) {
                                            iMo15755j = iMo15751f;
                                        }
                                        c0784kx2.f37592c = iMo15755j;
                                    }
                                }
                            }
                        } else {
                            c0784kx2.m14952c(viewM16175aw, m16136be(viewM16175aw));
                        }
                    } else {
                        z = this.f1041b;
                        z2 = this.f1043d;
                        if (z == z2) {
                            c0784kx2.m14950a();
                            if (this.f1043d) {
                                iM16585a = c0826ml.m16585a() - 1;
                            } else {
                                iM16585a = 0;
                            }
                            c0784kx2.f37591b = iM16585a;
                        } else {
                            c0784kx2.m14950a();
                            if (this.f1043d) {
                                iM16585a = c0826ml.m16585a() - 1;
                            } else {
                                iM16585a = 0;
                            }
                            c0784kx2.f37591b = iM16585a;
                        }
                    }
                } else {
                    c0784kx2.m14950a();
                    if (this.f1043d) {
                        iM16585a = c0826ml.m16585a() - 1;
                    } else {
                        iM16585a = 0;
                    }
                    c0784kx2.f37591b = iM16585a;
                }
            } else if (i < 0 || i >= c0826ml.m16585a()) {
                this.f1051l = -1;
                this.f1052m = Integer.MIN_VALUE;
                if (m16164aj() != 0) {
                    viewM16175aw = m16175aw();
                    if (viewM16175aw != null) {
                        c0813lz = (C0813lz) viewM16175aw.getLayoutParams();
                        if (c0813lz.m16220c()) {
                            z = this.f1041b;
                            z2 = this.f1043d;
                            if (z == z2) {
                                c0784kx2.m14950a();
                                if (this.f1043d) {
                                    iM16585a = c0826ml.m16585a() - 1;
                                } else {
                                    iM16585a = 0;
                                }
                                c0784kx2.f37591b = iM16585a;
                            } else {
                                c0784kx2.m14950a();
                                if (this.f1043d) {
                                    iM16585a = c0826ml.m16585a() - 1;
                                } else {
                                    iM16585a = 0;
                                }
                                c0784kx2.f37591b = iM16585a;
                            }
                        } else {
                            z = this.f1041b;
                            z2 = this.f1043d;
                            if (z == z2) {
                                c0784kx2.m14950a();
                                if (this.f1043d) {
                                    iM16585a = c0826ml.m16585a() - 1;
                                } else {
                                    iM16585a = 0;
                                }
                                c0784kx2.f37591b = iM16585a;
                            } else {
                                c0784kx2.m14950a();
                                if (this.f1043d) {
                                    iM16585a = c0826ml.m16585a() - 1;
                                } else {
                                    iM16585a = 0;
                                }
                                c0784kx2.f37591b = iM16585a;
                            }
                        }
                    } else {
                        z = this.f1041b;
                        z2 = this.f1043d;
                        if (z == z2) {
                            c0784kx2.m14950a();
                            if (this.f1043d) {
                                iM16585a = c0826ml.m16585a() - 1;
                            } else {
                                iM16585a = 0;
                            }
                            c0784kx2.f37591b = iM16585a;
                        } else {
                            c0784kx2.m14950a();
                            if (this.f1043d) {
                                iM16585a = c0826ml.m16585a() - 1;
                            } else {
                                iM16585a = 0;
                            }
                            c0784kx2.f37591b = iM16585a;
                        }
                    }
                } else {
                    c0784kx2.m14950a();
                    if (this.f1043d) {
                        iM16585a = c0826ml.m16585a() - 1;
                    } else {
                        iM16585a = 0;
                    }
                    c0784kx2.f37591b = iM16585a;
                }
            } else {
                int i6 = this.f1051l;
                c0784kx2.f37591b = i6;
                C0788la c0788la2 = this.f1053n;
                if (c0788la2 != null && c0788la2.m15113b()) {
                    boolean z5 = c0788la2.f37800c;
                    c0784kx2.f37593d = z5;
                    if (z5) {
                        c0784kx2.f37592c = this.f1049j.mo15751f() - this.f1053n.f37799b;
                    } else {
                        c0784kx2.f37592c = this.f1049j.mo15755j() + this.f1053n.f37799b;
                    }
                } else if (this.f1052m == Integer.MIN_VALUE) {
                    View viewMo1153M2 = mo1153M(i6);
                    if (viewMo1153M2 == null) {
                        if (m16164aj() > 0) {
                            c0784kx2.f37593d = (this.f1051l < m16136be(m16174av(0))) == this.f1050k;
                        }
                        c0784kx2.m14950a();
                    } else if (this.f1049j.mo15747b(viewMo1153M2) > this.f1049j.mo15756k()) {
                        c0784kx2.m14950a();
                    } else if (this.f1049j.mo15749d(viewMo1153M2) - this.f1049j.mo15755j() < 0) {
                        c0784kx2.f37592c = this.f1049j.mo15755j();
                        c0784kx2.f37593d = false;
                    } else if (this.f1049j.mo15751f() - this.f1049j.mo15746a(viewMo1153M2) < 0) {
                        c0784kx2.f37592c = this.f1049j.mo15751f();
                        c0784kx2.f37593d = true;
                    } else {
                        c0784kx2.f37592c = c0784kx2.f37593d ? this.f1049j.mo15746a(viewMo1153M2) + this.f1049j.m15799o() : this.f1049j.mo15749d(viewMo1153M2);
                    }
                } else {
                    boolean z6 = this.f1050k;
                    c0784kx2.f37593d = z6;
                    if (z6) {
                        c0784kx2.f37592c = this.f1049j.mo15751f() - this.f1052m;
                    } else {
                        c0784kx2.f37592c = this.f1049j.mo15755j() + this.f1052m;
                    }
                }
            }
            this.f1054o.f37594e = true;
        } else if (viewM16175aw2 != null && (this.f1049j.mo15749d(viewM16175aw2) >= this.f1049j.mo15751f() || this.f1049j.mo15746a(viewM16175aw2) <= this.f1049j.mo15755j())) {
            this.f1054o.m14952c(viewM16175aw2, m16136be(viewM16175aw2));
        }
        C0786kz c0786kz = this.f1040a;
        c0786kz.f37757f = c0786kz.f37762k >= 0 ? 1 : -1;
        int[] iArr = this.f1047h;
        iArr[0] = 0;
        iArr[1] = 0;
        mo1155O(c0826ml, iArr);
        int iMax = Math.max(0, this.f1047h[0]) + this.f1049j.mo15755j();
        int iMax2 = Math.max(0, this.f1047h[1]) + this.f1049j.mo15752g();
        if (c0826ml.f40922g && (i4 = this.f1051l) != -1 && this.f1052m != Integer.MIN_VALUE && (viewMo1153M = mo1153M(i4)) != null) {
            int iMo15751f2 = this.f1050k ? (this.f1049j.mo15751f() - this.f1049j.mo15746a(viewMo1153M)) - this.f1052m : this.f1052m - (this.f1049j.mo15749d(viewMo1153M) - this.f1049j.mo15755j());
            if (iMo15751f2 > 0) {
                iMax += iMo15751f2;
            } else {
                iMax2 -= iMo15751f2;
            }
        }
        C0784kx c0784kx3 = this.f1054o;
        if (!c0784kx3.f37593d ? true != this.f1050k : true == this.f1050k) {
            i5 = 1;
        }
        mo1104l(c0818md, c0826ml, c0784kx3, i5);
        m16146aC(c0818md);
        this.f1040a.f37764m = m1166Z();
        C0786kz c0786kz2 = this.f1040a;
        c0786kz2.f37761j = c0826ml.f40922g;
        c0786kz2.f37760i = 0;
        C0784kx c0784kx4 = this.f1054o;
        if (c0784kx4.f37593d) {
            m1131bH(c0784kx4);
            C0786kz c0786kz3 = this.f1040a;
            c0786kz3.f37759h = iMax;
            m1147G(c0818md, c0786kz3, c0826ml, false);
            C0786kz c0786kz4 = this.f1040a;
            i3 = c0786kz4.f37753b;
            int i7 = c0786kz4.f37755d;
            int i8 = c0786kz4.f37754c;
            if (i8 > 0) {
                iMax2 += i8;
            }
            m1129bF(this.f1054o);
            C0786kz c0786kz5 = this.f1040a;
            c0786kz5.f37759h = iMax2;
            c0786kz5.f37755d += c0786kz5.f37756e;
            m1147G(c0818md, c0786kz5, c0826ml, false);
            C0786kz c0786kz6 = this.f1040a;
            i2 = c0786kz6.f37753b;
            int i9 = c0786kz6.f37754c;
            if (i9 > 0) {
                m1132bI(i7, i3);
                C0786kz c0786kz7 = this.f1040a;
                c0786kz7.f37759h = i9;
                m1147G(c0818md, c0786kz7, c0826ml, false);
                i3 = this.f1040a.f37753b;
            }
        } else {
            m1129bF(c0784kx4);
            C0786kz c0786kz8 = this.f1040a;
            c0786kz8.f37759h = iMax2;
            m1147G(c0818md, c0786kz8, c0826ml, false);
            C0786kz c0786kz9 = this.f1040a;
            i2 = c0786kz9.f37753b;
            int i10 = c0786kz9.f37755d;
            int i11 = c0786kz9.f37754c;
            if (i11 > 0) {
                iMax += i11;
            }
            m1131bH(this.f1054o);
            C0786kz c0786kz10 = this.f1040a;
            c0786kz10.f37759h = iMax;
            c0786kz10.f37755d += c0786kz10.f37756e;
            m1147G(c0818md, c0786kz10, c0826ml, false);
            C0786kz c0786kz11 = this.f1040a;
            i3 = c0786kz11.f37753b;
            int i12 = c0786kz11.f37754c;
            if (i12 > 0) {
                m1130bG(i10, i2);
                C0786kz c0786kz12 = this.f1040a;
                c0786kz12.f37759h = i12;
                m1147G(c0818md, c0786kz12, c0826ml, false);
                i2 = this.f1040a.f37753b;
            }
        }
        if (m16164aj() > 0) {
            if (this.f1050k ^ this.f1043d) {
                int iM1135bv = m1135bv(i2, c0818md, c0826ml, true);
                int i13 = i3 + iM1135bv;
                int i14 = i2 + iM1135bv;
                int iM1136bw = m1136bw(i13, c0818md, c0826ml, false);
                i3 = i13 + iM1136bw;
                i2 = i14 + iM1136bw;
            } else {
                int iM1136bw2 = m1136bw(i3, c0818md, c0826ml, true);
                int i15 = i3 + iM1136bw2;
                int i16 = i2 + iM1136bw2;
                int iM1135bv2 = m1135bv(i16, c0818md, c0826ml, false);
                i3 = i15 + iM1135bv2;
                i2 = i16 + iM1135bv2;
            }
        }
        if (c0826ml.f40926k && m16164aj() != 0 && !c0826ml.f40922g && mo1112t()) {
            List list = c0818md.f40024d;
            int size = list.size();
            int iBe = m16136be(m16174av(0));
            int iMo15747b = 0;
            int iMo15747b2 = 0;
            for (int i17 = 0; i17 < size; i17++) {
                C0829mo c0829mo = (C0829mo) list.get(i17);
                if (!c0829mo.m16694u()) {
                    if ((c0829mo.m16675b() < iBe) != this.f1050k) {
                        iMo15747b += this.f1049j.mo15747b(c0829mo.f41155a);
                    } else {
                        iMo15747b2 += this.f1049j.mo15747b(c0829mo.f41155a);
                    }
                }
            }
            this.f1040a.f37763l = list;
            if (iMo15747b > 0) {
                m1132bI(m16136be(m1124bA()), i3);
                C0786kz c0786kz13 = this.f1040a;
                c0786kz13.f37759h = iMo15747b;
                c0786kz13.f37754c = 0;
                c0786kz13.m15081b();
                m1147G(c0818md, this.f1040a, c0826ml, false);
            }
            if (iMo15747b2 > 0) {
                m1130bG(m16136be(m1139bz()), i2);
                C0786kz c0786kz14 = this.f1040a;
                c0786kz14.f37759h = iMo15747b2;
                c0786kz14.f37754c = 0;
                c0786kz14.m15081b();
                m1147G(c0818md, this.f1040a, c0826ml, false);
            }
            this.f1040a.f37763l = null;
        }
        if (c0826ml.f40922g) {
            this.f1054o.m14953d();
        } else {
            AbstractC0803lp abstractC0803lp = this.f1049j;
            abstractC0803lp.f38878b = abstractC0803lp.mo15756k();
        }
        this.f1041b = this.f1043d;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: p */
    public void mo1108p(C0826ml c0826ml) {
        this.f1053n = null;
        this.f1051l = -1;
        this.f1052m = Integer.MIN_VALUE;
        this.f1054o.m14953d();
    }

    /* JADX INFO: renamed from: r */
    public void mo1110r(boolean z) {
        mo1154N(null);
        if (this.f1043d == z) {
            return;
        }
        this.f1043d = z;
        m16155aP();
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: t */
    public boolean mo1112t() {
        return this.f1053n == null && this.f1041b == this.f1043d;
    }

    /* JADX INFO: renamed from: u */
    public void mo1113u(C0826ml c0826ml, C0786kz c0786kz, C0778kr c0778kr) {
        int i = c0786kz.f37755d;
        if (i < 0 || i >= c0826ml.m16585a()) {
            return;
        }
        c0778kr.m14735a(i, Math.max(0, c0786kz.f37758g));
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: z */
    public final int mo1175z(C0826ml c0826ml) {
        return m1140c(c0826ml);
    }

    public LinearLayoutManager(int i) {
        this.f1048i = 1;
        this.f1042c = false;
        this.f1050k = false;
        this.f1043d = false;
        this.f1044e = true;
        this.f1051l = -1;
        this.f1052m = Integer.MIN_VALUE;
        this.f1053n = null;
        this.f1054o = new C0784kx();
        this.f1045f = new C0785ky();
        this.f1046g = 2;
        this.f1047h = new int[2];
        m1160T(i);
        m1161U(false);
    }

    /* JADX INFO: renamed from: bC */
    private final void m1126bC(C0818md c0818md, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                m16153aN(i, c0818md);
                i--;
            }
        } else {
            while (true) {
                i2--;
                if (i2 < i) {
                    return;
                } else {
                    m16153aN(i2, c0818md);
                }
            }
        }
    }

    /* JADX INFO: renamed from: F */
    final int m1146F(int i) {
        switch (i) {
            case 1:
                return (this.f1048i != 1 && m1165Y()) ? 1 : -1;
            case 2:
                return (this.f1048i != 1 && m1165Y()) ? -1 : 1;
            case 17:
                return this.f1048i == 0 ? -1 : Integer.MIN_VALUE;
            case 33:
                return this.f1048i == 1 ? -1 : Integer.MIN_VALUE;
            case 66:
                return this.f1048i == 0 ? 1 : Integer.MIN_VALUE;
            case 130:
                return this.f1048i == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: ac */
    public final void mo1169ac(int i, C0778kr c0778kr) {
        boolean z;
        int i2;
        C0788la c0788la = this.f1053n;
        if (c0788la == null || !c0788la.m15113b()) {
            m1127bD();
            z = this.f1050k;
            i2 = this.f1051l;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            z = c0788la.f37800c;
            i2 = c0788la.f37798a;
        }
        int i3 = true != z ? 1 : -1;
        for (int i4 = 0; i4 < this.f1046g && i2 >= 0 && i2 < i; i4++) {
            c0778kr.m14735a(i2, 0);
            i2 += i3;
        }
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f1048i = 1;
        this.f1042c = false;
        this.f1050k = false;
        this.f1043d = false;
        this.f1044e = true;
        this.f1051l = -1;
        this.f1052m = Integer.MIN_VALUE;
        this.f1053n = null;
        this.f1054o = new C0784kx();
        this.f1045f = new C0785ky();
        this.f1046g = 2;
        this.f1047h = new int[2];
        C0811lx c0811lxAt = m16130at(context, attributeSet, i, i2);
        m1160T(c0811lxAt.f39493a);
        m1161U(c0811lxAt.f39495c);
        mo1110r(c0811lxAt.f39496d);
    }
}
