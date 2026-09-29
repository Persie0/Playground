package com.lingq.p055ui.lesson;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.tooltips.TooltipStep;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$checkForTooltipsTouchIndicators$1", m19206f = "LessonViewModel.kt", m19207l = {1777, 1782, 1787, 1792}, m19208m = "invokeSuspend")
final class LessonViewModel$checkForTooltipsTouchIndicators$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27644e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27645f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$checkForTooltipsTouchIndicators$1(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$checkForTooltipsTouchIndicators$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27645f = lessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$checkForTooltipsTouchIndicators$1(this.f27645f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$checkForTooltipsTouchIndicators$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0065  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:29:0x007f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:37:0x009f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a9 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27644e;
        LessonViewModel lessonViewModel = this.f27645f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            if (!lessonViewModel.mo9746v1(TooltipStep.ReviewMenuHighlight)) {
                if (!lessonViewModel.mo9746v1(TooltipStep.PlayAudioHighlight)) {
                    this.f27644e = 2;
                    if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonViewModel.f27404I1.mo14371k(TooltipStep.PlayAudioHighlight);
                }
                if (lessonViewModel.mo9746v1(TooltipStep.SwipePageHighlight)) {
                    this.f27644e = 4;
                    if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonViewModel.f27404I1.mo14371k(TooltipStep.SwipePageHighlight);
                }
                lessonViewModel.getClass();
                C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$showPlayAudioTooltip$1(lessonViewModel, null), 3);
                return C9072e.f47360a;
            }
            this.f27644e = 1;
            if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            if (lessonViewModel.mo9746v1(TooltipStep.SentenceModeHighlight)) {
                this.f27644e = 3;
                if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lessonViewModel.f27404I1.mo14371k(TooltipStep.SentenceModeHighlight);
                if (lessonViewModel.mo9746v1(TooltipStep.SwipePageHighlight)) {
                    this.f27644e = 4;
                    if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonViewModel.f27404I1.mo14371k(TooltipStep.SwipePageHighlight);
                }
            } else if (lessonViewModel.mo9746v1(TooltipStep.SwipePageHighlight)) {
                this.f27644e = 4;
                if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lessonViewModel.f27404I1.mo14371k(TooltipStep.SwipePageHighlight);
            }
            lessonViewModel.getClass();
            C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$showPlayAudioTooltip$1(lessonViewModel, null), 3);
            return C9072e.f47360a;
        }
        if (i10 == 1) {
            C7499b.m14977z0(obj);
        } else {
            if (i10 == 2) {
                C7499b.m14977z0(obj);
                lessonViewModel.f27404I1.mo14371k(TooltipStep.PlayAudioHighlight);
                if (lessonViewModel.mo9746v1(TooltipStep.SentenceModeHighlight)) {
                    this.f27644e = 3;
                    if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    lessonViewModel.f27404I1.mo14371k(TooltipStep.SentenceModeHighlight);
                    if (lessonViewModel.mo9746v1(TooltipStep.SwipePageHighlight)) {
                        this.f27644e = 4;
                        if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else if (lessonViewModel.mo9746v1(TooltipStep.SwipePageHighlight)) {
                    this.f27644e = 4;
                    if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                lessonViewModel.getClass();
                C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$showPlayAudioTooltip$1(lessonViewModel, null), 3);
                return C9072e.f47360a;
            }
            if (i10 == 3) {
                C7499b.m14977z0(obj);
                lessonViewModel.f27404I1.mo14371k(TooltipStep.SentenceModeHighlight);
                if (lessonViewModel.mo9746v1(TooltipStep.SwipePageHighlight)) {
                    this.f27644e = 4;
                    if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                lessonViewModel.getClass();
                C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$showPlayAudioTooltip$1(lessonViewModel, null), 3);
                return C9072e.f47360a;
            }
            if (i10 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        lessonViewModel.f27404I1.mo14371k(TooltipStep.SwipePageHighlight);
        lessonViewModel.getClass();
        C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$showPlayAudioTooltip$1(lessonViewModel, null), 3);
        return C9072e.f47360a;
        lessonViewModel.f27404I1.mo14371k(TooltipStep.ReviewMenuHighlight);
        if (!lessonViewModel.mo9746v1(TooltipStep.PlayAudioHighlight)) {
            if (lessonViewModel.mo9746v1(TooltipStep.SentenceModeHighlight)) {
                this.f27644e = 3;
                if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                lessonViewModel.f27404I1.mo14371k(TooltipStep.SentenceModeHighlight);
            }
            lessonViewModel.getClass();
            C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$showPlayAudioTooltip$1(lessonViewModel, null), 3);
            return C9072e.f47360a;
        }
        this.f27644e = 2;
        if (C7828f.m15567a(360L, this) == coroutineSingletons) {
            return coroutineSingletons;
        }
        lessonViewModel.f27404I1.mo14371k(TooltipStep.PlayAudioHighlight);
        if (lessonViewModel.mo9746v1(TooltipStep.SentenceModeHighlight)) {
            this.f27644e = 3;
            if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonViewModel.f27404I1.mo14371k(TooltipStep.SentenceModeHighlight);
        }
        lessonViewModel.getClass();
        C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$showPlayAudioTooltip$1(lessonViewModel, null), 3);
        return C9072e.f47360a;
        if (lessonViewModel.mo9746v1(TooltipStep.SwipePageHighlight)) {
            this.f27644e = 4;
            if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            lessonViewModel.f27404I1.mo14371k(TooltipStep.SwipePageHighlight);
        }
        lessonViewModel.getClass();
        C7828f.m15570d(C8573r0.m16767w0(lessonViewModel), null, null, new LessonViewModel$showPlayAudioTooltip$1(lessonViewModel, null), 3);
        return C9072e.f47360a;
    }
}
