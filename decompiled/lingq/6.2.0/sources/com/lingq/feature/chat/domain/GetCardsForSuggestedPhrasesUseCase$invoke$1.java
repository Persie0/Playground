package com.lingq.feature.chat.domain;

import com.lingq.core.data.repository.C1287c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.AbstractC3238h;
import p000.C3386nv;
import p000.ao0;
import p000.b91;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.u91;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.chat.domain.GetCardsForSuggestedPhrasesUseCase$invoke$1", m4291f = "GetCardsForSuggestedPhrasesUseCase.kt", m4292l = {59}, m4293m = "invokeSuspend", m4294v = 2)
final class GetCardsForSuggestedPhrasesUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f25168a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f25169b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f25170c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1998c f25171d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f25172e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Locale f25173f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetCardsForSuggestedPhrasesUseCase$invoke$1(List list, C1998c c1998c, String str, Locale locale, Continuation continuation) {
        super(2, continuation);
        this.f25170c = list;
        this.f25171d = c1998c;
        this.f25172e = str;
        this.f25173f = locale;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetCardsForSuggestedPhrasesUseCase$invoke$1 getCardsForSuggestedPhrasesUseCase$invoke$1 = new GetCardsForSuggestedPhrasesUseCase$invoke$1(this.f25170c, this.f25171d, this.f25172e, this.f25173f, continuation);
        getCardsForSuggestedPhrasesUseCase$invoke$1.f25169b = obj;
        return getCardsForSuggestedPhrasesUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetCardsForSuggestedPhrasesUseCase$invoke$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f25169b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f25168a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayListM22632y0 = u91.m22632y0(this.f25170c, 200);
            ArrayList arrayList = new ArrayList(v91.m23189q0(arrayListM22632y0, 10));
            Iterator it = arrayListM22632y0.iterator();
            while (it.hasNext()) {
                arrayList.add(((C1287c) ((ao0) this.f25171d.f25213a)).m7123m(this.f25172e, (List) it.next()));
            }
            c83[] c83VarArr = (c83[]) u91.m22622n1(arrayList).toArray(new c83[0]);
            this.f25169b = null;
            this.f25168a = 1;
            AbstractC3224d.m15539r(e83Var);
            Object objM15568a = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr, 3), new C1995x746985dd(null, this.f25173f), this, c83VarArr);
            if (objM15568a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM15568a = xfaVar;
            }
            if (objM15568a != CoroutineSingletons.COROUTINE_SUSPENDED) {
                objM15568a = xfaVar;
            }
            if (objM15568a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfaVar;
    }
}
