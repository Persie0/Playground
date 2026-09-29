package gd;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import dm.C5206f;
import java.util.ArrayList;
import java.util.BitSet;

/* JADX INFO: renamed from: gd.l */
/* JADX INFO: loaded from: classes.dex */
public final class C5773l {

    /* JADX INFO: renamed from: a */
    public final C5775n[] f34919a = new C5775n[4];

    /* JADX INFO: renamed from: b */
    public final Matrix[] f34920b = new Matrix[4];

    /* JADX INFO: renamed from: c */
    public final Matrix[] f34921c = new Matrix[4];

    /* JADX INFO: renamed from: d */
    public final PointF f34922d = new PointF();

    /* JADX INFO: renamed from: e */
    public final Path f34923e = new Path();

    /* JADX INFO: renamed from: f */
    public final Path f34924f = new Path();

    /* JADX INFO: renamed from: g */
    public final C5775n f34925g = new C5775n();

    /* JADX INFO: renamed from: h */
    public final float[] f34926h = new float[2];

    /* JADX INFO: renamed from: i */
    public final float[] f34927i = new float[2];

    /* JADX INFO: renamed from: j */
    public final Path f34928j = new Path();

    /* JADX INFO: renamed from: k */
    public final Path f34929k = new Path();

    /* JADX INFO: renamed from: l */
    public final boolean f34930l = true;

