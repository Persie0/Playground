package com.lingq.p055ui.review;

import ae.C0062b;
import android.os.Bundle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.token.TokenControllerType;
import com.lingq.p055ui.token.TokenData;
import com.lingq.p055ui.token.TokenViewState;
import com.lingq.util.C4924a;
import com.linguist.R;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7137r;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p278nh.C7777d;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewFragment$onViewCreated$11$9", m19206f = "ReviewFragment.kt", m19207l = {301}, m19208m = "invokeSuspend")
public final class ReviewFragment$onViewCreated$11$9 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29501e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewFragment f29502f;

    /* JADX INFO: renamed from: com.lingq.ui.review.ReviewFragment$onViewCreated$11$9$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/ui/token/TokenData;", "token", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.ReviewFragment$onViewCreated$11$9$1", m19206f = "ReviewFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C45271 extends SuspendLambda implements InterfaceC2056p<TokenData, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29503e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewFragment f29504f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C45271(ReviewFragment reviewFragment, InterfaceC9968c<? super C45271> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29504f = reviewFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C45271 c45271 = new C45271(this.f29504f, interfaceC9968c);
            c45271.f29503e = obj;
            return c45271;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(TokenData tokenData, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C45271) mo1336a(tokenData, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            TokenData tokenData = (TokenData) this.f29503e;
            Bundle bundle = new Bundle();
            bundle.putParcelable("tokenData", new TokenData(tokenData.f31175a, tokenData.f31176b, 0, 0, null, TokenViewState.Expanded.f31717a, TokenControllerType.Review, null, 0, null, 924));
            bundle.putBoolean("shouldPlayTts", false);
            C7777d.m15485f(C4924a.m10446Y(this.f29504f), R.id.fragment_container_token, bundle, true, false);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewFragment$onViewCreated$11$9(ReviewFragment reviewFragment, InterfaceC9968c<? super ReviewFragment$onViewCreated$11$9> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29502f = reviewFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewFragment$onViewCreated$11$9(this.f29502f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewFragment$onViewCreated$11$9) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29501e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ReviewFragment.f29431E0;
            ReviewFragment reviewFragment = this.f29502f;
            InterfaceC7137r<TokenData> interfaceC7137rMo10039Y = reviewFragment.m10240o0().mo10039Y();
            C45271 c45271 = new C45271(reviewFragment, null);
            this.f29501e = 1;
            if (C0062b.m369m0(interfaceC7137rMo10039Y, c45271, this) == coroutineSingletons) {
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
