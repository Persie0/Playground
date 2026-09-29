package com.lingq.p055ui.lesson;

import cm.InterfaceC2058r;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "isSentenceMode", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "lesson", "hasTTS", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$hideAudio$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonViewModel$hideAudio$1 extends SuspendLambda implements InterfaceC2058r<Boolean, LessonStudy, Boolean, InterfaceC9968c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f27685e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ LessonStudy f27686f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Boolean f27687g;

    public LessonViewModel$hideAudio$1(InterfaceC9968c<? super LessonViewModel$hideAudio$1> interfaceC9968c) {
        super(4, interfaceC9968c);
    }

    @Override // cm.InterfaceC2058r
    /* JADX INFO: renamed from: T */
    public final Object mo1851T(Boolean bool, LessonStudy lessonStudy, Boolean bool2, InterfaceC9968c<? super Boolean> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        LessonViewModel$hideAudio$1 lessonViewModel$hideAudio$1 = new LessonViewModel$hideAudio$1(interfaceC9968c);
        lessonViewModel$hideAudio$1.f27685e = zBooleanValue;
        lessonViewModel$hideAudio$1.f27686f = lessonStudy;
        lessonViewModel$hideAudio$1.f27687g = bool2;
        return lessonViewModel$hideAudio$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        boolean z10;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        boolean z11 = this.f27685e;
        LessonStudy lessonStudy = this.f27686f;
        Boolean bool = this.f27687g;
        if (!z11 && ((str = lessonStudy.f21820f) != null || lessonStudy.f21835u == null)) {
            if (str != null || !C5207g.m11106a(bool, Boolean.FALSE)) {
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }
        z10 = true;
        return Boolean.valueOf(z10);
    }
}
