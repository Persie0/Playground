package androidx.compose.p002ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.compose.p002ui.focus.AbstractC0303e;
import androidx.compose.p002ui.focus.C0301c;
import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.focus.InterfaceC0300b;
import androidx.compose.p002ui.node.Owner;
import androidx.compose.p002ui.platform.ViewTreeObserverOnGlobalLayoutListenerC0391c;
import p000.AbstractC3695vr;
import p000.C3386nv;
import p000.bq1;
import p000.d16;
import p000.e28;
import p000.fa2;
import p000.i54;
import p000.om0;
import p000.qdd;
import p000.s93;
import p000.te1;
import p000.vi3;
import p000.w93;
import p000.x66;
import p000.xfa;
import p000.y93;

/* JADX INFO: renamed from: androidx.compose.ui.viewinterop.g */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewTreeObserverOnGlobalFocusChangeListenerC0447g extends d16 implements y93, ViewTreeObserver.OnGlobalFocusChangeListener {

    /* JADX INFO: renamed from: J */
    public View f5207J;

    /* JADX INFO: renamed from: K */
    public ViewTreeObserver f5208K;

    /* JADX INFO: renamed from: L */
    public final vi3 f5209L = new vi3() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onEnter$1
        {
            super(1);
        }

        @Override // p000.vi3
        public final Object invoke(Object obj) {
            om0 om0Var = (om0) obj;
            ViewTreeObserverOnGlobalFocusChangeListenerC0447g viewTreeObserverOnGlobalFocusChangeListenerC0447g = this.f5161b;
            View viewM19874a = qdd.m19874a(viewTreeObserverOnGlobalFocusChangeListenerC0447g);
            if (!viewM19874a.isFocused() && !viewM19874a.hasFocus()) {
                InterfaceC0300b focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(viewTreeObserverOnGlobalFocusChangeListenerC0447g)).getFocusOwner();
                View viewM4067t0 = bq1.m4067t0(viewTreeObserverOnGlobalFocusChangeListenerC0447g);
                Integer numM21167c = s93.m21167c(om0Var.f54562a);
                int[] iArr = new int[2];
                viewM4067t0.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewM19874a.getLocationOnScreen(iArr2);
                C0302d c0302dM23497h = AbstractC3695vr.m23497h(((C0301c) focusOwner).f3908c);
                Rect rect = null;
                e28 e28VarM23500k = c0302dM23497h != null ? AbstractC3695vr.m23500k(c0302dM23497h) : null;
                if (e28VarM23500k != null) {
                    int i = (int) e28VarM23500k.f36620a;
                    int i2 = iArr[0];
                    int i3 = iArr2[0];
                    int i4 = (int) e28VarM23500k.f36621b;
                    int i5 = iArr[1];
                    int i6 = iArr2[1];
                    rect = new Rect((i + i2) - i3, (i4 + i5) - i6, (((int) e28VarM23500k.f36622c) + i2) - i3, (((int) e28VarM23500k.f36623d) + i5) - i6);
                }
                if (!s93.m21166b(viewM19874a, numM21167c, rect)) {
                    om0Var.f54563b = true;
                }
            }
            return xfa.f68157a;
        }
    };

    /* JADX INFO: renamed from: M */
    public final vi3 f5210M = new vi3() { // from class: androidx.compose.ui.viewinterop.FocusGroupPropertiesNode$onExit$1
        {
            super(1);
        }

        @Override // p000.vi3
        public final Object invoke(Object obj) {
            qdd.m19874a(this.f5162b);
            return xfa.f68157a;
        }
    };

    @Override // p000.y93
    /* JADX INFO: renamed from: H */
    public final void mo1893H(w93 w93Var) {
        w93Var.mo15334d(false);
        w93Var.mo23815a(this.f5209L);
        w93Var.mo23816c(this.f5210M);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: R0 */
    public final void mo36R0() {
        ViewTreeObserver viewTreeObserver = bq1.m4067t0(this).getViewTreeObserver();
        this.f5208K = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // p000.d16
    /* JADX INFO: renamed from: S0 */
    public final void mo37S0() {
        ViewTreeObserver viewTreeObserver = this.f5208K;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.f5208K = null;
        bq1.m4067t0(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.f5207J = null;
    }

    /* JADX INFO: renamed from: Z0 */
    public final C0302d m1894Z0() {
        boolean z;
        if (!this.f34837a.f34836I) {
            i54.m13663b("visitLocalDescendants called on an unattached node");
        }
        d16 d16Var = this.f34837a;
        if ((d16Var.f34840d & 1024) != 0) {
            boolean z2 = false;
            for (d16 d16Var2 = d16Var.f34842f; d16Var2 != null; d16Var2 = d16Var2.f34842f) {
                if ((d16Var2.f34839c & 1024) != 0) {
                    d16 d16VarM21992f = d16Var2;
                    x66 x66Var = null;
                    while (d16VarM21992f != null) {
                        if (d16VarM21992f instanceof C0302d) {
                            C0302d c0302d = (C0302d) d16VarM21992f;
                            if (z2) {
                                return c0302d;
                            }
                            z = false;
                            z2 = true;
                        } else {
                            z = true;
                        }
                        if (z && (d16VarM21992f.f34839c & 1024) != 0 && (d16VarM21992f instanceof fa2)) {
                            int i = 0;
                            for (d16 d16Var3 = ((fa2) d16VarM21992f).f38701K; d16Var3 != null; d16Var3 = d16Var3.f34842f) {
                                if ((d16Var3.f34839c & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        d16VarM21992f = d16Var3;
                                    } else {
                                        if (x66Var == null) {
                                            x66Var = new x66(new d16[16]);
                                        }
                                        if (d16VarM21992f != null) {
                                            x66Var.m24305c(d16VarM21992f);
                                            d16VarM21992f = null;
                                        }
                                        x66Var.m24305c(d16Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        d16VarM21992f = te1.m21992f(x66Var);
                    }
                }
            }
        }
        C3386nv.m17633t("Could not find focus target of embedded view wrapper");
        return null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        boolean z;
        if (te1.m21979L(this).f4316I == null) {
            return;
        }
        View viewM19874a = qdd.m19874a(this);
        InterfaceC0300b focusOwner = ((ViewTreeObserverOnGlobalLayoutListenerC0391c) te1.m21980M(this)).getFocusOwner();
        Owner ownerM21980M = te1.m21980M(this);
        boolean z2 = true;
        if (view != null && !view.equals(ownerM21980M)) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    z = false;
                    break;
                } else {
                    if (parent == viewM19874a.getParent()) {
                        z = true;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            z = false;
            break;
        }
        if (view2 != null && !view2.equals(ownerM21980M)) {
            ViewParent parent2 = view2.getParent();
            while (true) {
                if (parent2 == null) {
                    z2 = false;
                    break;
                } else if (parent2 == viewM19874a.getParent()) {
                    break;
                } else {
                    parent2 = parent2.getParent();
                }
            }
        } else {
            z2 = false;
            break;
        }
        if (z && z2) {
            this.f5207J = view2;
            return;
        }
        if (z2) {
            this.f5207J = view2;
            C0302d c0302dM1894Z0 = m1894Z0();
            if (c0302dM1894Z0.m1373e1().getHasFocus()) {
                return;
            }
            AbstractC0303e.m1379d(c0302dM1894Z0);
            return;
        }
        if (!z) {
            this.f5207J = null;
            return;
        }
        this.f5207J = null;
        if (m1894Z0().m1373e1().isFocused()) {
            ((C0301c) focusOwner).m1358d(8, false, false);
        }
    }
}
