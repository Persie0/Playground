package p000;

import com.lingq.core.p012ui.chart.AbstractC1917a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ic5 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f43926a;

    /* JADX INFO: renamed from: b */
    public final long f43927b;

    /* JADX INFO: renamed from: c */
    public final long f43928c;

    /* JADX INFO: renamed from: d */
    public final long f43929d;

    /* JADX INFO: renamed from: e */
    public final float f43930e;

    /* JADX INFO: renamed from: f */
    public final boolean f43931f;

    /* JADX INFO: renamed from: g */
    public final vi3 f43932g;

    /* JADX INFO: renamed from: h */
    public final List f43933h;

    /* JADX WARN: Multi-variable type inference failed */
    public ic5(ArrayList arrayList, long j, long j2, long j3, vi3 vi3Var, int i) {
        Float fValueOf;
        float f = (i & 16) != 0 ? 4.0f : 8.0f;
        boolean z = (i & 64) == 0;
        Float fValueOf2 = null;
        vi3Var = (i & 128) != 0 ? null : vi3Var;
        this.f43926a = arrayList;
        this.f43927b = j;
        this.f43928c = j2;
        this.f43929d = j3;
        this.f43930e = f;
        this.f43931f = z;
        this.f43932g = vi3Var;
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            float fMax = ((lc5) it.next()).f49474c;
            while (it.hasNext()) {
                fMax = Math.max(fMax, ((lc5) it.next()).f49474c);
            }
            fValueOf = Float.valueOf(fMax);
        } else {
            fValueOf = null;
        }
        float fM8796b = AbstractC1917a.m8796b(fValueOf != null ? fValueOf.floatValue() : 0.0f);
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            float fMin = ((lc5) it2.next()).f49474c;
            while (it2.hasNext()) {
                fMin = Math.min(fMin, ((lc5) it2.next()).f49474c);
            }
            fValueOf2 = Float.valueOf(fMin);
        }
        float fMin2 = Math.min(0.0f, fValueOf2 != null ? fValueOf2.floatValue() : 0.0f);
        vi3Var = vi3Var == null ? new ry4(13) : vi3Var;
        this.f43933h = vz1.m23605K(vi3Var.invoke(Float.valueOf(fM8796b)), vi3Var.invoke(Float.valueOf((fM8796b - Math.abs(fMin2)) / 2.0f)), vi3Var.invoke(Float.valueOf(fMin2)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ic5)) {
            return false;
        }
        ic5 ic5Var = (ic5) obj;
        return this.f43926a.equals(ic5Var.f43926a) && aa1.m199c(this.f43927b, ic5Var.f43927b) && aa1.m199c(this.f43928c, ic5Var.f43928c) && aa1.m199c(this.f43929d, ic5Var.f43929d) && Float.compare(this.f43930e, ic5Var.f43930e) == 0 && Float.compare(12.0f, 12.0f) == 0 && this.f43931f == ic5Var.f43931f && fa4.m11650l(this.f43932g, ic5Var.f43932g);
    }

    public final int hashCode() {
        int iHashCode = this.f43926a.hashCode() * 31;
        int i = aa1.f413l;
        int iM12428e = g9a.m12428e(wq1.m24105a(wq1.m24105a(ux5.m22981d(this.f43929d, ux5.m22981d(this.f43928c, ux5.m22981d(this.f43927b, iHashCode, 31), 31), 31), this.f43930e, 31), 12.0f, 31), 31, this.f43931f);
        vi3 vi3Var = this.f43932g;
        return iM12428e + (vi3Var == null ? 0 : vi3Var.hashCode());
    }

    public final String toString() {
        String strM205i = aa1.m205i(this.f43927b);
        String strM205i2 = aa1.m205i(this.f43928c);
        String strM205i3 = aa1.m205i(this.f43929d);
        StringBuilder sb = new StringBuilder("LineChartData(data=");
        sb.append(this.f43926a);
        sb.append(", lineColor=");
        sb.append(strM205i);
        sb.append(", selectionColor=");
        AbstractC3393o1.m17725C(sb, strM205i2, ", textColor=", strM205i3, ", lineWidth=");
        sb.append(this.f43930e);
        sb.append(", circleRadius=12.0, showSelectedValue=");
        sb.append(this.f43931f);
        sb.append(", yAxisLabelFormatter=");
        sb.append(this.f43932g);
        sb.append(")");
        return sb.toString();
    }
}
