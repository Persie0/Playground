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
@InterfaceC10224c(m19205c = "com.lingq.ui.info.LessonInfoViewModel$updateLessonPreview$1", m19206f = "LessonInfoViewModel.kt", m19207l = {215}, m19208m = "invokeSuspend")
final class LessonInfoViewModel$updateLessonPreview$1 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f27031e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LessonInfoViewModel f27032f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f27033g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f27034h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonInfoViewModel$updateLessonPreview$1(LessonInfoViewModel lessonInfoViewModel, String str, int i10, InterfaceC9968c<? super LessonInfoViewModel$updateLessonPreview$1> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f27032f = lessonInfoViewModel;
        this.f27033g = str;
        this.f27034h = i10;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LessonInfoViewModel$updateLessonPreview$1) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new LessonInfoViewModel$updateLessonPreview$1(this.f27032f, this.f27033g, this.f27034h, interfaceC9968c);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f27031e;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC3324a interfaceC3324a = this.f27032f.f26942d;
                String str = this.f27033g;
                int i11 = this.f27034h;
                this.f27031e = 1;
                if (interfaceC3324a.mo9482D(i11, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
        } catch (Exception unused) {
        }
        return C9072e.f47360a;
    }
}
