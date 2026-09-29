package androidx.viewpager2.widget;

/* JADX INFO: renamed from: androidx.viewpager2.widget.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1238d extends ViewPager2.AbstractC1229e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewPager2 f7784a;

    public C1238d(ViewPager2 viewPager2) {
        this.f7784a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
    /* JADX INFO: renamed from: a */
    public final void mo4680a(int i10) {
        if (i10 == 0) {
            this.f7784a.m4685d();
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
    /* JADX INFO: renamed from: c */
    public final void mo4681c(int i10) {
        ViewPager2 viewPager2 = this.f7784a;
        if (viewPager2.f7743d != i10) {
            viewPager2.f7743d = i10;
            viewPager2.f7739O.m4688b();
        }
    }
}
