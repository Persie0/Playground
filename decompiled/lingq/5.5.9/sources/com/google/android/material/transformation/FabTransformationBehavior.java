package com.google.android.material.transformation;

import ae.C0062b;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import androidx.activity.result.C0204c;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.linguist.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p177ic.C6308a;
import p177ic.C6309b;
import p177ic.C6310c;
import p177ic.C6311d;
import p177ic.C6314g;
import p177ic.C6315h;
import p260m8.C7499b;
import p297od.C8036b;
import p297od.C8037c;
import p326q.C8452h;
import p363rc.C8765a;
import p363rc.C8766b;
import p363rc.InterfaceC8768d;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c */
    public final Rect f15866c;

    /* JADX INFO: renamed from: d */
    public final RectF f15867d;

    /* JADX INFO: renamed from: e */
    public final RectF f15868e;

    /* JADX INFO: renamed from: f */
    public final int[] f15869f;

    /* JADX INFO: renamed from: g */
    public float f15870g;

    /* JADX INFO: renamed from: h */
    public float f15871h;

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    public class C3104a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f15872a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f15873b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f15874c;

        public C3104a(boolean z10, View view, View view2) {
            this.f15872a = z10;
            this.f15873b = view;
            this.f15874c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.f15872a) {
                return;
            }
            this.f15873b.setVisibility(4);
            View view = this.f15874c;
            view.setAlpha(1.0f);
            view.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (this.f15872a) {
                this.f15873b.setVisibility(0);
                View view = this.f15874c;
                view.setAlpha(0.0f);
                view.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    public static class C3105b {

        /* JADX INFO: renamed from: a */
        public C6314g f15875a;

        /* JADX INFO: renamed from: b */
        public C0062b f15876b;
    }

    public FabTransformationBehavior() {
        this.f15866c = new Rect();
        this.f15867d = new RectF();
        this.f15868e = new RectF();
        this.f15869f = new int[2];
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f15866c = new Rect();
        this.f15867d = new RectF();
        this.f15868e = new RectF();
        this.f15869f = new int[2];
    }

    /* JADX INFO: renamed from: u */
    public static Pair m8935u(float f3, float f10, boolean z10, C3105b c3105b) {
        C6315h c6315hM12941c;
        C6315h c6315hM12941c2;
        if (f3 == 0.0f || f10 == 0.0f) {
            c6315hM12941c2 = c3105b.f15875a.m12941c("translationXLinear");
            c6315hM12941c = c3105b.f15875a.m12941c("translationYLinear");
        } else if ((!z10 || f10 >= 0.0f) && (z10 || f10 <= 0.0f)) {
            c6315hM12941c2 = c3105b.f15875a.m12941c("translationXCurveDownwards");
            c6315hM12941c = c3105b.f15875a.m12941c("translationYCurveDownwards");
        } else {
            c6315hM12941c2 = c3105b.f15875a.m12941c("translationXCurveUpwards");
            c6315hM12941c = c3105b.f15875a.m12941c("translationYCurveUpwards");
        }
        return new Pair(c6315hM12941c2, c6315hM12941c);
    }

    /* JADX INFO: renamed from: x */
    public static float m8936x(C3105b c3105b, C6315h c6315h, float f3) {
        long j10 = c6315h.f36537a;
        C6315h c6315hM12941c = c3105b.f15875a.m12941c("expansion");
        float interpolation = c6315h.m12943b().getInterpolation((((c6315hM12941c.f36537a + c6315hM12941c.f36538b) + 17) - j10) / c6315h.f36538b);
        LinearInterpolator linearInterpolator = C6308a.f36523a;
        return C0204c.m845d(0.0f, f3, interpolation, f3);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: b */
    public final boolean mo2936b(View view, View view2) {
        int expandedComponentIdHint;
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton) || ((expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint()) != 0 && expandedComponentIdHint != view.getId())) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.AbstractC0768c
    /* JADX INFO: renamed from: c */
    public final void mo2937c(CoordinatorLayout.C0771f c0771f) {
        if (c0771f.f5557h == 0) {
            c0771f.f5557h = 80;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x038f  */
    /* JADX WARN: Code duplicated, block: B:40:0x01b0  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /* JADX INFO: renamed from: t */
    public final AnimatorSet mo8934t(View view, View view2, boolean z10, boolean z11) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        ObjectAnimator objectAnimatorOfFloat3;
        ArrayList arrayList;
        C3105b c3105b;
        AnimatorSet animatorSetM17015a;
        ArrayList arrayList2;
        boolean z12;
        ObjectAnimator objectAnimatorOfInt;
        C3105b c3105b2;
        ViewGroup viewGroup;
        ObjectAnimator objectAnimatorOfFloat4;
        ObjectAnimator objectAnimatorOfInt2;
        C3105b c3105bMo8940z = mo8940z(view2.getContext(), z10);
        if (z10) {
            this.f15870g = view.getTranslationX();
            this.f15871h = view.getTranslationY();
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
        float fM18715i = C10029b0.i.m18715i(view2) - C10029b0.i.m18715i(view);
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-fM18715i);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fM18715i);
        }
        c3105bMo8940z.f15875a.m12941c("elevation").m12942a(objectAnimatorOfFloat);
        arrayList3.add(objectAnimatorOfFloat);
        RectF rectF = this.f15867d;
        float fM8937v = m8937v(view, view2, c3105bMo8940z.f15876b);
        float fM8938w = m8938w(view, view2, c3105bMo8940z.f15876b);
        Pair pairM8935u = m8935u(fM8937v, fM8938w, z10, c3105bMo8940z);
        C6315h c6315h = (C6315h) pairM8935u.first;
        C6315h c6315h2 = (C6315h) pairM8935u.second;
        RectF rectF2 = this.f15868e;
        Rect rect = this.f15866c;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fM8937v);
                view2.setTranslationY(-fM8938w);
            }
            ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            float fM8936x = m8936x(c3105bMo8940z, c6315h, -fM8937v);
            float fM8936x2 = m8936x(c3105bMo8940z, c6315h2, -fM8938w);
            view2.getWindowVisibleDisplayFrame(rect);
            rectF.set(rect);
            m8939y(view2, rectF2);
            rectF2.offset(fM8936x, fM8936x2);
            rectF2.intersect(rectF);
            rectF.set(rectF2);
            objectAnimatorOfFloat3 = objectAnimatorOfFloat6;
            objectAnimatorOfFloat2 = objectAnimatorOfFloat5;
        } else {
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fM8937v);
            objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fM8938w);
        }
        c6315h.m12942a(objectAnimatorOfFloat2);
        c6315h2.m12942a(objectAnimatorOfFloat3);
        arrayList3.add(objectAnimatorOfFloat2);
        arrayList3.add(objectAnimatorOfFloat3);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float fM8937v2 = m8937v(view, view2, c3105bMo8940z.f15876b);
        float fM8938w2 = m8938w(view, view2, c3105bMo8940z.f15876b);
        Pair pairM8935u2 = m8935u(fM8937v2, fM8938w2, z10, c3105bMo8940z);
        C6315h c6315h3 = (C6315h) pairM8935u2.first;
        C6315h c6315h4 = (C6315h) pairM8935u2.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        fArr[0] = z10 ? fM8937v2 : this.f15870g;
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        fArr2[0] = z10 ? fM8938w2 : this.f15871h;
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        c6315h3.m12942a(objectAnimatorOfFloat7);
        c6315h4.m12942a(objectAnimatorOfFloat8);
        arrayList3.add(objectAnimatorOfFloat7);
        arrayList3.add(objectAnimatorOfFloat8);
        boolean z13 = view2 instanceof InterfaceC8768d;
        if (z13 && (view instanceof ImageView)) {
            InterfaceC8768d interfaceC8768d = (InterfaceC8768d) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                fWidth = fWidth;
                arrayList = arrayList4;
            } else {
                drawable.mutate();
                if (z10) {
                    if (!z11) {
                        drawable.setAlpha(255);
                    }
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, C6311d.f36530a, 0);
                } else {
                    objectAnimatorOfInt2 = ObjectAnimator.ofInt(drawable, C6311d.f36530a, 255);
                }
                objectAnimatorOfInt2.addUpdateListener(new C3107a(view2));
                c3105bMo8940z.f15875a.m12941c("iconFade").m12942a(objectAnimatorOfInt2);
                arrayList3.add(objectAnimatorOfInt2);
                C3108b c3108b = new C3108b(interfaceC8768d, drawable);
                arrayList = arrayList4;
                arrayList.add(c3108b);
            }
        } else {
            fWidth = fWidth;
            arrayList = arrayList4;
        }
        if (z13) {
            InterfaceC8768d interfaceC8768d2 = (InterfaceC8768d) view2;
            C0062b c0062b = c3105bMo8940z.f15876b;
            m8939y(view, rectF);
            rectF.offset(this.f15870g, this.f15871h);
            m8939y(view2, rectF2);
            rectF2.offset(-m8937v(view, view2, c0062b), 0.0f);
            float fCenterX = rectF.centerX() - rectF2.left;
            C0062b c0062b2 = c3105bMo8940z.f15876b;
            m8939y(view, rectF);
            rectF.offset(this.f15870g, this.f15871h);
            m8939y(view2, rectF2);
            rectF2.offset(0.0f, -m8938w(view, view2, c0062b2));
            float fCenterY = rectF.centerY() - rectF2.top;
            FloatingActionButton floatingActionButton = (FloatingActionButton) view;
            if (C10029b0.g.m18699c(floatingActionButton)) {
                rect.set(0, 0, floatingActionButton.getWidth(), floatingActionButton.getHeight());
                throw null;
            }
            float fWidth2 = rect.width() / 2.0f;
            C6315h c6315hM12941c = c3105bMo8940z.f15875a.m12941c("expansion");
            if (z10) {
                if (!z11) {
                    interfaceC8768d2.setRevealInfo(new InterfaceC8768d.d(fCenterX, fCenterY, fWidth2));
                }
                if (z11) {
                    fWidth2 = interfaceC8768d2.getRevealInfo().f46487c;
                }
                double d10 = 0.0f - fCenterX;
                double d11 = 0.0f - fCenterY;
                float fHypot = (float) Math.hypot(d10, d11);
                double d12 = fWidth - fCenterX;
                float fHypot2 = (float) Math.hypot(d12, d11);
                double d13 = fHeight - fCenterY;
                float fHypot3 = (float) Math.hypot(d12, d13);
                float fHypot4 = (float) Math.hypot(d10, d13);
                if (fHypot <= fHypot2 || fHypot <= fHypot3 || fHypot <= fHypot4) {
                    fHypot = (fHypot2 <= fHypot3 || fHypot2 <= fHypot4) ? fHypot3 > fHypot4 ? fHypot3 : fHypot4 : fHypot2;
                }
                animatorSetM17015a = C8766b.m17015a(interfaceC8768d2, fCenterX, fCenterY, fHypot);
                animatorSetM17015a.addListener(new C3109c(interfaceC8768d2));
                long j10 = c6315hM12941c.f36537a;
                int i10 = (int) fCenterX;
                int i11 = (int) fCenterY;
                if (j10 > 0) {
                    Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view2, i10, i11, fWidth2, fWidth2);
                    animatorCreateCircularReveal.setStartDelay(0L);
                    animatorCreateCircularReveal.setDuration(j10);
                    arrayList3.add(animatorCreateCircularReveal);
                }
                c3105b = c3105bMo8940z;
            } else {
                float f3 = interfaceC8768d2.getRevealInfo().f46487c;
                AnimatorSet animatorSetM17015a2 = C8766b.m17015a(interfaceC8768d2, fCenterX, fCenterY, fWidth2);
                long j11 = c6315hM12941c.f36537a;
                int i12 = (int) fCenterX;
                int i13 = (int) fCenterY;
                if (j11 > 0) {
                    Animator animatorCreateCircularReveal2 = ViewAnimationUtils.createCircularReveal(view2, i12, i13, f3, f3);
                    animatorCreateCircularReveal2.setStartDelay(0L);
                    animatorCreateCircularReveal2.setDuration(j11);
                    arrayList3.add(animatorCreateCircularReveal2);
                }
                C3105b c3105b3 = c3105bMo8940z;
                C8452h<String, C6315h> c8452h = c3105b3.f15875a.f36535a;
                int i14 = c8452h.f45619c;
                long jMax = 0;
                int i15 = 0;
                while (i15 < i14) {
                    C6315h c6315hM16530m = c8452h.m16530m(i15);
                    jMax = Math.max(jMax, c6315hM16530m.f36537a + c6315hM16530m.f36538b);
                    i15++;
                    c8452h = c8452h;
                    i14 = i14;
                    animatorSetM17015a2 = animatorSetM17015a2;
                    c3105b3 = c3105b3;
                }
                c3105b = c3105b3;
                AnimatorSet animatorSet = animatorSetM17015a2;
                long j12 = c6315hM12941c.f36537a + c6315hM12941c.f36538b;
                if (j12 < jMax) {
                    Animator animatorCreateCircularReveal3 = ViewAnimationUtils.createCircularReveal(view2, i12, i13, fWidth2, fWidth2);
                    animatorCreateCircularReveal3.setStartDelay(j12);
                    animatorCreateCircularReveal3.setDuration(jMax - j12);
                    arrayList3.add(animatorCreateCircularReveal3);
                }
                animatorSetM17015a = animatorSet;
            }
            c6315hM12941c.m12942a(animatorSetM17015a);
            arrayList3.add(animatorSetM17015a);
            arrayList2 = arrayList;
            arrayList2.add(new C8765a(interfaceC8768d2));
        } else {
            c3105b = c3105bMo8940z;
            z13 = z13;
            arrayList2 = arrayList;
        }
        if (z13) {
            InterfaceC8768d interfaceC8768d3 = (InterfaceC8768d) view2;
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            ColorStateList colorStateListM18713g = C10029b0.i.m18713g(view);
            int colorForState = colorStateListM18713g != null ? colorStateListM18713g.getColorForState(view.getDrawableState(), colorStateListM18713g.getDefaultColor()) : 0;
            int i16 = 16777215 & colorForState;
            z12 = z10;
            if (z12) {
                if (!z11) {
                    interfaceC8768d3.setCircularRevealScrimColor(colorForState);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC8768d3, InterfaceC8768d.c.f46484a, i16);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(interfaceC8768d3, InterfaceC8768d.c.f46484a, colorForState);
            }
            objectAnimatorOfInt.setEvaluator(C6309b.f36528a);
            c3105b2 = c3105b;
            c3105b2.f15875a.m12941c("color").m12942a(objectAnimatorOfInt);
            arrayList3.add(objectAnimatorOfInt);
        } else {
            z12 = z10;
            c3105b2 = c3105b;
        }
        boolean z14 = view2 instanceof ViewGroup;
        if (z14) {
            View viewFindViewById = view2.findViewById(R.id.mtrl_child_content_container);
            if (viewFindViewById != null) {
                if (viewFindViewById instanceof ViewGroup) {
                    viewGroup = (ViewGroup) viewFindViewById;
                } else {
                    viewGroup = null;
                }
            } else if ((view2 instanceof C8037c) || (view2 instanceof C8036b)) {
                View childAt = ((ViewGroup) view2).getChildAt(0);
                if (childAt instanceof ViewGroup) {
                    viewGroup = (ViewGroup) childAt;
                } else {
                    viewGroup = null;
                }
            } else if (z14) {
                viewGroup = (ViewGroup) view2;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                if (z12) {
                    if (!z11) {
                        C6310c.f36529a.set(viewGroup, Float.valueOf(0.0f));
                    }
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, C6310c.f36529a, 1.0f);
                } else {
                    objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(viewGroup, C6310c.f36529a, 0.0f);
                }
                c3105b2.f15875a.m12941c("contentFade").m12942a(objectAnimatorOfFloat4);
                arrayList3.add(objectAnimatorOfFloat4);
            }
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        C7499b.m14952m0(animatorSet2, arrayList3);
        animatorSet2.addListener(new C3104a(z12, view2, view));
        int size = arrayList2.size();
        for (int i17 = 0; i17 < size; i17++) {
            animatorSet2.addListener((Animator.AnimatorListener) arrayList2.get(i17));
        }
        return animatorSet2;
    }

    /* JADX INFO: renamed from: v */
    public final float m8937v(View view, View view2, C0062b c0062b) {
        RectF rectF = this.f15867d;
        RectF rectF2 = this.f15868e;
        m8939y(view, rectF);
        rectF.offset(this.f15870g, this.f15871h);
        m8939y(view2, rectF2);
        c0062b.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    /* JADX INFO: renamed from: w */
    public final float m8938w(View view, View view2, C0062b c0062b) {
        RectF rectF = this.f15867d;
        RectF rectF2 = this.f15868e;
        m8939y(view, rectF);
        rectF.offset(this.f15870g, this.f15871h);
        m8939y(view2, rectF2);
        c0062b.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    /* JADX INFO: renamed from: y */
    public final void m8939y(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        int[] iArr = this.f15869f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo(iArr[0], iArr[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* JADX INFO: renamed from: z */
    public abstract C3105b mo8940z(Context context, boolean z10);
}
