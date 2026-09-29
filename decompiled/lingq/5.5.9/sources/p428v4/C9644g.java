package p428v4;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p286o2.C7903c;
import p286o2.C7911k;
import p312p2.C8172d;
import p326q.C8446b;
import p329q2.C8488a;

/* JADX INFO: renamed from: v4.g */
/* JADX INFO: loaded from: classes.dex */
public final class C9644g extends AbstractC9643f {

    /* JADX INFO: renamed from: j */
    public static final PorterDuff.Mode f49355j = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b */
    public g f49356b;

    /* JADX INFO: renamed from: c */
    public PorterDuffColorFilter f49357c;

    /* JADX INFO: renamed from: d */
    public ColorFilter f49358d;

    /* JADX INFO: renamed from: e */
    public boolean f49359e;

    /* JADX INFO: renamed from: f */
    public boolean f49360f;

    /* JADX INFO: renamed from: g */
    public final float[] f49361g;

    /* JADX INFO: renamed from: h */
    public final Matrix f49362h;

    /* JADX INFO: renamed from: i */
    public final Rect f49363i;

    /* JADX INFO: renamed from: v4.g$a */
    public static class a extends e {
        public a() {
        }

        public a(a aVar) {
            super(aVar);
        }
    }

    /* JADX INFO: renamed from: v4.g$b */
    public static class b extends e {

        /* JADX INFO: renamed from: e */
        public C7903c f49364e;

        /* JADX INFO: renamed from: f */
        public float f49365f;

        /* JADX INFO: renamed from: g */
        public C7903c f49366g;

        /* JADX INFO: renamed from: h */
        public float f49367h;

        /* JADX INFO: renamed from: i */
        public float f49368i;

        /* JADX INFO: renamed from: j */
        public float f49369j;

        /* JADX INFO: renamed from: k */
        public float f49370k;

        /* JADX INFO: renamed from: l */
        public float f49371l;

        /* JADX INFO: renamed from: m */
        public Paint.Cap f49372m;

        /* JADX INFO: renamed from: n */
        public Paint.Join f49373n;

        /* JADX INFO: renamed from: o */
        public float f49374o;

        public b() {
            this.f49365f = 0.0f;
            this.f49367h = 1.0f;
            this.f49368i = 1.0f;
            this.f49369j = 0.0f;
            this.f49370k = 1.0f;
            this.f49371l = 0.0f;
            this.f49372m = Paint.Cap.BUTT;
            this.f49373n = Paint.Join.MITER;
            this.f49374o = 4.0f;
        }

        public b(b bVar) {
            super(bVar);
            this.f49365f = 0.0f;
            this.f49367h = 1.0f;
            this.f49368i = 1.0f;
            this.f49369j = 0.0f;
            this.f49370k = 1.0f;
            this.f49371l = 0.0f;
            this.f49372m = Paint.Cap.BUTT;
            this.f49373n = Paint.Join.MITER;
            this.f49374o = 4.0f;
            this.f49364e = bVar.f49364e;
            this.f49365f = bVar.f49365f;
            this.f49367h = bVar.f49367h;
            this.f49366g = bVar.f49366g;
            this.f49389c = bVar.f49389c;
            this.f49368i = bVar.f49368i;
            this.f49369j = bVar.f49369j;
            this.f49370k = bVar.f49370k;
            this.f49371l = bVar.f49371l;
            this.f49372m = bVar.f49372m;
            this.f49373n = bVar.f49373n;
            this.f49374o = bVar.f49374o;
        }

