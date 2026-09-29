package com.lingq.core.token;

import com.lingq.core.domain.model.token.TokenMeaning;
import com.lingq.core.domain.model.token.TokenTranslationSimple;
import com.lingq.core.domain.model.token.TokenTranslations;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.f5a;
import p000.pg9;
import p000.u91;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.token.TokenUpdateViewModel$observeTranslationIfApplicable$3", m4291f = "TokenUpdateViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class TokenUpdateViewModel$observeTranslationIfApplicable$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23648a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1909e f23649b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f23650c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TokenUpdateViewModel$observeTranslationIfApplicable$3(C1909e c1909e, String str, Continuation continuation) {
        super(2, continuation);
        this.f23649b = c1909e;
        this.f23650c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TokenUpdateViewModel$observeTranslationIfApplicable$3 tokenUpdateViewModel$observeTranslationIfApplicable$3 = new TokenUpdateViewModel$observeTranslationIfApplicable$3(this.f23649b, this.f23650c, continuation);
        tokenUpdateViewModel$observeTranslationIfApplicable$3.f23648a = obj;
        return tokenUpdateViewModel$observeTranslationIfApplicable$3;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        TokenUpdateViewModel$observeTranslationIfApplicable$3 tokenUpdateViewModel$observeTranslationIfApplicable$3 = (TokenUpdateViewModel$observeTranslationIfApplicable$3) create((TokenTranslations) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        tokenUpdateViewModel$observeTranslationIfApplicable$3.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        Object value2;
        TokenTranslations tokenTranslations = (TokenTranslations) this.f23648a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (tokenTranslations != null) {
            List list = tokenTranslations.f19618b;
            if (!list.isEmpty()) {
                C1909e c1909e = this.f23649b;
                pg9 pg9Var = c1909e.f23884V;
                if (pg9Var != null) {
                    pg9Var.mo4537a(null);
                }
                List list2 = list;
                ArrayList arrayList = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    String str = ((TokenTranslationSimple) it.next()).f19615a;
                    String str2 = this.f23650c;
                    arrayList.add(new TokenMeaning(-33, str2, str, -1, false, str2, true, 0, 136));
                }
                C3244l c3244l = c1909e.f23881S;
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, (TokenMeaning) u91.m22591I0(arrayList)));
                C3244l c3244l2 = c1909e.f23885W;
                do {
                    value2 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value2, f5a.m11558a((f5a) value2, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, false, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097127)));
            }
        }
        return xfa.f68157a;
    }
}
