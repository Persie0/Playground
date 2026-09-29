package com.lingq.p055ui.review;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.lesson.ReviewType;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import kotlinx.coroutines.flow.StateFlowImpl;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p462wj.AbstractC9953a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$nextActivity$1", m19206f = "ReviewViewModel.kt", m19207l = {491}, m19208m = "invokeSuspend")
public final class ReviewViewModel$nextActivity$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29757e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewViewModel f29758f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$nextActivity$1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super ReviewViewModel$nextActivity$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29758f = reviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewViewModel$nextActivity$1(this.f29758f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewViewModel$nextActivity$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29757e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewViewModel reviewViewModel = this.f29758f;
            boolean zM10247m2 = ReviewViewModel.m10247m2(reviewViewModel);
            C7138s c7138s = reviewViewModel.f29669s0;
            if (!zM10247m2) {
                StateFlowImpl stateFlowImpl = reviewViewModel.f29641Z;
                stateFlowImpl.setValue(Integer.valueOf(((Number) stateFlowImpl.getValue()).intValue() + 1));
                AbstractC9953a abstractC9953aM10261t2 = reviewViewModel.m10261t2();
                if (abstractC9953aM10261t2 != null) {
                    this.f29757e = 1;
                    if (ReviewViewModel.m10246l2(reviewViewModel, abstractC9953aM10261t2, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    c7138s.mo14371k(C9072e.f47360a);
                }
            } else if (reviewViewModel.f29612J.f49121b == ReviewType.Integrated) {
                reviewViewModel.f29671u0.mo14371k(C9072e.f47360a);
            } else {
                c7138s.mo14371k(C9072e.f47360a);
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
