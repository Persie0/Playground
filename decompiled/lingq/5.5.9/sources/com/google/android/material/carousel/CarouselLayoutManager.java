package com.google.android.material.carousel;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.v4.media.AbstractC0140a;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.linguist.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p177ic.C6308a;
import p312p2.C8169a;
import p321pc.C8218b;
import p321pc.InterfaceC8217a;
import p321pc.InterfaceC8219c;
import p338qd.C8573r0;
import p471x2.C10029b0;
import p471x2.C10049l0;

/* JADX INFO: loaded from: classes.dex */
public class CarouselLayoutManager extends RecyclerView.AbstractC1120m implements InterfaceC8217a {

    /* JADX INFO: renamed from: p */
    public int f14947p;

    /* JADX INFO: renamed from: q */
    public int f14948q;

    /* JADX INFO: renamed from: r */
    public int f14949r;

    /* JADX INFO: renamed from: v */
    public C2979a f14953v;

    /* JADX INFO: renamed from: s */
    public final C2977b f14950s = new C2977b();

    /* JADX INFO: renamed from: w */
    public int f14954w = 0;

    /* JADX INFO: renamed from: t */
    public AbstractC0140a f14951t = new C2981c();

    /* JADX INFO: renamed from: u */
    public C2980b f14952u = null;

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$a */
    public static final class C2976a {

        /* JADX INFO: renamed from: a */
        public final View f14955a;

        /* JADX INFO: renamed from: b */
        public final float f14956b;

        /* JADX INFO: renamed from: c */
        public final C2978c f14957c;

