package p000;

import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.C0205f;
import kotlin.jvm.internal.Ref$BooleanRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f86 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f38616a = 0;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ boolean f38617b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f38618c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f38619d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f38620e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f38621f;

    public /* synthetic */ f86(yw4 yw4Var, z93 z93Var, boolean z, C0205f c0205f, mq6 mq6Var) {
        this.f38618c = yw4Var;
        this.f38619d = z93Var;
        this.f38617b = z;
        this.f38620e = c0205f;
        this.f38621f = mq6Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f38616a;
        xfa xfaVar = xfa.f68157a;
        Object obj2 = this.f38621f;
        Object obj3 = this.f38620e;
        boolean z = this.f38617b;
        Object obj4 = this.f38619d;
        Object obj5 = this.f38618c;
        switch (i) {
            case 0:
                y76 y76Var = (y76) obj;
                y76Var.getClass();
                ((Ref$BooleanRef) obj5).f47713a = true;
                ((Ref$BooleanRef) obj4).f47713a = true;
                ((h86) obj3).m13135n(y76Var, z, (C0825bv) obj2);
                break;
            default:
                yw4 yw4Var = (yw4) obj5;
                z93 z93Var = (z93) obj4;
                C0205f c0205f = (C0205f) obj3;
                mq6 mq6Var = (mq6) obj2;
                gq6 gq6Var = (gq6) obj;
                if (yw4Var.m25361b()) {
                    ld9 ld9Var = yw4Var.f70571c;
                    if (ld9Var != null) {
                        ((pa2) ld9Var).m19005b();
                    }
                } else {
                    z93.m25512a(z93Var);
                }
                if (yw4Var.m25361b() && z) {
                    if (yw4Var.m25360a() == HandleState.Selection) {
                        c0205f.m1106g(gq6Var);
                    } else {
                        sw9 sw9VarM25363d = yw4Var.m25363d();
                        if (sw9VarM25363d != null) {
                            long j = gq6Var.f41189a;
                            bl2 bl2Var = yw4Var.f70572d;
                            sm1 sm1Var = yw4Var.f70590v;
                            int iMo13407j = mq6Var.mo13407j(sw9VarM25363d.m21754b(j, true));
                            sm1Var.invoke(vv9.m23560a((vv9) bl2Var.f8655a, null, eh0.m11127g(iMo13407j, iMo13407j), 5));
                            if (yw4Var.f70569a.f64340a.f54604b.length() > 0) {
                                ((xc9) yw4Var.f70579k).setValue(HandleState.Cursor);
                            }
                        }
                    }
                }
                break;
        }
        return xfaVar;
    }

    public /* synthetic */ f86(Ref$BooleanRef ref$BooleanRef, Ref$BooleanRef ref$BooleanRef2, h86 h86Var, boolean z, C0825bv c0825bv) {
        this.f38618c = ref$BooleanRef;
        this.f38619d = ref$BooleanRef2;
        this.f38620e = h86Var;
        this.f38617b = z;
        this.f38621f = c0825bv;
    }
}