        @Override // p428v4.C9644g.d
        /* JADX INFO: renamed from: a */
        public final boolean mo18111a() {
            return this.f49366g.m15669b() || this.f49364e.m15669b();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x0041  */
        /* JADX WARN: Code duplicated, block: B:7:0x0023  */
        @Override // p428v4.C9644g.d
        /* JADX INFO: renamed from: b */
        public final boolean mo18112b(int[] iArr) {
            boolean z10;
            C7903c c7903c = this.f49366g;
            boolean z11 = true;
            if (c7903c.m15669b()) {
                ColorStateList colorStateList = c7903c.f43041b;
                int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
                if (colorForState != c7903c.f43042c) {
                    c7903c.f43042c = colorForState;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            C7903c c7903c2 = this.f49364e;
            if (c7903c2.m15669b()) {
                ColorStateList colorStateList2 = c7903c2.f43041b;
                int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                if (colorForState2 != c7903c2.f43042c) {
                    c7903c2.f43042c = colorForState2;
                } else {
                    z11 = false;
                }
            } else {
                z11 = false;
            }
            return z11 | z10;
        }

        public float getFillAlpha() {
            return this.f49368i;
        }

        public int getFillColor() {
            return this.f49366g.f43042c;
        }

        public float getStrokeAlpha() {
            return this.f49367h;
        }

        public int getStrokeColor() {
            return this.f49364e.f43042c;
        }

        public float getStrokeWidth() {
            return this.f49365f;
        }

        public float getTrimPathEnd() {
            return this.f49370k;
        }

        public float getTrimPathOffset() {
            return this.f49371l;
        }

        public float getTrimPathStart() {
            return this.f49369j;
        }

        public void setFillAlpha(float f3) {
            this.f49368i = f3;
        }

        public void setFillColor(int i10) {
            this.f49366g.f43042c = i10;
        }

        public void setStrokeAlpha(float f3) {
            this.f49367h = f3;
        }

        public void setStrokeColor(int i10) {
            this.f49364e.f43042c = i10;
        }

        public void setStrokeWidth(float f3) {
            this.f49365f = f3;
        }

        public void setTrimPathEnd(float f3) {
            this.f49370k = f3;
        }

        public void setTrimPathOffset(float f3) {
            this.f49371l = f3;
        }

        public void setTrimPathStart(float f3) {
            this.f49369j = f3;
        }
    }

    /* JADX INFO: renamed from: v4.g$c */
    public static class c extends d {

        /* JADX INFO: renamed from: a */
        public final Matrix f49375a;

        /* JADX INFO: renamed from: b */
        public final ArrayList<d> f49376b;

        /* JADX INFO: renamed from: c */
        public float f49377c;

        /* JADX INFO: renamed from: d */
        public float f49378d;

        /* JADX INFO: renamed from: e */
        public float f49379e;

        /* JADX INFO: renamed from: f */
        public float f49380f;

        /* JADX INFO: renamed from: g */
        public float f49381g;

        /* JADX INFO: renamed from: h */
        public float f49382h;

        /* JADX INFO: renamed from: i */
        public float f49383i;

        /* JADX INFO: renamed from: j */
        public final Matrix f49384j;

        /* JADX INFO: renamed from: k */
        public final int f49385k;

        /* JADX INFO: renamed from: l */
        public String f49386l;

        public c() {
            this.f49375a = new Matrix();
            this.f49376b = new ArrayList<>();
            this.f49377c = 0.0f;
            this.f49378d = 0.0f;
            this.f49379e = 0.0f;
            this.f49380f = 1.0f;
            this.f49381g = 1.0f;
            this.f49382h = 0.0f;
            this.f49383i = 0.0f;
            this.f49384j = new Matrix();
            this.f49386l = null;
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public c(c cVar, C8446b<String, Object> c8446b) {
            e aVar;
            this.f49375a = new Matrix();
            this.f49376b = new ArrayList<>();
            this.f49377c = 0.0f;
            this.f49378d = 0.0f;
            this.f49379e = 0.0f;
            this.f49380f = 1.0f;
            this.f49381g = 1.0f;
            this.f49382h = 0.0f;
            this.f49383i = 0.0f;
            Matrix matrix = new Matrix();
            this.f49384j = matrix;
            this.f49386l = null;
            this.f49377c = cVar.f49377c;
            this.f49378d = cVar.f49378d;
            this.f49379e = cVar.f49379e;
            this.f49380f = cVar.f49380f;
            this.f49381g = cVar.f49381g;
            this.f49382h = cVar.f49382h;
            this.f49383i = cVar.f49383i;
            String str = cVar.f49386l;
            this.f49386l = str;
            this.f49385k = cVar.f49385k;
            if (str != null) {
                c8446b.put(str, this);
            }
            matrix.set(cVar.f49384j);
            ArrayList<d> arrayList = cVar.f49376b;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                d dVar = arrayList.get(i10);
                if (dVar instanceof c) {
                    this.f49376b.add(new c((c) dVar, c8446b));
                } else {
                    if (dVar instanceof b) {
                        aVar = new b((b) dVar);
                    } else {
                        if (!(dVar instanceof a)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        aVar = new a((a) dVar);
                    }
                    this.f49376b.add(aVar);
                    String str2 = aVar.f49388b;
                    if (str2 != null) {
                        c8446b.put(str2, aVar);
                    }
                }
            }
        }

        @Override // p428v4.C9644g.d
        /* JADX INFO: renamed from: a */
        public final boolean mo18111a() {
            int i10 = 0;
            while (true) {
                ArrayList<d> arrayList = this.f49376b;
                if (i10 >= arrayList.size()) {
                    return false;
                }
                if (arrayList.get(i10).mo18111a()) {
                    return true;
                }
                i10++;
            }
        }

        @Override // p428v4.C9644g.d
        /* JADX INFO: renamed from: b */
        public final boolean mo18112b(int[] iArr) {
            int i10 = 0;
            boolean zMo18112b = false;
            while (true) {
                ArrayList<d> arrayList = this.f49376b;
                if (i10 >= arrayList.size()) {
                    return zMo18112b;
                }
                zMo18112b |= arrayList.get(i10).mo18112b(iArr);
                i10++;
            }
        }

        /* JADX INFO: renamed from: c */
        public final void m18113c() {
            Matrix matrix = this.f49384j;
            matrix.reset();
            matrix.postTranslate(-this.f49378d, -this.f49379e);
            matrix.postScale(this.f49380f, this.f49381g);
            matrix.postRotate(this.f49377c, 0.0f, 0.0f);
            matrix.postTranslate(this.f49382h + this.f49378d, this.f49383i + this.f49379e);
        }

        public String getGroupName() {
            return this.f49386l;
        }

        public Matrix getLocalMatrix() {
            return this.f49384j;
        }

        public float getPivotX() {
            return this.f49378d;
        }

        public float getPivotY() {
            return this.f49379e;
        }

        public float getRotation() {
            return this.f49377c;
        }

        public float getScaleX() {
            return this.f49380f;
        }

        public float getScaleY() {
            return this.f49381g;
        }

        public float getTranslateX() {
            return this.f49382h;
        }

        public float getTranslateY() {
            return this.f49383i;
        }

        public void setPivotX(float f3) {
            if (f3 != this.f49378d) {
                this.f49378d = f3;
                m18113c();
            }
        }

        public void setPivotY(float f3) {
            if (f3 != this.f49379e) {
                this.f49379e = f3;
                m18113c();
            }
        }

        public void setRotation(float f3) {
            if (f3 != this.f49377c) {
                this.f49377c = f3;
                m18113c();
            }
        }

        public void setScaleX(float f3) {
            if (f3 != this.f49380f) {
                this.f49380f = f3;
                m18113c();
            }
        }

        public void setScaleY(float f3) {
            if (f3 != this.f49381g) {
                this.f49381g = f3;
                m18113c();
            }
        }

        public void setTranslateX(float f3) {
            if (f3 != this.f49382h) {
                this.f49382h = f3;
                m18113c();
            }
        }

        public void setTranslateY(float f3) {
            if (f3 != this.f49383i) {
                this.f49383i = f3;
                m18113c();
            }
        }
    }

    /* JADX INFO: renamed from: v4.g$d */
    public static abstract class d {
        /* JADX INFO: renamed from: a */
        public boolean mo18111a() {
            return false;
        }

        /* JADX INFO: renamed from: b */
        public boolean mo18112b(int[] iArr) {
            return false;
        }
    }

    /* JADX INFO: renamed from: v4.g$e */
    public static abstract class e extends d {

        /* JADX INFO: renamed from: a */
        public C8172d.a[] f49387a;

        /* JADX INFO: renamed from: b */
        public String f49388b;

        /* JADX INFO: renamed from: c */
        public int f49389c;

        /* JADX INFO: renamed from: d */
        public final int f49390d;

        public e() {
            this.f49387a = null;
            this.f49389c = 0;
        }

        public e(e eVar) {
            this.f49387a = null;
            this.f49389c = 0;
            this.f49388b = eVar.f49388b;
            this.f49390d = eVar.f49390d;
            this.f49387a = C8172d.m16227e(eVar.f49387a);
        }

        public C8172d.a[] getPathData() {
            return this.f49387a;
        }

        public String getPathName() {
            return this.f49388b;
        }

        public void setPathData(C8172d.a[] aVarArr) {
            if (!C8172d.m16223a(this.f49387a, aVarArr)) {
                this.f49387a = C8172d.m16227e(aVarArr);
                return;
            }
            C8172d.a[] aVarArr2 = this.f49387a;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                aVarArr2[i10].f44307a = aVarArr[i10].f44307a;
                int i11 = 0;
                while (true) {
                    float[] fArr = aVarArr[i10].f44308b;
                    if (i11 < fArr.length) {
                        aVarArr2[i10].f44308b[i11] = fArr[i11];
                        i11++;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: v4.g$f */
    public static class f {

        /* JADX INFO: renamed from: p */
        public static final Matrix f49391p = new Matrix();

        /* JADX INFO: renamed from: a */
        public final Path f49392a;

        /* JADX INFO: renamed from: b */
        public final Path f49393b;

        /* JADX INFO: renamed from: c */
        public final Matrix f49394c;

        /* JADX INFO: renamed from: d */
        public Paint f49395d;

        /* JADX INFO: renamed from: e */
        public Paint f49396e;

        /* JADX INFO: renamed from: f */
        public PathMeasure f49397f;

        /* JADX INFO: renamed from: g */
        public final c f49398g;

        /* JADX INFO: renamed from: h */
        public float f49399h;

        /* JADX INFO: renamed from: i */
        public float f49400i;

        /* JADX INFO: renamed from: j */
        public float f49401j;

        /* JADX INFO: renamed from: k */
        public float f49402k;

        /* JADX INFO: renamed from: l */
        public int f49403l;

        /* JADX INFO: renamed from: m */
        public String f49404m;

        /* JADX INFO: renamed from: n */
        public Boolean f49405n;

        /* JADX INFO: renamed from: o */
        public final C8446b<String, Object> f49406o;

        public f() {
            this.f49394c = new Matrix();
            this.f49399h = 0.0f;
            this.f49400i = 0.0f;
            this.f49401j = 0.0f;
            this.f49402k = 0.0f;
            this.f49403l = 255;
            this.f49404m = null;
            this.f49405n = null;
            this.f49406o = new C8446b<>();
            this.f49398g = new c();
            this.f49392a = new Path();
            this.f49393b = new Path();
        }

        public f(f fVar) {
            this.f49394c = new Matrix();
            this.f49399h = 0.0f;
            this.f49400i = 0.0f;
            this.f49401j = 0.0f;
            this.f49402k = 0.0f;
            this.f49403l = 255;
            this.f49404m = null;
            this.f49405n = null;
            C8446b<String, Object> c8446b = new C8446b<>();
            this.f49406o = c8446b;
            this.f49398g = new c(fVar.f49398g, c8446b);
            this.f49392a = new Path(fVar.f49392a);
            this.f49393b = new Path(fVar.f49393b);
            this.f49399h = fVar.f49399h;
            this.f49400i = fVar.f49400i;
            this.f49401j = fVar.f49401j;
            this.f49402k = fVar.f49402k;
            this.f49403l = fVar.f49403l;
            this.f49404m = fVar.f49404m;
            String str = fVar.f49404m;
            if (str != null) {
                c8446b.put(str, this);
            }
            this.f49405n = fVar.f49405n;
        }

        /* JADX INFO: renamed from: a */
        public final void m18114a(c cVar, Matrix matrix, Canvas canvas, int i10, int i11) {
            int i12;
            float f3;
            boolean z10;
            cVar.f49375a.set(matrix);
            Matrix matrix2 = cVar.f49375a;
            matrix2.preConcat(cVar.f49384j);
            canvas.save();
            char c10 = 0;
            int i13 = 0;
            while (true) {
                ArrayList<d> arrayList = cVar.f49376b;
                if (i13 >= arrayList.size()) {
                    canvas.restore();
                    return;
                }
                d dVar = arrayList.get(i13);
                if (dVar instanceof c) {
                    m18114a((c) dVar, matrix2, canvas, i10, i11);
                } else {
                    if (dVar instanceof e) {
                        e eVar = (e) dVar;
                        float f10 = i10 / this.f49401j;
                        float f11 = i11 / this.f49402k;
                        float fMin = Math.min(f10, f11);
                        Matrix matrix3 = this.f49394c;
                        matrix3.set(matrix2);
                        matrix3.postScale(f10, f11);
                        float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                        matrix2.mapVectors(fArr);
                        float fHypot = (float) Math.hypot(fArr[c10], fArr[1]);
                        i12 = i13;
                        float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                        float f12 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                        float fMax = Math.max(fHypot, fHypot2);
                        float fAbs = fMax > 0.0f ? Math.abs(f12) / fMax : 0.0f;
                        if (fAbs != 0.0f) {
                            eVar.getClass();
                            Path path = this.f49392a;
                            path.reset();
                            C8172d.a[] aVarArr = eVar.f49387a;
                            if (aVarArr != null) {
                                C8172d.a.m16229b(aVarArr, path);
                            }
                            Path path2 = this.f49393b;
                            path2.reset();
                            if (eVar instanceof a) {
                                path2.setFillType(eVar.f49389c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                path2.addPath(path, matrix3);
                                canvas.clipPath(path2);
                            } else {
                                b bVar = (b) eVar;
                                float f13 = bVar.f49369j;
                                if (f13 != 0.0f || bVar.f49370k != 1.0f) {
                                    float f14 = bVar.f49371l;
                                    float f15 = (f13 + f14) % 1.0f;
                                    float f16 = (bVar.f49370k + f14) % 1.0f;
                                    if (this.f49397f == null) {
                                        this.f49397f = new PathMeasure();
                                    }
                                    this.f49397f.setPath(path, false);
                                    float length = this.f49397f.getLength();
                                    float f17 = f15 * length;
                                    float f18 = f16 * length;
                                    path.reset();
                                    if (f17 > f18) {
                                        this.f49397f.getSegment(f17, length, path, true);
                                        f3 = 0.0f;
                                        this.f49397f.getSegment(0.0f, f18, path, true);
                                    } else {
                                        f3 = 0.0f;
                                        this.f49397f.getSegment(f17, f18, path, true);
                                    }
                                    path.rLineTo(f3, f3);
                                }
                                path2.addPath(path, matrix3);
                                C7903c c7903c = bVar.f49366g;
                                if ((c7903c.f43040a != null) || c7903c.f43042c != 0) {
                                    if (this.f49396e == null) {
                                        Paint paint = new Paint(1);
                                        this.f49396e = paint;
                                        paint.setStyle(Paint.Style.FILL);
                                    }
                                    Paint paint2 = this.f49396e;
                                    Shader shader = c7903c.f43040a;
                                    if (shader != null) {
                                        shader.setLocalMatrix(matrix3);
                                        paint2.setShader(shader);
                                        paint2.setAlpha(Math.round(bVar.f49368i * 255.0f));
                                    } else {
                                        paint2.setShader(null);
                                        paint2.setAlpha(255);
                                        int i14 = c7903c.f43042c;
                                        float f19 = bVar.f49368i;
                                        PorterDuff.Mode mode = C9644g.f49355j;
                                        paint2.setColor((i14 & 16777215) | (((int) (Color.alpha(i14) * f19)) << 24));
                                    }
                                    paint2.setColorFilter(null);
                                    path2.setFillType(bVar.f49389c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                    canvas.drawPath(path2, paint2);
                                }
                                C7903c c7903c2 = bVar.f49364e;
                                if ((c7903c2.f43040a != null) || c7903c2.f43042c != 0) {
                                    if (this.f49395d == null) {
                                        z10 = true;
                                        Paint paint3 = new Paint(1);
                                        this.f49395d = paint3;
                                        paint3.setStyle(Paint.Style.STROKE);
                                    } else {
                                        z10 = true;
                                    }
                                    Paint paint4 = this.f49395d;
                                    Paint.Join join = bVar.f49373n;
                                    if (join != null) {
                                        paint4.setStrokeJoin(join);
                                    }
                                    Paint.Cap cap = bVar.f49372m;
                                    if (cap != null) {
                                        paint4.setStrokeCap(cap);
                                    }
                                    paint4.setStrokeMiter(bVar.f49374o);
                                    Shader shader2 = c7903c2.f43040a;
                                    if (shader2 == null) {
                                        z10 = false;
                                    }
                                    if (z10) {
                                        shader2.setLocalMatrix(matrix3);
                                        paint4.setShader(shader2);
                                        paint4.setAlpha(Math.round(bVar.f49367h * 255.0f));
                                    } else {
                                        paint4.setShader(null);
                                        paint4.setAlpha(255);
                                        int i15 = c7903c2.f43042c;
                                        float f20 = bVar.f49367h;
                                        PorterDuff.Mode mode2 = C9644g.f49355j;
                                        paint4.setColor((i15 & 16777215) | (((int) (Color.alpha(i15) * f20)) << 24));
                                    }
                                    paint4.setColorFilter(null);
                                    paint4.setStrokeWidth(bVar.f49365f * fAbs * fMin);
                                    canvas.drawPath(path2, paint4);
                                }
                            }
                        }
                    }
                    i13 = i12 + 1;
                    c10 = 0;
                }
                i12 = i13;
                i13 = i12 + 1;
                c10 = 0;
            }
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f49403l;
        }

        public void setAlpha(float f3) {
            setRootAlpha((int) (f3 * 255.0f));
        }

        public void setRootAlpha(int i10) {
            this.f49403l = i10;
        }
    }

    /* JADX INFO: renamed from: v4.g$g */
    public static class g extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public int f49407a;

        /* JADX INFO: renamed from: b */
        public f f49408b;

        /* JADX INFO: renamed from: c */
        public ColorStateList f49409c;

        /* JADX INFO: renamed from: d */
        public PorterDuff.Mode f49410d;

        /* JADX INFO: renamed from: e */
        public boolean f49411e;

        /* JADX INFO: renamed from: f */
        public Bitmap f49412f;

        /* JADX INFO: renamed from: g */
        public ColorStateList f49413g;

        /* JADX INFO: renamed from: h */
        public PorterDuff.Mode f49414h;

        /* JADX INFO: renamed from: i */
        public int f49415i;

        /* JADX INFO: renamed from: j */
        public boolean f49416j;

        /* JADX INFO: renamed from: k */
        public boolean f49417k;

        /* JADX INFO: renamed from: l */
        public Paint f49418l;

        public g() {
            this.f49409c = null;
            this.f49410d = C9644g.f49355j;
            this.f49408b = new f();
        }

        public g(g gVar) {
            this.f49409c = null;
            this.f49410d = C9644g.f49355j;
            if (gVar != null) {
                this.f49407a = gVar.f49407a;
                f fVar = new f(gVar.f49408b);
                this.f49408b = fVar;
                if (gVar.f49408b.f49396e != null) {
                    fVar.f49396e = new Paint(gVar.f49408b.f49396e);
                }
                if (gVar.f49408b.f49395d != null) {
                    this.f49408b.f49395d = new Paint(gVar.f49408b.f49395d);
                }
                this.f49409c = gVar.f49409c;
                this.f49410d = gVar.f49410d;
                this.f49411e = gVar.f49411e;
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f49407a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new C9644g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return new C9644g(this);
        }
    }

    /* JADX INFO: renamed from: v4.g$h */
    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Drawable.ConstantState f49419a;

        public h(Drawable.ConstantState constantState) {
            this.f49419a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final boolean canApplyTheme() {
            return this.f49419a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f49419a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            C9644g c9644g = new C9644g();
            c9644g.f49354a = (VectorDrawable) this.f49419a.newDrawable();
            return c9644g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            C9644g c9644g = new C9644g();
            c9644g.f49354a = (VectorDrawable) this.f49419a.newDrawable(resources);
            return c9644g;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C9644g c9644g = new C9644g();
            c9644g.f49354a = (VectorDrawable) this.f49419a.newDrawable(resources, theme);
            return c9644g;
        }
    }

    public C9644g() {
        this.f49360f = true;
        this.f49361g = new float[9];
        this.f49362h = new Matrix();
        this.f49363i = new Rect();
        this.f49356b = new g();
    }

    public C9644g(g gVar) {
        this.f49360f = true;
        this.f49361g = new float[9];
        this.f49362h = new Matrix();
        this.f49363i = new Rect();
        this.f49356b = gVar;
        this.f49357c = m18110a(gVar.f49409c, gVar.f49410d);
    }

    /* JADX INFO: renamed from: a */
    public final PorterDuffColorFilter m18110a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            C8488a.b.m16564b(drawable);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00bf  */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f49363i;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f49358d;
        if (colorFilter == null) {
            colorFilter = this.f49357c;
        }
        Matrix matrix = this.f49362h;
        canvas.getMatrix(matrix);
        float[] fArr = this.f49361g;
        matrix.getValues(fArr);
        float fAbs = Math.abs(fArr[0]);
        float fAbs2 = Math.abs(fArr[4]);
        float fAbs3 = Math.abs(fArr[1]);
        float fAbs4 = Math.abs(fArr[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (rect.width() * fAbs);
        int iHeight = (int) (rect.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && C8488a.c.m16572a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        g gVar = this.f49356b;
        Bitmap bitmap = gVar.f49412f;
        if (bitmap == null) {
            gVar.f49412f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
            gVar.f49417k = true;
        } else {
            if (!(iMin == bitmap.getWidth() && iMin2 == gVar.f49412f.getHeight())) {
                gVar.f49412f = Bitmap.createBitmap(iMin, iMin2, Bitmap.Config.ARGB_8888);
                gVar.f49417k = true;
            }
        }
        if (this.f49360f) {
            g gVar2 = this.f49356b;
            if (!(!gVar2.f49417k && gVar2.f49413g == gVar2.f49409c && gVar2.f49414h == gVar2.f49410d && gVar2.f49416j == gVar2.f49411e && gVar2.f49415i == gVar2.f49408b.getRootAlpha())) {
                g gVar3 = this.f49356b;
                gVar3.f49412f.eraseColor(0);
                Canvas canvas2 = new Canvas(gVar3.f49412f);
                f fVar = gVar3.f49408b;
                fVar.m18114a(fVar.f49398g, f.f49391p, canvas2, iMin, iMin2);
                g gVar4 = this.f49356b;
                gVar4.f49413g = gVar4.f49409c;
                gVar4.f49414h = gVar4.f49410d;
                gVar4.f49415i = gVar4.f49408b.getRootAlpha();
                gVar4.f49416j = gVar4.f49411e;
                gVar4.f49417k = false;
            }
        } else {
            g gVar5 = this.f49356b;
            gVar5.f49412f.eraseColor(0);
            Canvas canvas3 = new Canvas(gVar5.f49412f);
            f fVar2 = gVar5.f49408b;
            fVar2.m18114a(fVar2.f49398g, f.f49391p, canvas3, iMin, iMin2);
        }
        g gVar6 = this.f49356b;
        if ((gVar6.f49408b.getRootAlpha() < 255) || colorFilter != null) {
            if (gVar6.f49418l == null) {
                Paint paint2 = new Paint();
                gVar6.f49418l = paint2;
                paint2.setFilterBitmap(true);
            }
            gVar6.f49418l.setAlpha(gVar6.f49408b.getRootAlpha());
            gVar6.f49418l.setColorFilter(colorFilter);
            paint = gVar6.f49418l;
        } else {
            paint = null;
        }
        canvas.drawBitmap(gVar6.f49412f, (Rect) null, rect, paint);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f49354a;
        return drawable != null ? C8488a.a.m16558a(drawable) : this.f49356b.f49408b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f49354a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f49356b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f49354a;
        return drawable != null ? C8488a.b.m16565c(drawable) : this.f49358d;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f49354a != null) {
            return new h(this.f49354a.getConstantState());
        }
        this.f49356b.f49407a = getChangingConfigurations();
        return this.f49356b;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f49354a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f49356b.f49408b.f49400i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f49354a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f49356b.f49408b.f49399h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        f fVar;
        int i10;
        int i11;
        boolean z10;
        char c10;
        char c11;
        Resources resources2 = resources;
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            C8488a.b.m16566d(drawable, resources2, xmlPullParser, attributeSet, theme);
            return;
        }
        g gVar = this.f49356b;
        gVar.f49408b = new f();
        TypedArray typedArrayM15693k = C7911k.m15693k(resources2, theme, attributeSet, C9638a.f49334a);
        g gVar2 = this.f49356b;
        f fVar2 = gVar2.f49408b;
        int iM15688f = C7911k.m15688f(typedArrayM15693k, xmlPullParser, "tintMode", 6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i12 = 3;
        if (iM15688f == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (iM15688f != 5) {
            if (iM15688f != 9) {
                switch (iM15688f) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case 16:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        gVar2.f49410d = mode;
        ColorStateList colorStateListM15685c = C7911k.m15685c(typedArrayM15693k, xmlPullParser, theme);
        if (colorStateListM15685c != null) {
            gVar2.f49409c = colorStateListM15685c;
        }
        gVar2.f49411e = C7911k.m15684b(typedArrayM15693k, xmlPullParser, "autoMirrored", 5, gVar2.f49411e);
        fVar2.f49401j = C7911k.m15687e(typedArrayM15693k, xmlPullParser, "viewportWidth", 7, fVar2.f49401j);
        float fM15687e = C7911k.m15687e(typedArrayM15693k, xmlPullParser, "viewportHeight", 8, fVar2.f49402k);
        fVar2.f49402k = fM15687e;
        if (fVar2.f49401j <= 0.0f) {
            throw new XmlPullParserException(typedArrayM15693k.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fM15687e <= 0.0f) {
            throw new XmlPullParserException(typedArrayM15693k.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        fVar2.f49399h = typedArrayM15693k.getDimension(3, fVar2.f49399h);
        int i13 = 2;
        float dimension = typedArrayM15693k.getDimension(2, fVar2.f49400i);
        fVar2.f49400i = dimension;
        if (fVar2.f49399h <= 0.0f) {
            throw new XmlPullParserException(typedArrayM15693k.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArrayM15693k.getPositionDescription() + "<vector> tag requires height > 0");
        }
        fVar2.setAlpha(C7911k.m15687e(typedArrayM15693k, xmlPullParser, "alpha", 4, fVar2.getAlpha()));
        boolean z11 = false;
        String string = typedArrayM15693k.getString(0);
        if (string != null) {
            fVar2.f49404m = string;
            fVar2.f49406o.put(string, fVar2);
        }
        typedArrayM15693k.recycle();
        gVar.f49407a = getChangingConfigurations();
        int i14 = 1;
        gVar.f49417k = true;
        g gVar3 = this.f49356b;
        f fVar3 = gVar3.f49408b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(fVar3.f49398g);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z12 = true;
        while (eventType != i14 && (xmlPullParser.getDepth() >= depth || eventType != i12)) {
            if (eventType == i13) {
                String name = xmlPullParser.getName();
                c cVar = (c) arrayDeque.peek();
                boolean zEquals = "path".equals(name);
                C8446b<String, Object> c8446b = fVar3.f49406o;
                fVar = fVar3;
                if (zEquals) {
                    b bVar = new b();
                    TypedArray typedArrayM15693k2 = C7911k.m15693k(resources2, theme, attributeSet, C9638a.f49336c);
                    if (C7911k.m15692j(xmlPullParser, "pathData")) {
                        String string2 = typedArrayM15693k2.getString(0);
                        if (string2 != null) {
                            bVar.f49388b = string2;
                        }
                        String string3 = typedArrayM15693k2.getString(2);
                        if (string3 != null) {
                            bVar.f49387a = C8172d.m16225c(string3);
                        }
                        bVar.f49366g = C7911k.m15686d(typedArrayM15693k2, xmlPullParser, theme, "fillColor", 1);
                        bVar.f49368i = C7911k.m15687e(typedArrayM15693k2, xmlPullParser, "fillAlpha", 12, bVar.f49368i);
                        int iM15688f2 = C7911k.m15688f(typedArrayM15693k2, xmlPullParser, "strokeLineCap", 8, -1);
                        Paint.Cap cap = bVar.f49372m;
                        if (iM15688f2 == 0) {
                            cap = Paint.Cap.BUTT;
                        } else if (iM15688f2 == 1) {
                            cap = Paint.Cap.ROUND;
                        } else if (iM15688f2 == 2) {
                            cap = Paint.Cap.SQUARE;
                        }
                        bVar.f49372m = cap;
                        int iM15688f3 = C7911k.m15688f(typedArrayM15693k2, xmlPullParser, "strokeLineJoin", 9, -1);
                        Paint.Join join = bVar.f49373n;
                        if (iM15688f3 == 0) {
                            join = Paint.Join.MITER;
                        } else if (iM15688f3 == 1) {
                            join = Paint.Join.ROUND;
                        } else if (iM15688f3 == 2) {
                            join = Paint.Join.BEVEL;
                        }
                        bVar.f49373n = join;
                        bVar.f49374o = C7911k.m15687e(typedArrayM15693k2, xmlPullParser, "strokeMiterLimit", 10, bVar.f49374o);
                        bVar.f49364e = C7911k.m15686d(typedArrayM15693k2, xmlPullParser, theme, "strokeColor", 3);
                        bVar.f49367h = C7911k.m15687e(typedArrayM15693k2, xmlPullParser, "strokeAlpha", 11, bVar.f49367h);
                        bVar.f49365f = C7911k.m15687e(typedArrayM15693k2, xmlPullParser, "strokeWidth", 4, bVar.f49365f);
                        bVar.f49370k = C7911k.m15687e(typedArrayM15693k2, xmlPullParser, "trimPathEnd", 6, bVar.f49370k);
                        bVar.f49371l = C7911k.m15687e(typedArrayM15693k2, xmlPullParser, "trimPathOffset", 7, bVar.f49371l);
                        bVar.f49369j = C7911k.m15687e(typedArrayM15693k2, xmlPullParser, "trimPathStart", 5, bVar.f49369j);
                        bVar.f49389c = C7911k.m15688f(typedArrayM15693k2, xmlPullParser, "fillType", 13, bVar.f49389c);
                    }
                    typedArrayM15693k2.recycle();
                    cVar.f49376b.add(bVar);
                    if (bVar.getPathName() != null) {
                        c8446b.put(bVar.getPathName(), bVar);
                    }
                    gVar3.f49407a = bVar.f49390d | gVar3.f49407a;
                    z10 = false;
                    c11 = 4;
                    c10 = 5;
                    z12 = false;
                } else {
                    depth = depth;
                    if ("clip-path".equals(name)) {
                        a aVar = new a();
                        if (C7911k.m15692j(xmlPullParser, "pathData")) {
                            TypedArray typedArrayM15693k3 = C7911k.m15693k(resources2, theme, attributeSet, C9638a.f49337d);
                            String string4 = typedArrayM15693k3.getString(0);
                            if (string4 != null) {
                                aVar.f49388b = string4;
                            }
                            String string5 = typedArrayM15693k3.getString(1);
                            if (string5 != null) {
                                aVar.f49387a = C8172d.m16225c(string5);
                            }
                            aVar.f49389c = C7911k.m15688f(typedArrayM15693k3, xmlPullParser, "fillType", 2, 0);
                            typedArrayM15693k3.recycle();
                        }
                        cVar.f49376b.add(aVar);
                        if (aVar.getPathName() != null) {
                            c8446b.put(aVar.getPathName(), aVar);
                        }
                        gVar3.f49407a |= aVar.f49390d;
                    } else if ("group".equals(name)) {
                        c cVar2 = new c();
                        TypedArray typedArrayM15693k4 = C7911k.m15693k(resources2, theme, attributeSet, C9638a.f49335b);
                        c10 = 5;
                        cVar2.f49377c = C7911k.m15687e(typedArrayM15693k4, xmlPullParser, "rotation", 5, cVar2.f49377c);
                        cVar2.f49378d = typedArrayM15693k4.getFloat(1, cVar2.f49378d);
                        cVar2.f49379e = typedArrayM15693k4.getFloat(2, cVar2.f49379e);
                        cVar2.f49380f = C7911k.m15687e(typedArrayM15693k4, xmlPullParser, "scaleX", 3, cVar2.f49380f);
                        c11 = 4;
                        cVar2.f49381g = C7911k.m15687e(typedArrayM15693k4, xmlPullParser, "scaleY", 4, cVar2.f49381g);
                        cVar2.f49382h = C7911k.m15687e(typedArrayM15693k4, xmlPullParser, "translateX", 6, cVar2.f49382h);
                        cVar2.f49383i = C7911k.m15687e(typedArrayM15693k4, xmlPullParser, "translateY", 7, cVar2.f49383i);
                        z10 = false;
                        String string6 = typedArrayM15693k4.getString(0);
                        if (string6 != null) {
                            cVar2.f49386l = string6;
                        }
                        cVar2.m18113c();
                        typedArrayM15693k4.recycle();
                        cVar.f49376b.add(cVar2);
                        arrayDeque.push(cVar2);
                        if (cVar2.getGroupName() != null) {
                            c8446b.put(cVar2.getGroupName(), cVar2);
                        }
                        gVar3.f49407a = cVar2.f49385k | gVar3.f49407a;
                    }
                    z10 = false;
                    c11 = 4;
                    c10 = 5;
                }
                i10 = 3;
                i11 = 1;
            } else {
                fVar = fVar3;
                depth = depth;
                i10 = i12;
                i11 = i14;
                z10 = z11;
                if (eventType == i10 && "group".equals(xmlPullParser.getName())) {
                    arrayDeque.pop();
                }
            }
            eventType = xmlPullParser.next();
            resources2 = resources;
            z11 = z10;
            i12 = i10;
            i14 = i11;
            fVar3 = fVar;
            depth = depth;
            i13 = 2;
        }
        if (z12) {
            throw new XmlPullParserException("no path defined");
        }
        this.f49357c = m18110a(gVar.f49409c, gVar.f49410d);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f49354a;
        return drawable != null ? C8488a.a.m16561d(drawable) : this.f49356b.f49411e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            g gVar = this.f49356b;
            if (gVar != null) {
                f fVar = gVar.f49408b;
                if (fVar.f49405n == null) {
                    fVar.f49405n = Boolean.valueOf(fVar.f49398g.mo18111a());
                }
                if (!fVar.f49405n.booleanValue()) {
                    ColorStateList colorStateList = this.f49356b.f49409c;
                    if (colorStateList != null && colorStateList.isStateful()) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f49359e && super.mutate() == this) {
            this.f49356b = new g(this.f49356b);
            this.f49359e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z10;
        PorterDuff.Mode mode;
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        g gVar = this.f49356b;
        ColorStateList colorStateList = gVar.f49409c;
        if (colorStateList == null || (mode = gVar.f49410d) == null) {
            z10 = false;
        } else {
            this.f49357c = m18110a(colorStateList, mode);
            invalidateSelf();
            z10 = true;
        }
        f fVar = gVar.f49408b;
        if (fVar.f49405n == null) {
            fVar.f49405n = Boolean.valueOf(fVar.f49398g.mo18111a());
        }
        if (fVar.f49405n.booleanValue()) {
            boolean zMo18112b = gVar.f49408b.f49398g.mo18112b(iArr);
            gVar.f49417k |= zMo18112b;
            if (zMo18112b) {
                invalidateSelf();
                return true;
            }
        }
        return z10;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j10) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j10);
        } else {
            super.scheduleSelf(runnable, j10);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i10) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.setAlpha(i10);
        } else if (this.f49356b.f49408b.getRootAlpha() != i10) {
            this.f49356b.f49408b.setRootAlpha(i10);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z10) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            C8488a.a.m16562e(drawable, z10);
        } else {
            this.f49356b.f49411e = z10;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f49358d = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i10) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            C8488a.m16555a(drawable, i10);
        } else {
            setTintList(ColorStateList.valueOf(i10));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            C8488a.b.m16570h(drawable, colorStateList);
            return;
        }
        g gVar = this.f49356b;
        if (gVar.f49409c != colorStateList) {
            gVar.f49409c = colorStateList;
            this.f49357c = m18110a(colorStateList, gVar.f49410d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            C8488a.b.m16571i(drawable, mode);
            return;
        }
        g gVar = this.f49356b;
        if (gVar.f49410d != mode) {
            gVar.f49410d = mode;
            this.f49357c = m18110a(gVar.f49409c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z10, boolean z11) {
        Drawable drawable = this.f49354a;
        return drawable != null ? drawable.setVisible(z10, z11) : super.setVisible(z10, z11);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f49354a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
