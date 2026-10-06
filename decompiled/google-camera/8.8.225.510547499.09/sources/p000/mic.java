package p000;

import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mic extends Property {
    public mic(Class cls) {
        super(cls, "paddingEnd");
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        return Float.valueOf(afc.m443d((View) obj));
    }

    @Override // android.util.Property
    public final /* bridge */ /* synthetic */ void set(Object obj, Object obj2) {
        View view = (View) obj;
        afc.m449j(view, afc.m444e(view), view.getPaddingTop(), ((Float) obj2).intValue(), view.getPaddingBottom());
    }
}
