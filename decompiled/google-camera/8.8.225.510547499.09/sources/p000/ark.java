package p000;

import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ark extends Property {
    public ark(Class cls) {
        super(cls, "topLeft");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        arr arrVar = (arr) obj;
        PointF pointF = (PointF) obj2;
        arrVar.f2195a = Math.round(pointF.x);
        arrVar.f2196b = Math.round(pointF.y);
        int i = arrVar.f2199e + 1;
        arrVar.f2199e = i;
        if (i == arrVar.f2200f) {
            arrVar.m1897a();
        }
    }
}
