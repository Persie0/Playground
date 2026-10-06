package p000;

import android.view.View;
import android.view.WindowInsets;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aff {
    /* JADX INFO: renamed from: a */
    static WindowInsets m465a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: b */
    static WindowInsets m466b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* JADX INFO: renamed from: c */
    public static void m467c(View view) {
        view.requestApplyInsets();
    }

    /* JADX INFO: renamed from: d */
    public static final bzm m468d(aqn aqnVar) {
        aqnVar.getClass();
        return new bzm(aqnVar);
    }
}
