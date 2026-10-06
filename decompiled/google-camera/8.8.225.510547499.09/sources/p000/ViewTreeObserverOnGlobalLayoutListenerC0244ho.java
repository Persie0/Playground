package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;

/* JADX INFO: renamed from: ho */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC0244ho implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f28560a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f28561b;

    public ViewTreeObserverOnGlobalLayoutListenerC0244ho(ViewOnKeyListenerC0219gq viewOnKeyListenerC0219gq, int i) {
        this.f28561b = i;
        this.f28560a = viewOnKeyListenerC0219gq;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC0244ho(ViewOnKeyListenerC0245hp viewOnKeyListenerC0245hp, int i) {
        this.f28561b = i;
        this.f28560a = viewOnKeyListenerC0245hp;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC0244ho(C0740jg c0740jg, int i) {
        this.f28561b = i;
        this.f28560a = c0740jg;
    }

    public ViewTreeObserverOnGlobalLayoutListenerC0244ho(C0743jj c0743jj, int i) {
        this.f28561b = i;
        this.f28560a = c0743jj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.f28561b) {
            case 0:
                if (((ViewOnKeyListenerC0245hp) this.f28560a).mo9636u()) {
                    ViewOnKeyListenerC0245hp viewOnKeyListenerC0245hp = (ViewOnKeyListenerC0245hp) this.f28560a;
                    if (!viewOnKeyListenerC0245hp.f28707a.f38187p) {
                        View view = viewOnKeyListenerC0245hp.f28709c;
                        if (view != null && view.isShown()) {
                            ((ViewOnKeyListenerC0245hp) this.f28560a).f28707a.mo9634s();
                        } else {
                            ((ViewOnKeyListenerC0245hp) this.f28560a).mo9626k();
                        }
                    }
                }
                break;
            case 1:
                if (((ViewOnKeyListenerC0219gq) this.f28560a).mo9636u() && ((ViewOnKeyListenerC0219gq) this.f28560a).f26032b.size() > 0 && !((C0794lg) ((lqq) ((ViewOnKeyListenerC0219gq) this.f28560a).f26032b.get(0)).f39002b).f38187p) {
                    View view2 = ((ViewOnKeyListenerC0219gq) this.f28560a).f26034d;
                    if (view2 != null && view2.isShown()) {
                        Iterator it = ((ViewOnKeyListenerC0219gq) this.f28560a).f26032b.iterator();
                        while (it.hasNext()) {
                            ((C0794lg) ((lqq) it.next()).f39002b).mo9634s();
                        }
                    } else {
                        ((ViewOnKeyListenerC0219gq) this.f28560a).mo9626k();
                    }
                    break;
                }
                break;
            case 2:
                if (!((C0743jj) this.f28560a).f34156b.mo12917u()) {
                    ((C0743jj) this.f28560a).m13303b();
                }
                ViewTreeObserver viewTreeObserver = ((C0743jj) this.f28560a).getViewTreeObserver();
                if (viewTreeObserver != null) {
                    C0734ja.m12752a(viewTreeObserver, this);
                }
                break;
            default:
                C0740jg c0740jg = (C0740jg) this.f28560a;
                C0743jj c0743jj = c0740jg.f33936d;
                if (afe.m461e(c0743jj) && c0743jj.getGlobalVisibleRect(c0740jg.f33935c)) {
                    ((C0740jg) this.f28560a).m13126n();
                    super/*lg*/.mo9634s();
                } else {
                    ((C0794lg) this.f28560a).mo9626k();
                }
                break;
        }
    }
}
