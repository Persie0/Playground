package com.lingq.feature.vocabulary.filter;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.p012ui.R$string;
import com.lingq.core.settings.ViewKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3423or;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.d29;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vk9;
import p000.vz1;
import p000.w19;
import p000.x19;
import p000.xfa;
import p000.y02;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterViewModel$1", m4291f = "VocabularyFilterViewModel.kt", m4292l = {DescriptorProtos.FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER}, m4293m = "invokeSuspend", m4294v = 2)
final class VocabularyFilterViewModel$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f33645a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2851c f33646b;

    /* JADX INFO: renamed from: com.lingq.feature.vocabulary.filter.VocabularyFilterViewModel$1$1 */
    @c32(m4290c = "com.lingq.feature.vocabulary.filter.VocabularyFilterViewModel$1$1", m4291f = "VocabularyFilterViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C28411 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f33647a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2851c f33648b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C28411(C2851c c2851c, Continuation continuation) {
            super(2, continuation);
            this.f33648b = c2851c;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C28411 c28411 = new C28411(this.f33648b, continuation);
            c28411.f33647a = obj;
            return c28411;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C28411 c28411 = (C28411) create((Map) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c28411.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map map = (Map) this.f33647a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C2851c c2851c = this.f33648b;
            VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) map.get(c2851c.f33702b.mo4589b2());
            if (vocabularySearchQuery != null) {
                List list = vocabularySearchQuery.f19866h;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new d29(R$string.card_sort_status));
                List list2 = list;
                ArrayList arrayList2 = new ArrayList(v91.m23189q0(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(AbstractC3423or.m18225J((CardStatus) it.next())));
                }
                arrayList.add(new w19(arrayList2, vz1.m23605K(Integer.valueOf(com.lingq.core.settings.R$string.search_status_1), Integer.valueOf(com.lingq.core.settings.R$string.search_status_2), Integer.valueOf(com.lingq.core.settings.R$string.search_status_3), Integer.valueOf(com.lingq.core.settings.R$string.search_status_4), Integer.valueOf(com.lingq.core.settings.R$string.search_status_known)), vocabularySearchQuery.f19859a, vocabularySearchQuery.f19860b, ViewKeys.StatusRange, Math.max(list.size() - 1.0f, 0.0f)));
                arrayList.add(new d29(com.lingq.core.settings.R$string.sort_sort_by));
                arrayList.add(new x19(Integer.valueOf(AbstractC3423or.m18227L(vocabularySearchQuery.f19863e)), null, ViewKeys.SortBy, 2));
                arrayList.add(new d29(com.lingq.core.settings.R$string.card_search_term));
                arrayList.add(new x19(Integer.valueOf(AbstractC3423or.m18226K(vocabularySearchQuery.f19861c)), null, ViewKeys.SearchTerm, 2));
                arrayList.add(new d29(R$string.lingq_tags));
                arrayList.add(new x19(null, u91.m22596N0(vocabularySearchQuery.f19865g, ",", null, null, null, 62), ViewKeys.Tags, 1));
                arrayList.add(new d29(R$string.lingq_course));
                arrayList.add(new x19(null, (String) vocabularySearchQuery.f19867i.f47623a, ViewKeys.Course, 1));
                arrayList.add(new d29(R$string.lingq_lesson));
                arrayList.add(new x19(null, (String) vocabularySearchQuery.f19868j.f47623a, ViewKeys.Lesson, 1));
                arrayList.add(new d29(com.lingq.core.settings.R$string.card_srs_Date));
                String strM24807e = y02.m24807e(vocabularySearchQuery.f19864f, "yyyy-MM-dd", "dd MMM, yyyy");
                if (vk9.m23391n0(strM24807e)) {
                    strM24807e = vocabularySearchQuery.f19864f;
                }
                arrayList.add(new x19(null, strM24807e, ViewKeys.VocabularySrsDate, 1));
                C3244l c3244l = c2851c.f33704d;
                c3244l.getClass();
                c3244l.m15572j(null, arrayList);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VocabularyFilterViewModel$1(C2851c c2851c, Continuation continuation) {
        super(2, continuation);
        this.f33646b = c2851c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VocabularyFilterViewModel$1(this.f33646b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((VocabularyFilterViewModel$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f33645a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2851c c2851c = this.f33646b;
            c83 c83Var = ((C1371d) c2851c.f33703c).f18580q;
            C28411 c28411 = new C28411(c2851c, null);
            this.f33645a = 1;
            if (AbstractC3224d.m15529h(c83Var, c28411, this) == coroutineSingletons) {
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
