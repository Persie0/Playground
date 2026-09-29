package p000;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: loaded from: classes2.dex */
public final class ww2 extends qn3 {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ xw2 f67407g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww2(xw2 xw2Var) {
        super(5);
        this.f67407g = xw2Var;
    }

    @Override // p000.qn3
    /* JADX INFO: renamed from: C */
    public final boolean mo1757C(int i, int i2, Bundle bundle) {
        int i3;
        xw2 xw2Var = this.f67407g;
        View view = xw2Var.f68898i;
        if (i == -1) {
            return view.performAccessibilityAction(i2, bundle);
        }
        if (i2 == 1) {
            return xw2Var.m24722v(i);
        }
        if (i2 == 2) {
            return xw2Var.m24716j(i);
        }
        if (i2 != 64) {
            if (i2 != 128) {
                return xw2Var.mo4269r(i, i2, bundle);
            }
            if (xw2Var.f68900k != i) {
                return false;
            }
            xw2Var.f68900k = Integer.MIN_VALUE;
            view.invalidate();
            xw2Var.m24723w(i, 65536);
            return true;
        }
        AccessibilityManager accessibilityManager = xw2Var.f68897h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = xw2Var.f68900k) == i) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            xw2Var.f68900k = Integer.MIN_VALUE;
            view.invalidate();
            xw2Var.m24723w(i3, 65536);
        }
        xw2Var.f68900k = i;
        view.invalidate();
        xw2Var.m24723w(i, 32768);
        return true;
    }

    @Override // p000.qn3
    /* JADX INFO: renamed from: l */
    public final C0797b4 mo1759l(int i) {
        return new C0797b4(AccessibilityNodeInfo.obtain(this.f67407g.m24721q(i).f7900a));
    }

    @Override // p000.qn3
    /* JADX INFO: renamed from: o */
    public final C0797b4 mo1760o(int i) {
        xw2 xw2Var = this.f67407g;
        int i2 = i == 2 ? xw2Var.f68900k : xw2Var.f68901l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return mo1759l(i2);
    }
}
