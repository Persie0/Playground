package p000;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.widget.ImageView;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ahj {
    /* JADX INFO: renamed from: a */
    public static ColorStateList m673a(ImageView imageView) {
        return imageView.getImageTintList();
    }

    /* JADX INFO: renamed from: b */
    public static PorterDuff.Mode m674b(ImageView imageView) {
        return imageView.getImageTintMode();
    }

    /* JADX INFO: renamed from: c */
    public static void m675c(ImageView imageView, ColorStateList colorStateList) {
        imageView.setImageTintList(colorStateList);
    }

    /* JADX INFO: renamed from: d */
    public static void m676d(ImageView imageView, PorterDuff.Mode mode) {
        imageView.setImageTintMode(mode);
    }
}
