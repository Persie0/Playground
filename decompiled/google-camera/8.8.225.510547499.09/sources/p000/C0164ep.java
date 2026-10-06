package p000;

import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: ep */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class C0164ep extends agb {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0165eq f14941a;

    public C0164ep(C0165eq c0165eq) {
        this.f14941a = c0165eq;
    }

    @Override // p000.agb, p000.aga
    /* JADX INFO: renamed from: a */
    public final void mo571a() {
        this.f14941a.f15085a.f21381p.setVisibility(8);
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd = this.f14941a.f15085a;
        PopupWindow popupWindow = layoutInflaterFactory2C0179fd.f21382q;
        if (popupWindow != null) {
            popupWindow.dismiss();
        } else if (layoutInflaterFactory2C0179fd.f21381p.getParent() instanceof View) {
            aff.m467c((View) this.f14941a.f15085a.f21381p.getParent());
        }
        this.f14941a.f15085a.f21381p.m1045i();
        this.f14941a.f15085a.f21352K.m2596q(null);
        LayoutInflaterFactory2C0179fd layoutInflaterFactory2C0179fd2 = this.f14941a.f15085a;
        layoutInflaterFactory2C0179fd2.f21352K = null;
        aff.m467c(layoutInflaterFactory2C0179fd2.f21386u);
    }
}
