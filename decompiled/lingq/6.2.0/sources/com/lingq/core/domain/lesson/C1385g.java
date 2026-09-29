package com.lingq.core.domain.lesson;

import com.lingq.core.datastore.C1371d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c83;
import p000.d65;
import p000.vma;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.domain.lesson.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1385g {

    /* JADX INFO: renamed from: a */
    public final d65 f18734a;

    /* JADX INFO: renamed from: b */
    public final vma f18735b;

    public C1385g(d65 d65Var, vma vmaVar) {
        d65Var.getClass();
        vmaVar.getClass();
        this.f18734a = d65Var;
        this.f18735b = vmaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
    
        if (((com.lingq.core.data.repository.C1295k) r16.f18734a).m7263U(r10, r7, r4 / 1000.0d, r8, r2) == r3) goto L28;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7996a(String str, int i, long j, Integer num, ContinuationImpl continuationImpl) throws Throwable {
        UpdateLessonAudioProgressUseCase$invoke$1 updateLessonAudioProgressUseCase$invoke$1;
        Integer num2;
        int i2;
        long j2;
        String str2;
        Integer num3;
        int i3;
        String str3;
        long j3;
        if (continuationImpl instanceof UpdateLessonAudioProgressUseCase$invoke$1) {
            updateLessonAudioProgressUseCase$invoke$1 = (UpdateLessonAudioProgressUseCase$invoke$1) continuationImpl;
            int i4 = updateLessonAudioProgressUseCase$invoke$1.f18718g;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                updateLessonAudioProgressUseCase$invoke$1.f18718g = i4 - Integer.MIN_VALUE;
            } else {
                updateLessonAudioProgressUseCase$invoke$1 = new UpdateLessonAudioProgressUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            updateLessonAudioProgressUseCase$invoke$1 = new UpdateLessonAudioProgressUseCase$invoke$1(this, continuationImpl);
        }
        Object objM15541t = updateLessonAudioProgressUseCase$invoke$1.f18716e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = updateLessonAudioProgressUseCase$invoke$1.f18718g;
        vma vmaVar = this.f18735b;
        if (i5 == 0) {
            AbstractC3193b.m15359b(objM15541t);
            c83 c83Var = ((C1371d) vmaVar).f18581r;
            updateLessonAudioProgressUseCase$invoke$1.f18712a = str;
            num2 = num;
            updateLessonAudioProgressUseCase$invoke$1.f18713b = num2;
            i2 = i;
            updateLessonAudioProgressUseCase$invoke$1.f18714c = i2;
            updateLessonAudioProgressUseCase$invoke$1.f18715d = j;
            updateLessonAudioProgressUseCase$invoke$1.f18718g = 1;
            objM15541t = AbstractC3224d.m15541t(c83Var, updateLessonAudioProgressUseCase$invoke$1);
            if (objM15541t != coroutineSingletons) {
                j2 = j;
                str2 = str;
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            long j4 = updateLessonAudioProgressUseCase$invoke$1.f18715d;
            int i6 = updateLessonAudioProgressUseCase$invoke$1.f18714c;
            Integer num4 = updateLessonAudioProgressUseCase$invoke$1.f18713b;
            str2 = updateLessonAudioProgressUseCase$invoke$1.f18712a;
            AbstractC3193b.m15359b(objM15541t);
            j2 = j4;
            i2 = i6;
            num2 = num4;
        } else if (i5 == 2) {
            j3 = updateLessonAudioProgressUseCase$invoke$1.f18715d;
            i3 = updateLessonAudioProgressUseCase$invoke$1.f18714c;
            num3 = updateLessonAudioProgressUseCase$invoke$1.f18713b;
            str3 = updateLessonAudioProgressUseCase$invoke$1.f18712a;
            AbstractC3193b.m15359b(objM15541t);
            updateLessonAudioProgressUseCase$invoke$1.f18712a = null;
            updateLessonAudioProgressUseCase$invoke$1.f18713b = null;
            updateLessonAudioProgressUseCase$invoke$1.f18714c = i3;
            updateLessonAudioProgressUseCase$invoke$1.f18715d = j3;
            updateLessonAudioProgressUseCase$invoke$1.f18718g = 3;
        } else {
            if (i5 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM15541t);
        }
        return xfa.f68157a;
        LinkedHashMap linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) objM15541t);
        linkedHashMapM15372Y.put(new Integer(i2), new Integer((int) j2));
        updateLessonAudioProgressUseCase$invoke$1.f18712a = str2;
        updateLessonAudioProgressUseCase$invoke$1.f18713b = num2;
        updateLessonAudioProgressUseCase$invoke$1.f18714c = i2;
        updateLessonAudioProgressUseCase$invoke$1.f18715d = j2;
        updateLessonAudioProgressUseCase$invoke$1.f18718g = 2;
        if (((C1371d) vmaVar).m7962b(linkedHashMapM15372Y, updateLessonAudioProgressUseCase$invoke$1) != coroutineSingletons) {
            num3 = num2;
            i3 = i2;
            str3 = str2;
            j3 = j2;
            updateLessonAudioProgressUseCase$invoke$1.f18712a = null;
            updateLessonAudioProgressUseCase$invoke$1.f18713b = null;
            updateLessonAudioProgressUseCase$invoke$1.f18714c = i3;
            updateLessonAudioProgressUseCase$invoke$1.f18715d = j3;
            updateLessonAudioProgressUseCase$invoke$1.f18718g = 3;
        }
        return coroutineSingletons;
    }
}
