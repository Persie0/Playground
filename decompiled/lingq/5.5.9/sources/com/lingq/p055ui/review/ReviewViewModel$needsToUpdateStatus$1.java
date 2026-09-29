package com.lingq.p055ui.review;

import ci.InterfaceC2008a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.CardStatus;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7374a;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$needsToUpdateStatus$1", m19206f = "ReviewViewModel.kt", m19207l = {1035, 1038}, m19208m = "invokeSuspend")
public final class ReviewViewModel$needsToUpdateStatus$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29754e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewViewModel f29755f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f29756g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$needsToUpdateStatus$1(ReviewViewModel reviewViewModel, String str, InterfaceC9968c<? super ReviewViewModel$needsToUpdateStatus$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29755f = reviewViewModel;
        this.f29756g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewViewModel$needsToUpdateStatus$1(this.f29755f, this.f29756g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewViewModel$needsToUpdateStatus$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29754e;
        String str = this.f29756g;
        ReviewViewModel reviewViewModel = this.f29755f;
        if (i10 != 0) {
            if (i10 == 1) {
                C7499b.m14977z0(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(obj);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(obj);
        InterfaceC2008a interfaceC2008a = reviewViewModel.f29647e;
        String strMo498E1 = reviewViewModel.mo498E1();
        this.f29754e = 1;
        obj = interfaceC2008a.mo5965q(strMo498E1, str, this);
        if (obj == coroutineSingletons) {
            return coroutineSingletons;
        }
        C7374a c7374a = (C7374a) obj;
        if (c7374a != null) {
            int value = CardStatus.Known.getValue();
            int i11 = c7374a.f41150i;
            if (i11 < value) {
                InterfaceC2008a interfaceC2008a2 = reviewViewModel.f29647e;
                String strMo498E2 = reviewViewModel.mo498E1();
                this.f29754e = 2;
                if (interfaceC2008a2.mo5957i(i11 + 1, strMo498E2, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        }
        return C9072e.f47360a;
    }
}
