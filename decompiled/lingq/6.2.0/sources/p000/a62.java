package p000;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a62 {

    /* JADX INFO: renamed from: a */
    public final List f277a;

    /* JADX INFO: renamed from: b */
    public final float[] f278b;

    /* JADX INFO: renamed from: c */
    public final int f279c;

    public a62(List list, float[] fArr) {
        this.f277a = list;
        this.f278b = fArr;
        if (list.size() != fArr.length) {
            l54.m15814a("DraggableAnchors were constructed with inconsistent key-value sizes. Keys: " + list + " | Anchors: " + AbstractC3550rv.m20849q0(fArr));
        }
        this.f279c = fArr.length;
    }

    /* JADX INFO: renamed from: a */
    public final Object m128a(float f) {
        float[] fArr = this.f278b;
        int length = fArr.length;
        float f2 = Float.POSITIVE_INFINITY;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            int i4 = i3 + 1;
            float fAbs = Math.abs(f - fArr[i]);
            if (fAbs <= f2) {
                i2 = i3;
                f2 = fAbs;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.f277a.get(i2);
    }

    /* JADX INFO: renamed from: b */
    public final Object m129b(float f, boolean z) {
        float[] fArr = this.f278b;
        int length = fArr.length;
        int i = 0;
        int i2 = -1;
        float f2 = Float.POSITIVE_INFINITY;
        int i3 = 0;
        while (i < length) {
            float f3 = fArr[i];
            int i4 = i3 + 1;
            float f4 = z ? f3 - f : f - f3;
            if (f4 < 0.0f) {
                f4 = Float.POSITIVE_INFINITY;
            }
            if (f4 <= f2) {
                i2 = i3;
                f2 = f4;
            }
            i++;
            i3 = i4;
        }
        if (i2 == -1) {
            return null;
        }
        return this.f277a.get(i2);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m130c(Object obj) {
        return this.f277a.indexOf(obj) != -1;
    }

    /* JADX INFO: renamed from: d */
    public final float m131d() {
        float[] fArr = this.f278b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMax = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMax = Math.max(fMax, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fMax;
    }

    /* JADX INFO: renamed from: e */
    public final float m132e() {
        float[] fArr = this.f278b;
        if (fArr.length == 0) {
            return Float.NaN;
        }
        float fMin = fArr[0];
        int i = 1;
        int length = fArr.length - 1;
        if (1 <= length) {
            while (true) {
                fMin = Math.min(fMin, fArr[i]);
                if (i == length) {
                    break;
                }
                i++;
            }
        }
        return fMin;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a62)) {
            return false;
        }
        a62 a62Var = (a62) obj;
        return fa4.m11650l(this.f277a, a62Var.f277a) && Arrays.equals(this.f278b, a62Var.f278b) && this.f279c == a62Var.f279c;
    }

    /* JADX INFO: renamed from: f */
    public final float m133f(Object obj) {
        int iIndexOf = this.f277a.indexOf(obj);
        if (iIndexOf < 0) {
            return Float.NaN;
        }
        float[] fArr = this.f278b;
        if (iIndexOf < fArr.length) {
            return fArr[iIndexOf];
        }
        return Float.NaN;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f278b) + (this.f277a.hashCode() * 31)) * 31) + this.f279c;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    public final String toString() {
        float f;
        StringBuilder sb = new StringBuilder("DraggableAnchors(anchors={");
        int i = 0;
        while (true) {
            int i2 = this.f279c;
            if (i >= i2) {
                sb.append("})");
                return sb.toString();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(u91.m22592J0(i, this.f277a));
            sb2.append('=');
            if (i >= 0) {
                float[] fArr = this.f278b;
                if (i < fArr.length) {
                    f = fArr[i];
                } else {
                    f = Float.NaN;
                }
            } else {
                f = Float.NaN;
            }
            sb2.append(f);
            sb.append(sb2.toString());
            if (i < i2 - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
