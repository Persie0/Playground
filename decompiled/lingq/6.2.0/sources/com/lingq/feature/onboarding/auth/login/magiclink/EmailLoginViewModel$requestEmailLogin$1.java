package com.lingq.feature.onboarding.auth.login.magiclink;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.profile.C1267a;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.jp2;
import p000.km7;
import p000.t66;
import p000.un1;
import p000.xc9;
import p000.xfa;
import p000.ym5;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.onboarding.auth.login.magiclink.EmailLoginViewModel$requestEmailLogin$1", m4291f = "EmailLoginViewModel.kt", m4292l = {DescriptorProtos.FileOptions.SWIFT_PREFIX_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class EmailLoginViewModel$requestEmailLogin$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f27108a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2186c f27109b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f27110c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailLoginViewModel$requestEmailLogin$1(C2186c c2186c, String str, Continuation continuation) {
        super(2, continuation);
        this.f27109b = c2186c;
        this.f27110c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EmailLoginViewModel$requestEmailLogin$1(this.f27109b, this.f27110c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((EmailLoginViewModel$requestEmailLogin$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C2186c c2186c = this.f27109b;
        t66 t66Var = c2186c.f27113c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f27108a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ((xc9) t66Var).setValue(jp2.m14578a(c2186c.m9117V2(), null, true, 1));
            km7 km7Var = c2186c.f27112b;
            this.f27108a = 1;
            obj = ((C1267a) km7Var).m7090s(this.f27110c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        ((xc9) t66Var).setValue(jp2.m14578a(c2186c.m9117V2(), null, false, 1));
        xc9 xc9Var = (xc9) t66Var;
        xc9Var.setValue(jp2.m14578a(c2186c.m9117V2(), (ym5) obj, false, 2));
        return xfa.f68157a;
    }
}
