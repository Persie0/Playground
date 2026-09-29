package com.lingq.commons.p053ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kh.C6694u;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import kotlin.collections.C6752c;
import mo.C7660h;
import p225kk.C6716m;
import p254m2.C7472a;
import p286o2.C7906f;
import p301oh.C8046e;
import p312p2.C8169a;
import p338qd.C8573r0;
import p385sf.C9000b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0014\u0010\u0007\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u0010\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\b¨\u0006\u0011"}, m13365d2 = {"Lcom/lingq/commons/ui/views/LineGraph;", "Landroid/view/View;", "Lsl/e;", "getMaxCoordinateValues", "", "Loh/e;", "coordinates", "setCoordinatePoints", "", "color", "setLineColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "app_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
public final class LineGraph extends View {

    /* JADX INFO: renamed from: H */
    public float f16725H;

    /* JADX INFO: renamed from: I */
    public float f16726I;

    /* JADX INFO: renamed from: J */
    public long f16727J;

    /* JADX INFO: renamed from: K */
    public long f16728K;

    /* JADX INFO: renamed from: L */
    public int f16729L;

    /* JADX INFO: renamed from: M */
    public float f16730M;

    /* JADX INFO: renamed from: N */
    public float f16731N;

    /* JADX INFO: renamed from: O */
    public int f16732O;

    /* JADX INFO: renamed from: P */
    public int f16733P;

    /* JADX INFO: renamed from: Q */
    public int f16734Q;

    /* JADX INFO: renamed from: R */
    public final ArrayList f16735R;

    /* JADX INFO: renamed from: S */
    public final ArrayList f16736S;

    /* JADX INFO: renamed from: T */
    public final ArrayList f16737T;

    /* JADX INFO: renamed from: a */
    public Path f16738a;

    /* JADX INFO: renamed from: b */
    public final Path f16739b;

    /* JADX INFO: renamed from: c */
    public final Paint f16740c;

    /* JADX INFO: renamed from: d */
    public final Paint f16741d;

    /* JADX INFO: renamed from: e */
    public final Paint f16742e;

    /* JADX INFO: renamed from: f */
    public final Paint f16743f;

    /* JADX INFO: renamed from: g */
    public final Paint f16744g;

    /* JADX INFO: renamed from: h */
    public final Paint f16745h;

    /* JADX INFO: renamed from: i */
    public final int[] f16746i;

    /* JADX INFO: renamed from: j */
    public final float f16747j;

    /* JADX INFO: renamed from: k */
    public final float f16748k;

