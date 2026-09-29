package p278nh;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lingq.commons.p053ui.views.ScrollingPagerIndicator;
import dm.C5207g;
import java.util.ArrayList;

/* JADX INFO: renamed from: nh.k */
/* JADX INFO: loaded from: classes.dex */
public final class C7784k implements ScrollingPagerIndicator.InterfaceC3283a<RecyclerView> {

    /* JADX INFO: renamed from: a */
    public ScrollingPagerIndicator f42726a;

    /* JADX INFO: renamed from: b */
    public RecyclerView f42727b;

    /* JADX INFO: renamed from: c */
    public LinearLayoutManager f42728c;

    /* JADX INFO: renamed from: d */
    public RecyclerView.Adapter<?> f42729d;

    /* JADX INFO: renamed from: e */
    public C7783j f42730e;

    /* JADX INFO: renamed from: f */
    public C7782i f42731f;

    /* JADX INFO: renamed from: g */
    public int f42732g;

    /* JADX INFO: renamed from: h */
    public int f42733h;

    @Override // com.lingq.commons.p053ui.views.ScrollingPagerIndicator.InterfaceC3283a
    /* JADX INFO: renamed from: a */
    public final void mo9373a() {
        RecyclerView recyclerView;
        ArrayList arrayList;
        RecyclerView.Adapter<?> adapter;
        C7782i c7782i = this.f42731f;
        if (c7782i != null && (adapter = this.f42729d) != null) {
            adapter.f7040a.unregisterObserver(c7782i);
        }
        C7783j c7783j = this.f42730e;
        if (c7783j != null && (recyclerView = this.f42727b) != null && (arrayList = recyclerView.f6969F0) != null) {
            arrayList.remove(c7783j);
        }
        this.f42732g = 0;
    }

