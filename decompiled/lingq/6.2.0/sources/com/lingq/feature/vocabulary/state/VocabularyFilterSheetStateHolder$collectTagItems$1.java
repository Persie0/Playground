package com.lingq.feature.vocabulary.state;

import com.lingq.core.p012ui.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.bj3;
import p000.c32;
import p000.fv8;
import p000.n83;
import p000.un1;
import p000.v91;
import p000.vk9;
import p000.xfa;
import p000.xza;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$collectTagItems$1", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {354}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterSheetStateHolder$collectTagItems$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33706a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2860b f33707b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$collectTagItems$1$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.state.VocabularyFilterSheetStateHolder$collectTagItems$1$1", m4291f = "VocabularyFilterSheetStateHolder.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28521 extends SuspendLambda implements bj3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ List f33708a;

        /* JADX INFO: renamed from: b */
        public /* synthetic */ List f33709b;

        /* JADX INFO: renamed from: c */
        public /* synthetic */ String f33710c;

        @Override // p000.bj3
        /* JADX INFO: renamed from: e */
        public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
            C28521 c28521 = new C28521(4, (Continuation) obj4);
            c28521.f33708a = (List) obj;
            c28521.f33709b = (List) obj2;
            c28521.f33710c = (String) obj3;
            return c28521.invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = this.f33708a;
            List list2 = this.f33709b;
            String str = this.f33710c;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            ArrayList arrayList = new ArrayList();
            ArrayList<String> arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                String str2 = (String) obj2;
                if (!vk9.m23391n0(str2) && vk9.m23380c0(str2, str, false)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(v91.m23189q0(arrayList2, 10));
            for (String str3 : arrayList2) {
                arrayList3.add(new fv8(1, null, str3, str3, list2.contains(str3)));
            }
            arrayList.addAll(arrayList3);
            if (vk9.m23391n0(str)) {
                arrayList.add(0, new fv8(2, new Integer(R$string.search_all), null, "key_all", list2.isEmpty()));
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterSheetStateHolder$collectTagItems$1(C2860b c2860b, Continuation continuation) {
        super(2, continuation);
        this.f33707b = c2860b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterSheetStateHolder$collectTagItems$1(this.f33707b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterSheetStateHolder$collectTagItems$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33706a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2860b c2860b = this.f33707b;
            n83 n83VarM15532k = AbstractC3224d.m15532k(c2860b.f33788q, c2860b.f33789r, c2860b.f33787p, new C28521(4, null));
            xza xzaVar = new xza(c2860b, 0);
            this.f33706a = 1;
            if (n83VarM15532k.collect(xzaVar, this) == coroutineSingletons) {
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
