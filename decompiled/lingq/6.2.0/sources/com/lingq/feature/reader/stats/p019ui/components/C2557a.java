package com.lingq.feature.reader.stats.p019ui.components;

import androidx.compose.animation.core.C0059a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$IntRef;
import p000.C3386nv;
import p000.e83;
import p000.fda;
import p000.io2;
import p000.l70;
import p000.ss5;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.reader.stats.ui.components.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2557a implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0059a f30988a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$IntRef f30989b;

    public C2557a(C0059a c0059a, Ref$IntRef ref$IntRef) {
        this.f30988a = c0059a;
        this.f30989b = ref$IntRef;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: a */
    public final Object m9467a(int i, Continuation continuation) throws Throwable {
        LynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1 lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1;
        if (continuation instanceof LynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1) {
            lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1 = (LynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1) continuation;
            int i2 = lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1.f30987d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1.f30987d = i2 - Integer.MIN_VALUE;
            } else {
                lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1 = new LynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1(this, continuation);
            }
        } else {
            lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1 = new LynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1(this, continuation);
        }
        LynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1 lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$2 = lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$1;
        Object obj = lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$2.f30985b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$2.f30987d;
        Ref$IntRef ref$IntRef = this.f30989b;
        xfa xfaVar = xfa.f68157a;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            if (i > 0) {
                int i4 = ref$IntRef.f47716a;
                Float f = new Float(i4 != 0 ? l70.m15944g(i4 / i, 0.0f, 1.0f) : 0.0f);
                lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$2.f30984a = i;
                lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$2.f30987d = 1;
                if (this.f30988a.m747f(f, lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$2) != coroutineSingletons) {
                }
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$2.f30984a;
        AbstractC3193b.m15359b(obj);
        ref$IntRef.f47716a = i;
        Float f2 = new Float(1.0f);
        fda fdaVarM21703b0 = ss5.m21703b0(450, 0, io2.f44350b, 2);
        lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$2.f30984a = i;
        lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$2.f30987d = 2;
        return C0059a.m744c(this.f30988a, f2, fdaVarM21703b0, null, lynxCoachCardKt$LynxCoachMessage$1$1$2$emit$2, 12) == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    @Override // p000.e83
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return m9467a(((Number) obj).intValue(), continuation);
    }
}
