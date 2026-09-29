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
import p000.vi3;
import p000.xf2;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$fetchActiveDictionaries$1", m4291f = "DictManageViewModel.kt", m4292l = {130}, m4293m = "invokeSuspend", m4294v = 2)
final class DictManageViewModel$fetchActiveDictionaries$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f25686a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2057b f25687b;

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictManageViewModel$fetchActiveDictionaries$1$1 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$fetchActiveDictionaries$1$1", m4291f = "DictManageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20471 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C2057b f25688a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20471(C2057b c2057b, Continuation continuation) {
            super(2, continuation);
            this.f25688a = c2057b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C20471(this.f25688a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20471 c20471 = (C20471) create((e83) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20471.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f25688a.f25800j;
            Boolean bool = Boolean.TRUE;
            c3244l.getClass();
            c3244l.m15572j(null, bool);
            return xfa.f68157a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.feature.dictionary.DictManageViewModel$fetchActiveDictionaries$1$2 */
    @c32(m4290c = "com.lingq.feature.dictionary.DictManageViewModel$fetchActiveDictionaries$1$2", m4291f = "DictManageViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20482 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25689a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2057b f25690b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20482(C2057b c2057b, Continuation continuation) {
            super(2, continuation);
            this.f25690b = c2057b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20482 c20482 = new C20482(this.f25690b, continuation);
            c20482.f25689a = obj;
            return c20482;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20482 c20482 = (C20482) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20482.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f25689a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2057b c2057b = this.f25690b;
            C3244l c3244l = c2057b.f25800j;
            c2057b.f25798h.m15571i(list);
            if (!list.isEmpty()) {
                Boolean bool = Boolean.FALSE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
            }
            if (list.isEmpty()) {
                Boolean bool2 = Boolean.TRUE;
                c3244l.getClass();
                c3244l.m15572j(null, bool2);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictManageViewModel$fetchActiveDictionaries$1(C2057b c2057b, Continuation continuation) {
        super(1, continuation);
        this.f25687b = c2057b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new DictManageViewModel$fetchActiveDictionaries$1(this.f25687b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((DictManageViewModel$fetchActiveDictionaries$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25686a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2057b c2057b = this.f25687b;
            xf2 xf2Var = c2057b.f25793c;
            String strMo4589b2 = c2057b.f25792b.mo4589b2();
            C1292h c1292h = (C1292h) xf2Var;
            c1292h.getClass();
            strMo4589b2.getClass();
            C1318f c1318f = c1292h.f16483b;
            c1318f.getClass();
            m83 m83Var = new m83(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryDataEntity", "LanguageActiveDictionaryJoin"}, new jd0(strMo4589b2, 6))), new C20471(c2057b, null));
            C20482 c20482 = new C20482(c2057b, null);
            this.f25686a = 1;
            if (AbstractC3224d.m15529h(m83Var, c20482, this) == coroutineSingletons) {
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
