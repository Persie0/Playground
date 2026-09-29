package com.lingq.p055ui.home.library;

import ae.C0062b;
import android.text.Html;
import android.view.View;
import android.widget.RelativeLayout;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.button.MaterialButton;
import com.lingq.util.C4924a;
import com.linguist.R;
import dm.C5207g;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$6", m19206f = "RepairStreakFragment.kt", m19207l = {108}, m19208m = "invokeSuspend")
public final class RepairStreakFragment$onViewCreated$2$6 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24966e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ RepairStreakFragment f24967f;

    /* JADX INFO: renamed from: com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$6$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"", "notEnoughCoins", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$6$1", m19206f = "RepairStreakFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38041 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24968e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ RepairStreakFragment f24969f;

        /* JADX INFO: renamed from: com.lingq.ui.home.library.RepairStreakFragment$onViewCreated$2$6$1$a */
        public static final class a implements View.OnClickListener {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ RepairStreakFragment f24970a;

            public a(RepairStreakFragment repairStreakFragment) {
                this.f24970a = repairStreakFragment;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                List<Integer> list = C6716m.f37937a;
                C6716m.m13330o(this.f24970a.m3578a0(), "https://lingq.wixanswers.com/kb/en/article/how-to-earn-coins-and-what-to-do-with-them-6721550", null, 12);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38041(RepairStreakFragment repairStreakFragment, InterfaceC9968c<? super C38041> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24969f = repairStreakFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38041 c38041 = new C38041(this.f24969f, interfaceC9968c);
            c38041.f24968e = obj;
            return c38041;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38041) mo1336a(bool, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            Boolean bool = (Boolean) this.f24968e;
            if (bool != null) {
                bool.booleanValue();
                boolean zBooleanValue = bool.booleanValue();
                RepairStreakFragment repairStreakFragment = this.f24969f;
                if (zBooleanValue) {
                    InterfaceC6727j<Object>[] interfaceC6727jArr = RepairStreakFragment.f24937S0;
                    RelativeLayout relativeLayout = repairStreakFragment.m9951u0().f44844f;
                    C5207g.m11110e(relativeLayout, "binding.viewError");
                    C4924a.m10457e0(relativeLayout);
                    MaterialButton materialButton = repairStreakFragment.m9951u0().f44840b;
                    C5207g.m11110e(materialButton, "binding.btnRepair");
                    C4924a.m10442U(materialButton);
                    MaterialButton materialButton2 = repairStreakFragment.m9951u0().f44839a;
                    C5207g.m11110e(materialButton2, "binding.btnNotNow");
                    C4924a.m10442U(materialButton2);
                    repairStreakFragment.m9951u0().f44841c.setText(Html.fromHtml(repairStreakFragment.m3600t(R.string.stats_not_enough_coins), 63));
                    repairStreakFragment.m9951u0().f44841c.setOnClickListener(new a(repairStreakFragment));
                } else {
                    InterfaceC6727j<Object>[] interfaceC6727jArr2 = RepairStreakFragment.f24937S0;
                    MaterialButton materialButton3 = repairStreakFragment.m9951u0().f44840b;
                    C5207g.m11110e(materialButton3, "binding.btnRepair");
                    C4924a.m10457e0(materialButton3);
                    MaterialButton materialButton4 = repairStreakFragment.m9951u0().f44839a;
                    C5207g.m11110e(materialButton4, "binding.btnNotNow");
                    C4924a.m10457e0(materialButton4);
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepairStreakFragment$onViewCreated$2$6(RepairStreakFragment repairStreakFragment, InterfaceC9968c<? super RepairStreakFragment$onViewCreated$2$6> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24967f = repairStreakFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new RepairStreakFragment$onViewCreated$2$6(this.f24967f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((RepairStreakFragment$onViewCreated$2$6) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24966e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = RepairStreakFragment.f24937S0;
            RepairStreakFragment repairStreakFragment = this.f24967f;
            RepairStreakViewModel repairStreakViewModelM9952v0 = repairStreakFragment.m9952v0();
            C38041 c38041 = new C38041(repairStreakFragment, null);
            this.f24966e = 1;
            if (C0062b.m369m0(repairStreakViewModelM9952v0.f24979J, c38041, this) == coroutineSingletons) {
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
