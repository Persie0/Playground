package androidx.viewpager2.widget;

/* JADX INFO: renamed from: androidx.viewpager2.widget.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1239e extends ViewPager2.AbstractC1229e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewPager2 f7785a;

    public C1239e(ViewPager2 viewPager2) {
        this.f7785a = viewPager2;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.AbstractC1229e
    /* JADX INFO: renamed from: c */
    public final void mo4681c(int i10) {
        ViewPager2 viewPager2 = this.f7785a;
        viewPager2.clearFocus();
        if (viewPager2.hasFocus()) {
            viewPager2.f7749j.requestFocus(2);
        }
    }
}
