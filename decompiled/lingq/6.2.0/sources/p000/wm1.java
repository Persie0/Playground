package p000;

import androidx.compose.foundation.C0120h;
import androidx.compose.foundation.text.AbstractC0176d;
import androidx.compose.foundation.text.selection.C0205f;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
public final class wm1 implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f67045a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f67046b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f67047c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f67048d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f67049e;

    public /* synthetic */ wm1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.f67045a = i;
        this.f67046b = obj;
        this.f67047c = obj2;
        this.f67048d = obj3;
        this.f67049e = obj4;
    }

    @Override // p000.e83
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.f67045a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f67049e;
        Object obj3 = this.f67046b;
        Object obj4 = this.f67047c;
        Object obj5 = this.f67048d;
        switch (i) {
            case 0:
                C0205f c0205f = (C0205f) obj5;
                yw4 yw4Var = (yw4) obj3;
                if (((Boolean) obj).booleanValue() && yw4Var.m25361b()) {
                    AbstractC0176d.m1075h((fw9) obj4, yw4Var, c0205f.m1114o(), (w04) obj2, c0205f.f3077b);
                } else {
                    AbstractC0176d.m1073f(yw4Var);
                }
                break;
            default:
                q84 q84Var = (q84) obj;
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj5;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) obj4;
                Ref$IntRef ref$IntRef3 = (Ref$IntRef) obj3;
                boolean z = true;
                if (q84Var instanceof lj7) {
                    ref$IntRef3.f47716a++;
                } else if ((q84Var instanceof mj7) || (q84Var instanceof kj7)) {
                    ref$IntRef3.f47716a--;
                } else if (q84Var instanceof rv3) {
                    ref$IntRef2.f47716a++;
                } else if (q84Var instanceof sv3) {
                    ref$IntRef2.f47716a--;
                } else if (q84Var instanceof q93) {
                    ref$IntRef.f47716a++;
                } else if (q84Var instanceof r93) {
                    ref$IntRef.f47716a--;
                }
                boolean z2 = false;
                boolean z3 = ref$IntRef3.f47716a > 0;
                boolean z4 = ref$IntRef2.f47716a > 0;
                boolean z5 = ref$IntRef.f47716a > 0;
                C0120h c0120h = (C0120h) obj2;
                if (c0120h.f2383K != z3) {
                    c0120h.f2383K = z3;
                    z2 = true;
                }
                if (c0120h.f2384L != z4) {
                    c0120h.f2384L = z4;
                    z2 = true;
                }
                if (c0120h.f2385M != z5) {
                    c0120h.f2385M = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    AbstractC3489q9.m19789s(c0120h);
                }
                break;
        }
        return xfaVar;
    }
}
