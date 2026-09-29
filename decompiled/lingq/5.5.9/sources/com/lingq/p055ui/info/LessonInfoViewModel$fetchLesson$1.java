package com.lingq.p055ui.info;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.repository.InterfaceC3324a;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$fetchLesson$1", m19206f = "LessonInfoViewModel.kt", m19207l = {269}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$fetchLesson$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f26968e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoViewModel f26969f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$fetchLesson$1(LessonInfoViewModel lessonInfoViewModel, InterfaceC9968c<? super LessonInfoViewModel$fetchLesson$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f26969f = lessonInfoViewModel;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoViewModel$fetchLesson$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoViewModel$fetchLesson$1(this.f26969f, interfaceC9968c);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        LessonInfoViewModel lessonInfoViewModel = this.f26969f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f26968e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC3324a interfaceC3324a = lessonInfoViewModel.f26942d;
                String strMo498E1 = lessonInfoViewModel.mo498E1();
                int i11 = lessonInfoViewModel.f26921I.f35086a;
                this.f26968e = 1;
                if (interfaceC3324a.mo9522j(i11, strMo498E1, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }
}
