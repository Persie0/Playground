package p000;

import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientLifecycleObserverInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aul extends AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ViewPager2 f2425a;

    public aul(ViewPager2 viewPager2) {
        this.f2425a = viewPager2;
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC
    /* JADX INFO: renamed from: c */
    public final void mo1627c(int i) {
        this.f2425a.clearFocus();
        if (this.f2425a.hasFocus()) {
            this.f2425a.f1670e.requestFocus(2);
        }
    }
}
