package com.google.android.apps.camera.focusindicator;

import android.animation.Animator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import androidx.wear.ambient.AmbientModeSupport;
import com.google.android.apps.camera.bottombar.C0100R;
import com.google.android.apps.camera.focusindicator.FocusIndicatorView;
import p000.cdg;
import p000.cdh;
import p000.cdp;
import p000.dhv;
import p000.dia;
import p000.dwh;
import p000.dwk;
import p000.dwl;
import p000.dwn;
import p000.dwq;
import p000.dwr;
import p000.dwt;
import p000.dwu;
import p000.dwx;
import p000.dwy;
import p000.dxh;
import p000.hzj;
import p000.ilf;
import p000.ilk;
import p000.ilu;
import p000.ilv;
import p000.ilw;
import p000.jwf;
import p000.jwn;
import p000.jww;
import p000.kay;
import p000.ljf;
import p000.mrm;
import p000.mrq;
import p000.mxk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FocusIndicatorView extends ConstraintLayout implements dxh, ilf {

    /* JADX INFO: renamed from: A */
    private final int[] f6690A;

    /* JADX INFO: renamed from: B */
    private volatile ilk f6691B;

    /* JADX INFO: renamed from: C */
    private final Animator.AnimatorListener f6692C;

    /* JADX INFO: renamed from: D */
    private AmbientModeSupport.AmbientController f6693D;

    /* JADX INFO: renamed from: d */
    public final jww f6694d;

    /* JADX INFO: renamed from: e */
    public final FocusIndicatorRingView f6695e;

    /* JADX INFO: renamed from: f */
    final EyesFocusIndicatorRectView f6696f;

    /* JADX INFO: renamed from: g */
    public final FocusIndicatorAccessoryView f6697g;

    /* JADX INFO: renamed from: h */
    public final FocusIndicatorAccessoryView f6698h;

    /* JADX INFO: renamed from: i */
    public final dwl f6699i;

    /* JADX INFO: renamed from: j */
    final dwn f6700j;

    /* JADX INFO: renamed from: k */
    final ilw f6701k;

    /* JADX INFO: renamed from: l */
    final ilw f6702l;

    /* JADX INFO: renamed from: m */
    final ilw f6703m;

    /* JADX INFO: renamed from: n */
    final ilw f6704n;

    /* JADX INFO: renamed from: o */
    final ilw f6705o;

    /* JADX INFO: renamed from: p */
    final ilw f6706p;

    /* JADX INFO: renamed from: q */
    ilw f6707q;

    /* JADX INFO: renamed from: r */
    final ilw f6708r;

    /* JADX INFO: renamed from: s */
    final ilw f6709s;

    /* JADX INFO: renamed from: t */
    final ilw f6710t;

    /* JADX INFO: renamed from: u */
    final ilw f6711u;

    /* JADX INFO: renamed from: v */
    final ilw f6712v;

    /* JADX INFO: renamed from: w */
    final ilw f6713w;

    /* JADX INFO: renamed from: x */
    public Animator f6714x;

    /* JADX INFO: renamed from: y */
    private final dwr f6715y;

    /* JADX INFO: renamed from: z */
    private final PointF f6716z;

    /* JADX WARN: Multi-variable type inference failed */
    public FocusIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6716z = new PointF(0.0f, 0.0f);
        this.f6694d = new jwf(false);
        this.f6690A = new int[2];
        this.f6691B = ilk.PORTRAIT;
        this.f6692C = new dwq(this);
        ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(C0100R.layout.focus_indicator_view_contents, this);
        dwr dwrVarM4135E = m4135E(context);
        this.f6715y = dwrVarM4135E;
        dwh dwhVar = (dwh) dwrVarM4135E;
        this.f6695e = dwt.m6831b(dwhVar.f12753n);
        ljf ljfVar = dwhVar.f12753n;
        Object obj = ljfVar.f38375g;
        obj.getClass();
        this.f6696f = (EyesFocusIndicatorRectView) obj;
        Object obj2 = ljfVar.f38370b;
        obj2.getClass();
        this.f6697g = (FocusIndicatorAccessoryView) obj2;
        this.f6698h = dwu.m6833b(ljfVar);
        this.f6699i = dwx.m6837b(dwhVar.f12753n);
        this.f6700j = dwy.m6839b(dwhVar.f12753n);
        ilw ilwVar = (ilw) dwhVar.f12740a.get();
        this.f6701k = ilwVar;
        ilw ilwVar2 = (ilw) dwhVar.f12741b.get();
        this.f6702l = ilwVar2;
        ilw ilwVar3 = (ilw) dwhVar.f12742c.get();
        this.f6703m = ilwVar3;
        ilw ilwVar4 = (ilw) dwhVar.f12743d.get();
        this.f6704n = ilwVar4;
        ilw ilwVar5 = (ilw) dwhVar.f12744e.get();
        this.f6705o = ilwVar5;
        ilw ilwVar6 = (ilw) dwhVar.f12745f.get();
        this.f6706p = ilwVar6;
        this.f6707q = (ilw) dwhVar.f12746g.get();
        ilw ilwVar7 = (ilw) dwhVar.f12747h.get();
        this.f6708r = ilwVar7;
        ilw ilwVar8 = (ilw) dwhVar.f12748i.get();
        this.f6709s = ilwVar8;
        ilw ilwVar9 = (ilw) dwhVar.f12749j.get();
        this.f6710t = ilwVar9;
        ilw ilwVar10 = (ilw) dwhVar.f12750k.get();
        this.f6711u = ilwVar10;
        ilw ilwVar11 = (ilw) dwhVar.f12751l.get();
        this.f6712v = ilwVar11;
        ilw ilwVar12 = (ilw) dwhVar.f12752m.get();
        this.f6713w = ilwVar12;
        m4140J(ilwVar);
        m4140J(ilwVar2);
        m4140J(ilwVar3);
        m4140J(ilwVar4);
        m4140J(ilwVar5);
        m4140J(ilwVar6);
        m4140J(ilwVar7);
        m4140J(ilwVar8);
        m4140J(ilwVar9);
        m4140J(ilwVar10);
        m4140J(ilwVar11);
        m4140J(ilwVar12);
        if (context instanceof cdp) {
            dhv dhvVarMo3499a = ((cdp) context).mo3499a();
            int i = dia.f11213a;
            dhvVarMo3499a.mo6175c();
        }
    }

    /* JADX INFO: renamed from: D */
    private final PointF m4134D(PointF pointF) {
        float[] fArr = {pointF.x, pointF.y};
        int i = this.f6691B.f31449e;
        Matrix matrix = new Matrix();
        matrix.setRotate(i, 0.5f, 0.5f);
        matrix.mapPoints(fArr);
        return new PointF(fArr[0] * getWidth(), fArr[1] * getHeight());
    }

    /* JADX INFO: renamed from: E */
    private final dwr m4135E(Context context) {
        return new dwh(new ljf(context, this), null, null);
    }

    /* JADX INFO: renamed from: F */
    private final void m4136F() {
        Animator animator = this.f6714x;
        if (animator != null && animator.isRunning()) {
            this.f6714x.cancel();
            this.f6714x = null;
        }
        FocusIndicatorAccessoryView focusIndicatorAccessoryView = this.f6697g;
        if (focusIndicatorAccessoryView != null && focusIndicatorAccessoryView.m4131f()) {
            this.f6697g.m4126a();
        }
        FocusIndicatorAccessoryView focusIndicatorAccessoryView2 = this.f6698h;
        if (focusIndicatorAccessoryView2 == null || !focusIndicatorAccessoryView2.m4131f()) {
            return;
        }
        this.f6698h.m4126a();
    }

    /* JADX INFO: renamed from: G */
    private final void m4137G() {
        this.f6700j.mo6827d(0.0f);
        this.f6699i.mo6821m(0.0f);
        this.f6695e.invalidate();
    }

    /* JADX INFO: renamed from: H */
    private final void m4138H() {
        this.f6698h.m4128c(false);
    }

    /* JADX INFO: renamed from: I */
    private final void m4139I(mrm mrmVar, int i) {
        if (!mrmVar.mo16813g()) {
            this.f6695e.m4133b(new PointF(getWidth() / 2.0f, getHeight() / 2.0f));
            return;
        }
        this.f6695e.m4133b(m4134D((PointF) mrmVar.mo16809c()));
        double d = ((PointF) mrmVar.mo16809c()).x;
        Double.isNaN(d);
        if (Math.abs(d - 0.5d) < 0.001d) {
            double d2 = ((PointF) mrmVar.mo16809c()).y;
            Double.isNaN(d2);
            Math.abs(d2 - 0.5d);
        }
        m4141K(i);
    }

    /* JADX INFO: renamed from: J */
    private final void m4140J(ilw ilwVar) {
        if (ilwVar != null) {
            ilwVar.mo11453b(this.f6692C);
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m4141K(float f) {
        float f2;
        Resources resources = getContext().getResources();
        float f3 = resources.getDisplayMetrics().widthPixels;
        float f4 = resources.getDisplayMetrics().heightPixels;
        if (f > 1350.0f) {
            f = 1350.0f;
        } else if (f < 360.0f) {
            f = 360.0f;
        }
        float fMax = Math.max(f4, f3);
        float fMin = Math.min(f4, f3);
        float f5 = fMax / fMin;
        if (this.f6691B.f31449e == 0) {
            f2 = (f * fMin) / 1080.0f;
        } else {
            f2 = (f * fMax) / (f5 > 2.1f ? 2280 : 2060);
        }
        float fApplyDimension = TypedValue.applyDimension(0, f2 / 2.0f, resources.getDisplayMetrics());
        this.f6699i.mo6820l(fApplyDimension);
        this.f6699i.mo6819k(fApplyDimension / 2.0f);
    }

    /* JADX INFO: renamed from: A */
    public final void m4142A() {
        m4136F();
        this.f6710t.mo11452a();
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: B */
    public final ilv mo4143B() {
        Animator animator = this.f6714x;
        if (animator != null && animator.isRunning()) {
            return ilw.f31464a;
        }
        m4137G();
        mo4158p();
        this.f6695e.m4133b(new PointF(getWidth() / 2.0f, getHeight() / 2.0f));
        return this.f6703m.mo11452a();
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: C */
    public final void mo4144C(AmbientModeSupport.AmbientController ambientController) {
        this.f6693D = ambientController;
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: c */
    public final PointF mo4145c() {
        return this.f6716z;
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: d */
    public final ilv mo4146d() {
        Animator animator = this.f6714x;
        return (animator == null || !animator.isRunning()) ? this.f6702l.mo11452a() : ilw.f31464a;
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: e */
    public final ilv mo4147e(PointF pointF) {
        m4136F();
        m4137G();
        mo4158p();
        this.f6695e.m4133b(pointF);
        return this.f6701k.mo11452a();
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: f */
    public final ilv mo4148f(PointF pointF) {
        m4136F();
        m4138H();
        this.f6695e.m4133b(pointF);
        ilv ilvVarMo11452a = this.f6712v.mo11452a();
        final mxk mxkVarM17141M = mxk.m17141M(dwk.SHAPE, dwk.COLOR, dwk.THICKNESS, dwk.f12770f, dwk.BOUNDARY_CORNER_RADIUS, dwk.f12768d, dwk.BOUNDARY_THICKNESS, dwk.BOUNDARY_COLOR);
        this.f6695e.f6689g = true;
        this.f6699i.mo6811c(mxkVarM17141M);
        ilvVarMo11452a.mo11450b(new ilu() { // from class: dwp
            @Override // p000.ilu
            /* JADX INFO: renamed from: a */
            public final void mo3420a(mrm mrmVar) {
                boolean zMo16813g = mrmVar.mo16813g();
                FocusIndicatorView focusIndicatorView = this.f12792a;
                mxk mxkVar = mxkVarM17141M;
                if (zMo16813g && ((Boolean) mrmVar.mo16809c()).booleanValue()) {
                    focusIndicatorView.f6697g.m4130e();
                    focusIndicatorView.f6697g.m4127b();
                }
                focusIndicatorView.f6695e.f6689g = false;
                focusIndicatorView.f6699i.mo6812d(mxkVar);
            }
        });
        return ilvVarMo11452a;
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: g */
    public final ilv mo4149g() {
        m4136F();
        this.f6697g.m4128c(true);
        return this.f6713w.mo11452a();
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: h */
    public final ilv mo4150h(mrm mrmVar) {
        m4136F();
        m4137G();
        mo4158p();
        m4138H();
        if (mrmVar.mo16813g()) {
            this.f6695e.m4133b((PointF) mrmVar.mo16809c());
        } else {
            mo4160r();
        }
        return this.f6709s.mo11452a();
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: i */
    public final ilv mo4151i() {
        if (this.f6698h.getVisibility() == 8) {
            return ilw.f31464a;
        }
        m4136F();
        this.f6698h.m4128c(true);
        return this.f6711u.mo11452a();
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: j */
    public final ilv mo4152j() {
        Animator animator = this.f6714x;
        return (animator == null || !animator.isRunning()) ? this.f6704n.mo11452a() : ilw.f31464a;
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: k */
    public final ilv mo4153k(mrm mrmVar, int i) {
        Animator animator = this.f6714x;
        if (animator != null && animator.isRunning()) {
            return ilw.f31464a;
        }
        m4137G();
        mo4158p();
        m4139I(mrmVar, i);
        return this.f6703m.mo11452a();
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: l */
    public final ilv mo4154l() {
        Animator animator = this.f6714x;
        return (animator == null || !animator.isRunning()) ? this.f6708r.mo11452a() : ilw.f31464a;
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: m */
    public final ilv mo4155m(PointF pointF) {
        m4136F();
        m4137G();
        mo4158p();
        m4138H();
        this.f6695e.m4133b(pointF);
        return this.f6707q.mo11452a();
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: n */
    public final jwn mo4156n() {
        return this.f6694d;
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: o */
    public final void mo4157o() {
        m4136F();
        m4137G();
        this.f6697g.m4128c(false);
        mo4162t(false);
        mo4158p();
        m4138H();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        FocusIndicatorAccessoryView focusIndicatorAccessoryView = this.f6697g;
        FocusIndicatorRingView focusIndicatorRingView = this.f6695e;
        focusIndicatorAccessoryView.f6680a = focusIndicatorRingView;
        this.f6698h.f6680a = focusIndicatorRingView;
    }

    @Override // android.support.constraint.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        kay kayVar;
        super.onLayout(z, i, i2, i3, i4);
        getLocationInWindow(this.f6690A);
        PointF pointF = this.f6716z;
        int[] iArr = this.f6690A;
        pointF.set(iArr[0], iArr[1]);
        ilk ilkVarM11426b = ilk.m11426b(getDisplay(), getContext());
        if (z || ilkVarM11426b != this.f6691B) {
            this.f6691B = ilkVarM11426b;
            FocusIndicatorRingView focusIndicatorRingView = this.f6695e;
            ilk ilkVar = this.f6691B;
            View view = (View) focusIndicatorRingView.getParent();
            ilk ilkVar2 = focusIndicatorRingView.f6687e;
            focusIndicatorRingView.f6687e = ilkVar;
            if (focusIndicatorRingView.f6688f) {
                ilk ilkVar3 = focusIndicatorRingView.f6687e;
                PointF pointF2 = focusIndicatorRingView.f6686d;
                int width = view.getWidth();
                int height = view.getHeight();
                switch (FocusIndicatorRingView.m4132a(ilkVar3) - FocusIndicatorRingView.m4132a(ilkVar2)) {
                    case -270:
                    case 90:
                        kayVar = kay.CLOCKWISE_270;
                        break;
                    case -180:
                    case 180:
                        kayVar = kay.CLOCKWISE_180;
                        break;
                    case -90:
                    case 270:
                        kayVar = kay.CLOCKWISE_90;
                        break;
                    case 0:
                        kayVar = kay.CLOCKWISE_0;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                if (pointF2 != null) {
                    PointF pointF3 = new PointF();
                    switch (kayVar.ordinal()) {
                        case 1:
                            pointF3.set(width - pointF2.y, pointF2.x);
                            break;
                        case 2:
                            pointF3.set(width - pointF2.x, height - pointF2.y);
                            break;
                        case 3:
                            pointF3.set(pointF2.y, height - pointF2.x);
                            break;
                        default:
                            pointF3.set(pointF2.x, pointF2.y);
                            break;
                    }
                    focusIndicatorRingView.m4133b(pointF3);
                }
            }
            focusIndicatorRingView.f6688f = true;
            this.f6696f.f6679d = this.f6691B;
            this.f6697g.m4130e();
            this.f6698h.m4130e();
        }
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: p */
    public final void mo4158p() {
        this.f6696f.setVisibility(8);
    }

    @Override // p000.ilf
    /* JADX INFO: renamed from: q */
    public final void mo4159q(ilk ilkVar, hzj hzjVar) {
        requestLayout();
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: r */
    public final void mo4160r() {
        this.f6695e.m4133b(new PointF(getWidth() / 2.0f, getHeight() / 2.0f));
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: s */
    public final void mo4161s(boolean z) {
        setVisibility(true != z ? 4 : 0);
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: t */
    public final void mo4162t(boolean z) {
        if (((Boolean) ((jwf) this.f6694d).f34942d).booleanValue() == z) {
            return;
        }
        this.f6694d.mo3415bf(Boolean.valueOf(z));
        AmbientModeSupport.AmbientController ambientController = this.f6693D;
        if (ambientController != null) {
            Object obj = ambientController.f1702a;
            if (z) {
                cdh cdhVar = (cdh) obj;
                if (((cdg) ((jwf) cdhVar.f5299a).f34942d).equals(cdg.AF_LOCKED) || ((cdg) ((jwf) cdhVar.f5299a).f34942d).equals(cdg.AE_AF_LOCKED)) {
                    return;
                }
                cdhVar.f5299a.mo3415bf(cdg.AF_LOCKED);
                return;
            }
            cdh cdhVar2 = (cdh) obj;
            if (((cdg) ((jwf) cdhVar2.f5299a).f34942d).equals(cdg.UNLOCKED) || ((cdg) ((jwf) cdhVar2.f5299a).f34942d).equals(cdg.AF_UNLOCKED)) {
                return;
            }
            cdhVar2.f5299a.mo3415bf(cdg.AF_UNLOCKED);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m4163u(float f) {
        this.f6698h.m4129d(f);
        this.f6699i.mo6821m(f);
        this.f6695e.invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:23:0x00d8  */
    @Override // p000.dxh
    /* JADX INFO: renamed from: v */
    public final void mo4164v(mrm mrmVar, RectF rectF) {
        this.f6696f.setVisibility(0);
        PointF pointFM4134D = m4134D((PointF) ((mrq) mrmVar).f41482a);
        PointF pointFM4134D2 = m4134D(new PointF(rectF.left, rectF.top));
        PointF pointFM4134D3 = m4134D(new PointF(rectF.right, rectF.bottom));
        RectF rectF2 = new RectF(pointFM4134D2.x, pointFM4134D2.y, pointFM4134D3.x, pointFM4134D3.y);
        EyesFocusIndicatorRectView eyesFocusIndicatorRectView = this.f6696f;
        float fWidth = rectF2.width();
        float fHeight = rectF2.height();
        float f = pointFM4134D.x - (fWidth / 2.0f);
        float f2 = pointFM4134D.y - (fHeight / 2.0f);
        RectF rectF3 = new RectF(f, f2, f + fWidth, f2 + fHeight);
        float fWidth2 = rectF3.width() * rectF3.height();
        float fWidth3 = eyesFocusIndicatorRectView.f6676a.width() * eyesFocusIndicatorRectView.f6676a.height();
        if (eyesFocusIndicatorRectView.f6676a.contains(rectF3)) {
            if (fWidth3 == 0.0f || fWidth2 / fWidth3 <= 0.93f) {
                eyesFocusIndicatorRectView.f6676a.set(rectF3);
            } else {
                pointFM4134D.x = eyesFocusIndicatorRectView.f6676a.centerX();
                pointFM4134D.y = eyesFocusIndicatorRectView.f6676a.centerY();
                fWidth = eyesFocusIndicatorRectView.f6676a.width();
                fHeight = eyesFocusIndicatorRectView.f6676a.height();
            }
        } else if (!rectF3.contains(eyesFocusIndicatorRectView.f6676a)) {
            if (RectF.intersects(rectF3, eyesFocusIndicatorRectView.f6676a)) {
                RectF rectF4 = new RectF(rectF3);
                rectF4.intersect(eyesFocusIndicatorRectView.f6676a);
                float fWidth4 = rectF4.width() * rectF4.height();
                if (fWidth2 != 0.0f && fWidth4 / fWidth2 > 0.93f) {
                    pointFM4134D.x = eyesFocusIndicatorRectView.f6676a.centerX();
                    pointFM4134D.y = eyesFocusIndicatorRectView.f6676a.centerY();
                    fWidth = eyesFocusIndicatorRectView.f6676a.width();
                    fHeight = eyesFocusIndicatorRectView.f6676a.height();
                }
            }
            eyesFocusIndicatorRectView.f6676a.set(rectF3);
        } else if (fWidth2 == 0.0f || fWidth3 / fWidth2 <= 0.93f) {
            eyesFocusIndicatorRectView.f6676a.set(rectF3);
        } else {
            pointFM4134D.x = eyesFocusIndicatorRectView.f6676a.centerX();
            pointFM4134D.y = eyesFocusIndicatorRectView.f6676a.centerY();
            fWidth = eyesFocusIndicatorRectView.f6676a.width();
            fHeight = eyesFocusIndicatorRectView.f6676a.height();
        }
        eyesFocusIndicatorRectView.setX(pointFM4134D.x - (eyesFocusIndicatorRectView.getWidth() / 2.0f));
        eyesFocusIndicatorRectView.setY(pointFM4134D.y - (eyesFocusIndicatorRectView.getHeight() / 2.0f));
        int intrinsicWidth = eyesFocusIndicatorRectView.f6677b.getIntrinsicWidth();
        int intrinsicHeight = eyesFocusIndicatorRectView.f6677b.getIntrinsicHeight();
        float fMax = Math.max(fWidth, fHeight);
        float intrinsicWidth2 = fMax <= ((float) (eyesFocusIndicatorRectView.f6677b.getIntrinsicWidth() * 4)) ? fMax / (eyesFocusIndicatorRectView.f6677b.getIntrinsicWidth() * 4) : 1.0f;
        if (eyesFocusIndicatorRectView.f6679d.equals(ilk.PORTRAIT)) {
            float f3 = intrinsicWidth * intrinsicWidth2;
            float f4 = intrinsicWidth2 * intrinsicHeight;
            eyesFocusIndicatorRectView.f6677b.setBounds(((int) (eyesFocusIndicatorRectView.getWidth() - fWidth)) / 2, ((int) (eyesFocusIndicatorRectView.getHeight() - fHeight)) / 2, (int) (((eyesFocusIndicatorRectView.getWidth() - fWidth) / 2.0f) + f3), (int) (((eyesFocusIndicatorRectView.getHeight() - fHeight) / 2.0f) + f4));
            eyesFocusIndicatorRectView.f6678c.setBounds((int) (((eyesFocusIndicatorRectView.getWidth() + fWidth) / 2.0f) - f3), (int) (((eyesFocusIndicatorRectView.getHeight() + fHeight) / 2.0f) - f4), ((int) (eyesFocusIndicatorRectView.getWidth() + fWidth)) / 2, ((int) (eyesFocusIndicatorRectView.getHeight() + fHeight)) / 2);
        } else if (eyesFocusIndicatorRectView.f6679d.equals(ilk.LANDSCAPE)) {
            float f5 = intrinsicWidth * intrinsicWidth2;
            float f6 = intrinsicWidth2 * intrinsicHeight;
            eyesFocusIndicatorRectView.f6677b.setBounds(((int) (eyesFocusIndicatorRectView.getWidth() - fWidth)) / 2, ((int) (eyesFocusIndicatorRectView.getHeight() + fHeight)) / 2, (int) (((eyesFocusIndicatorRectView.getWidth() - fWidth) / 2.0f) + f5), (int) (((eyesFocusIndicatorRectView.getHeight() + fHeight) / 2.0f) + f6));
            eyesFocusIndicatorRectView.f6678c.setBounds((int) (((eyesFocusIndicatorRectView.getWidth() + fWidth) / 2.0f) - f5), (int) (((eyesFocusIndicatorRectView.getHeight() - fHeight) / 2.0f) - f6), ((int) (eyesFocusIndicatorRectView.getWidth() + fWidth)) / 2, ((int) (eyesFocusIndicatorRectView.getHeight() - fHeight)) / 2);
        } else if (eyesFocusIndicatorRectView.f6679d.equals(ilk.REVERSE_LANDSCAPE)) {
            float f7 = intrinsicWidth * intrinsicWidth2;
            float f8 = intrinsicWidth2 * intrinsicHeight;
            eyesFocusIndicatorRectView.f6677b.setBounds(((int) (eyesFocusIndicatorRectView.getWidth() + fWidth)) / 2, ((int) (eyesFocusIndicatorRectView.getHeight() - fHeight)) / 2, (int) (((eyesFocusIndicatorRectView.getWidth() + fWidth) / 2.0f) + f7), (int) (((eyesFocusIndicatorRectView.getHeight() - fHeight) / 2.0f) + f8));
            eyesFocusIndicatorRectView.f6678c.setBounds((int) (((eyesFocusIndicatorRectView.getWidth() - fWidth) / 2.0f) - f7), (int) (((eyesFocusIndicatorRectView.getHeight() + fHeight) / 2.0f) - f8), ((int) (eyesFocusIndicatorRectView.getWidth() - fWidth)) / 2, ((int) (eyesFocusIndicatorRectView.getHeight() + fHeight)) / 2);
        }
        eyesFocusIndicatorRectView.invalidate();
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: w */
    public final void mo4165w(mrm mrmVar, int i) {
        mo4158p();
        m4139I(mrmVar, i);
        float dimension = getContext().getResources().getDimension(C0100R.dimen.active_focus_outer_ring_thickness);
        this.f6699i.mo6823o(1);
        this.f6699i.mo6818j(-1);
        this.f6699i.mo6822n(dimension);
        this.f6699i.mo6821m(1.0f);
        this.f6699i.mo6815g(0.0f, 0.0f);
        this.f6695e.invalidate();
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: x */
    public final void mo4166x(PointF pointF) {
        this.f6695e.m4133b(m4134D(pointF));
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: y */
    public final void mo4167y(PointF pointF, float f) {
        PointF pointFM4134D = m4134D(pointF);
        m4141K(f);
        this.f6695e.animate().translationXBy((pointFM4134D.x - this.f6695e.getX()) - (this.f6695e.getWidth() / 2.0f)).translationYBy((pointFM4134D.y - this.f6695e.getY()) - (this.f6695e.getHeight() / 2.0f)).setDuration(33L).start();
        this.f6695e.invalidate();
    }

    @Override // p000.dxh
    /* JADX INFO: renamed from: z */
    public final boolean mo4168z(PointF pointF) {
        FocusIndicatorRingView focusIndicatorRingView = this.f6695e;
        float f = pointF.x - focusIndicatorRingView.f6686d.x;
        float f2 = pointF.y - focusIndicatorRingView.f6686d.y;
        float f3 = focusIndicatorRingView.f6685c;
        return (f * f) + (f2 * f2) <= f3 * f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    FocusIndicatorView(Context context, FocusIndicatorRingView focusIndicatorRingView, EyesFocusIndicatorRectView eyesFocusIndicatorRectView, FocusIndicatorAccessoryView focusIndicatorAccessoryView, FocusIndicatorAccessoryView focusIndicatorAccessoryView2, dwl dwlVar, dwn dwnVar, ilw ilwVar, ilw ilwVar2, ilw ilwVar3, ilw ilwVar4, ilw ilwVar5, ilw ilwVar6, ilw ilwVar7, ilw ilwVar8, ilw ilwVar9, ilw ilwVar10, ilw ilwVar11, ilw ilwVar12) {
        super(context);
        this.f6716z = new PointF(0.0f, 0.0f);
        this.f6694d = new jwf(false);
        this.f6690A = new int[2];
        this.f6691B = ilk.PORTRAIT;
        this.f6692C = new dwq(this);
        this.f6715y = m4135E(context);
        this.f6695e = focusIndicatorRingView;
        this.f6696f = eyesFocusIndicatorRectView;
        this.f6697g = focusIndicatorAccessoryView;
        this.f6698h = focusIndicatorAccessoryView2;
        this.f6699i = dwlVar;
        this.f6700j = dwnVar;
        m4140J(ilwVar);
        this.f6701k = ilwVar;
        m4140J(ilwVar2);
        this.f6702l = ilwVar2;
        m4140J(ilwVar3);
        this.f6703m = ilwVar3;
        m4140J(ilwVar4);
        this.f6704n = ilwVar4;
        m4140J(ilwVar5);
        this.f6705o = ilwVar5;
        m4140J(ilwVar6);
        this.f6706p = ilwVar6;
        m4140J(ilwVar7);
        this.f6708r = ilwVar7;
        m4140J(ilwVar8);
        this.f6709s = ilwVar8;
        m4140J(ilwVar9);
        this.f6710t = ilwVar9;
        m4140J(ilwVar10);
        this.f6711u = ilwVar10;
        m4140J(ilwVar11);
        this.f6712v = ilwVar11;
        m4140J(ilwVar12);
        this.f6713w = ilwVar12;
        if (context instanceof cdp) {
            dhv dhvVarMo3499a = ((cdp) context).mo3499a();
            int i = dia.f11213a;
            dhvVarMo3499a.mo6175c();
        }
    }
}
