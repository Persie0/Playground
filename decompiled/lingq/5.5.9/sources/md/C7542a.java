package md;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p164i.C6102c;

/* JADX INFO: renamed from: md.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7542a {

    /* JADX INFO: renamed from: a */
    public static final int[] f41619a = {R.attr.theme, com.linguist.R.attr.theme};

    /* JADX INFO: renamed from: b */
    public static final int[] f41620b = {com.linguist.R.attr.materialThemeOverlay};

    /* JADX INFO: renamed from: a */
    public static Context m15048a(Context context, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f41620b, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        boolean z10 = (context instanceof C6102c) && ((C6102c) context).f35853a == resourceId;
        if (resourceId != 0 && !z10) {
            C6102c c6102c = new C6102c(context, resourceId);
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f41619a);
            int resourceId2 = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
            int resourceId3 = typedArrayObtainStyledAttributes2.getResourceId(1, 0);
            typedArrayObtainStyledAttributes2.recycle();
            if (resourceId2 == 0) {
                resourceId2 = resourceId3;
            }
            if (resourceId2 != 0) {
                c6102c.getTheme().applyStyle(resourceId2, true);
            }
            return c6102c;
        }
        return context;
    }
}
