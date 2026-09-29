package p000;

import android.animation.PropertyValuesHolder;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;

/* JADX INFO: loaded from: classes2.dex */
public abstract class wn7 {
    /* JADX INFO: renamed from: a */
    public static <V> PropertyValuesHolder m24082a(Property<?, V> property, Path path) {
        return PropertyValuesHolder.ofObject(property, (TypeConverter) null, path);
    }
}
