package p000;

import androidx.viewpager2.widget.ViewPager2;
import androidx.wear.ambient.AmbientLifecycleObserverInterface;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class auk extends AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ViewPager2 f2424a;

    public auk(ViewPager2 viewPager2) {
        this.f2424a = viewPager2;
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC
    /* JADX INFO: renamed from: a */
    public final void mo1625a(int i) {
        if (i == 0) {
            this.f2424a.m1563f();
        }
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC
    /* JADX INFO: renamed from: c */
    public final void mo1627c(int i) {
        ViewPager2 viewPager2 = this.f2424a;
        if (viewPager2.f1667b != i) {
            viewPager2.f1667b = i;
            ((auq) viewPager2.f1675j).m2045f();
        }
    }
}
