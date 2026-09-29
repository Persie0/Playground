package com.lingq.feature.collections;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.library.Sort;
import kotlin.AbstractC3193b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.b71;
import p000.c61;
import p000.cma;
import p000.e83;
import p000.fa4;
import p000.g9a;
import p000.l91;
import p000.lda;
import p000.nn1;
import p000.ux5;
import p000.vk9;
import p000.wfb;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.collections.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C2032c implements e83 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C2034d f25538a;

    public C2032c(C2034d c2034d) {
        this.f25538a = c2034d;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[PHI: r1
      0x0070: PHI (r1v1 com.lingq.core.domain.model.language.Language) = 
      (r1v0 com.lingq.core.domain.model.language.Language)
      (r1v0 com.lingq.core.domain.model.language.Language)
      (r1v15 com.lingq.core.domain.model.language.Language)
     binds: [B:18:0x004d, B:20:0x0057, B:25:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x010a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0125  */
    /* JADX WARN: Code duplicated, block: B:41:0x0153  */
    /* JADX WARN: Code duplicated, block: B:44:0x016a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    @Override // p000.e83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object emit(Language language, Continuation continuation) throws Throwable {
        CollectionViewModel$observeActiveLanguage$1$1$emit$1 collectionViewModel$observeActiveLanguage$1$1$emit$1;
        C3244l c3244l;
        Object value;
        l91 l91Var;
        l91 l91Var2;
        l91 l91Var3;
        Language language2 = language;
        C2034d c2034d = this.f25538a;
        nn1 nn1Var = c2034d.f25553L;
        cma cmaVar = c2034d.f25569b;
        b71 b71Var = c2034d.f25554M;
        if (continuation instanceof CollectionViewModel$observeActiveLanguage$1$1$emit$1) {
            collectionViewModel$observeActiveLanguage$1$1$emit$1 = (CollectionViewModel$observeActiveLanguage$1$1$emit$1) continuation;
            int i = collectionViewModel$observeActiveLanguage$1$1$emit$1.f25404d;
            if ((i & Integer.MIN_VALUE) != 0) {
                collectionViewModel$observeActiveLanguage$1$1$emit$1.f25404d = i - Integer.MIN_VALUE;
            } else {
                collectionViewModel$observeActiveLanguage$1$1$emit$1 = new CollectionViewModel$observeActiveLanguage$1$1$emit$1(this, continuation);
            }
        } else {
            collectionViewModel$observeActiveLanguage$1$1$emit$1 = new CollectionViewModel$observeActiveLanguage$1$1$emit$1(this, continuation);
        }
        Object objMo4576F1 = collectionViewModel$observeActiveLanguage$1$1$emit$1.f25402b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = collectionViewModel$observeActiveLanguage$1$1$emit$1.f25404d;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objMo4576F1);
            if (language2 != null) {
                if (vk9.m23391n0(b71Var.f8039d) || fa4.m11650l(language2.f19024a, b71Var.f8039d)) {
                    l91 l91Var4 = new l91(language2.f19024a, language2.f19025b, cmaVar.mo4580K1());
                    c2034d.f25557P = l91Var4;
                    int i3 = b71Var.f8036a;
                    String str = b71Var.f8038c;
                    c2034d.f25557P = l91Var4;
                    c2034d.f25567Z = i3;
                    c2034d.f25568a0 = str;
                    c2034d.f25572c0 = false;
                    C3244l c3244l2 = c2034d.f25561T;
                    c3244l2.getClass();
                    c3244l2.m15572j(null, 1);
                    C3244l c3244l3 = c2034d.f25562U;
                    c3244l3.getClass();
                    EmptyList emptyList = EmptyList.f47638a;
                    c3244l3.m15572j(null, emptyList);
                    C3244l c3244l4 = c2034d.f25563V;
                    c3244l4.getClass();
                    c3244l4.m15572j(null, emptyList);
                    C3244l c3244l5 = c2034d.f25564W;
                    c3244l5.getClass();
                    c3244l5.m15572j(null, emptyList);
                    C3244l c3244l6 = c2034d.f25565X;
                    c3244l6.getClass();
                    c3244l6.m15572j(null, emptyList);
                    c3244l = c2034d.f25559R;
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, null, null, Sort.Position, false, false, false, false, false, true, true, false, false, false, false, false, null, 127479)));
                    AbstractC1263a.m7047b(lda.m16103C(c2034d), nn1Var, ux5.m22988k(c2034d.f25567Z, "observeCollectionCourse-"), new CollectionViewModel$observeCourse$1(c2034d, null));
                    l91Var = c2034d.f25557P;
                    if (l91Var != null) {
                        AbstractC1263a.m7047b(lda.m16103C(c2034d), nn1Var, g9a.m12431h("observeCollectionCourseSubscription-", c2034d.f25567Z, "-", l91Var.f49324a), new CollectionViewModel$observeCourseSubscription$1(c2034d, l91Var, null));
                    }
                    l91Var2 = c2034d.f25557P;
                    if (l91Var2 != null) {
                        AbstractC1263a.m7047b(lda.m16103C(c2034d), nn1Var, g9a.m12431h("observeCollectionBlacklisted-", c2034d.f25567Z, "-", l91Var2.f49324a), new CollectionViewModel$observeBlacklisted$1(c2034d, l91Var2, null));
                    }
                    wfb.m23926u(lda.m16103C(c2034d), nn1Var, null, new CollectionViewModel$observeProfileUsername$1(c2034d, null), 2);
                    c2034d.m8949d3(true);
                    c2034d.m8943X2();
                    l91Var3 = c2034d.f25557P;
                    if (l91Var3 != null) {
                        c2034d.m8948c3(AbstractC3393o1.m17734i("fetchCollectionSubscriptions-", l91Var3.f49324a), new CollectionViewModel$fetchSubscriptions$1(c2034d, l91Var3, null));
                    }
                    c2034d.m8944Y2();
                    if (!c2034d.f25570b0) {
                        c2034d.f25570b0 = true;
                    }
                } else {
                    String str2 = b71Var.f8039d;
                    collectionViewModel$observeActiveLanguage$1$1$emit$1.f25401a = language2;
                    collectionViewModel$observeActiveLanguage$1$1$emit$1.f25404d = 1;
                    objMo4576F1 = cmaVar.mo4576F1(str2, collectionViewModel$observeActiveLanguage$1$1$emit$1);
                    if (objMo4576F1 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
            }
            return xfaVar;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        language2 = collectionViewModel$observeActiveLanguage$1$1$emit$1.f25401a;
        AbstractC3193b.m15359b(objMo4576F1);
        if (!((Boolean) objMo4576F1).booleanValue()) {
            l91 l91Var5 = new l91(language2.f19024a, language2.f19025b, cmaVar.mo4580K1());
            c2034d.f25557P = l91Var5;
            int i4 = b71Var.f8036a;
            String str3 = b71Var.f8038c;
            c2034d.f25557P = l91Var5;
            c2034d.f25567Z = i4;
            c2034d.f25568a0 = str3;
            c2034d.f25572c0 = false;
            C3244l c3244l7 = c2034d.f25561T;
            c3244l7.getClass();
            c3244l7.m15572j(null, 1);
            C3244l c3244l8 = c2034d.f25562U;
            c3244l8.getClass();
            EmptyList emptyList2 = EmptyList.f47638a;
            c3244l8.m15572j(null, emptyList2);
            C3244l c3244l9 = c2034d.f25563V;
            c3244l9.getClass();
            c3244l9.m15572j(null, emptyList2);
            C3244l c3244l10 = c2034d.f25564W;
            c3244l10.getClass();
            c3244l10.m15572j(null, emptyList2);
            C3244l c3244l11 = c2034d.f25565X;
            c3244l11.getClass();
            c3244l11.m15572j(null, emptyList2);
            c3244l = c2034d.f25559R;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, c61.m4341a((c61) value, null, null, null, Sort.Position, false, false, false, false, false, true, true, false, false, false, false, false, null, 127479)));
            AbstractC1263a.m7047b(lda.m16103C(c2034d), nn1Var, ux5.m22988k(c2034d.f25567Z, "observeCollectionCourse-"), new CollectionViewModel$observeCourse$1(c2034d, null));
            l91Var = c2034d.f25557P;
            if (l91Var != null) {
                AbstractC1263a.m7047b(lda.m16103C(c2034d), nn1Var, g9a.m12431h("observeCollectionCourseSubscription-", c2034d.f25567Z, "-", l91Var.f49324a), new CollectionViewModel$observeCourseSubscription$1(c2034d, l91Var, null));
            }
            l91Var2 = c2034d.f25557P;
            if (l91Var2 != null) {
                AbstractC1263a.m7047b(lda.m16103C(c2034d), nn1Var, g9a.m12431h("observeCollectionBlacklisted-", c2034d.f25567Z, "-", l91Var2.f49324a), new CollectionViewModel$observeBlacklisted$1(c2034d, l91Var2, null));
            }
            wfb.m23926u(lda.m16103C(c2034d), nn1Var, null, new CollectionViewModel$observeProfileUsername$1(c2034d, null), 2);
            c2034d.m8949d3(true);
            c2034d.m8943X2();
            l91Var3 = c2034d.f25557P;
            if (l91Var3 != null) {
                c2034d.m8948c3(AbstractC3393o1.m17734i("fetchCollectionSubscriptions-", l91Var3.f49324a), new CollectionViewModel$fetchSubscriptions$1(c2034d, l91Var3, null));
            }
            c2034d.m8944Y2();
            if (!c2034d.f25570b0) {
                c2034d.f25570b0 = true;
            }
        }
        return xfaVar;
    }
}
