package p471x2;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* JADX INFO: renamed from: x2.n */
/* JADX INFO: loaded from: classes.dex */
public final class C10052n {

    /* JADX INFO: renamed from: a */
    public ViewParent f51042a;

    /* JADX INFO: renamed from: b */
    public ViewParent f51043b;

    /* JADX INFO: renamed from: c */
    public final View f51044c;

    /* JADX INFO: renamed from: d */
    public boolean f51045d;

    /* JADX INFO: renamed from: e */
    public int[] f51046e;

    public C10052n(View view) {
        this.f51044c = view;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m18841a(float f3, float f10, boolean z10) {
        ViewParent viewParentM18846f;
        if (this.f51045d && (viewParentM18846f = m18846f(0)) != null) {
            try {
                return C10043i0.m18815a(viewParentM18846f, this.f51044c, f3, f10, z10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM18846f + " does not implement interface method onNestedFling", e10);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m18842b(float f3, float f10) {
        ViewParent viewParentM18846f;
        if (this.f51045d && (viewParentM18846f = m18846f(0)) != null) {
            try {
                return C10043i0.m18816b(viewParentM18846f, this.f51044c, f3, f10);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM18846f + " does not implement interface method onNestedPreFling", e10);
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m18843c(int i10, int i11, int i12, int[] iArr, int[] iArr2) {
        ViewParent viewParentM18846f;
        int i13;
        int i14;
        int[] iArr3;
        if (!this.f51045d || (viewParentM18846f = m18846f(i12)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.f51044c;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i13 = iArr2[0];
            i14 = iArr2[1];
        } else {
            i13 = 0;
            i14 = 0;
        }
        if (iArr == null) {
            if (this.f51046e == null) {
                this.f51046e = new int[2];
            }
            iArr3 = this.f51046e;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        View view2 = this.f51044c;
        if (viewParentM18846f instanceof InterfaceC10054o) {
            ((InterfaceC10054o) viewParentM18846f).mo974o(view2, i10, i11, iArr3, i12);
        } else if (i12 == 0) {
            try {
                C10043i0.m18817c(viewParentM18846f, view2, i10, i11, iArr3);
            } catch (AbstractMethodError e10) {
                Log.e("ViewParentCompat", "ViewParent " + viewParentM18846f + " does not implement interface method onNestedPreScroll", e10);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i13;
            iArr2[1] = iArr2[1] - i14;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    /* JADX INFO: renamed from: d */
    public final void m18844d(int i10, int i11, int i12, int[] iArr) {
        m18845e(0, i10, 0, i11, null, i12, iArr);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m18845e(int i10, int i11, int i12, int i13, int[] iArr, int i14, int[] iArr2) {
        ViewParent viewParentM18846f;
        int i15;
        int i16;
        int[] iArr3;
        if (!this.f51045d || (viewParentM18846f = m18846f(i14)) == null) {
            return false;
        }
        if (i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.f51044c;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i15 = iArr[0];
            i16 = iArr[1];
        } else {
            i15 = 0;
            i16 = 0;
        }
        if (iArr2 == null) {
            if (this.f51046e == null) {
                this.f51046e = new int[2];
            }
            int[] iArr4 = this.f51046e;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        View view2 = this.f51044c;
        if (viewParentM18846f instanceof InterfaceC10056p) {
            ((InterfaceC10056p) viewParentM18846f).mo964e(view2, i10, i11, i12, i13, i14, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i12;
            iArr3[1] = iArr3[1] + i13;
            if (viewParentM18846f instanceof InterfaceC10054o) {
                ((InterfaceC10054o) viewParentM18846f).mo970k(view2, i10, i11, i12, i13, i14);
            } else if (i14 == 0) {
                try {
                    C10043i0.m18818d(viewParentM18846f, view2, i10, i11, i12, i13);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM18846f + " does not implement interface method onNestedScroll", e10);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i15;
            iArr[1] = iArr[1] - i16;
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public final ViewParent m18846f(int i10) {
        if (i10 == 0) {
            return this.f51042a;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f51043b;
    }

    /* JADX INFO: renamed from: g */
    public final boolean m18847g(int i10, int i11) {
        boolean zM18820f;
        if (m18846f(i11) != null) {
            return true;
        }
        if (this.f51045d) {
            View view = this.f51044c;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z10 = parent instanceof InterfaceC10054o;
                if (z10) {
                    zM18820f = ((InterfaceC10054o) parent).mo971l(view2, view, i10, i11);
                } else if (i11 == 0) {
                    try {
                        zM18820f = C10043i0.m18820f(parent, view2, view, i10);
                    } catch (AbstractMethodError e10) {
                        Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e10);
                        zM18820f = false;
                    }
                } else {
                    zM18820f = false;
                }
                if (zM18820f) {
                    if (i11 == 0) {
                        this.f51042a = parent;
                    } else if (i11 == 1) {
                        this.f51043b = parent;
                    }
                    if (z10) {
                        ((InterfaceC10054o) parent).mo972m(view2, view, i10, i11);
                    } else if (i11 == 0) {
                        try {
                            C10043i0.m18819e(parent, view2, view, i10);
                        } catch (AbstractMethodError e11) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e11);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: h */
    public final void m18848h(int i10) {
        ViewParent viewParentM18846f = m18846f(i10);
        if (viewParentM18846f != null) {
            boolean z10 = viewParentM18846f instanceof InterfaceC10054o;
            View view = this.f51044c;
            if (z10) {
                ((InterfaceC10054o) viewParentM18846f).mo973n(view, i10);
            } else if (i10 == 0) {
                try {
                    C10043i0.m18821g(viewParentM18846f, view);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParentM18846f + " does not implement interface method onStopNestedScroll", e10);
                }
            }
            if (i10 == 0) {
                this.f51042a = null;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f51043b = null;
            }
        }
    }
}
