package com.lingq.p055ui.upgrade;

import ae.C0062b;
import android.widget.FrameLayout;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.MainViewModel;
import com.lingq.shared.domain.Resource;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.UpgradeFragment$onViewCreated$5$2", m19206f = "UpgradeFragment.kt", m19207l = {194}, m19208m = "invokeSuspend")
public final class UpgradeFragment$onViewCreated$5$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f31999e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UpgradeFragment f32000f;

    /* JADX INFO: renamed from: com.lingq.ui.upgrade.UpgradeFragment$onViewCreated$5$2$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/domain/Resource$Status;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.UpgradeFragment$onViewCreated$5$2$1", m19206f = "UpgradeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C49201 extends SuspendLambda implements InterfaceC2056p<Resource.Status, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f32001e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ UpgradeFragment f32002f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49201(UpgradeFragment upgradeFragment, InterfaceC9968c<? super C49201> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f32002f = upgradeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C49201 c49201 = new C49201(this.f32002f, interfaceC9968c);
            c49201.f32001e = obj;
            return c49201;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Resource.Status status, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C49201) mo1336a(status, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            if (((Resource.Status) this.f32001e) == Resource.Status.LOADING) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = UpgradeFragment.f31981F0;
                FrameLayout frameLayout = this.f32002f.m10408p0().f44568m;
                C5207g.m11110e(frameLayout, "binding.viewProgress");
                C4924a.m10457e0(frameLayout);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeFragment$onViewCreated$5$2(UpgradeFragment upgradeFragment, InterfaceC9968c<? super UpgradeFragment$onViewCreated$5$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f32000f = upgradeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UpgradeFragment$onViewCreated$5$2(this.f32000f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UpgradeFragment$onViewCreated$5$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f31999e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = UpgradeFragment.f31981F0;
            UpgradeFragment upgradeFragment = this.f32000f;
            MainViewModel mainViewModelM10409q0 = upgradeFragment.m10409q0();
            C49201 c49201 = new C49201(upgradeFragment, null);
            this.f31999e = 1;
            if (C0062b.m369m0(mainViewModelM10409q0.f22288f0, c49201, this) == coroutineSingletons) {
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
