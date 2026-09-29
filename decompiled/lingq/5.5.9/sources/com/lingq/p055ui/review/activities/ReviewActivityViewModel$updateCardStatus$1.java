package com.lingq.p055ui.review.activities;

import ci.InterfaceC2008a;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.uimodel.CardStatus;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import li.C7374a;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.review.activities.ReviewActivityViewModel$updateCardStatus$1", m19206f = "ReviewActivityViewModel.kt", m19207l = {93, 95}, m19208m = "invokeSuspend")
final class ReviewActivityViewModel$updateCardStatus$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public ReviewActivityViewModel f30184e;

    /* JADX INFO: renamed from: f */
    public int f30185f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ ReviewActivityViewModel f30186g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f30187h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewActivityViewModel$updateCardStatus$1(ReviewActivityViewModel reviewActivityViewModel, int i10, InterfaceC9968c<? super ReviewActivityViewModel$updateCardStatus$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f30186g = reviewActivityViewModel;
        this.f30187h = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ReviewActivityViewModel$updateCardStatus$1(this.f30186g, this.f30187h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ReviewActivityViewModel$updateCardStatus$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        ReviewActivityViewModel reviewActivityViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f30185f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            ReviewActivityViewModel reviewActivityViewModel2 = this.f30186g;
            C7374a c7374a = (C7374a) reviewActivityViewModel2.f30150H.getValue();
            if (c7374a != null) {
                int value = CardStatus.Ignored.getValue();
                InterfaceC2008a interfaceC2008a = reviewActivityViewModel2.f30158d;
                String str = c7374a.f41142a;
                int i11 = this.f30187h;
                if (i11 == value) {
                    String strMo498E1 = reviewActivityViewModel2.mo498E1();
                    this.f30184e = reviewActivityViewModel2;
                    this.f30185f = 1;
                    if (interfaceC2008a.mo5950b(i11, strMo498E1, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    String strMo498E2 = reviewActivityViewModel2.mo498E1();
                    this.f30184e = reviewActivityViewModel2;
                    this.f30185f = 2;
                    if (interfaceC2008a.mo5957i(i11, strMo498E2, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                reviewActivityViewModel = reviewActivityViewModel2;
            }
            return C9072e.f47360a;
        }
        if (i10 != 1 && i10 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        reviewActivityViewModel = this.f30184e;
        C7499b.m14977z0(obj);
        reviewActivityViewModel.f30154L.mo14371k(C9072e.f47360a);
        return C9072e.f47360a;
    }
}
