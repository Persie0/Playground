package p000;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aes {

    /* JADX INFO: renamed from: a */
    public boolean f258a;

    /* JADX INFO: renamed from: b */
    private ViewParent f259b;

    /* JADX INFO: renamed from: c */
    private ViewParent f260c;

    /* JADX INFO: renamed from: d */
    private final View f261d;

    /* JADX INFO: renamed from: e */
    private int[] f262e;

    public aes(View view) {
        this.f261d = view;
    }

    /* JADX INFO: renamed from: j */
    private final ViewParent m380j(int i) {
        switch (i) {
            case 0:
                return this.f259b;
            default:
                return this.f260c;
        }
    }

    /* JADX INFO: renamed from: k */
    private final void m381k(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f259b = viewParent;
                break;
            default:
                this.f260c = viewParent;
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    private final int[] m382l() {
        if (this.f262e == null) {
            this.f262e = new int[2];
        }
        return this.f262e;
    }

    /* JADX INFO: renamed from: a */
    public final void m383a(boolean z) {
        if (this.f258a) {
            afh.m487r(this.f261d);
        }
        this.f258a = z;
    }

    /* JADX INFO: renamed from: b */
    public final void m384b(int i) {
        ViewParent viewParentM380j = m380j(i);
        if (viewParentM380j != null) {
            abk.m128k(viewParentM380j, this.f261d, i);
            m381k(i, null);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m385c(float f, float f2, boolean z) {
        ViewParent viewParent;
        if (!this.f258a || (viewParent = this.f259b) == null) {
            return false;
        }
        return abk.m129l(viewParent, this.f261d, f, f2, z);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m386d(float f, float f2) {
        ViewParent viewParent;
        if (!this.f258a || (viewParent = this.f259b) == null) {
            return false;
        }
        return abk.m130m(viewParent, this.f261d, f, f2);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m387e(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent viewParentM380j;
        int i4;
        int i5;
        int i6;
        if (!this.f258a || (viewParentM380j = m380j(i3)) == null) {
            return false;
        }
        if (i != 0) {
            i4 = i;
        } else {
            if (i2 == 0) {
                if (iArr2 != null) {
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                }
                return false;
            }
            i4 = 0;
        }
        if (iArr2 != null) {
            this.f261d.getLocationInWindow(iArr2);
            i5 = iArr2[0];
            i6 = iArr2[1];
        } else {
            i5 = 0;
            i6 = 0;
        }
        if (iArr == null) {
            iArr = m382l();
        }
        iArr[0] = 0;
        iArr[1] = 0;
        abk.m125h(viewParentM380j, this.f261d, i4, i2, iArr, i3);
        if (iArr2 != null) {
            this.f261d.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i5;
            iArr2[1] = iArr2[1] - i6;
        }
        return (iArr[0] == 0 && iArr[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m388f(int i, int i2, int i3, int i4, int[] iArr) {
        return m389g(i, i2, i3, i4, iArr, 0, null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m389g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM380j;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int[] iArr3;
        if (!this.f258a || (viewParentM380j = m380j(i5)) == null) {
            return false;
        }
        if (i != 0) {
            i6 = i;
            i7 = i2;
            i8 = i3;
        } else if (i2 != 0) {
            i7 = i2;
            i8 = i3;
            i6 = 0;
        } else if (i3 != 0) {
            i8 = i3;
            i6 = 0;
            i7 = 0;
        } else {
            if (i4 == 0) {
                if (iArr != null) {
                    iArr[0] = 0;
                    iArr[1] = 0;
                }
                return false;
            }
            i6 = 0;
            i7 = 0;
            i8 = 0;
        }
        if (iArr != null) {
            this.f261d.getLocationInWindow(iArr);
            i9 = iArr[0];
            i10 = iArr[1];
        } else {
            i9 = 0;
            i10 = 0;
        }
        if (iArr2 == null) {
            int[] iArrM382l = m382l();
            iArrM382l[0] = 0;
            iArrM382l[1] = 0;
            iArr3 = iArrM382l;
        } else {
            iArr3 = iArr2;
        }
        abk.m126i(viewParentM380j, this.f261d, i6, i7, i8, i4, i5, iArr3);
        if (iArr != null) {
            this.f261d.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i9;
            iArr[1] = iArr[1] - i10;
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m390h(int i) {
        return m380j(i) != null;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m391i(int i, int i2) {
        if (m390h(i2)) {
            return true;
        }
        if (!this.f258a) {
            return false;
        }
        View view = this.f261d;
        for (ViewParent parent = this.f261d.getParent(); parent != null; parent = parent.getParent()) {
            if (abk.m131n(parent, view, this.f261d, i, i2)) {
                m381k(i2, parent);
                abk.m127j(parent, view, this.f261d, i, i2);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }
}
