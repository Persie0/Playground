package p000;

import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ast extends Property {
    public ast(Class cls) {
        super(cls, "clipBounds");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        return afd.m453a((View) obj);
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        afd.m454b((View) obj, (Rect) obj2);
    }
}
