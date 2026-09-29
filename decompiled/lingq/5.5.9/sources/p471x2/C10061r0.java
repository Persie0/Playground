package p471x2;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import com.linguist.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import mc.C7541g;
import p004a3.C0011a;
import p235l5.C7259f;
import p235l5.C7260g;
import p235l5.C7261h;
import p312p2.C8170b;

/* JADX INFO: renamed from: x2.r0 */
/* JADX INFO: loaded from: classes.dex */
public final class C10061r0 {

    /* JADX INFO: renamed from: a */
    public final e f51049a;

    /* JADX INFO: renamed from: x2.r0$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final C8170b f51050a;

        /* JADX INFO: renamed from: b */
        public final C8170b f51051b;

        public a(C8170b c8170b, C8170b c8170b2) {
            this.f51050a = c8170b;
            this.f51051b = c8170b2;
        }

        public final String toString() {
            return "Bounds{lower=" + this.f51050a + " upper=" + this.f51051b + "}";
        }
    }

    /* JADX INFO: renamed from: x2.r0$b */
    public static abstract class b {

        /* JADX INFO: renamed from: a */
        public WindowInsets f51052a;

        /* JADX INFO: renamed from: b */
        public final int f51053b = 0;

        /* JADX INFO: renamed from: a */
        public abstract C10063s0 mo15047a(C10063s0 c10063s0, List<C10061r0> list);
    }

    /* JADX INFO: renamed from: x2.r0$c */
    public static class c extends e {

        /* JADX INFO: renamed from: x2.r0$c$a */
        public static class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a */
            public final b f51054a;

            /* JADX INFO: renamed from: b */
            public C10063s0 f51055b;

            /* JADX INFO: renamed from: x2.r0$c$a$a, reason: collision with other inner class name */
            public class C10680a implements ValueAnimator.AnimatorUpdateListener {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C10061r0 f51056a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C10063s0 f51057b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C10063s0 f51058c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ int f51059d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ View f51060e;

                public C10680a(C10061r0 c10061r0, C10063s0 c10063s0, C10063s0 c10063s1, int i10, View view) {
                    this.f51056a = c10061r0;
                    this.f51057b = c10063s0;
                    this.f51058c = c10063s1;
                    this.f51059d = i10;
                    this.f51060e = view;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float animatedFraction = valueAnimator.getAnimatedFraction();
                    C10061r0 c10061r0 = this.f51056a;
                    c10061r0.f51049a.mo18860d(animatedFraction);
                    float fMo18858b = c10061r0.f51049a.mo18858b();
                    int i10 = Build.VERSION.SDK_INT;
                    C10063s0 c10063s0 = this.f51057b;
                    C10063s0.e dVar = i10 >= 30 ? new C10063s0.d(c10063s0) : i10 >= 29 ? new C10063s0.c(c10063s0) : new C10063s0.b(c10063s0);
                    for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                        if ((this.f51059d & i11) == 0) {
                            dVar.mo18878c(i11, c10063s0.m18864a(i11));
                        } else {
                            C8170b c8170bM18864a = c10063s0.m18864a(i11);
                            C8170b c8170bM18864a2 = this.f51058c.m18864a(i11);
                            float f3 = 1.0f - fMo18858b;
                            dVar.mo18878c(i11, C10063s0.m18862f(c8170bM18864a, (int) (((double) ((c8170bM18864a.f44302a - c8170bM18864a2.f44302a) * f3)) + 0.5d), (int) (((double) ((c8170bM18864a.f44303b - c8170bM18864a2.f44303b) * f3)) + 0.5d), (int) (((double) ((c8170bM18864a.f44304c - c8170bM18864a2.f44304c) * f3)) + 0.5d), (int) (((double) ((c8170bM18864a.f44305d - c8170bM18864a2.f44305d) * f3)) + 0.5d)));
                        }
                    }
                    c.m18853g(this.f51060e, dVar.mo18872b(), Collections.singletonList(c10061r0));
                }
            }

            /* JADX INFO: renamed from: x2.r0$c$a$b */
            public class b extends AnimatorListenerAdapter {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ C10061r0 f51061a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ View f51062b;

                public b(C10061r0 c10061r0, View view) {
                    this.f51061a = c10061r0;
                    this.f51062b = view;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    C10061r0 c10061r0 = this.f51061a;
                    c10061r0.f51049a.mo18860d(1.0f);
                    c.m18851e(this.f51062b, c10061r0);
                }
            }

            /* JADX INFO: renamed from: x2.r0$c$a$c, reason: collision with other inner class name */
            public class RunnableC10681c implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ View f51063a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ C10061r0 f51064b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ a f51065c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ValueAnimator f51066d;

                public RunnableC10681c(View view, C10061r0 c10061r0, a aVar, ValueAnimator valueAnimator) {
                    this.f51063a = view;
                    this.f51064b = c10061r0;
                    this.f51065c = aVar;
                    this.f51066d = valueAnimator;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    c.m18854h(this.f51063a, this.f51064b, this.f51065c);
                    this.f51066d.start();
                }
            }

            public a(View view, C7541g c7541g) {
                C10063s0 c10063s0Mo18872b;
                this.f51054a = c7541g;
                WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                C10063s0 c10063s0M18733a = C10029b0.j.m18733a(view);
                if (c10063s0M18733a != null) {
                    int i10 = Build.VERSION.SDK_INT;
                    c10063s0Mo18872b = (i10 >= 30 ? new C10063s0.d(c10063s0M18733a) : i10 >= 29 ? new C10063s0.c(c10063s0M18733a) : new C10063s0.b(c10063s0M18733a)).mo18872b();
                } else {
                    c10063s0Mo18872b = null;
                }
                this.f51055b = c10063s0Mo18872b;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.f51055b = C10063s0.m18863i(view, windowInsets);
                    return c.m18855i(view, windowInsets);
                }
                C10063s0 c10063s0M18863i = C10063s0.m18863i(view, windowInsets);
                if (this.f51055b == null) {
                    WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
                    this.f51055b = C10029b0.j.m18733a(view);
                }
                if (this.f51055b == null) {
                    this.f51055b = c10063s0M18863i;
                    return c.m18855i(view, windowInsets);
                }
                b bVarM18856j = c.m18856j(view);
                if (bVarM18856j != null && Objects.equals(bVarM18856j.f51052a, windowInsets)) {
                    return c.m18855i(view, windowInsets);
                }
                C10063s0 c10063s0 = this.f51055b;
                int i10 = 0;
                for (int i11 = 1; i11 <= 256; i11 <<= 1) {
                    if (!c10063s0M18863i.m18864a(i11).equals(c10063s0.m18864a(i11))) {
                        i10 |= i11;
                    }
                }
                if (i10 == 0) {
                    return c.m18855i(view, windowInsets);
                }
                C10063s0 c10063s1 = this.f51055b;
                C10061r0 c10061r0 = new C10061r0(i10, new DecelerateInterpolator(), 160L);
                e eVar = c10061r0.f51049a;
                eVar.mo18860d(0.0f);
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(eVar.mo18857a());
                C8170b c8170bM18864a = c10063s0M18863i.m18864a(i10);
                C8170b c8170bM18864a2 = c10063s1.m18864a(i10);
                int iMin = Math.min(c8170bM18864a.f44302a, c8170bM18864a2.f44302a);
                int i12 = c8170bM18864a.f44303b;
                int i13 = c8170bM18864a2.f44303b;
                int iMin2 = Math.min(i12, i13);
                int i14 = c8170bM18864a.f44304c;
                int i15 = c8170bM18864a2.f44304c;
                int iMin3 = Math.min(i14, i15);
                int i16 = c8170bM18864a.f44305d;
                int i17 = i10;
                int i18 = c8170bM18864a2.f44305d;
                a aVar = new a(C8170b.m16218b(iMin, iMin2, iMin3, Math.min(i16, i18)), C8170b.m16218b(Math.max(c8170bM18864a.f44302a, c8170bM18864a2.f44302a), Math.max(i12, i13), Math.max(i14, i15), Math.max(i16, i18)));
                c.m18852f(view, c10061r0, windowInsets, false);
                duration.addUpdateListener(new C10680a(c10061r0, c10063s0M18863i, c10063s1, i17, view));
                duration.addListener(new b(c10061r0, view));
                ViewTreeObserverOnPreDrawListenerC10066u.m18905a(view, new RunnableC10681c(view, c10061r0, aVar, duration));
                this.f51055b = c10063s0M18863i;
                return c.m18855i(view, windowInsets);
            }
        }

        public c(int i10, DecelerateInterpolator decelerateInterpolator, long j10) {
            super(i10, decelerateInterpolator, j10);
        }

        /* JADX INFO: renamed from: e */
        public static void m18851e(View view, C10061r0 c10061r0) {
            b bVarM18856j = m18856j(view);
            if (bVarM18856j != null) {
                ((C7541g) bVarM18856j).f41615c.setTranslationY(0.0f);
                if (bVarM18856j.f51053b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m18851e(viewGroup.getChildAt(i10), c10061r0);
                }
            }
        }

        /* JADX INFO: renamed from: f */
        public static void m18852f(View view, C10061r0 c10061r0, WindowInsets windowInsets, boolean z10) {
            b bVarM18856j = m18856j(view);
            if (bVarM18856j != null) {
                bVarM18856j.f51052a = windowInsets;
                if (!z10) {
                    C7541g c7541g = (C7541g) bVarM18856j;
                    View view2 = c7541g.f41615c;
                    int[] iArr = c7541g.f41618f;
                    view2.getLocationOnScreen(iArr);
                    c7541g.f41616d = iArr[1];
                    z10 = bVarM18856j.f51053b == 0;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m18852f(viewGroup.getChildAt(i10), c10061r0, windowInsets, z10);
                }
            }
        }

        /* JADX INFO: renamed from: g */
        public static void m18853g(View view, C10063s0 c10063s0, List<C10061r0> list) {
            b bVarM18856j = m18856j(view);
            if (bVarM18856j != null) {
                bVarM18856j.mo15047a(c10063s0, list);
                if (bVarM18856j.f51053b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    m18853g(viewGroup.getChildAt(i10), c10063s0, list);
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public static void m18854h(View view, C10061r0 c10061r0, a aVar) {
            b bVarM18856j = m18856j(view);
            if (bVarM18856j != null) {
                C7541g c7541g = (C7541g) bVarM18856j;
                View view2 = c7541g.f41615c;
                int[] iArr = c7541g.f41618f;
                view2.getLocationOnScreen(iArr);
                int i10 = c7541g.f41616d - iArr[1];
                c7541g.f41617e = i10;
                view2.setTranslationY(i10);
                if (bVarM18856j.f51053b == 0) {
                    return;
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i11 = 0; i11 < viewGroup.getChildCount(); i11++) {
                    m18854h(viewGroup.getChildAt(i11), c10061r0, aVar);
                }
            }
        }

        /* JADX INFO: renamed from: i */
        public static WindowInsets m18855i(View view, WindowInsets windowInsets) {
            return view.getTag(R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        /* JADX INFO: renamed from: j */
        public static b m18856j(View view) {
            Object tag = view.getTag(R.id.tag_window_insets_animation_callback);
            if (tag instanceof a) {
                return ((a) tag).f51054a;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: x2.r0$d */
    public static class d extends e {

        /* JADX INFO: renamed from: e */
        public final WindowInsetsAnimation f51067e;

        /* JADX INFO: renamed from: x2.r0$d$a */
        public static class a extends WindowInsetsAnimation.Callback {

            /* JADX INFO: renamed from: a */
            public final b f51068a;

            /* JADX INFO: renamed from: b */
            public List<C10061r0> f51069b;

            /* JADX INFO: renamed from: c */
            public ArrayList<C10061r0> f51070c;

            /* JADX INFO: renamed from: d */
            public final HashMap<WindowInsetsAnimation, C10061r0> f51071d;

            public a(C7541g c7541g) {
                super(c7541g.f51053b);
                this.f51071d = new HashMap<>();
                this.f51068a = c7541g;
            }

            /* JADX INFO: renamed from: a */
            public final C10061r0 m18861a(WindowInsetsAnimation windowInsetsAnimation) {
                C10061r0 c10061r0 = this.f51071d.get(windowInsetsAnimation);
                if (c10061r0 == null) {
                    c10061r0 = new C10061r0(windowInsetsAnimation);
                    this.f51071d.put(windowInsetsAnimation, c10061r0);
                }
                return c10061r0;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f51068a;
                m18861a(windowInsetsAnimation);
                ((C7541g) bVar).f41615c.setTranslationY(0.0f);
                this.f51071d.remove(windowInsetsAnimation);
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
                b bVar = this.f51068a;
                m18861a(windowInsetsAnimation);
                C7541g c7541g = (C7541g) bVar;
                View view = c7541g.f41615c;
                int[] iArr = c7541g.f41618f;
                view.getLocationOnScreen(iArr);
                c7541g.f41616d = iArr[1];
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final WindowInsets onProgress(WindowInsets windowInsets, List<WindowInsetsAnimation> list) {
                ArrayList<C10061r0> arrayList = this.f51070c;
                if (arrayList == null) {
                    ArrayList<C10061r0> arrayList2 = new ArrayList<>(list.size());
                    this.f51070c = arrayList2;
                    this.f51069b = Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                int size = list.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        b bVar = this.f51068a;
                        C10063s0 c10063s0M18863i = C10063s0.m18863i(null, windowInsets);
                        bVar.mo15047a(c10063s0M18863i, this.f51069b);
                        return c10063s0M18863i.m18870h();
                    }
                    WindowInsetsAnimation windowInsetsAnimationM40d = C0011a.m40d(list.get(size));
                    C10061r0 c10061r0M18861a = m18861a(windowInsetsAnimationM40d);
                    c10061r0M18861a.f51049a.mo18860d(windowInsetsAnimationM40d.getFraction());
                    this.f51070c.add(c10061r0M18861a);
                }
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
                b bVar = this.f51068a;
                m18861a(windowInsetsAnimation);
                C8170b c8170bM16219c = C8170b.m16219c(bounds.getLowerBound());
                C8170b c8170bM16219c2 = C8170b.m16219c(bounds.getUpperBound());
                C7541g c7541g = (C7541g) bVar;
                View view = c7541g.f41615c;
                int[] iArr = c7541g.f41618f;
                view.getLocationOnScreen(iArr);
                int i10 = c7541g.f41616d - iArr[1];
                c7541g.f41617e = i10;
                view.setTranslationY(i10);
                C7260g.m14631j();
                return C7259f.m14613i(c8170bM16219c.m16220d(), c8170bM16219c2.m16220d());
            }
        }

        public d(WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.f51067e = windowInsetsAnimation;
        }

        @Override // p471x2.C10061r0.e
        /* JADX INFO: renamed from: a */
        public final long mo18857a() {
            return this.f51067e.getDurationMillis();
        }

        @Override // p471x2.C10061r0.e
        /* JADX INFO: renamed from: b */
        public final float mo18858b() {
            return this.f51067e.getInterpolatedFraction();
        }

        @Override // p471x2.C10061r0.e
        /* JADX INFO: renamed from: c */
        public final int mo18859c() {
            return this.f51067e.getTypeMask();
        }

        @Override // p471x2.C10061r0.e
        /* JADX INFO: renamed from: d */
        public final void mo18860d(float f3) {
            this.f51067e.setFraction(f3);
        }
    }

    /* JADX INFO: renamed from: x2.r0$e */
    public static class e {

        /* JADX INFO: renamed from: a */
        public final int f51072a;

        /* JADX INFO: renamed from: b */
        public float f51073b;

        /* JADX INFO: renamed from: c */
        public final Interpolator f51074c;

        /* JADX INFO: renamed from: d */
        public final long f51075d;

        public e(int i10, DecelerateInterpolator decelerateInterpolator, long j10) {
            this.f51072a = i10;
            this.f51074c = decelerateInterpolator;
            this.f51075d = j10;
        }

        /* JADX INFO: renamed from: a */
        public long mo18857a() {
            return this.f51075d;
        }

        /* JADX INFO: renamed from: b */
        public float mo18858b() {
            Interpolator interpolator = this.f51074c;
            return interpolator != null ? interpolator.getInterpolation(this.f51073b) : this.f51073b;
        }

        /* JADX INFO: renamed from: c */
        public int mo18859c() {
            return this.f51072a;
        }

        /* JADX INFO: renamed from: d */
        public void mo18860d(float f3) {
            this.f51073b = f3;
        }
    }

    public C10061r0(int i10, DecelerateInterpolator decelerateInterpolator, long j10) {
        if (Build.VERSION.SDK_INT < 30) {
            this.f51049a = new c(i10, decelerateInterpolator, j10);
        } else {
            C0011a.m43g();
            this.f51049a = new d(C7261h.m14645i(i10, decelerateInterpolator, j10));
        }
    }

    public C10061r0(WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (Build.VERSION.SDK_INT >= 30) {
            this.f51049a = new d(windowInsetsAnimation);
        }
    }
}