        public C2976a(View view, float f3, C2978c c2978c) {
            this.f14955a = view;
            this.f14956b = f3;
            this.f14957c = c2978c;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$b */
    public static class C2977b extends RecyclerView.AbstractC1119l {

        /* JADX INFO: renamed from: a */
        public final Paint f14958a;

        /* JADX INFO: renamed from: b */
        public List<C2979a.b> f14959b;

        public C2977b() {
            Paint paint = new Paint();
            this.f14958a = paint;
            this.f14959b = Collections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1119l
        /* JADX INFO: renamed from: h */
        public final void mo4284h(Canvas canvas, RecyclerView recyclerView, RecyclerView.C1131x c1131x) {
            Paint paint = this.f14958a;
            paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
            for (C2979a.b bVar : this.f14959b) {
                paint.setColor(C8169a.m16211c(bVar.f14975c, -65281, -16776961));
                float f3 = bVar.f14974b;
                float fM4305I = ((CarouselLayoutManager) recyclerView.getLayoutManager()).m4305I();
                float f10 = bVar.f14974b;
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) recyclerView.getLayoutManager();
                canvas.drawLine(f3, fM4305I, f10, carouselLayoutManager.f7098o - carouselLayoutManager.m4301F(), paint);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.carousel.CarouselLayoutManager$c */
    public static class C2978c {

        /* JADX INFO: renamed from: a */
        public final C2979a.b f14960a;

        /* JADX INFO: renamed from: b */
        public final C2979a.b f14961b;

        public C2978c(C2979a.b bVar, C2979a.b bVar2) {
            if (!(bVar.f14973a <= bVar2.f14973a)) {
                throw new IllegalArgumentException();
            }
            this.f14960a = bVar;
            this.f14961b = bVar2;
        }
    }

    public CarouselLayoutManager() {
        m4322s0();
    }

    /* JADX INFO: renamed from: O0 */
    public static float m8642O0(float f3, C2978c c2978c) {
        C2979a.b bVar = c2978c.f14960a;
        float f10 = bVar.f14976d;
        C2979a.b bVar2 = c2978c.f14961b;
        return C6308a.m12936a(f10, bVar2.f14976d, bVar.f14974b, bVar2.f14974b, f3);
    }

    /* JADX INFO: renamed from: Q0 */
    public static C2978c m8643Q0(float f3, List list, boolean z10) {
        float f10 = Float.MAX_VALUE;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        float f11 = -3.4028235E38f;
        float f12 = Float.MAX_VALUE;
        float f13 = Float.MAX_VALUE;
        for (int i14 = 0; i14 < list.size(); i14++) {
            C2979a.b bVar = (C2979a.b) list.get(i14);
            float f14 = z10 ? bVar.f14974b : bVar.f14973a;
            float fAbs = Math.abs(f14 - f3);
            if (f14 <= f3 && fAbs <= f10) {
                i10 = i14;
                f10 = fAbs;
            }
            if (f14 > f3 && fAbs <= f12) {
                i12 = i14;
                f12 = fAbs;
            }
            if (f14 <= f13) {
                i11 = i14;
                f13 = f14;
            }
            if (f14 > f11) {
                i13 = i14;
                f11 = f14;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new C2978c((C2979a.b) list.get(i10), (C2979a.b) list.get(i12));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: B */
    public final void mo4296B(View view, Rect rect) {
        super.mo4296B(view, rect);
        float fCenterX = rect.centerX();
        float fWidth = (rect.width() - m8642O0(fCenterX, m8643Q0(fCenterX, this.f14953v.f14963b, true))) / 2.0f;
        rect.set((int) (rect.left + fWidth), rect.top, (int) (rect.right - fWidth), rect.bottom);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: E0 */
    public final void mo4110E0(RecyclerView recyclerView, int i10) {
        C8218b c8218b = new C8218b(this, recyclerView.getContext());
        c8218b.f7125a = i10;
        m4302F0(c8218b);
    }

    /* JADX INFO: renamed from: H0 */
    public final void m8644H0(View view, int i10, float f3) {
        float f10 = this.f14953v.f14962a / 2.0f;
        m4311c(view, i10, false);
        RecyclerView.AbstractC1120m.m4291R(view, (int) (f3 - f10), m4305I(), (int) (f3 + f10), this.f7098o - m4301F());
    }

    /* JADX INFO: renamed from: I0 */
    public final int m8645I0(int i10, int i11) {
        return m8652R0() ? i10 - i11 : i10 + i11;
    }

    /* JADX INFO: renamed from: J0 */
    public final void m8646J0(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        int iM8649M0 = m8649M0(i10);
        while (i10 < c1131x.m4364b()) {
            C2976a c2976aM8655U0 = m8655U0(c1127t, iM8649M0, i10);
            float f3 = c2976aM8655U0.f14956b;
            C2978c c2978c = c2976aM8655U0.f14957c;
            if (m8653S0(f3, c2978c)) {
                return;
            }
            iM8649M0 = m8645I0(iM8649M0, (int) this.f14953v.f14962a);
            if (!m8654T0(f3, c2978c)) {
                m8644H0(c2976aM8655U0.f14955a, -1, f3);
            }
            i10++;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final void m8647K0(int i10, RecyclerView.C1127t c1127t) {
        int iM8649M0 = m8649M0(i10);
        while (i10 >= 0) {
            C2976a c2976aM8655U0 = m8655U0(c1127t, iM8649M0, i10);
            float f3 = c2976aM8655U0.f14956b;
            C2978c c2978c = c2976aM8655U0.f14957c;
            if (m8654T0(f3, c2978c)) {
                return;
            }
            int i11 = (int) this.f14953v.f14962a;
            iM8649M0 = m8652R0() ? iM8649M0 + i11 : iM8649M0 - i11;
            if (!m8653S0(f3, c2978c)) {
                m8644H0(c2976aM8655U0.f14955a, 0, f3);
            }
            i10--;
        }
    }

    /* JADX INFO: renamed from: L0 */
    public final float m8648L0(View view, float f3, C2978c c2978c) {
        C2979a.b bVar = c2978c.f14960a;
        float f10 = bVar.f14974b;
        C2979a.b bVar2 = c2978c.f14961b;
        float f11 = bVar2.f14974b;
        float f12 = bVar.f14973a;
        float f13 = bVar2.f14973a;
        float fM12936a = C6308a.m12936a(f10, f11, f12, f13, f3);
        if (bVar2 == this.f14953v.m8659b() || bVar == this.f14953v.m8661d()) {
            RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view.getLayoutParams();
            fM12936a += ((1.0f - bVar2.f14975c) + ((((ViewGroup.MarginLayoutParams) c1121n).rightMargin + ((ViewGroup.MarginLayoutParams) c1121n).leftMargin) / this.f14953v.f14962a)) * (f3 - f13);
        }
        return fM12936a;
    }

    /* JADX INFO: renamed from: M0 */
    public final int m8649M0(int i10) {
        return m8645I0((m8652R0() ? this.f7097n : 0) - this.f14947p, (int) (this.f14953v.f14962a * i10));
    }

    /* JADX INFO: renamed from: N0 */
    public final void m8650N0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        while (m4326y() > 0) {
            View viewM4324x = m4324x(0);
            Rect rect = new Rect();
            super.mo4296B(viewM4324x, rect);
            float fCenterX = rect.centerX();
            if (!m8654T0(fCenterX, m8643Q0(fCenterX, this.f14953v.f14963b, true))) {
                break;
            } else {
                m4317o0(viewM4324x, c1127t);
            }
        }
        while (m4326y() - 1 >= 0) {
            View viewM4324x2 = m4324x(m4326y() - 1);
            Rect rect2 = new Rect();
            super.mo4296B(viewM4324x2, rect2);
            float fCenterX2 = rect2.centerX();
            if (!m8653S0(fCenterX2, m8643Q0(fCenterX2, this.f14953v.f14963b, true))) {
                break;
            } else {
                m4317o0(viewM4324x2, c1127t);
            }
        }
        if (m4326y() == 0) {
            m8647K0(this.f14954w - 1, c1127t);
            m8646J0(this.f14954w, c1127t, c1131x);
        } else {
            int iM4286J = RecyclerView.AbstractC1120m.m4286J(m4324x(0));
            int iM4286J2 = RecyclerView.AbstractC1120m.m4286J(m4324x(m4326y() - 1));
            m8647K0(iM4286J - 1, c1127t);
            m8646J0(iM4286J2 + 1, c1127t, c1131x);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final int m8651P0(C2979a c2979a, int i10) {
        if (!m8652R0()) {
            return (int) ((c2979a.f14962a / 2.0f) + ((i10 * c2979a.f14962a) - c2979a.m8658a().f14973a));
        }
        float f3 = this.f7097n - c2979a.m8660c().f14973a;
        float f10 = c2979a.f14962a;
        return (int) ((f3 - (i10 * f10)) - (f10 / 2.0f));
    }

    /* JADX INFO: renamed from: R0 */
    public final boolean m8652R0() {
        return m4299D() == 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0024, code lost:
    
        if (r4 > r3.f7097n) goto L12;
     */
    /* JADX INFO: renamed from: S0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m8653S0(float f3, C2978c c2978c) {
        float fM8642O0 = m8642O0(f3, c2978c);
        int i10 = (int) f3;
        int i11 = (int) (fM8642O0 / 2.0f);
        int i12 = m8652R0() ? i10 + i11 : i10 - i11;
        if (m8652R0()) {
            if (i12 < 0) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final boolean m8654T0(float f3, C2978c c2978c) {
        int iM8645I0 = m8645I0((int) f3, (int) (m8642O0(f3, c2978c) / 2.0f));
        if (m8652R0()) {
            if (iM8645I0 > this.f7097n) {
                return true;
            }
            return false;
        }
        if (iM8645I0 < 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    public final C2976a m8655U0(RecyclerView.C1127t c1127t, float f3, int i10) {
        float f10 = this.f14953v.f14962a / 2.0f;
        View viewM4345d = c1127t.m4345d(i10);
        m8656V0(viewM4345d);
        float fM8645I0 = m8645I0((int) f3, (int) f10);
        C2978c c2978cM8643Q0 = m8643Q0(fM8645I0, this.f14953v.f14963b, false);
        float fM8648L0 = m8648L0(viewM4345d, fM8645I0, c2978cM8643Q0);
        if (viewM4345d instanceof InterfaceC8219c) {
            float f11 = c2978cM8643Q0.f14960a.f14975c;
            float f12 = c2978cM8643Q0.f14961b.f14975c;
            LinearInterpolator linearInterpolator = C6308a.f36523a;
            ((InterfaceC8219c) viewM4345d).m16363a();
        }
        return new C2976a(viewM4345d, fM8648L0, c2978cM8643Q0);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: V0 */
    public final void m8656V0(View view) {
        if (!(view instanceof InterfaceC8219c)) {
            throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
        }
        RecyclerView.C1121n c1121n = (RecyclerView.C1121n) view.getLayoutParams();
        Rect rect = new Rect();
        m4312e(view, rect);
        int i10 = rect.left + rect.right + 0;
        int i11 = rect.top + rect.bottom + 0;
        C2980b c2980b = this.f14952u;
        view.measure(RecyclerView.AbstractC1120m.m4294z(true, this.f7097n, this.f7095l, m4304H() + m4303G() + ((ViewGroup.MarginLayoutParams) c1121n).leftMargin + ((ViewGroup.MarginLayoutParams) c1121n).rightMargin + i10, (int) (c2980b != null ? c2980b.f14977a.f14962a : ((ViewGroup.MarginLayoutParams) c1121n).width)), RecyclerView.AbstractC1120m.m4294z(false, this.f7098o, this.f7096m, m4301F() + m4305I() + ((ViewGroup.MarginLayoutParams) c1121n).topMargin + ((ViewGroup.MarginLayoutParams) c1121n).bottomMargin + i11, ((ViewGroup.MarginLayoutParams) c1121n).height));
    }

    /* JADX INFO: renamed from: W0 */
    public final void m8657W0() {
        C2979a c2979aM8665b;
        C2979a c2979a;
        int i10 = this.f14949r;
        int i11 = this.f14948q;
        if (i10 <= i11) {
            if (m8652R0()) {
                List<C2979a> list = this.f14952u.f14979c;
                c2979a = list.get(list.size() - 1);
            } else {
                List<C2979a> list2 = this.f14952u.f14978b;
                c2979a = list2.get(list2.size() - 1);
            }
            this.f14953v = c2979a;
        } else {
            C2980b c2980b = this.f14952u;
            float f3 = this.f14947p;
            float f10 = i11;
            float f11 = i10;
            float f12 = c2980b.f14982f + f10;
            float f13 = f11 - c2980b.f14983g;
            if (f3 < f12) {
                c2979aM8665b = C2980b.m8665b(c2980b.f14978b, C6308a.m12936a(1.0f, 0.0f, f10, f12, f3), c2980b.f14980d);
            } else if (f3 > f13) {
                c2979aM8665b = C2980b.m8665b(c2980b.f14979c, C6308a.m12936a(0.0f, 1.0f, f13, f11, f3), c2980b.f14981e);
            } else {
                c2979aM8665b = c2980b.f14977a;
            }
            this.f14953v = c2979aM8665b;
        }
        List<C2979a.b> list3 = this.f14953v.f14963b;
        C2977b c2977b = this.f14950s;
        c2977b.getClass();
        c2977b.f14959b = Collections.unmodifiableList(list3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: X */
    public final void mo4127X(AccessibilityEvent accessibilityEvent) {
        super.mo4127X(accessibilityEvent);
        if (m4326y() > 0) {
            accessibilityEvent.setFromIndex(RecyclerView.AbstractC1120m.m4286J(m4324x(0)));
            accessibilityEvent.setToIndex(RecyclerView.AbstractC1120m.m4286J(m4324x(m4326y() - 1)));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: g0 */
    public final void mo4085g0(RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        boolean z10;
        int i10;
        C2979a c2979a;
        int iM18688f;
        C2979a c2979a2;
        int iM18687e;
        int i11;
        List<C2979a.b> list;
        int i12;
        int i13;
        int i14;
        boolean z11;
        int i15;
        int size;
        if (c1131x.m4364b() <= 0) {
            m4315m0(c1127t);
            this.f14954w = 0;
            return;
        }
        boolean zM8652R0 = m8652R0();
        boolean z12 = true;
        boolean z13 = this.f14952u == null;
        if (z13) {
            View viewM4345d = c1127t.m4345d(0);
            m8656V0(viewM4345d);
            C2979a c2979aMo585W = this.f14951t.mo585W(this, viewM4345d);
            if (zM8652R0) {
                C2979a.a aVar = new C2979a.a(c2979aMo585W.f14962a);
                float f3 = c2979aMo585W.m8659b().f14974b - (c2979aMo585W.m8659b().f14976d / 2.0f);
                List<C2979a.b> list2 = c2979aMo585W.f14963b;
                int size2 = list2.size() - 1;
                while (size2 >= 0) {
                    C2979a.b bVar = list2.get(size2);
                    float f10 = bVar.f14976d;
                    aVar.m8662a((f10 / 2.0f) + f3, bVar.f14975c, f10, (size2 < c2979aMo585W.f14964c || size2 > c2979aMo585W.f14965d) ? false : z12);
                    f3 += bVar.f14976d;
                    size2--;
                    z12 = true;
                }
                c2979aMo585W = aVar.m8663b();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(c2979aMo585W);
            int i16 = 0;
            while (true) {
                int size3 = c2979aMo585W.f14963b.size();
                list = c2979aMo585W.f14963b;
                if (i16 >= size3) {
                    i16 = -1;
                    break;
                } else if (list.get(i16).f14974b >= 0.0f) {
                    break;
                } else {
                    i16++;
                }
            }
            boolean z14 = c2979aMo585W.m8658a().f14974b - (c2979aMo585W.m8658a().f14976d / 2.0f) <= 0.0f || c2979aMo585W.m8658a() == c2979aMo585W.m8659b();
            int i17 = c2979aMo585W.f14965d;
            int i18 = c2979aMo585W.f14964c;
            if (!z14 && i16 != -1) {
                int i19 = (i18 - 1) - i16;
                float f11 = c2979aMo585W.m8659b().f14974b - (c2979aMo585W.m8659b().f14976d / 2.0f);
                int i20 = 0;
                while (i20 <= i19) {
                    C2979a c2979a3 = (C2979a) arrayList.get(arrayList.size() - 1);
                    int size4 = list.size() - 1;
                    int i21 = (i16 + i20) - 1;
                    if (i21 >= 0) {
                        float f12 = list.get(i21).f14975c;
                        int i22 = c2979a3.f14965d;
                        while (true) {
                            List<C2979a.b> list3 = c2979a3.f14963b;
                            z11 = z13;
                            if (i22 >= list3.size()) {
                                size = list3.size() - 1;
                                break;
                            } else if (f12 == list3.get(i22).f14975c) {
                                size = i22;
                                break;
                            } else {
                                i22++;
                                z13 = z11;
                            }
                        }
                        i15 = size - 1;
                    } else {
                        z11 = z13;
                        i15 = size4;
                    }
                    arrayList.add(C2980b.m8666c(c2979a3, i16, i15, f11, (i18 - i20) - 1, (i17 - i20) - 1));
                    i20++;
                    i19 = i19;
                    z13 = z11;
                }
            }
            z10 = z13;
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(c2979aMo585W);
            int size5 = list.size() - 1;
            while (true) {
                if (size5 < 0) {
                    size5 = -1;
                    break;
                } else if (list.get(size5).f14974b <= this.f7097n) {
                    break;
                } else {
                    size5--;
                }
            }
            if (!((c2979aMo585W.m8660c().f14976d / 2.0f) + c2979aMo585W.m8660c().f14974b >= ((float) this.f7097n) || c2979aMo585W.m8660c() == c2979aMo585W.m8661d()) && size5 != -1) {
                int i23 = size5 - i17;
                float f13 = c2979aMo585W.m8659b().f14974b - (c2979aMo585W.m8659b().f14976d / 2.0f);
                int i24 = 0;
                while (i24 < i23) {
                    C2979a c2979a4 = (C2979a) arrayList2.get(arrayList2.size() - 1);
                    int i25 = (size5 - i24) + 1;
                    if (i25 < list.size()) {
                        float f14 = list.get(i25).f14975c;
                        int i26 = c2979a4.f14964c - 1;
                        while (true) {
                            if (i26 < 0) {
                                i12 = i23;
                                i14 = 1;
                                i26 = 0;
                                break;
                            } else {
                                i12 = i23;
                                if (f14 == c2979a4.f14963b.get(i26).f14975c) {
                                    i14 = 1;
                                    break;
                                } else {
                                    i26--;
                                    i23 = i12;
                                }
                            }
                        }
                        i13 = i26 + i14;
                    } else {
                        i12 = i23;
                        i13 = 0;
                    }
                    arrayList2.add(C2980b.m8666c(c2979a4, size5, i13, f13, i18 + i24 + 1, i17 + i24 + 1));
                    i24++;
                    i23 = i12;
                }
            }
            i10 = 1;
            this.f14952u = new C2980b(c2979aMo585W, arrayList, arrayList2);
        } else {
            z10 = z13;
            i10 = 1;
        }
        C2980b c2980b = this.f14952u;
        boolean zM8652R1 = m8652R0();
        if (zM8652R1) {
            List<C2979a> list4 = c2980b.f14979c;
            c2979a = list4.get(list4.size() - 1);
        } else {
            List<C2979a> list5 = c2980b.f14978b;
            c2979a = list5.get(list5.size() - 1);
        }
        C2979a.b bVarM8660c = zM8652R1 ? c2979a.m8660c() : c2979a.m8658a();
        RecyclerView recyclerView = this.f7085b;
        if (recyclerView != null) {
            WeakHashMap<View, C10049l0> weakHashMap = C10029b0.f50993a;
            iM18688f = C10029b0.e.m18688f(recyclerView);
        } else {
            iM18688f = 0;
        }
        if (!zM8652R1) {
            i10 = -1;
        }
        float f15 = iM18688f * i10;
        int i27 = (int) bVarM8660c.f14973a;
        int i28 = (int) (c2979a.f14962a / 2.0f);
        int i29 = (int) ((f15 + (m8652R0() ? this.f7097n : 0)) - (m8652R0() ? i27 + i28 : i27 - i28));
        C2980b c2980b2 = this.f14952u;
        boolean zM8652R2 = m8652R0();
        if (zM8652R2) {
            List<C2979a> list6 = c2980b2.f14978b;
            c2979a2 = list6.get(list6.size() - 1);
        } else {
            List<C2979a> list7 = c2980b2.f14979c;
            c2979a2 = list7.get(list7.size() - 1);
        }
        C2979a.b bVarM8658a = zM8652R2 ? c2979a2.m8658a() : c2979a2.m8660c();
        float fM4364b = (c1131x.m4364b() - 1) * c2979a2.f14962a;
        RecyclerView recyclerView2 = this.f7085b;
        if (recyclerView2 != null) {
            WeakHashMap<View, C10049l0> weakHashMap2 = C10029b0.f50993a;
            iM18687e = C10029b0.e.m18687e(recyclerView2);
        } else {
            iM18687e = 0;
        }
        float f16 = (fM4364b + iM18687e) * (zM8652R2 ? -1.0f : 1.0f);
        float f17 = bVarM8658a.f14973a - (m8652R0() ? this.f7097n : 0);
        int i30 = Math.abs(f17) > Math.abs(f16) ? 0 : (int) ((f16 - f17) + ((m8652R0() ? 0 : this.f7097n) - bVarM8658a.f14973a));
        int i31 = zM8652R0 ? i30 : i29;
        this.f14948q = i31;
        if (zM8652R0) {
            i30 = i29;
        }
        this.f14949r = i30;
        if (z10) {
            this.f14947p = i29;
        } else {
            int i32 = this.f14947p;
            int i33 = i32 + 0;
            if (i33 < i31) {
                i11 = i31 - i32;
            } else {
                i11 = i33 > i30 ? i30 - i32 : 0;
            }
            this.f14947p = i11 + i32;
        }
        this.f14954w = C8573r0.m16699T(this.f14954w, 0, c1131x.m4364b());
        m8657W0();
        m4320r(c1127t);
        m8650N0(c1127t, c1131x);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: h0 */
    public final void mo4087h0(RecyclerView.C1131x c1131x) {
        if (m4326y() == 0) {
            this.f14954w = 0;
        } else {
            this.f14954w = RecyclerView.AbstractC1120m.m4286J(m4324x(0));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: l */
    public final int mo4148l(RecyclerView.C1131x c1131x) {
        return (int) this.f14952u.f14977a.f14962a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: m */
    public final int mo4089m(RecyclerView.C1131x c1131x) {
        return this.f14947p;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: n */
    public final int mo4090n(RecyclerView.C1131x c1131x) {
        return this.f14949r - this.f14948q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: r0 */
    public final boolean mo4321r0(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        C2980b c2980b = this.f14952u;
        if (c2980b == null) {
            return false;
        }
        int iM8651P0 = m8651P0(c2980b.f14977a, RecyclerView.AbstractC1120m.m4286J(view)) - this.f14947p;
        if (z11 || iM8651P0 == 0) {
            return false;
        }
        recyclerView.scrollBy(iM8651P0, 0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: t */
    public final RecyclerView.C1121n mo4099t() {
        return new RecyclerView.C1121n(-2, -2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: t0 */
    public final int mo4100t0(int i10, RecyclerView.C1127t c1127t, RecyclerView.C1131x c1131x) {
        if (m4326y() != 0 && i10 != 0) {
            int i11 = this.f14947p;
            int i12 = this.f14948q;
            int i13 = this.f14949r;
            int i14 = i11 + i10;
            if (i14 < i12) {
                i10 = i12 - i11;
            } else if (i14 > i13) {
                i10 = i13 - i11;
            }
            this.f14947p = i11 + i10;
            m8657W0();
            float f3 = this.f14953v.f14962a / 2.0f;
            int iM8649M0 = m8649M0(RecyclerView.AbstractC1120m.m4286J(m4324x(0)));
            Rect rect = new Rect();
            for (int i15 = 0; i15 < m4326y(); i15++) {
                View viewM4324x = m4324x(i15);
                float fM8645I0 = m8645I0(iM8649M0, (int) f3);
                C2978c c2978cM8643Q0 = m8643Q0(fM8645I0, this.f14953v.f14963b, false);
                float fM8648L0 = m8648L0(viewM4324x, fM8645I0, c2978cM8643Q0);
                if (viewM4324x instanceof InterfaceC8219c) {
                    float f10 = c2978cM8643Q0.f14960a.f14975c;
                    float f11 = c2978cM8643Q0.f14961b.f14975c;
                    LinearInterpolator linearInterpolator = C6308a.f36523a;
                    ((InterfaceC8219c) viewM4324x).m16363a();
                }
                super.mo4296B(viewM4324x, rect);
                viewM4324x.offsetLeftAndRight((int) (fM8648L0 - (rect.left + f3)));
                iM8649M0 = m8645I0(iM8649M0, (int) this.f14953v.f14962a);
            }
            m8650N0(c1127t, c1131x);
            return i10;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1120m
    /* JADX INFO: renamed from: u0 */
    public final void mo4153u0(int i10) {
        C2980b c2980b = this.f14952u;
        if (c2980b == null) {
            return;
        }
        this.f14947p = m8651P0(c2980b.f14977a, i10);
        this.f14954w = C8573r0.m16699T(i10, 0, Math.max(0, m4298C() - 1));
        m8657W0();
        m4322s0();
    }
}
