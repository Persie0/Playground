package com.lingq.core.token;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1292h;
import com.lingq.core.database.dao.C1318f;
import com.lingq.core.domain.model.language.Language;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3584sr;
import p000.c32;
import p000.f5a;
import p000.g41;
import p000.h23;
import p000.jd0;
import p000.l83;
import p000.lda;
import p000.m83;
import p000.ph2;
import p000.t62;
import p000.v72;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$1", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23485a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23486b;

    /* JADX INFO: renamed from: com.lingq.core.token.TokenUpdateViewModel$1$2 */
    @c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$1$2", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18932 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ boolean f23487a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C1909e f23488b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18932(C1909e c1909e, Continuation continuation) {
            super(2, continuation);
            this.f23488b = c1909e;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C18932 c18932 = new C18932(this.f23488b, continuation);
            c18932.f23487a = ((Boolean) obj).booleanValue();
            return c18932;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            C18932 c18932 = (C18932) create(bool, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c18932.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object value;
            boolean z = this.f23487a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f23488b.f23885W;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, z, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -513, 2097151)));
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$1(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23486b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$1 tokenUpdateViewModel$1 = new TokenUpdateViewModel$1(this.f23486b, continuation);
        tokenUpdateViewModel$1.f23485a = obj;
        return tokenUpdateViewModel$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$1 tokenUpdateViewModel$1 = (TokenUpdateViewModel$1) create((Language) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Language language = (Language) this.f23485a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1909e c1909e = this.f23486b;
        C3244l c3244l = c1909e.f23885W;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, language.f19024a, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -2, 2097151)));
        String str = language.f19024a;
        h23 h23Var = c1909e.f23895i;
        h23Var.getClass();
        str.getClass();
        C1292h c1292h = (C1292h) h23Var.f41694a;
        c1292h.getClass();
        C1318f c1318f = c1292h.f16483b;
        c1318f.getClass();
        m83 m83Var = new m83(new l83(new m83(AbstractC3224d.m15536o(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryDataEntity", "LanguageActiveDictionaryJoin"}, new jd0(str, 6)))), new TokenUpdateViewModel$observeActiveDictionaries$1(c1909e, null)), new TokenUpdateViewModel$observeActiveDictionaries$2(c1909e, null), 1), new TokenUpdateViewModel$observeActiveDictionaries$3(c1909e, null), 2);
        g41 g41VarM16103C = lda.m16103C(c1909e);
        String strConcat = "active dictionaries ".concat(str);
        v72 v72Var = ph2.f56212a;
        t62 t62Var = t62.f61909c;
        AbstractC1263a.m7049d(m83Var, g41VarM16103C, strConcat, t62Var);
        wfb.m23926u(lda.m16103C(c1909e), t62Var, null, new TokenUpdateViewModel$observeActiveDictionaries$4(c1909e, str, null), 2);
        AbstractC3224d.m15545x(new m83(c1909e.f23907u.m13285v(c1909e.f23872J.mo4589b2()), new C18932(c1909e, null), 2), lda.m16103C(c1909e));
        return xfa.f68157a;
    }
}
