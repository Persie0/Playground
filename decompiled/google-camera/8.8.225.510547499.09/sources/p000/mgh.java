package p000;

import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mgh implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ mgi f40423a;

    /* JADX INFO: renamed from: b */
    private final CoordinatorLayout f40424b;

    /* JADX INFO: renamed from: c */
    private final View f40425c;

    public mgh(mgi mgiVar, CoordinatorLayout coordinatorLayout, View view) {
        this.f40423a = mgiVar;
        this.f40424b = coordinatorLayout;
        this.f40425c = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OverScroller overScroller;
        if (this.f40425c == null || (overScroller = this.f40423a.f40429d) == null) {
            return;
        }
        if (!overScroller.computeScrollOffset()) {
            this.f40423a.mo4768z(this.f40424b, this.f40425c);
            return;
        }
        mgi mgiVar = this.f40423a;
        mgiVar.m16352E(this.f40424b, this.f40425c, mgiVar.f40429d.getCurrY());
        afb.m428i(this.f40425c, this);
    }
}
