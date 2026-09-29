package androidx.privacysandbox.ads.adservices.java.measurement;

import android.net.Uri;
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

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerTriggerAsync$1", m4291f = "MeasurementManagerFutures.kt", m4292l = {162}, m4293m = "invokeSuspend")
public final class C0721x9b0c78cd extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6553a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MeasurementManagerFutures$Api33Ext5JavaImpl f6554b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f6555c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0721x9b0c78cd(MeasurementManagerFutures$Api33Ext5JavaImpl measurementManagerFutures$Api33Ext5JavaImpl, Uri uri, Continuation continuation) {
        super(2, continuation);
        this.f6554b = measurementManagerFutures$Api33Ext5JavaImpl;
        this.f6555c = uri;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0721x9b0c78cd(this.f6554b, this.f6555c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0721x9b0c78cd) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6553a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            tob tobVar = this.f6554b.f6546j;
            this.f6553a = 1;
            if (tobVar.mo2591c(this.f6555c, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
