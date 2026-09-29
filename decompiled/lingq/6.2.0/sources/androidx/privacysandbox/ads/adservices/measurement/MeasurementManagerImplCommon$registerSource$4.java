package androidx.privacysandbox.ads.adservices.measurement;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.privacysandbox.ads.adservices.measurement.MeasurementManagerImplCommon$registerSource$4", m4291f = "MeasurementManagerImplCommon.kt", m4292l = {}, m4293m = "invokeSuspend")
public final class MeasurementManagerImplCommon$registerSource$4 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f6558a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MeasurementManagerImplCommon f6559b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MeasurementManagerImplCommon$registerSource$4(MeasurementManagerImplCommon measurementManagerImplCommon, Continuation continuation) {
        super(2, continuation);
        this.f6559b = measurementManagerImplCommon;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MeasurementManagerImplCommon$registerSource$4 measurementManagerImplCommon$registerSource$4 = new MeasurementManagerImplCommon$registerSource$4(this.f6559b, continuation);
        measurementManagerImplCommon$registerSource$4.f6558a = obj;
        return measurementManagerImplCommon$registerSource$4;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((MeasurementManagerImplCommon$registerSource$4) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        throw null;
    }
}
