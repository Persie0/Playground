package com.google.android.apps.camera.coach;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import java.util.function.BooleanSupplier;
import p000.dgd;
import p000.dgm;
import p000.dgy;
import p000.dsx;
import p000.fhs;
import p000.ill;
import p000.kay;
import p000.mqu;
import p000.mrm;
import p000.npk;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CameraCoachHudView extends View {

    /* JADX INFO: renamed from: a */
    public float f6590a;

    /* JADX INFO: renamed from: b */
    public mrm f6591b;

    /* JADX INFO: renamed from: c */
    public mrm f6592c;

    /* JADX INFO: renamed from: d */
    public mrm f6593d;

    /* JADX INFO: renamed from: e */
    public volatile boolean f6594e;

    public CameraCoachHudView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mqu mquVar = mqu.f41450a;
        this.f6591b = mquVar;
        this.f6592c = mquVar;
        this.f6593d = mquVar;
        this.f6594e = true;
    }

    /* JADX INFO: renamed from: a */
    public final float m4086a() {
        return kay.m13890c(getDisplay()).f35503e;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:22:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:32:0x0149  */
    /* JADX WARN: Code duplicated, block: B:40:0x0178  */
    /* JADX WARN: Code duplicated, block: B:42:0x017c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0184  */
    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Pair pair;
        Pair pair2;
        dgm dgmVar;
        dsx dsxVar;
        dsx dsxVar2;
        float f;
        float f2;
        fhs fhsVar;
        fhs fhsVar2;
        double dAbs;
        fhs fhsVar3;
        double d;
        double degrees;
        if (this.f6591b.mo16813g()) {
            dgm dgmVar2 = (dgm) this.f6591b.mo16809c();
            fhs fhsVar4 = dgmVar2.f10931k;
            if (dgmVar2.f10928h && fhsVar4 != null) {
                float width = dgmVar2.f10926f.getWidth();
                float height = dgmVar2.f10926f.getHeight();
                float degrees2 = (float) Math.toDegrees(fhsVar4.f22044c);
                float fAbs = Math.abs(degrees2);
                float fM4086a = dgmVar2.f10926f.f6590a - dgmVar2.f10926f.m4086a();
                double dAbs2 = Math.abs(Math.toDegrees(fhsVar4.f22043b));
                double dAbs3 = Math.abs(Math.toDegrees(fhsVar4.f22044c));
                if (dAbs2 < 0.5d) {
                    if (dAbs3 < 0.5d) {
                        dgmVar = dgmVar2;
                        dsxVar2 = dgmVar.f10934n;
                    } else {
                        dgmVar = dgmVar2;
                        dsxVar = dgmVar.f10933m;
                    }
                    f = height / 2.0f;
                    f2 = width / 2.0f;
                    canvas.rotate(-fM4086a, f2, f);
                    if (dgmVar.f10929i) {
                        float f3 = (f2 - dgmVar.f10923c) - dgmVar.f10922b;
                        canvas.drawLine(f3 - dgmVar.f10921a, f, f3, f, (Paint) dsxVar2.f12521a);
                        float f4 = dgmVar.f10922b + dgmVar.f10923c + f2;
                        canvas.drawLine(f4, f, f4 + dgmVar.f10921a, f, (Paint) dsxVar2.f12521a);
                    }
                    canvas.rotate(-degrees2, f2, f);
                    float f5 = dgmVar.f10923c;
                    canvas.drawLine(f2 - f5, f, f2 + f5, f, (Paint) dsxVar2.f12521a);
                    canvas.drawText(String.format("%3.0f°", Float.valueOf(fAbs)), f2, f - dgmVar.f10924d, (Paint) dsxVar2.f12522b);
                    float fM11431b = ill.m11431b((float) Math.toDegrees(fhsVar4.f22043b));
                    float f6 = dgmVar.f10923c;
                    float f7 = f - fM11431b;
                    canvas.drawLine(f2 - f6, f7, f2 + f6, f7, dgmVar.f10925e);
                    fhsVar = dgmVar.f10931k;
                    if (fhsVar != null && (fhsVar2 = dgmVar.f10932l) != null && fhsVar2.f22042a != fhsVar.f22042a) {
                        dAbs = Math.abs(Math.toDegrees(fhsVar.f22044c) - Math.toDegrees(dgmVar.f10932l.f22044c));
                        fhsVar3 = dgmVar.f10931k;
                        d = fhsVar3.f22042a - dgmVar.f10932l.f22042a;
                        Double.isNaN(d);
                        if (dAbs / d <= 0.019999999552965164d) {
                            degrees = Math.toDegrees(fhsVar3.f22044c);
                            if (Math.abs(degrees) >= 0.5d || dgmVar.f10931k.f22044c * dgmVar.f10932l.f22044c < 0.0f) {
                                if (!dgmVar.f10930j) {
                                    if (dgmVar.f10927g.getAsBoolean()) {
                                        npk.m17603e(dgmVar.f10926f.getContext());
                                    }
                                    dgmVar.f10930j = true;
                                }
                            } else if (Math.abs(degrees) > 5.0d) {
                                dgmVar.f10930j = false;
                            }
                        }
                    }
                    dgmVar.f10932l = fhsVar4;
                } else {
                    dgmVar = dgmVar2;
                    dsxVar = dAbs3 < 0.5d ? dgmVar.f10936p : dgmVar.f10935o;
                }
                dsxVar2 = dsxVar;
                f = height / 2.0f;
                f2 = width / 2.0f;
                canvas.rotate(-fM4086a, f2, f);
                if (dgmVar.f10929i) {
                    float f8 = (f2 - dgmVar.f10923c) - dgmVar.f10922b;
                    canvas.drawLine(f8 - dgmVar.f10921a, f, f8, f, (Paint) dsxVar2.f12521a);
                    float f9 = dgmVar.f10922b + dgmVar.f10923c + f2;
                    canvas.drawLine(f9, f, f9 + dgmVar.f10921a, f, (Paint) dsxVar2.f12521a);
                }
                canvas.rotate(-degrees2, f2, f);
                float f10 = dgmVar.f10923c;
                canvas.drawLine(f2 - f10, f, f2 + f10, f, (Paint) dsxVar2.f12521a);
                canvas.drawText(String.format("%3.0f°", Float.valueOf(fAbs)), f2, f - dgmVar.f10924d, (Paint) dsxVar2.f12522b);
                float fM11431b2 = ill.m11431b((float) Math.toDegrees(fhsVar4.f22043b));
                float f11 = dgmVar.f10923c;
                float f12 = f - fM11431b2;
                canvas.drawLine(f2 - f11, f12, f2 + f11, f12, dgmVar.f10925e);
                fhsVar = dgmVar.f10931k;
                if (fhsVar != null) {
                    dAbs = Math.abs(Math.toDegrees(fhsVar.f22044c) - Math.toDegrees(dgmVar.f10932l.f22044c));
                    fhsVar3 = dgmVar.f10931k;
                    d = fhsVar3.f22042a - dgmVar.f10932l.f22042a;
                    Double.isNaN(d);
                    if (dAbs / d <= 0.019999999552965164d) {
                        degrees = Math.toDegrees(fhsVar3.f22044c);
                        if (Math.abs(degrees) >= 0.5d) {
                            if (!dgmVar.f10930j) {
                                if (dgmVar.f10927g.getAsBoolean()) {
                                    npk.m17603e(dgmVar.f10926f.getContext());
                                }
                                dgmVar.f10930j = true;
                            }
                        } else if (!dgmVar.f10930j) {
                            if (dgmVar.f10927g.getAsBoolean()) {
                                npk.m17603e(dgmVar.f10926f.getContext());
                            }
                            dgmVar.f10930j = true;
                        }
                    }
                }
                dgmVar.f10932l = fhsVar4;
            }
        }
        if (this.f6592c.mo16813g()) {
            dgy dgyVar = (dgy) this.f6592c.mo16809c();
            if (dgyVar.f11010h) {
                float width2 = dgyVar.f11003a.getWidth();
                float height2 = dgyVar.f11003a.getHeight();
                float degrees3 = (float) Math.toDegrees(dgyVar.f11011i);
                float degrees4 = (float) Math.toDegrees(dgyVar.f11012j);
                dgyVar.f11003a.setRotation(0.0f);
                float f13 = width2 / 2.0f;
                float f14 = height2 / 2.0f;
                if (Math.abs(degrees3) >= 0.5d || Math.abs(degrees4) >= 0.5d) {
                    dgy.m6131a(f13, f14, dgyVar.f11004b, dgyVar.f11005c, canvas);
                    int iM4086a = (int) dgyVar.f11003a.m4086a();
                    if (iM4086a == 270) {
                        pair2 = new Pair(Float.valueOf(degrees4 * 4.0f), Float.valueOf(degrees3 * 4.0f));
                    } else {
                        pair2 = iM4086a == 90 ? new Pair(Float.valueOf((-degrees4) * 4.0f), Float.valueOf((-degrees3) * 4.0f)) : new Pair(Float.valueOf((-degrees3) * 4.0f), Float.valueOf(degrees4 * 4.0f));
                    }
                    dgy.m6131a(f13 - ((Float) pair2.first).floatValue(), f14 - ((Float) pair2.second).floatValue(), dgyVar.f11007e, dgyVar.f11008f, canvas);
                    dgyVar.f11015m = false;
                } else {
                    dgy.m6131a(f13, f14, dgyVar.f11006d, dgyVar.f11008f, canvas);
                    dgy.m6131a(f13, f14, dgyVar.f11007e, dgyVar.f11008f, canvas);
                    if (!dgyVar.f11015m) {
                        if (dgyVar.f11009g.getAsBoolean()) {
                            npk.m17603e(dgyVar.f11003a.getContext());
                        }
                        dgyVar.f11015m = true;
                    }
                }
            }
        }
        if (this.f6593d.mo16813g()) {
            dgd dgdVar = (dgd) this.f6593d.mo16809c();
            if (dgdVar.f10874i) {
                float width3 = dgdVar.f10870e.getWidth();
                float height3 = dgdVar.f10870e.getHeight();
                float degrees5 = (float) Math.toDegrees(dgdVar.f10876k);
                float degrees6 = (float) Math.toDegrees(dgdVar.f10877l);
                dgdVar.f10870e.setRotation(0.0f);
                float f15 = width3 / 2.0f;
                float f16 = height3 / 2.0f;
                canvas.drawCircle(f15, f16, dgd.f10868c, dgdVar.f10871f);
                int iM4086a2 = (int) dgdVar.f10870e.m4086a();
                if (iM4086a2 == 270) {
                    pair = new Pair(Float.valueOf((-degrees6) * dgdVar.f10880o), Float.valueOf((-degrees5) * dgdVar.f10880o));
                } else {
                    pair = iM4086a2 == 90 ? new Pair(Float.valueOf(degrees6 * dgdVar.f10880o), Float.valueOf(degrees5 * dgdVar.f10880o)) : new Pair(Float.valueOf(degrees5 * dgdVar.f10880o), Float.valueOf((-degrees6) * dgdVar.f10880o));
                }
                if (dgdVar.f10875j) {
                    canvas.drawCircle(f15 - ((Float) pair.first).floatValue(), f16 - ((Float) pair.second).floatValue(), dgd.f10869d, dgdVar.f10873h);
                    return;
                }
                float fFloatValue = f15 - ((Float) pair.first).floatValue();
                float fFloatValue2 = f16 - ((Float) pair.second).floatValue();
                Paint paint = dgdVar.f10871f;
                canvas.drawCircle(fFloatValue, fFloatValue2, dgd.f10867b, dgdVar.f10872g);
                canvas.drawLine(fFloatValue - (dgd.f10866a / 2.0f), fFloatValue2, fFloatValue, fFloatValue2, paint);
                canvas.drawLine(fFloatValue + (dgd.f10866a / 2.0f), fFloatValue2, fFloatValue + dgd.f10867b, fFloatValue2, paint);
                canvas.drawLine(fFloatValue, fFloatValue2 - (dgd.f10866a / 2.0f), fFloatValue, fFloatValue2 - dgd.f10867b, paint);
                canvas.drawLine(fFloatValue, fFloatValue2 + (dgd.f10866a / 2.0f), fFloatValue, fFloatValue2 + dgd.f10867b, paint);
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        BooleanSupplier booleanSupplier = new BooleanSupplier() { // from class: dfr
            @Override // java.util.function.BooleanSupplier
            public final boolean getAsBoolean() {
                return this.f10806a.f6594e;
            }
        };
        this.f6591b = mrm.m16829i(new dgm(this, booleanSupplier));
        this.f6592c = mrm.m16829i(new dgy(this, booleanSupplier));
        this.f6593d = mrm.m16829i(new dgd(this));
    }
}
