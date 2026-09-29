package p278nh;

import androidx.recyclerview.widget.RecyclerView;
import com.lingq.commons.p053ui.views.ScrollingPagerIndicator;
import dm.C5207g;

/* JADX INFO: renamed from: nh.j */
/* JADX INFO: loaded from: classes.dex */
public final class C7783j extends RecyclerView.AbstractC1125r {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7784k f42724a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ScrollingPagerIndicator f42725b;

    public C7783j(C7784k c7784k, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f42724a = c7784k;
        this.f42725b = scrollingPagerIndicator;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
    /* JADX INFO: renamed from: a */
    public final void mo4339a(int i10, RecyclerView recyclerView) {
        int iM15488c;
        C5207g.m11111f(recyclerView, "recyclerView");
        if (i10 == 0) {
            C7784k c7784k = this.f42724a;
            int iMo4226e = 0;
            if ((c7784k.m15488c() != -1) && (iM15488c = c7784k.m15488c()) != -1) {
                RecyclerView.Adapter<?> adapter = c7784k.f42729d;
                int iMo4226e2 = adapter != null ? adapter.mo4226e() : 0;
                ScrollingPagerIndicator scrollingPagerIndicator = this.f42725b;
                scrollingPagerIndicator.setDotCount(iMo4226e2);
                RecyclerView.Adapter<?> adapter2 = c7784k.f42729d;
                if (adapter2 != null) {
                    iMo4226e = adapter2.mo4226e();
                }
                if (iM15488c < iMo4226e) {
                    scrollingPagerIndicator.setCurrentPosition(iM15488c);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1125r
    /* JADX INFO: renamed from: b */
    public final void mo4340b(RecyclerView recyclerView, int i10, int i11) {
        C5207g.m11111f(recyclerView, "recyclerView");
        this.f42724a.m15493h();
    }
}