    /* JADX INFO: renamed from: gd.l$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static final C5773l f34931a = new C5773l();
    }

    public C5773l() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f34919a[i10] = new C5775n();
            this.f34920b[i10] = new Matrix();
            this.f34921c[i10] = new Matrix();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m12161a(C5772k c5772k, float f3, RectF rectF, C5768g.a aVar, Path path) {
        int i10;
        Matrix[] matrixArr;
        float[] fArr;
        Matrix[] matrixArr2;
        C5775n[] c5775nArr;
        C5766e c5766e;
        Path path2;
        char c10;
        InterfaceC5764c interfaceC5764c;
        C5206f c5206f;
        C5773l c5773l = this;
        C5772k c5772k2 = c5772k;
        Path path3 = path;
        path.rewind();
        Path path4 = c5773l.f34923e;
        path4.rewind();
        Path path5 = c5773l.f34924f;
        path5.rewind();
        path5.addRect(rectF, Path.Direction.CW);
        int i11 = 0;
        while (true) {
            i10 = 4;
            matrixArr = c5773l.f34921c;
            fArr = c5773l.f34926h;
            matrixArr2 = c5773l.f34920b;
            c5775nArr = c5773l.f34919a;
            if (i11 >= 4) {
                break;
            }
            if (i11 == 1) {
                interfaceC5764c = c5772k2.f34901g;
            } else if (i11 != 2) {
                interfaceC5764c = i11 != 3 ? c5772k2.f34900f : c5772k2.f34899e;
            } else {
                interfaceC5764c = c5772k2.f34902h;
            }
            if (i11 == 1) {
                c5206f = c5772k2.f34897c;
            } else if (i11 != 2) {
                c5206f = i11 != 3 ? c5772k2.f34896b : c5772k2.f34895a;
            } else {
                c5206f = c5772k2.f34898d;
            }
            C5775n c5775n = c5775nArr[i11];
            c5206f.getClass();
            c5206f.mo11052R0(f3, interfaceC5764c.mo12127a(rectF), c5775n);
            int i12 = i11 + 1;
            float f10 = (i12 % 4) * 90;
            matrixArr2[i11].reset();
            PointF pointF = c5773l.f34922d;
            if (i11 == 1) {
                pointF.set(rectF.right, rectF.bottom);
            } else if (i11 == 2) {
                pointF.set(rectF.left, rectF.bottom);
            } else if (i11 != 3) {
                pointF.set(rectF.right, rectF.top);
            } else {
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i11].setTranslate(pointF.x, pointF.y);
            matrixArr2[i11].preRotate(f10);
            C5775n c5775n2 = c5775nArr[i11];
            fArr[0] = c5775n2.f34936c;
            fArr[1] = c5775n2.f34937d;
            matrixArr2[i11].mapPoints(fArr);
            matrixArr[i11].reset();
            matrixArr[i11].setTranslate(fArr[0], fArr[1]);
            matrixArr[i11].preRotate(f10);
            i11 = i12;
            path4 = path4;
        }
        Path path6 = path4;
        char c11 = 1;
        char c12 = 0;
        int i13 = 0;
        while (i13 < i10) {
            C5775n c5775n3 = c5775nArr[i13];
            fArr[c12] = c5775n3.f34934a;
            fArr[c11] = c5775n3.f34935b;
            matrixArr2[i13].mapPoints(fArr);
            if (i13 == 0) {
                path3.moveTo(fArr[c12], fArr[c11]);
            } else {
                path3.lineTo(fArr[c12], fArr[c11]);
            }
            c5775nArr[i13].m12166c(matrixArr2[i13], path3);
            if (aVar != 0) {
                C5775n c5775n4 = c5775nArr[i13];
                Matrix matrix = matrixArr2[i13];
                C5768g c5768g = C5768g.this;
                BitSet bitSet = c5768g.f34860d;
                c5775n4.getClass();
                bitSet.set(i13, false);
                c5775n4.m12165b(c5775n4.f34939f);
                c5768g.f34858b[i13] = new C5774m(new ArrayList(c5775n4.f34941h), new Matrix(matrix));
            }
            int i14 = i13 + 1;
            int i15 = i14 % 4;
            C5775n c5775n5 = c5775nArr[i13];
            fArr[0] = c5775n5.f34936c;
            fArr[1] = c5775n5.f34937d;
            matrixArr2[i13].mapPoints(fArr);
            C5775n c5775n6 = c5775nArr[i15];
            float f11 = c5775n6.f34934a;
            float[] fArr2 = c5773l.f34927i;
            fArr2[0] = f11;
            fArr2[1] = c5775n6.f34935b;
            matrixArr2[i15].mapPoints(fArr2);
            float fMax = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C5775n c5775n7 = c5775nArr[i13];
            fArr[0] = c5775n7.f34936c;
            fArr[1] = c5775n7.f34937d;
            matrixArr2[i13].mapPoints(fArr);
            float fAbs = (i13 == 1 || i13 == 3) ? Math.abs(rectF.centerX() - fArr[0]) : Math.abs(rectF.centerY() - fArr[1]);
            C5775n c5775n8 = c5773l.f34925g;
            c5775n8.m12168e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i13 == 1) {
                c5766e = c5772k2.f34905k;
            } else if (i13 != 2) {
                c5766e = i13 != 3 ? c5772k2.f34904j : c5772k2.f34903i;
            } else {
                c5766e = c5772k2.f34906l;
            }
            c5766e.mo12129c(fMax, fAbs, f3, c5775n8);
            Path path7 = c5773l.f34928j;
            path7.reset();
            c5775n8.m12166c(matrixArr[i13], path7);
            if (c5773l.f34930l && (c5766e.mo12128b() || c5773l.m12162b(path7, i13) || c5773l.m12162b(path7, i15))) {
                path7.op(path7, path5, Path.Op.DIFFERENCE);
                fArr[0] = c5775n8.f34934a;
                fArr[1] = c5775n8.f34935b;
                matrixArr[i13].mapPoints(fArr);
                path2 = path6;
                path2.moveTo(fArr[0], fArr[1]);
                c5775n8.m12166c(matrixArr[i13], path2);
                path3 = path;
            } else {
                path2 = path6;
                path3 = path;
                c5775n8.m12166c(matrixArr[i13], path3);
            }
            if (aVar != 0) {
                Matrix matrix2 = matrixArr[i13];
                C5768g c5768g2 = C5768g.this;
                c10 = 0;
                c5768g2.f34860d.set(i13 + 4, false);
                c5775n8.m12165b(c5775n8.f34939f);
                c5768g2.f34859c[i13] = new C5774m(new ArrayList(c5775n8.f34941h), new Matrix(matrix2));
            } else {
                c10 = 0;
            }
            c5773l = this;
            c12 = c10;
            path6 = path2;
            i13 = i14;
            c11 = 1;
            i10 = 4;
            c5772k2 = c5772k;
        }
        Path path8 = path6;
        path.close();
        path8.close();
        if (path8.isEmpty()) {
            return;
        }
        path3.op(path8, Path.Op.UNION);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m12162b(Path path, int i10) {
        Path path2 = this.f34929k;
        path2.reset();
        this.f34919a[i10].m12166c(this.f34920b[i10], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
