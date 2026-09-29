package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R$dimen;
import com.google.android.material.R$styleable;
import p000.C3386nv;
import p000.bj0;
import p000.fo0;
import p000.g38;
import p000.go0;
import p000.ho0;
import p000.j38;
import p000.k38;
import p000.o46;
import p000.ux5;
import p000.y28;
import p000.z28;

/* JADX INFO: loaded from: classes2.dex */
public class CarouselLayoutManager extends y28 implements j38 {

    /* JADX INFO: renamed from: p */
    public final o46 f12823p;

    /* JADX INFO: renamed from: q */
    public bj0 f12824q;

    /* JADX INFO: renamed from: r */
    public final View.OnLayoutChangeListener f12825r;

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        new go0();
        this.f12825r = new View.OnLayoutChangeListener() { // from class: eo0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new RunnableC3781y2(this.f37592a, 9));
            }
        };
        this.f12823p = new o46();
        m24905u0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.Carousel);
            typedArrayObtainStyledAttributes.getInt(R$styleable.Carousel_carousel_alignment, 0);
            m24905u0();
            m6094M0(typedArrayObtainStyledAttributes.getInt(androidx.recyclerview.R$styleable.RecyclerView_android_orientation, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: G0 */
    public final void mo2654G0(RecyclerView recyclerView, int i) {
        fo0 fo0Var = new fo0(this, recyclerView.getContext());
        fo0Var.f38889a = i;
        m24892H0(fo0Var);
    }

    /* JADX INFO: renamed from: J0 */
    public final float m6091J0(float f, float f2) {
        return m6093L0() ? f - f2 : f + f2;
    }

    /* JADX INFO: renamed from: K0 */
    public final boolean m6092K0() {
        return this.f12824q.f8576b == 0;
    }

    /* JADX INFO: renamed from: L0 */
    public final boolean m6093L0() {
        return m6092K0() && this.f69172b.getLayoutDirection() == 1;
    }

    /* JADX INFO: renamed from: M0 */
    public final void m6094M0(int i) {
        ho0 ho0Var;
        if (i != 0 && i != 1) {
            C3386nv.m17626m(ux5.m22988k(i, "invalid orientation:"));
            return;
        }
        mo2677c(null);
        bj0 bj0Var = this.f12824q;
        if (bj0Var == null || i != bj0Var.f8576b) {
            if (i == 0) {
                ho0Var = new ho0(this, 1);
            } else {
                if (i != 1) {
                    C3386nv.m17626m("invalid orientation");
                    return;
                }
                ho0Var = new ho0(this, 0);
            }
            this.f12824q = ho0Var;
            m24905u0();
        }
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: O */
    public final boolean mo2659O() {
        return true;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: V */
    public final void mo6095V(RecyclerView recyclerView) {
        Context context = recyclerView.getContext();
        o46 o46Var = this.f12823p;
        float dimension = o46Var.f53825a;
        if (dimension <= 0.0f) {
            dimension = context.getResources().getDimension(R$dimen.m3_carousel_small_item_size_min);
        }
        o46Var.f53825a = dimension;
        float dimension2 = o46Var.f53826b;
        if (dimension2 <= 0.0f) {
            dimension2 = context.getResources().getDimension(R$dimen.m3_carousel_small_item_size_max);
        }
        o46Var.f53826b = dimension2;
        m24905u0();
        recyclerView.addOnLayoutChangeListener(this.f12825r);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: W */
    public final void mo2669W(RecyclerView recyclerView) {
        recyclerView.removeOnLayoutChangeListener(this.f12825r);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0039  */
    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    @Override // p000.y28
    /* JADX INFO: renamed from: X */
    public final View mo2616X(View view, int i, g38 g38Var, k38 k38Var) {
        byte b;
        if (m24906v() != 0) {
            int i2 = this.f12824q.f8576b;
            if (i == 1) {
                b = -1;
            } else if (i == 2) {
                b = 1;
            } else if (i != 17) {
                if (i != 33) {
                    if (i != 66) {
                        if (i != 130) {
                            Log.d("CarouselLayoutManager", "Unknown focus request:" + i);
                        } else if (i2 == 1) {
                            b = 1;
                        }
                        b = -2147483648;
                    } else if (i2 != 0) {
                        b = -2147483648;
                    } else if (m6093L0()) {
                        b = -1;
                    } else {
                        b = 1;
                    }
                } else if (i2 == 1) {
                    b = -1;
                } else {
                    b = -2147483648;
                }
            } else if (i2 != 0) {
                b = -2147483648;
            } else if (m6093L0()) {
                b = 1;
            } else {
                b = -1;
            }
            if (b != -2147483648) {
                if (b == -1) {
                    if (y28.m24878K(view) != 0) {
                        int iM24878K = y28.m24878K(m24904u(0)) - 1;
                        if (iM24878K < 0 || iM24878K >= m24888F()) {
                            return m24904u(m6093L0() ? m24906v() - 1 : 0);
                        }
                        this.f12824q.mo3755h();
                        throw null;
                    }
                } else if (y28.m24878K(view) != m24888F() - 1) {
                    int iM24878K2 = y28.m24878K(m24904u(m24906v() - 1)) + 1;
                    if (iM24878K2 < 0 || iM24878K2 >= m24888F()) {
                        return m24904u(m6093L0() ? 0 : m24906v() - 1);
                    }
                    this.f12824q.mo3755h();
                    throw null;
                }
            }
        }
        return null;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: Y */
    public final void mo2671Y(AccessibilityEvent accessibilityEvent) {
        super.mo2671Y(accessibilityEvent);
        if (m24906v() > 0) {
            accessibilityEvent.setFromIndex(y28.m24878K(m24904u(0)));
            accessibilityEvent.setToIndex(y28.m24878K(m24904u(m24906v() - 1)));
        }
    }

    @Override // p000.j38
    /* JADX INFO: renamed from: a */
    public final PointF mo2674a(int i) {
        return null;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: c0 */
    public final void mo2620c0(int i, int i2) {
        m24888F();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: d */
    public final boolean mo2679d() {
        return m6092K0();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: d0 */
    public final void mo2621d0() {
        m24888F();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: e */
    public final boolean mo2680e() {
        return !m6092K0();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: f0 */
    public final void mo2626f0(int i, int i2) {
        m24888F();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: h0 */
    public final void mo2628h0(g38 g38Var, k38 k38Var) {
        if (k38Var.m14789b() > 0) {
            if ((m6092K0() ? this.f69184n : this.f69185o) > 0.0f) {
                m6093L0();
                g38Var.m12332d(0);
                C3386nv.m17633t("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
                return;
            }
        }
        m24898o0(g38Var);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: i0 */
    public final void mo2629i0(k38 k38Var) {
        if (m24906v() == 0) {
            return;
        }
        y28.m24878K(m24904u(0));
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: j */
    public final int mo2687j(k38 k38Var) {
        m24906v();
        return 0;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: k */
    public final int mo2630k(k38 k38Var) {
        return 0;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: l */
    public final int mo2631l(k38 k38Var) {
        return 0;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: m */
    public final int mo2692m(k38 k38Var) {
        m24906v();
        return 0;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: n */
    public final int mo2634n(k38 k38Var) {
        return 0;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: o */
    public final int mo2635o(k38 k38Var) {
        return 0;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: r */
    public final z28 mo2638r() {
        return new z28(-2, -2);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: t0 */
    public final boolean mo6096t0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: v0 */
    public final int mo2645v0(int i, g38 g38Var, k38 k38Var) {
        if (!m6092K0() || m24906v() == 0 || i == 0) {
            return 0;
        }
        g38Var.m12332d(0);
        C3386nv.m17633t("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: w0 */
    public final void mo2697w0(int i) {
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: x0 */
    public final int mo2649x0(int i, g38 g38Var, k38 k38Var) {
        if (!mo2680e() || m24906v() == 0 || i == 0) {
            return 0;
        }
        g38Var.m12332d(0);
        C3386nv.m17633t("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        return 0;
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: z */
    public final void mo6097z(View view, Rect rect) {
        super.mo6097z(view, rect);
        rect.centerY();
        if (m6092K0()) {
            rect.centerX();
        }
        throw null;
    }

    public CarouselLayoutManager() {
        o46 o46Var = new o46();
        new go0();
        this.f12825r = new View.OnLayoutChangeListener() { // from class: eo0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                if (i5 - i3 == i9 - i7 && i6 - i4 == i10 - i8) {
                    return;
                }
                view.post(new RunnableC3781y2(this.f37592a, 9));
            }
        };
        this.f12823p = o46Var;
        m24905u0();
        m6094M0(0);
    }
}