    /* JADX INFO: renamed from: l */
    public List<C8046e> f16749l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public LineGraph(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C5207g.m11111f(context, "context");
        List<Integer> list = C6716m.f37937a;
        this.f16747j = C6716m.m13316a(15);
        this.f16748k = C6716m.m13316a(5);
        this.f16729L = C6716m.m13333r(R.attr.blueWordBorderColor, context);
        this.f16734Q = 7;
        this.f16735R = new ArrayList();
        this.f16736S = new ArrayList();
        this.f16737T = new ArrayList();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6694u.f37844b);
        C5207g.m11110e(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…eable.LineGraph\n        )");
        try {
            try {
                int color = typedArrayObtainStyledAttributes.getColor(2, C6716m.m13333r(R.attr.blueTint, context));
                this.f16729L = color;
                Object obj = C7472a.f41322a;
                this.f16746i = new int[]{C8169a.m16216h(color, 120), C7472a.d.m14851a(context, android.R.color.transparent)};
                this.f16738a = new Path();
                this.f16739b = new Path();
                Paint paint = new Paint();
                paint.setColor(this.f16729L);
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(C6716m.m13316a(typedArrayObtainStyledAttributes.getInteger(3, 1)));
                this.f16740c = paint;
                Paint paint2 = new Paint();
                paint2.setAntiAlias(true);
                paint2.setStyle(Paint.Style.FILL);
                this.f16741d = paint2;
                Paint paint3 = new Paint();
                paint3.setStyle(Paint.Style.STROKE);
                paint3.setAntiAlias(true);
                paint3.setStrokeCap(Paint.Cap.ROUND);
                paint3.setColor(typedArrayObtainStyledAttributes.getColor(1, C6716m.m13333r(R.attr.backgroundSectionColor, context)));
                paint3.setPathEffect(new DashPathEffect(new float[]{C6716m.m13331p(8), C6716m.m13331p(8)}, 0.0f));
                this.f16744g = paint3;
                Paint paint4 = new Paint();
                paint4.setStyle(Paint.Style.STROKE);
                paint4.setAntiAlias(true);
                paint4.setStrokeCap(Paint.Cap.ROUND);
                paint4.setColor(typedArrayObtainStyledAttributes.getColor(1, C6716m.m13333r(R.attr.secondaryTextColor, context)));
                paint4.setStrokeWidth(C6716m.m13316a(1));
                this.f16745h = paint4;
                Paint paint5 = new Paint();
                paint5.setAntiAlias(true);
                paint5.setColor(typedArrayObtainStyledAttributes.getColor(0, C6716m.m13333r(R.attr.tertiaryTextColor, context)));
                paint5.setTextSize(C6716m.m13331p(10));
                Paint paint6 = new Paint();
                paint6.setAntiAlias(true);
                paint6.setColor(typedArrayObtainStyledAttributes.getColor(0, C6716m.m13333r(R.attr.tertiaryTextColor, context)));
                paint6.setTypeface(Typeface.create(C7906f.m15674a(R.font.rubik_regular, context), 0));
                this.f16742e = paint6;
                Paint paint7 = new Paint();
                paint7.setAntiAlias(true);
                paint7.setColor(typedArrayObtainStyledAttributes.getColor(0, C6716m.m13333r(R.attr.primaryTextColor, context)));
                paint7.setTypeface(Typeface.create(C7906f.m15674a(R.font.rubik_bold, context), 1));
                this.f16743f = paint7;
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m9350d(LineGraph lineGraph, String str, boolean z10, int i10) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        Paint paint = null;
        if ((i10 & 4) != 0) {
            Paint paint2 = lineGraph.f16742e;
            if (paint2 == null) {
                C5207g.m11117l("xAxisTextPaint");
                throw null;
            }
            paint = paint2;
        }
        lineGraph.m9353c(str, z10, paint);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    private final void getMaxCoordinateValues() {
        long j10;
        List<C8046e> list = this.f16749l;
        if (list == null) {
            C5207g.m11117l("coordinates");
            throw null;
        }
        Iterator<C8046e> it = list.iterator();
        boolean z10 = true;
        loop0: while (true) {
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C8046e next = it.next();
                if (z10) {
                    float f3 = next.f43713b;
                    this.f16725H = f3;
                    this.f16726I = f3;
                    long j11 = (long) next.f43714c;
                    this.f16727J = j11;
                    this.f16728K = j11;
                    z10 = false;
                }
                float f10 = next.f43713b;
                if (f10 > this.f16725H) {
                    this.f16725H = f10;
                }
                if (f10 < this.f16726I) {
                    this.f16726I = f10;
                }
                float f11 = this.f16727J;
                float f12 = next.f43714c;
                if (f12 > f11) {
                    this.f16727J = (long) f12;
                }
                if (f12 < this.f16728K) {
                    this.f16728K = (long) f12;
                }
            }
        }
        long j12 = this.f16727J;
        long j13 = 10;
        if (j12 > 0) {
            long j14 = 10;
            j10 = ((j12 / j14) * j14) + j14;
        } else {
            j10 = 10;
        }
        this.f16727J = j10;
        long j15 = this.f16728K;
        if (j15 < 0) {
            long jAbs = Math.abs(j15);
            if (jAbs > 0) {
                long j16 = 10;
                j13 = ((jAbs / j16) * j16) + j16;
            }
            this.f16728K = -j13;
        }
    }

    /* JADX INFO: renamed from: a */
    public final Triple<String, Float, Float> m9351a(C8046e c8046e) {
        float f3 = c8046e.f43714c;
        String strValueOf = ((f3 - ((float) ((int) f3))) > 0.0f ? 1 : ((f3 - ((float) ((int) f3))) == 0.0f ? 0 : -1)) == 0 ? String.valueOf((int) f3) : C4924a.m10471l0(f3, 1);
        Paint paint = this.f16743f;
        if (paint != null) {
            return new Triple<>(strValueOf, Float.valueOf(paint.measureText(strValueOf)), Float.valueOf(m9352b(this.f16733P, false)));
        }
        C5207g.m11117l("xAxisLabelTextPaint");
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final float m9352b(float f3, boolean z10) {
        float f10 = this.f16747j;
        if (z10) {
            return f3 + f10;
        }
        if (z10) {
            throw new NoWhenBranchMatchedException();
        }
        return f3 - f10;
    }

    /* JADX INFO: renamed from: c */
    public final void m9353c(String str, boolean z10, Paint paint) {
        float fM13316a;
        int length = str.length();
        if (length == 1 || length == 2) {
            List<Integer> list = C6716m.f37937a;
            paint.setTextSize(C6716m.m13331p(10));
            return;
        }
        if (length == 3) {
            List<Integer> list2 = C6716m.f37937a;
            paint.setTextSize(C6716m.m13331p(9));
            return;
        }
        List<Integer> list3 = C6716m.f37937a;
        float fM13331p = C6716m.m13331p(10);
        paint.setTextSize(fM13331p);
        Rect rect = new Rect();
        paint.getTextBounds(str, 0, str.length(), rect);
        if (z10) {
            float fM13331p2 = C6716m.m13331p(5);
            fM13316a = ((str.length() / (str.length() + 1.5f)) * fM13331p2) + fM13331p2;
        } else {
            fM13316a = ((this.f16747j - C6716m.m13316a(1)) * fM13331p) / rect.width();
        }
        paint.setTextSize(fM13316a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m9354e() {
        float[] fArr = {0.0f, 0.9f};
        Paint paint = this.f16741d;
        if (paint == null) {
            C5207g.m11117l("gradientPaint");
            throw null;
        }
        int i10 = this.f16732O;
        float f3 = i10 / 2;
        float f10 = i10 - 100;
        float f11 = this.f16733P;
        int[] iArr = this.f16746i;
        if (iArr != null) {
            paint.setShader(new LinearGradient(f3, 0.0f, f10, f11, iArr, fArr, Shader.TileMode.CLAMP));
        } else {
            C5207g.m11117l("colorsArray");
            throw null;
        }
    }

    /* JADX INFO: renamed from: f */
    public final float m9355f(float f3, float f10) {
        long j10 = this.f16728K;
        if (j10 >= 0) {
            return this.f16733P - Math.abs(f3);
        }
        int i10 = this.f16733P;
        float f11 = 2;
        float f12 = this.f16747j;
        float f13 = ((f12 * f11) + i10) / f11;
        if (f10 >= 0.0f) {
            return f13 - Math.abs(f3);
        }
        return (Math.abs(f10) * (((i10 - (f12 * f11)) / f11) / Math.abs(j10))) + f13;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x038a  */
    /* JADX WARN: Code duplicated, block: B:146:0x0439  */
    /* JADX WARN: Code duplicated, block: B:224:0x05b7  */
    /* JADX WARN: Code duplicated, block: B:226:0x05bf  */
    /* JADX WARN: Code duplicated, block: B:228:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:230:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:232:0x05d1  */
    /* JADX WARN: Code duplicated, block: B:36:0x0102  */
    /* JADX WARN: Code duplicated, block: B:38:0x0119  */
    /* JADX WARN: Code duplicated, block: B:41:0x0128  */
    /* JADX WARN: Code duplicated, block: B:43:0x0141  */
    /* JADX WARN: Code duplicated, block: B:44:0x0164  */
    /* JADX WARN: Code duplicated, block: B:48:0x022a  */
    /* JADX WARN: Code duplicated, block: B:49:0x0235  */
    /* JADX WARN: Code duplicated, block: B:52:0x0258  */
    /* JADX WARN: Code duplicated, block: B:54:0x0269  */
    /* JADX WARN: Code duplicated, block: B:56:0x0270  */
    /* JADX WARN: Code duplicated, block: B:58:0x0274  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v19, types: [boolean] */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) throws ParseException {
        float f3;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        List<C8046e> list;
        Iterator<C8046e> it;
        int i10;
        float f10;
        boolean z10;
        Paint paint;
        Paint paint2;
        int i11;
        float height;
        Path path;
        float f11;
        Paint paint3;
        Path path2;
        Paint paint4;
        float fM9352b;
        float f12;
        boolean z11;
        int i12;
        int i13;
        float f13;
        float f14;
        float f15;
        int i14;
        double dDoubleValue;
        float f16;
        C5207g.m11111f(canvas, "canvas");
        super.onDraw(canvas);
        m9354e();
        Path path3 = this.f16738a;
        if (path3 == null) {
            C5207g.m11117l("gradientPath");
            throw null;
        }
        path3.reset();
        Path path4 = this.f16739b;
        if (path4 == null) {
            C5207g.m11117l("graphPath");
            throw null;
        }
        path4.reset();
        List<C8046e> list2 = this.f16749l;
        if (list2 == null) {
            C5207g.m11117l("coordinates");
            throw null;
        }
        int size = list2.size();
        Paint paint5 = this.f16745h;
        Paint paint6 = this.f16743f;
        boolean z12 = true;
        boolean z13 = false;
        float f17 = this.f16748k;
        float f18 = this.f16747j;
        if (size != 1) {
            f3 = f18;
            arrayList = this.f16737T;
            arrayList.clear();
            arrayList2 = this.f16735R;
            arrayList2.clear();
            arrayList3 = this.f16736S;
            arrayList3.clear();
            list = this.f16749l;
            if (list != null) {
                C5207g.m11117l("coordinates");
                throw null;
            }
            it = list.iterator();
            i10 = 0;
            f10 = 0.0f;
            while (it.hasNext()) {
                int i15 = i10 + 1;
                C8046e next = it.next();
                float f19 = next.f43714c;
                fM9352b = m9352b(m9355f(this.f16731N * f19, f19), z13);
                f12 = next.f43713b;
                if (i10 == 0) {
                    float fM9352b2 = m9352b((f12 - f12) * this.f16730M, z12);
                    path4.moveTo(fM9352b2, fM9352b);
                    path4.lineTo(fM9352b2, fM9352b);
                    arrayList.add(new PointF(fM9352b2, fM9352b));
                    z11 = z12;
                    f10 = f12;
                } else {
                    arrayList.add(new PointF(m9352b((f12 - f10) * this.f16730M, z12), fM9352b));
                    int i16 = i10 - 1;
                    float f20 = 2;
                    arrayList2.add(new PointF((((PointF) arrayList.get(i10)).x + ((PointF) arrayList.get(i16)).x) / f20, ((PointF) arrayList.get(i16)).y));
                    arrayList3.add(new PointF((((PointF) arrayList.get(i10)).x + ((PointF) arrayList.get(i16)).x) / f20, ((PointF) arrayList.get(i10)).y));
                    z11 = true;
                    path4.cubicTo(((PointF) arrayList2.get(i16)).x, ((PointF) arrayList2.get(i16)).y, ((PointF) arrayList3.get(i16)).x, ((PointF) arrayList3.get(i16)).y, ((PointF) arrayList.get(i10)).x, ((PointF) arrayList.get(i10)).y);
                }
                z12 = z11;
                paint5 = paint5;
                i10 = i15;
                it = it;
                paint6 = paint6;
                z13 = false;
            }
            z10 = z12;
            paint = paint6;
            paint2 = paint5;
            i11 = 2;
            if (this.f16728K < 0) {
                float f21 = 2;
                height = ((f3 * f21) + canvas.getHeight()) / f21;
            } else {
                height = canvas.getHeight();
            }
            Path path5 = new Path(path4);
            this.f16738a = path5;
            path5.lineTo(m9352b((this.f16725H - f10) * this.f16730M, z10), m9352b(height, false));
            path = this.f16738a;
            if (path != null) {
                C5207g.m11117l("gradientPath");
                throw null;
            }
            f11 = 0.0f;
            path.lineTo(m9352b(0.0f, z10), m9352b(height, false));
            paint3 = this.f16740c;
            if (paint3 != null) {
                C5207g.m11117l("pathPaint");
                throw null;
            }
            canvas.drawPath(path4, paint3);
            path2 = this.f16738a;
            if (path2 != null) {
                C5207g.m11117l("gradientPath");
                throw null;
            }
            paint4 = this.f16741d;
            if (paint4 != null) {
                C5207g.m11117l("gradientPaint");
                throw null;
            }
            canvas.drawPath(path2, paint4);
        } else {
            if ((this.f16725H == 0.0f) == true) {
                Paint paint7 = new Paint();
                paint7.setColor(this.f16729L);
                paint7.setAntiAlias(true);
                float f22 = 2;
                float fM9352b3 = m9352b(this.f16730M / f22, true);
                List<C8046e> list3 = this.f16749l;
                if (list3 == null) {
                    C5207g.m11117l("coordinates");
                    throw null;
                }
                float f23 = ((C8046e) C6752c.m13423Q(list3)).f43714c * this.f16731N;
                List<C8046e> list4 = this.f16749l;
                if (list4 == null) {
                    C5207g.m11117l("coordinates");
                    throw null;
                }
                float fM9352b4 = m9352b(m9355f(f23, ((C8046e) C6752c.m13423Q(list4)).f43714c), false);
                List<Integer> list5 = C6716m.f37937a;
                canvas.drawCircle(fM9352b3, fM9352b4, C6716m.m13316a(3), paint7);
                if (paint6 == null) {
                    C5207g.m11117l("xAxisLabelTextPaint");
                    throw null;
                }
                paint6.setTextSize(C6716m.m13331p(10));
                List<C8046e> list6 = this.f16749l;
                if (list6 == null) {
                    C5207g.m11117l("coordinates");
                    throw null;
                }
                Triple<String, Float, Float> tripleM9351a = m9351a((C8046e) C6752c.m13423Q(list6));
                String str = tripleM9351a.f38021a;
                float fFloatValue = tripleM9351a.f38022b.floatValue();
                float fFloatValue2 = tripleM9351a.f38023c.floatValue();
                float f24 = f17 / f22;
                float f25 = fFloatValue2 - f24;
                float f26 = f24 + fFloatValue2;
                if (paint5 == null) {
                    C5207g.m11117l("yAxisGridPaint");
                    throw null;
                }
                f3 = f18;
                canvas.drawLine(fM9352b3, f25, fM9352b3, f26, paint5);
                canvas.drawText(str, fM9352b3 - (fFloatValue / f22), fM9352b4 - (f3 / f22), paint6);
                z10 = true;
                paint = paint6;
                paint2 = paint5;
                i11 = 2;
                f11 = 0.0f;
            } else {
                f3 = f18;
                arrayList = this.f16737T;
                arrayList.clear();
                arrayList2 = this.f16735R;
                arrayList2.clear();
                arrayList3 = this.f16736S;
                arrayList3.clear();
                list = this.f16749l;
                if (list != null) {
                    C5207g.m11117l("coordinates");
                    throw null;
                }
                it = list.iterator();
                i10 = 0;
                f10 = 0.0f;
                while (it.hasNext()) {
                    int i17 = i10 + 1;
                    C8046e next2 = it.next();
                    float f110 = next2.f43714c;
                    fM9352b = m9352b(m9355f(this.f16731N * f110, f110), z13);
                    f12 = next2.f43713b;
                    if (i10 == 0) {
                        float fM9352b5 = m9352b((f12 - f12) * this.f16730M, z12);
                        path4.moveTo(fM9352b5, fM9352b);
                        path4.lineTo(fM9352b5, fM9352b);
                        arrayList.add(new PointF(fM9352b5, fM9352b));
                        z11 = z12;
                        f10 = f12;
                    } else {
                        arrayList.add(new PointF(m9352b((f12 - f10) * this.f16730M, z12), fM9352b));
                        int i18 = i10 - 1;
                        float f27 = 2;
                        arrayList2.add(new PointF((((PointF) arrayList.get(i10)).x + ((PointF) arrayList.get(i18)).x) / f27, ((PointF) arrayList.get(i18)).y));
                        arrayList3.add(new PointF((((PointF) arrayList.get(i10)).x + ((PointF) arrayList.get(i18)).x) / f27, ((PointF) arrayList.get(i10)).y));
                        z11 = true;
                        path4.cubicTo(((PointF) arrayList2.get(i18)).x, ((PointF) arrayList2.get(i18)).y, ((PointF) arrayList3.get(i18)).x, ((PointF) arrayList3.get(i18)).y, ((PointF) arrayList.get(i10)).x, ((PointF) arrayList.get(i10)).y);
                    }
                    z12 = z11;
                    paint5 = paint5;
                    i10 = i17;
                    it = it;
                    paint6 = paint6;
                    z13 = false;
                }
                z10 = z12;
                paint = paint6;
                paint2 = paint5;
                i11 = 2;
                if (this.f16728K < 0) {
                    float f28 = 2;
                    height = ((f3 * f28) + canvas.getHeight()) / f28;
                } else {
                    height = canvas.getHeight();
                }
                Path path6 = new Path(path4);
                this.f16738a = path6;
                path6.lineTo(m9352b((this.f16725H - f10) * this.f16730M, z10), m9352b(height, false));
                path = this.f16738a;
                if (path != null) {
                    C5207g.m11117l("gradientPath");
                    throw null;
                }
                f11 = 0.0f;
                path.lineTo(m9352b(0.0f, z10), m9352b(height, false));
                paint3 = this.f16740c;
                if (paint3 != null) {
                    C5207g.m11117l("pathPaint");
                    throw null;
                }
                canvas.drawPath(path4, paint3);
                path2 = this.f16738a;
                if (path2 != null) {
                    C5207g.m11117l("gradientPath");
                    throw null;
                }
                paint4 = this.f16741d;
                if (paint4 != null) {
                    C5207g.m11117l("gradientPaint");
                    throw null;
                }
                canvas.drawPath(path2, paint4);
            }
        }
        long j10 = this.f16728K < 0 ? 0L : this.f16727J / ((long) i11);
        m9350d(this, C4924a.m10484v(j10), false, 6);
        String strM10484v = C4924a.m10484v(j10);
        float f29 = i11;
        float f30 = f3 / 4;
        float height2 = ((canvas.getHeight() + f3) / f29) - f30;
        Paint paint8 = this.f16742e;
        if (paint8 == null) {
            C5207g.m11117l("xAxisTextPaint");
            throw null;
        }
        canvas.drawText(strM10484v, f11, height2, paint8);
        m9350d(this, C4924a.m10484v(this.f16727J), false, 6);
        float f31 = f3 / f29;
        canvas.drawText(C4924a.m10484v(this.f16727J), f11, (f31 + f3) - f30, paint8);
        long j11 = this.f16728K;
        if (j11 < 0) {
            m9350d(this, C4924a.m10484v(j11), false, 6);
            canvas.drawText(C4924a.m10484v(this.f16728K), -10.0f, m9352b(this.f16733P, false), paint8);
        }
        int i19 = 3;
        int i20 = 0;
        while (i20 < i19) {
            if (i20 == 0) {
                f16 = this.f16733P;
            } else if (i20 != z10) {
                f16 = i20 != i11 ? f11 : f3 * f29;
            } else {
                f16 = (this.f16733P / f29) + f3;
            }
            float fM9352b6 = m9352b(f16, false);
            if (fM9352b6 < f11) {
                requestLayout();
            }
            float fM9352b7 = m9352b(f11, z10);
            float f32 = this.f16725H;
            if (f32 < 1.0f) {
                f32 = 1.0f;
            }
            float fM9352b8 = m9352b(f32 * this.f16730M, z10);
            Paint paint9 = this.f16744g;
            if (paint9 == null) {
                C5207g.m11117l("xAxisGridPaint");
                throw null;
            }
            canvas.drawLine(fM9352b7, fM9352b6, fM9352b8, fM9352b6, paint9);
            i20++;
            z10 = z10;
            i19 = i19;
            i11 = 2;
            f11 = 0.0f;
        }
        ?? r10 = z10;
        int i21 = 0;
        List<C8046e> list7 = this.f16749l;
        if (list7 == null) {
            C5207g.m11117l("coordinates");
            throw null;
        }
        Iterator<T> it2 = list7.iterator();
        if (!it2.hasNext()) {
            throw new NoSuchElementException();
        }
        String str2 = ((C8046e) it2.next()).f43712a;
        while (it2.hasNext()) {
            String str3 = ((C8046e) it2.next()).f43712a;
            if (str2.compareTo(str3) < 0) {
                str2 = str3;
            }
        }
        if (str2.length() > 6) {
            Context context = getContext();
            C5207g.m11110e(context, "context");
            if (C4924a.m10460g(context)) {
                i12 = 7;
            } else {
                i12 = 2;
            }
        } else {
            i12 = 7;
        }
        this.f16734Q = i12;
        int i22 = (int) this.f16725H;
        int i23 = i22 > i12 ? i12 : i22;
        m9350d(this, str2, r10, 4);
        List<C8046e> list8 = this.f16749l;
        if (list8 == null) {
            C5207g.m11117l("coordinates");
            throw null;
        }
        Iterator<T> it3 = list8.iterator();
        if (!it3.hasNext()) {
            throw new NoSuchElementException();
        }
        String strValueOf = String.valueOf(((C8046e) it3.next()).f43714c);
        while (it3.hasNext()) {
            String strValueOf2 = String.valueOf(((C8046e) it3.next()).f43714c);
            if (strValueOf.compareTo(strValueOf2) < 0) {
                strValueOf = strValueOf2;
            }
        }
        Paint paint10 = paint;
        if (paint10 == null) {
            C5207g.m11117l("xAxisLabelTextPaint");
            throw null;
        }
        m9353c(strValueOf, r10, paint10);
        if (i23 < 0) {
            return;
        }
        int i24 = 0;
        while (true) {
            float f33 = this.f16725H;
            float f34 = i23;
            if (f33 <= f34) {
                i13 = i24;
            } else {
                int iM16708X0 = C8573r0.m16708X0(Math.ceil((f33 / this.f16734Q) * i24));
                List<C8046e> list9 = this.f16749l;
                if (list9 == null) {
                    C5207g.m11117l("coordinates");
                    throw null;
                }
                int iM17249o = C9000b.m17249o(list9);
                if (iM16708X0 > iM17249o) {
                    iM16708X0 = iM17249o;
                }
                i13 = iM16708X0;
            }
            Rect rect = new Rect();
            List<C8046e> list10 = this.f16749l;
            if (list10 == null) {
                C5207g.m11117l("coordinates");
                throw null;
            }
            String str4 = list10.get(i13).f43712a;
            List<C8046e> list11 = this.f16749l;
            if (list11 == null) {
                C5207g.m11117l("coordinates");
                throw null;
            }
            paint8.getTextBounds(str4, i21, list11.get(i13).f43712a.length(), rect);
            List<C8046e> list12 = this.f16749l;
            if (list12 == null) {
                C5207g.m11117l("coordinates");
                throw null;
            }
            if (list12.size() != r10) {
                f13 = (this.f16725H / f34) * i24 * this.f16730M;
            } else {
                if ((this.f16725H == 0.0f ? r10 == true ? 1 : 0 : i21) != 0) {
                    f13 = this.f16730M / f29;
                } else {
                    f13 = (this.f16725H / f34) * i24 * this.f16730M;
                }
            }
            float fWidth = f13 - (rect.width() / 2);
            float f35 = this.f16725H;
            if (f35 <= f34) {
                f14 = i24;
                f15 = this.f16730M;
            } else {
                f14 = (f35 / f34) * i24;
                f15 = this.f16730M;
            }
            float f36 = f14 * f15;
            if (f36 < 0.0f || fWidth < 0.0f) {
                requestLayout();
            }
            List<C8046e> list13 = this.f16749l;
            if (list13 == null) {
                C5207g.m11117l("coordinates");
                throw null;
            }
            String str5 = list13.get(i13).f43712a;
            float fM9352b9 = m9352b(fWidth, r10);
            if (fM9352b9 < 0.0f) {
                fM9352b9 = 0.0f;
            }
            canvas.drawText(str5, fM9352b9, canvas.getHeight(), paint8);
            List<C8046e> list14 = this.f16749l;
            if (list14 == null) {
                C5207g.m11117l("coordinates");
                throw null;
            }
            if (list14.size() > r10) {
                if ((this.f16725H == 0.0f ? r10 == true ? 1 : 0 : i21) == 0) {
                    List<C8046e> list15 = this.f16749l;
                    if (list15 == null) {
                        C5207g.m11117l("coordinates");
                        throw null;
                    }
                    Triple<String, Float, Float> tripleM9351a2 = m9351a(list15.get(i13));
                    String str6 = tripleM9351a2.f38021a;
                    float fFloatValue3 = tripleM9351a2.f38022b.floatValue();
                    float fFloatValue4 = tripleM9351a2.f38023c.floatValue();
                    float fM9352b10 = m9352b(f36, r10);
                    float f37 = f17 / f29;
                    float f38 = fFloatValue4 - f37;
                    float fM9352b11 = m9352b(f36, r10);
                    float f39 = f37 + fFloatValue4;
                    if (paint2 == null) {
                        C5207g.m11117l("yAxisGridPaint");
                        throw null;
                    }
                    int i25 = i13;
                    canvas.drawLine(fM9352b10, f38, fM9352b11, f39, paint2);
                    C5207g.m11111f(str6, "<this>");
                    Number number = NumberFormat.getNumberInstance(Locale.getDefault()).parse(str6);
                    if (number != null) {
                        dDoubleValue = number.doubleValue();
                    } else {
                        Double dM15245K2 = C7660h.m15245K2(str6);
                        dDoubleValue = dM15245K2 != null ? dM15245K2.doubleValue() : 0.0d;
                    }
                    String strM10484v2 = C4924a.m10484v((long) dDoubleValue);
                    float fM9352b12 = m9352b(f36, r10) - (fFloatValue3 / f29);
                    List<C8046e> list16 = this.f16749l;
                    if (list16 == null) {
                        C5207g.m11117l("coordinates");
                        throw null;
                    }
                    float f40 = list16.get(i25).f43714c * this.f16731N;
                    List<C8046e> list17 = this.f16749l;
                    if (list17 == null) {
                        C5207g.m11117l("coordinates");
                        throw null;
                    }
                    i14 = 0;
                    canvas.drawText(strM10484v2, fM9352b12, m9352b(m9355f(f40, list17.get(i25).f43714c), false) - f31, paint10);
                } else {
                    i14 = i21;
                }
            } else {
                i14 = i21;
                paint8 = paint8;
            }
            if (i24 == i23) {
                return;
            }
            i24++;
            i21 = i14;
            paint8 = paint8;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int size = View.MeasureSpec.getSize(i10);
        int size2 = View.MeasureSpec.getSize(i11);
        float f3 = 2;
        float f10 = this.f16747j;
        float f11 = size - (f10 * f3);
        float f12 = this.f16725H - this.f16726I;
        if (f12 < 1.0f) {
            f12 = 1.0f;
        }
        this.f16730M = f11 / f12;
        float f13 = (size2 - (f10 * f3)) / this.f16727J;
        if (this.f16728K < 0) {
            f13 /= f3;
        }
        this.f16731N = f13;
        setMeasuredDimension(size, size2);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        this.f16732O = i10 - ((int) this.f16747j);
        this.f16733P = i11;
        m9354e();
        super.onSizeChanged(i10, i11, i12, i13);
    }

    public final void setCoordinatePoints(List<C8046e> list) {
        C5207g.m11111f(list, "coordinates");
        this.f16749l = list;
        getMaxCoordinateValues();
        requestLayout();
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    public final void setLineColor(int i10) {
        this.f16729L = i10;
        Paint paint = this.f16740c;
        if (paint == null) {
            C5207g.m11117l("pathPaint");
            throw null;
        }
        paint.setColor(i10);
        int[] iArr = this.f16746i;
        if (iArr == null) {
            C5207g.m11117l("colorsArray");
            throw null;
        }
        iArr[0] = C8169a.m16216h(i10, 120);
        postInvalidate();
    }
}
