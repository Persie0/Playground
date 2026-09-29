package androidx.viewpager2.adapter;

import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: androidx.viewpager2.adapter.a */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC1217a implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ FrameLayout f7721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1222f f7722b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ FragmentStateAdapter f7723c;

    public ViewOnLayoutChangeListenerC1217a(FragmentStateAdapter fragmentStateAdapter, FrameLayout frameLayout, C1222f c1222f) {
        this.f7723c = fragmentStateAdapter;
        this.f7721a = frameLayout;
        this.f7722b = c1222f;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        FrameLayout frameLayout = this.f7721a;
        if (frameLayout.getParent() != null) {
            frameLayout.removeOnLayoutChangeListener(this);
            this.f7723c.m4673u(this.f7722b);
        }
    }
}
