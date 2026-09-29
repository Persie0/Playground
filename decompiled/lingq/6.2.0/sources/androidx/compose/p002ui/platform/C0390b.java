package androidx.compose.p002ui.platform;

import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.p002ui.focus.C0301c;
import androidx.compose.p002ui.focus.C0302d;
import androidx.compose.p002ui.layout.AbstractC0343j;
import androidx.compose.p002ui.node.AbstractC0362l;
import androidx.compose.p002ui.node.InterfaceC0354d;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.ahd;
import p000.c7b;
import p000.chd;
import p000.ct5;
import p000.d16;
import p000.e28;
import p000.ea2;
import p000.gi4;
import p000.h28;
import p000.h66;
import p000.hi0;
import p000.it5;
import p000.jt5;
import p000.l87;
import p000.n66;
import p000.n6b;
import p000.o6b;
import p000.o93;
import p000.ov8;
import p000.p6b;
import p000.pba;
import p000.rh4;
import p000.s93;
import p000.t56;
import p000.t66;
import p000.tv8;
import p000.ui3;
import p000.vi3;
import p000.vk5;
import p000.xc9;
import p000.xfa;
import p000.zgd;

/* JADX INFO: renamed from: androidx.compose.ui.platform.b */
/* JADX INFO: loaded from: classes.dex */
public final class C0390b extends d16 implements hi0, ov8, gi4, InterfaceC0354d, pba, ea2 {

    /* JADX INFO: renamed from: J */
    public final vi3 f4633J = new vi3() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$rulerLambda$1
        {
            super(1);
        }

