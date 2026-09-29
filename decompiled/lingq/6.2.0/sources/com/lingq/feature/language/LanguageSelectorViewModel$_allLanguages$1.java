package com.lingq.feature.language;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1293i;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.qy3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.language.LanguageSelectorViewModel$_allLanguages$1", m4291f = "LanguageSelectorViewModel.kt", m4292l = {DescriptorProtos.FileOptions.PHP_METADATA_NAMESPACE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageSelectorViewModel$_allLanguages$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f26321a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f26322b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2120b f26323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageSelectorViewModel$_allLanguages$1(C2120b c2120b, Continuation continuation) {
        super(3, continuation);
        this.f26323c = c2120b;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        LanguageSelectorViewModel$_allLanguages$1 languageSelectorViewModel$_allLanguages$1 = new LanguageSelectorViewModel$_allLanguages$1(this.f26323c, (Continuation) obj3);
        languageSelectorViewModel$_allLanguages$1.f26322b = (e83) obj;
        return languageSelectorViewModel$_allLanguages$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f26322b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26321a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3584sr.m21590A(((C1293i) this.f26323c.f26333c).f16489b.f64042K, false, new String[]{"LanguageEntity"}, new qy3(9)));
            this.f26322b = null;
            this.f26321a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM15536o, this) == coroutineSingletons) {
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
