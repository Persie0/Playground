package com.lingq.p055ui.review;

import ae.C0062b;
import ci.InterfaceC2025r;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Resource;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C7136q;
import kotlinx.coroutines.flow.FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.InterfaceC7117d;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p264mi.C7566f;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$cardsForAnswers$3", m19206f = "ReviewViewModel.kt", m19207l = {429}, m19208m = "invokeSuspend")
final class ReviewViewModel$cardsForAnswers$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29733e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewViewModel f29734f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f29735g;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$cardsForAnswers$3$1 */
    @Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lmi/f;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$cardsForAnswers$3$1", m19206f = "ReviewViewModel.kt", m19207l = {425, 426}, m19208m = "invokeSuspend")
    public static final class C45621 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends List<? extends C7566f>>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29736e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ Object f29737f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ ReviewViewModel f29738g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ String f29739h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45621(ReviewViewModel reviewViewModel, String str, InterfaceC9968c<? super C45621> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29738g = reviewViewModel;
            this.f29739h = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45621 c45621 = new C45621(this.f29738g, this.f29739h, interfaceC9968c);
            c45621.f29737f = obj;
            return c45621;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends List<? extends C7566f>>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45621) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            InterfaceC7117d interfaceC7117d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29736e;
            if (i10 != 0) {
                if (i10 == 1) {
                    interfaceC7117d = (InterfaceC7117d) this.f29737f;
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
            interfaceC7117d = (InterfaceC7117d) this.f29737f;
            InterfaceC2025r interfaceC2025r = this.f29738g.f29645d;
            this.f29737f = interfaceC7117d;
            this.f29736e = 1;
            obj = interfaceC2025r.mo6187i(this.f29739h, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.f29737f = null;
            this.f29736e = 2;
            if (interfaceC7117d.mo1339r((Resource) obj, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$cardsForAnswers$3$2 */
    @Metadata(m13364d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004*\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "Lcom/lingq/shared/domain/Resource;", "", "Lmi/f;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$cardsForAnswers$3$2", m19206f = "ReviewViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C45632 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super Resource<? extends List<? extends C7566f>>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ReviewViewModel f29740e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45632(ReviewViewModel reviewViewModel, InterfaceC9968c<? super C45632> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29740e = reviewViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C45632(this.f29740e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7117d<? super Resource<? extends List<? extends C7566f>>> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45632) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            this.f29740e.f29643b0.setValue(Resource.Status.LOADING);
            return C9072e.f47360a;
        }
    }

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$cardsForAnswers$3$3 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource;", "", "Lmi/f;", "resource", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$cardsForAnswers$3$3", m19206f = "ReviewViewModel.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C45643 extends SuspendLambda implements InterfaceC2056p<Resource<? extends List<? extends C7566f>>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29741e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewViewModel f29742f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45643(ReviewViewModel reviewViewModel, InterfaceC9968c<? super C45643> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29742f = reviewViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45643 c45643 = new C45643(this.f29742f, interfaceC9968c);
            c45643.f29741e = obj;
            return c45643;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource<? extends List<? extends C7566f>> resource, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45643) mo1336a(resource, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Resource resource = (Resource) this.f29741e;
            List list = (List) resource.f17863b;
            ReviewViewModel reviewViewModel = this.f29742f;
            if (list != null) {
                reviewViewModel.f29640Y.setValue(list);
            }
            reviewViewModel.f29643b0.setValue(resource.f17862a);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$cardsForAnswers$3(ReviewViewModel reviewViewModel, String str, InterfaceC9968c<? super ReviewViewModel$cardsForAnswers$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29734f = reviewViewModel;
        this.f29735g = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewViewModel$cardsForAnswers$3(this.f29734f, this.f29735g, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewViewModel$cardsForAnswers$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29733e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            String str = this.f29735g;
            ReviewViewModel reviewViewModel = this.f29734f;
            FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1 = new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(new C45632(reviewViewModel, null), new C7136q(new C45621(reviewViewModel, str, null)));
            C45643 c45643 = new C45643(reviewViewModel, null);
            this.f29733e = 1;
            if (C0062b.m369m0(flowKt__EmittersKt$onStart$$inlined$unsafeFlow$1, c45643, this) == coroutineSingletons) {
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
