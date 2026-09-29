package com.amplitude.core.platform.plugins;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.amplitude.core.platform.C0907a;
import com.amplitude.core.platform.WriteQueueMessageType;
import com.amplitude.core.platform.intercept.C0909b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.o9b;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.amplitude.core.platform.plugins.AmplitudeDestination$flush$1", m4291f = "AmplitudeDestination.kt", m4292l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m4293m = "invokeSuspend")
final class AmplitudeDestination$flush$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f11152a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0910a f11153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmplitudeDestination$flush$1(C0910a c0910a, Continuation continuation) {
        super(2, continuation);
        this.f11153b = c0910a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AmplitudeDestination$flush$1(this.f11153b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((AmplitudeDestination$flush$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f11152a;
        C0910a c0910a = this.f11153b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C0909b c0909b = c0910a.f11159f;
            if (c0909b == null) {
                fa4.m11636J("identifyInterceptor");
                throw null;
            }
            this.f11152a = 1;
            if (c0909b.m5142c(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        C0907a c0907a = c0910a.f11158e;
        if (c0907a != null) {
            c0907a.f11101g.mo4677k(new o9b(WriteQueueMessageType.FLUSH, null));
            return xfa.f68157a;
        }
        fa4.m11636J("pipeline");
        throw null;
    }
}
