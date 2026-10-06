package p000;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class bhh implements bhz, bhq, bhk {

    /* JADX INFO: renamed from: a */
    protected final bkc f3272a;

    /* JADX INFO: renamed from: b */
    final Paint f3273b;

    /* JADX INFO: renamed from: g */
    private final bgv f3278g;

    /* JADX INFO: renamed from: i */
    private final float[] f3280i;

    /* JADX INFO: renamed from: j */
    private final bie f3281j;

    /* JADX INFO: renamed from: k */
    private final bie f3282k;

    /* JADX INFO: renamed from: l */
    private final List f3283l;

    /* JADX INFO: renamed from: m */
    private final bie f3284m;

    /* JADX INFO: renamed from: n */
    private bie f3285n;

    /* JADX INFO: renamed from: c */
    private final PathMeasure f3274c = new PathMeasure();

    /* JADX INFO: renamed from: d */
    private final Path f3275d = new Path();

    /* JADX INFO: renamed from: e */
    private final Path f3276e = new Path();

    /* JADX INFO: renamed from: f */
    private final RectF f3277f = new RectF();

    /* JADX INFO: renamed from: h */
    private final List f3279h = new ArrayList();

    public bhh(bgv bgvVar, bkc bkcVar, Paint.Cap cap, Paint.Join join, float f, bjd bjdVar, bjb bjbVar, List list, bjb bjbVar2) {
        bhg bhgVar = new bhg(1);
        this.f3273b = bhgVar;
        this.f3278g = bgvVar;
        this.f3272a = bkcVar;
        bhgVar.setStyle(Paint.Style.STROKE);
        bhgVar.setStrokeCap(cap);
        bhgVar.setStrokeJoin(join);
        bhgVar.setStrokeMiter(f);
        this.f3282k = bjdVar.mo2524a();
        this.f3281j = bjbVar.mo2524a();
        if (bjbVar2 == null) {
            this.f3284m = null;
        } else {
            this.f3284m = bjbVar2.mo2524a();
        }
        this.f3283l = new ArrayList(list.size());
        this.f3280i = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.f3283l.add(((bjb) list.get(i)).mo2524a());
        }
        bkcVar.m2534h(this.f3282k);
        bkcVar.m2534h(this.f3281j);
        for (int i2 = 0; i2 < this.f3283l.size(); i2++) {
            bkcVar.m2534h((bie) this.f3283l.get(i2));
        }
        bie bieVar = this.f3284m;
        if (bieVar != null) {
            bkcVar.m2534h(bieVar);
        }
        this.f3282k.m2494g(this);
        this.f3281j.m2494g(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            ((bie) this.f3283l.get(i3)).m2494g(this);
        }
        bie bieVar2 = this.f3284m;
        if (bieVar2 != null) {
            bieVar2.m2494g(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0234  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, java.util.List] */
    @Override // p000.bhk
    /* JADX INFO: renamed from: a */
    public void mo2463a(Canvas canvas, Matrix matrix, int i) {
        int i2;
        float f;
        float[] fArr = (float[]) bme.f3752a.get();
        boolean z = false;
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        if (fArr[0] == fArr[2] || fArr[1] == fArr[3]) {
            bgh.m2413a();
            return;
        }
        bii biiVar = (bii) this.f3282k;
        float fM2502k = (i / 255.0f) * biiVar.m2502k(biiVar.m2491d(), biiVar.m2489b());
        float f2 = 100.0f;
        this.f3273b.setAlpha(blz.m2697e((int) ((fM2502k / 100.0f) * 255.0f)));
        this.f3273b.setStrokeWidth(((big) this.f3281j).m2500k() * bme.m2702b(matrix));
        if (this.f3273b.getStrokeWidth() <= 0.0f) {
            bgh.m2413a();
            return;
        }
        float f3 = 1.0f;
        if (this.f3283l.isEmpty()) {
            bgh.m2413a();
        } else {
            float fM2702b = bme.m2702b(matrix);
            for (int i3 = 0; i3 < this.f3283l.size(); i3++) {
                this.f3280i[i3] = ((Float) ((bie) this.f3283l.get(i3)).mo2492e()).floatValue();
                if (i3 % 2 == 0) {
                    float[] fArr2 = this.f3280i;
                    if (fArr2[i3] < 1.0f) {
                        fArr2[i3] = 1.0f;
                    }
                } else {
                    float[] fArr3 = this.f3280i;
                    if (fArr3[i3] < 0.1f) {
                        fArr3[i3] = 0.1f;
                    }
                }
                float[] fArr4 = this.f3280i;
                fArr4[i3] = fArr4[i3] * fM2702b;
            }
            bie bieVar = this.f3284m;
            this.f3273b.setPathEffect(new DashPathEffect(this.f3280i, bieVar == null ? 0.0f : ((Float) bieVar.mo2492e()).floatValue() * fM2702b));
            bgh.m2413a();
        }
        bie bieVar2 = this.f3285n;
        if (bieVar2 != null) {
            this.f3273b.setColorFilter((ColorFilter) bieVar2.mo2492e());
            i2 = 0;
        } else {
            i2 = 0;
        }
        while (i2 < this.f3279h.size()) {
            dsx dsxVar = (dsx) this.f3279h.get(i2);
            if (dsxVar.f12522b != null) {
                this.f3275d.reset();
                for (int size = dsxVar.f12521a.size() - 1; size >= 0; size--) {
                    this.f3275d.addPath(((bhs) dsxVar.f12521a.get(size)).mo2471i(), matrix);
                }
                this.f3274c.setPath(this.f3275d, z);
                float length = this.f3274c.getLength();
                while (this.f3274c.nextContour()) {
                    length += this.f3274c.getLength();
                }
                float fFloatValue = ((Float) ((bhy) dsxVar.f12522b).f3395d.mo2492e()).floatValue() * length;
                float fFloatValue2 = ((Float) ((bhy) dsxVar.f12522b).f3393b.mo2492e()).floatValue() * length;
                float fFloatValue3 = ((Float) ((bhy) dsxVar.f12522b).f3394c.mo2492e()).floatValue() * length;
                int size2 = dsxVar.f12521a.size() - 1;
                float f4 = 0.0f;
                while (size2 >= 0) {
                    float f5 = fFloatValue / 360.0f;
                    this.f3276e.set(((bhs) dsxVar.f12521a.get(size2)).mo2471i());
                    this.f3276e.transform(matrix);
                    this.f3274c.setPath(this.f3276e, z);
                    float length2 = this.f3274c.getLength();
                    float f6 = (fFloatValue3 / f2) + f5;
                    float f7 = (fFloatValue2 / f2) + f5;
                    if (f6 > length) {
                        float f8 = f6 - length;
                        if (f8 >= f4 + length2 || f4 >= f8) {
                            f = f4 + length2;
                            if (f < f7 && f4 <= f6) {
                                if (f > f6 || f7 >= f4) {
                                    bme.m2704d(this.f3276e, f7 < f4 ? 0.0f : (f7 - f4) / length2, f6 > f ? 1.0f : (f6 - f4) / length2, 0.0f);
                                    canvas.drawPath(this.f3276e, this.f3273b);
                                } else {
                                    canvas.drawPath(this.f3276e, this.f3273b);
                                }
                            }
                        } else {
                            bme.m2704d(this.f3276e, f7 > length ? (f7 - length) / length2 : 0.0f, Math.min(f8 / length2, f3), 0.0f);
                            canvas.drawPath(this.f3276e, this.f3273b);
                        }
                    } else {
                        f = f4 + length2;
                        if (f < f7) {
                        }
                    }
                    f4 += length2;
                    size2--;
                    z = false;
                    f2 = 100.0f;
                    f3 = 1.0f;
                }
                bgh.m2413a();
            } else {
                this.f3275d.reset();
                for (int size3 = dsxVar.f12521a.size() - 1; size3 >= 0; size3--) {
                    this.f3275d.addPath(((bhs) dsxVar.f12521a.get(size3)).mo2471i(), matrix);
                }
                bgh.m2413a();
                canvas.drawPath(this.f3275d, this.f3273b);
                bgh.m2413a();
            }
            i2++;
            z = false;
            f2 = 100.0f;
            f3 = 1.0f;
        }
        bgh.m2413a();
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, java.util.List] */
    @Override // p000.bhk
    /* JADX INFO: renamed from: b */
    public final void mo2464b(RectF rectF, Matrix matrix, boolean z) {
        this.f3275d.reset();
        for (int i = 0; i < this.f3279h.size(); i++) {
            dsx dsxVar = (dsx) this.f3279h.get(i);
            for (int i2 = 0; i2 < dsxVar.f12521a.size(); i2++) {
                this.f3275d.addPath(((bhs) dsxVar.f12521a.get(i2)).mo2471i(), matrix);
            }
        }
        this.f3275d.computeBounds(this.f3277f, false);
        float fM2500k = ((big) this.f3281j).m2500k();
        RectF rectF2 = this.f3277f;
        float f = fM2500k / 2.0f;
        rectF2.set(rectF2.left - f, this.f3277f.top - f, this.f3277f.right + f, this.f3277f.bottom + f);
        rectF.set(this.f3277f);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        bgh.m2413a();
    }

    @Override // p000.bhz
    /* JADX INFO: renamed from: c */
    public final void mo2465c() {
        this.f3278g.invalidateSelf();
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: d */
    public final void mo2466d(biw biwVar, int i, List list, biw biwVar2) {
        blz.m2696d(biwVar, i, list, biwVar2, this);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004e  */
    /* JADX WARN: Code duplicated, block: B:24:0x0052 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:38:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, java.util.List] */
    @Override // p000.bhi
    /* JADX INFO: renamed from: e */
    public final void mo2467e(List list, List list2) {
        dsx dsxVar = null;
        bhy bhyVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            bhi bhiVar = (bhi) list.get(size);
            if (bhiVar instanceof bhy) {
                bhy bhyVar2 = (bhy) bhiVar;
                if (bhyVar2.f3396e == 2) {
                    bhyVar = bhyVar2;
                }
            }
        }
        if (bhyVar != null) {
            bhyVar.m2479a(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            bhi bhiVar2 = (bhi) list2.get(size2);
            if (bhiVar2 instanceof bhy) {
                bhy bhyVar3 = (bhy) bhiVar2;
                if (bhyVar3.f3396e == 2) {
                    if (dsxVar != null) {
                        this.f3279h.add(dsxVar);
                    }
                    dsx dsxVar2 = new dsx(bhyVar3);
                    bhyVar3.m2479a(this);
                    dsxVar = dsxVar2;
                } else if (!(bhiVar2 instanceof bhs)) {
                    if (dsxVar == null) {
                        dsxVar = new dsx(bhyVar);
                    }
                    dsxVar.f12521a.add((bhs) bhiVar2);
                }
            } else if (!(bhiVar2 instanceof bhs)) {
                if (dsxVar == null) {
                    dsxVar = new dsx(bhyVar);
                }
                dsxVar.f12521a.add((bhs) bhiVar2);
            }
        }
        if (dsxVar != null) {
            this.f3279h.add(dsxVar);
        }
    }

    @Override // p000.bix
    /* JADX INFO: renamed from: f */
    public void mo2468f(Object obj, bko bkoVar) {
        bie bieVar;
        if (obj == bha.f3240d) {
            bieVar = this.f3282k;
        } else {
            if (obj != bha.f3253q) {
                if (obj == bha.f3233E) {
                    bie bieVar2 = this.f3285n;
                    if (bieVar2 != null) {
                        this.f3272a.m2536j(bieVar2);
                    }
                    bis bisVar = new bis(bkoVar, null);
                    this.f3285n = bisVar;
                    bisVar.m2494g(this);
                    this.f3272a.m2534h(this.f3285n);
                    return;
                }
                return;
            }
            bieVar = this.f3281j;
        }
        bieVar.f3408d = bkoVar;
    }
}
