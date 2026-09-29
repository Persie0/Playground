package p000;

import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oo9 extends i39 implements w94 {

    /* JADX INFO: renamed from: c */
    public final long f54657c;

    /* JADX INFO: renamed from: d */
    public final List f54658d;

    /* JADX INFO: renamed from: e */
    public final List f54659e;

    public oo9(long j, List list, List list2) {
        this.f54657c = j;
        this.f54658d = list;
        this.f54659e = list2;
    }

    @Override // p000.w94
    /* JADX INFO: renamed from: a */
    public final Object mo11319a(Object obj, float f) {
        if (obj == null) {
            obj = new pd9(aa1.f411j);
        }
        boolean z = obj instanceof pd9;
        List list = this.f54659e;
        long j = this.f54657c;
        List list2 = this.f54658d;
        if (z) {
            ArrayList arrayList = new ArrayList(list2.size());
            int size = list2.size();
            for (int i = 0; i < size; i++) {
                ((aa1) list2.get(i)).getClass();
                arrayList.add(new aa1(((pd9) obj).f55989a));
            }
            obj = new oo9(j, arrayList, list);
        }
        if (!(obj instanceof oo9)) {
            return null;
        }
        oo9 oo9Var = (oo9) obj;
        return new oo9(ss5.m21688O(j, oo9Var.f54657c, f), bna.m3953h0(list2, oo9Var.f54658d, f), bna.m3955i0(list, oo9Var.f54659e, f));
    }

    @Override // p000.i39
    /* JADX INFO: renamed from: c */
    public final Shader mo11320c(long j) {
        long jFloatToRawIntBits;
        long j2 = this.f54657c;
        if ((9223372034707292159L & j2) == 9205357640488583168L) {
            jFloatToRawIntBits = do7.m10538n(j);
        } else {
            int i = (int) (j2 >> 32);
            if (Float.intBitsToFloat(i) == Float.POSITIVE_INFINITY) {
                i = (int) (j >> 32);
            }
            float fIntBitsToFloat = Float.intBitsToFloat(i);
            int i2 = (int) (j2 & 4294967295L);
            float fIntBitsToFloat2 = Float.intBitsToFloat(i2) == Float.POSITIVE_INFINITY ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat(i2);
            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32);
        }
        return eh0.m11126f(jFloatToRawIntBits, this.f54658d, this.f54659e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo9)) {
            return false;
        }
        oo9 oo9Var = (oo9) obj;
        return gq6.m12821b(this.f54657c, oo9Var.f54657c) && this.f54658d.equals(oo9Var.f54658d) && fa4.m11650l(this.f54659e, oo9Var.f54659e);
    }

    public final int hashCode() {
        int iM22979b = ux5.m22979b(Long.hashCode(this.f54657c) * 31, 31, this.f54658d);
        List list = this.f54659e;
        return iM22979b + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        String str;
        long j = this.f54657c;
        if ((9223372034707292159L & j) != 9205357640488583168L) {
            str = "center=" + ((Object) gq6.m12827h(j)) + ", ";
        } else {
            str = "";
        }
        StringBuilder sbM17742q = AbstractC3393o1.m17742q("SweepGradient(", str, "colors=");
        sbM17742q.append(this.f54658d);
        sbM17742q.append(", stops=");
        sbM17742q.append(this.f54659e);
        sbM17742q.append(')');
        return sbM17742q.toString();
    }
}
