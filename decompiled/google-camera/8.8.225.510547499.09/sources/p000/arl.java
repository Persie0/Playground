package p000;

import android.graphics.PointF;
import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class arl extends Property {
    public arl(Class cls) {
        super(cls, "bottomRight");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return null;
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        arr arrVar = (arr) obj;
        PointF pointF = (PointF) obj2;
        arrVar.f2197c = Math.round(pointF.x);
        arrVar.f2198d = Math.round(pointF.y);
        int i = arrVar.f2200f + 1;
        arrVar.f2200f = i;
        if (arrVar.f2199e == i) {
            arrVar.m1897a();
        }
    }
}
