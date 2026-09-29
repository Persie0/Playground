package p000;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class bp3 extends lj4 {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f8789i;

    /* JADX INFO: renamed from: j */
    public final Object f8790j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bp3(int i, List list) {
        super(list);
        this.f8789i = i;
        switch (i) {
            case 1:
                super(list);
                this.f8790j = new PointF();
                break;
            case 2:
                super(list);
                this.f8790j = new nm8();
                break;
            default:
                int iMax = 0;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    ap3 ap3Var = (ap3) ((kj4) list.get(i2)).f47378b;
                    if (ap3Var != null) {
                        iMax = Math.max(iMax, ap3Var.f7322b.length);
                    }
                }
                this.f8790j = new ap3(new float[iMax], new int[iMax]);
                break;
        }
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: g */
    public final Object mo3293g(kj4 kj4Var, float f) {
        Object obj;
        float f2;
        int i = this.f8789i;
        Object obj2 = this.f8790j;
        switch (i) {
            case 0:
                ap3 ap3Var = (ap3) obj2;
                ap3 ap3Var2 = (ap3) kj4Var.f47378b;
                ap3 ap3Var3 = (ap3) kj4Var.f47379c;
                int[] iArr = ap3Var.f7322b;
                float[] fArr = ap3Var.f7321a;
                boolean zEquals = ap3Var2.equals(ap3Var3);
                int[] iArr2 = ap3Var2.f7322b;
                if (zEquals || f <= 0.0f) {
                    ap3Var.m2966a(ap3Var2);
                } else if (f >= 1.0f) {
                    ap3Var.m2966a(ap3Var3);
                } else {
                    int length = iArr2.length;
                    int[] iArr3 = ap3Var3.f7322b;
                    if (length != iArr3.length) {
                        StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
                        sb.append(iArr2.length);
                        sb.append(" vs ");
                        C3386nv.m17626m(wq1.m24123s(sb, iArr3.length, ")"));
                        return null;
                    }
                    for (int i2 = 0; i2 < iArr2.length; i2++) {
                        fArr[i2] = f06.m11425f(ap3Var2.f7321a[i2], ap3Var3.f7321a[i2], f);
                        iArr[i2] = ked.m15165c(iArr2[i2], f, iArr3[i2]);
                    }
                    for (int length2 = iArr2.length; length2 < fArr.length; length2++) {
                        fArr[length2] = fArr[iArr2.length - 1];
                        iArr[length2] = iArr[iArr2.length - 1];
                    }
                }
                return ap3Var;
            case 1:
                return m4029m(kj4Var, f, f, f);
            default:
                nm8 nm8Var = (nm8) obj2;
                Object obj3 = kj4Var.f47378b;
                if (obj3 == null || (obj = kj4Var.f47379c) == null) {
                    C3386nv.m17633t("Missing values for keyframe.");
                    return null;
                }
                nm8 nm8Var2 = (nm8) obj3;
                nm8 nm8Var3 = (nm8) obj;
                p33 p33Var = this.f50800e;
                if (p33Var != null) {
                    f2 = f;
                    nm8 nm8Var4 = (nm8) p33Var.m18870N(kj4Var.f47383g, kj4Var.f47384h.floatValue(), nm8Var2, nm8Var3, f2, m16691e(), this.f50799d);
                    if (nm8Var4 != null) {
                        return nm8Var4;
                    }
                } else {
                    f2 = f;
                }
                float fM11425f = f06.m11425f(nm8Var2.f52968a, nm8Var3.f52968a, f2);
                float fM11425f2 = f06.m11425f(nm8Var2.f52969b, nm8Var3.f52969b, f2);
                nm8Var.f52968a = fM11425f;
                nm8Var.f52969b = fM11425f2;
                return nm8Var;
        }
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: h */
    public /* bridge */ /* synthetic */ Object mo4028h(kj4 kj4Var, float f, float f2, float f3) {
        switch (this.f8789i) {
            case 1:
                return m4029m(kj4Var, f, f2, f3);
            default:
                return super.mo4028h(kj4Var, f, f2, f3);
        }
    }

    /* JADX INFO: renamed from: m */
    public PointF m4029m(kj4 kj4Var, float f, float f2, float f3) {
        Object obj;
        PointF pointF;
        PointF pointF2 = (PointF) this.f8790j;
        Object obj2 = kj4Var.f47378b;
        if (obj2 == null || (obj = kj4Var.f47379c) == null) {
            C3386nv.m17633t("Missing values for keyframe.");
            return null;
        }
        PointF pointF3 = (PointF) obj2;
        PointF pointF4 = (PointF) obj;
        p33 p33Var = this.f50800e;
        if (p33Var != null && (pointF = (PointF) p33Var.m18870N(kj4Var.f47383g, kj4Var.f47384h.floatValue(), pointF3, pointF4, f, m16691e(), this.f50799d)) != null) {
            return pointF;
        }
        float f4 = pointF3.x;
        float fM17726a = AbstractC3393o1.m17726a(pointF4.x, f4, f2, f4);
        float f5 = pointF3.y;
        pointF2.set(fM17726a, AbstractC3393o1.m17726a(pointF4.y, f5, f3, f5));
        return pointF2;
    }
}
