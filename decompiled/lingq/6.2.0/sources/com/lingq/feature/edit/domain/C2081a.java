package com.lingq.feature.edit.domain;

import com.lingq.core.data.repository.C1295k;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.d65;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.edit.domain.a */
/* JADX INFO: loaded from: classes2.dex */
public final class C2081a {

    /* JADX INFO: renamed from: a */
    public final d65 f25979a;

    public C2081a(d65 d65Var, int i) {
        d65Var.getClass();
        switch (i) {
            case 1:
                this.f25979a = d65Var;
                break;
            default:
                this.f25979a = d65Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (((com.lingq.core.data.repository.C1295k) r6).m7299s(r7, r8, r0) == r1) goto L21;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object m8994a(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        FetchLessonSentencesUseCase$invoke$1 fetchLessonSentencesUseCase$invoke$1;
        if (continuationImpl instanceof FetchLessonSentencesUseCase$invoke$1) {
            fetchLessonSentencesUseCase$invoke$1 = (FetchLessonSentencesUseCase$invoke$1) continuationImpl;
            int i2 = fetchLessonSentencesUseCase$invoke$1.f25971e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fetchLessonSentencesUseCase$invoke$1.f25971e = i2 - Integer.MIN_VALUE;
            } else {
                fetchLessonSentencesUseCase$invoke$1 = new FetchLessonSentencesUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            fetchLessonSentencesUseCase$invoke$1 = new FetchLessonSentencesUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = fetchLessonSentencesUseCase$invoke$1.f25969c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = fetchLessonSentencesUseCase$invoke$1.f25971e;
        d65 d65Var = this.f25979a;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            fetchLessonSentencesUseCase$invoke$1.f25967a = str;
            fetchLessonSentencesUseCase$invoke$1.f25968b = i;
            fetchLessonSentencesUseCase$invoke$1.f25971e = 1;
            if (((C1295k) d65Var).m7265W(i, str, fetchLessonSentencesUseCase$invoke$1) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = fetchLessonSentencesUseCase$invoke$1.f25968b;
            str = fetchLessonSentencesUseCase$invoke$1.f25967a;
            AbstractC3193b.m15359b(obj);
        } else {
            if (i3 != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
        fetchLessonSentencesUseCase$invoke$1.f25967a = null;
        fetchLessonSentencesUseCase$invoke$1.f25968b = i;
        fetchLessonSentencesUseCase$invoke$1.f25971e = 2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public Object m8995b(String str, int i, List list, ContinuationImpl continuationImpl) throws Throwable {
        SyncSentenceEditsUseCase$invoke$1 syncSentenceEditsUseCase$invoke$1;
        int i2;
        Iterator it;
        List list2;
        d65 d65Var;
        int iIntValue;
        if (continuationImpl instanceof SyncSentenceEditsUseCase$invoke$1) {
            syncSentenceEditsUseCase$invoke$1 = (SyncSentenceEditsUseCase$invoke$1) continuationImpl;
            int i3 = syncSentenceEditsUseCase$invoke$1.f25978g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                syncSentenceEditsUseCase$invoke$1.f25978g = i3 - Integer.MIN_VALUE;
            } else {
                syncSentenceEditsUseCase$invoke$1 = new SyncSentenceEditsUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            syncSentenceEditsUseCase$invoke$1 = new SyncSentenceEditsUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = syncSentenceEditsUseCase$invoke$1.f25976e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = syncSentenceEditsUseCase$invoke$1.f25978g;
        xfa xfaVar = xfa.f68157a;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            Iterator it2 = list.iterator();
            i2 = i;
            it = it2;
            list2 = list;
        } else {
            if (i4 != 1) {
                if (i4 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                List list3 = syncSentenceEditsUseCase$invoke$1.f25973b;
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            int i5 = syncSentenceEditsUseCase$invoke$1.f25975d;
            it = syncSentenceEditsUseCase$invoke$1.f25974c;
            List list4 = syncSentenceEditsUseCase$invoke$1.f25973b;
            String str2 = syncSentenceEditsUseCase$invoke$1.f25972a;
            AbstractC3193b.m15359b(obj);
            list2 = list4;
            i2 = i5;
            str = str2;
        }
        do {
            boolean zHasNext = it.hasNext();
            d65Var = this.f25979a;
            if (!zHasNext) {
                if (!list2.isEmpty()) {
                    syncSentenceEditsUseCase$invoke$1.f25972a = null;
                    syncSentenceEditsUseCase$invoke$1.f25973b = null;
                    syncSentenceEditsUseCase$invoke$1.f25974c = null;
                    syncSentenceEditsUseCase$invoke$1.f25975d = i2;
                    syncSentenceEditsUseCase$invoke$1.f25978g = 2;
                    if (((C1295k) d65Var).m7302v(str, i2, true, syncSentenceEditsUseCase$invoke$1) == coroutineSingletons) {
                        break;
                    }
                }
                return xfaVar;
            }
            iIntValue = ((Number) it.next()).intValue();
            syncSentenceEditsUseCase$invoke$1.f25972a = str;
            syncSentenceEditsUseCase$invoke$1.f25973b = list2;
            syncSentenceEditsUseCase$invoke$1.f25974c = it;
            syncSentenceEditsUseCase$invoke$1.f25975d = i2;
            syncSentenceEditsUseCase$invoke$1.f25978g = 1;
        } while (((C1295k) d65Var).m7268Z(i2, iIntValue, str, syncSentenceEditsUseCase$invoke$1) != coroutineSingletons);
        return coroutineSingletons;
    }
}
