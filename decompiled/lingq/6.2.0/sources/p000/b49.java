package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b49 extends m90 {

    /* JADX INFO: renamed from: i */
    public final u39 f7934i;

    /* JADX INFO: renamed from: j */
    public final Path f7935j;

    /* JADX INFO: renamed from: k */
    public Path f7936k;

    /* JADX INFO: renamed from: l */
    public Path f7937l;

    /* JADX INFO: renamed from: m */
    public ArrayList f7938m;

    public b49(List list) {
        super(list);
        this.f7934i = new u39();
        this.f7935j = new Path();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x016f  */
    @Override // p000.m90
    /* JADX INFO: renamed from: g */
    public final Object mo3293g(kj4 kj4Var, float f) {
        u39 u39Var;
        u39 u39Var2;
        int i;
        int i2;
        u39 u39Var3;
        u39 u39Var4 = (u39) kj4Var.f47378b;
        u39 u39Var5 = (u39) kj4Var.f47379c;
        u39 u39Var6 = u39Var5 == null ? u39Var4 : u39Var5;
        u39 u39Var7 = this.f7934i;
        ArrayList arrayList = u39Var7.f63361a;
        if (u39Var7.f63362b == null) {
            u39Var7.f63362b = new PointF();
        }
        boolean z = u39Var4.f63363c;
        ArrayList arrayList2 = u39Var4.f63361a;
        boolean z2 = true;
        u39Var7.f63363c = z || u39Var6.f63363c;
        int size = arrayList2.size();
        ArrayList arrayList3 = u39Var6.f63361a;
        if (size != arrayList3.size()) {
            tj5.m22151c("Curves must have the same number of control points. Shape 1: " + arrayList2.size() + "\tShape 2: " + arrayList3.size());
        }
        int iMin = Math.min(arrayList2.size(), arrayList3.size());
        if (arrayList.size() < iMin) {
            for (int size2 = arrayList.size(); size2 < iMin; size2++) {
                arrayList.add(new as1());
            }
        } else if (arrayList.size() > iMin) {
            for (int size3 = arrayList.size() - 1; size3 >= iMin; size3--) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        PointF pointF = u39Var4.f63362b;
        PointF pointF2 = u39Var6.f63362b;
        u39Var7.m22436a(f06.m11425f(pointF.x, pointF2.x, f), f06.m11425f(pointF.y, pointF2.y, f));
        int size4 = arrayList.size() - 1;
        while (size4 >= 0) {
            as1 as1Var = (as1) arrayList2.get(size4);
            as1 as1Var2 = (as1) arrayList3.get(size4);
            PointF pointF3 = as1Var.f7414a;
            PointF pointF4 = as1Var.f7415b;
            PointF pointF5 = as1Var.f7416c;
            boolean z3 = z2;
            PointF pointF6 = as1Var2.f7414a;
            PointF pointF7 = as1Var2.f7415b;
            PointF pointF8 = as1Var2.f7416c;
            ((as1) arrayList.get(size4)).f7414a.set(f06.m11425f(pointF3.x, pointF6.x, f), f06.m11425f(pointF3.y, pointF6.y, f));
            ((as1) arrayList.get(size4)).f7415b.set(f06.m11425f(pointF4.x, pointF7.x, f), f06.m11425f(pointF4.y, pointF7.y, f));
            ((as1) arrayList.get(size4)).f7416c.set(f06.m11425f(pointF5.x, pointF8.x, f), f06.m11425f(pointF5.y, pointF8.y, f));
            size4--;
            z2 = z3;
            arrayList2 = arrayList2;
            u39Var7 = u39Var7;
            arrayList3 = arrayList3;
        }
        u39 u39Var8 = u39Var7;
        boolean z4 = z2;
        ArrayList arrayList4 = this.f7938m;
        if (arrayList4 != null) {
            int size5 = arrayList4.size() - 1;
            u39Var = u39Var8;
            while (true) {
                ArrayList arrayList5 = u39Var.f63361a;
                if (size5 < 0) {
                    break;
                }
                xi8 xi8Var = (xi8) this.f7938m.get(size5);
                xi8Var.getClass();
                if (arrayList5.size() <= 2) {
                    i = size5;
                } else {
                    float fFloatValue = ((Float) xi8Var.f68260b.mo16692f()).floatValue();
                    if (fFloatValue == 0.0f) {
                        i = size5;
                    } else {
                        boolean z5 = u39Var.f63363c;
                        int size6 = arrayList5.size() - 1;
                        int i3 = 0;
                        while (size6 >= 0) {
                            as1 as1Var3 = (as1) arrayList5.get(size6);
                            as1 as1Var4 = (as1) arrayList5.get(xi8.m24526c(size6 - 1, arrayList5.size()));
                            PointF pointF9 = (size6 != 0 || z5) ? as1Var4.f7416c : u39Var.f63362b;
                            int i4 = size5;
                            i3 = (((size6 != 0 || z5) ? as1Var4.f7415b : pointF9).equals(pointF9) && as1Var3.f7414a.equals(pointF9) && !((u39Var.f63363c || (size6 != 0 && size6 != arrayList5.size() + (-1))) ? false : z4)) ? i3 + 2 : i3 + 1;
                            size6--;
                            size5 = i4;
                        }
                        i = size5;
                        u39 u39Var9 = xi8Var.f68261c;
                        if (u39Var9 == null || u39Var9.f63361a.size() != i3) {
                            ArrayList arrayList6 = new ArrayList(i3);
                            for (int i5 = 0; i5 < i3; i5++) {
                                arrayList6.add(new as1());
                            }
                            i2 = 0;
                            xi8Var.f68261c = new u39(new PointF(0.0f, 0.0f), false, arrayList6);
                        } else {
                            i2 = 0;
                        }
                        u39 u39Var10 = xi8Var.f68261c;
                        u39Var10.f63363c = z5;
                        PointF pointF10 = u39Var.f63362b;
                        u39Var10.m22436a(pointF10.x, pointF10.y);
                        ArrayList arrayList7 = u39Var10.f63361a;
                        boolean z6 = u39Var.f63363c;
                        int i6 = i2;
                        int i7 = i6;
                        while (i6 < arrayList5.size()) {
                            as1 as1Var5 = (as1) arrayList5.get(i6);
                            as1 as1Var6 = (as1) arrayList5.get(xi8.m24526c(i6 - 1, arrayList5.size()));
                            as1 as1Var7 = (as1) arrayList5.get(xi8.m24526c(i6 - 2, arrayList5.size()));
                            PointF pointF11 = (i6 != 0 || z6) ? as1Var6.f7416c : u39Var.f63362b;
                            PointF pointF12 = (i6 != 0 || z6) ? as1Var6.f7415b : pointF11;
                            float f2 = fFloatValue;
                            PointF pointF13 = as1Var5.f7414a;
                            PointF pointF14 = as1Var7.f7416c;
                            boolean z7 = z6;
                            PointF pointF15 = as1Var5.f7416c;
                            boolean z8 = (u39Var.f63363c || !(i6 == 0 || i6 == arrayList5.size() + (-1))) ? false : z4;
                            if (pointF12.equals(pointF11) && pointF13.equals(pointF11) && !z8) {
                                float f3 = pointF11.x;
                                float f4 = f3 - pointF14.x;
                                float f5 = pointF11.y;
                                float f6 = f5 - pointF14.y;
                                float f7 = pointF15.x - f3;
                                float f8 = pointF15.y - f5;
                                u39 u39Var11 = u39Var;
                                float fHypot = (float) Math.hypot(f4, f6);
                                float fHypot2 = (float) Math.hypot(f7, f8);
                                float fMin = Math.min(f2 / fHypot, 0.5f);
                                float fMin2 = Math.min(f2 / fHypot2, 0.5f);
                                float f9 = pointF11.x;
                                float fM17726a = AbstractC3393o1.m17726a(pointF14.x, f9, fMin, f9);
                                float f10 = pointF11.y;
                                float fM17726a2 = AbstractC3393o1.m17726a(pointF14.y, f10, fMin, f10);
                                float fM17726a3 = AbstractC3393o1.m17726a(pointF15.x, f9, fMin2, f9);
                                float fM17726a4 = AbstractC3393o1.m17726a(pointF15.y, f10, fMin2, f10);
                                float f11 = fM17726a - ((fM17726a - f9) * 0.5519f);
                                float f12 = fM17726a2 - ((fM17726a2 - f10) * 0.5519f);
                                float f13 = fM17726a3 - ((fM17726a3 - f9) * 0.5519f);
                                float f14 = fM17726a4 - ((fM17726a4 - f10) * 0.5519f);
                                as1 as1Var8 = (as1) arrayList7.get(xi8.m24526c(i7 - 1, arrayList7.size()));
                                as1 as1Var9 = (as1) arrayList7.get(i7);
                                u39Var3 = u39Var11;
                                as1Var8.f7415b.set(fM17726a, fM17726a2);
                                as1Var8.f7416c.set(fM17726a, fM17726a2);
                                if (i6 == 0) {
                                    u39Var10.m22436a(fM17726a, fM17726a2);
                                }
                                as1Var9.f7414a.set(f11, f12);
                                as1 as1Var10 = (as1) arrayList7.get(i7 + 1);
                                as1Var9.f7415b.set(f13, f14);
                                as1Var9.f7416c.set(fM17726a3, fM17726a4);
                                as1Var10.f7414a.set(fM17726a3, fM17726a4);
                                i7 += 2;
                            } else {
                                u39Var3 = u39Var;
                                as1 as1Var11 = (as1) arrayList7.get(xi8.m24526c(i7 - 1, arrayList7.size()));
                                as1 as1Var12 = (as1) arrayList7.get(i7);
                                PointF pointF16 = as1Var6.f7415b;
                                as1Var11.f7415b.set(pointF16.x, pointF16.y);
                                PointF pointF17 = as1Var6.f7416c;
                                as1Var11.f7416c.set(pointF17.x, pointF17.y);
                                PointF pointF18 = as1Var5.f7414a;
                                as1Var12.f7414a.set(pointF18.x, pointF18.y);
                                i7++;
                            }
                            i6++;
                            arrayList5 = arrayList5;
                            fFloatValue = f2;
                            z6 = z7;
                            u39Var4 = u39Var4;
                            u39Var5 = u39Var5;
                            u39Var = u39Var3;
                        }
                        u39Var = u39Var10;
                    }
                }
                size5 = i - 1;
                u39Var4 = u39Var4;
                u39Var5 = u39Var5;
            }
        } else {
            u39Var = u39Var8;
        }
        u39 u39Var12 = u39Var4;
        u39 u39Var13 = u39Var5;
        Path path = this.f7935j;
        f06.m11424e(u39Var, path);
        if (this.f50800e == null) {
            return path;
        }
        if (this.f7936k == null) {
            this.f7936k = new Path();
            this.f7937l = new Path();
        }
        f06.m11424e(u39Var12, this.f7936k);
        if (u39Var13 != null) {
            u39Var2 = u39Var13;
            f06.m11424e(u39Var2, this.f7937l);
        } else {
            u39Var2 = u39Var13;
        }
        p33 p33Var = this.f50800e;
        float f15 = kj4Var.f47383g;
        float fFloatValue2 = kj4Var.f47384h.floatValue();
        u39 u39Var14 = u39Var2;
        Path path2 = this.f7936k;
        return (Path) p33Var.m18870N(f15, fFloatValue2, path2, u39Var14 == null ? path2 : this.f7937l, f, m16691e(), this.f50799d);
    }

    @Override // p000.m90
    /* JADX INFO: renamed from: l */
    public final boolean mo3294l() {
        ArrayList arrayList = this.f7938m;
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }
}
