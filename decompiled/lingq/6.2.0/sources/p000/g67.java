package p000;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes2.dex */
public final class g67 extends k57 {

    /* JADX INFO: renamed from: a */
    public final Path f40269a = new Path();

    /* JADX INFO: renamed from: b */
    public final Matrix f40270b = new Matrix();

    public g67(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ywc.f70612j);
        try {
            String strM17381e = nda.m17381e(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strM17381e == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            m12381b(tzb.m22363c(strM17381e));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // p000.k57
    /* JADX INFO: renamed from: a */
    public final Path mo10646a(float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float fSqrt = (float) Math.sqrt((f6 * f6) + (f5 * f5));
        double dAtan2 = Math.atan2(f6, f5);
        Matrix matrix = this.f40270b;
        matrix.setScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f, f2);
        Path path = new Path();
        this.f40269a.transform(matrix, path);
        return path;
    }

    /* JADX INFO: renamed from: b */
    public final void m12381b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f = fArr[0];
        float f2 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f3 = fArr[0];
        float f4 = fArr[1];
        if (f3 == f && f4 == f2) {
            C3386nv.m17626m("pattern must not end at the starting point");
            return;
        }
        Matrix matrix = this.f40270b;
        matrix.setTranslate(-f3, -f4);
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fSqrt = 1.0f / ((float) Math.sqrt((f6 * f6) + (f5 * f5)));
        matrix.postScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f6, f5)));
        path.transform(matrix, this.f40269a);
    }
}
