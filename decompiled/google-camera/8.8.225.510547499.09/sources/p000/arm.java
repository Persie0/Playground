package p000;

import android.graphics.PointF;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class arm extends Property {
    public arm(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        PointF pointF = (PointF) obj2;
        int left = view.getLeft();
        int top = view.getTop();
        int iRound = Math.round(pointF.x);
        int iRound2 = Math.round(pointF.y);
        int i = asu.f2264b;
        view.setLeftTopRightBottom(left, top, iRound, iRound2);
    }
}
