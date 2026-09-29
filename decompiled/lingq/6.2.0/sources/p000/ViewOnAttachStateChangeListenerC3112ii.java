package p000;

import android.content.Context;
import android.view.View;
import androidx.compose.p002ui.platform.AbstractC0389a;
import androidx.core.view.AbstractC0479a;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: ii */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC3112ii implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44129a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f44130b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC3112ii(Object obj, int i) {
        this.f44129a = i;
        this.f44130b = obj;
    }

    /* JADX INFO: renamed from: a */
    private final void m13933a(View view) {
    }

    /* JADX INFO: renamed from: b */
    private final void m13934b(View view) {
    }

    /* JADX INFO: renamed from: c */
    private final void m13935c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.f44129a;
        Object obj = this.f44130b;
        switch (i) {
            case 0:
                C3148ji c3148ji = (C3148ji) obj;
                Context context = view.getContext();
                if (!c3148ji.f45557c) {
                    context.getApplicationContext().registerComponentCallbacks(c3148ji.f45559e);
                    c3148ji.f45557c = true;
                }
                break;
            case 1:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = dta.f36217a;
                view2.requestApplyInsets();
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.f44129a;
        Object obj = this.f44130b;
        switch (i) {
            case 0:
                C3148ji c3148ji = (C3148ji) obj;
                Context context = view.getContext();
                if (c3148ji.f45557c) {
                    context.getApplicationContext().unregisterComponentCallbacks(c3148ji.f45559e);
                    c3148ji.f45557c = false;
                }
                C3148ji.m14484d(c3148ji);
                break;
            case 1:
                break;
            case 2:
                AbstractC0389a abstractC0389a = (AbstractC0389a) obj;
                int i2 = hh7.f42375a;
                for (Object obj2 : AbstractC0479a.m2001c(abstractC0389a)) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(hh7.f42376b);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                abstractC0389a.m1711e();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((pg9) obj).mo4537a(null);
                break;
        }
    }
}
