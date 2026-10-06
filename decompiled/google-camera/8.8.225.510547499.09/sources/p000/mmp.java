package p000;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmp {

    /* JADX INFO: renamed from: a */
    private static final int[] f41054a = {R.attr.theme, C0100R.attr.theme};

    /* JADX INFO: renamed from: b */
    private static final int[] f41055b = {C0100R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: a */
    public static Context m16632a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f41055b, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z = (context instanceof C0931qi) && ((C0931qi) context).f47480a == resourceId;
        if (resourceId == 0 || z) {
            return context;
        }
        C0931qi c0931qi = new C0931qi(context, resourceId);
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f41054a);
        int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0931qi.getTheme().applyStyle(resourceId2, true);
        }
        return c0931qi;
    }
}
