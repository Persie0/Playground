package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mga implements ahc {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ CoordinatorLayout f40405a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AppBarLayout f40406b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ View f40407c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f40408d;

    /* JADX INFO: renamed from: e */
    final /* synthetic */ AppBarLayout.BaseBehavior f40409e;

    public mga(AppBarLayout.BaseBehavior baseBehavior, CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
        this.f40409e = baseBehavior;
        this.f40405a = coordinatorLayout;
        this.f40406b = appBarLayout;
        this.f40407c = view;
        this.f40408d = i;
    }

    @Override // p000.ahc
    /* JADX INFO: renamed from: a */
    public final boolean mo654a(View view) {
        this.f40409e.m4762C(this.f40405a, this.f40406b, this.f40407c, this.f40408d, new int[]{0, 0});
        return true;
    }
}
