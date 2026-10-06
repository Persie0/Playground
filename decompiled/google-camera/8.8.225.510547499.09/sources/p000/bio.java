package p000;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class bio extends bie {

    /* JADX INFO: renamed from: e */
    private final bjv f3422e;

    /* JADX INFO: renamed from: f */
    private final Path f3423f;

    public bio(List list) {
        super(list);
        this.f3422e = new bjv();
        this.f3423f = new Path();
    }

    @Override // p000.bie
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ Object mo2493f(bmf bmfVar, float f) {
        bjv bjvVar = (bjv) bmfVar.f3759b;
        bjv bjvVar2 = (bjv) bmfVar.f3760c;
        bjv bjvVar3 = this.f3422e;
        if (bjvVar3.f3534b == null) {
            bjvVar3.f3534b = new PointF();
        }
        boolean z = true;
        if (!bjvVar.f3535c && !bjvVar2.f3535c) {
            z = false;
        }
        bjvVar3.f3535c = z;
        if (bjvVar.f3533a.size() != bjvVar2.f3533a.size()) {
            blx.m2680a("Curves must have the same number of control points. Shape 1: " + bjvVar.f3533a.size() + "\tShape 2: " + bjvVar2.f3533a.size());
        }
        int iMin = Math.min(bjvVar.f3533a.size(), bjvVar2.f3533a.size());
        if (bjvVar3.f3533a.size() < iMin) {
            for (int size = bjvVar3.f3533a.size(); size < iMin; size++) {
                bjvVar3.f3533a.add(new C1058va((byte[]) null));
            }
        } else if (bjvVar3.f3533a.size() > iMin) {
            for (int size2 = bjvVar3.f3533a.size() - 1; size2 >= iMin; size2--) {
                List list = bjvVar3.f3533a;
                list.remove(list.size() - 1);
            }
        }
        PointF pointF = bjvVar.f3534b;
        PointF pointF2 = bjvVar2.f3534b;
        float f2 = pointF.x;
        float f3 = pointF2.x;
        PointF pointF3 = blz.f3737a;
        float f4 = f2 + ((f3 - f2) * f);
        float f5 = pointF.y;
        float f6 = f5 + ((pointF2.y - f5) * f);
        if (bjvVar3.f3534b == null) {
            bjvVar3.f3534b = new PointF();
        }
        bjvVar3.f3534b.set(f4, f6);
        for (int size3 = bjvVar3.f3533a.size() - 1; size3 >= 0; size3--) {
            C1058va c1058va = (C1058va) bjvVar.f3533a.get(size3);
            C1058va c1058va2 = (C1058va) bjvVar2.f3533a.get(size3);
            Object obj = c1058va.f47802a;
            Object obj2 = c1058va.f47803b;
            Object obj3 = c1058va.f47804c;
            Object obj4 = c1058va2.f47802a;
            Object obj5 = c1058va2.f47803b;
            Object obj6 = c1058va2.f47804c;
            C1058va c1058va3 = (C1058va) bjvVar3.f3533a.get(size3);
            PointF pointF4 = (PointF) obj;
            float f7 = pointF4.x;
            PointF pointF5 = (PointF) obj4;
            float f8 = f7 + ((pointF5.x - f7) * f);
            float f9 = pointF4.y;
            ((PointF) c1058va3.f47802a).set(f8, f9 + ((pointF5.y - f9) * f));
            C1058va c1058va4 = (C1058va) bjvVar3.f3533a.get(size3);
            PointF pointF6 = (PointF) obj2;
            float f10 = pointF6.x;
            PointF pointF7 = (PointF) obj5;
            float f11 = f10 + ((pointF7.x - f10) * f);
            float f12 = pointF6.y;
            ((PointF) c1058va4.f47803b).set(f11, f12 + ((pointF7.y - f12) * f));
            C1058va c1058va5 = (C1058va) bjvVar3.f3533a.get(size3);
            PointF pointF8 = (PointF) obj3;
            float f13 = pointF8.x;
            PointF pointF9 = (PointF) obj6;
            float f14 = f13 + ((pointF9.x - f13) * f);
            float f15 = pointF8.y;
            ((PointF) c1058va5.f47804c).set(f14, f15 + ((pointF9.y - f15) * f));
        }
        bjv bjvVar4 = this.f3422e;
        Path path = this.f3423f;
        path.reset();
        PointF pointF10 = bjvVar4.f3534b;
        path.moveTo(pointF10.x, pointF10.y);
        blz.f3737a.set(pointF10.x, pointF10.y);
        for (int i = 0; i < bjvVar4.f3533a.size(); i++) {
            C1058va c1058va6 = (C1058va) bjvVar4.f3533a.get(i);
            Object obj7 = c1058va6.f47802a;
            Object obj8 = c1058va6.f47803b;
            Object obj9 = c1058va6.f47804c;
            PointF pointF11 = (PointF) obj7;
            if (pointF11.equals(blz.f3737a) && ((PointF) obj8).equals(obj9)) {
                PointF pointF12 = (PointF) obj9;
                path.lineTo(pointF12.x, pointF12.y);
            } else {
                PointF pointF13 = (PointF) obj8;
                PointF pointF14 = (PointF) obj9;
                path.cubicTo(pointF11.x, pointF11.y, pointF13.x, pointF13.y, pointF14.x, pointF14.y);
            }
            PointF pointF15 = (PointF) obj9;
            blz.f3737a.set(pointF15.x, pointF15.y);
        }
        if (bjvVar4.f3535c) {
            path.close();
        }
        return this.f3423f;
    }
}
