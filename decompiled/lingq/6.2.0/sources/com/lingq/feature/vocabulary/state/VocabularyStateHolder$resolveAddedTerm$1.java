package com.lingq.feature.vocabulary.state;

import com.lingq.core.domain.model.lesson.TokenType;
import com.lingq.core.domain.token.C1537e;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.r3a;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyStateHolder$resolveAddedTerm$1", m4291f = "VocabularyStateHolder.kt", m4292l = {333}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyStateHolder$resolveAddedTerm$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33764a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2862d f33765b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f33766c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyStateHolder$resolveAddedTerm$1(C2862d c2862d, String str, Continuation continuation) {
        super(2, continuation);
        this.f33765b = c2862d;
        this.f33766c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyStateHolder$resolveAddedTerm$1(this.f33765b, this.f33766c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyStateHolder$resolveAddedTerm$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33764a;
        String str = this.f33766c;
        C2862d c2862d = this.f33765b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1537e c1537e = c2862d.f33804j;
            String str2 = c2862d.f33810p;
            this.f33764a = 1;
            obj = c1537e.m8223b(str2, str, this);
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
        c2862d.m9773f(new r3a(15, str, (TokenType) obj));
        return xfa.f68157a;
    }
}
