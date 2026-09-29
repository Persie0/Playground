package p000;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class pua implements a38 {
    @Override // p000.a38
    /* JADX INFO: renamed from: b */
    public final void mo74b(View view) {
    }

    @Override // p000.a38
    /* JADX INFO: renamed from: c */
    public final void mo75c(View view) {
        z28 z28Var = (z28) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) z28Var).width == -1 && ((ViewGroup.MarginLayoutParams) z28Var).height == -1) {
            return;
        }
        C3386nv.m17633t("Pages must fill the whole ViewPager2 (use match_parent)");
    }
}