        @Override // p000.vi3
        public final Object invoke(Object obj) {
            vk5 vk5Var = (vk5) obj;
            ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4471b.f4634K;
            if (viewTreeObserverOnGlobalLayoutListenerC0391c.getInsetsListener().f55648g.m21222h() > 0) {
                t56 t56Var = p6b.f55667a;
                long jMo1687j = vk5Var.m23362b().mo1687j();
                n66 n66Var = viewTreeObserverOnGlobalLayoutListenerC0391c.getInsetsListener().f55647f;
                int i = (int) (jMo1687j >> 32);
                int i2 = (int) (jMo1687j & 4294967295L);
                for (n6b n6bVar : p6b.f55668b) {
                    Object objM17255g = n66Var.m17255g(n6bVar);
                    objM17255g.getClass();
                    c7b c7bVar = (c7b) objM17255g;
                    p6b.m18931a(vk5Var, ((o6b) n6bVar).f53911c, c7bVar.f9676h, i, i2);
                    if (((Boolean) ((xc9) c7bVar.f9670b).getValue()).booleanValue()) {
                        p6b.m18931a(vk5Var, c7bVar.f9674f, c7bVar.f9678j, i, i2);
                        p6b.m18931a(vk5Var, c7bVar.f9675g, c7bVar.f9679k, i, i2);
                    }
                    p6b.m18931a(vk5Var, ((o6b) n6bVar).f53912d, c7bVar.f9677i, i, i2);
                }
                h66 h66Var = viewTreeObserverOnGlobalLayoutListenerC0391c.getInsetsListener().f55649h;
                if (h66Var.m720e()) {
                    SnapshotStateList snapshotStateList = viewTreeObserverOnGlobalLayoutListenerC0391c.getInsetsListener().f55650i;
                    Object[] objArr = h66Var.f1293a;
                    int i3 = h66Var.f1294b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        t66 t66Var = (t66) objArr[i4];
                        h28 h28Var = (h28) snapshotStateList.get(i4);
                        Rect rect = (Rect) t66Var.getValue();
                        vk5Var.m23363c(h28Var.mo1483b(), rect.left);
                        vk5Var.m23363c(h28Var.mo1484c(), rect.top);
                        vk5Var.m23363c(h28Var.mo1485d(), rect.right);
                        vk5Var.m23363c(h28Var.mo1482a(), rect.bottom);
                    }
                }
            }
            return xfa.f68157a;
        }
    };

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC0391c f4634K;

    public C0390b(ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c) {
        this.f4634K = viewTreeObserverOnGlobalLayoutListenerC0391c;
    }

    @Override // p000.ov8
    /* JADX INFO: renamed from: H0 */
    public final void mo787H0(tv8 tv8Var) {
    }

    @Override // p000.gi4
    /* JADX INFO: renamed from: I */
    public final boolean mo788I(KeyEvent keyEvent) {
        final o93 o93Var;
        int[] iArr = s93.f60554a;
        long jM4667a = chd.m4667a(keyEvent);
        int i = rh4.f59280O;
        if (rh4.m20661a(jM4667a, zgd.m25650u())) {
            o93Var = new o93(2);
        } else if (rh4.m20661a(jM4667a, zgd.m25649t())) {
            o93Var = new o93(1);
        } else if (rh4.m20661a(jM4667a, zgd.m25625J())) {
            o93Var = new o93(chd.m4673g(keyEvent) ? 2 : 1);
        } else if (rh4.m20661a(jM4667a, zgd.m25641l())) {
            o93Var = new o93(4);
        } else if (rh4.m20661a(jM4667a, zgd.m25640k())) {
            o93Var = new o93(3);
        } else if (rh4.m20661a(jM4667a, zgd.m25642m()) || rh4.m20661a(jM4667a, zgd.m25622G())) {
            o93Var = new o93(5);
        } else if (rh4.m20661a(jM4667a, zgd.m25639j()) || rh4.m20661a(jM4667a, zgd.m25621F())) {
            o93Var = new o93(6);
        } else if (rh4.m20661a(jM4667a, zgd.m25638i()) || rh4.m20661a(jM4667a, zgd.m25643n()) || rh4.m20661a(jM4667a, zgd.m25655z())) {
            o93Var = new o93(7);
        } else {
            o93Var = (rh4.m20661a(jM4667a, zgd.m25631b()) || rh4.m20661a(jM4667a, zgd.m25644o())) ? new o93(8) : null;
        }
        if (o93Var != null) {
            int i2 = o93Var.f54076a;
            if (ahd.m421a(chd.m4668b(keyEvent), 2)) {
                ViewTreeObserverOnGlobalLayoutListenerC0391c viewTreeObserverOnGlobalLayoutListenerC0391c = this.f4634K;
                C0302d c0302dM1362h = ((C0301c) viewTreeObserverOnGlobalLayoutListenerC0391c.getFocusOwner()).m1362h();
                if (c0302dM1362h == null || !c0302dM1362h.f3914J || !viewTreeObserverOnGlobalLayoutListenerC0391c.m1726B(i2)) {
                    Boolean boolM1361g = ((C0301c) viewTreeObserverOnGlobalLayoutListenerC0391c.getFocusOwner()).m1361g(i2, viewTreeObserverOnGlobalLayoutListenerC0391c.getEmbeddedViewFocusRect(), new vi3() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$onKeyEvent$focusWasMovedOrCancelled$1
                        {
                            super(1);
                        }

                        @Override // p000.vi3
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(((C0302d) obj).m1375g1(o93Var.f54076a));
                        }
                    });
                    if (!(boolM1361g != null ? boolM1361g.booleanValue() : true)) {
                        if (i2 == 1 || i2 == 2) {
                            Integer numM21167c = s93.m21167c(i2);
                            int iIntValue = numM21167c != null ? numM21167c.intValue() : 2;
                            FocusFinder focusFinder = FocusFinder.getInstance();
                            View rootView = viewTreeObserverOnGlobalLayoutListenerC0391c.getRootView();
                            rootView.getClass();
                            View viewFindNextFocus = focusFinder.findNextFocus((ViewGroup) rootView, viewTreeObserverOnGlobalLayoutListenerC0391c.getView(), iIntValue);
                            if (viewFindNextFocus == null || viewFindNextFocus.equals(viewTreeObserverOnGlobalLayoutListenerC0391c)) {
                                return ((C0301c) viewTreeObserverOnGlobalLayoutListenerC0391c.getFocusOwner()).m1364j(i2);
                            }
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // androidx.compose.p002ui.node.InterfaceC0354d
    /* JADX INFO: renamed from: f */
    public final it5 mo575f(jt5 jt5Var, ct5 ct5Var, long j) {
        final l87 l87VarMo1514r = ct5Var.mo1514r(j);
        return jt5Var.mo1623M(l87VarMo1514r.f49301a, l87VarMo1514r.f49302b, AbstractC3194a.m15360M(), this.f4633J, new vi3() { // from class: androidx.compose.ui.platform.AndroidComposeView$RootModifierNode$measure$1
            {
                super(1);
            }

            @Override // p000.vi3
            public final Object invoke(Object obj) {
                ((AbstractC0343j) obj).m1530f(l87VarMo1514r, 0, 0, 0.0f);
                return xfa.f68157a;
            }
        });
    }

    @Override // p000.hi0
    /* JADX INFO: renamed from: m0 */
    public final Object mo1048m0(AbstractC0362l abstractC0362l, ui3 ui3Var, ContinuationImpl continuationImpl) {
        long jMo1671R = abstractC0362l.mo1671R(0L);
        e28 e28Var = (e28) ui3Var.mo0a();
        e28 e28VarM10810k = e28Var != null ? e28Var.m10810k(jMo1671R) : null;
        if (e28VarM10810k != null) {
            this.f4634K.requestRectangleOnScreen(new Rect((int) e28VarM10810k.f36620a, (int) e28VarM10810k.f36621b, (int) e28VarM10810k.f36622c, (int) e28VarM10810k.f36623d), false);
        }
        return xfa.f68157a;
    }

    @Override // p000.gi4
    /* JADX INFO: renamed from: n */
    public final boolean mo801n(KeyEvent keyEvent) {
        return false;
    }

    @Override // p000.pba
    /* JADX INFO: renamed from: r */
    public final Object mo956r() {
        return "androidx.compose.ui.layout.WindowInsetsRulers";
    }
}
