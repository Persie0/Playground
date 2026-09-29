package com.lingq.p055ui.upgrade;

import ae.C0062b;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0979t;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import dm.C5207g;
import java.util.Arrays;
import java.util.Locale;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$2", m19206f = "LingQsOfferFragment.kt", m19207l = {102}, m19208m = "invokeSuspend")
public final class LingQsOfferFragment$onViewCreated$5$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31950e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LingQsOfferFragment f31951f;

    /* JADX INFO: renamed from: com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "amount", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$2$1", m19206f = "LingQsOfferFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C49151 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f31952e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LingQsOfferFragment f31953f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49151(LingQsOfferFragment lingQsOfferFragment, InterfaceC9968c<? super C49151> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31953f = lingQsOfferFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C49151 c49151 = new C49151(this.f31953f, interfaceC9968c);
            c49151.f31952e = ((Number) obj).intValue();
            return c49151;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C49151) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f31952e;
            LingQsOfferFragment lingQsOfferFragment = this.f31953f;
            ActivityC0979t activityC0979tM3576Y = lingQsOfferFragment.m3576Y();
            Locale locale = Locale.getDefault();
            String strM3600t = lingQsOfferFragment.m3600t(R.string.upgrade_more_lingqs_success);
            C5207g.m11110e(strM3600t, "getString(R.string.upgrade_more_lingqs_success)");
            String str = String.format(locale, strM3600t, Arrays.copyOf(new Object[]{new Integer(i10)}, 1));
            C5207g.m11110e(str, "format(locale, format, *args)");
            Toast.makeText(activityC0979tM3576Y, str, 1).show();
            lingQsOfferFragment.m3598r().m3628T(LingQsOfferFragment.class.getName());
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LingQsOfferFragment$onViewCreated$5$2(LingQsOfferFragment lingQsOfferFragment, InterfaceC9968c<? super LingQsOfferFragment$onViewCreated$5$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31951f = lingQsOfferFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LingQsOfferFragment$onViewCreated$5$2(this.f31951f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LingQsOfferFragment$onViewCreated$5$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31950e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LingQsOfferFragment lingQsOfferFragment = this.f31951f;
            LingQsOfferViewModel lingQsOfferViewModelM10404n0 = LingQsOfferFragment.m10404n0(lingQsOfferFragment);
            C49151 c49151 = new C49151(lingQsOfferFragment, null);
            this.f31950e = 1;
            if (C0062b.m369m0(lingQsOfferViewModelM10404n0.f31975k, c49151, this) == coroutineSingletons) {
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
