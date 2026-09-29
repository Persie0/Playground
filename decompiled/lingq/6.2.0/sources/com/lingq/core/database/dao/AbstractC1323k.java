package com.lingq.core.database.dao;

import androidx.room.util.AbstractC0758a;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.bq1;
import p000.d32;
import p000.l05;
import p000.rxa;
import p000.ux5;
import p000.vk9;
import p000.xca;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.database.dao.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1323k extends bq1 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: y0 */
    public final Object m7516y0(String str, List list, ContinuationImpl continuationImpl) throws Throwable {
        VocabularyCardDao$clearSrsDueDateForCards$1 vocabularyCardDao$clearSrsDueDateForCards$1;
        if (continuationImpl instanceof VocabularyCardDao$clearSrsDueDateForCards$1) {
            vocabularyCardDao$clearSrsDueDateForCards$1 = (VocabularyCardDao$clearSrsDueDateForCards$1) continuationImpl;
            int i = vocabularyCardDao$clearSrsDueDateForCards$1.f16995d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vocabularyCardDao$clearSrsDueDateForCards$1.f16995d = i - Integer.MIN_VALUE;
            } else {
                vocabularyCardDao$clearSrsDueDateForCards$1 = new VocabularyCardDao$clearSrsDueDateForCards$1(this, continuationImpl);
            }
        } else {
            vocabularyCardDao$clearSrsDueDateForCards$1 = new VocabularyCardDao$clearSrsDueDateForCards$1(this, continuationImpl);
        }
        Object obj = vocabularyCardDao$clearSrsDueDateForCards$1.f16993b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = vocabularyCardDao$clearSrsDueDateForCards$1.f16995d;
        xfa xfaVar = xfa.f68157a;
        int i3 = 1;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            vocabularyCardDao$clearSrsDueDateForCards$1.f16992a = str;
            vocabularyCardDao$clearSrsDueDateForCards$1.f16995d = 1;
            StringBuilder sbM22997t = ux5.m22997t("UPDATE CardEntity SET srsDueDate = NULL WHERE id IN (");
            d32.m10005B(list.size(), sbM22997t);
            sbM22997t.append(")");
            Object objM2861d = AbstractC0758a.m2861d(new l05(3, sbM22997t.toString(), list), ((rxa) this).f60013K, vocabularyCardDao$clearSrsDueDateForCards$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
            if (objM2861d != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = vocabularyCardDao$clearSrsDueDateForCards$1.f16992a;
        AbstractC3193b.m15359b(obj);
        if (str != null && !vk9.m23391n0(str)) {
            vocabularyCardDao$clearSrsDueDateForCards$1.f16992a = null;
            vocabularyCardDao$clearSrsDueDateForCards$1.f16995d = 2;
            Object objM2861d2 = AbstractC0758a.m2861d(new xca(str, i3), ((rxa) this).f60013K, vocabularyCardDao$clearSrsDueDateForCards$1, false, true);
            if (objM2861d2 != coroutineSingletons) {
                objM2861d2 = xfaVar;
            }
            if (objM2861d2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfaVar;
    }
}
