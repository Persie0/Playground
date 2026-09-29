package com.lingq.core.domain.library;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.language.Language;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.u91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetLibraryStructureUseCase$invoke$3", m4291f = "GetLibraryStructureUseCase.kt", m4292l = {DescriptorProtos.FileOptions.PHP_CLASS_PREFIX_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLibraryStructureUseCase$invoke$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f18773a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f18774b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C1389d f18775c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ List f18776d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Language f18777e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLibraryStructureUseCase$invoke$3(C1389d c1389d, Language language, List list, Continuation continuation) {
        super(2, continuation);
        this.f18775c = c1389d;
        this.f18776d = list;
        this.f18777e = language;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        List list = this.f18776d;
        GetLibraryStructureUseCase$invoke$3 getLibraryStructureUseCase$invoke$3 = new GetLibraryStructureUseCase$invoke$3(this.f18775c, this.f18777e, list, continuation);
        getLibraryStructureUseCase$invoke$3.f18774b = obj;
        return getLibraryStructureUseCase$invoke$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetLibraryStructureUseCase$invoke$3) create((List) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list = (List) this.f18774b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18773a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            String str = this.f18777e.f19024a;
            Set setM22627s1 = u91.m22627s1(list);
            this.f18774b = null;
            this.f18773a = 1;
            if (C1389d.m8005a(this.f18775c, this.f18776d, str, setM22627s1, this) == coroutineSingletons) {
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
