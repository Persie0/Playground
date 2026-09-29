package com.lingq.p055ui.lesson;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.download.DownloadItem;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$downloadTrack$1", m19206f = "LessonViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
final class LessonViewModel$downloadTrack$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LessonViewModel f27651e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f27652f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f27653g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$downloadTrack$1(LessonViewModel lessonViewModel, int i10, String str, InterfaceC9968c<? super LessonViewModel$downloadTrack$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f27651e = lessonViewModel;
        this.f27652f = i10;
        this.f27653g = str;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$downloadTrack$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$downloadTrack$1(this.f27651e, this.f27652f, this.f27653g, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        int i10 = this.f27652f;
        LessonViewModel lessonViewModel = this.f27651e;
        lessonViewModel.mo9391A0(i10);
        lessonViewModel.mo9406X0(new DownloadItem(lessonViewModel.mo498E1(), lessonViewModel.m10152y2(), this.f27653g, false), false);
        return C9072e.f47360a;
    }
}
