package p000;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class u5b extends c6b {

    /* JADX INFO: renamed from: n */
    public static boolean f63453n = false;

    /* JADX INFO: renamed from: o */
    public static Method f63454o;

    /* JADX INFO: renamed from: p */
    public static Class f63455p;

    /* JADX INFO: renamed from: q */
    public static Field f63456q;

    /* JADX INFO: renamed from: r */
    public static Field f63457r;

    /* JADX INFO: renamed from: c */
    public final WindowInsets f63458c;

    /* JADX INFO: renamed from: d */
    public l64[] f63459d;

    /* JADX INFO: renamed from: e */
    public l64 f63460e;

    /* JADX INFO: renamed from: f */
    public f6b f63461f;

    /* JADX INFO: renamed from: g */
    public l64 f63462g;

    /* JADX INFO: renamed from: h */
    public int f63463h;

    /* JADX INFO: renamed from: i */
    public th2 f63464i;

    /* JADX INFO: renamed from: j */
    public int f63465j;

    /* JADX INFO: renamed from: k */
    public int f63466k;

    /* JADX INFO: renamed from: l */
    public Rect[][] f63467l;

    /* JADX INFO: renamed from: m */
    public Rect[][] f63468m;

    public u5b(f6b f6bVar, WindowInsets windowInsets) {
        super(f6bVar);
        this.f63460e = null;
        this.f63467l = new Rect[10][];
        this.f63468m = new Rect[10][];
        this.f63458c = windowInsets;
    }

    /* JADX INFO: renamed from: C */
    private th2 m22483C(View view) {
        Display display;
        if (view == null || (display = view.getDisplay()) == null) {
            return null;
        }
        Point point = new Point();
        display.getRealSize(point);
        if (this.f9646a.f38536a.mo4373t()) {
            return th2.m22035a(point.x, point.y, true, 0, 0, 0, 0);
        }
        ri8 ri8VarM10274b = dbd.m10274b(display, 0);
        ri8 ri8VarM10274b2 = dbd.m10274b(display, 1);
        ri8 ri8VarM10274b3 = dbd.m10274b(display, 2);
        ri8 ri8VarM10274b4 = dbd.m10274b(display, 3);
        return th2.m22035a(point.x, point.y, false, ri8VarM10274b != null ? ri8VarM10274b.m20667a() : 0, ri8VarM10274b2 != null ? ri8VarM10274b2.m20667a() : 0, ri8VarM10274b3 != null ? ri8VarM10274b3.m20667a() : 0, ri8VarM10274b4 != null ? ri8VarM10274b4.m20667a() : 0);
    }

    /* JADX INFO: renamed from: D */
    private static List<Rect> m22484D(Rect[][] rectArr, int i) {
        Rect[] rectArr2;
        Rect[] rectArr3 = null;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && (rectArr2 = rectArr[qba.m19850b(i2)]) != null) {
                if (rectArr3 == null) {
                    rectArr3 = rectArr2;
                } else {
                    Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                    System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                    System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                    rectArr3 = rectArr4;
                }
            }
        }
        return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
    }

    /* JADX INFO: renamed from: E */
    private Rect[] m22485E(l64 l64Var) {
        ArrayList arrayList = new ArrayList();
        int i = l64Var.f49116a;
        int i2 = l64Var.f49119d;
        int i3 = l64Var.f49118c;
        int i4 = l64Var.f49117b;
        if (i != 0) {
            arrayList.add(new Rect(0, 0, l64Var.f49116a, this.f63465j));
        }
        if (i4 != 0) {
            arrayList.add(new Rect(0, 0, this.f63466k, i4));
        }
        if (i3 != 0) {
            int i5 = this.f63466k;
            arrayList.add(new Rect(i5 - i3, 0, i5, this.f63465j));
        }
        if (i2 != 0) {
            int i6 = this.f63465j;
            arrayList.add(new Rect(0, i6 - i2, this.f63466k, i6));
        }
        return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
    }

    /* JADX INFO: renamed from: F */
    private l64 m22486F(int i, boolean z) {
        l64 l64VarM15828a = l64.f49115e;
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                l64VarM15828a = l64.m15828a(l64VarM15828a, m22491G(i2, z));
            }
        }
        return l64VarM15828a;
    }

    /* JADX INFO: renamed from: H */
    private l64 m22487H() {
        f6b f6bVar = this.f63461f;
        return f6bVar != null ? f6bVar.f38536a.mo4367l() : l64.f49115e;
    }

    /* JADX INFO: renamed from: I */
    private l64 m22488I(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            C3386nv.m17636w("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            return null;
        }
        if (!f63453n) {
            m22489K();
        }
        Method method = f63454o;
        if (method != null && f63455p != null && f63456q != null) {
            try {
                Object objInvoke = method.invoke(view, null);
                if (objInvoke == null) {
                    Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    return null;
                }
                Rect rect = (Rect) f63456q.get(f63457r.get(objInvoke));
                if (rect != null) {
                    return l64.m15830c(rect.left, rect.top, rect.right, rect.bottom);
                }
                return null;
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: K */
    private static void m22489K() {
        try {
            f63454o = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            f63455p = cls;
            f63456q = cls.getDeclaredField("mVisibleInsets");
            f63457r = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            f63456q.setAccessible(true);
            f63457r.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
        }
        f63453n = true;
    }

    /* JADX INFO: renamed from: L */
    public static boolean m22490L(int i, int i2) {
        return (i & 6) == (i2 & 6);
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: A */
    public void mo4358A(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f63467l = (Rect[][]) rectArr.clone();
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: B */
    public void mo4359B(Rect[][] rectArr) {
        Objects.requireNonNull(rectArr);
        this.f63468m = (Rect[][]) rectArr.clone();
    }

    /* JADX INFO: renamed from: G */
    public l64 m22491G(int i, boolean z) {
        l64 l64VarMo4367l;
        int i2;
        l64 l64Var = l64.f49115e;
        if (i != 1) {
            if (i != 2) {
                if (i == 8) {
                    l64[] l64VarArr = this.f63459d;
                    l64VarMo4367l = l64VarArr != null ? l64VarArr[qba.m19850b(8)] : null;
                    if (l64VarMo4367l != null) {
                        return l64VarMo4367l;
                    }
                    l64 l64VarMo4369n = mo4369n();
                    l64 l64VarM22487H = m22487H();
                    int i3 = l64VarMo4369n.f49119d;
                    if (i3 > l64VarM22487H.f49119d) {
                        return l64.m15830c(0, 0, 0, i3);
                    }
                    l64 l64Var2 = this.f63462g;
                    if (l64Var2 != null && !l64Var2.equals(l64Var) && (i2 = this.f63462g.f49119d) > l64VarM22487H.f49119d) {
                        return l64.m15830c(0, 0, 0, i2);
                    }
                } else {
                    if (i == 16) {
                        return mo4368m();
                    }
                    if (i == 32) {
                        return mo4366k();
                    }
                    if (i == 64) {
                        return mo4370o();
                    }
                    if (i == 128) {
                        f6b f6bVar = this.f63461f;
                        rh2 rh2VarMo4365h = f6bVar != null ? f6bVar.f38536a.mo4365h() : mo4365h();
                        if (rh2VarMo4365h != null) {
                            DisplayCutout displayCutout = rh2VarMo4365h.f59262a;
                            return l64.m15830c(ebd.m11023h(displayCutout), ebd.m11025j(displayCutout), ebd.m11024i(displayCutout), ebd.m11022g(displayCutout));
                        }
                    }
                }
            } else {
                if (z) {
                    l64 l64VarM22487H2 = m22487H();
                    l64 l64VarMo4367l2 = mo4367l();
                    return l64.m15830c(Math.max(l64VarM22487H2.f49116a, l64VarMo4367l2.f49116a), 0, Math.max(l64VarM22487H2.f49118c, l64VarMo4367l2.f49118c), Math.max(l64VarM22487H2.f49119d, l64VarMo4367l2.f49119d));
                }
                if ((this.f63463h & 2) == 0) {
                    l64 l64VarMo4369n2 = mo4369n();
                    f6b f6bVar2 = this.f63461f;
                    l64VarMo4367l = f6bVar2 != null ? f6bVar2.f38536a.mo4367l() : null;
                    int iMin = l64VarMo4369n2.f49119d;
                    if (l64VarMo4367l != null) {
                        iMin = Math.min(iMin, l64VarMo4367l.f49119d);
                    }
                    return l64.m15830c(l64VarMo4369n2.f49116a, 0, l64VarMo4369n2.f49118c, iMin);
                }
            }
        } else {
            if (z) {
                return l64.m15830c(0, Math.max(m22487H().f49117b, mo4369n().f49117b), 0, 0);
            }
            if ((this.f63463h & 4) == 0) {
                return l64.m15830c(0, mo4369n().f49117b, 0, 0);
            }
        }
        return l64Var;
    }

    /* JADX INFO: renamed from: J */
    public boolean m22492J(int i) {
        if (i != 1 && i != 2) {
            if (i == 4) {
                return false;
            }
            if (i != 8 && i != 128) {
                return true;
            }
        }
        return !m22491G(i, false).equals(l64.f49115e);
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: d */
    public void mo4363d(View view) {
        this.f63466k = view.getWidth();
        this.f63465j = view.getHeight();
        l64 l64VarM22488I = m22488I(view);
        if (l64VarM22488I == null) {
            l64VarM22488I = l64.f49115e;
        }
        mo4376x(l64VarM22488I);
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: e */
    public void mo4364e(f6b f6bVar) {
        f6bVar.f38536a.mo4377y(this.f63461f);
        l64 l64Var = this.f63462g;
        c6b c6bVar = f6bVar.f38536a;
        c6bVar.mo4376x(l64Var);
        c6bVar.mo4378z(this.f63463h);
        c6bVar.mo4374v(this.f63464i);
        c6bVar.mo4358A(this.f63467l);
        c6bVar.mo4359B(this.f63468m);
    }

    @Override // p000.c6b
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        u5b u5bVar = (u5b) obj;
        return Objects.equals(this.f63462g, u5bVar.f63462g) && m22490L(this.f63463h, u5bVar.f63463h);
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: f */
    public List<Rect> mo3378f(int i) {
        return m22484D(this.f63467l, i);
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: g */
    public List<Rect> mo3379g(int i) {
        return m22484D(this.f63468m, i);
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: i */
    public l64 mo136i(int i) {
        return m22486F(i, false);
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: j */
    public l64 mo137j(int i) {
        return m22486F(i, true);
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: n */
    public final l64 mo4369n() {
        if (this.f63460e == null) {
            WindowInsets windowInsets = this.f63458c;
            this.f63460e = l64.m15830c(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.f63460e;
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: p */
    public void mo138p(View view) {
        this.f63464i = m22483C(view);
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: q */
    public void mo3380q() {
        for (int i = 1; i <= 512; i <<= 1) {
            int iM19850b = qba.m19850b(i);
            this.f63467l[iM19850b] = m22485E(mo136i(i));
            if (i != 8) {
                this.f63468m[iM19850b] = m22485E(mo137j(i));
            }
        }
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: r */
    public f6b mo4371r(int i, int i2, int i3, int i4) {
        t5b o5bVar;
        f6b f6bVarM11570g = f6b.m11570g(null, this.f63458c);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 36) {
            o5bVar = new s5b(f6bVarM11570g);
        } else if (i5 >= 35) {
            o5bVar = new r5b(f6bVarM11570g);
        } else if (i5 >= 34) {
            o5bVar = new q5b(f6bVarM11570g);
        } else if (i5 >= 31) {
            o5bVar = new p5b(f6bVarM11570g);
        } else {
            o5bVar = i5 >= 30 ? new o5b(f6bVarM11570g) : new n5b(f6bVarM11570g);
        }
        o5bVar.mo17241h(f6b.m11569e(mo4369n(), i, i2, i3, i4));
        o5bVar.mo17239f(f6b.m11569e(mo4367l(), i, i2, i3, i4));
        return o5bVar.mo17237b();
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: t */
    public boolean mo4373t() {
        return this.f63458c.isRound();
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: u */
    public boolean mo139u(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0 && !m22492J(i2)) {
                return false;
            }
        }
        return true;
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: v */
    public void mo4374v(th2 th2Var) {
        this.f63464i = th2Var;
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: w */
    public void mo4375w(l64[] l64VarArr) {
        this.f63459d = l64VarArr;
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: x */
    public void mo4376x(l64 l64Var) {
        this.f63462g = l64Var;
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: y */
    public void mo4377y(f6b f6bVar) {
        this.f63461f = f6bVar;
    }

    @Override // p000.c6b
    /* JADX INFO: renamed from: z */
    public void mo4378z(int i) {
        this.f63463h = i;
    }

    public u5b(f6b f6bVar, u5b u5bVar) {
        this(f6bVar, new WindowInsets(u5bVar.f63458c));
    }
}
