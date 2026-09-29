package com.lingq.p055ui.review;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import li.C7374a;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewSessionCompleteViewModel$fetchCards$1", m19206f = "ReviewSessionCompleteViewModel.kt", m19207l = {74}, m19208m = "invokeSuspend")
final class ReviewSessionCompleteViewModel$fetchCards$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29586e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewSessionCompleteViewModel f29587f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ List<String> f29588g;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewSessionCompleteViewModel$fetchCards$1$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lli/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewSessionCompleteViewModel$fetchCards$1$1", m19206f = "ReviewSessionCompleteViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C45501 extends SuspendLambda implements InterfaceC2056p<List<? extends C7374a>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29589e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewSessionCompleteViewModel f29590f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45501(ReviewSessionCompleteViewModel reviewSessionCompleteViewModel, InterfaceC9968c<? super C45501> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29590f = reviewSessionCompleteViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45501 c45501 = new C45501(this.f29590f, interfaceC9968c);
            c45501.f29589e = obj;
            return c45501;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends C7374a> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45501) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f29590f.f29582h.setValue((List) this.f29589e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewSessionCompleteViewModel$fetchCards$1(ReviewSessionCompleteViewModel reviewSessionCompleteViewModel, List<String> list, InterfaceC9968c<? super ReviewSessionCompleteViewModel$fetchCards$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29587f = reviewSessionCompleteViewModel;
        this.f29588g = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewSessionCompleteViewModel$fetchCards$1(this.f29587f, this.f29588g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewSessionCompleteViewModel$fetchCards$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29586e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewSessionCompleteViewModel reviewSessionCompleteViewModel = this.f29587f;
            InterfaceC7116c interfaceC7116cMo5966r = reviewSessionCompleteViewModel.f29578d.mo5966r(this.f29588g, reviewSessionCompleteViewModel.mo498E1());
            C45501 c45501 = new C45501(reviewSessionCompleteViewModel, null);
            this.f29586e = 1;
            if (C0062b.m369m0(interfaceC7116cMo5966r, c45501, this) == coroutineSingletons) {
                return coroutineSingletons;
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
