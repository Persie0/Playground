package com.lingq.p055ui.review.activities;

import ae.C0062b;
import android.widget.LinearLayout;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.lingq.p055ui.review.ReviewViewModel;
import com.lingq.shared.domain.Resource;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7374a;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p264mi.C7562b;
import p462wj.AbstractC9953a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$2$2", m19206f = "ReviewActivityMultiAndClozeFragment.kt", m19207l = {75}, m19208m = "invokeSuspend")
public final class ReviewActivityMultiAndClozeFragment$onViewCreated$2$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29896e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityMultiAndClozeFragment f29897f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ AbstractC9953a f29898g;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$2$2$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "Lmi/b;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$2$2$1", m19206f = "ReviewActivityMultiAndClozeFragment.kt", m19207l = {84}, m19208m = "invokeSuspend")
    public static final class C45971 extends SuspendLambda implements InterfaceC2056p<Resource<? extends C7562b>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29899e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f29900f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ReviewActivityMultiAndClozeFragment f29901g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ AbstractC9953a f29902h;

        /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityMultiAndClozeFragment$onViewCreated$2$2$1$a */
        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f29903a;

            static {
                int[] iArr = new int[Resource.Status.values().length];
                try {
                    iArr[Resource.Status.LOADING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Resource.Status.SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Resource.Status.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Resource.Status.EMPTY.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f29903a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45971(ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, AbstractC9953a abstractC9953a, InterfaceC9968c<? super C45971> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29901g = reviewActivityMultiAndClozeFragment;
            this.f29902h = abstractC9953a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45971 c45971 = new C45971(this.f29901g, this.f29902h, interfaceC9968c);
            c45971.f29900f = obj;
            return c45971;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends C7562b> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45971) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29899e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                Resource resource = (Resource) this.f29900f;
                int i11 = a.f29903a[resource.f17862a.ordinal()];
                ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f29901g;
                if (i11 == 1) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
                    LinearLayout linearLayout = reviewActivityMultiAndClozeFragment.m10273n0().f44956i;
                    C5207g.m11110e(linearLayout, "binding.viewData");
                    C4924a.m10442U(linearLayout);
                    reviewActivityMultiAndClozeFragment.m10273n0().f44957j.m4935d();
                } else if (i11 == 2) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = ReviewActivityMultiAndClozeFragment.f29872H0;
                    LinearLayout linearLayout2 = reviewActivityMultiAndClozeFragment.m10273n0().f44956i;
                    C5207g.m11110e(linearLayout2, "binding.viewData");
                    C4924a.m10457e0(linearLayout2);
                    CircularProgressIndicator circularProgressIndicator = reviewActivityMultiAndClozeFragment.m10273n0().f44957j;
                    C5207g.m11110e(circularProgressIndicator, "binding.viewProgress");
                    C4924a.m10442U(circularProgressIndicator);
                    C7374a c7374a = (C7374a) reviewActivityMultiAndClozeFragment.m10274o0().f30151I.getValue();
                    C7562b c7562b = (C7562b) resource.f17863b;
                    this.f29899e = 1;
                    if (reviewActivityMultiAndClozeFragment.m10275p0(c7374a, this.f29902h, c7562b, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else if (i11 == 3) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr3 = ReviewActivityMultiAndClozeFragment.f29872H0;
                    ((ReviewViewModel) reviewActivityMultiAndClozeFragment.f29875C0.getValue()).f29665o0.mo14371k(C9072e.f47360a);
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
    public ReviewActivityMultiAndClozeFragment$onViewCreated$2$2(ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment, AbstractC9953a abstractC9953a, InterfaceC9968c<? super ReviewActivityMultiAndClozeFragment$onViewCreated$2$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29897f = reviewActivityMultiAndClozeFragment;
        this.f29898g = abstractC9953a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityMultiAndClozeFragment$onViewCreated$2$2(this.f29897f, this.f29898g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityMultiAndClozeFragment$onViewCreated$2$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29896e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewActivityMultiAndClozeFragment.f29872H0;
            ReviewActivityMultiAndClozeFragment reviewActivityMultiAndClozeFragment = this.f29897f;
            ReviewActivityViewModel reviewActivityViewModelM10274o0 = reviewActivityMultiAndClozeFragment.m10274o0();
            C45971 c45971 = new C45971(reviewActivityMultiAndClozeFragment, this.f29898g, null);
            this.f29896e = 1;
            if (C0062b.m369m0(reviewActivityViewModelM10274o0.f30153K, c45971, this) == coroutineSingletons) {
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
