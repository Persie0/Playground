package p000;

import androidx.wear.ambient.AmbientLifecycleObserverInterface;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmg extends AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC {

    /* JADX INFO: renamed from: a */
    private final WeakReference f41029a;

    /* JADX INFO: renamed from: c */
    private int f41031c = 0;

    /* JADX INFO: renamed from: b */
    private int f41030b = 0;

    public mmg(TabLayout tabLayout) {
        this.f41029a = new WeakReference(tabLayout);
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC
    /* JADX INFO: renamed from: a */
    public final void mo1625a(int i) {
        this.f41030b = this.f41031c;
        this.f41031c = i;
        TabLayout tabLayout = (TabLayout) this.f41029a.get();
        if (tabLayout != null) {
            tabLayout.f8178A = this.f41031c;
        }
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC
    /* JADX INFO: renamed from: b */
    public final void mo1626b(int i, float f, int i2) {
        TabLayout tabLayout = (TabLayout) this.f41029a.get();
        if (tabLayout != null) {
            int i3 = this.f41031c;
            boolean z = false;
            boolean z2 = i3 != 2 || this.f41030b == 1;
            if (i3 != 2 || this.f41030b != 0) {
                z = true;
            }
            tabLayout.m4865j(i, f, z2, z);
        }
    }

    @Override // androidx.wear.ambient.AmbientLifecycleObserverInterface.AmbientLifecycleCallback.CC
    /* JADX INFO: renamed from: c */
    public final void mo1627c(int i) {
        TabLayout tabLayout = (TabLayout) this.f41029a.get();
        if (tabLayout == null || tabLayout.m4856a() == i || i >= tabLayout.m4857b()) {
            return;
        }
        int i2 = this.f41031c;
        boolean z = true;
        if (i2 != 0 && (i2 != 2 || this.f41030b != 0)) {
            z = false;
        }
        tabLayout.m4864i(tabLayout.m4858c(i), z);
    }
}
