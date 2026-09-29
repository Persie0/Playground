package com.lingq.p055ui.upgrade;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$4", m19206f = "LingQsOfferFragment.kt", m19207l = {131}, m19208m = "invokeSuspend")
public final class LingQsOfferFragment$onViewCreated$5$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31957e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LingQsOfferFragment f31958f;

    /* JADX INFO: renamed from: com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$4$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.LingQsOfferFragment$onViewCreated$5$4$1", m19206f = "LingQsOfferFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C49171 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f31959e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LingQsOfferFragment f31960f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49171(LingQsOfferFragment lingQsOfferFragment, InterfaceC9968c<? super C49171> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f31960f = lingQsOfferFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C49171 c49171 = new C49171(this.f31960f, interfaceC9968c);
            c49171.f31959e = ((Boolean) obj).booleanValue();
            return c49171;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C49171) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f31959e;
            LingQsOfferFragment lingQsOfferFragment = this.f31960f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = LingQsOfferFragment.f31936C0;
                lingQsOfferFragment.m10405o0().f44644e.m4935d();
                MaterialButton materialButton = lingQsOfferFragment.m10405o0().f44641b;
                C5207g.m11110e(materialButton, "binding.btnUpgrade");
                C4924a.m10422A(materialButton);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = LingQsOfferFragment.f31936C0;
                lingQsOfferFragment.m10405o0().f44644e.m4933b();
                MaterialButton materialButton2 = lingQsOfferFragment.m10405o0().f44641b;
                C5207g.m11110e(materialButton2, "binding.btnUpgrade");
                C4924a.m10457e0(materialButton2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LingQsOfferFragment$onViewCreated$5$4(LingQsOfferFragment lingQsOfferFragment, InterfaceC9968c<? super LingQsOfferFragment$onViewCreated$5$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f31958f = lingQsOfferFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LingQsOfferFragment$onViewCreated$5$4(this.f31958f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LingQsOfferFragment$onViewCreated$5$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31957e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            LingQsOfferFragment lingQsOfferFragment = this.f31958f;
            LingQsOfferViewModel lingQsOfferViewModelM10404n0 = LingQsOfferFragment.m10404n0(lingQsOfferFragment);
            C49171 c49171 = new C49171(lingQsOfferFragment, null);
            this.f31957e = 1;
            if (C0062b.m369m0(lingQsOfferViewModelM10404n0.f31973i, c49171, this) == coroutineSingletons) {
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
