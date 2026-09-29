package com.lingq.feature.reader.playback.domain;

import com.lingq.core.data.repository.C1302r;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.nx4;
import p000.ox4;
import p000.px4;
import p000.qx4;
import p000.vd7;
import p000.vk9;
import p000.xd7;

/* JADX INFO: renamed from: com.lingq.feature.reader.playback.domain.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2466a {

    /* JADX INFO: renamed from: a */
    public final xd7 f29803a;

    public C2466a(xd7 xd7Var) {
        xd7Var.getClass();
        this.f29803a = xd7Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m9368a(int i, String str, String str2, ContinuationImpl continuationImpl, boolean z) throws Throwable {
        GetLessonAudioActionUseCase$invoke$1 getLessonAudioActionUseCase$invoke$1;
        if (continuationImpl instanceof GetLessonAudioActionUseCase$invoke$1) {
            getLessonAudioActionUseCase$invoke$1 = (GetLessonAudioActionUseCase$invoke$1) continuationImpl;
            int i2 = getLessonAudioActionUseCase$invoke$1.f29795f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getLessonAudioActionUseCase$invoke$1.f29795f = i2 - Integer.MIN_VALUE;
            } else {
                getLessonAudioActionUseCase$invoke$1 = new GetLessonAudioActionUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            getLessonAudioActionUseCase$invoke$1 = new GetLessonAudioActionUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7356p = getLessonAudioActionUseCase$invoke$1.f29793d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = getLessonAudioActionUseCase$invoke$1.f29795f;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7356p);
            getLessonAudioActionUseCase$invoke$1.f29790a = str2;
            getLessonAudioActionUseCase$invoke$1.f29791b = i;
            getLessonAudioActionUseCase$invoke$1.f29792c = z;
            getLessonAudioActionUseCase$invoke$1.f29795f = 1;
            objM7356p = ((C1302r) this.f29803a).m7356p(i, str, getLessonAudioActionUseCase$invoke$1);
            if (objM7356p == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = getLessonAudioActionUseCase$invoke$1.f29792c;
            i = getLessonAudioActionUseCase$invoke$1.f29791b;
            str2 = getLessonAudioActionUseCase$invoke$1.f29790a;
            AbstractC3193b.m15359b(objM7356p);
        }
        vd7 vd7Var = (vd7) objM7356p;
        if (vd7Var != null && vd7Var.f65237b && vd7Var.f65238c == 100) {
            return new ox4(i);
        }
        if (str2 == null || vk9.m23391n0(str2)) {
            return z ? px4.f56944a : qx4.f58335a;
        }
        return new nx4(i, str2);
    }
}
