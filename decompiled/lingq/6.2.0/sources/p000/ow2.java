package p000;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class ow2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f55057a = 1;

    /* JADX INFO: renamed from: b */
    public int f55058b;

    /* JADX INFO: renamed from: c */
    public int f55059c;

    /* JADX INFO: renamed from: d */
    public boolean f55060d;

    /* JADX INFO: renamed from: e */
    public boolean f55061e;

    /* JADX INFO: renamed from: f */
    public Object f55062f;

    public ow2() {
        m18533d();
    }

    /* JADX INFO: renamed from: a */
    public void m18530a() {
        boolean z = this.f55060d;
        lq2 lq2Var = (lq2) this.f55062f;
        this.f55059c = z ? lq2Var.mo16451i() : lq2Var.mo16455m();
    }

    /* JADX INFO: renamed from: b */
    public void m18531b(View view, int i) {
        lq2 lq2Var = (lq2) this.f55062f;
        int iMo16456n = Integer.MIN_VALUE == lq2Var.f49997a ? 0 : lq2Var.mo16456n() - lq2Var.f49997a;
        if (iMo16456n >= 0) {
            boolean z = this.f55060d;
            lq2 lq2Var2 = (lq2) this.f55062f;
            if (z) {
                int iMo16446d = lq2Var2.mo16446d(view);
                lq2 lq2Var3 = (lq2) this.f55062f;
                this.f55059c = (Integer.MIN_VALUE != lq2Var3.f49997a ? lq2Var3.mo16456n() - lq2Var3.f49997a : 0) + iMo16446d;
            } else {
                this.f55059c = lq2Var2.mo16449g(view);
            }
            this.f55058b = i;
            return;
        }
        this.f55058b = i;
        boolean z2 = this.f55060d;
        lq2 lq2Var4 = (lq2) this.f55062f;
        if (!z2) {
            int iMo16449g = lq2Var4.mo16449g(view);
            int iMo16455m = iMo16449g - ((lq2) this.f55062f).mo16455m();
            this.f55059c = iMo16449g;
            if (iMo16455m > 0) {
                int iMo16451i = (((lq2) this.f55062f).mo16451i() - Math.min(0, (((lq2) this.f55062f).mo16451i() - iMo16456n) - ((lq2) this.f55062f).mo16446d(view))) - (((lq2) this.f55062f).mo16447e(view) + iMo16449g);
                if (iMo16451i < 0) {
                    this.f55059c -= Math.min(iMo16455m, -iMo16451i);
                    return;
                }
                return;
            }
            return;
        }
        int iMo16451i2 = (lq2Var4.mo16451i() - iMo16456n) - ((lq2) this.f55062f).mo16446d(view);
        this.f55059c = ((lq2) this.f55062f).mo16451i() - iMo16451i2;
        if (iMo16451i2 > 0) {
            int iMo16447e = this.f55059c - ((lq2) this.f55062f).mo16447e(view);
            int iMo16455m2 = ((lq2) this.f55062f).mo16455m();
            int iMin = iMo16447e - (Math.min(((lq2) this.f55062f).mo16449g(view) - iMo16455m2, 0) + iMo16455m2);
            if (iMin < 0) {
                this.f55059c = Math.min(iMo16451i2, -iMin) + this.f55059c;
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m18532c(int i) {
        this.f55060d |= i > 0;
        this.f55058b += i;
    }

    /* JADX INFO: renamed from: d */
    public void m18533d() {
        this.f55058b = -1;
        this.f55059c = Integer.MIN_VALUE;
        this.f55060d = false;
        this.f55061e = false;
    }

    public String toString() {
        switch (this.f55057a) {
            case 1:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.f55058b);
                sb.append(", mCoordinate=");
                sb.append(this.f55059c);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.f55060d);
                sb.append(", mValid=");
                return ux5.m22993p(sb, this.f55061e, '}');
            default:
                return super.toString();
        }
    }

    public ow2(k97 k97Var) {
        this.f55062f = k97Var;
    }
}
