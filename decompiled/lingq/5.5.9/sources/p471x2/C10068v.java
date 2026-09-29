package p471x2;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* JADX INFO: renamed from: x2.v */
/* JADX INFO: loaded from: classes.dex */
public final class C10068v {
    /* JADX INFO: renamed from: a */
    public static PointerIcon m18913a(Bitmap bitmap, float f3, float f10) {
        return PointerIcon.create(bitmap, f3, f10);
    }

    /* JADX INFO: renamed from: b */
    public static PointerIcon m18914b(Context context, int i10) {
        return PointerIcon.getSystemIcon(context, i10);
    }

    /* JADX INFO: renamed from: c */
    public static PointerIcon m18915c(Resources resources, int i10) {
        return PointerIcon.load(resources, i10);
    }
}
