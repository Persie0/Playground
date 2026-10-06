package p000;

import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class dwm implements dwl {

    /* JADX INFO: renamed from: a */
    private final GradientDrawable f12777a;

    /* JADX INFO: renamed from: b */
    private final GradientDrawable f12778b;

    /* JADX INFO: renamed from: c */
    private final GradientDrawable f12779c;

    /* JADX INFO: renamed from: d */
    private final Set f12780d;

    /* JADX INFO: renamed from: e */
    private float f12781e;

    /* JADX INFO: renamed from: f */
    private float f12782f;

    /* JADX INFO: renamed from: g */
    private float f12783g;

    /* JADX INFO: renamed from: h */
    private float f12784h;

    /* JADX INFO: renamed from: i */
    private float f12785i;

    /* JADX INFO: renamed from: j */
    private int f12786j;

    /* JADX INFO: renamed from: k */
    private int f12787k;

    /* JADX INFO: renamed from: l */
    private boolean f12788l;

    /* JADX INFO: renamed from: m */
    private boolean f12789m;

    public dwm() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        this.f12780d = new HashSet();
        this.f12786j = -1;
        this.f12777a = gradientDrawable;
        this.f12778b = gradientDrawable2;
        this.f12779c = gradientDrawable3;
        gradientDrawable.setShape(1);
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: a */
    public final int mo6809a() {
        return this.f12786j;
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: b */
    public final void mo6810b(Canvas canvas) {
        float f = this.f12781e;
        if (f > 0.0f) {
            dxu.m6865a(canvas, this.f12777a, true, f, this.f12782f, this.f12786j);
        }
        if (this.f12788l) {
            dxu.m6865a(canvas, this.f12779c, false, this.f12781e + this.f12784h, this.f12783g, this.f12787k);
        }
        if (this.f12789m) {
            dxu.m6865a(canvas, this.f12778b, false, this.f12781e + this.f12785i, this.f12783g, this.f12787k);
        }
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: c */
    public final void mo6811c(mxk mxkVar) {
        this.f12780d.addAll(mxkVar);
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: d */
    public final void mo6812d(mxk mxkVar) {
        this.f12780d.removeAll(mxkVar);
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: e */
    public final void mo6813e(int i) {
        if (this.f12780d.contains(dwk.BOUNDARY_COLOR)) {
            return;
        }
        this.f12787k = i;
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: f */
    public final void mo6814f(float f, float f2) {
        if (this.f12780d.contains(dwk.BOUNDARY_CORNER_RADIUS)) {
            return;
        }
        this.f12779c.setCornerRadius(f);
        this.f12778b.setCornerRadius(f2);
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: g */
    public final void mo6815g(float f, float f2) {
        if (this.f12780d.contains(dwk.f12768d)) {
            return;
        }
        this.f12788l = f > 0.0f;
        this.f12789m = f2 > 0.0f;
        float f3 = this.f12781e;
        this.f12784h = f - f3;
        this.f12785i = f2 - f3;
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: h */
    public final void mo6816h(float f) {
        if (this.f12780d.contains(dwk.BOUNDARY_THICKNESS)) {
            return;
        }
        this.f12783g = f;
        int i = (int) f;
        this.f12779c.setStroke(i, this.f12787k);
        this.f12778b.setStroke(i, this.f12787k);
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: i */
    public final void mo6817i(int i, int i2) {
        if (this.f12780d.contains(dwk.BOUNDS)) {
            return;
        }
        this.f12777a.setBounds(0, 0, i, i2);
        this.f12779c.setBounds(0, 0, i, i2);
        this.f12778b.setBounds(0, 0, i, i2);
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: j */
    public final void mo6818j(int i) {
        if (this.f12780d.contains(dwk.COLOR)) {
            return;
        }
        this.f12786j = i;
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: k */
    public final void mo6819k(float f) {
        if (this.f12780d.contains(dwk.f12770f)) {
            return;
        }
        this.f12777a.setCornerRadius(f);
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: l */
    public final void mo6820l(float f) {
        if (this.f12780d.contains(dwk.DIAMETER)) {
            return;
        }
        lku.m15669w(f > 0.0f);
        this.f12781e = f;
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: m */
    public final void mo6821m(float f) {
        if (this.f12780d.contains(dwk.OPACITY)) {
            return;
        }
        int i = (int) (f * 255.0f);
        this.f12777a.setAlpha(i);
        this.f12779c.setAlpha(i);
        this.f12778b.setAlpha(i);
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: n */
    public final void mo6822n(float f) {
        if (this.f12780d.contains(dwk.THICKNESS)) {
            return;
        }
        this.f12782f = f;
        this.f12777a.setStroke((int) f, this.f12786j);
    }

    @Override // p000.dwl
    /* JADX INFO: renamed from: o */
    public final void mo6823o(int i) {
        if (this.f12780d.contains(dwk.SHAPE)) {
            return;
        }
        this.f12777a.setShape(i);
        this.f12779c.setShape(i);
        this.f12778b.setShape(i);
    }
}
