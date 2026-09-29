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
import p000.e83;
import p000.jd0;
import p000.m83;
import p000.un1;
import p000.xf2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictContentViewModel$fetchActiveDictionaries$1", m4291f = "DictContentViewModel.kt", m4292l = {100}, m4293m = "invokeSuspend", m4294v = 2)
final class DictContentViewModel$fetchActiveDictionaries$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25656a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2056a f25657b;

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictContentViewModel$fetchActiveDictionaries$1$1 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictContentViewModel$fetchActiveDictionaries$1$1", m4291f = "DictContentViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20401 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2056a f25658a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20401(C2056a c2056a, Continuation continuation) {
            super(2, continuation);
            this.f25658a = c2056a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C20401(this.f25658a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20401 c20401 = (C20401) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20401.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f25658a.f25789k;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictContentViewModel$fetchActiveDictionaries$1$2 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictContentViewModel$fetchActiveDictionaries$1$2", m4291f = "DictContentViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20412 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25659a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2056a f25660b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20412(C2056a c2056a, Continuation continuation) {
            super(2, continuation);
            this.f25660b = c2056a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20412 c20412 = new C20412(this.f25660b, continuation);
            c20412.f25659a = obj;
            return c20412;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20412 c20412 = (C20412) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20412.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f25659a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2056a c2056a = this.f25660b;
            c2056a.f25787i.m15571i(list);
            C3244l c3244l = c2056a.f25789k;
            Boolean bool = Boolean.FALSE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictContentViewModel$fetchActiveDictionaries$1(C2056a c2056a, Continuation continuation) {
        super(2, continuation);
        this.f25657b = c2056a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DictContentViewModel$fetchActiveDictionaries$1(this.f25657b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((DictContentViewModel$fetchActiveDictionaries$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25656a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2056a c2056a = this.f25657b;
            xf2 xf2Var = c2056a.f25781c;
            String strMo4589b2 = c2056a.f25780b.mo4589b2();
            C1292h c1292h = (C1292h) xf2Var;
            c1292h.getClass();
            strMo4589b2.getClass();
            C1318f c1318f = c1292h.f16483b;
            c1318f.getClass();
            m83 m83Var = new m83(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryDataEntity", "LanguageActiveDictionaryJoin"}, new jd0(strMo4589b2, 6))), new C20401(c2056a, null));
            C20412 c20412 = new C20412(c2056a, null);
            this.f25656a = 1;
            if (AbstractC3224d.m15529h(m83Var, c20412, this) == coroutineSingletons) {
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
