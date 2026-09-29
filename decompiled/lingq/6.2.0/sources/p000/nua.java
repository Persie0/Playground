package p000;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes2.dex */
public final class nua extends r28 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53271a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f53272b;

    public /* synthetic */ nua(Object obj, int i) {
        this.f53271a = i;
        this.f53272b = obj;
    }

    @Override // p000.r28
    /* JADX INFO: renamed from: a */
    public final void mo2797a() {
        int i = this.f53271a;
        Object obj = this.f53272b;
        switch (i) {
            case 0:
                ViewPager2 viewPager2 = (ViewPager2) obj;
                viewPager2.f7122e = true;
                viewPager2.f7129l.f56529l = true;
                break;
            default:
                ((C3329mb) obj).m16732j();
                break;
        }
    }

    @Override // p000.r28
    /* JADX INFO: renamed from: b */
    public final void mo2798b(int i, int i2) {
        mo2797a();
    }

    @Override // p000.r28
    /* JADX INFO: renamed from: c */
    public final void mo2799c(int i, int i2) {
        mo2797a();
    }

    @Override // p000.r28
    /* JADX INFO: renamed from: d */
    public final void mo2800d(int i, int i2) {
        mo2797a();
    }

    @Override // p000.r28
    /* JADX INFO: renamed from: e */
    public final void mo2801e(int i, int i2) {
        mo2797a();
    }
}
