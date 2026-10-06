package p000;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class arj extends Property {

    /* JADX INFO: renamed from: a */
    private final Rect f2191a;

    public arj(Class cls) {
        super(cls, "boundsOrigin");
        this.f2191a = new Rect();
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        ((Drawable) obj).copyBounds(this.f2191a);
        return new PointF(this.f2191a.left, this.f2191a.top);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        Drawable drawable = (Drawable) obj;
        PointF pointF = (PointF) obj2;
        drawable.copyBounds(this.f2191a);
        this.f2191a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
        drawable.setBounds(this.f2191a);
    }
}
