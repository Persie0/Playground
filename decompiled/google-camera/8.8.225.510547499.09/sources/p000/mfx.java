package p000;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mfx implements aew {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f40399a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f40400b;

    public mfx(CoordinatorLayout coordinatorLayout, int i) {
        this.f40400b = i;
        this.f40399a = coordinatorLayout;
    }

    public mfx(AppBarLayout appBarLayout, int i) {
        this.f40400b = i;
        this.f40399a = appBarLayout;
    }

    public mfx(mhc mhcVar, int i) {
        this.f40400b = i;
        this.f40399a = mhcVar;
    }

    @Override // p000.aew
    /* JADX INFO: renamed from: a */
    public final ago mo402a(View view, ago agoVar) {
        switch (this.f40400b) {
            case 0:
                Object obj = this.f40399a;
                ago agoVar2 = true != afb.m435p((View) obj) ? null : agoVar;
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                if (!aeb.m318b(appBarLayout.f8001c, agoVar2)) {
                    appBarLayout.f8001c = agoVar2;
                    appBarLayout.m4750k();
                    appBarLayout.requestLayout();
                }
                break;
            case 1:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f40399a;
                if (!aeb.m318b(coordinatorLayout.f1450e, agoVar)) {
                    coordinatorLayout.f1450e = agoVar;
                    boolean z = agoVar.m606d() > 0;
                    coordinatorLayout.f1451f = z;
                    coordinatorLayout.setWillNotDraw(!z && coordinatorLayout.getBackground() == null);
                    if (!agoVar.m616q()) {
                        int childCount = coordinatorLayout.getChildCount();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            if (!afb.m435p(childAt) || ((aal) childAt.getLayoutParams()).f14a == null || !agoVar.m616q()) {
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                break;
            default:
                mhc mhcVar = (mhc) this.f40399a;
                mhb mhbVar = mhcVar.f40483g;
                if (mhbVar != null) {
                    mhcVar.f40477a.f8078D.remove(mhbVar);
                }
                mhc mhcVar2 = (mhc) this.f40399a;
                mhcVar2.f40483g = new mhb(mhcVar2.f40478b, agoVar);
                mhc mhcVar3 = (mhc) this.f40399a;
                mhcVar3.f40483g.m16366d(mhcVar3.getWindow());
                mhc mhcVar4 = (mhc) this.f40399a;
                mhcVar4.f40477a.m4816x(mhcVar4.f40483g);
                break;
        }
        return agoVar;
    }
}
