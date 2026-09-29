package com.lingq.core.token.domain;

import com.lingq.core.common.AbstractC1261a;
import com.lingq.core.data.repository.C1287c;
import com.lingq.core.data.repository.C1310z;
import com.lingq.core.datastore.C1371d;
import com.lingq.core.domain.model.lesson.LessonCard;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.internal.C3235e;
import p000.C3386nv;
import p000.C3540rl;
import p000.C3577sk;
import p000.ao0;
import p000.c83;
import p000.fa4;
import p000.lm4;
import p000.ol3;
import p000.s7b;
import p000.vma;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.token.domain.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1906c {

    /* JADX INFO: renamed from: a */
    public final Object f23860a;

    public C1906c(ao0 ao0Var) {
        ao0Var.getClass();
        this.f23860a = ao0Var;
    }

    /* JADX INFO: renamed from: a */
    public c83 m8721a(String str, String str2) {
        str.getClass();
        str2.getClass();
        return AbstractC3224d.m15536o(AbstractC3224d.m15546y(new C3540rl(((C1310z) ((s7b) this.f23860a)).m7427f(str, str2), 5), new GetGrammarTagsForTerm$invoke$1(2, null)));
    }

    /* JADX INFO: renamed from: b */
    public ol3 m8722b(String str) {
        str.getClass();
        return new ol3(AbstractC1261a.m7043b(new C3577sk(20, this, str), new GetAvailableTagsUseCase$invoke$2(this, str, null)), 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: c */
    public Object m8723c(String str, String str2, String str3, ContinuationImpl continuationImpl) throws Throwable {
        UpdateNoteUseCase$invoke$1 updateNoteUseCase$invoke$1;
        ao0 ao0Var = (ao0) this.f23860a;
        if (continuationImpl instanceof UpdateNoteUseCase$invoke$1) {
            updateNoteUseCase$invoke$1 = (UpdateNoteUseCase$invoke$1) continuationImpl;
            int i = updateNoteUseCase$invoke$1.f23844f;
            if ((i & Integer.MIN_VALUE) != 0) {
                updateNoteUseCase$invoke$1.f23844f = i - Integer.MIN_VALUE;
            } else {
                updateNoteUseCase$invoke$1 = new UpdateNoteUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updateNoteUseCase$invoke$1 = new UpdateNoteUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7116f = updateNoteUseCase$invoke$1.f23842d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = updateNoteUseCase$invoke$1.f23844f;
        xfa xfaVar = xfa.f68157a;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM7116f);
            updateNoteUseCase$invoke$1.f23839a = str;
            updateNoteUseCase$invoke$1.f23840b = str2;
            updateNoteUseCase$invoke$1.f23841c = str3;
            updateNoteUseCase$invoke$1.f23844f = 1;
            objM7116f = ((C1287c) ao0Var).m7116f(str, str2, updateNoteUseCase$invoke$1);
            if (objM7116f != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(objM7116f);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str3 = updateNoteUseCase$invoke$1.f23841c;
        str2 = updateNoteUseCase$invoke$1.f23840b;
        str = updateNoteUseCase$invoke$1.f23839a;
        AbstractC3193b.m15359b(objM7116f);
        LessonCard lessonCard = (LessonCard) objM7116f;
        if (lessonCard != null && !fa4.m11650l(lessonCard.f19192o, str3)) {
            updateNoteUseCase$invoke$1.f23839a = null;
            updateNoteUseCase$invoke$1.f23840b = null;
            updateNoteUseCase$invoke$1.f23841c = null;
            updateNoteUseCase$invoke$1.f23844f = 2;
            if (((C1287c) ao0Var).m7132v(str, str2, str3, updateNoteUseCase$invoke$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }

    /* JADX INFO: renamed from: d */
    public C3235e m8724d(String str, String str2, List list) {
        str.getClass();
        list.getClass();
        return AbstractC3224d.m15546y(((C1371d) ((vma) this.f23860a)).f18587x, new GetPopularLocalePreferenceUseCase$invoke$1(str, str2, this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        if (((com.lingq.core.datastore.C1371d) r0).m7966f(r6, r1) == r9) goto L21;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8725e(String str, String str2, ContinuationImpl continuationImpl) throws Throwable {
        GetPopularLocalePreferenceUseCase$updatePreference$1 getPopularLocalePreferenceUseCase$updatePreference$1;
        vma vmaVar = (vma) this.f23860a;
        if (continuationImpl instanceof GetPopularLocalePreferenceUseCase$updatePreference$1) {
            getPopularLocalePreferenceUseCase$updatePreference$1 = (GetPopularLocalePreferenceUseCase$updatePreference$1) continuationImpl;
            int i = getPopularLocalePreferenceUseCase$updatePreference$1.f23811e;
            if ((i & Integer.MIN_VALUE) != 0) {
                getPopularLocalePreferenceUseCase$updatePreference$1.f23811e = i - Integer.MIN_VALUE;
            } else {
                getPopularLocalePreferenceUseCase$updatePreference$1 = new GetPopularLocalePreferenceUseCase$updatePreference$1(this, continuationImpl);
            }
        } else {
            getPopularLocalePreferenceUseCase$updatePreference$1 = new GetPopularLocalePreferenceUseCase$updatePreference$1(this, continuationImpl);
        }
        Object objM15541t = getPopularLocalePreferenceUseCase$updatePreference$1.f23809c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = getPopularLocalePreferenceUseCase$updatePreference$1.f23811e;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1371d) vmaVar).f18587x;
            getPopularLocalePreferenceUseCase$updatePreference$1.f23807a = str;
            getPopularLocalePreferenceUseCase$updatePreference$1.f23808b = str2;
            getPopularLocalePreferenceUseCase$updatePreference$1.f23811e = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, getPopularLocalePreferenceUseCase$updatePreference$1);
            if (objM15541t != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 == 1) {
            str2 = getPopularLocalePreferenceUseCase$updatePreference$1.f23808b;
            str = getPopularLocalePreferenceUseCase$updatePreference$1.f23807a;
            AbstractC3193b.m15359b(objM15541t);
        } else {
            if (i2 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        return xfa.f68157a;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        linkedHashMapM15372Y.put(str, str2);
        getPopularLocalePreferenceUseCase$updatePreference$1.f23807a = null;
        getPopularLocalePreferenceUseCase$updatePreference$1.f23808b = null;
        getPopularLocalePreferenceUseCase$updatePreference$1.f23811e = 2;
    }

    public C1906c(lm4 lm4Var) {
        lm4Var.getClass();
        this.f23860a = lm4Var;
    }

    public C1906c(vma vmaVar) {
        vmaVar.getClass();
        this.f23860a = vmaVar;
    }

    public C1906c(s7b s7bVar) {
        s7bVar.getClass();
        this.f23860a = s7bVar;
    }
}
