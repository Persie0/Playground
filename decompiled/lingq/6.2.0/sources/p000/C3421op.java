package p000;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: op */
/* JADX INFO: loaded from: classes2.dex */
public final class C3421op extends dha {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f54664a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f54665b;

    public /* synthetic */ C3421op(Object obj, int i) {
        this.f54664a = i;
        this.f54665b = obj;
    }

    @Override // p000.dha, p000.zua
    /* JADX INFO: renamed from: b */
    public void mo10396b() {
        int i = this.f54664a;
        Object obj = this.f54665b;
        switch (i) {
            case 0:
                ((LayoutInflaterFactory2C3804yp) ((RunnableC3468pp) obj).f56618b).f70193P.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) obj;
                layoutInflaterFactory2C3804yp.f70193P.setVisibility(0);
                if (layoutInflaterFactory2C3804yp.f70193P.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C3804yp.f70193P.getParent();
                    WeakHashMap weakHashMap = dta.f36217a;
                    view.requestApplyInsets();
                }
                break;
        }
    }

    @Override // p000.zua
    /* JADX INFO: renamed from: c */
    public final void mo17716c() {
        int i = this.f54664a;
        Object obj = this.f54665b;
        switch (i) {
            case 0:
                LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) ((RunnableC3468pp) obj).f56618b;
                layoutInflaterFactory2C3804yp.f70193P.setAlpha(1.0f);
                layoutInflaterFactory2C3804yp.f70196S.m24706d(null);
                layoutInflaterFactory2C3804yp.f70196S = null;
                break;
            case 1:
                LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp2 = (LayoutInflaterFactory2C3804yp) obj;
                layoutInflaterFactory2C3804yp2.f70193P.setAlpha(1.0f);
                layoutInflaterFactory2C3804yp2.f70196S.m24706d(null);
                layoutInflaterFactory2C3804yp2.f70196S = null;
                break;
            default:
                LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp3 = (LayoutInflaterFactory2C3804yp) ((C3156jq) obj).f45991b;
                layoutInflaterFactory2C3804yp3.f70193P.setVisibility(8);
                PopupWindow popupWindow = layoutInflaterFactory2C3804yp3.f70194Q;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C3804yp3.f70193P.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C3804yp3.f70193P.getParent();
                    WeakHashMap weakHashMap = dta.f36217a;
                    view.requestApplyInsets();
                }
                layoutInflaterFactory2C3804yp3.f70193P.m655e();
                layoutInflaterFactory2C3804yp3.f70196S.m24706d(null);
                layoutInflaterFactory2C3804yp3.f70196S = null;
                ViewGroup viewGroup = layoutInflaterFactory2C3804yp3.f70198U;
                WeakHashMap weakHashMap2 = dta.f36217a;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}
