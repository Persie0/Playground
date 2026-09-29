package kotlinx.coroutines.flow.internal;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.bm6;
import p000.e83;
import p000.hg9;
import p000.kn1;
import p000.lda;
import p000.r46;
import p000.zi3;
import p000.zv8;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.b */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3232b {
    /* JADX INFO: renamed from: a */
    public static final e83 m15565a(e83 e83Var, kn1 kn1Var) {
        return ((e83Var instanceof zv8) || (e83Var instanceof bm6)) ? e83Var : new C3241k(e83Var, kn1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public static final Object m15566b(kn1 kn1Var, Object obj, Object obj2, zi3 zi3Var, Continuation continuation) {
        ChannelFlowKt$withContextUndispatched$1 channelFlowKt$withContextUndispatched$1;
        Object objM20372O;
        Object objInvoke;
        if (continuation instanceof ChannelFlowKt$withContextUndispatched$1) {
            channelFlowKt$withContextUndispatched$1 = (ChannelFlowKt$withContextUndispatched$1) continuation;
            int i = channelFlowKt$withContextUndispatched$1.f48081f;
            if ((i & Integer.MIN_VALUE) != 0) {
                channelFlowKt$withContextUndispatched$1.f48081f = i - Integer.MIN_VALUE;
            } else {
                channelFlowKt$withContextUndispatched$1 = new ChannelFlowKt$withContextUndispatched$1(continuation);
            }
        } else {
            channelFlowKt$withContextUndispatched$1 = new ChannelFlowKt$withContextUndispatched$1(continuation);
        }
        Object obj3 = channelFlowKt$withContextUndispatched$1.f48080e;
        Object obj4 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = channelFlowKt$withContextUndispatched$1.f48081f;
        if (i2 != 0) {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj5 = channelFlowKt$withContextUndispatched$1.f48078c;
            kn1 kn1Var2 = channelFlowKt$withContextUndispatched$1.f48077b;
            try {
                AbstractC3193b.m15359b(obj3);
                objM20372O = obj5;
                kn1Var = kn1Var2;
                r46.m20367J(kn1Var, objM20372O);
                return obj3;
            } catch (Throwable th) {
                objM20372O = obj5;
                kn1Var = kn1Var2;
                th = th;
                r46.m20367J(kn1Var, objM20372O);
                throw th;
            }
        }
        AbstractC3193b.m15359b(obj3);
        objM20372O = r46.m20372O(kn1Var, obj2);
        try {
            channelFlowKt$withContextUndispatched$1.f48076a = obj;
            channelFlowKt$withContextUndispatched$1.f48077b = kn1Var;
            channelFlowKt$withContextUndispatched$1.f48078c = objM20372O;
            channelFlowKt$withContextUndispatched$1.f48081f = 1;
            hg9 hg9Var = new hg9(kn1Var, channelFlowKt$withContextUndispatched$1);
            if (zi3Var == null) {
                objInvoke = AbstractC3584sr.m21631i0(zi3Var, obj, hg9Var);
            } else {
                lda.m16119e(2, zi3Var);
                objInvoke = zi3Var.invoke(obj, hg9Var);
            }
            obj3 = objInvoke;
            if (obj3 == obj4) {
                return obj4;
            }
            r46.m20367J(kn1Var, objM20372O);
            return obj3;
        } catch (Throwable th2) {
            th = th2;
            r46.m20367J(kn1Var, objM20372O);
            throw th;
        }
    }
}
