package p000;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import coil.size.Scale;
import kotlin.Pair;

/* JADX INFO: loaded from: classes2.dex */
public final class zi8 implements l9a {

    /* JADX INFO: renamed from: a */
    public final float f71616a;

    /* JADX INFO: renamed from: b */
    public final float f71617b;

    /* JADX INFO: renamed from: c */
    public final float f71618c;

    /* JADX INFO: renamed from: d */
    public final float f71619d;

    /* JADX INFO: renamed from: e */
    public final String f71620e;

    public zi8(float f) {
        this.f71616a = f;
        this.f71617b = f;
        this.f71618c = f;
        this.f71619d = f;
        if (f < 0.0f || f < 0.0f || f < 0.0f || f < 0.0f) {
            C3386nv.m17626m("All radii must be >= 0.");
            throw null;
        }
        this.f71620e = zi8.class.getName() + '-' + f + ',' + f + ',' + f + ',' + f;
    }

    @Override // p000.l9a
    /* JADX INFO: renamed from: a */
    public final Bitmap mo9995a(Bitmap bitmap, w89 w89Var) {
        Pair pair;
        Paint paint = new Paint(3);
        if (fa4.m11650l(w89Var, w89.f66530c)) {
            pair = new Pair(Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()));
        } else {
            pvc pvcVar = w89Var.f66531a;
            pvc pvcVar2 = w89Var.f66532b;
            if ((pvcVar instanceof lg2) && (pvcVar2 instanceof lg2)) {
                pair = new Pair(Integer.valueOf(((lg2) pvcVar).f49621n), Integer.valueOf(((lg2) pvcVar2).f49621n));
            } else {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                pvc pvcVar3 = w89Var.f66531a;
                double dM14098l = AbstractC3122is.m14098l(width, height, pvcVar3 instanceof lg2 ? ((lg2) pvcVar3).f49621n : Integer.MIN_VALUE, pvcVar2 instanceof lg2 ? ((lg2) pvcVar2).f49621n : Integer.MIN_VALUE, Scale.FILL);
                pair = new Pair(Integer.valueOf(ss5.m21692S(((double) bitmap.getWidth()) * dM14098l)), Integer.valueOf(ss5.m21692S(dM14098l * ((double) bitmap.getHeight()))));
            }
        }
        int iIntValue = ((Number) pair.f47623a).intValue();
        int iIntValue2 = ((Number) pair.f47624b).intValue();
        Bitmap.Config config = bitmap.getConfig();
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, iIntValue2, config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        Matrix matrix = new Matrix();
        float fM14098l = (float) AbstractC3122is.m14098l(bitmap.getWidth(), bitmap.getHeight(), iIntValue, iIntValue2, Scale.FILL);
        matrix.setTranslate((iIntValue - (bitmap.getWidth() * fM14098l)) / 2.0f, (iIntValue2 - (bitmap.getHeight() * fM14098l)) / 2.0f);
        matrix.preScale(fM14098l, fM14098l);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        float f = this.f71616a;
        float f2 = this.f71617b;
        float f3 = this.f71619d;
        float f4 = this.f71618c;
        float[] fArr = {f, f, f2, f2, f3, f3, f4, f4};
        RectF rectF = new RectF(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        Path path = new Path();
        path.addRoundRect(rectF, fArr, Path.Direction.CW);
        canvas.drawPath(path, paint);
        return bitmapCreateBitmap;
    }

    @Override // p000.l9a
    /* JADX INFO: renamed from: b */
    public final String mo9996b() {
        return this.f71620e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi8)) {
            return false;
        }
        zi8 zi8Var = (zi8) obj;
        return this.f71616a == zi8Var.f71616a && this.f71617b == zi8Var.f71617b && this.f71618c == zi8Var.f71618c && this.f71619d == zi8Var.f71619d;
    }

    public final int hashCode() {
        return Float.hashCode(this.f71619d) + wq1.m24105a(wq1.m24105a(Float.hashCode(this.f71616a) * 31, this.f71617b, 31), this.f71618c, 31);
    }
}
