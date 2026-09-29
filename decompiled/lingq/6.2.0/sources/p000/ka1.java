package p000;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ka1 extends fa1 {

    /* JADX INFO: renamed from: b */
    public float[] f46931b;

    /* JADX INFO: renamed from: a */
    public final float[] m15030a() {
        float[] fArr = this.f46931b;
        if (fArr != null) {
            return fArr;
        }
        ColorFilter colorFilter = this.f38699a;
        if (!(colorFilter instanceof ColorMatrixColorFilter)) {
            C3386nv.m17626m("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
        float[] array = colorMatrix.getArray();
        this.f46931b = array;
        return array;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ka1) && Arrays.equals(m15030a(), ((ka1) obj).m15030a());
    }

    public final int hashCode() {
        float[] fArr = this.f46931b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f46931b;
        if (fArr == null) {
            str = "null";
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb.append((Object) str);
        sb.append(')');
        return sb.toString();
    }
}
