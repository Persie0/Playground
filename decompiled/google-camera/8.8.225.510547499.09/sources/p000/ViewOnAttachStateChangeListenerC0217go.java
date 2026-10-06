package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: renamed from: go */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0217go implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Object f25834a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ int f25835b;

    public ViewOnAttachStateChangeListenerC0217go(View view, int i) {
        this.f25835b = i;
        this.f25834a = view;
    }

    public ViewOnAttachStateChangeListenerC0217go(ViewOnKeyListenerC0219gq viewOnKeyListenerC0219gq, int i) {
        this.f25835b = i;
        this.f25834a = viewOnKeyListenerC0219gq;
    }

    public ViewOnAttachStateChangeListenerC0217go(ViewOnKeyListenerC0245hp viewOnKeyListenerC0245hp, int i) {
        this.f25835b = i;
        this.f25834a = viewOnKeyListenerC0245hp;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f25835b) {
            case 1:
                ((View) this.f25834a).removeOnAttachStateChangeListener(this);
                aff.m467c((View) this.f25834a);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f25835b) {
            case 0:
                ViewTreeObserver viewTreeObserver = ((ViewOnKeyListenerC0219gq) this.f25834a).f26035e;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        ((ViewOnKeyListenerC0219gq) this.f25834a).f26035e = view.getViewTreeObserver();
                    }
                    ViewOnKeyListenerC0219gq viewOnKeyListenerC0219gq = (ViewOnKeyListenerC0219gq) this.f25834a;
                    viewOnKeyListenerC0219gq.f26035e.removeGlobalOnLayoutListener(viewOnKeyListenerC0219gq.f26033c);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 1:
                break;
            default:
                ViewTreeObserver viewTreeObserver2 = ((ViewOnKeyListenerC0245hp) this.f25834a).f28710d;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        ((ViewOnKeyListenerC0245hp) this.f25834a).f28710d = view.getViewTreeObserver();
                    }
                    ViewOnKeyListenerC0245hp viewOnKeyListenerC0245hp = (ViewOnKeyListenerC0245hp) this.f25834a;
                    viewOnKeyListenerC0245hp.f28710d.removeGlobalOnLayoutListener(viewOnKeyListenerC0245hp.f28708b);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
