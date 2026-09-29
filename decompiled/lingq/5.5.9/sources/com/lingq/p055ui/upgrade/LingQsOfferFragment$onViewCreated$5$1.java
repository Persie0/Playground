package com.lingq.p055ui.upgrade;

import ae.C0062b;
import android.support.v4.media.C0141b;
import android.view.View;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.lingq.shared.domain.LingQsOffer;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7116c;
import no.C7828f;
import no.InterfaceC7882z;
import org.joda.time.DateTime;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import ph.C8264c2;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$1", m19206f = "LingQsOfferFragment.kt", m19207l = {79}, m19208m = "invokeSuspend")
public final class LingQsOfferFragment$onViewCreated$5$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31946e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LingQsOfferFragment f31947f;

    /* JADX INFO: renamed from: com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/ProfileAccount;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$1$1", m19206f = "LingQsOfferFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C49141 extends SuspendLambda implements InterfaceC2056p<ProfileAccount, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LingQsOfferFragment f31948e;

        /* JADX INFO: renamed from: com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$1$1$a */
        public static final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ LingQsOfferFragment f31949a;

            public a(LingQsOfferFragment lingQsOfferFragment) {
                this.f31949a = lingQsOfferFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LingQsOfferViewModel lingQsOfferViewModelM10404n0 = LingQsOfferFragment.m10404n0(this.f31949a);
                long jMo12597k = new DateTime().mo12597k() / ((long) 1000);
                C7828f.m15570d(C8573r0.m16767w0(lingQsOfferViewModelM10404n0), null, null, new LingQsOfferViewModel$getMoreLingQs$1(lingQsOfferViewModelM10404n0, LingQsOffer.LimitOffer, jMo12597k, null), 3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49141(LingQsOfferFragment lingQsOfferFragment, InterfaceC9968c<? super C49141> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31948e = lingQsOfferFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C49141(this.f31948e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C49141) mo1336a(profileAccount, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LingQsOfferFragment.f31936C0;
            LingQsOfferFragment lingQsOfferFragment = this.f31948e;
            C8264c2 c8264c2M10405o0 = lingQsOfferFragment.m10405o0();
            c8264c2M10405o0.f44644e.m4933b();
            MaterialButton materialButton = c8264c2M10405o0.f44641b;
            C5207g.m11110e(materialButton, "btnUpgrade");
            C4924a.m10457e0(materialButton);
            Locale locale = Locale.getDefault();
            String strM3600t = lingQsOfferFragment.m3600t(R.string.upgrade_offer_need_time_desc);
            C5207g.m11110e(strM3600t, "getString(R.string.upgrade_offer_need_time_desc)");
            LingQsOffer lingQsOffer = LingQsOffer.LimitOffer;
            c8264c2M10405o0.f44642c.setText(C0141b.m613i(new Object[]{new Integer(lingQsOffer.amount())}, 1, locale, strM3600t, "format(locale, format, *args)"));
            Locale locale2 = Locale.getDefault();
            String strM3600t2 = lingQsOfferFragment.m3600t(R.string.upgrade_get_more_lingqs);
            C5207g.m11110e(strM3600t2, "getString(R.string.upgrade_get_more_lingqs)");
            String str = String.format(locale2, strM3600t2, Arrays.copyOf(new Object[]{new Integer(lingQsOffer.amount())}, 1));
            C5207g.m11110e(str, "format(locale, format, *args)");
            materialButton.setText(str);
            materialButton.setOnClickListener(new a(lingQsOfferFragment));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LingQsOfferFragment$onViewCreated$5$1(LingQsOfferFragment lingQsOfferFragment, InterfaceC9968c<? super LingQsOfferFragment$onViewCreated$5$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31947f = lingQsOfferFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LingQsOfferFragment$onViewCreated$5$1(this.f31947f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LingQsOfferFragment$onViewCreated$5$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31946e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LingQsOfferFragment lingQsOfferFragment = this.f31947f;
            InterfaceC7116c<ProfileAccount> interfaceC7116cMo508t1 = LingQsOfferFragment.m10404n0(lingQsOfferFragment).mo508t1();
            C49141 c49141 = new C49141(lingQsOfferFragment, null);
            this.f31946e = 1;
            if (C0062b.m369m0(interfaceC7116cMo508t1, c49141, this) == coroutineSingletons) {
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
