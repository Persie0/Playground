package p406u4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
import p286o2.C7911k;
import p312p2.C8172d;

/* JADX INFO: renamed from: u4.z */
/* JADX INFO: loaded from: classes.dex */
public final class C9448z extends AbstractC9446y {

    /* JADX INFO: renamed from: a */
    public final Path f48444a = new Path();

    /* JADX INFO: renamed from: b */
    public final Matrix f48445b = new Matrix();

    @SuppressLint({"RestrictedApi"})
    public C9448z(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C9407e0.f48269j);
        try {
            String strM15690h = C7911k.m15690h(typedArrayObtainStyledAttributes, (XmlPullParser) attributeSet, "patternPathData", 0);
            if (strM15690h == null) {
                throw new RuntimeException("pathData must be supplied for patternPathMotion");
            }
            m17845b(C8172d.m16226d(strM15690h));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Override // p406u4.AbstractC9446y
    /* JADX INFO: renamed from: a */
    public final Path mo17757a(float f3, float f10, float f11, float f12) {
        float f13 = f11 - f3;
        float f14 = f12 - f10;
        float fSqrt = (float) Math.sqrt((f14 * f14) + (f13 * f13));
        double dAtan2 = Math.atan2(f14, f13);
        Matrix matrix = this.f48445b;
        matrix.setScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(dAtan2));
        matrix.postTranslate(f3, f10);
        Path path = new Path();
        this.f48444a.transform(matrix, path);
        return path;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final void m17845b(Path path) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float[] fArr = new float[2];
        pathMeasure.getPosTan(pathMeasure.getLength(), fArr, null);
        float f3 = fArr[0];
        float f10 = fArr[1];
        pathMeasure.getPosTan(0.0f, fArr, null);
        float f11 = fArr[0];
        float f12 = fArr[1];
        if (f11 == f3 && f12 == f10) {
            throw new IllegalArgumentException("pattern must not end at the starting point");
        }
        Matrix matrix = this.f48445b;
        matrix.setTranslate(-f11, -f12);
        float f13 = f3 - f11;
        float f14 = f10 - f12;
        float fSqrt = 1.0f / ((float) Math.sqrt((f14 * f14) + (f13 * f13)));
        matrix.postScale(fSqrt, fSqrt);
        matrix.postRotate((float) Math.toDegrees(-Math.atan2(f14, f13)));
        path.transform(matrix, this.f48444a);
    }
}
