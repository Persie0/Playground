package com.lingq.p055ui.review.activities;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityViewModel$fetchCard$1", m19206f = "ReviewActivityViewModel.kt", m19207l = {82}, m19208m = "invokeSuspend")
final class ReviewActivityViewModel$fetchCard$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f30180e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityViewModel f30181f;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityViewModel$fetchCard$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lli/a;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityViewModel$fetchCard$1$1", m19206f = "ReviewActivityViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46621 extends SuspendLambda implements InterfaceC2056p<C7374a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f30182e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewActivityViewModel f30183f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46621(ReviewActivityViewModel reviewActivityViewModel, InterfaceC9968c<? super C46621> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f30183f = reviewActivityViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C46621 c46621 = new C46621(this.f30183f, interfaceC9968c);
            c46621.f30182e = obj;
            return c46621;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C7374a c7374a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46621) mo1336a(c7374a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f30183f.f30150H.setValue((C7374a) this.f30182e);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$fetchCard$1(ReviewActivityViewModel reviewActivityViewModel, InterfaceC9968c<? super ReviewActivityViewModel$fetchCard$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30181f = reviewActivityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityViewModel$fetchCard$1(this.f30181f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityViewModel$fetchCard$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30180e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewActivityViewModel reviewActivityViewModel = this.f30181f;
            InterfaceC7116c<C7374a> interfaceC7116cMo5959k = reviewActivityViewModel.f30158d.mo5959k(reviewActivityViewModel.mo498E1(), reviewActivityViewModel.f30166l);
            C46621 c46621 = new C46621(reviewActivityViewModel, null);
            this.f30180e = 1;
            if (C0062b.m369m0(interfaceC7116cMo5959k, c46621, this) == coroutineSingletons) {
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
