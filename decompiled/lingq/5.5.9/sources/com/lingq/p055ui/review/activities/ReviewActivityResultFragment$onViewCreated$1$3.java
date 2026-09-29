package com.lingq.p055ui.review.activities;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7138s;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$3", m19206f = "ReviewActivityResultFragment.kt", m19207l = {276}, m19208m = "invokeSuspend")
public final class ReviewActivityResultFragment$onViewCreated$1$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29973e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityResultFragment f29974f;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$3$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$3$1", m19206f = "ReviewActivityResultFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46101 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ReviewActivityResultFragment f29975e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46101(ReviewActivityResultFragment reviewActivityResultFragment, InterfaceC9968c<? super C46101> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29975e = reviewActivityResultFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C46101(this.f29975e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46101) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityResultFragment.f29925G0;
            C7138s c7138s = this.f29975e.m10278p0().f29665o0;
            C9072e c9072e = C9072e.f47360a;
            c7138s.mo14371k(c9072e);
            return c9072e;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityResultFragment$onViewCreated$1$3(ReviewActivityResultFragment reviewActivityResultFragment, InterfaceC9968c<? super ReviewActivityResultFragment$onViewCreated$1$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29974f = reviewActivityResultFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityResultFragment$onViewCreated$1$3(this.f29974f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityResultFragment$onViewCreated$1$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29973e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewActivityResultFragment reviewActivityResultFragment = this.f29974f;
            ReviewActivityViewModel reviewActivityViewModelM10277o0 = ReviewActivityResultFragment.m10277o0(reviewActivityResultFragment);
            C46101 c46101 = new C46101(reviewActivityResultFragment, null);
            this.f29973e = 1;
            if (C0062b.m369m0(reviewActivityViewModelM10277o0.f30155M, c46101, this) == coroutineSingletons) {
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
