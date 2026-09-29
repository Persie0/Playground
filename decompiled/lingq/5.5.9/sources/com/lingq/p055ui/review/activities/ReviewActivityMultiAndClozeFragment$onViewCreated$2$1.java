package com.lingq.p055ui.review.activities;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7374a;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p338qd.C8573r0;
import p462wj.AbstractC9953a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$2$1", m19206f = "ReviewActivityMultiAndClozeFragment.kt", m19207l = {65}, m19208m = "invokeSuspend")
public final class ReviewActivityMultiAndClozeFragment$onViewCreated$2$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29889e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityMultiAndClozeFragment f29890f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC9953a f29891g;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$2$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lli/a;", "card", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$2$1$1", m19206f = "ReviewActivityMultiAndClozeFragment.kt", m19207l = {69}, m19208m = "invokeSuspend")
    public static final class C45961 extends SuspendLambda implements InterfaceC2056p<C7374a, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29892e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f29893f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AbstractC9953a f29894g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ReviewActivityMultiAndClozeFragment f29895h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45961(ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, AbstractC9953a abstractC9953a, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29894g = abstractC9953a;
            this.f29895h = reviewActivityMultiAndClozeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45961 c45961 = new C45961(this.f29895h, this.f29894g, interfaceC9968c);
            c45961.f29893f = obj;
            return c45961;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C7374a c7374a, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45961) mo1336a(c7374a, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29892e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                C7374a c7374a = (C7374a) this.f29893f;
                AbstractC9953a abstractC9953a = this.f29894g;
                boolean z10 = abstractC9953a instanceof AbstractC9953a.a;
                ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f29895h;
                if (z10) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
                    ReviewActivityViewModel reviewActivityViewModelM10274o0 = reviewActivityMultiAndClozeFragment.m10274o0();
                    reviewActivityViewModelM10274o0.getClass();
                    InterfaceC7882z interfaceC7882zM16767w0 = C8573r0.m16767w0(reviewActivityViewModelM10274o0);
                    ReviewActivityViewModel$clozeTest$1 reviewActivityViewModel$clozeTest$1 = new ReviewActivityViewModel$clozeTest$1(reviewActivityViewModelM10274o0, null);
                    C7499b.m14933c0(interfaceC7882zM16767w0, reviewActivityViewModelM10274o0.f30163i, reviewActivityViewModelM10274o0.f30162h, "clozeTest", reviewActivityViewModel$clozeTest$1);
                } else {
                    this.f29892e = 1;
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = ReviewActivityMultiAndClozeFragment.f29872H0;
                    if (reviewActivityMultiAndClozeFragment.m10275p0(c7374a, abstractC9953a, null, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityMultiAndClozeFragment$onViewCreated$2$1(ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, AbstractC9953a abstractC9953a, InterfaceC9968c<? super ReviewActivityMultiAndClozeFragment$onViewCreated$2$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29890f = reviewActivityMultiAndClozeFragment;
        this.f29891g = abstractC9953a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityMultiAndClozeFragment$onViewCreated$2$1(this.f29890f, this.f29891g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityMultiAndClozeFragment$onViewCreated$2$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29889e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f29890f;
            ReviewActivityViewModel reviewActivityViewModelM10274o0 = reviewActivityMultiAndClozeFragment.m10274o0();
            C45961 c45961 = new C45961(reviewActivityMultiAndClozeFragment, this.f29891g, null);
            this.f29889e = 1;
            if (C0062b.m369m0(reviewActivityViewModelM10274o0.f30151I, c45961, this) == coroutineSingletons) {
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
