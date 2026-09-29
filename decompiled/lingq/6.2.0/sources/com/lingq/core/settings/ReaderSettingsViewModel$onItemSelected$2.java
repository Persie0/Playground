package com.lingq.core.settings;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$onItemSelected$2", m4291f = "ReaderSettingsViewModel.kt", m4292l = {175}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsViewModel$onItemSelected$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22610a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1859b f22611b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewKeys f22612c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$onItemSelected$2(C1859b c1859b, ViewKeys viewKeys, Continuation continuation) {
        super(2, continuation);
        this.f22611b = c1859b;
        this.f22612c = viewKeys;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSettingsViewModel$onItemSelected$2(this.f22611b, this.f22612c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSettingsViewModel$onItemSelected$2) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22610a;
        ViewKeys viewKeys = this.f22612c;
        C1859b c1859b = this.f22611b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f22610a = 1;
            obj = C1859b.m8610V2(c1859b, viewKeys, this);
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
        c1859b.m8614Z2(viewKeys, (List) obj);
        return xfa.f68157a;
    }
}
