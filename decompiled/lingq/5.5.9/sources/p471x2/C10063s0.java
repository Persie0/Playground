package p471x2;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.support.v4.media.session.C0166e;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.WeakHashMap;
import p312p2.C8170b;
import p312p2.C8178j;
import p387t0.C9133a;
import p387t0.C9135b;
import p446w2.C9804b;

/* JADX INFO: renamed from: x2.s0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10063s0 {

    /* JADX INFO: renamed from: b */
    public static final C10063s0 f51076b;

    /* JADX INFO: renamed from: a */
    public final k f51077a;

    /* JADX INFO: renamed from: x2.s0$a */
    @SuppressLint({"SoonBlockedPrivateApi"})
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final Field f51078a;

        /* JADX INFO: renamed from: b */
        public static final Field f51079b;

        /* JADX INFO: renamed from: c */
        public static final Field f51080c;

        /* JADX INFO: renamed from: d */
        public static final boolean f51081d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f51078a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f51079b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f51080c = declaredField3;
                declaredField3.setAccessible(true);
                f51081d = true;
            } catch (ReflectiveOperationException e10) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e10.getMessage(), e10);
            }
        }
    }

    /* JADX INFO: renamed from: x2.s0$b */
    public static class b extends e {

        /* JADX INFO: renamed from: e */
        public static Field f51082e;

        /* JADX INFO: renamed from: f */
        public static boolean f51083f;

        /* JADX INFO: renamed from: g */
        public static Constructor<WindowInsets> f51084g;

        /* JADX INFO: renamed from: h */
        public static boolean f51085h;

        /* JADX INFO: renamed from: c */
        public WindowInsets f51086c;

        /* JADX INFO: renamed from: d */
        public C8170b f51087d;

        public b() {
            this.f51086c = m18871i();
        }

        public b(C10063s0 c10063s0) {
            super(c10063s0);
            this.f51086c = c10063s0.m18870h();
        }

        /* JADX INFO: renamed from: i */
        private static WindowInsets m18871i() {
            if (!f51083f) {
                try {
                    f51082e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e10);
                }
                f51083f = true;
            }
            Field field = f51082e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e11);
                }
            }
            if (!f51085h) {
                try {
                    f51084g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e12) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e12);
                }
                f51085h = true;
            }
            Constructor<WindowInsets> constructor = f51084g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e13) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e13);
                }
            }
            return null;
        }

        @Override // p471x2.C10063s0.e
        /* JADX INFO: renamed from: b */
        public C10063s0 mo18872b() {
            m18879a();
            C10063s0 c10063s0M18863i = C10063s0.m18863i(null, this.f51086c);
            C8170b[] c8170bArr = this.f51090b;
            k kVar = c10063s0M18863i.f51077a;
            kVar.mo18889o(c8170bArr);
            kVar.mo18897q(this.f51087d);
            return c10063s0M18863i;
        }

        @Override // p471x2.C10063s0.e
        /* JADX INFO: renamed from: e */
        public void mo18873e(C8170b c8170b) {
            this.f51087d = c8170b;
        }

        @Override // p471x2.C10063s0.e
        /* JADX INFO: renamed from: g */
        public void mo18874g(C8170b c8170b) {
            WindowInsets windowInsets = this.f51086c;
            if (windowInsets != null) {
                this.f51086c = windowInsets.replaceSystemWindowInsets(c8170b.f44302a, c8170b.f44303b, c8170b.f44304c, c8170b.f44305d);
            }
        }
    }

    /* JADX INFO: renamed from: x2.s0$c */
    public static class c extends e {

        /* JADX INFO: renamed from: c */
        public final WindowInsets.Builder f51088c;

        public c() {
            C9135b.m17387f();
            this.f51088c = C8178j.m16268f();
        }

        public c(C10063s0 c10063s0) {
            WindowInsets.Builder builderM16268f;
            super(c10063s0);
            WindowInsets windowInsetsM18870h = c10063s0.m18870h();
            if (windowInsetsM18870h != null) {
                C9135b.m17387f();
                builderM16268f = C9133a.m17367e(windowInsetsM18870h);
            } else {
                C9135b.m17387f();
                builderM16268f = C8178j.m16268f();
            }
            this.f51088c = builderM16268f;
        }

        @Override // p471x2.C10063s0.e
        /* JADX INFO: renamed from: b */
        public C10063s0 mo18872b() {
            m18879a();
            C10063s0 c10063s0M18863i = C10063s0.m18863i(null, this.f51088c.build());
            c10063s0M18863i.f51077a.mo18889o(this.f51090b);
            return c10063s0M18863i;
        }

        @Override // p471x2.C10063s0.e
        /* JADX INFO: renamed from: d */
        public void mo18875d(C8170b c8170b) {
            this.f51088c.setMandatorySystemGestureInsets(c8170b.m16220d());
        }

        @Override // p471x2.C10063s0.e
        /* JADX INFO: renamed from: e */
        public void mo18873e(C8170b c8170b) {
            this.f51088c.setStableInsets(c8170b.m16220d());
        }

        @Override // p471x2.C10063s0.e
        /* JADX INFO: renamed from: f */
        public void mo18876f(C8170b c8170b) {
            this.f51088c.setSystemGestureInsets(c8170b.m16220d());
        }

        @Override // p471x2.C10063s0.e
        /* JADX INFO: renamed from: g */
        public void mo18874g(C8170b c8170b) {
            this.f51088c.setSystemWindowInsets(c8170b.m16220d());
        }

        @Override // p471x2.C10063s0.e
        /* JADX INFO: renamed from: h */
        public void mo18877h(C8170b c8170b) {
            this.f51088c.setTappableElementInsets(c8170b.m16220d());
        }
    }

    /* JADX INFO: renamed from: x2.s0$d */
    public static class d extends c {
        public d() {
        }

        public d(C10063s0 c10063s0) {
            super(c10063s0);
        }

        @Override // p471x2.C10063s0.e
        /* JADX INFO: renamed from: c */
        public void mo18878c(int i10, C8170b c8170b) {
            this.f51088c.setInsets(m.m18904a(i10), c8170b.m16220d());
        }
    }

    /* JADX INFO: renamed from: x2.s0$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final C10063s0 f51089a;

        /* JADX INFO: renamed from: b */
        public C8170b[] f51090b;

        public e() {
            this(new C10063s0());
        }

        public e(C10063s0 c10063s0) {
            this.f51089a = c10063s0;
        }

        /* JADX INFO: renamed from: a */
        public final void m18879a() {
            C8170b[] c8170bArr = this.f51090b;
            if (c8170bArr != null) {
                C8170b c8170bM18864a = c8170bArr[l.m18903a(1)];
                C8170b c8170bM18864a2 = this.f51090b[l.m18903a(2)];
                C10063s0 c10063s0 = this.f51089a;
                if (c8170bM18864a2 == null) {
                    c8170bM18864a2 = c10063s0.m18864a(2);
                }
                if (c8170bM18864a == null) {
                    c8170bM18864a = c10063s0.m18864a(1);
                }
                mo18874g(C8170b.m16217a(c8170bM18864a, c8170bM18864a2));
                C8170b c8170b = this.f51090b[l.m18903a(16)];
                if (c8170b != null) {
                    mo18876f(c8170b);
                }
                C8170b c8170b2 = this.f51090b[l.m18903a(32)];
                if (c8170b2 != null) {
                    mo18875d(c8170b2);
                }
                C8170b c8170b3 = this.f51090b[l.m18903a(64)];
                if (c8170b3 != null) {
                    mo18877h(c8170b3);
                }
            }
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: b */
        public C10063s0 mo18872b() {
            throw null;
        }

        /* JADX INFO: renamed from: c */
        public void mo18878c(int i10, C8170b c8170b) {
            if (this.f51090b == null) {
                this.f51090b = new C8170b[9];
            }
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    this.f51090b[l.m18903a(i11)] = c8170b;
                }
            }
        }

        /* JADX INFO: renamed from: d */
        public void mo18875d(C8170b c8170b) {
        }

        /* JADX INFO: renamed from: e */
        public void mo18873e(C8170b c8170b) {
            throw null;
        }

        /* JADX INFO: renamed from: f */
        public void mo18876f(C8170b c8170b) {
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: g */
        public void mo18874g(C8170b c8170b) {
            throw null;
        }

        /* JADX INFO: renamed from: h */
        public void mo18877h(C8170b c8170b) {
        }
    }

    /* JADX INFO: renamed from: x2.s0$f */
    public static class f extends k {

        /* JADX INFO: renamed from: h */
        public static boolean f51091h;

        /* JADX INFO: renamed from: i */
        public static Method f51092i;

        /* JADX INFO: renamed from: j */
        public static Class<?> f51093j;

        /* JADX INFO: renamed from: k */
        public static Field f51094k;

        /* JADX INFO: renamed from: l */
        public static Field f51095l;

        /* JADX INFO: renamed from: c */
        public final WindowInsets f51096c;

        /* JADX INFO: renamed from: d */
        public C8170b[] f51097d;

        /* JADX INFO: renamed from: e */
        public C8170b f51098e;

        /* JADX INFO: renamed from: f */
        public C10063s0 f51099f;

        /* JADX INFO: renamed from: g */
        public C8170b f51100g;

        public f(C10063s0 c10063s0, WindowInsets windowInsets) {
            super(c10063s0);
            this.f51098e = null;
            this.f51096c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: r */
        private C8170b m18880r(int i10, boolean z10) {
            C8170b c8170bM16217a = C8170b.f44301e;
            for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                if ((i10 & i11) != 0) {
                    c8170bM16217a = C8170b.m16217a(c8170bM16217a, m18891s(i11, z10));
                }
            }
            return c8170bM16217a;
        }

        /* JADX INFO: renamed from: t */
        private C8170b m18881t() {
            C10063s0 c10063s0 = this.f51099f;
            return c10063s0 != null ? c10063s0.f51077a.mo18895h() : C8170b.f44301e;
        }

        /* JADX INFO: renamed from: u */
        private C8170b m18882u(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f51091h) {
                m18883v();
            }
            Method method = f51092i;
            C8170b c8170bM16218b = null;
            if (method != null && f51093j != null) {
                if (f51094k != null) {
                    try {
                        Object objInvoke = method.invoke(view, new Object[0]);
                        if (objInvoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f51094k.get(f51095l.get(objInvoke));
                        if (rect != null) {
                            c8170bM16218b = C8170b.m16218b(rect.left, rect.top, rect.right, rect.bottom);
                        }
                        return c8170bM16218b;
                    } catch (ReflectiveOperationException e10) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
                    }
                }
            }
            return null;
        }

        @SuppressLint({"PrivateApi"})
        /* JADX INFO: renamed from: v */
        private static void m18883v() {
            try {
                f51092i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f51093j = cls;
                f51094k = cls.getDeclaredField("mVisibleInsets");
                f51095l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f51094k.setAccessible(true);
                f51095l.setAccessible(true);
            } catch (ReflectiveOperationException e10) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e10.getMessage(), e10);
            }
            f51091h = true;
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: d */
        public void mo18884d(View view) {
            C8170b c8170bM18882u = m18882u(view);
            if (c8170bM18882u == null) {
                c8170bM18882u = C8170b.f44301e;
            }
            m18892w(c8170bM18882u);
        }

        @Override // p471x2.C10063s0.k
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f51100g, ((f) obj).f51100g);
            }
            return false;
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: f */
        public C8170b mo18885f(int i10) {
            return m18880r(i10, false);
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: j */
        public final C8170b mo18886j() {
            if (this.f51098e == null) {
                WindowInsets windowInsets = this.f51096c;
                this.f51098e = C8170b.m16218b(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.f51098e;
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: l */
        public C10063s0 mo18887l(int i10, int i11, int i12, int i13) {
            e cVar;
            C10063s0 c10063s0M18863i = C10063s0.m18863i(null, this.f51096c);
            int i14 = Build.VERSION.SDK_INT;
            if (i14 >= 30) {
                cVar = new d(c10063s0M18863i);
            } else {
                cVar = i14 >= 29 ? new c(c10063s0M18863i) : new b(c10063s0M18863i);
            }
            cVar.mo18874g(C10063s0.m18862f(mo18886j(), i10, i11, i12, i13));
            cVar.mo18873e(C10063s0.m18862f(mo18895h(), i10, i11, i12, i13));
            return cVar.mo18872b();
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: n */
        public boolean mo18888n() {
            return this.f51096c.isRound();
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: o */
        public void mo18889o(C8170b[] c8170bArr) {
            this.f51097d = c8170bArr;
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: p */
        public void mo18890p(C10063s0 c10063s0) {
            this.f51099f = c10063s0;
        }

        /* JADX INFO: renamed from: s */
        public C8170b m18891s(int i10, boolean z10) {
            C8170b c8170bMo18895h;
            int i11;
            int iM18789c = 0;
            if (i10 == 1) {
                return z10 ? C8170b.m16218b(0, Math.max(m18881t().f44303b, mo18886j().f44303b), 0, 0) : C8170b.m16218b(0, mo18886j().f44303b, 0, 0);
            }
            if (i10 == 2) {
                if (z10) {
                    C8170b c8170bM18881t = m18881t();
                    C8170b c8170bMo18895h2 = mo18895h();
                    return C8170b.m16218b(Math.max(c8170bM18881t.f44302a, c8170bMo18895h2.f44302a), 0, Math.max(c8170bM18881t.f44304c, c8170bMo18895h2.f44304c), Math.max(c8170bM18881t.f44305d, c8170bMo18895h2.f44305d));
                }
                C8170b c8170bMo18886j = mo18886j();
                C10063s0 c10063s0 = this.f51099f;
                c8170bMo18895h = c10063s0 != null ? c10063s0.f51077a.mo18895h() : null;
                int iMin = c8170bMo18886j.f44305d;
                if (c8170bMo18895h != null) {
                    iMin = Math.min(iMin, c8170bMo18895h.f44305d);
                }
                return C8170b.m16218b(c8170bMo18886j.f44302a, 0, c8170bMo18886j.f44304c, iMin);
            }
            C8170b c8170b = C8170b.f44301e;
            if (i10 == 8) {
                C8170b[] c8170bArr = this.f51097d;
                c8170bMo18895h = c8170bArr != null ? c8170bArr[l.m18903a(8)] : null;
                if (c8170bMo18895h != null) {
                    return c8170bMo18895h;
                }
                C8170b c8170bMo18886j2 = mo18886j();
                C8170b c8170bM18881t2 = m18881t();
                int i12 = c8170bMo18886j2.f44305d;
                if (i12 > c8170bM18881t2.f44305d) {
                    return C8170b.m16218b(0, 0, 0, i12);
                }
                C8170b c8170b2 = this.f51100g;
                return (c8170b2 == null || c8170b2.equals(c8170b) || (i11 = this.f51100g.f44305d) <= c8170bM18881t2.f44305d) ? c8170b : C8170b.m16218b(0, 0, 0, i11);
            }
            if (i10 == 16) {
                return mo18901i();
            }
            if (i10 == 32) {
                return mo18900g();
            }
            if (i10 == 64) {
                return mo18902k();
            }
            if (i10 != 128) {
                return c8170b;
            }
            C10063s0 c10063s1 = this.f51099f;
            C10032d c10032dMo18899e = c10063s1 != null ? c10063s1.f51077a.mo18899e() : mo18899e();
            if (c10032dMo18899e == null) {
                return c8170b;
            }
            int i13 = Build.VERSION.SDK_INT;
            DisplayCutout displayCutout = c10032dMo18899e.f51026a;
            int iM18790d = i13 >= 28 ? C10032d.a.m18790d(displayCutout) : 0;
            int iM18792f = i13 >= 28 ? C10032d.a.m18792f(displayCutout) : 0;
            int iM18791e = i13 >= 28 ? C10032d.a.m18791e(displayCutout) : 0;
            if (i13 >= 28) {
                iM18789c = C10032d.a.m18789c(displayCutout);
            }
            return C8170b.m16218b(iM18790d, iM18792f, iM18791e, iM18789c);
        }

        /* JADX INFO: renamed from: w */
        public void m18892w(C8170b c8170b) {
            this.f51100g = c8170b;
        }
    }

    /* JADX INFO: renamed from: x2.s0$g */
    public static class g extends f {

        /* JADX INFO: renamed from: m */
        public C8170b f51101m;

        public g(C10063s0 c10063s0, WindowInsets windowInsets) {
            super(c10063s0, windowInsets);
            this.f51101m = null;
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: b */
        public C10063s0 mo18893b() {
            return C10063s0.m18863i(null, this.f51096c.consumeStableInsets());
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: c */
        public C10063s0 mo18894c() {
            return C10063s0.m18863i(null, this.f51096c.consumeSystemWindowInsets());
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: h */
        public final C8170b mo18895h() {
            if (this.f51101m == null) {
                WindowInsets windowInsets = this.f51096c;
                this.f51101m = C8170b.m16218b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.f51101m;
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: m */
        public boolean mo18896m() {
            return this.f51096c.isConsumed();
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: q */
        public void mo18897q(C8170b c8170b) {
            this.f51101m = c8170b;
        }
    }

    /* JADX INFO: renamed from: x2.s0$h */
    public static class h extends g {
        public h(C10063s0 c10063s0, WindowInsets windowInsets) {
            super(c10063s0, windowInsets);
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: a */
        public C10063s0 mo18898a() {
            return C10063s0.m18863i(null, this.f51096c.consumeDisplayCutout());
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: e */
        public C10032d mo18899e() {
            DisplayCutout displayCutout = this.f51096c.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new C10032d(displayCutout);
        }

        @Override // p471x2.C10063s0.f, p471x2.C10063s0.k
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Objects.equals(this.f51096c, hVar.f51096c) && Objects.equals(this.f51100g, hVar.f51100g);
        }

        @Override // p471x2.C10063s0.k
        public int hashCode() {
            return this.f51096c.hashCode();
        }
    }

    /* JADX INFO: renamed from: x2.s0$i */
    public static class i extends h {

        /* JADX INFO: renamed from: n */
        public C8170b f51102n;

        /* JADX INFO: renamed from: o */
        public C8170b f51103o;

        /* JADX INFO: renamed from: p */
        public C8170b f51104p;

        public i(C10063s0 c10063s0, WindowInsets windowInsets) {
            super(c10063s0, windowInsets);
            this.f51102n = null;
            this.f51103o = null;
            this.f51104p = null;
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: g */
        public C8170b mo18900g() {
            if (this.f51103o == null) {
                this.f51103o = C8170b.m16219c(this.f51096c.getMandatorySystemGestureInsets());
            }
            return this.f51103o;
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: i */
        public C8170b mo18901i() {
            if (this.f51102n == null) {
                this.f51102n = C8170b.m16219c(this.f51096c.getSystemGestureInsets());
            }
            return this.f51102n;
        }

        @Override // p471x2.C10063s0.k
        /* JADX INFO: renamed from: k */
        public C8170b mo18902k() {
            if (this.f51104p == null) {
                this.f51104p = C8170b.m16219c(this.f51096c.getTappableElementInsets());
            }
            return this.f51104p;
        }

        @Override // p471x2.C10063s0.f, p471x2.C10063s0.k
        /* JADX INFO: renamed from: l */
        public C10063s0 mo18887l(int i10, int i11, int i12, int i13) {
            return C10063s0.m18863i(null, this.f51096c.inset(i10, i11, i12, i13));
        }

        @Override // p471x2.C10063s0.g, p471x2.C10063s0.k
        /* JADX INFO: renamed from: q */
        public void mo18897q(C8170b c8170b) {
        }
    }

    /* JADX INFO: renamed from: x2.s0$j */
    public static class j extends i {

        /* JADX INFO: renamed from: q */
        public static final C10063s0 f51105q = C10063s0.m18863i(null, WindowInsets.CONSUMED);

        public j(C10063s0 c10063s0, WindowInsets windowInsets) {
            super(c10063s0, windowInsets);
        }

        @Override // p471x2.C10063s0.f, p471x2.C10063s0.k
        /* JADX INFO: renamed from: d */
        public final void mo18884d(View view) {
        }

        @Override // p471x2.C10063s0.f, p471x2.C10063s0.k
        /* JADX INFO: renamed from: f */
        public C8170b mo18885f(int i10) {
            return C8170b.m16219c(this.f51096c.getInsets(m.m18904a(i10)));
        }
    }

    /* JADX INFO: renamed from: x2.s0$k */
    public static class k {

        /* JADX INFO: renamed from: b */
        public static final C10063s0 f51106b;

        /* JADX INFO: renamed from: a */
        public final C10063s0 f51107a;

        static {
            e cVar;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 30) {
                cVar = new d();
            } else {
                cVar = i10 >= 29 ? new c() : new b();
            }
            f51106b = cVar.mo18872b().f51077a.mo18898a().f51077a.mo18893b().f51077a.mo18894c();
        }

        public k(C10063s0 c10063s0) {
            this.f51107a = c10063s0;
        }

        /* JADX INFO: renamed from: a */
        public C10063s0 mo18898a() {
            return this.f51107a;
        }

        /* JADX INFO: renamed from: b */
        public C10063s0 mo18893b() {
            return this.f51107a;
        }

        /* JADX INFO: renamed from: c */
        public C10063s0 mo18894c() {
            return this.f51107a;
        }

        /* JADX INFO: renamed from: d */
        public void mo18884d(View view) {
        }

        /* JADX INFO: renamed from: e */
        public C10032d mo18899e() {
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return mo18888n() == kVar.mo18888n() && mo18896m() == kVar.mo18896m() && C9804b.m18286a(mo18886j(), kVar.mo18886j()) && C9804b.m18286a(mo18895h(), kVar.mo18895h()) && C9804b.m18286a(mo18899e(), kVar.mo18899e());
        }

        /* JADX INFO: renamed from: f */
        public C8170b mo18885f(int i10) {
            return C8170b.f44301e;
        }

        /* JADX INFO: renamed from: g */
        public C8170b mo18900g() {
            return mo18886j();
        }

        /* JADX INFO: renamed from: h */
        public C8170b mo18895h() {
            return C8170b.f44301e;
        }

        public int hashCode() {
            return C9804b.m18287b(Boolean.valueOf(mo18888n()), Boolean.valueOf(mo18896m()), mo18886j(), mo18895h(), mo18899e());
        }

        /* JADX INFO: renamed from: i */
        public C8170b mo18901i() {
            return mo18886j();
        }

        /* JADX INFO: renamed from: j */
        public C8170b mo18886j() {
            return C8170b.f44301e;
        }

        /* JADX INFO: renamed from: k */
        public C8170b mo18902k() {
            return mo18886j();
        }

        /* JADX INFO: renamed from: l */
        public C10063s0 mo18887l(int i10, int i11, int i12, int i13) {
            return f51106b;
        }

        /* JADX INFO: renamed from: m */
        public boolean mo18896m() {
            return false;
        }

        /* JADX INFO: renamed from: n */
        public boolean mo18888n() {
            return false;
        }

        /* JADX INFO: renamed from: o */
        public void mo18889o(C8170b[] c8170bArr) {
        }

        /* JADX INFO: renamed from: p */
        public void mo18890p(C10063s0 c10063s0) {
        }

        /* JADX INFO: renamed from: q */
        public void mo18897q(C8170b c8170b) {
        }
    }

    /* JADX INFO: renamed from: x2.s0$l */
    public static final class l {
        /* JADX INFO: renamed from: a */
        public static int m18903a(int i10) {
            if (i10 == 1) {
                return 0;
            }
            if (i10 == 2) {
                return 1;
            }
            if (i10 == 4) {
                return 2;
            }
            if (i10 == 8) {
                return 3;
            }
            if (i10 == 16) {
                return 4;
            }
            if (i10 == 32) {
                return 5;
            }
            if (i10 == 64) {
                return 6;
            }
            if (i10 == 128) {
                return 7;
            }
            if (i10 == 256) {
                return 8;
            }
            throw new IllegalArgumentException(C0166e.m761g("type needs to be >= FIRST and <= LAST, type=", i10));
        }
    }

    /* JADX INFO: renamed from: x2.s0$m */
    public static final class m {
        /* JADX INFO: renamed from: a */
        public static int m18904a(int i10) {
            int iStatusBars;
            int i11 = 0;
            for (int i12 = 1; i12 <= 256; i12 <<= 1) {
                if ((i10 & i12) != 0) {
                    if (i12 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i12 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i12 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i12 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i12 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i12 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i12 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i12 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i11 |= iStatusBars;
                }
            }
            return i11;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f51076b = j.f51105q;
        } else {
            f51076b = k.f51106b;
        }
    }

    public C10063s0() {
        this.f51077a = new k(this);
    }

    public C10063s0(WindowInsets windowInsets) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            this.f51077a = new j(this, windowInsets);
            return;
        }
        if (i10 >= 29) {
            this.f51077a = new i(this, windowInsets);
        } else if (i10 >= 28) {
            this.f51077a = new h(this, windowInsets);
        } else {
            this.f51077a = new g(this, windowInsets);
        }
    }

    /* JADX INFO: renamed from: f */
    public static C8170b m18862f(C8170b c8170b, int i10, int i11, int i12, int i13) {
        int iMax = Math.max(0, c8170b.f44302a - i10);
        int iMax2 = Math.max(0, c8170b.f44303b - i11);
        int iMax3 = Math.max(0, c8170b.f44304c - i12);
        int iMax4 = Math.max(0, c8170b.f44305d - i13);
        return (iMax == i10 && iMax2 == i11 && iMax3 == i12 && iMax4 == i13) ? c8170b : C8170b.m16218b(iMax, iMax2, iMax3, iMax4);
    }

    /* JADX INFO: renamed from: i */
    public static C10063s0 m18863i(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        C10063s0 c10063s0 = new C10063s0(windowInsets);
        if (view != null) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            if (C10029b0.g.m18698b(view)) {
                C10063s0 c10063s0M18733a = C10029b0.j.m18733a(view);
                k kVar = c10063s0.f51077a;
                kVar.mo18890p(c10063s0M18733a);
                kVar.mo18884d(view.getRootView());
            }
        }
        return c10063s0;
    }

    /* JADX INFO: renamed from: a */
    public final C8170b m18864a(int i10) {
        return this.f51077a.mo18885f(i10);
    }

    @Deprecated
    /* JADX INFO: renamed from: b */
    public final int m18865b() {
        return this.f51077a.mo18886j().f44305d;
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public final int m18866c() {
        return this.f51077a.mo18886j().f44302a;
    }

    @Deprecated
    /* JADX INFO: renamed from: d */
    public final int m18867d() {
        return this.f51077a.mo18886j().f44304c;
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public final int m18868e() {
        return this.f51077a.mo18886j().f44303b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10063s0)) {
            return false;
        }
        return C9804b.m18286a(this.f51077a, ((C10063s0) obj).f51077a);
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public final C10063s0 m18869g(int i10, int i11, int i12, int i13) {
        e cVar;
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 30) {
            cVar = new d(this);
        } else {
            cVar = i14 >= 29 ? new c(this) : new b(this);
        }
        cVar.mo18874g(C8170b.m16218b(i10, i11, i12, i13));
        return cVar.mo18872b();
    }

    /* JADX INFO: renamed from: h */
    public final WindowInsets m18870h() {
        k kVar = this.f51077a;
        if (kVar instanceof f) {
            return ((f) kVar).f51096c;
        }
        return null;
    }

    public final int hashCode() {
        k kVar = this.f51077a;
        if (kVar == null) {
            return 0;
        }
        return kVar.hashCode();
    }
}
