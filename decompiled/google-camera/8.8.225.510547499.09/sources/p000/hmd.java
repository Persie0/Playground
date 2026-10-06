package p000;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.android.apps.camera.bottombar.C0100R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class hmd extends C0166er {

    /* JADX INFO: renamed from: a */
    private final int f28305a;

    public hmd(Resources resources) {
        this.f28305a = resources.getDimensionPixelSize(C0100R.dimen.settings_changed_item_space);
    }

    @Override // p000.C0166er
    /* JADX INFO: renamed from: f */
    public final void mo1749f(Rect rect, View view, RecyclerView recyclerView) {
        int iM1251c = recyclerView.m1251c(view);
        AbstractC0806ls abstractC0806ls = recyclerView.f1123m;
        abstractC0806ls.getClass();
        if (iM1251c != abstractC0806ls.mo1762a() - 1) {
            rect.bottom = this.f28305a;
        }
    }
}
