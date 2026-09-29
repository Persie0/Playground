package va;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import androidx.activity.RunnableC0183b;
import androidx.activity.RunnableC0193l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2238x;
import com.clevertap.android.sdk.inapp.ViewOnClickListenerC2239y;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.p051ui.C2515b;
import com.google.android.exoplayer2.p051ui.C2517d;
import com.linguist.R;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: va.o */
/* JADX INFO: loaded from: classes.dex */
public final class C9701o {

    /* JADX INFO: renamed from: A */
    public boolean f49637A;

    /* JADX INFO: renamed from: B */
    public boolean f49638B;

    /* JADX INFO: renamed from: a */
    public final C2517d f49640a;

    /* JADX INFO: renamed from: b */
    public final View f49641b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f49642c;

    /* JADX INFO: renamed from: d */
    public final ViewGroup f49643d;

    /* JADX INFO: renamed from: e */
    public final ViewGroup f49644e;

    /* JADX INFO: renamed from: f */
    public final ViewGroup f49645f;

    /* JADX INFO: renamed from: g */
    public final ViewGroup f49646g;

    /* JADX INFO: renamed from: h */
    public final ViewGroup f49647h;

    /* JADX INFO: renamed from: i */
    public final ViewGroup f49648i;

    /* JADX INFO: renamed from: j */
    public final View f49649j;

    /* JADX INFO: renamed from: k */
    public final View f49650k;

    /* JADX INFO: renamed from: l */
    public final AnimatorSet f49651l;

    /* JADX INFO: renamed from: m */
    public final AnimatorSet f49652m;

    /* JADX INFO: renamed from: n */
    public final AnimatorSet f49653n;

    /* JADX INFO: renamed from: o */
    public final AnimatorSet f49654o;

    /* JADX INFO: renamed from: p */
    public final AnimatorSet f49655p;

    /* JADX INFO: renamed from: q */
    public final ValueAnimator f49656q;

    /* JADX INFO: renamed from: r */
    public final ValueAnimator f49657r;

    /* JADX INFO: renamed from: s */
    public final RunnableC9695i f49658s;

    /* JADX INFO: renamed from: u */
    public final RunnableC9695i f49660u;

    /* JADX INFO: renamed from: v */
    public final RunnableC9698l f49661v;

    /* JADX INFO: renamed from: t */
    public final RunnableC0183b f49659t = new RunnableC0183b(15, this);

    /* JADX INFO: renamed from: w */
    public final RunnableC0193l f49662w = new RunnableC0193l(10, this);

