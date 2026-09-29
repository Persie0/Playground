package com.lingq.p055ui.review.activities;

import ae.C0062b;
import android.widget.ImageButton;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import dm.C5207g;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$2", m19206f = "ReviewActivityResultFragment.kt", m19207l = {267}, m19208m = "invokeSuspend")
public final class ReviewActivityResultFragment$onViewCreated$1$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f29969e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ReviewActivityResultFragment f29970f;

    /* JADX INFO: renamed from: com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "hasTTS", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityResultFragment$onViewCreated$1$2$1", m19206f = "ReviewActivityResultFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C46091 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f29971e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ReviewActivityResultFragment f29972f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46091(ReviewActivityResultFragment reviewActivityResultFragment, InterfaceC9968c<? super C46091> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f29972f = reviewActivityResultFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C46091 c46091 = new C46091(this.f29972f, interfaceC9968c);
            c46091.f29971e = obj;
            return c46091;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C46091) mo1336a(bool, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean zM11106a = C5207g.m11106a((Boolean) this.f29971e, Boolean.TRUE);
            ReviewActivityResultFragment reviewActivityResultFragment = this.f29972f;
            if (zM11106a) {
                ImageButton imageButton = ReviewActivityResultFragment.m10276n0(reviewActivityResultFragment).f44995a;
                C5207g.m11110e(imageButton, "binding.btnTts");
                C4924a.m10457e0(imageButton);
            } else {
                ImageButton imageButton2 = ReviewActivityResultFragment.m10276n0(reviewActivityResultFragment).f44995a;
                C5207g.m11110e(imageButton2, "binding.btnTts");
                C4924a.m10442U(imageButton2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityResultFragment$onViewCreated$1$2(ReviewActivityResultFragment reviewActivityResultFragment, InterfaceC9968c<? super ReviewActivityResultFragment$onViewCreated$1$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f29970f = reviewActivityResultFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityResultFragment$onViewCreated$1$2(this.f29970f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityResultFragment$onViewCreated$1$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f29969e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewActivityResultFragment reviewActivityResultFragment = this.f29970f;
            ReviewActivityViewModel reviewActivityViewModelM10277o0 = ReviewActivityResultFragment.m10277o0(reviewActivityResultFragment);
            C46091 c46091 = new C46091(reviewActivityResultFragment, null);
            this.f29969e = 1;
            if (C0062b.m369m0(reviewActivityViewModelM10277o0.f30157O, c46091, this) == coroutineSingletons) {
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
