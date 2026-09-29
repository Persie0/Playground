package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import p000.c83;
import p000.e83;
import p000.fa4;
import p000.jj5;
import p000.kn1;
import p000.ll7;
import p000.ln1;
import p000.r46;
import p000.te1;
import p000.xfa;
import p000.zv8;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3233c extends AbstractC3231a {

    /* JADX INFO: renamed from: d */
    public final c83 f48136d;

    public AbstractC3233c(c83 c83Var, kn1 kn1Var, int i, BufferOverflow bufferOverflow) {
        super(kn1Var, i, bufferOverflow);
        this.f48136d = c83Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005e  */
    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[RETURN] */
    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a, p000.c83
    public final Object collect(e83 e83Var, Continuation continuation) {
        Object objCollect;
        if (this.f48134b == -3) {
            kn1 context = continuation.getContext();
            Boolean bool = Boolean.FALSE;
            ln1 ln1Var = new ln1(0);
            kn1 kn1Var = this.f48133a;
            kn1 kn1VarPlus = !((Boolean) kn1Var.fold(bool, ln1Var)).booleanValue() ? context.plus(kn1Var) : te1.m22004r(context, kn1Var, false);
            if (fa4.m11650l(kn1VarPlus, context)) {
                Object objMo12141h = mo12141h(e83Var, continuation);
                if (objMo12141h == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    return objMo12141h;
                }
            } else {
                jj5 jj5Var = jj5.f45612c;
                if (fa4.m11650l(kn1VarPlus.get(jj5Var), context.get(jj5Var))) {
                    Object objM15566b = AbstractC3232b.m15566b(kn1VarPlus, AbstractC3232b.m15565a(e83Var, continuation.getContext()), r46.m20370M(kn1VarPlus), new ChannelFlowOperator$collectWithContextUndispatched$2(this, null), continuation);
                    if (objM15566b == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objM15566b;
                    }
                } else {
                    objCollect = super.collect(e83Var, continuation);
                    if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                        return objCollect;
                    }
                }
            }
        } else {
            objCollect = super.collect(e83Var, continuation);
            if (objCollect == CoroutineSingletons.COROUTINE_SUSPENDED) {
                return objCollect;
            }
        }
        return xfa.f68157a;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    /* JADX INFO: renamed from: d */
    public final Object mo10648d(ll7 ll7Var, Continuation continuation) {
        Object objMo12141h = mo12141h(new zv8(ll7Var), continuation);
        return objMo12141h == CoroutineSingletons.COROUTINE_SUSPENDED ? objMo12141h : xfa.f68157a;
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo12141h(e83 e83Var, Continuation continuation);

    @Override // kotlinx.coroutines.flow.internal.AbstractC3231a
    public final String toString() {
        return this.f48136d + " -> " + super.toString();
    }
}
