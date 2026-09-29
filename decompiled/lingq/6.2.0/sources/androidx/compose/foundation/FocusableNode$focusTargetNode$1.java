package androidx.compose.foundation;

import androidx.compose.p002ui.focus.FocusStateImpl;
import androidx.compose.p002ui.node.AbstractC0356f;
import androidx.compose.p002ui.node.AbstractC0362l;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.C3006fm;
import p000.hu4;
import p000.oa3;
import p000.p58;
import p000.q93;
import p000.qba;
import p000.r93;
import p000.thb;
import p000.v56;
import p000.vi3;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FocusableNode$focusTargetNode$1 extends FunctionReferenceImpl implements zi3 {
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        boolean zIsFocused;
        FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
        FocusStateImpl focusStateImpl2 = (FocusStateImpl) obj2;
        C0121i c0121i = (C0121i) this.f47704b;
        if (c0121i.f34836I && (zIsFocused = focusStateImpl2.isFocused()) != focusStateImpl.isFocused()) {
            vi3 vi3Var = c0121i.f2388M;
            if (vi3Var != null) {
                vi3Var.invoke(Boolean.valueOf(zIsFocused));
            }
            p58 p58Var = oa3.f54098J;
            if (zIsFocused) {
                wfb.m23926u(c0121i.m9971N0(), null, null, new FocusableNode$onFocusStateChange$1(c0121i, null), 3);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                AbstractC0356f.m1552b(c0121i, new C3006fm(8, ref$ObjectRef, c0121i));
                hu4 hu4Var = (hu4) ref$ObjectRef.f47718a;
                if (hu4Var != null) {
                    hu4Var.m13463a();
                } else {
                    hu4Var = null;
                }
                c0121i.f2390O = hu4Var;
                AbstractC0362l abstractC0362l = c0121i.f2391P;
                if (abstractC0362l != null && abstractC0362l.mo1543f1().f34836I && c0121i.f34836I) {
                    qba.m19849a(c0121i, p58Var);
                }
            } else {
                hu4 hu4Var2 = c0121i.f2390O;
                if (hu4Var2 != null) {
                    hu4Var2.m13464b();
                }
                c0121i.f2390O = null;
                if (c0121i.f34836I) {
                    qba.m19849a(c0121i, p58Var);
                }
            }
            thb.m22062u(c0121i);
            v56 v56Var = c0121i.f2387L;
            if (v56Var != null) {
                q93 q93Var = c0121i.f2389N;
                if (zIsFocused) {
                    if (q93Var != null) {
                        c0121i.m954c1(v56Var, new r93(q93Var));
                        c0121i.f2389N = null;
                    }
                    q93 q93Var2 = new q93();
                    c0121i.m954c1(v56Var, q93Var2);
                    c0121i.f2389N = q93Var2;
                } else if (q93Var != null) {
                    c0121i.m954c1(v56Var, new r93(q93Var));
                    c0121i.f2389N = null;
                }
            }
        }
        return xfa.f68157a;
    }
}
