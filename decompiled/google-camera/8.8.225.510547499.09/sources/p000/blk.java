package p000;

import android.graphics.PointF;
import com.google.android.material.snackbar.VMX.rgoX;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class blk implements blq {

    /* JADX INFO: renamed from: a */
    public static final blk f3698a = new blk();

    /* JADX INFO: renamed from: b */
    private static final dsx f3699b = dsx.m6674J("c", "v", rgoX.xKEouVDgV, "o");

    private blk() {
    }

    @Override // p000.blq
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo2637a(blt bltVar, float f) {
        if (bltVar.mo2665q() == 1) {
            bltVar.mo2656h();
        }
        bltVar.mo2657i();
        List listM2643d = null;
        List listM2643d2 = null;
        List listM2643d3 = null;
        boolean zMo2664p = false;
        while (bltVar.mo2663o()) {
            switch (bltVar.mo2666r(f3699b)) {
                case 0:
                    zMo2664p = bltVar.mo2664p();
                    break;
                case 1:
                    listM2643d = blb.m2643d(bltVar, f);
                    break;
                case 2:
                    listM2643d2 = blb.m2643d(bltVar, f);
                    break;
                case 3:
                    listM2643d3 = blb.m2643d(bltVar, f);
                    break;
                default:
                    bltVar.mo2661m();
                    bltVar.mo2662n();
                    break;
            }
        }
        bltVar.mo2659k();
        if (bltVar.mo2665q() == 2) {
            bltVar.mo2658j();
        }
        if (listM2643d == null || listM2643d2 == null || listM2643d3 == null) {
            throw new IllegalArgumentException("Shape data was missing information.");
        }
        if (listM2643d.isEmpty()) {
            return new bjv(new PointF(), false, Collections.emptyList());
        }
        int size = listM2643d.size();
        PointF pointF = (PointF) listM2643d.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) listM2643d.get(i);
            int i2 = i - 1;
            arrayList.add(new C1058va(blz.m2695c((PointF) listM2643d.get(i2), (PointF) listM2643d3.get(i2)), blz.m2695c(pointF2, (PointF) listM2643d2.get(i)), pointF2));
        }
        if (zMo2664p) {
            PointF pointF3 = (PointF) listM2643d.get(0);
            int i3 = size - 1;
            arrayList.add(new C1058va(blz.m2695c((PointF) listM2643d.get(i3), (PointF) listM2643d3.get(i3)), blz.m2695c(pointF3, (PointF) listM2643d2.get(0)), pointF3));
        }
        return new bjv(pointF, zMo2664p, arrayList);
    }
}
