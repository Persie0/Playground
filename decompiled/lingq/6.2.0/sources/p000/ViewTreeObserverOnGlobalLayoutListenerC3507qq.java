package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.appcompat.widget.AppCompatSpinner;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: qq */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3507qq implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f58036a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f58037b;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC3507qq(Object obj, int i) {
        this.f58036a = i;
        this.f58037b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.f58036a;
        Object obj = this.f58037b;
        switch (i) {
            case 0:
                AppCompatSpinner appCompatSpinner = (AppCompatSpinner) obj;
                if (!appCompatSpinner.getInternalPopup().mo21535a()) {
                    appCompatSpinner.f1134f.mo21544n(appCompatSpinner.getTextDirection(), appCompatSpinner.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = appCompatSpinner.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                C3731wq c3731wq = (C3731wq) obj;
                AppCompatSpinner appCompatSpinner2 = c3731wq.f67167Z;
                if (appCompatSpinner2.isAttachedToWindow() && appCompatSpinner2.getGlobalVisibleRect(c3731wq.f67165X)) {
                    c3731wq.m24100s();
                    c3731wq.mo10360f();
                } else {
                    c3731wq.dismiss();
                }
                break;
            case 2:
                lo0 lo0Var = (lo0) obj;
                ArrayList arrayList = lo0Var.f49903i;
                if (lo0Var.mo10357a() && arrayList.size() > 0 && !((ko0) arrayList.get(0)).f47593a.f35606T) {
                    View view = lo0Var.f49884K;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((ko0) it.next()).f47593a.mo10360f();
                        }
                    } else {
                        lo0Var.dismiss();
                    }
                    break;
                }
                break;
            default:
                sg9 sg9Var = (sg9) obj;
                ax5 ax5Var = sg9Var.f60845i;
                if (sg9Var.mo10357a() && !ax5Var.f35606T) {
                    View view2 = sg9Var.f60830I;
                    if (view2 != null && view2.isShown()) {
                        ax5Var.mo10360f();
                    } else {
                        sg9Var.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
