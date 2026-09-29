package com.lingq.core.domain.library;

import com.lingq.core.data.repository.C1286b;
import com.lingq.core.domain.model.library.LibraryItem;
import com.lingq.core.domain.model.library.LibraryItemType;
import com.lingq.core.domain.util.AbstractC1543a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.e83;
import p000.fa4;
import p000.n83;
import p000.p02;
import p000.v91;
import p000.xfa;
import p000.ym3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.lingq.core.domain.library.GetShelfContentUseCase$invoke$$inlined$flatMapLatest$1", m4291f = "GetShelfContentUseCase.kt", m4292l = {189}, m4293m = "invokeSuspend", m4294v = 2)
public final class GetShelfContentUseCase$invoke$$inlined$flatMapLatest$1 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f18784a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f18785b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f18786c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1389d f18787d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f18788e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetShelfContentUseCase$invoke$$inlined$flatMapLatest$1(Continuation continuation, C1389d c1389d, String str) {
        super(3, continuation);
        this.f18787d = c1389d;
        this.f18788e = str;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetShelfContentUseCase$invoke$$inlined$flatMapLatest$1 getShelfContentUseCase$invoke$$inlined$flatMapLatest$1 = new GetShelfContentUseCase$invoke$$inlined$flatMapLatest$1((Continuation) obj3, this.f18787d, this.f18788e);
        getShelfContentUseCase$invoke$$inlined$flatMapLatest$1.f18785b = (e83) obj;
        getShelfContentUseCase$invoke$$inlined$flatMapLatest$1.f18786c = obj2;
        return getShelfContentUseCase$invoke$$inlined$flatMapLatest$1.invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1389d c1389d = this.f18787d;
        C1286b c1286b = (C1286b) c1389d.f18835b;
        e83 e83Var = this.f18785b;
        Object obj2 = this.f18786c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f18784a;
        int i2 = 1;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            p02 p02Var = (p02) obj2;
            Integer num = (Integer) p02Var.f55353b;
            int iIntValue = num != null ? num.intValue() : -1;
            List list = (List) p02Var.f55352a;
            if (list == null) {
                list = EmptyList.f47638a;
            }
            List list2 = list;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list2) {
                if (fa4.m11650l(((LibraryItem) obj3).f19428b, LibraryItemType.Content.getValue())) {
                    arrayList.add(obj3);
                }
            }
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AbstractC3393o1.m17749x(((LibraryItem) it.next()).f19426a, arrayList2);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list2) {
                if (fa4.m11650l(((LibraryItem) obj4).f19428b, LibraryItemType.Collection.getValue())) {
                    arrayList3.add(obj4);
                }
            }
            ArrayList arrayList4 = new ArrayList(v91.m23189q0(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                AbstractC3393o1.m17749x(((LibraryItem) it2.next()).f19426a, arrayList4);
            }
            ym3 ym3Var = new ym3(c1389d, list, 0);
            String str = this.f18788e;
            n83 n83VarM15531j = AbstractC3224d.m15531j(AbstractC1543a.m8226a(ym3Var, new GetShelfContentUseCase$invoke$3$2(arrayList2, c1389d, str, null)), AbstractC1543a.m8226a(new ym3(c1389d, list, i2), new GetShelfContentUseCase$invoke$3$4(arrayList4, c1389d, str, null)), c1286b.m7106h(str), c1286b.m7105g(str), new GetShelfContentUseCase$invoke$3$5(iIntValue, list, null));
            this.f18785b = null;
            this.f18786c = null;
            this.f18784a = 1;
            if (AbstractC3224d.m15537p(e83Var, n83VarM15531j, this) == coroutineSingletons) {
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
