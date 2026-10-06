package p000;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mgt extends ahz {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ BottomSheetBehavior f40457a;

    public mgt(BottomSheetBehavior bottomSheetBehavior) {
        this.f40457a = bottomSheetBehavior;
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: c */
    public final void mo710c(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.f40457a;
            if (bottomSheetBehavior.f8127w) {
                bottomSheetBehavior.m4809D(1);
            }
        }
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: e */
    public final boolean mo712e(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.f40457a;
        int i2 = bottomSheetBehavior.f8128x;
        if (i2 == 1 || bottomSheetBehavior.f8080F) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.f8079E == i) {
            WeakReference weakReference = bottomSheetBehavior.f8077C;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = this.f40457a.f8076B;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: f */
    public final int mo713f(View view, int i) {
        return view.getLeft();
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: g */
    public final int mo714g(View view, int i) {
        return aax.m69d(i, this.f40457a.m4814u(), mo715h());
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: h */
    public final int mo715h() {
        BottomSheetBehavior bottomSheetBehavior = this.f40457a;
        return bottomSheetBehavior.m4811F() ? bottomSheetBehavior.f8075A : bottomSheetBehavior.f8123s;
    }

    @Override // p000.ahz
    /* JADX INFO: renamed from: i */
    public final void mo716i(View view, int i, int i2) {
        this.f40457a.m4817y(i2);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x009e  */
    @Override // p000.ahz
    /* JADX INFO: renamed from: d */
    public final void mo711d(View view, float f, float f2) {
        int i = 6;
        if (f2 >= 0.0f) {
            BottomSheetBehavior bottomSheetBehavior = this.f40457a;
            if (bottomSheetBehavior.f8125u && bottomSheetBehavior.m4812G(view, f2)) {
                if (Math.abs(f) >= Math.abs(f2) || f2 <= this.f40457a.f8106b) {
                    int top = view.getTop();
                    BottomSheetBehavior bottomSheetBehavior2 = this.f40457a;
                    if (top > (bottomSheetBehavior2.f8075A + bottomSheetBehavior2.m4814u()) / 2) {
                        i = 5;
                    } else if (this.f40457a.f8101a || Math.abs(view.getTop() - this.f40457a.m4814u()) < Math.abs(view.getTop() - this.f40457a.f8121q)) {
                        i = 3;
                    }
                } else {
                    i = 5;
                }
            } else if (f2 == 0.0f || Math.abs(f) > Math.abs(f2)) {
                int top2 = view.getTop();
                BottomSheetBehavior bottomSheetBehavior3 = this.f40457a;
                if (bottomSheetBehavior3.f8101a) {
                    i = Math.abs(top2 - bottomSheetBehavior3.f8120p) < Math.abs(top2 - this.f40457a.f8123s) ? 3 : 4;
                } else {
                    int i2 = bottomSheetBehavior3.f8121q;
                    if (top2 < i2) {
                        if (top2 < Math.abs(top2 - bottomSheetBehavior3.f8123s)) {
                            i = 3;
                        }
                    } else if (Math.abs(top2 - i2) >= Math.abs(top2 - this.f40457a.f8123s)) {
                        i = 4;
                    }
                }
            } else if (this.f40457a.f8101a) {
                i = 4;
            } else {
                int top3 = view.getTop();
                if (Math.abs(top3 - this.f40457a.f8121q) >= Math.abs(top3 - this.f40457a.f8123s)) {
                    i = 4;
                }
            }
        } else if (this.f40457a.f8101a) {
            i = 3;
        } else {
            int top4 = view.getTop();
            System.currentTimeMillis();
            if (top4 <= this.f40457a.f8121q) {
                i = 3;
            }
        }
        this.f40457a.m4810E(view, i, true);
    }
}
