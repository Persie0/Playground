package com.lingq.feature.reader.playback.domain;

import androidx.room.util.AbstractC0758a;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.d65;
import p000.j05;
import p000.q05;
import p000.sca;
import p000.u91;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.feature.reader.playback.domain.b */
/* JADX INFO: loaded from: classes3.dex */
public final class C2467b {

    /* JADX INFO: renamed from: a */
    public final d65 f29804a;

    /* JADX INFO: renamed from: b */
    public final sca f29805b;

    public C2467b(d65 d65Var, sca scaVar) {
        d65Var.getClass();
        scaVar.getClass();
        this.f29804a = d65Var;
        this.f29805b = scaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX INFO: renamed from: a */
    public final Object m9369a(int i, int i2, String str, float f, boolean z, ContinuationImpl continuationImpl) throws Throwable {
        PlaySentenceUseCase$invoke$1 playSentenceUseCase$invoke$1;
        String str2;
        boolean z2;
        Object objM2861d;
        float f2;
        if (continuationImpl instanceof PlaySentenceUseCase$invoke$1) {
            playSentenceUseCase$invoke$1 = (PlaySentenceUseCase$invoke$1) continuationImpl;
            int i3 = playSentenceUseCase$invoke$1.f29802g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                playSentenceUseCase$invoke$1.f29802g = i3 - Integer.MIN_VALUE;
            } else {
                playSentenceUseCase$invoke$1 = new PlaySentenceUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            playSentenceUseCase$invoke$1 = new PlaySentenceUseCase$invoke$1(this, continuationImpl);
        }
        Object obj = playSentenceUseCase$invoke$1.f29800e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = playSentenceUseCase$invoke$1.f29802g;
        if (i4 == 0) {
            AbstractC3193b.m15359b(obj);
            str2 = str;
            playSentenceUseCase$invoke$1.f29797b = str2;
            playSentenceUseCase$invoke$1.f29796a = i;
            playSentenceUseCase$invoke$1.f29798c = f;
            z2 = z;
            playSentenceUseCase$invoke$1.f29799d = z2;
            playSentenceUseCase$invoke$1.f29802g = 1;
            q05 q05Var = (q05) ((C1295k) this.f29804a).f16498b;
            objM2861d = AbstractC0758a.m2861d(new j05(i, i2, i2 + 1, q05Var, 0), q05Var.f57071K, playSentenceUseCase$invoke$1, true, false);
            if (objM2861d == coroutineSingletons) {
                return coroutineSingletons;
            }
            f2 = f;
        } else {
            if (i4 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = playSentenceUseCase$invoke$1.f29799d;
            f2 = playSentenceUseCase$invoke$1.f29798c;
            int i5 = playSentenceUseCase$invoke$1.f29796a;
            String str3 = playSentenceUseCase$invoke$1.f29797b;
            AbstractC3193b.m15359b(obj);
            objM2861d = obj;
            str2 = str3;
            z2 = z3;
            i = i5;
        }
        List list = (List) objM2861d;
        List list2 = list;
        sca scaVar = this.f29805b;
        if (list2 == null || list2.isEmpty()) {
            scaVar.mo8484Y0(str2, true, f2, true);
        } else {
            Double d = ((LessonTranslationSentence) u91.m22589G0(list)).f19294c;
            Double d2 = ((LessonTranslationSentence) u91.m22589G0(list)).f19295d;
            if (d == null || d2 == null || ((int) d2.doubleValue()) == 0 || !z2) {
                scaVar.mo8484Y0(str2, true, f2, true);
            } else {
                this.f29805b.mo8483U0(i, d.doubleValue(), d2, f2, ((LessonTranslationSentence) u91.m22589G0(list)).f19296e);
            }
        }
        return xfa.f68157a;
    }
}
