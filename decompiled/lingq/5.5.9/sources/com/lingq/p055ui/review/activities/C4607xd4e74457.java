package com.lingq.p055ui.review.activities;

import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.review.data.ReviewActivityResult;
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

/* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m19206f = "ReviewActivityResultFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class C4607xd4e74457 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29933e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f29934f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle.State f29935g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ReviewActivityResultFragment f29936h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ AbstractC9953a f29937i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ ReviewActivityResult f29938j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f29939k;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m19206f = "ReviewActivityResultFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29940e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewActivityResultFragment f29941f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ AbstractC9953a f29942g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ ReviewActivityResult f29943h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ String f29944i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReviewActivityResultFragment reviewActivityResultFragment, AbstractC9953a abstractC9953a, ReviewActivityResult reviewActivityResult, String str, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29941f = reviewActivityResultFragment;
            this.f29942g = abstractC9953a;
            this.f29943h = reviewActivityResult;
            this.f29944i = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29941f, this.f29942g, this.f29943h, this.f29944i, interfaceC9968c);
            anonymousClass1.f29940e = obj;
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
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f29940e;
            C7828f.m15570d(interfaceC7882z, null, null, new ReviewActivityResultFragment$onViewCreated$1$1(this.f29941f, this.f29942g, this.f29943h, this.f29944i, null), 3);
            ReviewActivityResultFragment reviewActivityResultFragment = this.f29941f;
            C7828f.m15570d(interfaceC7882z, null, null, new ReviewActivityResultFragment$onViewCreated$1$2(reviewActivityResultFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new ReviewActivityResultFragment$onViewCreated$1$3(reviewActivityResultFragment, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4607xd4e74457(Fragment fragment, Lifecycle.State state, InterfaceC9968c interfaceC9968c, ReviewActivityResultFragment reviewActivityResultFragment, AbstractC9953a abstractC9953a, ReviewActivityResult reviewActivityResult, String str) {
        super(2, interfaceC9968c);
        this.f29934f = fragment;
        this.f29935g = state;
        this.f29936h = reviewActivityResultFragment;
        this.f29937i = abstractC9953a;
        this.f29938j = reviewActivityResult;
        this.f29939k = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C4607xd4e74457(this.f29934f, this.f29935g, interfaceC9968c, this.f29936h, this.f29937i, this.f29938j, this.f29939k);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C4607xd4e74457) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29933e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0980t0 c0980t0M3601v = this.f29934f.m3601v();
            c0980t0M3601v.m3813c();
            C1052r c1052r = c0980t0M3601v.f6415d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f29936h, this.f29937i, this.f29938j, this.f29939k, null);
            this.f29933e = 1;
            if (RepeatOnLifecycleKt.m3906b(c1052r, this.f29935g, anonymousClass1, this) == coroutineSingletons) {
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
