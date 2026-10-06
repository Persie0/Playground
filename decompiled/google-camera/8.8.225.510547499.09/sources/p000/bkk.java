package p000;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bkk extends bkc {

    /* JADX INFO: renamed from: A */
    private bie f3626A;

    /* JADX INFO: renamed from: h */
    private final StringBuilder f3627h;

    /* JADX INFO: renamed from: i */
    private final RectF f3628i;

    /* JADX INFO: renamed from: j */
    private final Matrix f3629j;

    /* JADX INFO: renamed from: k */
    private final Paint f3630k;

    /* JADX INFO: renamed from: l */
    private final Paint f3631l;

    /* JADX INFO: renamed from: m */
    private final Map f3632m;

    /* JADX INFO: renamed from: n */
    private final C1114xc f3633n;

    /* JADX INFO: renamed from: o */
    private final biq f3634o;

    /* JADX INFO: renamed from: p */
    private final bgv f3635p;

    /* JADX INFO: renamed from: q */
    private final bgm f3636q;

    /* JADX INFO: renamed from: r */
    private bie f3637r;

    /* JADX INFO: renamed from: s */
    private bie f3638s;

    /* JADX INFO: renamed from: t */
    private bie f3639t;

    /* JADX INFO: renamed from: u */
    private bie f3640u;

    /* JADX INFO: renamed from: v */
    private bie f3641v;

    /* JADX INFO: renamed from: w */
    private bie f3642w;

    /* JADX INFO: renamed from: x */
    private bie f3643x;

    /* JADX INFO: renamed from: y */
    private bie f3644y;

    /* JADX INFO: renamed from: z */
    private bie f3645z;

    public bkk(bgv bgvVar, bkf bkfVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        super(bgvVar, bkfVar);
        this.f3627h = new StringBuilder(2);
        this.f3628i = new RectF();
        this.f3629j = new Matrix();
        this.f3630k = new bkj(null);
        this.f3631l = new bkj();
        this.f3632m = new HashMap();
        this.f3633n = new C1114xc();
        this.f3635p = bgvVar;
        this.f3636q = bkfVar.f3598b;
        biq biqVarMo2524a = bkfVar.f3612p.mo2524a();
        this.f3634o = biqVarMo2524a;
        biqVarMo2524a.m2494g(this);
        m2534h(biqVarMo2524a);
        cvy cvyVar = bkfVar.f3618v;
        if (cvyVar != null && (obj4 = cvyVar.f9845b) != null) {
            bie bieVarMo2524a = ((bja) obj4).mo2524a();
            this.f3637r = bieVarMo2524a;
            bieVarMo2524a.m2494g(this);
            m2534h(this.f3637r);
        }
        if (cvyVar != null && (obj3 = cvyVar.f9846c) != null) {
            bie bieVarMo2524a2 = ((bja) obj3).mo2524a();
            this.f3639t = bieVarMo2524a2;
            bieVarMo2524a2.m2494g(this);
            m2534h(this.f3639t);
        }
        if (cvyVar != null && (obj2 = cvyVar.f9844a) != null) {
            bie bieVarMo2524a3 = ((bjb) obj2).mo2524a();
            this.f3641v = bieVarMo2524a3;
            bieVarMo2524a3.m2494g(this);
            m2534h(this.f3641v);
        }
        if (cvyVar == null || (obj = cvyVar.f9847d) == null) {
            return;
        }
        bie bieVarMo2524a4 = ((bjb) obj).mo2524a();
        this.f3643x = bieVarMo2524a4;
        bieVarMo2524a4.m2494g(this);
        m2534h(this.f3643x);
    }

    /* JADX INFO: renamed from: q */
    private static final void m2545q(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* JADX INFO: renamed from: r */
    private static final void m2546r(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* JADX INFO: renamed from: s */
    private static final List m2547s(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\n", "\r").split("\r"));
    }

    @Override // p000.bkc, p000.bhk
    /* JADX INFO: renamed from: b */
    public final void mo2464b(RectF rectF, Matrix matrix, boolean z) {
        super.mo2464b(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f3636q.f3178g.width(), this.f3636q.f3178g.height());
    }

    @Override // p000.bkc, p000.bix
    /* JADX INFO: renamed from: f */
    public final void mo2468f(Object obj, bko bkoVar) {
        super.mo2468f(obj, bkoVar);
        if (obj == bha.f3237a) {
            bie bieVar = this.f3638s;
            if (bieVar != null) {
                m2536j(bieVar);
            }
            bis bisVar = new bis(bkoVar, null);
            this.f3638s = bisVar;
            bisVar.m2494g(this);
            m2534h(this.f3638s);
            return;
        }
        if (obj == bha.f3238b) {
            bie bieVar2 = this.f3640u;
            if (bieVar2 != null) {
                m2536j(bieVar2);
            }
            bis bisVar2 = new bis(bkoVar, null);
            this.f3640u = bisVar2;
            bisVar2.m2494g(this);
            m2534h(this.f3640u);
            return;
        }
        if (obj == bha.f3253q) {
            bie bieVar3 = this.f3642w;
            if (bieVar3 != null) {
                m2536j(bieVar3);
            }
            bis bisVar3 = new bis(bkoVar, null);
            this.f3642w = bisVar3;
            bisVar3.m2494g(this);
            m2534h(this.f3642w);
            return;
        }
        if (obj == bha.f3254r) {
            bie bieVar4 = this.f3644y;
            if (bieVar4 != null) {
                m2536j(bieVar4);
            }
            bis bisVar4 = new bis(bkoVar, null);
            this.f3644y = bisVar4;
            bisVar4.m2494g(this);
            m2534h(this.f3644y);
            return;
        }
        if (obj == bha.f3232D) {
            bie bieVar5 = this.f3645z;
            if (bieVar5 != null) {
                m2536j(bieVar5);
            }
            bis bisVar5 = new bis(bkoVar, null);
            this.f3645z = bisVar5;
            bisVar5.m2494g(this);
            m2534h(this.f3645z);
            return;
        }
        if (obj == bha.f3235G) {
            bie bieVar6 = this.f3626A;
            if (bieVar6 != null) {
                m2536j(bieVar6);
            }
            bis bisVar6 = new bis(bkoVar, null);
            this.f3626A = bisVar6;
            bisVar6.m2494g(this);
            m2534h(this.f3626A);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x036f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0371 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0373  */
    /* JADX WARN: Code duplicated, block: B:108:0x0375  */
    /* JADX WARN: Type inference failed for: r4v33, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v10, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v8, types: [java.lang.Object, java.util.Map] */
    @Override // p000.bkc
    /* JADX INFO: renamed from: i */
    public final void mo2535i(Canvas canvas, Matrix matrix, int i) {
        drj drjVar;
        Typeface typeface;
        int i2;
        List list;
        String string;
        float f;
        float f2;
        List list2;
        int i3;
        canvas.save();
        if (!this.f3635p.m2451r()) {
            canvas.concat(matrix);
        }
        biu biuVar = (biu) this.f3634o.mo2492e();
        C1058va c1058va = (C1058va) this.f3636q.f3174c.get(biuVar.f3449b);
        if (c1058va == null) {
            canvas.restore();
            return;
        }
        bie bieVar = this.f3638s;
        if (bieVar != null) {
            this.f3630k.setColor(((Integer) bieVar.mo2492e()).intValue());
        } else {
            bie bieVar2 = this.f3637r;
            if (bieVar2 != null) {
                this.f3630k.setColor(((Integer) bieVar2.mo2492e()).intValue());
            } else {
                this.f3630k.setColor(biuVar.f3454g);
            }
        }
        bie bieVar3 = this.f3640u;
        if (bieVar3 != null) {
            this.f3631l.setColor(((Integer) bieVar3.mo2492e()).intValue());
        } else {
            bie bieVar4 = this.f3639t;
            if (bieVar4 != null) {
                this.f3631l.setColor(((Integer) bieVar4.mo2492e()).intValue());
            } else {
                this.f3631l.setColor(biuVar.f3455h);
            }
        }
        bie bieVar5 = this.f3572g.f3434e;
        int iIntValue = ((bieVar5 == null ? 100 : ((Integer) bieVar5.mo2492e()).intValue()) * 255) / 100;
        this.f3630k.setAlpha(iIntValue);
        this.f3631l.setAlpha(iIntValue);
        bie bieVar6 = this.f3642w;
        if (bieVar6 != null) {
            this.f3631l.setStrokeWidth(((Float) bieVar6.mo2492e()).floatValue());
        } else {
            bie bieVar7 = this.f3641v;
            if (bieVar7 != null) {
                this.f3631l.setStrokeWidth(((Float) bieVar7.mo2492e()).floatValue());
            } else {
                this.f3631l.setStrokeWidth(biuVar.f3456i * bme.m2701a() * bme.m2702b(matrix));
            }
        }
        float f3 = 100.0f;
        if (this.f3635p.m2451r()) {
            bie bieVar8 = this.f3645z;
            float fFloatValue = bieVar8 != null ? ((Float) bieVar8.mo2492e()).floatValue() : biuVar.f3450c;
            float fM2702b = bme.m2702b(matrix);
            String str = biuVar.f3448a;
            float fM2701a = biuVar.f3452e * bme.m2701a();
            List listM2547s = m2547s(str);
            int size = listM2547s.size();
            int i4 = 0;
            while (i4 < size) {
                String str2 = (String) listM2547s.get(i4);
                int i5 = 0;
                float f4 = 0.0f;
                while (true) {
                    f = fFloatValue / f3;
                    if (i5 >= str2.length()) {
                        break;
                    }
                    float f5 = fFloatValue;
                    biv bivVar = (biv) C1119xh.m19566a(this.f3636q.f3175d, biv.m2513a(str2.charAt(i5), (String) c1058va.f47802a, (String) c1058va.f47804c));
                    if (bivVar != null) {
                        double d = f4;
                        double d2 = f;
                        double d3 = bivVar.f3460b;
                        Double.isNaN(d2);
                        double d4 = d3 * d2;
                        double dM2701a = bme.m2701a();
                        double d5 = fM2702b;
                        Double.isNaN(dM2701a);
                        Double.isNaN(d5);
                        Double.isNaN(d);
                        f4 = (float) (d + (d4 * dM2701a * d5));
                    }
                    i5++;
                    fFloatValue = f5;
                    c1058va = c1058va;
                    i4 = i4;
                    str2 = str2;
                    f3 = 100.0f;
                }
                C1058va c1058va2 = c1058va;
                float f6 = fFloatValue;
                int i6 = i4;
                String str3 = str2;
                canvas.save();
                m2544p(biuVar.f3458k, canvas, f4);
                canvas.translate(0.0f, (i6 * fM2701a) - (((size - 1) * fM2701a) / 2.0f));
                int i7 = 0;
                while (i7 < str3.length()) {
                    String str4 = str3;
                    C1058va c1058va3 = c1058va2;
                    biv bivVar2 = (biv) C1119xh.m19566a(this.f3636q.f3175d, biv.m2513a(str4.charAt(i7), (String) c1058va3.f47802a, (String) c1058va3.f47804c));
                    if (bivVar2 == null) {
                        listM2547s = listM2547s;
                        f2 = fM2701a;
                        i3 = size;
                    } else {
                        if (this.f3632m.containsKey(bivVar2)) {
                            list2 = (List) this.f3632m.get(bivVar2);
                            f2 = fM2701a;
                        } else {
                            List list3 = bivVar2.f3459a;
                            int size2 = list3.size();
                            ArrayList arrayList = new ArrayList(size2);
                            int i8 = 0;
                            while (i8 < size2) {
                                arrayList.add(new bhj(this.f3635p, this, (bjx) list3.get(i8)));
                                i8++;
                                size2 = size2;
                                list3 = list3;
                                fM2701a = fM2701a;
                            }
                            f2 = fM2701a;
                            this.f3632m.put(bivVar2, arrayList);
                            list2 = arrayList;
                        }
                        int i9 = 0;
                        while (i9 < list2.size()) {
                            Path pathMo2471i = ((bhj) list2.get(i9)).mo2471i();
                            pathMo2471i.computeBounds(this.f3628i, false);
                            this.f3629j.set(matrix);
                            List list4 = list2;
                            int i10 = size;
                            this.f3629j.preTranslate(0.0f, (-biuVar.f3453f) * bme.m2701a());
                            this.f3629j.preScale(f, f);
                            pathMo2471i.transform(this.f3629j);
                            if (biuVar.f3457j) {
                                m2546r(pathMo2471i, this.f3630k, canvas);
                                m2546r(pathMo2471i, this.f3631l, canvas);
                            } else {
                                m2546r(pathMo2471i, this.f3631l, canvas);
                                m2546r(pathMo2471i, this.f3630k, canvas);
                            }
                            i9++;
                            list2 = list4;
                            size = i10;
                        }
                        i3 = size;
                        float fM2701a2 = ((float) bivVar2.f3460b) * f * bme.m2701a() * fM2702b;
                        float f7 = biuVar.f3451d;
                        bie bieVar9 = this.f3644y;
                        float fFloatValue2 = f7 / 10.0f;
                        if (bieVar9 != null) {
                            fFloatValue2 += ((Float) bieVar9.mo2492e()).floatValue();
                        } else {
                            bie bieVar10 = this.f3643x;
                            if (bieVar10 != null) {
                                fFloatValue2 += ((Float) bieVar10.mo2492e()).floatValue();
                            }
                        }
                        canvas.translate(fM2701a2 + (fFloatValue2 * fM2702b), 0.0f);
                    }
                    i7++;
                    listM2547s = listM2547s;
                    size = i3;
                    fM2701a = f2;
                    c1058va2 = c1058va3;
                    str3 = str4;
                }
                canvas.restore();
                i4 = i6 + 1;
                c1058va = c1058va2;
                fFloatValue = f6;
                f3 = 100.0f;
            }
        } else {
            bie bieVar11 = this.f3626A;
            if (bieVar11 != null) {
                typeface = (Typeface) bieVar11.mo2492e();
            } else {
                bgv bgvVar = this.f3635p;
                Object obj = c1058va.f47802a;
                Object obj2 = c1058va.f47804c;
                if (bgvVar.getCallback() == null) {
                    drjVar = null;
                } else {
                    if (bgvVar.f3214j == null) {
                        bgvVar.f3214j = new drj(bgvVar.getCallback());
                    }
                    drjVar = bgvVar.f3214j;
                }
                if (drjVar != null) {
                    Object obj3 = drjVar.f12399e;
                    biz bizVar = (biz) obj3;
                    bizVar.f3469a = obj;
                    bizVar.f3470b = obj2;
                    Typeface typeface2 = (Typeface) drjVar.f12395a.get(obj3);
                    if (typeface2 != null) {
                        typeface = typeface2;
                    } else {
                        Typeface typefaceCreate = (Typeface) drjVar.f12396b.get(obj);
                        if (typefaceCreate == null) {
                            typefaceCreate = Typeface.createFromAsset((AssetManager) drjVar.f12398d, "fonts/" + ((String) obj) + ((String) drjVar.f12397c));
                            drjVar.f12396b.put(obj, typefaceCreate);
                        }
                        String str5 = (String) obj2;
                        boolean zContains = str5.contains("Italic");
                        boolean zContains2 = str5.contains("Bold");
                        if (zContains) {
                            if (zContains2) {
                                i2 = 3;
                            } else {
                                zContains2 = false;
                                if (zContains) {
                                    i2 = 2;
                                } else if (zContains2) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                            }
                        } else if (zContains) {
                            i2 = 2;
                        } else if (zContains2) {
                            i2 = 1;
                        } else {
                            i2 = 0;
                        }
                        if (typefaceCreate.getStyle() != i2) {
                            typefaceCreate = Typeface.create(typefaceCreate, i2);
                        }
                        drjVar.f12395a.put(drjVar.f12399e, typefaceCreate);
                        typeface = typefaceCreate;
                    }
                } else {
                    typeface = null;
                }
                if (typeface == null) {
                    typeface = null;
                }
            }
            if (typeface != null) {
                String str6 = biuVar.f3448a;
                this.f3630k.setTypeface(typeface);
                bie bieVar12 = this.f3645z;
                float fFloatValue3 = bieVar12 != null ? ((Float) bieVar12.mo2492e()).floatValue() : biuVar.f3450c;
                this.f3630k.setTextSize(bme.m2701a() * fFloatValue3);
                this.f3631l.setTypeface(this.f3630k.getTypeface());
                this.f3631l.setTextSize(this.f3630k.getTextSize());
                float fM2701a3 = biuVar.f3452e * bme.m2701a();
                float f8 = biuVar.f3451d;
                bie bieVar13 = this.f3644y;
                float fFloatValue4 = f8 / 10.0f;
                if (bieVar13 != null) {
                    fFloatValue4 += ((Float) bieVar13.mo2492e()).floatValue();
                } else {
                    bie bieVar14 = this.f3643x;
                    if (bieVar14 != null) {
                        fFloatValue4 += ((Float) bieVar14.mo2492e()).floatValue();
                    }
                }
                float fM2701a4 = fFloatValue4 * bme.m2701a() * fFloatValue3;
                List listM2547s2 = m2547s(str6);
                int size3 = listM2547s2.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    float f9 = fM2701a4 / 100.0f;
                    String str7 = (String) listM2547s2.get(i11);
                    float fMeasureText = this.f3631l.measureText(str7) + ((str7.length() - 1) * f9);
                    canvas.save();
                    m2544p(biuVar.f3458k, canvas, fMeasureText);
                    canvas.translate(0.0f, (i11 * fM2701a3) - (((size3 - 1) * fM2701a3) / 2.0f));
                    int length = 0;
                    while (length < str7.length()) {
                        int iCodePointAt = str7.codePointAt(length);
                        int iCharCount = Character.charCount(iCodePointAt) + length;
                        while (iCharCount < str7.length()) {
                            int iCodePointAt2 = str7.codePointAt(iCharCount);
                            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 19) {
                                break;
                            }
                            iCharCount += Character.charCount(iCodePointAt2);
                            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                        }
                        long j = iCodePointAt;
                        if (this.f3633n.m19543a(j) >= 0) {
                            string = (String) this.f3633n.m19546d(j);
                            list = listM2547s2;
                        } else {
                            this.f3627h.setLength(0);
                            int iCharCount2 = length;
                            while (iCharCount2 < iCharCount) {
                                int iCodePointAt3 = str7.codePointAt(iCharCount2);
                                this.f3627h.appendCodePoint(iCodePointAt3);
                                iCharCount2 += Character.charCount(iCodePointAt3);
                                listM2547s2 = listM2547s2;
                            }
                            list = listM2547s2;
                            string = this.f3627h.toString();
                            this.f3633n.m19549g(j, string);
                        }
                        length += string.length();
                        if (biuVar.f3457j) {
                            m2545q(string, this.f3630k, canvas);
                            m2545q(string, this.f3631l, canvas);
                        } else {
                            m2545q(string, this.f3631l, canvas);
                            m2545q(string, this.f3630k, canvas);
                        }
                        canvas.translate(this.f3630k.measureText(string) + f9, 0.0f);
                        listM2547s2 = list;
                    }
                    canvas.restore();
                }
            }
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: p */
    private static final void m2544p(int i, Canvas canvas, float f) {
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 1:
                canvas.translate(-f, 0.0f);
                return;
            case 2:
                canvas.translate((-f) / 2.0f, 0.0f);
                return;
            default:
                return;
        }
    }
}
