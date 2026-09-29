package com.lingq.feature.reader.stats.domain;

import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.token.C1533a;
import com.lingq.core.domain.token.C1537e;
import com.lingq.core.p012ui.highlightedtext.domain.C1933a;
import com.lingq.core.settings.theme.C1882b;
import java.util.ArrayList;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.a34;
import p000.aj3;
import p000.c32;
import p000.c83;
import p000.cy9;
import p000.e65;
import p000.e83;
import p000.om3;
import p000.rm3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.domain.GetLynxCoachHighlightsUseCase$invoke$$inlined$flatMapLatest$1", m4291f = "GetLynxCoachHighlightsUseCase.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class GetLynxCoachHighlightsUseCase$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f30753a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f30754b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f30755c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f30756d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ a34 f30757e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f30758f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLynxCoachHighlightsUseCase$invoke$$inlined$flatMapLatest$1(Continuation continuation, int i, a34 a34Var, String str) {
        super(3, continuation);
        this.f30756d = i;
        this.f30757e = a34Var;
        this.f30758f = str;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetLynxCoachHighlightsUseCase$invoke$$inlined$flatMapLatest$1 getLynxCoachHighlightsUseCase$invoke$$inlined$flatMapLatest$1 = new GetLynxCoachHighlightsUseCase$invoke$$inlined$flatMapLatest$1((Continuation) obj3, this.f30756d, this.f30757e, this.f30758f);
        getLynxCoachHighlightsUseCase$invoke$$inlined$flatMapLatest$1.f30754b = (e83) obj;
        getLynxCoachHighlightsUseCase$invoke$$inlined$flatMapLatest$1.f30755c = obj2;
        return getLynxCoachHighlightsUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        c83 c83VarM15530i;
        e83 e83Var = this.f30754b;
        Object obj2 = this.f30755c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30753a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            int i2 = this.f30756d;
            cy9 cy9Var = (cy9) e65.m10872d(i2, (Map) obj2);
            String str = this.f30758f;
            a34 a34Var = this.f30757e;
            if (cy9Var == null) {
                c83VarM15530i = new om3(((C1882b) a34Var.f178f).m8683a(str, true), 1);
            } else {
                ArrayList arrayList = cy9Var.f34713b;
                c83VarM15530i = AbstractC3224d.m15530i(((C1533a) a34Var.f174b).m8210a(str, arrayList), ((C1537e) a34Var.f175c).m8222a(str, arrayList), ((C1933a) a34Var.f176d).m8800a(str, AbstractC3194a.m15364Q(new Pair(new Integer(i2), cy9Var))), ((C1368a) ((rm3) a34Var.f177e).f59534a).f18387Y0, ((C1882b) a34Var.f178f).m8683a(str, true), new GetLynxCoachHighlightsUseCase$invoke$2$1(cy9Var, arrayList, str, this.f30756d, null));
            }
            this.f30754b = null;
            this.f30755c = null;
            this.f30753a = 1;
            if (AbstractC3224d.m15537p(e83Var, c83VarM15530i, this) == coroutineSingletons) {
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
