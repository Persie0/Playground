package p000;

import android.graphics.RadialGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class eq7 extends i39 implements w94 {

    /* JADX INFO: renamed from: c */
    public final List f37710c;

    /* JADX INFO: renamed from: d */
    public final List f37711d;

    /* JADX INFO: renamed from: e */
    public final long f37712e;

    /* JADX INFO: renamed from: f */
    public final float f37713f;

    public eq7(List list, List list2, long j, float f) {
        this.f37710c = list;
        this.f37711d = list2;
        this.f37712e = j;
        this.f37713f = f;
    }

    @Override // p000.w94
    /* JADX INFO: renamed from: a */
    public final Object mo11319a(Object obj, float f) {
        if (obj == null) {
            obj = new pd9(aa1.f411j);
        }
        boolean z = obj instanceof pd9;
        List list = this.f37710c;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((aa1) list.get(i)).getClass();
                arrayList.add(new aa1(((pd9) obj).f55989a));
            }
            obj = new eq7(arrayList, this.f37711d, this.f37712e, this.f37713f);
        }
        if (!(obj instanceof eq7)) {
            return null;
        }
        eq7 eq7Var = (eq7) obj;
        return new eq7(bna.m3953h0(list, eq7Var.f37710c, f), bna.m3955i0(this.f37711d, eq7Var.f37711d, f), ss5.m21688O(this.f37712e, eq7Var.f37712e, f), AbstractC3423or.m18232Q(this.f37713f, eq7Var.f37713f, f));
    }

    @Override // p000.i39
    /* JADX INFO: renamed from: c */
    public final Shader mo11320c(long j) {
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        long j2 = this.f37712e;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            long jM10538n = do7.m10538n(j);
            fIntBitsToFloat = Float.intBitsToFloat((int) (jM10538n >> 32));
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (jM10538n & 4294967295L));
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
                i2 = (int) (j & 4294967295L);
            }
            fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        float fM24406c = this.f37713f;
        if (fM24406c == Float.POSITIVE_INFINITY) {
            fM24406c = x89.m24406c(j) / 2.0f;
        }
        float f = fM24406c;
        List list = this.f37710c;
        List list2 = this.f37711d;
        vz1.m23645o0(list, list2);
        return new RadialGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), f, vz1.m23606L(list), vz1.m23607M(list2, list), x74.m24343J(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eq7)) {
            return false;
        }
        eq7 eq7Var = (eq7) obj;
        return this.f37710c.equals(eq7Var.f37710c) && fa4.m11650l(this.f37711d, eq7Var.f37711d) && gq6.m12821b(this.f37712e, eq7Var.f37712e) && this.f37713f == eq7Var.f37713f;
    }

    public final int hashCode() {
        int iHashCode = this.f37710c.hashCode() * 31;
        List list = this.f37711d;
        return Integer.hashCode(0) + wq1.m24105a(ux5.m22981d(this.f37712e, (iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31), this.f37713f, 31);
    }

    public final String toString() {
        String str;
        long j = this.f37712e;
        String str2 = "";
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) gq6.m12827h(j)) + ", ";
        } else {
            str = "";
        }
        float f = this.f37713f;
        if ((Float.floatToRawIntBits(f) & Integer.MAX_VALUE) < 2139095040) {
            str2 = "radius=" + f + ", ";
        }
        StringBuilder sb = new StringBuilder("RadialGradient(colors=");
        sb.append(this.f37710c);
        sb.append(", stops=");
        wq1.m24130z(", ", str, str2, sb, this.f37711d);
        sb.append("tileMode=");
        sb.append((Object) do7.m10520G(0));
        sb.append(')');
        return sb.toString();
    }
}
