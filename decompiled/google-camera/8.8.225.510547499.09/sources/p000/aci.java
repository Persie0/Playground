package p000;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aci {
    /* JADX INFO: renamed from: a */
    static int m192a(Resources resources, int i, Resources.Theme theme) {
        return resources.getColor(i, theme);
    }

    /* JADX INFO: renamed from: b */
    public static ColorStateList m193b(Resources resources, int i, Resources.Theme theme) {
        return resources.getColorStateList(i, theme);
    }

    /* JADX INFO: renamed from: c */
    public static final void m194c(View view, akv akvVar) {
        view.getClass();
        view.setTag(C0100R.id.view_tree_lifecycle_owner, akvVar);
    }
}
