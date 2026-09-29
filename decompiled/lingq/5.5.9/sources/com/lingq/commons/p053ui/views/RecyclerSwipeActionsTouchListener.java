package com.lingq.commons.p053ui.views;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import cm.InterfaceC2041a;
import com.lingq.p055ui.token.TokenFragment;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import lk.C7386b;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class RecyclerSwipeActionsTouchListener implements RecyclerView.InterfaceC1124q {

    /* JADX INFO: renamed from: a */
    public final RecyclerView f16761a;

    /* JADX INFO: renamed from: b */
    public final List<Integer> f16762b;

    /* JADX INFO: renamed from: c */
    public final int f16763c;

    /* JADX INFO: renamed from: d */
    public final int f16764d;

    /* JADX INFO: renamed from: e */
    public final ViewGroup f16765e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC3280a f16766f;

    /* JADX INFO: renamed from: g */
    public final int f16767g;

    /* JADX INFO: renamed from: h */
    public final int f16768h;

    /* JADX INFO: renamed from: i */
    public final int f16769i;

    /* JADX INFO: renamed from: j */
    public int f16770j;

    /* JADX INFO: renamed from: k */
    public int f16771k;

    /* JADX INFO: renamed from: l */
    public float f16772l;

    /* JADX INFO: renamed from: m */
    public float f16773m;

    /* JADX INFO: renamed from: n */
    public boolean f16774n;

    /* JADX INFO: renamed from: o */
    public int f16775o;

    /* JADX INFO: renamed from: p */
    public VelocityTracker f16776p;

    /* JADX INFO: renamed from: q */
    public int f16777q;

    /* JADX INFO: renamed from: r */
    public View f16778r;

    /* JADX INFO: renamed from: s */
    public boolean f16779s;

    /* JADX INFO: renamed from: t */
    public boolean f16780t;

    /* JADX INFO: renamed from: u */
    public int f16781u;

    /* JADX INFO: renamed from: v */
    public ViewGroup f16782v;

    /* JADX INFO: renamed from: w */
    public ViewGroup f16783w;

    /* JADX INFO: renamed from: x */
    public View f16784x;

    /* JADX INFO: renamed from: com.lingq.commons.ui.views.RecyclerSwipeActionsTouchListener$a */
    public interface InterfaceC3280a {
        /* JADX INFO: renamed from: a */
        void mo9366a(int i10, int i11);
    }

    /* JADX INFO: renamed from: com.lingq.commons.ui.views.RecyclerSwipeActionsTouchListener$b */
    public static final class AnimationAnimationListenerC3281b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceC2041a<C9072e> f16785a;

        public AnimationAnimationListenerC3281b(InterfaceC2041a<C9072e> interfaceC2041a) {
            this.f16785a = interfaceC2041a;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            this.f16785a.mo807E();
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    public RecyclerSwipeActionsTouchListener(RecyclerView recyclerView, List list, NestedScrollView nestedScrollView, TokenFragment.C4794h c4794h) {
        C5207g.m11111f(list, "optionViews");
        this.f16761a = recyclerView;
        this.f16762b = list;
        this.f16763c = R.id.viewForeground;
        this.f16764d = R.id.viewBackground;
        this.f16765e = nestedScrollView;
        this.f16766f = c4794h;
        this.f16770j = 1;
        this.f16771k = 1;
        this.f16781u = -1;
        ViewConfiguration viewConfiguration = ViewConfiguration.get(recyclerView.getContext());
        this.f16767g = viewConfiguration.getScaledTouchSlop();
        this.f16768h = viewConfiguration.getScaledMinimumFlingVelocity() * 16;
        this.f16769i = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    /* JADX INFO: renamed from: g */
    public static void m9360g(ViewGroup viewGroup, int i10) {
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i10;
        }
        viewGroup.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: h */
    public static void m9361h(ViewGroup viewGroup, int i10, int i11, long j10, InterfaceC2041a interfaceC2041a) {
        C7386b c7386b = new C7386b(viewGroup, i10, i11);
        c7386b.setDuration(j10);
        c7386b.setInterpolator(new DecelerateInterpolator(1.5f));
        c7386b.setAnimationListener(new AnimationAnimationListenerC3281b(interfaceC2041a));
        viewGroup.startAnimation(c7386b);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1124q
    /* JADX INFO: renamed from: a */
    public final void mo4336a(RecyclerView recyclerView, MotionEvent motionEvent) {
        C5207g.m11111f(recyclerView, "rv");
        C5207g.m11111f(motionEvent, "motionEvent");
        m9364f(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public final void m9362b() {
        ViewGroup viewGroup = this.f16783w;
        if (viewGroup != null) {
            int i10 = this.f16771k;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            m9361h(viewGroup, i10, layoutParams != null ? layoutParams.width : 0, 300L, RecyclerSwipeActionsTouchListener$setWidthWithAnimation$1.f16789b);
            this.f16770j = 1;
            this.f16771k = 1;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1124q
    /* JADX INFO: renamed from: c */
    public final boolean mo4337c(RecyclerView recyclerView, MotionEvent motionEvent) {
        ViewGroup viewGroup;
        C5207g.m11111f(recyclerView, "rv");
        C5207g.m11111f(motionEvent, "motionEvent");
        boolean zM9364f = m9364f(motionEvent);
        if (zM9364f && motionEvent.getActionMasked() == 2 && (viewGroup = this.f16765e) != null) {
            viewGroup.requestDisallowInterceptTouchEvent(true);
        }
        return zM9364f;
    }

    /* JADX INFO: renamed from: d */
    public final void m9363d(final Integer num, final Integer num2) {
        ViewGroup viewGroup = this.f16782v;
        if (viewGroup == null) {
            return;
        }
        int i10 = this.f16771k;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        m9361h(viewGroup, i10, layoutParams != null ? layoutParams.width : 0, 150L, new InterfaceC2041a<C9072e>() { // from class: com.lingq.commons.ui.views.RecyclerSwipeActionsTouchListener$closeVisibleBackgroundViews$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // cm.InterfaceC2041a
            /* JADX INFO: renamed from: E */
            public final C9072e mo807E() {
                Integer num3;
                Integer num4 = num;
                if (num4 != null && (num3 = num2) != null) {
                    this.f16766f.mo9366a(num4.intValue(), num3.intValue());
                }
                return C9072e.f47360a;
            }
        });
        this.f16779s = false;
        this.f16782v = null;
        this.f16781u = -1;
        this.f16770j = 1;
        this.f16771k = 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC1124q
    /* JADX INFO: renamed from: e */
    public final void mo4338e(boolean z10) {
    }

    /* JADX WARN: Code duplicated, block: B:93:0x018f  */
    /* JADX INFO: renamed from: f */
    public final boolean m9364f(MotionEvent motionEvent) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int iIntValue;
        View viewFindViewById;
        int i10;
        ViewGroup viewGroup;
        boolean z14;
        Number numberValueOf;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        View view;
        if (this.f16770j < 2 && (view = this.f16784x) != null) {
            this.f16770j = view.getWidth();
        }
        if (this.f16771k < 2 && (viewGroup3 = this.f16783w) != null) {
            this.f16771k = viewGroup3.getWidth();
        }
        int actionMasked = motionEvent.getActionMasked();
        int i11 = this.f16764d;
        if (actionMasked == 0) {
            Rect rect = new Rect();
            RecyclerView recyclerView = this.f16761a;
            int childCount = recyclerView.getChildCount();
            int[] iArr = new int[2];
            recyclerView.getLocationOnScreen(iArr);
            int rawX = ((int) motionEvent.getRawX()) - iArr[0];
            int rawY = ((int) motionEvent.getRawY()) - iArr[1];
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = recyclerView.getChildAt(i12);
                C5207g.m11110e(childAt, "recyclerView.getChildAt(i)");
                childAt.getHitRect(rect);
                if (rect.contains(rawX, rawY)) {
                    this.f16778r = childAt;
                    break;
                }
            }
            View view2 = this.f16778r;
            if (view2 != null) {
                this.f16772l = motionEvent.getRawX();
                this.f16773m = motionEvent.getRawY();
                RecyclerView.AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view2);
                this.f16777q = abstractC1109b0M4161L != null ? abstractC1109b0M4161L.m4240c() : -1;
                VelocityTracker velocityTrackerObtain = VelocityTracker.obtain();
                this.f16776p = velocityTrackerObtain;
                if (velocityTrackerObtain != null) {
                    velocityTrackerObtain.addMovement(motionEvent);
                }
                this.f16783w = (ViewGroup) view2.findViewById(this.f16763c);
                View viewFindViewById2 = view2.findViewById(i11);
                this.f16784x = viewFindViewById2;
                if (viewFindViewById2 != null) {
                    ViewGroup viewGroup4 = this.f16783w;
                    viewFindViewById2.setMinimumHeight(viewGroup4 != null ? viewGroup4.getHeight() : 0);
                }
                if (!this.f16779s || this.f16783w == null) {
                    this.f16780t = false;
                } else {
                    int rawX2 = (int) motionEvent.getRawX();
                    int rawY2 = (int) motionEvent.getRawY();
                    ViewGroup viewGroup5 = this.f16783w;
                    if (viewGroup5 != null) {
                        viewGroup5.getGlobalVisibleRect(rect);
                    }
                    this.f16780t = rect.contains(rawX2, rawY2);
                }
            }
            recyclerView.getHitRect(rect);
            if (this.f16779s && this.f16777q != this.f16781u) {
                m9363d(null, null);
            }
        } else if (actionMasked == 1) {
            if (this.f16776p == null || this.f16777q < 0) {
                return false;
            }
            float rawX3 = motionEvent.getRawX() - this.f16772l;
            if (this.f16774n) {
                z10 = rawX3 < 0.0f;
                z11 = rawX3 > 0.0f;
            } else {
                z10 = false;
                z11 = false;
            }
            if (Math.abs(rawX3) <= this.f16770j / 2 || !this.f16774n) {
                VelocityTracker velocityTracker = this.f16776p;
                if (velocityTracker != null) {
                    velocityTracker.addMovement(motionEvent);
                }
                VelocityTracker velocityTracker2 = this.f16776p;
                if (velocityTracker2 != null) {
                    velocityTracker2.computeCurrentVelocity(1000);
                }
                VelocityTracker velocityTracker3 = this.f16776p;
                float xVelocity = velocityTracker3 != null ? velocityTracker3.getXVelocity() : 0.0f;
                float fAbs = Math.abs(xVelocity);
                VelocityTracker velocityTracker4 = this.f16776p;
                float fAbs2 = Math.abs(velocityTracker4 != null ? velocityTracker4.getYVelocity() : 0.0f);
                if (this.f16768h > fAbs || fAbs > this.f16769i || fAbs2 >= fAbs || !this.f16774n) {
                    z12 = false;
                    z13 = false;
                } else {
                    boolean z15 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) < 0) == ((rawX3 > 0.0f ? 1 : (rawX3 == 0.0f ? 0 : -1)) < 0);
                    z12 = ((xVelocity > 0.0f ? 1 : (xVelocity == 0.0f ? 0 : -1)) > 0) == ((rawX3 > 0.0f ? 1 : (rawX3 == 0.0f ? 0 : -1)) > 0);
                    z13 = z15;
                }
            } else {
                z13 = rawX3 < 0.0f;
                z12 = rawX3 > 0.0f;
            }
            if (!z11 && z13 && (i10 = this.f16777q) != -1 && !this.f16779s) {
                m9365i();
                this.f16779s = true;
                this.f16782v = this.f16783w;
                this.f16781u = i10;
            } else if (!z10 && z12 && this.f16777q != -1 && this.f16779s) {
                m9362b();
                this.f16779s = false;
                this.f16782v = null;
                this.f16781u = -1;
            } else if (z10 && !this.f16779s) {
                m9362b();
                this.f16779s = false;
                this.f16782v = null;
                this.f16781u = -1;
            } else if (z11 && this.f16779s) {
                m9365i();
                this.f16779s = true;
                this.f16782v = this.f16783w;
                this.f16781u = this.f16777q;
            } else if (z11 && !this.f16779s) {
                m9362b();
                this.f16779s = false;
                this.f16782v = null;
                this.f16781u = -1;
            } else if (z10 && this.f16779s) {
                m9365i();
                this.f16779s = true;
                this.f16782v = this.f16783w;
                this.f16781u = this.f16777q;
            } else if (!z11 && !z10) {
                boolean z16 = this.f16780t;
                if (z16) {
                    m9362b();
                    this.f16779s = false;
                    this.f16782v = null;
                    this.f16781u = -1;
                } else if (this.f16779s && !z16) {
                    List<Integer> list = this.f16762b;
                    int size = list.size();
                    int i13 = 0;
                    while (true) {
                        if (i13 >= size) {
                            iIntValue = -1;
                            break;
                        }
                        if (this.f16778r != null) {
                            Rect rect2 = new Rect();
                            int rawX4 = (int) motionEvent.getRawX();
                            int rawY3 = (int) motionEvent.getRawY();
                            View view3 = this.f16778r;
                            if (view3 != null && (viewFindViewById = view3.findViewById(list.get(i13).intValue())) != null) {
                                viewFindViewById.getGlobalVisibleRect(rect2);
                            }
                            if (rect2.contains(rawX4, rawY3)) {
                                iIntValue = list.get(i13).intValue();
                                break;
                            }
                        }
                        i13++;
                    }
                    if (iIntValue >= 0 && this.f16777q >= 0) {
                        m9363d(Integer.valueOf(iIntValue), Integer.valueOf(this.f16777q));
                    }
                }
            }
            VelocityTracker velocityTracker5 = this.f16776p;
            if (velocityTracker5 != null) {
                velocityTracker5.recycle();
            }
            this.f16776p = null;
            this.f16772l = 0.0f;
            this.f16773m = 0.0f;
            this.f16778r = null;
            this.f16777q = -1;
            this.f16774n = false;
            this.f16784x = null;
        } else if (actionMasked == 2) {
            VelocityTracker velocityTracker6 = this.f16776p;
            if (velocityTracker6 == null) {
                return false;
            }
            velocityTracker6.addMovement(motionEvent);
            float rawX5 = motionEvent.getRawX() - this.f16772l;
            float rawY4 = motionEvent.getRawY() - this.f16773m;
            boolean z17 = this.f16774n;
            int i14 = this.f16767g;
            if (!z17 && Math.abs(rawX5) > i14 && Math.abs(rawY4) < Math.abs(rawX5) / 2) {
                this.f16774n = true;
                this.f16775o = rawX5 > 0.0f ? i14 : -i14;
            }
            boolean z18 = this.f16774n;
            if (z18) {
                if (this.f16784x == null) {
                    View view4 = this.f16778r;
                    View viewFindViewById3 = view4 != null ? view4.findViewById(i11) : null;
                    this.f16784x = viewFindViewById3;
                    if (viewFindViewById3 != null) {
                        viewFindViewById3.setVisibility(0);
                    }
                }
                if (rawX5 < i14 && !this.f16779s) {
                    float f3 = rawX5 - this.f16775o;
                    float fAbs3 = Math.abs(f3);
                    int i15 = this.f16770j;
                    Number numberValueOf2 = fAbs3 > ((float) i15) ? Integer.valueOf(-i15) : Float.valueOf(f3);
                    ViewGroup viewGroup6 = this.f16783w;
                    if (viewGroup6 != null) {
                        m9360g(viewGroup6, numberValueOf2.intValue() + this.f16771k);
                    }
                    if (numberValueOf2.intValue() > 0 && (viewGroup2 = this.f16783w) != null) {
                        m9360g(viewGroup2, this.f16771k);
                    }
                } else if (rawX5 > 0.0f && (z14 = this.f16779s)) {
                    if (z14) {
                        float f10 = (rawX5 - this.f16775o) - this.f16770j;
                        numberValueOf = f10 <= 0.0f ? Float.valueOf(f10) : 0;
                        ViewGroup viewGroup7 = this.f16783w;
                        if (viewGroup7 != null) {
                            m9360g(viewGroup7, numberValueOf.intValue() + this.f16771k);
                        }
                    } else {
                        float f11 = (rawX5 - this.f16775o) - this.f16770j;
                        numberValueOf = f11 <= 0.0f ? Float.valueOf(f11) : 0;
                        ViewGroup viewGroup8 = this.f16783w;
                        if (viewGroup8 != null) {
                            m9360g(viewGroup8, numberValueOf.intValue() + this.f16771k);
                        }
                    }
                }
                return true;
            }
            if (z18) {
                if (rawX5 < i14 && !this.f16779s) {
                    float f12 = rawX5 - this.f16775o;
                    if (this.f16784x == null) {
                        View view5 = this.f16778r;
                        this.f16784x = view5 != null ? view5.findViewById(i11) : null;
                    }
                    View view6 = this.f16784x;
                    if (view6 != null) {
                        view6.setVisibility(8);
                    }
                    ViewGroup viewGroup9 = this.f16783w;
                    if (viewGroup9 != null) {
                        m9360g(viewGroup9, this.f16771k + ((int) (f12 / 5)));
                    }
                    if (f12 / 5 > 0.0f && (viewGroup = this.f16783w) != null) {
                        m9360g(viewGroup, this.f16771k);
                    }
                }
                return true;
            }
        } else {
            if (actionMasked != 3 || this.f16776p == null) {
                return false;
            }
            if (this.f16778r != null && this.f16774n) {
                m9362b();
            }
            VelocityTracker velocityTracker7 = this.f16776p;
            if (velocityTracker7 != null) {
                velocityTracker7.recycle();
            }
            this.f16776p = null;
            this.f16774n = false;
            this.f16784x = null;
            this.f16772l = 0.0f;
            this.f16773m = 0.0f;
            this.f16778r = null;
            this.f16777q = -1;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    public final void m9365i() {
        ViewGroup viewGroup = this.f16783w;
        if (viewGroup != null) {
            int i10 = this.f16771k - this.f16770j;
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            m9361h(viewGroup, i10, layoutParams != null ? layoutParams.width : 0, 300L, RecyclerSwipeActionsTouchListener$setWidthWithAnimation$1.f16789b);
        }
    }
}
