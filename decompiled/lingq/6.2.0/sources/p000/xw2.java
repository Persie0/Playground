package p000;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public abstract class xw2 extends C3133j3 {

    /* JADX INFO: renamed from: I */
    public static final Rect f68889I = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

    /* JADX INFO: renamed from: J */
    public static final to2 f68890J = new to2();

    /* JADX INFO: renamed from: K */
    public static final a3d f68891K = new a3d();

    /* JADX INFO: renamed from: h */
    public final AccessibilityManager f68897h;

    /* JADX INFO: renamed from: i */
    public final View f68898i;

    /* JADX INFO: renamed from: j */
    public ww2 f68899j;

    /* JADX INFO: renamed from: d */
    public final Rect f68893d = new Rect();

    /* JADX INFO: renamed from: e */
    public final Rect f68894e = new Rect();

    /* JADX INFO: renamed from: f */
    public final Rect f68895f = new Rect();

    /* JADX INFO: renamed from: g */
    public final int[] f68896g = new int[2];

    /* JADX INFO: renamed from: k */
    public int f68900k = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: l */
    public int f68901l = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: H */
    public int f68892H = Integer.MIN_VALUE;

    public xw2(View view) {
        this.f68898i = view;
        this.f68897h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: b */
    public final qn3 mo1782b(View view) {
        if (this.f68899j == null) {
            this.f68899j = new ww2(this);
        }
        return this.f68899j;
    }

    @Override // p000.C3133j3
    /* JADX INFO: renamed from: d */
    public final void mo6010d(View view, C0797b4 c0797b4) {
        this.f44987a.onInitializeAccessibilityNodeInfo(view, c0797b4.f7900a);
        mo4270s(c0797b4);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m24716j(int i) {
        if (this.f68901l != i) {
            return false;
        }
        this.f68901l = Integer.MIN_VALUE;
        mo4272u(i, false);
        m24723w(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final AccessibilityEvent m24717k(int i, int i2) {
        View view = this.f68898i;
        if (i == -1) {
            AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
            return accessibilityEventObtain;
        }
        AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain(i2);
        C0797b4 c0797b4M24721q = m24721q(i);
        accessibilityEventObtain2.getText().add(c0797b4M24721q.m3276g());
        AccessibilityNodeInfo accessibilityNodeInfo = c0797b4M24721q.f7900a;
        accessibilityEventObtain2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityEventObtain2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityEventObtain2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityEventObtain2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityEventObtain2.setChecked(accessibilityNodeInfo.isChecked());
        if (accessibilityEventObtain2.getText().isEmpty() && accessibilityEventObtain2.getContentDescription() == null) {
            ho2.m13385e("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            return null;
        }
        accessibilityEventObtain2.setClassName(accessibilityNodeInfo.getClassName());
        accessibilityEventObtain2.setSource(view, i);
        accessibilityEventObtain2.setPackageName(view.getContext().getPackageName());
        return accessibilityEventObtain2;
    }

    /* JADX INFO: renamed from: l */
    public final C0797b4 m24718l(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C0797b4 c0797b4 = new C0797b4(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c0797b4.m3279j("android.view.View");
        Rect rect = f68889I;
        c0797b4.m3277h(rect);
        c0797b4.m3278i(rect);
        c0797b4.f7901b = -1;
        View view = this.f68898i;
        accessibilityNodeInfoObtain.setParent(view);
        mo4271t(i, c0797b4);
        if (c0797b4.m3276g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            ho2.m13385e("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
            return null;
        }
        Rect rect2 = this.f68894e;
        accessibilityNodeInfoObtain.getBoundsInParent(rect2);
        Rect rect3 = this.f68893d;
        c0797b4.m3275f(rect3);
        if (rect2.equals(rect) && rect3.equals(rect)) {
            ho2.m13385e("Callbacks must set parent bounds or screen bounds in populateNodeForVirtualViewId()");
            return null;
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            ho2.m13385e("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        if ((actions & 128) != 0) {
            ho2.m13385e("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            return null;
        }
        accessibilityNodeInfoObtain.setPackageName(view.getContext().getPackageName());
        c0797b4.f7902c = i;
        accessibilityNodeInfoObtain.setSource(view, i);
        if (this.f68900k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c0797b4.m3271a(128);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c0797b4.m3271a(64);
        }
        boolean z = this.f68901l == i;
        if (z) {
            c0797b4.m3271a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c0797b4.m3271a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.f68896g;
        view.getLocationOnScreen(iArr);
        if (rect3.equals(rect)) {
            c0797b4.m3277h(rect2);
            Rect rect4 = new Rect();
            rect4.set(rect2);
            if (c0797b4.f7901b != -1) {
                C0797b4 c0797b5 = new C0797b4(AccessibilityNodeInfo.obtain());
                Rect rect5 = new Rect();
                for (int i2 = c0797b4.f7901b; i2 != -1; i2 = c0797b5.f7901b) {
                    c0797b5.f7901b = -1;
                    AccessibilityNodeInfo accessibilityNodeInfo = c0797b5.f7900a;
                    accessibilityNodeInfo.setParent(view, -1);
                    c0797b5.m3277h(rect);
                    mo4271t(i2, c0797b5);
                    accessibilityNodeInfo.getBoundsInParent(rect5);
                    rect4.offset(rect5.left, rect5.top);
                }
            }
            view.getLocationOnScreen(iArr);
            rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            c0797b4.m3278i(rect4);
            c0797b4.m3275f(rect3);
        }
        Rect rect6 = this.f68895f;
        if (view.getLocalVisibleRect(rect6)) {
            rect6.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
            if (rect3.intersect(rect6)) {
                c0797b4.m3278i(rect3);
                if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                    Object parent = view.getParent();
                    while (parent instanceof View) {
                        View view2 = (View) parent;
                        if (view2.getAlpha() > 0.0f && view2.getVisibility() == 0) {
                            parent = view2.getParent();
                        }
                    }
                    if (parent != null) {
                        c0797b4.f7900a.setVisibleToUser(true);
                    }
                }
            }
        }
        return c0797b4;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m24719m(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.f68897h;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int iMo4267n = mo4267n(motionEvent.getX(), motionEvent.getY());
            int i2 = this.f68892H;
            if (i2 != iMo4267n) {
                this.f68892H = iMo4267n;
                m24723w(iMo4267n, 128);
                m24723w(i2, 256);
            }
            if (iMo4267n == Integer.MIN_VALUE) {
                return false;
            }
        } else {
            if (action != 10 || (i = this.f68892H) == Integer.MIN_VALUE) {
                return false;
            }
            if (i != Integer.MIN_VALUE) {
                this.f68892H = Integer.MIN_VALUE;
                m24723w(Integer.MIN_VALUE, 128);
                m24723w(i, 256);
                return true;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: n */
    public abstract int mo4267n(float f, float f2);

    /* JADX INFO: renamed from: o */
    public abstract void mo4268o(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:67:0x0147  */
    /* JADX INFO: renamed from: p */
    public final boolean m24720p(int i, Rect rect) {
        int i2;
        Object obj;
        C0797b4 c0797b4;
        ArrayList arrayList = new ArrayList();
        mo4268o(arrayList);
        pe9 pe9Var = new pe9(0);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            pe9Var.m19080d(((Integer) arrayList.get(i3)).intValue(), m24718l(((Integer) arrayList.get(i3)).intValue()));
        }
        int i4 = this.f68901l;
        int iM19079c = Integer.MIN_VALUE;
        C0797b4 c0797b5 = i4 == Integer.MIN_VALUE ? null : (C0797b4) pe9Var.m19078b(i4);
        to2 to2Var = f68890J;
        a3d a3dVar = f68891K;
        View view = this.f68898i;
        int i5 = -1;
        if (i == 1 || i == 2) {
            boolean z = view.getLayoutDirection() == 1;
            a3dVar.getClass();
            int iM19081e = pe9Var.m19081e();
            ArrayList arrayList2 = new ArrayList(iM19081e);
            for (int i6 = 0; i6 < iM19081e; i6++) {
                arrayList2.add((C0797b4) pe9Var.m19082f(i6));
            }
            Collections.sort(arrayList2, new ga3(z, to2Var));
            if (i == 1) {
                i2 = 0;
                int size = arrayList2.size();
                if (c0797b5 != null) {
                    size = arrayList2.indexOf(c0797b5);
                }
                int i7 = size - 1;
                obj = i7 >= 0 ? arrayList2.get(i7) : null;
            } else {
                if (i != 2) {
                    C3386nv.m17626m("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                    return false;
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c0797b5 == null ? -1 : arrayList2.lastIndexOf(c0797b5)) + 1;
                obj = iLastIndexOf < size2 ? arrayList2.get(iLastIndexOf) : null;
                i2 = 0;
            }
            c0797b4 = (C0797b4) obj;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                C3386nv.m17626m("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                return false;
            }
            Rect rect2 = new Rect();
            int i8 = this.f68901l;
            if (i8 != Integer.MIN_VALUE) {
                m24721q(i8).m3275f(rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                int width = view.getWidth();
                int height = view.getHeight();
                if (i == 17) {
                    rect2.set(width, 0, width, height);
                } else if (i == 33) {
                    rect2.set(0, height, width, height);
                } else if (i == 66) {
                    rect2.set(-1, 0, -1, height);
                } else {
                    if (i != 130) {
                        C3386nv.m17626m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        return false;
                    }
                    rect2.set(0, -1, width, -1);
                }
            }
            Rect rect3 = new Rect(rect2);
            if (i == 17) {
                rect3.offset(rect2.width() + 1, 0);
            } else if (i == 33) {
                rect3.offset(0, rect2.height() + 1);
            } else if (i == 66) {
                rect3.offset(-(rect2.width() + 1), 0);
            } else {
                if (i != 130) {
                    C3386nv.m17626m("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    return false;
                }
                rect3.offset(0, -(rect2.height() + 1));
            }
            a3dVar.getClass();
            int iM19081e2 = pe9Var.m19081e();
            Rect rect4 = new Rect();
            c0797b4 = null;
            for (int i9 = 0; i9 < iM19081e2; i9++) {
                C0797b4 c0797b6 = (C0797b4) pe9Var.m19082f(i9);
                if (c0797b6 != c0797b5) {
                    to2Var.getClass();
                    c0797b6.m3275f(rect4);
                    if (sdd.m21276c(i, rect2, rect4)) {
                        if (!sdd.m21276c(i, rect2, rect3) || sdd.m21274a(i, rect2, rect4, rect3)) {
                            rect3.set(rect4);
                            c0797b4 = c0797b6;
                        } else if (!sdd.m21274a(i, rect2, rect3, rect4)) {
                            int iM21277d = sdd.m21277d(i, rect2, rect4);
                            int iM21278e = sdd.m21278e(i, rect2, rect4);
                            int i10 = (iM21278e * iM21278e) + (iM21277d * 13 * iM21277d);
                            int iM21277d2 = sdd.m21277d(i, rect2, rect3);
                            int iM21278e2 = sdd.m21278e(i, rect2, rect3);
                            if (i10 < (iM21278e2 * iM21278e2) + (iM21277d2 * 13 * iM21277d2)) {
                                rect3.set(rect4);
                                c0797b4 = c0797b6;
                            }
                        }
                    }
                }
            }
            i2 = 0;
        }
        C0797b4 c0797b7 = c0797b4;
        if (c0797b7 != null) {
            if (pe9Var.f56013a) {
                AbstractC3122is.m14091e(pe9Var);
            }
            int i11 = pe9Var.f56016d;
            for (int i12 = i2; i12 < i11; i12++) {
                if (pe9Var.f56015c[i12] == c0797b7) {
                    i5 = i12;
                    break;
                }
            }
            iM19079c = pe9Var.m19079c(i5);
        }
        return m24722v(iM19079c);
    }

    /* JADX INFO: renamed from: q */
    public final C0797b4 m24721q(int i) {
        if (i != -1) {
            return m24718l(i);
        }
        View view = this.f68898i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(view);
        C0797b4 c0797b4 = new C0797b4(accessibilityNodeInfoObtain);
        WeakHashMap weakHashMap = dta.f36217a;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        mo4268o(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            ho2.m13385e("Views cannot have both real and virtual children");
            return null;
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c0797b4.f7900a.addChild(view, ((Integer) arrayList.get(i2)).intValue());
        }
        return c0797b4;
    }

    /* JADX INFO: renamed from: r */
    public abstract boolean mo4269r(int i, int i2, Bundle bundle);

    /* JADX INFO: renamed from: s */
    public void mo4270s(C0797b4 c0797b4) {
    }

    /* JADX INFO: renamed from: t */
    public abstract void mo4271t(int i, C0797b4 c0797b4);

    /* JADX INFO: renamed from: u */
    public void mo4272u(int i, boolean z) {
    }

    /* JADX INFO: renamed from: v */
    public final boolean m24722v(int i) {
        int i2;
        View view = this.f68898i;
        if ((!view.isFocused() && !view.requestFocus()) || (i2 = this.f68901l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            m24716j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.f68901l = i;
        mo4272u(i, true);
        m24723w(i, 8);
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m24723w(int i, int i2) {
        View view;
        ViewParent parent;
        if (i == Integer.MIN_VALUE || !this.f68897h.isEnabled() || (parent = (view = this.f68898i).getParent()) == null) {
            return;
        }
        parent.requestSendAccessibilityEvent(view, m24717k(i, i2));
    }
}
