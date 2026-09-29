package com.lingq.feature.dictionary;

import com.lingq.core.data.repository.C1292h;
import com.lingq.core.database.dao.C1318f;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.jd0;
import p000.m83;
import p000.un1;
import p000.xf2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictContentViewModel$fetchAvailableDictionaries$1", m4291f = "DictContentViewModel.kt", m4292l = {117}, m4293m = "invokeSuspend", m4294v = 2)
final class DictContentViewModel$fetchAvailableDictionaries$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25661a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2056a f25662b;

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictContentViewModel$fetchAvailableDictionaries$1$1 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictContentViewModel$fetchAvailableDictionaries$1$1", m4291f = "DictContentViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20421 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2056a f25663a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20421(C2056a c2056a, Continuation continuation) {
            super(2, continuation);
            this.f25663a = c2056a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C20421(this.f25663a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20421 c20421 = (C20421) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20421.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f25663a.f25789k;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictContentViewModel$fetchAvailableDictionaries$1$2 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictContentViewModel$fetchAvailableDictionaries$1$2", m4291f = "DictContentViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20432 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25664a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2056a f25665b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20432(C2056a c2056a, Continuation continuation) {
            super(2, continuation);
            this.f25665b = c2056a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20432 c20432 = new C20432(this.f25665b, continuation);
            c20432.f25664a = obj;
            return c20432;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20432 c20432 = (C20432) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20432.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f25664a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2056a c2056a = this.f25665b;
            c2056a.f25788j.m15571i(list);
            C3244l c3244l = c2056a.f25789k;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictContentViewModel$fetchAvailableDictionaries$1(C2056a c2056a, Continuation continuation) {
        super(2, continuation);
        this.f25662b = c2056a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictContentViewModel$fetchAvailableDictionaries$1(this.f25662b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictContentViewModel$fetchAvailableDictionaries$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25661a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2056a c2056a = this.f25662b;
            xf2 xf2Var = c2056a.f25781c;
            String strMo4589b2 = c2056a.f25780b.mo4589b2();
            C1292h c1292h = (C1292h) xf2Var;
            c1292h.getClass();
            strMo4589b2.getClass();
            C1318f c1318f = c1292h.f16483b;
            c1318f.getClass();
            c83 c83VarM15544w = AbstractC3224d.m15544w(new m83(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryDataEntity", "LanguageContextEntity", "LanguageAvailableDictionaryJoin"}, new jd0(strMo4589b2, 7))), new C20421(c2056a, null)), c2056a.f25784f);
            C20432 c20432 = new C20432(c2056a, null);
            this.f25661a = 1;
            if (AbstractC3224d.m15529h(c83VarM15544w, c20432, this) == coroutineSingletons) {
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
