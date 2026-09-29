package com.lingq.core.domain.token;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1310z;
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
import p000.b91;
import p000.c32;
import p000.c83;
import p000.e83;
import p000.u91;
import p000.v91;
import p000.xfa;
import p000.xz7;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.token.GetWordsForTokensUseCase$invoke$1", m4291f = "GetWordsForTokensUseCase.kt", m4292l = {DescriptorProtos.FileOptions.CSHARP_NAMESPACE_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class GetWordsForTokensUseCase$invoke$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f20076a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f20077b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ List f20078c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1537e f20079d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f20080e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Locale f20081f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetWordsForTokensUseCase$invoke$1(List list, C1537e c1537e, String str, Locale locale, Continuation continuation) {
        super(2, continuation);
        this.f20078c = list;
        this.f20079d = c1537e;
        this.f20080e = str;
        this.f20081f = locale;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        GetWordsForTokensUseCase$invoke$1 getWordsForTokensUseCase$invoke$1 = new GetWordsForTokensUseCase$invoke$1(this.f20078c, this.f20079d, this.f20080e, this.f20081f, continuation);
        getWordsForTokensUseCase$invoke$1.f20077b = obj;
        return getWordsForTokensUseCase$invoke$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((GetWordsForTokensUseCase$invoke$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        e83 e83Var = (e83) this.f20077b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f20076a;
        xfa xfaVar = xfa.f68157a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            List list = this.f20078c;
            ArrayList arrayList = new ArrayList(v91.m23189q0(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((xz7) it.next()).f69008e);
            }
            ArrayList arrayListM22632y0 = u91.m22632y0(u91.m22622n1(u91.m22626r1(arrayList)), 200);
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayListM22632y0, 10));
            Iterator it2 = arrayListM22632y0.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((C1310z) this.f20079d.f20103a).m7428g(this.f20080e, (List) it2.next()));
            }
            c83[] c83VarArr = (c83[]) u91.m22622n1(arrayList2).toArray(new c83[0]);
            this.f20077b = null;
            this.f20076a = 1;
            AbstractC3224d.m15539r(e83Var);
            Object objM15568a = AbstractC3238h.m15568a(e83Var, new b91(c83VarArr, 5), new C1532xa7874ee0(null, this.f20081f), this, c83VarArr);
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
