package p000;

import androidx.compose.p002ui.node.C0353c;
import androidx.compose.p002ui.node.C0357g;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3192a;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class ne1 {

    /* JADX INFO: renamed from: a */
    public final pj5 f52633a;

    public ne1(pj5 pj5Var) {
        pj5Var.getClass();
        this.f52633a = pj5Var;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17397a(C0357g c0357g, Pair pair) {
        aq4 aq4Var;
        e28 e28VarM4050Z = null;
        try {
            final List listM1608u = c0357g.m1608u();
            Object objM22591I0 = u91.m22591I0(listM1608u);
            f16 f16Var = (f16) objM22591I0;
            if (f16Var == null || (aq4Var = f16Var.f38241b) == null || !aq4Var.mo1691n()) {
                objM22591I0 = null;
            }
            f16 f16Var2 = (f16) objM22591I0;
            cs4 cs4VarM15356a = AbstractC3192a.m15356a(new ui3() { // from class: ComposeLayoutNodeBoundsHelper$getLayoutNodeWindowBounds$attachedModifier$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // p000.ui3
                /* JADX INFO: renamed from: a */
                public final Object mo0a() {
                    Object next;
                    Iterator it = listM1608u.iterator();
                    while (it.hasNext()) {
                        next = it.next();
                        if (((f16) next).f38241b.mo1691n()) {
                            return (f16) next;
                        }
                    }
                    next = null;
                    return (f16) next;
                }
            });
            if (f16Var2 == null) {
                f16Var2 = (f16) cs4VarM15356a.getValue();
            }
            aq4 aq4Var2 = f16Var2 != null ? f16Var2.f38241b : null;
            if (aq4Var2 == null) {
                aq4Var2 = (C0353c) c0357g.f4335a0.f46676d;
            }
            e28VarM4050Z = bq1.m4050Z(aq4Var2, true);
        } catch (Exception unused) {
            this.f52633a.mo16257c("Could not fetch position for LayoutNode");
        }
        if (e28VarM4050Z == null) {
            return false;
        }
        return e28VarM4050Z.m10800a((((long) Float.floatToRawIntBits(((Number) pair.f47624b).floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(((Number) pair.f47623a).floatValue())) << 32));
    }
}
