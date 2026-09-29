package com.lingq.p055ui.review.activities;

import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p462wj.AbstractC9953a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m19206f = "ReviewActivityMultiAndClozeFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class C4595x697204df extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29881e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f29882f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle.State f29883g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ReviewActivityMultiAndClozeFragment f29884h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC9953a f29885i;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m19206f = "ReviewActivityMultiAndClozeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29886e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewActivityMultiAndClozeFragment f29887f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AbstractC9953a f29888g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, AbstractC9953a abstractC9953a, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29887f = reviewActivityMultiAndClozeFragment;
            this.f29888g = abstractC9953a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29887f, this.f29888g, interfaceC9968c);
            anonymousClass1.f29886e = obj;
            return anonymousClass1;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f29886e;
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f29887f;
            AbstractC9953a abstractC9953a = this.f29888g;
            C7828f.m15570d(interfaceC7882z, null, null, new ReviewActivityMultiAndClozeFragment$onViewCreated$2$1(reviewActivityMultiAndClozeFragment, abstractC9953a, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new ReviewActivityMultiAndClozeFragment$onViewCreated$2$2(reviewActivityMultiAndClozeFragment, abstractC9953a, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4595x697204df(Fragment fragment, Lifecycle.State state, InterfaceC9968c interfaceC9968c, ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, AbstractC9953a abstractC9953a) {
        super(2, interfaceC9968c);
        this.f29882f = fragment;
        this.f29883g = state;
        this.f29884h = reviewActivityMultiAndClozeFragment;
        this.f29885i = abstractC9953a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C4595x697204df(this.f29882f, this.f29883g, interfaceC9968c, this.f29884h, this.f29885i);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C4595x697204df) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29881e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0980t0 c0980t0M3601v = this.f29882f.m3601v();
            c0980t0M3601v.m3813c();
            C1052r c1052r = c0980t0M3601v.f6415d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29884h, this.f29885i, null);
            this.f29881e = 1;
            if (RepeatOnLifecycleKt.m3906b(c1052r, this.f29883g, anonymousClass1, this) == coroutineSingletons) {
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
