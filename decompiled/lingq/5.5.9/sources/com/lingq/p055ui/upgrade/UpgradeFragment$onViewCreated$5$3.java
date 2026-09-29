package com.lingq.p055ui.upgrade;

import ae.C0062b;
import android.content.DialogInterface;
import android.widget.FrameLayout;
import androidx.appcompat.app.AlertController;
import cm.InterfaceC2056p;
import com.android.billingclient.api.Purchase;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.p055ui.MainViewModel;
import com.lingq.util.C4924a;
import com.linguist.R;
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
import tc.C9249b;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.UpgradeFragment$onViewCreated$5$3", m19206f = "UpgradeFragment.kt", m19207l = {202}, m19208m = "invokeSuspend")
public final class UpgradeFragment$onViewCreated$5$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f32003e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ UpgradeFragment f32004f;

    /* JADX INFO: renamed from: com.lingq.ui.upgrade.UpgradeFragment$onViewCreated$5$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"Lcom/android/billingclient/api/Purchase;", "purchase", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.upgrade.UpgradeFragment$onViewCreated$5$3$1", m19206f = "UpgradeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C49211 extends SuspendLambda implements InterfaceC2056p<Purchase, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ UpgradeFragment f32005e;

        /* JADX INFO: renamed from: com.lingq.ui.upgrade.UpgradeFragment$onViewCreated$5$3$1$a */
        public static final class a implements DialogInterface.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ UpgradeFragment f32006a;

            public a(UpgradeFragment upgradeFragment) {
                this.f32006a = upgradeFragment;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = UpgradeFragment.f31981F0;
                this.f32006a.m10410r0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C49211(UpgradeFragment upgradeFragment, InterfaceC9968c<? super C49211> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f32005e = upgradeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return new C49211(this.f32005e, interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Purchase purchase, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C49211) mo1336a(purchase, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = UpgradeFragment.f31981F0;
            UpgradeFragment upgradeFragment = this.f32005e;
            FrameLayout frameLayout = upgradeFragment.m10408p0().f44568m;
            C5207g.m11110e(frameLayout, "binding.viewProgress");
            C4924a.m10442U(frameLayout);
            C9249b c9249b = new C9249b(upgradeFragment.m3576Y());
            c9249b.setTitle(upgradeFragment.m3600t(R.string.upgrade_purchase_successful));
            String strM3600t = upgradeFragment.m3600t(R.string.upgrade_thank_you);
            AlertController.C0211b c0211b = c9249b.f599a;
            c0211b.f579f = strM3600t;
            c0211b.f586m = false;
            c9249b.m17612e(upgradeFragment.m3600t(R.string.ui_ok), new a(upgradeFragment));
            c9249b.m876a();
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeFragment$onViewCreated$5$3(UpgradeFragment upgradeFragment, InterfaceC9968c<? super UpgradeFragment$onViewCreated$5$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f32004f = upgradeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new UpgradeFragment$onViewCreated$5$3(this.f32004f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((UpgradeFragment$onViewCreated$5$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f32003e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = UpgradeFragment.f31981F0;
            UpgradeFragment upgradeFragment = this.f32004f;
            MainViewModel mainViewModelM10409q0 = upgradeFragment.m10409q0();
            C49211 c49211 = new C49211(upgradeFragment, null);
            this.f32003e = 1;
            if (C0062b.m369m0(mainViewModelM10409q0.f22281b0, c49211, this) == coroutineSingletons) {
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
