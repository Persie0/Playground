package gd;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import java.util.ArrayList;
import p117fd.C5507a;

/* JADX INFO: renamed from: gd.n */
/* JADX INFO: loaded from: classes.dex */
public final class C5775n {

    /* JADX INFO: renamed from: a */
    @Deprecated
    public float f34934a;

    /* JADX INFO: renamed from: b */
    @Deprecated
    public float f34935b;

    /* JADX INFO: renamed from: c */
    @Deprecated
    public float f34936c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public float f34937d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public float f34938e;

    /* JADX INFO: renamed from: f */
    @Deprecated
    public float f34939f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f34940g = new ArrayList();

    /* JADX INFO: renamed from: h */
    public final ArrayList f34941h = new ArrayList();

    /* JADX INFO: renamed from: gd.n$a */
    public static class a extends f {

        /* JADX INFO: renamed from: c */
        public final c f34942c;

        public a(c cVar) {
            this.f34942c = cVar;
        }

        @Override // gd.C5775n.f
        /* JADX INFO: renamed from: a */
        public final void mo12163a(Matrix matrix, C5507a c5507a, int i10, Canvas canvas) {
            c cVar = this.f34942c;
            float f3 = cVar.f34951f;
            float f10 = cVar.f34952g;
            RectF rectF = new RectF(cVar.f34947b, cVar.f34948c, cVar.f34949d, cVar.f34950e);
            c5507a.getClass();
            boolean z10 = f10 < 0.0f;
            Path path = c5507a.f34145g;
            int[] iArr = C5507a.f34137k;
            if (z10) {
                iArr[0] = 0;
                iArr[1] = c5507a.f34144f;
                iArr[2] = c5507a.f34143e;
                iArr[3] = c5507a.f34142d;
            } else {
                path.rewind();
                path.moveTo(rectF.centerX(), rectF.centerY());
                path.arcTo(rectF, f3, f10);
                path.close();
                float f11 = -i10;
                rectF.inset(f11, f11);
                iArr[0] = 0;
                iArr[1] = c5507a.f34142d;
                iArr[2] = c5507a.f34143e;
                iArr[3] = c5507a.f34144f;
            }
            float fWidth = rectF.width() / 2.0f;
            if (fWidth <= 0.0f) {
                return;
            }
            float f12 = 1.0f - (i10 / fWidth);
            float[] fArr = C5507a.f34138l;
            fArr[1] = f12;
            fArr[2] = ((1.0f - f12) / 2.0f) + f12;
            RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), fWidth, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = c5507a.f34140b;
            paint.setShader(radialGradient);
            canvas.save();
            canvas.concat(matrix);
            canvas.scale(1.0f, rectF.height() / rectF.width());
            if (!z10) {
                canvas.clipPath(path, Region.Op.DIFFERENCE);
                canvas.drawPath(path, c5507a.f34146h);
            }
            canvas.drawArc(rectF, f3, f10, true, paint);
            canvas.restore();
        }
    }

    /* JADX INFO: renamed from: gd.n$b */
    public static class b extends f {

        /* JADX INFO: renamed from: c */
        public final d f34943c;

        /* JADX INFO: renamed from: d */
        public final float f34944d;

        /* JADX INFO: renamed from: e */
        public final float f34945e;

        public b(d dVar, float f3, float f10) {
            this.f34943c = dVar;
            this.f34944d = f3;
            this.f34945e = f10;
        }

        @Override // gd.C5775n.f
        /* JADX INFO: renamed from: a */
        public final void mo12163a(Matrix matrix, C5507a c5507a, int i10, Canvas canvas) {
            d dVar = this.f34943c;
            float f3 = dVar.f34954c;
            float f10 = this.f34945e;
            float f11 = dVar.f34953b;
            float f12 = this.f34944d;
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f3 - f10, f11 - f12), 0.0f);
            Matrix matrix2 = this.f34957a;
            matrix2.set(matrix);
            matrix2.preTranslate(f12, f10);
            matrix2.preRotate(m12169b());
            c5507a.getClass();
            rectF.bottom += i10;
            rectF.offset(0.0f, -i10);
            int[] iArr = C5507a.f34135i;
            iArr[0] = c5507a.f34144f;
            iArr[1] = c5507a.f34143e;
            iArr[2] = c5507a.f34142d;
            Paint paint = c5507a.f34141c;
            float f13 = rectF.left;
            paint.setShader(new LinearGradient(f13, rectF.top, f13, rectF.bottom, iArr, C5507a.f34136j, Shader.TileMode.CLAMP));
            canvas.save();
            canvas.concat(matrix2);
            canvas.drawRect(rectF, paint);
            canvas.restore();
        }

        /* JADX INFO: renamed from: b */
        public final float m12169b() {
            d dVar = this.f34943c;
            return (float) Math.toDegrees(Math.atan((dVar.f34954c - this.f34945e) / (dVar.f34953b - this.f34944d)));
        }
    }

    /* JADX INFO: renamed from: gd.n$c */
    public static class c extends e {

        /* JADX INFO: renamed from: h */
        public static final RectF f34946h = new RectF();

        /* JADX INFO: renamed from: b */
        @Deprecated
        public float f34947b;

        /* JADX INFO: renamed from: c */
        @Deprecated
        public float f34948c;

        /* JADX INFO: renamed from: d */
        @Deprecated
        public float f34949d;

        /* JADX INFO: renamed from: e */
        @Deprecated
        public float f34950e;

        /* JADX INFO: renamed from: f */
        @Deprecated
        public float f34951f;

        /* JADX INFO: renamed from: g */
        @Deprecated
        public float f34952g;

        public c(float f3, float f10, float f11, float f12) {
            this.f34947b = f3;
            this.f34948c = f10;
            this.f34949d = f11;
            this.f34950e = f12;
        }

        @Override // gd.C5775n.e
        /* JADX INFO: renamed from: a */
        public final void mo12170a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f34955a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f34946h;
            rectF.set(this.f34947b, this.f34948c, this.f34949d, this.f34950e);
            path.arcTo(rectF, this.f34951f, this.f34952g, false);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: gd.n$d */
    public static class d extends e {

        /* JADX INFO: renamed from: b */
        public float f34953b;

        /* JADX INFO: renamed from: c */
        public float f34954c;

        @Override // gd.C5775n.e
        /* JADX INFO: renamed from: a */
        public final void mo12170a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f34955a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f34953b, this.f34954c);
            path.transform(matrix);
        }
    }

    /* JADX INFO: renamed from: gd.n$e */
    public static abstract class e {

        /* JADX INFO: renamed from: a */
        public final Matrix f34955a = new Matrix();

        /* JADX INFO: renamed from: a */
        public abstract void mo12170a(Matrix matrix, Path path);
    }

    /* JADX INFO: renamed from: gd.n$f */
    public static abstract class f {

        /* JADX INFO: renamed from: b */
        public static final Matrix f34956b = new Matrix();

        /* JADX INFO: renamed from: a */
        public final Matrix f34957a = new Matrix();

        /* JADX INFO: renamed from: a */
        public abstract void mo12163a(Matrix matrix, C5507a c5507a, int i10, Canvas canvas);
    }

    public C5775n() {
        m12168e(0.0f, 0.0f, 270.0f, 0.0f);
    }

    /* JADX INFO: renamed from: a */
    public final void m12164a(float f3, float f10, float f11, float f12, float f13, float f14) {
        c cVar = new c(f3, f10, f11, f12);
        cVar.f34951f = f13;
        cVar.f34952g = f14;
        this.f34940g.add(cVar);
        a aVar = new a(cVar);
        float f15 = f13 + f14;
        boolean z10 = f14 < 0.0f;
        if (z10) {
            f13 = (f13 + 180.0f) % 360.0f;
        }
        float f16 = z10 ? (180.0f + f15) % 360.0f : f15;
        m12165b(f13);
        this.f34941h.add(aVar);
        this.f34938e = f16;
        double d10 = f15;
        this.f34936c = (((f11 - f3) / 2.0f) * ((float) Math.cos(Math.toRadians(d10)))) + ((f3 + f11) * 0.5f);
        this.f34937d = (((f12 - f10) / 2.0f) * ((float) Math.sin(Math.toRadians(d10)))) + ((f10 + f12) * 0.5f);
    }

    /* JADX INFO: renamed from: b */
    public final void m12165b(float f3) {
        float f10 = this.f34938e;
        if (f10 == f3) {
            return;
        }
        float f11 = ((f3 - f10) + 360.0f) % 360.0f;
        if (f11 > 180.0f) {
            return;
        }
        float f12 = this.f34936c;
        float f13 = this.f34937d;
        c cVar = new c(f12, f13, f12, f13);
        cVar.f34951f = this.f34938e;
        cVar.f34952g = f11;
        this.f34941h.add(new a(cVar));
        this.f34938e = f3;
    }

    /* JADX INFO: renamed from: c */
    public final void m12166c(Matrix matrix, Path path) {
        ArrayList arrayList = this.f34940g;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((e) arrayList.get(i10)).mo12170a(matrix, path);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m12167d(float f3, float f10) {
        d dVar = new d();
        dVar.f34953b = f3;
        dVar.f34954c = f10;
        this.f34940g.add(dVar);
        b bVar = new b(dVar, this.f34936c, this.f34937d);
        float fM12169b = bVar.m12169b() + 270.0f;
        float fM12169b2 = bVar.m12169b() + 270.0f;
        m12165b(fM12169b);
        this.f34941h.add(bVar);
        this.f34938e = fM12169b2;
        this.f34936c = f3;
        this.f34937d = f10;
    }

    /* JADX INFO: renamed from: e */
    public final void m12168e(float f3, float f10, float f11, float f12) {
        this.f34934a = f3;
        this.f34935b = f10;
        this.f34936c = f3;
        this.f34937d = f10;
        this.f34938e = f11;
        this.f34939f = (f11 + f12) % 360.0f;
        this.f34940g.clear();
        this.f34941h.clear();
    }
}
