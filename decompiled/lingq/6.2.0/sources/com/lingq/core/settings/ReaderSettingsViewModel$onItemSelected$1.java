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
@c32(m4290c = "com.lingq.core.settings.ReaderSettingsViewModel$onItemSelected$1", m4291f = "ReaderSettingsViewModel.kt", m4292l = {171}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderSettingsViewModel$onItemSelected$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22606a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1859b f22607b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ViewKeys f22608c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f22609d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderSettingsViewModel$onItemSelected$1(C1859b c1859b, ViewKeys viewKeys, String str, Continuation continuation) {
        super(2, continuation);
        this.f22607b = c1859b;
        this.f22608c = viewKeys;
        this.f22609d = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderSettingsViewModel$onItemSelected$1(this.f22607b, this.f22608c, this.f22609d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderSettingsViewModel$onItemSelected$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22606a;
        ViewKeys viewKeys = this.f22608c;
        C1859b c1859b = this.f22607b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f22606a = 1;
            obj = C1859b.m8611W2(c1859b, viewKeys, this.f22609d, this);
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
