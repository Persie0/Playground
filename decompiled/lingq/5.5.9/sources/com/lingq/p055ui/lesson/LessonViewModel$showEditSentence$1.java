package com.lingq.p055ui.lesson;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.lesson.LessonStudy;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/ProfileAccount;", "account", "Lcom/lingq/shared/uimodel/lesson/LessonStudy;", "data", "", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$showEditSentence$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonViewModel$showEditSentence$1 extends SuspendLambda implements InterfaceC2057q<ProfileAccount, LessonStudy, InterfaceC9968c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ LessonStudy f27760e;

    public LessonViewModel$showEditSentence$1(InterfaceC9968c<? super LessonViewModel$showEditSentence$1> interfaceC9968c) {
        super(3, interfaceC9968c);
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(ProfileAccount profileAccount, LessonStudy lessonStudy, InterfaceC9968c<? super Boolean> interfaceC9968c) {
        LessonViewModel$showEditSentence$1 lessonViewModel$showEditSentence$1 = new LessonViewModel$showEditSentence$1(interfaceC9968c);
        lessonViewModel$showEditSentence$1.f27760e = lessonStudy;
        return lessonViewModel$showEditSentence$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        boolean z10;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        LessonStudy lessonStudy = this.f27760e;
        if (lessonStudy != null) {
            z10 = true;
            if (!lessonStudy.f21839y) {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }
}
