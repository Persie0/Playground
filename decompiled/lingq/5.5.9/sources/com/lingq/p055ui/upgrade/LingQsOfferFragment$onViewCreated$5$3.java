package com.lingq.p055ui.upgrade;

import ae.C0062b;
import android.widget.Toast;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$3", m19206f = "LingQsOfferFragment.kt", m19207l = {121}, m19208m = "invokeSuspend")
public final class LingQsOfferFragment$onViewCreated$5$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31954e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LingQsOfferFragment f31955f;

    /* JADX INFO: renamed from: com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$3$1 */
    @Metadata(m13364d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lsl/e;", "it", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$3$1", m19206f = "LingQsOfferFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C49161 extends SuspendLambda implements InterfaceC2056p<C9072e, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ LingQsOfferFragment f31956e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49161(LingQsOfferFragment lingQsOfferFragment, InterfaceC9968c<? super C49161> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31956e = lingQsOfferFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C49161(this.f31956e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(C9072e c9072e, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C49161) mo1336a(c9072e, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            LingQsOfferFragment lingQsOfferFragment = this.f31956e;
            Toast.makeText(lingQsOfferFragment.m3578a0(), lingQsOfferFragment.m3600t(R.string.texts_try_later), 1).show();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LingQsOfferFragment$onViewCreated$5$3(LingQsOfferFragment lingQsOfferFragment, InterfaceC9968c<? super LingQsOfferFragment$onViewCreated$5$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31955f = lingQsOfferFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LingQsOfferFragment$onViewCreated$5$3(this.f31955f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LingQsOfferFragment$onViewCreated$5$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31954e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LingQsOfferFragment lingQsOfferFragment = this.f31955f;
            LingQsOfferViewModel lingQsOfferViewModelM10404n0 = LingQsOfferFragment.m10404n0(lingQsOfferFragment);
            C49161 c49161 = new C49161(lingQsOfferFragment, null);
            this.f31954e = 1;
            if (C0062b.m369m0(lingQsOfferViewModelM10404n0.f31967H, c49161, this) == coroutineSingletons) {
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
