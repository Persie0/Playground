package androidx.compose.p002ui.viewinterop;

import androidx.compose.p002ui.focus.FocusStateImpl;
import androidx.compose.p002ui.node.AbstractC0356f;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Ref$ObjectRef;
import p000.hu4;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class FocusTargetInteropNode$focusTargetNode$1 extends FunctionReferenceImpl implements zi3 {
    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        boolean zIsFocused;
        FocusStateImpl focusStateImpl = (FocusStateImpl) obj;
        FocusStateImpl focusStateImpl2 = (FocusStateImpl) obj2;
        C0449i c0449i = (C0449i) this.f47704b;
        if (c0449i.f34836I && (zIsFocused = focusStateImpl2.isFocused()) != focusStateImpl.isFocused()) {
            hu4 hu4Var = null;
            if (zIsFocused) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                AbstractC0356f.m1552b(c0449i, new FocusTargetInteropNode$retrievePinnableContainer$1(ref$ObjectRef, c0449i));
                hu4 hu4Var2 = (hu4) ref$ObjectRef.f47718a;
                if (hu4Var2 != null) {
                    hu4Var2.m13463a();
                    hu4Var = hu4Var2;
                }
                c0449i.f5213M = hu4Var;
            } else {
                hu4 hu4Var3 = c0449i.f5213M;
                if (hu4Var3 != null) {
                    hu4Var3.m13464b();
                }
                c0449i.f5213M = null;
            }
        }
        return xfa.f68157a;
    }
}
