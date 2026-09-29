package com.lingq.core.token;

import com.lingq.core.domain.model.token.TokenRelatedPhrase;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.a5a;
import p000.c32;
import p000.f5a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23626a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23627b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2(C1909e c1909e, Continuation continuation) {
        super(2, continuation);
        this.f23627b = c1909e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2 tokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2 = new TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2(this.f23627b, continuation);
        tokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2.f23626a = obj;
        return tokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2 tokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2 = (TokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2) create((a5a) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$loadRelatedPhrasesIfApplicable$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List list;
        Object obj2;
        Object value;
        a5a a5aVar = (a5a) this.f23626a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (a5aVar == null || (list = a5aVar.f273a) == null) {
            list = EmptyList.f47638a;
        }
        List list2 = list;
        Iterator it = list2.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int length = ((TokenRelatedPhrase) next).f19612a.length();
                do {
                    Object next2 = it.next();
                    int length2 = ((TokenRelatedPhrase) next2).f19612a.length();
                    if (length < length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
            obj2 = next;
        } else {
            obj2 = null;
        }
        TokenRelatedPhrase tokenRelatedPhrase = (TokenRelatedPhrase) obj2;
        C3244l c3244l = this.f23627b.f23885W;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, f5a.m11558a((f5a) value, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, list2, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, tokenRelatedPhrase, 2145386495, 1048575)));
        return xfa.f68157a;
    }
}
