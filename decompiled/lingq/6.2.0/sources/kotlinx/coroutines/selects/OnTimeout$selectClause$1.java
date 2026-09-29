package kotlinx.coroutines.selects;

import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.AbstractC3208a;
import p000.aj3;
import p000.gu8;
import p000.kn1;
import p000.ks6;
import p000.ls6;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class OnTimeout$selectClause$1 extends FunctionReferenceImpl implements aj3 {

    /* JADX INFO: renamed from: i */
    public static final OnTimeout$selectClause$1 f48164i = new OnTimeout$selectClause$1(3, ls6.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ls6 ls6Var = (ls6) obj;
        gu8 gu8Var = (gu8) obj2;
        long j = ls6Var.f50077a;
        xfa xfaVar = xfa.f68157a;
        if (j <= 0) {
            ((C3247b) gu8Var).f48174e = xfaVar;
            return xfaVar;
        }
        ks6 ks6Var = new ks6(0, gu8Var, ls6Var);
        gu8Var.getClass();
        C3247b c3247b = (C3247b) gu8Var;
        kn1 kn1Var = c3247b.f48170a;
        c3247b.f48172c = AbstractC3208a.m15440g(kn1Var).mo4459x(j, ks6Var, kn1Var);
        return xfaVar;
    }
}
