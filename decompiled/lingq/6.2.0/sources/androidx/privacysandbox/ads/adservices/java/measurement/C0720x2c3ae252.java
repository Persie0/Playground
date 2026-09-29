package androidx.privacysandbox.ads.adservices.java.measurement;

import android.net.Uri;
import android.view.InputEvent;
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

/* JADX INFO: renamed from: androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1 */
/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures$Api33Ext5JavaImpl$registerSourceAsync$1", m4291f = "MeasurementManagerFutures.kt", m4292l = {143}, m4293m = "invokeSuspend")
public final class C0720x2c3ae252 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f6549a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MeasurementManagerFutures$Api33Ext5JavaImpl f6550b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Uri f6551c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ InputEvent f6552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0720x2c3ae252(MeasurementManagerFutures$Api33Ext5JavaImpl measurementManagerFutures$Api33Ext5JavaImpl, Uri uri, InputEvent inputEvent, Continuation continuation) {
        super(2, continuation);
        this.f6550b = measurementManagerFutures$Api33Ext5JavaImpl;
        this.f6551c = uri;
        this.f6552d = inputEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new C0720x2c3ae252(this.f6550b, this.f6551c, this.f6552d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((C0720x2c3ae252) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f6549a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            tob tobVar = this.f6550b.f6546j;
            this.f6549a = 1;
            if (tobVar.mo2590b(this.f6551c, this.f6552d, this) == coroutineSingletons) {
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
