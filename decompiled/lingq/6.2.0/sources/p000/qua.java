package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes2.dex */
public final class qua extends LinearLayoutManager {

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ ViewPager2 f58232E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qua(ViewPager2 viewPager2) {
        super(1);
        this.f58232E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* JADX INFO: renamed from: J0 */
    public final void mo2655J0(k38 k38Var, int[] iArr) {
        ViewPager2 viewPager2 = this.f58232E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.mo2655J0(k38Var, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, p000.y28
    /* JADX INFO: renamed from: Z */
    public final void mo2618Z(g38 g38Var, k38 k38Var, C0797b4 c0797b4) {
        super.mo2618Z(g38Var, k38Var, c0797b4);
        this.f58232E.f7117O.getClass();
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: a0 */
    public final void mo2619a0(g38 g38Var, k38 k38Var, View view, C0797b4 c0797b4) {
        int iM24878K;
        int iM24878K2;
        ViewPager2 viewPager2 = (ViewPager2) this.f58232E.f7117O.f50863e;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.f7124g.getClass();
            iM24878K = y28.m24878K(view);
        } else {
            iM24878K = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.f7124g.getClass();
            iM24878K2 = y28.m24878K(view);
        } else {
            iM24878K2 = 0;
        }
        c0797b4.m3281l(m58.m16638l(false, iM24878K, 1, iM24878K2, 1));
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: n0 */
    public final boolean mo20179n0(g38 g38Var, k38 k38Var, int i, Bundle bundle) {
        this.f58232E.f7117O.getClass();
        return super.mo20179n0(g38Var, k38Var, i, bundle);
    }

    @Override // p000.y28
    /* JADX INFO: renamed from: t0 */
    public final boolean mo6096t0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
