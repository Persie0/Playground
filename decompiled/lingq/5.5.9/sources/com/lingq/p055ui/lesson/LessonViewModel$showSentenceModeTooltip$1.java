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
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.LessonViewModel$showSentenceModeTooltip$1", m19206f = "LessonViewModel.kt", m19207l = {1860}, m19208m = "invokeSuspend")
final class LessonViewModel$showSentenceModeTooltip$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27765e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonViewModel f27766f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonViewModel$showSentenceModeTooltip$1(LessonViewModel lessonViewModel, InterfaceC9968c<? super LessonViewModel$showSentenceModeTooltip$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f27766f = lessonViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LessonViewModel$showSentenceModeTooltip$1(this.f27766f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonViewModel$showSentenceModeTooltip$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27765e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            this.f27765e = 1;
            if (C7828f.m15567a(360L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        this.f27766f.f27404I1.mo14371k(TooltipStep.SentenceMode);
        return C9072e.f47360a;
    }
}
