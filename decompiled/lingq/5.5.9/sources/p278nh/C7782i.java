package p278nh;

import androidx.recyclerview.widget.RecyclerView;
import com.lingq.commons.p053ui.views.ScrollingPagerIndicator;

/* JADX INFO: renamed from: nh.i */
/* JADX INFO: loaded from: classes.dex */
public final class C7782i extends RecyclerView.AbstractC1114g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ScrollingPagerIndicator f42722a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C7784k f42723b;

    public C7782i(C7784k c7784k, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f42722a = scrollingPagerIndicator;
        this.f42723b = c7784k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
    /* JADX INFO: renamed from: a */
    public final void mo4265a() {
        C7784k c7784k = this.f42723b;
        RecyclerView.Adapter<?> adapter = c7784k.f42729d;
        this.f42722a.setDotCount(adapter != null ? adapter.mo4226e() : 0);
        c7784k.m15493h();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
    /* JADX INFO: renamed from: b */
    public final void mo4266b() {
        mo4265a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
    /* JADX INFO: renamed from: c */
    public final void mo4267c(int i10, int i11, Object obj) {
        mo4265a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
    /* JADX INFO: renamed from: d */
    public final void mo4268d(int i10, int i11) {
        mo4265a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
    /* JADX INFO: renamed from: e */
    public final void mo4269e(int i10, int i11) {
        mo4265a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1114g
    /* JADX INFO: renamed from: f */
    public final void mo4270f(int i10, int i11) {
        mo4265a();
    }
}
