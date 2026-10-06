package p000;

import android.util.Property;
import android.view.View;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class ass extends Property {
    public ass(Class cls) {
        super(cls, "translationAlpha");
    }

    @Override // android.util.Property
    public final /* synthetic */ Object get(Object obj) {
        int i = asu.f2264b;
        return Float.valueOf(((View) obj).getTransitionAlpha());
    }

    @Override // android.util.Property
    public final /* synthetic */ void set(Object obj, Object obj2) {
        float fFloatValue = ((Float) obj2).floatValue();
        int i = asu.f2264b;
        ((View) obj).setTransitionAlpha(fFloatValue);
    }
}
