package com.lingq.p055ui.info;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "isLessonDownloaded", "isLessonAudioDownloaded", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$isAvailableOffline$1", m19206f = "LessonInfoViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$isAvailableOffline$1 extends SuspendLambda implements InterfaceC2057q<Boolean, Boolean, InterfaceC9968c<? super Boolean>, Object> {

    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean f27001e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ boolean f27002f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LessonInfoViewModel f27003g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$isAvailableOffline$1(LessonInfoViewModel lessonInfoViewModel, InterfaceC9968c<? super LessonInfoViewModel$isAvailableOffline$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f27003g = lessonInfoViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(Boolean bool, Boolean bool2, InterfaceC9968c<? super Boolean> interfaceC9968c) {
        boolean zBooleanValue = bool.booleanValue();
        boolean zBooleanValue2 = bool2.booleanValue();
        LessonInfoViewModel$isAvailableOffline$1 lessonInfoViewModel$isAvailableOffline$1 = new LessonInfoViewModel$isAvailableOffline$1(this.f27003g, interfaceC9968c);
        lessonInfoViewModel$isAvailableOffline$1.f27001e = zBooleanValue;
        lessonInfoViewModel$isAvailableOffline$1.f27002f = zBooleanValue2;
        return lessonInfoViewModel$isAvailableOffline$1.mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        boolean z10 = this.f27001e;
        boolean z11 = this.f27002f;
        LessonInfoViewModel lessonInfoViewModel = this.f27003g;
        if (((Boolean) lessonInfoViewModel.f26924L.getValue()).booleanValue() && z10 && z11) {
            lessonInfoViewModel.f26924L.setValue(Boolean.FALSE);
        }
        return Boolean.valueOf(z10 && z11);
    }
}
