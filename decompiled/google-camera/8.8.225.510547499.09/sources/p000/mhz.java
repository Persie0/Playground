package p000;

import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mhz extends Property {
    public mhz(Class cls) {
        super(cls, "width");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(((View) obj).getLayoutParams().width);
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        view.getLayoutParams().width = ((Float) obj2).intValue();
        view.requestLayout();
    }
}
