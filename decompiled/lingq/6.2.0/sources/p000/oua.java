package p000;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes2.dex */
public final class oua extends rua {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55018a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ ViewPager2 f55019b;

    public /* synthetic */ oua(ViewPager2 viewPager2, int i) {
        this.f55018a = i;
        this.f55019b = viewPager2;
    }

    @Override // p000.rua
    /* JADX INFO: renamed from: a */
    public void mo10797a(int i) {
        switch (this.f55018a) {
            case 0:
                if (i == 0) {
                    this.f55019b.m2894e();
                }
                break;
        }
    }

    @Override // p000.rua
    /* JADX INFO: renamed from: c */
    public final void mo10799c(int i) {
        int i2 = this.f55018a;
        ViewPager2 viewPager2 = this.f55019b;
        switch (i2) {
            case 0:
                if (viewPager2.f7121d != i) {
                    viewPager2.f7121d = i;
                    viewPager2.f7117O.m16732j();
                }
                break;
            default:
                viewPager2.clearFocus();
                if (viewPager2.hasFocus()) {
                    viewPager2.f7127j.requestFocus(2);
                }
                break;
        }
    }
}
