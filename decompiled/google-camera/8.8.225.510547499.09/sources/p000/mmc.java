package p000;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mmc implements aua {

    /* JADX INFO: renamed from: a */
    public int f41019a;

    /* JADX INFO: renamed from: b */
    public int f41020b;

    /* JADX INFO: renamed from: c */
    private final WeakReference f41021c;

    public mmc(TabLayout tabLayout) {
        this.f41021c = new WeakReference(tabLayout);
    }

    @Override // p000.aua
    /* JADX INFO: renamed from: a */
    public final void mo1399a(int i) {
        this.f41019a = this.f41020b;
        this.f41020b = i;
        TabLayout tabLayout = (TabLayout) this.f41021c.get();
        if (tabLayout != null) {
            tabLayout.f8178A = this.f41020b;
        }
    }

    @Override // p000.aua
    /* JADX INFO: renamed from: b */
    public final void mo1400b(int i, float f) {
        TabLayout tabLayout = (TabLayout) this.f41021c.get();
        if (tabLayout != null) {
            tabLayout.m4865j(i, f, true, true);
        }
    }
}