    @Override // com.lingq.commons.p053ui.views.ScrollingPagerIndicator.InterfaceC3283a
    /* JADX INFO: renamed from: b */
    public final void mo9374b(ScrollingPagerIndicator scrollingPagerIndicator, RecyclerView recyclerView) {
        RecyclerView recyclerView2 = recyclerView;
        C5207g.m11111f(scrollingPagerIndicator, "indicator");
        C5207g.m11111f(recyclerView2, "pager");
        if (!(recyclerView2.getLayoutManager() instanceof LinearLayoutManager)) {
            throw new IllegalStateException("Only LinearLayoutManager is supported".toString());
        }
        if (recyclerView2.getAdapter() == null) {
            throw new IllegalStateException("RecyclerView has not Adapter attached".toString());
        }
        this.f42728c = (LinearLayoutManager) recyclerView2.getLayoutManager();
        this.f42727b = recyclerView2;
        this.f42729d = recyclerView2.getAdapter();
        this.f42726a = scrollingPagerIndicator;
        C7782i c7782i = new C7782i(this, scrollingPagerIndicator);
        this.f42731f = c7782i;
        RecyclerView.Adapter<?> adapter = this.f42729d;
        if (adapter != null) {
            adapter.m4234o(c7782i);
        }
        RecyclerView.Adapter<?> adapter2 = this.f42729d;
        scrollingPagerIndicator.setDotCount(adapter2 != null ? adapter2.mo4226e() : 0);
        m15493h();
        C7783j c7783j = new C7783j(this, scrollingPagerIndicator);
        this.f42730e = c7783j;
        RecyclerView recyclerView3 = this.f42727b;
        if (recyclerView3 != null) {
            recyclerView3.m4203i(c7783j);
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0046  */
    /* JADX INFO: renamed from: c */
    public final int m15488c() {
        boolean z10;
        RecyclerView recyclerView = this.f42727b;
        if (recyclerView != null) {
            int childCount = recyclerView.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = recyclerView.getChildAt(i10);
                float x10 = childAt.getX();
                int measuredWidth = childAt.getMeasuredWidth();
                float fM15492g = m15492g();
                RecyclerView recyclerView2 = this.f42727b;
                float f3 = 2;
                float fM15490e = m15490e() + (((recyclerView2 != null ? recyclerView2.getMeasuredWidth() : 0) - m15490e()) / f3);
                LinearLayoutManager linearLayoutManager = this.f42728c;
                if (linearLayoutManager != null) {
                    z10 = true;
                    if (linearLayoutManager.f6921p != 1) {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    x10 = childAt.getY();
                    measuredWidth = childAt.getMeasuredHeight();
                    RecyclerView recyclerView3 = this.f42727b;
                    fM15492g = ((recyclerView3 != null ? recyclerView3.getMeasuredWidth() : 0) - m15489d()) / f3;
                    fM15490e = m15491f();
                }
                if (x10 >= fM15492g && x10 + measuredWidth <= fM15490e) {
                    View viewM4172D = recyclerView.m4172D(childAt);
                    RecyclerView.AbstractC1109b0 abstractC1109b0M4178K = viewM4172D == null ? null : recyclerView.m4178K(viewM4172D);
                    if (abstractC1109b0M4178K != null && abstractC1109b0M4178K.m4241d() != -1) {
                        return abstractC1109b0M4178K.m4241d();
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: d */
    public final float m15489d() {
        int measuredHeight;
        View childAt;
        if (this.f42733h == 0) {
            RecyclerView recyclerView = this.f42727b;
            int childCount = recyclerView != null ? recyclerView.getChildCount() : 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                RecyclerView recyclerView2 = this.f42727b;
                if (recyclerView2 != null && (childAt = recyclerView2.getChildAt(i10)) != null && childAt.getMeasuredHeight() != 0) {
                    measuredHeight = childAt.getMeasuredHeight();
                    this.f42733h = measuredHeight;
                }
            }
            measuredHeight = this.f42733h;
        } else {
            measuredHeight = this.f42733h;
        }
        return measuredHeight;
    }

    /* JADX INFO: renamed from: e */
    public final float m15490e() {
        int measuredWidth;
        View childAt;
        if (this.f42732g == 0) {
            RecyclerView recyclerView = this.f42727b;
            int childCount = recyclerView != null ? recyclerView.getChildCount() : 0;
            for (int i10 = 0; i10 < childCount; i10++) {
                RecyclerView recyclerView2 = this.f42727b;
                if (recyclerView2 != null && (childAt = recyclerView2.getChildAt(i10)) != null && childAt.getMeasuredWidth() != 0) {
                    measuredWidth = childAt.getMeasuredWidth();
                    this.f42732g = measuredWidth;
                }
            }
            measuredWidth = this.f42732g;
        } else {
            measuredWidth = this.f42732g;
        }
        return measuredWidth;
    }

    /* JADX INFO: renamed from: f */
    public final float m15491f() {
        RecyclerView recyclerView = this.f42727b;
        return m15489d() + (((recyclerView != null ? recyclerView.getMeasuredWidth() : 0) - m15489d()) / 2);
    }

    /* JADX INFO: renamed from: g */
    public final float m15492g() {
        RecyclerView recyclerView = this.f42727b;
        return ((recyclerView != null ? recyclerView.getMeasuredWidth() : 0) - m15490e()) / 2;
    }

    /* JADX INFO: renamed from: h */
    public final void m15493h() {
        int iM4240c;
        float fM15491f;
        int measuredHeight;
        ScrollingPagerIndicator scrollingPagerIndicator;
        int iM4326y;
        int y10;
        LinearLayoutManager linearLayoutManager = this.f42728c;
        boolean z10 = false;
        View view = null;
        if (linearLayoutManager != null && (iM4326y = linearLayoutManager.m4326y()) != 0) {
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < iM4326y; i11++) {
                View viewM4324x = linearLayoutManager.m4324x(i11);
                if (viewM4324x != null) {
                    if (linearLayoutManager.f6921p == 0) {
                        y10 = (int) viewM4324x.getX();
                        if (viewM4324x.getMeasuredWidth() + y10 < i10 && viewM4324x.getMeasuredWidth() + y10 >= m15492g()) {
                            view = viewM4324x;
                            i10 = y10;
                        }
                    } else {
                        y10 = (int) viewM4324x.getY();
                        if (viewM4324x.getMeasuredHeight() + y10 < i10 && viewM4324x.getMeasuredHeight() + y10 >= m15491f()) {
                            view = viewM4324x;
                            i10 = y10;
                        }
                    }
                }
            }
        }
        if (view == null) {
            return;
        }
        if (this.f42727b != null) {
            RecyclerView.AbstractC1109b0 abstractC1109b0M4161L = RecyclerView.m4161L(view);
            iM4240c = abstractC1109b0M4161L != null ? abstractC1109b0M4161L.m4240c() : -1;
        } else {
            iM4240c = 0;
        }
        if (iM4240c == -1) {
            return;
        }
        RecyclerView.Adapter<?> adapter = this.f42729d;
        int iMo4226e = adapter != null ? adapter.mo4226e() : 0;
        if (iM4240c >= iMo4226e && iMo4226e != 0) {
            iM4240c %= iMo4226e;
        }
        LinearLayoutManager linearLayoutManager2 = this.f42728c;
        if (linearLayoutManager2 != null && linearLayoutManager2.f6921p == 0) {
            fM15491f = m15492g() - view.getX();
            measuredHeight = view.getMeasuredWidth();
        } else {
            fM15491f = m15491f() - view.getY();
            measuredHeight = view.getMeasuredHeight();
        }
        float f3 = fM15491f / measuredHeight;
        double d10 = f3;
        if (0.0d <= d10 && d10 <= 1.0d) {
            z10 = true;
        }
        if (!z10 || iM4240c >= iMo4226e || (scrollingPagerIndicator = this.f42726a) == null) {
            return;
        }
        scrollingPagerIndicator.m9370d(iM4240c, f3);
    }
}
