package p177ic;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ic.d */
/* JADX INFO: loaded from: classes.dex */
public final class C6311d extends Property<Drawable, Integer> {

    /* JADX INFO: renamed from: a */
    public static final C6311d f36530a = new C6311d();

    public C6311d() {
        super(Integer.class, "drawableAlphaCompat");
        new WeakHashMap();
    }

    @Override // android.util.Property
    public final Integer get(Drawable drawable) {
        return Integer.valueOf(drawable.getAlpha());
    }

    @Override // android.util.Property
    public final void set(Drawable drawable, Integer num) {
        drawable.setAlpha(num.intValue());
    }
}
