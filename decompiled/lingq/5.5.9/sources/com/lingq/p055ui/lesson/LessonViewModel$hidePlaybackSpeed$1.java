package com.lingq.p055ui.lesson;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@"}, m13365d2 = {"", "isSentenceMode", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "lesson", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$hidePlaybackSpeed$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonViewModel$hidePlaybackSpeed$1 extends SuspendLambda implements InterfaceC2057q<Boolean, LessonStudy, InterfaceC9968c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f27688e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ LessonStudy f27689f;

    public LessonViewModel$hidePlaybackSpeed$1(InterfaceC9968c<? super LessonViewModel$hidePlaybackSpeed$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(Boolean bool, LessonStudy lessonStudy, InterfaceC9968c<? super Boolean> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        LessonViewModel$hidePlaybackSpeed$1 lessonViewModel$hidePlaybackSpeed$1 = new LessonViewModel$hidePlaybackSpeed$1(interfaceC9968c);
        lessonViewModel$hidePlaybackSpeed$1.f27688e = zBooleanValue;
        lessonViewModel$hidePlaybackSpeed$1.f27689f = lessonStudy;
        return lessonViewModel$hidePlaybackSpeed$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        boolean z10 = this.f27688e;
        LessonStudy lessonStudy = this.f27689f;
        return Boolean.valueOf(z10 && lessonStudy.f21820f == null && lessonStudy.f21835u != null);
    }
}
