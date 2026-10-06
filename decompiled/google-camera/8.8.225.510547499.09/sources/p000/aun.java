package p000;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aun extends LinearLayoutManager {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ViewPager2 f2426a;

    public aun(ViewPager2 viewPager2) {
        this.f2426a = viewPager2;
    }

    @Override // android.support.v7.widget.LinearLayoutManager
    /* JADX INFO: renamed from: O */
    protected final void mo1155O(C0826ml c0826ml, int[] iArr) {
        ViewPager2 viewPager2 = this.f2426a;
        if (viewPager2.f1673h == -1) {
            super.mo1155O(c0826ml, iArr);
            return;
        }
        RecyclerView recyclerView = viewPager2.f1670e;
        if (viewPager2.m1558a() == 0) {
            recyclerView.getWidth();
            recyclerView.getPaddingLeft();
            recyclerView.getPaddingRight();
        } else {
            recyclerView.getHeight();
            recyclerView.getPaddingTop();
            recyclerView.getPaddingBottom();
        }
        iArr[0] = 0;
        iArr[1] = 0;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: aY */
    public final boolean mo2043aY(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // p000.AbstractC0812ly
    /* JADX INFO: renamed from: n */
    public final void mo1106n(C0818md c0818md, C0826ml c0826ml, View view, agt agtVar) {
        auq auqVar = (auq) this.f2426a.f1675j;
        agtVar.m634l(bkn.m2552z(auqVar.f2430a.m1558a() == 1 ? LinearLayoutManager.m16136be(view) : 0, 1, auqVar.f2430a.m1558a() == 0 ? LinearLayoutManager.m16136be(view) : 0, 1, false));
    }
}