    /* JADX INFO: renamed from: x */
    public final ViewOnLayoutChangeListenerC9699m f49663x = new View.OnLayoutChangeListener() { // from class: va.m
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            int paddingRight;
            int height;
            int paddingBottom;
            int height2;
            C9701o c9701o = this.f49634a;
            C2517d c2517d = c9701o.f49640a;
            int width = (c2517d.getWidth() - c2517d.getPaddingLeft()) - c2517d.getPaddingRight();
            int height3 = (c2517d.getHeight() - c2517d.getPaddingBottom()) - c2517d.getPaddingTop();
            ViewGroup viewGroup = c9701o.f49642c;
            int iM18203d = C9701o.m18203d(viewGroup);
            boolean z10 = false;
            if (viewGroup != null) {
                paddingRight = viewGroup.getPaddingRight() + viewGroup.getPaddingLeft();
            } else {
                paddingRight = 0;
            }
            int i18 = iM18203d - paddingRight;
            if (viewGroup == null) {
                height = 0;
            } else {
                height = viewGroup.getHeight();
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                }
            }
            if (viewGroup != null) {
                paddingBottom = viewGroup.getPaddingBottom() + viewGroup.getPaddingTop();
            } else {
                paddingBottom = 0;
            }
            int i19 = height - paddingBottom;
            int iMax = Math.max(i18, C9701o.m18203d(c9701o.f49650k) + C9701o.m18203d(c9701o.f49648i));
            ViewGroup viewGroup2 = c9701o.f49643d;
            if (viewGroup2 == null) {
                height2 = 0;
            } else {
                height2 = viewGroup2.getHeight();
                ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                    height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                }
            }
            int i20 = 2;
            int i21 = 1;
            boolean z11 = width <= iMax || height3 <= (height2 * 2) + i19;
            if (c9701o.f49637A != z11) {
                c9701o.f49637A = z11;
                view.post(new RunnableC9695i(c9701o, i20));
            }
            if (i12 - i10 != i16 - i14) {
                z10 = true;
            }
            if (c9701o.f49637A || !z10) {
                return;
            }
            view.post(new RunnableC9698l(c9701o, i21));
        }
    };

    /* JADX INFO: renamed from: C */
    public boolean f49639C = true;

    /* JADX INFO: renamed from: z */
    public int f49665z = 0;

    /* JADX INFO: renamed from: y */
    public final ArrayList f49664y = new ArrayList();

    /* JADX INFO: renamed from: va.o$a */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C9701o c9701o = C9701o.this;
            View view = c9701o.f49641b;
            if (view != null) {
                view.setVisibility(4);
            }
            ViewGroup viewGroup = c9701o.f49642c;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
            ViewGroup viewGroup2 = c9701o.f49644e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C9701o c9701o = C9701o.this;
            View view = c9701o.f49649j;
            if ((view instanceof C2515b) && !c9701o.f49637A) {
                C2515b c2515b = (C2515b) view;
                ValueAnimator valueAnimator = c2515b.f13539c0;
                if (valueAnimator.isStarted()) {
                    valueAnimator.cancel();
                }
                valueAnimator.setFloatValues(c2515b.f13541d0, 0.0f);
                valueAnimator.setDuration(250L);
                valueAnimator.start();
            }
        }
    }

    /* JADX INFO: renamed from: va.o$b */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C9701o c9701o = C9701o.this;
            View view = c9701o.f49641b;
            if (view != null) {
                view.setVisibility(0);
            }
            ViewGroup viewGroup = c9701o.f49642c;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            ViewGroup viewGroup2 = c9701o.f49644e;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(c9701o.f49637A ? 0 : 4);
            }
            View view2 = c9701o.f49649j;
            if ((view2 instanceof C2515b) && !c9701o.f49637A) {
                C2515b c2515b = (C2515b) view2;
                ValueAnimator valueAnimator = c2515b.f13539c0;
                if (valueAnimator.isStarted()) {
                    valueAnimator.cancel();
                }
                c2515b.f13543e0 = false;
                valueAnimator.setFloatValues(c2515b.f13541d0, 1.0f);
                valueAnimator.setDuration(250L);
                valueAnimator.start();
            }
        }
    }

    /* JADX INFO: renamed from: va.o$c */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2517d f49668a;

        public c(C2517d c2517d) {
            this.f49668a = c2517d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C9701o c9701o = C9701o.this;
            c9701o.m18211i(1);
            if (c9701o.f49638B) {
                this.f49668a.post(c9701o.f49658s);
                c9701o.f49638B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C9701o.this.m18211i(3);
        }
    }

    /* JADX INFO: renamed from: va.o$d */
    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2517d f49670a;

        public d(C2517d c2517d) {
            this.f49670a = c2517d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C9701o c9701o = C9701o.this;
            c9701o.m18211i(2);
            if (c9701o.f49638B) {
                this.f49670a.post(c9701o.f49658s);
                c9701o.f49638B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C9701o.this.m18211i(3);
        }
    }

    /* JADX INFO: renamed from: va.o$e */
    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2517d f49672a;

        public e(C2517d c2517d) {
            this.f49672a = c2517d;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C9701o c9701o = C9701o.this;
            c9701o.m18211i(2);
            if (c9701o.f49638B) {
                this.f49672a.post(c9701o.f49658s);
                c9701o.f49638B = false;
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C9701o.this.m18211i(3);
        }
    }

    /* JADX INFO: renamed from: va.o$f */
    public class f extends AnimatorListenerAdapter {
        public f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C9701o.this.m18211i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C9701o.this.m18211i(4);
        }
    }

    /* JADX INFO: renamed from: va.o$g */
    public class g extends AnimatorListenerAdapter {
        public g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            C9701o.this.m18211i(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C9701o.this.m18211i(4);
        }
    }

    /* JADX INFO: renamed from: va.o$h */
    public class h extends AnimatorListenerAdapter {
        public h() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = C9701o.this.f49645f;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            C9701o c9701o = C9701o.this;
            ViewGroup viewGroup = c9701o.f49647h;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                ViewGroup viewGroup2 = c9701o.f49647h;
                viewGroup2.setTranslationX(viewGroup2.getWidth());
                ViewGroup viewGroup3 = c9701o.f49647h;
                viewGroup3.scrollTo(viewGroup3.getWidth(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: va.o$i */
    public class i extends AnimatorListenerAdapter {
        public i() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            ViewGroup viewGroup = C9701o.this.f49647h;
            if (viewGroup != null) {
                viewGroup.setVisibility(4);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            ViewGroup viewGroup = C9701o.this.f49645f;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [va.m] */
    public C9701o(C2517d c2517d) {
        this.f49640a = c2517d;
        final int i10 = 0;
        this.f49658s = new RunnableC9695i(this, i10);
        final int i11 = 1;
        this.f49660u = new RunnableC9695i(this, i11);
        this.f49661v = new RunnableC9698l(this, i10);
        this.f49641b = c2517d.findViewById(R.id.exo_controls_background);
        this.f49642c = (ViewGroup) c2517d.findViewById(R.id.exo_center_controls);
        this.f49644e = (ViewGroup) c2517d.findViewById(R.id.exo_minimal_controls);
        ViewGroup viewGroup = (ViewGroup) c2517d.findViewById(R.id.exo_bottom_bar);
        this.f49643d = viewGroup;
        this.f49648i = (ViewGroup) c2517d.findViewById(R.id.exo_time);
        View viewFindViewById = c2517d.findViewById(R.id.exo_progress);
        this.f49649j = viewFindViewById;
        this.f49645f = (ViewGroup) c2517d.findViewById(R.id.exo_basic_controls);
        this.f49646g = (ViewGroup) c2517d.findViewById(R.id.exo_extra_controls);
        this.f49647h = (ViewGroup) c2517d.findViewById(R.id.exo_extra_controls_scroll_view);
        View viewFindViewById2 = c2517d.findViewById(R.id.exo_overflow_show);
        this.f49650k = viewFindViewById2;
        View viewFindViewById3 = c2517d.findViewById(R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            int i12 = 3;
            viewFindViewById2.setOnClickListener(new ViewOnClickListenerC2238x(i12, this));
            viewFindViewById3.setOnClickListener(new ViewOnClickListenerC2239y(i12, this));
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: va.k

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C9701o f49631b;

            {
                this.f49631b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i13 = i11;
                C9701o c9701o = this.f49631b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        c9701o.getClass();
                        c9701o.m18206b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        c9701o.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c9701o.f49641b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c9701o.f49642c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c9701o.f49644e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat.addListener(new a());
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new C9700n(0, this));
        valueAnimatorOfFloat2.addListener(new b());
        Resources resources = c2517d.getResources();
        float dimension = resources.getDimension(R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(R.dimen.exo_styled_bottom_bar_height);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f49651l = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new c(c2517d));
        animatorSet.play(valueAnimatorOfFloat).with(m18204e(viewFindViewById, 0.0f, dimension)).with(m18204e(viewGroup, 0.0f, dimension));
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f49652m = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new d(c2517d));
        animatorSet2.play(m18204e(viewFindViewById, dimension, dimension2)).with(m18204e(viewGroup, dimension, dimension2));
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f49653n = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new e(c2517d));
        animatorSet3.play(valueAnimatorOfFloat).with(m18204e(viewFindViewById, 0.0f, dimension2)).with(m18204e(viewGroup, 0.0f, dimension2));
        AnimatorSet animatorSet4 = new AnimatorSet();
        this.f49654o = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new f());
        animatorSet4.play(valueAnimatorOfFloat2).with(m18204e(viewFindViewById, dimension, 0.0f)).with(m18204e(viewGroup, dimension, 0.0f));
        AnimatorSet animatorSet5 = new AnimatorSet();
        this.f49655p = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new g());
        animatorSet5.play(valueAnimatorOfFloat2).with(m18204e(viewFindViewById, dimension2, 0.0f)).with(m18204e(viewGroup, dimension2, 0.0f));
        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f49656q = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new C9696j(0, this));
        valueAnimatorOfFloat3.addListener(new h());
        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.f49657r = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: va.k

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ C9701o f49631b;

            {
                this.f49631b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i13 = i10;
                C9701o c9701o = this.f49631b;
                switch (i13) {
                    case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                        c9701o.getClass();
                        c9701o.m18206b(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        c9701o.getClass();
                        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        View view = c9701o.f49641b;
                        if (view != null) {
                            view.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup2 = c9701o.f49642c;
                        if (viewGroup2 != null) {
                            viewGroup2.setAlpha(fFloatValue);
                        }
                        ViewGroup viewGroup3 = c9701o.f49644e;
                        if (viewGroup3 != null) {
                            viewGroup3.setAlpha(fFloatValue);
                        }
                        break;
                }
            }
        });
        valueAnimatorOfFloat4.addListener(new i());
    }

    /* JADX INFO: renamed from: a */
    public static void m18202a(C9701o c9701o, View view) {
        c9701o.m18209g();
        if (view.getId() == R.id.exo_overflow_show) {
            c9701o.f49656q.start();
        } else {
            if (view.getId() == R.id.exo_overflow_hide) {
                c9701o.f49657r.start();
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static int m18203d(View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            width += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
        }
        return width;
    }

    /* JADX INFO: renamed from: e */
    public static ObjectAnimator m18204e(View view, float f3, float f10) {
        return ObjectAnimator.ofFloat(view, "translationY", f3, f10);
    }

    /* JADX INFO: renamed from: j */
    public static boolean m18205j(View view) {
        int id2 = view.getId();
        return id2 == R.id.exo_bottom_bar || id2 == R.id.exo_prev || id2 == R.id.exo_next || id2 == R.id.exo_rew || id2 == R.id.exo_rew_with_amount || id2 == R.id.exo_ffwd || id2 == R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: renamed from: b */
    public final void m18206b(float f3) {
        ViewGroup viewGroup = this.f49647h;
        if (viewGroup != null) {
            viewGroup.setTranslationX((int) ((1.0f - f3) * viewGroup.getWidth()));
        }
        ViewGroup viewGroup2 = this.f49648i;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f3);
        }
        ViewGroup viewGroup3 = this.f49645f;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f3);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18207c(View view) {
        return view != null && this.f49664y.contains(view);
    }

    /* JADX INFO: renamed from: f */
    public final void m18208f() {
        C2517d c2517d = this.f49640a;
        c2517d.removeCallbacks(this.f49662w);
        c2517d.removeCallbacks(this.f49659t);
        c2517d.removeCallbacks(this.f49661v);
        c2517d.removeCallbacks(this.f49660u);
    }

    /* JADX INFO: renamed from: g */
    public final void m18209g() {
        if (this.f49665z == 3) {
            return;
        }
        m18208f();
        C2517d c2517d = this.f49640a;
        int showTimeoutMs = c2517d.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.f49639C) {
                long j10 = showTimeoutMs;
                if (j10 >= 0) {
                    c2517d.postDelayed(this.f49662w, j10);
                    return;
                }
                return;
            }
            if (this.f49665z == 1) {
                c2517d.postDelayed(this.f49660u, ExoPlayer.DEFAULT_DETACH_SURFACE_TIMEOUT_MS);
                return;
            }
            long j11 = showTimeoutMs;
            if (j11 >= 0) {
                c2517d.postDelayed(this.f49661v, j11);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m18210h(View view, boolean z10) {
        if (view == null) {
            return;
        }
        ArrayList arrayList = this.f49664y;
        if (!z10) {
            view.setVisibility(8);
            arrayList.remove(view);
            return;
        }
        if (this.f49637A && m18205j(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        arrayList.add(view);
    }

    /* JADX INFO: renamed from: i */
    public final void m18211i(int i10) {
        int i11 = this.f49665z;
        this.f49665z = i10;
        C2517d c2517d = this.f49640a;
        if (i10 == 2) {
            c2517d.setVisibility(8);
        } else if (i11 == 2) {
            c2517d.setVisibility(0);
        }
        if (i11 != i10) {
            Iterator<C2517d.l> it = c2517d.f13611d.iterator();
            while (it.hasNext()) {
                it.next().mo7413x(c2517d.getVisibility());
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m18212k() {
        if (!this.f49639C) {
            m18211i(0);
            m18209g();
            return;
        }
        int i10 = this.f49665z;
        if (i10 == 1) {
            this.f49654o.start();
        } else if (i10 == 2) {
            this.f49655p.start();
        } else if (i10 == 3) {
            this.f49638B = true;
        } else if (i10 == 4) {
            return;
        }
        m18209g();
    }
}
