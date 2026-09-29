package com.lingq.p055ui.lesson.page;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.StateFlowImpl;
import p260m8.C7499b;
import p265mj.C7567a;
import p265mj.C7570d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "", "e", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.page.LessonPageViewModel$startPageTimer$1$timer$2", m19206f = "LessonPageViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
public final class LessonPageViewModel$startPageTimer$1$timer$2 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Integer>, Throwable, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ LessonPageViewModel f28702e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonPageViewModel$startPageTimer$1$timer$2(LessonPageViewModel lessonPageViewModel, InterfaceC9968c<? super LessonPageViewModel$startPageTimer$1$timer$2> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f28702e = lessonPageViewModel;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Integer> interfaceC7117d, Throwable th2, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return new LessonPageViewModel$startPageTimer$1$timer$2(this.f28702e, interfaceC9968c).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        List<C7570d> list;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        C7499b.m14977z0(obj);
        LessonPageViewModel lessonPageViewModel = this.f28702e;
        C7567a c7567a = (C7567a) lessonPageViewModel.f28531M.getValue();
        int size = (c7567a == null || (list = c7567a.f41703c) == null) ? 1 : list.size();
        StateFlowImpl stateFlowImpl = lessonPageViewModel.f28573t0;
        if (((Number) stateFlowImpl.getValue()).intValue() > 0 && size > 0 && (((double) size) / ((double) ((Number) stateFlowImpl.getValue()).intValue())) * 60.0d <= 350.0d) {
            lessonPageViewModel.f28570q0.mo16479j(new Integer(size));
            lessonPageViewModel.f28574u0.setValue(Boolean.TRUE);
        }
        return C9072e.f47360a;
    }
}
