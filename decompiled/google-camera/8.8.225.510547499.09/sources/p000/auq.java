package p000;

import android.R;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class auq extends ath {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ViewPager2 f2430a;

    /* JADX INFO: renamed from: b */
    public C0158ej f2431b;

    /* JADX INFO: renamed from: c */
    private final ahc f2432c = new auo(this, 1);

    /* JADX INFO: renamed from: d */
    private final ahc f2433d = new auo(this, 0);

    public auq(ViewPager2 viewPager2) {
        this.f2430a = viewPager2;
    }

    @Override // p000.ath
    /* JADX INFO: renamed from: d */
    public final boolean mo1984d(int i) {
        return i == 8192 || i == 4096;
    }

    /* JADX INFO: renamed from: e */
    public final void m2044e(int i) {
        ViewPager2 viewPager2 = this.f2430a;
        if (viewPager2.f1672g) {
            viewPager2.m1562e(i, true);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m2045f() {
        int iMo1762a;
        ViewPager2 viewPager2 = this.f2430a;
        int i = R.id.accessibilityActionPageLeft;
        afq.m546f(viewPager2, R.id.accessibilityActionPageLeft);
        afq.m546f(viewPager2, R.id.accessibilityActionPageRight);
        afq.m546f(viewPager2, R.id.accessibilityActionPageUp);
        afq.m546f(viewPager2, R.id.accessibilityActionPageDown);
        if (this.f2430a.m1559b() == null || (iMo1762a = this.f2430a.m1559b().mo1762a()) == 0) {
            return;
        }
        ViewPager2 viewPager3 = this.f2430a;
        if (viewPager3.f1672g) {
            if (viewPager3.m1558a() != 0) {
                if (this.f2430a.f1667b < iMo1762a - 1) {
                    afq.m549i(viewPager2, new agr(R.id.accessibilityActionPageDown, (CharSequence) null), this.f2432c);
                }
                if (this.f2430a.f1667b > 0) {
                    afq.m549i(viewPager2, new agr(R.id.accessibilityActionPageUp, (CharSequence) null), this.f2433d);
                    return;
                }
                return;
            }
            boolean zM1564g = this.f2430a.m1564g();
            int i2 = true != zM1564g ? R.id.accessibilityActionPageRight : R.id.accessibilityActionPageLeft;
            if (true == zM1564g) {
                i = R.id.accessibilityActionPageRight;
            }
            if (this.f2430a.f1667b < iMo1762a - 1) {
                afq.m549i(viewPager2, new agr(i2, (CharSequence) null), this.f2432c);
            }
            if (this.f2430a.f1667b > 0) {
                afq.m549i(viewPager2, new agr(i, (CharSequence) null), this.f2433d);
            }
        }
    }
}
