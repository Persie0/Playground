package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class sj6 {

    /* JADX INFO: renamed from: a */
    public ViewParent f60932a;

    /* JADX INFO: renamed from: b */
    public ViewParent f60933b;

    /* JADX INFO: renamed from: c */
    public final ViewGroup f60934c;

    /* JADX INFO: renamed from: d */
    public boolean f60935d;

    /* JADX INFO: renamed from: e */
    public int[] f60936e;

    public sj6(ViewGroup viewGroup) {
        this.f60934c = viewGroup;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21421a(float f, float f2, boolean z) {
        ViewParent viewParentM21428h;
        if (this.f60935d && (viewParentM21428h = m21428h(0)) != null) {
            try {
                return viewParentM21428h.onNestedFling(this.f60934c, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM21428h + " does not implement interface method onNestedFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21422b(float f, float f2) {
        ViewParent viewParentM21428h;
        if (this.f60935d && (viewParentM21428h = m21428h(0)) != null) {
            try {
                return viewParentM21428h.onNestedPreFling(this.f60934c, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM21428h + " does not implement interface method onNestedPreFling", e);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m21423c(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent viewParentM21428h;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.f60935d || (viewParentM21428h = m21428h(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        ViewGroup viewGroup = this.f60934c;
        if (iArr2 != null) {
            viewGroup.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.f60936e == null) {
                this.f60936e = new int[2];
            }
            iArr3 = this.f60936e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        if (viewParentM21428h instanceof tj6) {
            ((tj6) viewParentM21428h).mo665h(viewGroup, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                viewParentM21428h.onNestedPreScroll(viewGroup, i, i2, iArr3);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM21428h + " does not implement interface method onNestedPreScroll", e);
            }
        }
        if (iArr2 != null) {
            viewGroup = viewGroup;
            viewGroup.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        viewGroup = viewGroup;
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m21424d(int i, int i2, int[] iArr, int[] iArr2) {
        return m21423c(i, i2, 0, iArr, iArr2);
    }

    /* JADX INFO: renamed from: e */
    public final void m21425e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        m21427g(i, i2, i3, i4, iArr, i5, iArr2);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m21426f(int i, int i2, int i3, int i4, int[] iArr) {
        return m21427g(i, i2, i3, i4, iArr, 0, null);
    }

    /* JADX INFO: renamed from: g */
    public final boolean m21427g(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent viewParentM21428h;
        int i6;
        int i7;
        int[] iArr3;
        if (this.f60935d && (viewParentM21428h = m21428h(i5)) != null) {
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                ViewGroup viewGroup = this.f60934c;
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    i6 = iArr[0];
                    i7 = iArr[1];
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                if (iArr2 == null) {
                    if (this.f60936e == null) {
                        this.f60936e = new int[2];
                    }
                    int[] iArr4 = this.f60936e;
                    iArr4[0] = 0;
                    iArr4[1] = 0;
                    iArr3 = iArr4;
                } else {
                    iArr3 = iArr2;
                }
                if (viewParentM21428h instanceof uj6) {
                    ((uj6) viewParentM21428h).mo660c(viewGroup, i, i2, i3, i4, i5, iArr3);
                } else {
                    iArr3[0] = iArr3[0] + i3;
                    iArr3[1] = iArr3[1] + i4;
                    if (viewParentM21428h instanceof tj6) {
                        ((tj6) viewParentM21428h).mo661d(viewGroup, i, i2, i3, i4, i5);
                    } else if (i5 == 0) {
                        try {
                            viewParentM21428h.onNestedScroll(viewGroup, i, i2, i3, i4);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + viewParentM21428h + " does not implement interface method onNestedScroll", e);
                        }
                    }
                }
                if (iArr != null) {
                    viewGroup.getLocationInWindow(iArr);
                    iArr[0] = iArr[0] - i6;
                    iArr[1] = iArr[1] - i7;
                }
                return true;
            }
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final ViewParent m21428h(int i) {
        if (i == 0) {
            return this.f60932a;
        }
        if (i != 1) {
            return null;
        }
        return this.f60933b;
    }

    /* JADX INFO: renamed from: i */
    public final boolean m21429i() {
        return m21430j(0);
    }

    /* JADX INFO: renamed from: j */
    public final boolean m21430j(int i) {
        return m21428h(i) != null;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m21431k() {
        return this.f60935d;
    }

    /* JADX INFO: renamed from: l */
    public final void m21432l(boolean z) {
        if (this.f60935d) {
            WeakHashMap weakHashMap = dta.f36217a;
            this.f60934c.stopNestedScroll();
        }
        this.f60935d = z;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m21433m(int i) {
        return m21434n(i, 0);
    }

    /* JADX INFO: renamed from: n */
    public final boolean m21434n(int i, int i2) {
        boolean zOnStartNestedScroll;
        if (!m21430j(i2)) {
            if (this.f60935d) {
                View view = this.f60934c;
                View view2 = view;
                for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                    boolean z = parent instanceof tj6;
                    if (z) {
                        zOnStartNestedScroll = ((tj6) parent).mo662e(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            zOnStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError e) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e);
                            zOnStartNestedScroll = false;
                        }
                    } else {
                        zOnStartNestedScroll = false;
                    }
                    if (zOnStartNestedScroll) {
                        if (i2 == 0) {
                            this.f60932a = parent;
                        } else if (i2 == 1) {
                            this.f60933b = parent;
                        }
                        if (z) {
                            ((tj6) parent).mo663f(view2, view, i, i2);
                        } else if (i2 == 0) {
                            try {
                                parent.onNestedScrollAccepted(view2, view, i);
                            } catch (AbstractMethodError e2) {
                                Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e2);
                            }
                        }
                    } else {
                        if (parent instanceof View) {
                            view2 = (View) parent;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: o */
    public final void m21435o() {
        m21436p(0);
    }

    /* JADX INFO: renamed from: p */
    public final void m21436p(int i) {
        ViewParent viewParentM21428h = m21428h(i);
        if (viewParentM21428h != null) {
            boolean z = viewParentM21428h instanceof tj6;
            ViewGroup viewGroup = this.f60934c;
            if (z) {
                ((tj6) viewParentM21428h).mo664g(viewGroup, i);
            } else if (i == 0) {
                try {
                    viewParentM21428h.onStopNestedScroll(viewGroup);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM21428h + " does not implement interface method onStopNestedScroll", e);
                }
            }
            if (i == 0) {
                this.f60932a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.f60933b = null;
            }
        }
    }
}
