package com.lingq.p055ui.upgrade;

import android.os.Bundle;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.LingQsOffer;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.LingQsOfferViewModel$getMoreLingQs$1", m19206f = "LingQsOfferViewModel.kt", m19207l = {48}, m19208m = "invokeSuspend")
final class LingQsOfferViewModel$getMoreLingQs$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31977e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LingQsOfferViewModel f31978f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ LingQsOffer f31979g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ long f31980h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LingQsOfferViewModel$getMoreLingQs$1(LingQsOfferViewModel lingQsOfferViewModel, LingQsOffer lingQsOffer, long j10, InterfaceC9968c<? super LingQsOfferViewModel$getMoreLingQs$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31978f = lingQsOfferViewModel;
        this.f31979g = lingQsOffer;
        this.f31980h = j10;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LingQsOfferViewModel$getMoreLingQs$1(this.f31978f, this.f31979g, this.f31980h, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LingQsOfferViewModel$getMoreLingQs$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31977e;
        LingQsOfferViewModel lingQsOfferViewModel = this.f31978f;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            lingQsOfferViewModel.f31972h.setValue(Boolean.TRUE);
            this.f31977e = 1;
            obj = lingQsOfferViewModel.f31968d.mo6142k(this.f31979g, this.f31980h, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        lingQsOfferViewModel.f31972h.setValue(Boolean.FALSE);
        if (zBooleanValue) {
            Bundle bundle = new Bundle();
            LingQsOffer lingQsOffer = LingQsOffer.LimitOffer;
            bundle.putInt("LingQs Added", lingQsOffer.amount());
            lingQsOfferViewModel.f31969e.m15505b(bundle, "Add More LingQs");
            lingQsOfferViewModel.f31974j.mo14371k(new Integer(lingQsOffer.amount()));
        } else {
            lingQsOfferViewModel.f31976l.mo14371k(C9072e.f47360a);
        }
        return C9072e.f47360a;
    }
}
