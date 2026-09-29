package p000;

import android.view.View;
import androidx.compose.p002ui.R$id;

/* JADX INFO: loaded from: classes.dex */
public abstract class a7b {

    /* JADX INFO: renamed from: a */
    public static final n66 f332a;

    static {
        long[] jArr = om8.f54590a;
        f332a = new n66();
    }

    /* JADX INFO: renamed from: a */
    public static final kf1 m165a(View view) {
        Object tag = view.getTag(R$id.androidx_compose_ui_view_composition_context);
        if (tag instanceof kf1) {
            return (kf1) tag;
        }
        return null;
    }
}
