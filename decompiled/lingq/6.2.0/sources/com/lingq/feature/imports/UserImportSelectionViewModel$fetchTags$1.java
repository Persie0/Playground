package com.lingq.feature.imports;

import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.library.CollectionsFilterLessonTag;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.fv8;
import p000.g41;
import p000.ika;
import p000.lda;
import p000.u91;
import p000.v91;
import p000.vi3;
import p000.vk9;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$fetchTags$1", m4291f = "UserImportSelectionViewModel.kt", m4292l = {261}, m4293m = "invokeSuspend", m4294v = 2)
final class UserImportSelectionViewModel$fetchTags$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f26055a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2108e f26056b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f26057c;

    /* JADX INFO: renamed from: com.lingq.feature.imports.UserImportSelectionViewModel$fetchTags$1$1 */
    @c32(m4290c = "com.lingq.feature.imports.UserImportSelectionViewModel$fetchTags$1$1", m4291f = "UserImportSelectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20961 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f26058a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2108e f26059b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Set f26060c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20961(C2108e c2108e, Set set, Continuation continuation) {
            super(2, continuation);
            this.f26059b = c2108e;
            this.f26060c = set;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20961 c20961 = new C20961(this.f26059b, this.f26060c, continuation);
            c20961.f26058a = obj;
            return c20961;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20961 c20961 = (C20961) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20961.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f26058a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f26059b.f26167o;
            ArrayList<CollectionsFilterLessonTag> arrayList = new ArrayList();
            for (Object obj2 : list) {
                CollectionsFilterLessonTag collectionsFilterLessonTag = (CollectionsFilterLessonTag) obj2;
                String str = collectionsFilterLessonTag.f19341a;
                if (str == null || !vk9.m23391n0(str) || collectionsFilterLessonTag.f19341a == null) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(arrayList, 10));
            for (CollectionsFilterLessonTag collectionsFilterLessonTag2 : arrayList) {
                String str2 = collectionsFilterLessonTag2.f19341a;
                String str3 = str2 == null ? "" : str2;
                boolean zM22633z0 = u91.m22633z0(this.f26060c, str2);
                String str4 = collectionsFilterLessonTag2.f19341a;
                arrayList2.add(new fv8(1, null, str3, str4 == null ? "" : str4, zM22633z0));
            }
            c3244l.getClass();
            c3244l.m15572j(null, arrayList2);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserImportSelectionViewModel$fetchTags$1(C2108e c2108e, String str, Continuation continuation) {
        super(1, continuation);
        this.f26056b = c2108e;
        this.f26057c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new UserImportSelectionViewModel$fetchTags$1(this.f26056b, this.f26057c, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((UserImportSelectionViewModel$fetchTags$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f26055a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2108e c2108e = this.f26056b;
            g41 g41VarM16103C = lda.m16103C(c2108e);
            String str = this.f26057c;
            wfb.m23926u(g41VarM16103C, null, null, new UserImportSelectionViewModel$networkTags$1(c2108e, str, null), 3);
            Set setM22627s1 = u91.m22627s1(((ika) c2108e.f26154b.mo9014u2().getValue()).f44245i);
            c83 c83VarM7258P = ((C1295k) c2108e.f26158f).m7258P(str);
            C20961 c20961 = new C20961(c2108e, setM22627s1, null);
            this.f26055a = 1;
            if (AbstractC3224d.m15529h(c83VarM7258P, c20961, this) == coroutineSingletons) {
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
