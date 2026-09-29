package com.lingq.p055ui.review;

import cm.InterfaceC2041a;
import cm.InterfaceC2056p;
import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7117d;
import kotlinx.coroutines.flow.internal.C7127c;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u0002H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$special$$inlined$combineTransform$1", m19206f = "ReviewViewModel.kt", m19207l = {251}, m19208m = "invokeSuspend")
public final class ReviewViewModel$special$$inlined$combineTransform$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7117d<? super C9072e>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29763e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f29764f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ InterfaceC7116c[] f29765g;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewViewModel$special$$inlined$combineTransform$1$2 */
    @Metadata(m13364d1 = {"\u0000\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u008a@"}, m13365d2 = {"T", "R", "Lkotlinx/coroutines/flow/d;", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewViewModel$special$$inlined$combineTransform$1$2", m19206f = "ReviewViewModel.kt", m19207l = {333}, m19208m = "invokeSuspend")
    public static final class C45662 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super C9072e>, Object[], InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f29767e;

        /* JADX INFO: renamed from: f */
        public /* synthetic */ InterfaceC7117d f29768f;

        /* JADX INFO: renamed from: g */
        public /* synthetic */ Object[] f29769g;

        public C45662(InterfaceC9968c interfaceC9968c) {
            super(3, interfaceC9968c);
        }

        @Override // cm.InterfaceC2057q
        /* JADX INFO: renamed from: M */
        public final Object mo1343M(InterfaceC7117d<? super C9072e> interfaceC7117d, Object[] objArr, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            C45662 c45662 = new C45662(interfaceC9968c);
            c45662.f29768f = interfaceC7117d;
            c45662.f29769g = objArr;
            return c45662.mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f29767e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                InterfaceC7117d interfaceC7117d = this.f29768f;
                C9072e c9072e = C9072e.f47360a;
                this.f29767e = 1;
                if (interfaceC7117d.mo1339r(c9072e, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$special$$inlined$combineTransform$1(InterfaceC7116c[] interfaceC7116cArr, InterfaceC9968c interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29765g = interfaceC7116cArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ReviewViewModel$special$$inlined$combineTransform$1 reviewViewModel$special$$inlined$combineTransform$1 = new ReviewViewModel$special$$inlined$combineTransform$1(this.f29765g, interfaceC9968c);
        reviewViewModel$special$$inlined$combineTransform$1.f29764f = obj;
        return reviewViewModel$special$$inlined$combineTransform$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7117d<? super C9072e> interfaceC7117d, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewViewModel$special$$inlined$combineTransform$1) mo1336a(interfaceC7117d, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29763e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = (InterfaceC7117d) this.f29764f;
            final InterfaceC7116c[] interfaceC7116cArr = this.f29765g;
            InterfaceC2041a<Object[]> interfaceC2041a = new InterfaceC2041a<Object[]>() { // from class: com.lingq.ui.review.ReviewViewModel$special$$inlined$combineTransform$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // cm.InterfaceC2041a
                /* JADX INFO: renamed from: E */
                public final Object[] mo807E() {
                    return new Object[interfaceC7116cArr.length];
                }
            };
            C45662 c45662 = new C45662(null);
            this.f29763e = 1;
            if (C7127c.m14386a(this, interfaceC2041a, c45662, interfaceC7117d, interfaceC7116cArr) == coroutineSingletons) {
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
