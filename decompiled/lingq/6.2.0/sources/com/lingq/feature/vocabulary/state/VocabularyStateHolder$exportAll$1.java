package com.lingq.feature.vocabulary.state;

import com.lingq.core.data.repository.C1308x;
import com.lingq.core.domain.model.ExportType;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.bya;
import p000.c32;
import p000.cya;
import p000.gca;
import p000.jya;
import p000.un1;
import p000.wxa;
import p000.xfa;
import p000.zi3;
import p000.zw2;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyStateHolder$exportAll$1", m4291f = "VocabularyStateHolder.kt", m4292l = {501}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyStateHolder$exportAll$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2862d f33745b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ExportType f33746c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyStateHolder$exportAll$1(C2862d c2862d, ExportType exportType, Continuation continuation) {
        super(2, continuation);
        this.f33745b = c2862d;
        this.f33746c = exportType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyStateHolder$exportAll$1(this.f33745b, this.f33746c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyStateHolder$exportAll$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        jya jyaVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33744a;
        ExportType exportType = this.f33746c;
        C2862d c2862d = this.f33745b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            zw2 zw2Var = c2862d.f33801g;
            String str = c2862d.f33810p;
            this.f33744a = 1;
            obj = ((C1308x) zw2Var.f72294a).m7409c(str, exportType, this);
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
        if (((Boolean) obj).booleanValue()) {
            jyaVar = exportType == ExportType.CSV ? new jya(cya.f34714a) : new jya(bya.f9183a);
        } else {
            jyaVar = new jya(wxa.f67489a);
        }
        c2862d.m9773f(new gca(jyaVar, 8));
        return xfa.f68157a;
    }
}
