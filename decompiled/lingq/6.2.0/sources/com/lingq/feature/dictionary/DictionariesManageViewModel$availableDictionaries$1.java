package com.lingq.feature.dictionary;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1292h;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.nt0;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionariesManageViewModel$availableDictionaries$1", m4291f = "DictionariesManageViewModel.kt", m4292l = {DescriptorProtos.FileOptions.RUBY_PACKAGE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionariesManageViewModel$availableDictionaries$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f25748a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f25749b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ String f25750c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2066j f25751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionariesManageViewModel$availableDictionaries$1(C2066j c2066j, Continuation continuation) {
        super(3, continuation);
        this.f25751d = c2066j;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DictionariesManageViewModel$availableDictionaries$1 dictionariesManageViewModel$availableDictionaries$1 = new DictionariesManageViewModel$availableDictionaries$1(this.f25751d, (Continuation) obj3);
        dictionariesManageViewModel$availableDictionaries$1.f25749b = (e83) obj;
        dictionariesManageViewModel$availableDictionaries$1.f25750c = (String) obj2;
        return dictionariesManageViewModel$availableDictionaries$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = this.f25749b;
        String str = this.f25750c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25748a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2066j c2066j = this.f25751d;
            nt0 nt0Var = c2066j.f25834c;
            String strMo4589b2 = c2066j.f25833b.mo4589b2();
            nt0Var.getClass();
            strMo4589b2.getClass();
            str.getClass();
            c83 c83VarM7200f = ((C1292h) nt0Var.f53228a).m7200f(strMo4589b2, str);
            this.f25749b = null;
            this.f25750c = null;
            this.f25748a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM7200f, this) == coroutineSingletons) {
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
