package com.lingq.core.domain.vocabulary;

import com.lingq.core.data.repository.C1308x;
import com.lingq.core.domain.model.status.CardStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
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
import p000.i83;
import p000.mxa;
import p000.nv0;
import p000.rxa;
import p000.u91;
import p000.vk9;
import p000.wm3;
import p000.wz0;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.vocabulary.GetSampleLingqsUseCase$invoke$lambda$0$$inlined$flatMapLatest$1", m4291f = "GetSampleLingqsUseCase.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class GetSampleLingqsUseCase$invoke$lambda$0$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f20153a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f20154b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f20155c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ wm3 f20156d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSampleLingqsUseCase$invoke$lambda$0$$inlined$flatMapLatest$1(Continuation continuation, wm3 wm3Var) {
        super(3, continuation);
        this.f20156d = wm3Var;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetSampleLingqsUseCase$invoke$lambda$0$$inlined$flatMapLatest$1 getSampleLingqsUseCase$invoke$lambda$0$$inlined$flatMapLatest$1 = new GetSampleLingqsUseCase$invoke$lambda$0$$inlined$flatMapLatest$1((Continuation) obj3, this.f20156d);
        getSampleLingqsUseCase$invoke$lambda$0$$inlined$flatMapLatest$1.f20154b = (e83) obj;
        getSampleLingqsUseCase$invoke$lambda$0$$inlined$flatMapLatest$1.f20155c = obj2;
        return getSampleLingqsUseCase$invoke$lambda$0$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        c83 wz0Var;
        e83 e83Var = this.f20154b;
        Object obj2 = this.f20155c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20153a;
        int i2 = 1;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj2).iterator();
            while (it.hasNext()) {
                String string = vk9.m23376L0(((mxa) it.next()).f52004b).toString();
                if (string.length() == 0) {
                    string = null;
                }
                if (string != null) {
                    arrayList.add(string);
                }
            }
            int i3 = 10;
            if (arrayList.size() >= 10) {
                wz0Var = new i83(u91.m22615g1(arrayList, 18), 1);
            } else {
                rxa rxaVar = (rxa) ((C1308x) this.f20156d.f67051a).f16569b;
                wz0Var = new wz0(i3, AbstractC3224d.m15536o(AbstractC3584sr.m21590A(rxaVar.f60013K, true, new String[]{"CardEntity"}, new nv0(CardStatus.New.getValue(), CardStatus.Known.getValue(), rxaVar, i2))), arrayList);
            }
            this.f20154b = null;
            this.f20155c = null;
            this.f20153a = 1;
            if (AbstractC3224d.m15537p(e83Var, wz0Var, this) == coroutineSingletons) {
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
