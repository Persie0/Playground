package p000;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class xc5 extends i39 implements w94 {

    /* JADX INFO: renamed from: c */
    public final List f68059c;

    /* JADX INFO: renamed from: d */
    public final List f68060d;

    /* JADX INFO: renamed from: e */
    public final long f68061e;

    /* JADX INFO: renamed from: f */
    public final long f68062f;

    /* JADX INFO: renamed from: g */
    public final int f68063g;

    public xc5(List list, List list2, long j, long j2, int i) {
        this.f68059c = list;
        this.f68060d = list2;
        this.f68061e = j;
        this.f68062f = j2;
        this.f68063g = i;
    }

    @Override // p000.w94
    /* JADX INFO: renamed from: a */
    public final Object mo11319a(Object obj, float f) {
        if (obj == null) {
            obj = new pd9(aa1.f411j);
        }
        boolean z = obj instanceof pd9;
        List list = this.f68059c;
        if (z) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((aa1) list.get(i)).getClass();
                arrayList.add(new aa1(((pd9) obj).f55989a));
            }
            obj = new xc5(arrayList, this.f68060d, this.f68061e, this.f68062f, this.f68063g);
        }
        if (!(obj instanceof xc5)) {
            return null;
        }
        xc5 xc5Var = (xc5) obj;
        ArrayList arrayListM3953h0 = bna.m3953h0(list, xc5Var.f68059c, f);
        ArrayList arrayListM3955i0 = bna.m3955i0(this.f68060d, xc5Var.f68060d, f);
        long jM3957j0 = bna.m3957j0(this.f68061e, xc5Var.f68061e, f);
        long jM3957j1 = bna.m3957j0(this.f68062f, xc5Var.f68062f, f);
        if (f >= 0.5f) {
            this = xc5Var;
        }
        return new xc5(arrayListM3953h0, arrayListM3955i0, jM3957j0, jM3957j1, this.f68063g);
    }

    @Override // p000.i39
    /* JADX INFO: renamed from: c */
    public final Shader mo11320c(long j) {
        long j2 = this.f68061e;
        int i = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
            i = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY) {
            i2 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i2);
        long j3 = this.f68062f;
        int i3 = (int) (j3 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i3);
        int i4 = (int) (j3 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i4);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.f68059c;
        List list2 = this.f68060d;
        vz1.m23645o0(list, list2);
        return new LinearGradient(Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits2 & 4294967295L)), vz1.m23606L(list), vz1.m23607M(list2, list), x74.m24343J(this.f68063g));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xc5)) {
            return false;
        }
        xc5 xc5Var = (xc5) obj;
        return fa4.m11650l(this.f68059c, xc5Var.f68059c) && fa4.m11650l(this.f68060d, xc5Var.f68060d) && gq6.m12821b(this.f68061e, xc5Var.f68061e) && gq6.m12821b(this.f68062f, xc5Var.f68062f) && this.f68063g == xc5Var.f68063g;
    }

    public final int hashCode() {
        int iHashCode = this.f68059c.hashCode() * 31;
        List list = this.f68060d;
        return Integer.hashCode(this.f68063g) + ux5.m22981d(this.f68062f, ux5.m22981d(this.f68061e, (iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        String str;
        long j = this.f68061e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) gq6.m12827h(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.f68062f;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) gq6.m12827h(j2)) + ", ";
        }
        StringBuilder sb = new StringBuilder("LinearGradient(colors=");
        sb.append(this.f68059c);
        sb.append(", stops=");
        wq1.m24130z(", ", str, str2, sb, this.f68060d);
        sb.append("tileMode=");
        sb.append((Object) do7.m10520G(this.f68063g));
        sb.append(')');
        return sb.toString();
    }
}
