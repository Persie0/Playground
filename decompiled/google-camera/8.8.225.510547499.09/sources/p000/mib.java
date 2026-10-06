package p000;

import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mib extends Property {
    public mib(Class cls) {
        super(cls, "paddingStart");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(afc.m444e((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        afc.m449j(view, ((Float) obj2).intValue(), view.getPaddingTop(), afc.m443d(view), view.getPaddingBottom());
    }
}
