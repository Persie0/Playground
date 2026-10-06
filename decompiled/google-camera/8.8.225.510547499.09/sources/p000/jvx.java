package p000;

import android.support.v7.widget.RecyclerView;
import androidx.wear.ambient.AmbientMode;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class jvx {

    /* JADX INFO: renamed from: a */
    public final Object f34925a;

    /* JADX INFO: renamed from: b */
    public int f34926b;

    /* JADX INFO: renamed from: c */
    public final Object f34927c;

    /* JADX INFO: renamed from: d */
    public final Object f34928d;

    /* JADX INFO: renamed from: e */
    private final Object f34929e;

    public jvx(AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f34925a = new aee(30);
        this.f34928d = new ArrayList();
        this.f34927c = new ArrayList();
        this.f34926b = 0;
        this.f34929e = ambientController;
    }

    /* JADX INFO: renamed from: n */
    private final int m13590n(int i, int i2) {
        for (int size = ((ArrayList) this.f34927c).size() - 1; size >= 0; size--) {
            C0264ih c0264ih = (C0264ih) ((ArrayList) this.f34927c).get(size);
            int i3 = c0264ih.f30905a;
            int i4 = c0264ih.f30906b;
            if (i4 <= i) {
                if (i3 == 1) {
                    i -= c0264ih.f30908d;
                } else if (i3 == 2) {
                    i += c0264ih.f30908d;
                }
            } else if (i2 == 1) {
                c0264ih.f30906b = i4 + 1;
            } else if (i2 == 2) {
                c0264ih.f30906b = i4 - 1;
            }
        }
        for (int size2 = ((ArrayList) this.f34927c).size() - 1; size2 >= 0; size2--) {
            C0264ih c0264ih2 = (C0264ih) ((ArrayList) this.f34927c).get(size2);
            int i5 = c0264ih2.f30905a;
            if (c0264ih2.f30908d <= 0) {
                ((ArrayList) this.f34927c).remove(size2);
                m13602i(c0264ih2);
            }
        }
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:21:0x0051  */
    /* JADX WARN: Code duplicated, block: B:23:0x0054  */
    /* JADX WARN: Code duplicated, block: B:24:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX INFO: renamed from: o */
    private final void m13591o(C0264ih c0264ih) {
        int i;
        boolean z;
        int i2 = c0264ih.f30905a;
        if (i2 == 1) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iM13590n = m13590n(c0264ih.f30906b, i2);
        int i3 = c0264ih.f30906b;
        switch (c0264ih.f30905a) {
            case 2:
                i = 0;
                break;
            case 3:
            default:
                StringBuilder sb = new StringBuilder();
                sb.append("op should be remove or update.");
                sb.append(c0264ih);
                throw new IllegalArgumentException("op should be remove or update.".concat(String.valueOf(c0264ih)));
            case 4:
                i = 1;
                break;
        }
        int i4 = 1;
        for (int i5 = 1; i5 < c0264ih.f30908d; i5++) {
            int iM13590n2 = m13590n(c0264ih.f30906b + (i * i5), c0264ih.f30905a);
            int i6 = c0264ih.f30905a;
            switch (i6) {
                case 2:
                    if (iM13590n2 == iM13590n) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i4++;
                    } else {
                        C0264ih c0264ihM13597d = m13597d(i6, iM13590n, i4, c0264ih.f30907c);
                        m13600g(c0264ihM13597d, i3);
                        m13602i(c0264ihM13597d);
                        if (c0264ih.f30905a == 4) {
                            i3 += i4;
                        }
                        iM13590n = iM13590n2;
                        i4 = 1;
                    }
                    break;
                case 3:
                default:
                    C0264ih c0264ihM13597d2 = m13597d(i6, iM13590n, i4, c0264ih.f30907c);
                    m13600g(c0264ihM13597d2, i3);
                    m13602i(c0264ihM13597d2);
                    if (c0264ih.f30905a == 4) {
                        i3 += i4;
                    }
                    iM13590n = iM13590n2;
                    i4 = 1;
                    break;
                case 4:
                    if (iM13590n2 == iM13590n + 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        i4++;
                    } else {
                        C0264ih c0264ihM13597d3 = m13597d(i6, iM13590n, i4, c0264ih.f30907c);
                        m13600g(c0264ihM13597d3, i3);
                        m13602i(c0264ihM13597d3);
                        if (c0264ih.f30905a == 4) {
                            i3 += i4;
                        }
                        iM13590n = iM13590n2;
                        i4 = 1;
                    }
                    break;
            }
        }
        Object obj = c0264ih.f30907c;
        m13602i(c0264ih);
        if (i4 > 0) {
            C0264ih c0264ihM13597d4 = m13597d(c0264ih.f30905a, iM13590n, i4, obj);
            m13600g(c0264ihM13597d4, i3);
            m13602i(c0264ihM13597d4);
        }
    }

    /* JADX INFO: renamed from: p */
    private final void m13592p(C0264ih c0264ih) {
        ((ArrayList) this.f34927c).add(c0264ih);
        switch (c0264ih.f30905a) {
            case 1:
                ((AmbientMode.AmbientController) this.f34929e).m1634g(c0264ih.f30906b, c0264ih.f30908d);
                return;
            case 2:
                Object obj = this.f34929e;
                AmbientMode.AmbientController ambientController = (AmbientMode.AmbientController) obj;
                ((RecyclerView) ambientController.f1697a).m1214M(c0264ih.f30906b, c0264ih.f30908d, false);
                ((RecyclerView) ambientController.f1697a).f1076N = true;
                return;
            case 3:
            default:
                StringBuilder sb = new StringBuilder();
                String str = hiCTUJiAxf.zXciLa;
                sb.append(str);
                sb.append(c0264ih);
                throw new IllegalArgumentException(str.concat(String.valueOf(c0264ih)));
            case 4:
                ((AmbientMode.AmbientController) this.f34929e).m1633f(c0264ih.f30906b, c0264ih.f30908d, c0264ih.f30907c);
                return;
        }
    }

    /* JADX INFO: renamed from: q */
    private final boolean m13593q(int i) {
        int size = ((ArrayList) this.f34927c).size();
        for (int i2 = 0; i2 < size; i2++) {
            C0264ih c0264ih = (C0264ih) ((ArrayList) this.f34927c).get(i2);
            if (c0264ih.f30905a == 1) {
                int i3 = c0264ih.f30906b;
                int i4 = c0264ih.f30908d + i3;
                while (i3 < i4) {
                    if (m13596c(i3, i2 + 1) == i) {
                        return true;
                    }
                    i3++;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kat] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.Deque] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX INFO: renamed from: a */
    public final nps m13594a(Runnable runnable) {
        Object objMo13589a;
        synchronized (this.f34925a) {
            if (this.f34926b >= 2) {
                objMo13589a = this.f34929e.mo13589a(this.f34928d);
                if (objMo13589a == null) {
                    return kxk.m14965K(false);
                }
                this.f34926b--;
            } else {
                objMo13589a = null;
            }
            jvy jvyVar = new jvy(runnable);
            this.f34928d.add(jvyVar);
            this.f34926b++;
            try {
                this.f34927c.execute(new juz(this, 8));
            } catch (RejectedExecutionException e) {
                synchronized (this.f34925a) {
                    jvy jvyVar2 = (jvy) this.f34928d.pollFirst();
                    if (jvyVar2 != null) {
                        jvyVar2.f34931b.mo14894e(false);
                    }
                    this.f34926b--;
                }
            }
            if (objMo13589a != null) {
                ((jvy) objMo13589a).f34931b.mo14894e(false);
            }
            return jvyVar.f34931b;
        }
    }

    /* JADX INFO: renamed from: b */
    public final int m13595b(int i) {
        return m13596c(i, 0);
    }

    /* JADX INFO: renamed from: c */
    final int m13596c(int i, int i2) {
        int size = ((ArrayList) this.f34927c).size();
        while (i2 < size) {
            C0264ih c0264ih = (C0264ih) ((ArrayList) this.f34927c).get(i2);
            int i3 = c0264ih.f30905a;
            int i4 = c0264ih.f30906b;
            if (i4 <= i) {
                if (i3 == 2) {
                    int i5 = c0264ih.f30908d;
                    if (i < i4 + i5) {
                        return -1;
                    }
                    i -= i5;
                } else if (i3 == 1) {
                    i += c0264ih.f30908d;
                }
            }
            i2++;
        }
        return i;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [aed, java.lang.Object] */
    /* JADX INFO: renamed from: d */
    public final C0264ih m13597d(int i, int i2, int i3, Object obj) {
        C0264ih c0264ih = (C0264ih) this.f34925a.mo320a();
        if (c0264ih == null) {
            return new C0264ih(i, i2, i3, obj);
        }
        c0264ih.f30905a = i;
        c0264ih.f30906b = i2;
        c0264ih.f30908d = i3;
        c0264ih.f30907c = obj;
        return c0264ih;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: e */
    public final void m13598e() {
        int size = ((ArrayList) this.f34927c).size();
        for (int i = 0; i < size; i++) {
            ((AmbientMode.AmbientController) this.f34929e).m1632e((C0264ih) ((ArrayList) this.f34927c).get(i));
        }
        m13603j(this.f34927c);
        this.f34926b = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: f */
    public final void m13599f() {
        m13598e();
        int size = ((ArrayList) this.f34928d).size();
        for (int i = 0; i < size; i++) {
            C0264ih c0264ih = (C0264ih) ((ArrayList) this.f34928d).get(i);
            switch (c0264ih.f30905a) {
                case 1:
                    ((AmbientMode.AmbientController) this.f34929e).m1632e(c0264ih);
                    ((AmbientMode.AmbientController) this.f34929e).m1634g(c0264ih.f30906b, c0264ih.f30908d);
                    break;
                case 2:
                    ((AmbientMode.AmbientController) this.f34929e).m1632e(c0264ih);
                    ((AmbientMode.AmbientController) this.f34929e).m1635h(c0264ih.f30906b, c0264ih.f30908d);
                    break;
                case 4:
                    ((AmbientMode.AmbientController) this.f34929e).m1632e(c0264ih);
                    ((AmbientMode.AmbientController) this.f34929e).m1633f(c0264ih.f30906b, c0264ih.f30908d, c0264ih.f30907c);
                    break;
            }
        }
        m13603j(this.f34928d);
        this.f34926b = 0;
    }

    /* JADX INFO: renamed from: g */
    final void m13600g(C0264ih c0264ih, int i) {
        ((AmbientMode.AmbientController) this.f34929e).m1632e(c0264ih);
        switch (c0264ih.f30905a) {
            case 2:
                ((AmbientMode.AmbientController) this.f34929e).m1635h(i, c0264ih.f30908d);
                return;
            case 3:
            default:
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            case 4:
                ((AmbientMode.AmbientController) this.f34929e).m1633f(i, c0264ih.f30908d, c0264ih.f30907c);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: h */
    public final void m13601h() {
        boolean z;
        byte b;
        ?? r0 = this.f34928d;
        for (int size = r0.size() - 1; size >= 0; size--) {
            int i = ((C0264ih) r0.get(size)).f30905a;
        }
        int size2 = ((ArrayList) this.f34928d).size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0264ih c0264ihM13597d = (C0264ih) ((ArrayList) this.f34928d).get(i2);
            switch (c0264ihM13597d.f30905a) {
                case 1:
                    m13592p(c0264ihM13597d);
                    break;
                case 2:
                    int i3 = c0264ihM13597d.f30906b;
                    int i4 = c0264ihM13597d.f30908d + i3;
                    int i5 = i3;
                    int i6 = 0;
                    byte b2 = -1;
                    while (i5 < i4) {
                        if (((AmbientMode.AmbientController) this.f34929e).m1631d(i5) != null || m13593q(i5)) {
                            if (b2 == 0) {
                                m13591o(m13597d(2, i3, i6, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 1;
                        } else {
                            if (b2 == 1) {
                                m13592p(m13597d(2, i3, i6, null));
                                z = true;
                            } else {
                                z = false;
                            }
                            b = 0;
                        }
                        if (z) {
                            i5 -= i6;
                            i4 -= i6;
                            i6 = 1;
                        } else {
                            i6++;
                        }
                        i5++;
                        b2 = b;
                    }
                    if (i6 != c0264ihM13597d.f30908d) {
                        m13602i(c0264ihM13597d);
                        c0264ihM13597d = m13597d(2, i3, i6, null);
                    }
                    if (b2 == 0) {
                        m13591o(c0264ihM13597d);
                    } else {
                        m13592p(c0264ihM13597d);
                    }
                    break;
                case 4:
                    int i7 = c0264ihM13597d.f30906b;
                    int i8 = c0264ihM13597d.f30908d + i7;
                    int i9 = i7;
                    int i10 = 0;
                    byte b3 = -1;
                    while (i7 < i8) {
                        if (((AmbientMode.AmbientController) this.f34929e).m1631d(i7) != null || m13593q(i7)) {
                            if (b3 == 0) {
                                m13591o(m13597d(4, i9, i10, c0264ihM13597d.f30907c));
                                i9 = i7;
                                i10 = 0;
                            }
                            b3 = 1;
                        } else {
                            if (b3 == 1) {
                                m13592p(m13597d(4, i9, i10, c0264ihM13597d.f30907c));
                                i9 = i7;
                                i10 = 0;
                            }
                            b3 = 0;
                        }
                        i10++;
                        i7++;
                    }
                    if (i10 != c0264ihM13597d.f30908d) {
                        Object obj = c0264ihM13597d.f30907c;
                        m13602i(c0264ihM13597d);
                        c0264ihM13597d = m13597d(4, i9, i10, obj);
                    }
                    if (b3 == 0) {
                        m13591o(c0264ihM13597d);
                    } else {
                        m13592p(c0264ihM13597d);
                    }
                    break;
            }
        }
        ((ArrayList) this.f34928d).clear();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [aed, java.lang.Object] */
    /* JADX INFO: renamed from: i */
    public final void m13602i(C0264ih c0264ih) {
        c0264ih.f30907c = null;
        this.f34925a.mo321b(c0264ih);
    }

    /* JADX INFO: renamed from: j */
    final void m13603j(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            m13602i((C0264ih) list.get(i));
        }
        list.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: k */
    public final void m13604k() {
        m13603j(this.f34928d);
        m13603j(this.f34927c);
        this.f34926b = 0;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m13605l(int i) {
        return (i & this.f34926b) != 0;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m13606m() {
        return ((ArrayList) this.f34928d).size() > 0;
    }

    public jvx(Executor executor, kat katVar) {
        this.f34925a = new Object();
        this.f34928d = new ArrayDeque();
        this.f34926b = 0;
        lku.m15669w(true);
        this.f34927c = executor;
        this.f34929e = katVar;
    }
}
