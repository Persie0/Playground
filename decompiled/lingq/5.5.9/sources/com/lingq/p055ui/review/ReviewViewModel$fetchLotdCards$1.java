package com.lingq.p055ui.review;

import ci.InterfaceC2025r;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$fetchLotdCards$1", m19206f = "ReviewViewModel.kt", m19207l = {392}, m19208m = "invokeSuspend")
final class ReviewViewModel$fetchLotdCards$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29750e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewViewModel f29751f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$fetchLotdCards$1(ReviewViewModel reviewViewModel, InterfaceC9968c<? super ReviewViewModel$fetchLotdCards$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29751f = reviewViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewViewModel$fetchLotdCards$1(this.f29751f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewViewModel$fetchLotdCards$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29750e;
        ReviewViewModel reviewViewModel = this.f29751f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC2025r interfaceC2025r = reviewViewModel.f29645d;
            String strMo498E1 = reviewViewModel.mo498E1();
            String str = reviewViewModel.f29612J.f49126g;
            this.f29750e = 1;
            obj = interfaceC2025r.mo6188j(strMo498E1, 1, (96 & 4) != 0 ? "" : null, (96 & 8) != 0 ? false : false, (96 & 16) != 0 ? false : false, (96 & 32) != 0 ? null : str, (96 & 64) != 0 ? -1 : 200, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        List<String> list = (List) ((Triple) obj).f38023c;
        if (list.isEmpty()) {
            reviewViewModel.f29673w0.mo14371k(C9072e.f47360a);
        } else {
            reviewViewModel.f29616L = list;
            reviewViewModel.f29618M.mo14371k(list);
        }
        return C9072e.f47360a;
    }
}
