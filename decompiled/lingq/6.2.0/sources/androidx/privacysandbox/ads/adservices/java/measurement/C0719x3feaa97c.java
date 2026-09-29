package androidx.privacysandbox.ads.adservices.java.measurement;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.tob;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$getMeasurementApiStatusAsync$1", m4291f = "MeasurementManagerFutures.kt", m4292l = {190}, m4293m = "invokeSuspend")
public final class C0719x3feaa97c extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6547a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MeasurementManagerFutures$Api33Ext5JavaImpl f6548b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0719x3feaa97c(MeasurementManagerFutures$Api33Ext5JavaImpl measurementManagerFutures$Api33Ext5JavaImpl, Continuation continuation) {
        super(2, continuation);
        this.f6548b = measurementManagerFutures$Api33Ext5JavaImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0719x3feaa97c(this.f6548b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0719x3feaa97c) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6547a;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
                return obj;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        AbstractC3193b.m15359b(obj);
        tob tobVar = this.f6548b.f6546j;
        this.f6547a = 1;
        Object objMo2589a = tobVar.mo2589a(this);
        return objMo2589a == coroutineSingletons ? coroutineSingletons : objMo2589a;
    }
}
