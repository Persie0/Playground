package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class lmh implements ViewTreeObserver.OnPreDrawListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ lmi f38657a;

    /* JADX INFO: renamed from: b */
    private final AtomicReference f38658b;

    public lmh(lmi lmiVar, View view) {
        this.f38657a = lmiVar;
        this.f38658b = new AtomicReference(view);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = (View) this.f38658b.getAndSet(null);
        if (view == null) {
            return true;
        }
        try {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            lij.m15451u().postAtFrontOfQueue(new lmg(this.f38657a, 0));
            lij.m15454x(new lmg(this.f38657a, 2));
        } catch (RuntimeException e) {
        }
        return true;
    }
}
