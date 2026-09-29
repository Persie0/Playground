package com.lingq.p055ui.review;

import ci.InterfaceC2025r;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.Triple;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$fetchCards$1", m19206f = "ReviewViewModel.kt", m19207l = {377}, m19208m = "invokeSuspend")
final class ReviewViewModel$fetchCards$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29748e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewViewModel f29749f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$fetchCards$1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super ReviewViewModel$fetchCards$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29749f = reviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewViewModel$fetchCards$1(this.f29749f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewViewModel$fetchCards$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29748e;
        ReviewViewModel reviewViewModel = this.f29749f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC2025r interfaceC2025r = reviewViewModel.f29645d;
            String strMo498E1 = reviewViewModel.mo498E1();
            this.f29748e = 1;
            obj = interfaceC2025r.mo6188j(strMo498E1, 1, (96 & 4) != 0 ? "" : null, (96 & 8) != 0 ? false : false, (96 & 16) != 0 ? false : false, (96 & 32) != 0 ? null : null, (96 & 64) != 0 ? -1 : 200, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        Triple triple = (Triple) obj;
        int iIntValue = ((Number) triple.f38021a).intValue();
        int iIntValue2 = ((Number) triple.f38022b).intValue();
        if (iIntValue == 0 && iIntValue2 == 0 && reviewViewModel.f29616L.isEmpty()) {
            reviewViewModel.f29673w0.mo14371k(C9072e.f47360a);
        } else {
            reviewViewModel.getClass();
            C7828f.m15570d(C8573r0.m16767w0(reviewViewModel), null, null, new ReviewViewModel$getCards$1(reviewViewModel, null), 3);
        }
        return C9072e.f47360a;
    }
}
