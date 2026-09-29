package com.lingq.p055ui.home.language.stats;

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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$5", m19206f = "StatsShareFragment.kt", m19207l = {150}, m19208m = "invokeSuspend")
public final class StatsShareFragment$onViewCreated$3$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24423e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ StatsShareFragment f24424f;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$5$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "canShare", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$3$5$1", m19206f = "StatsShareFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37351 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f24425e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ StatsShareFragment f24426f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37351(StatsShareFragment statsShareFragment, InterfaceC9968c<? super C37351> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24426f = statsShareFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37351 c37351 = new C37351(this.f24426f, interfaceC9968c);
            c37351.f24425e = ((Boolean) obj).booleanValue();
            return c37351;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37351) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f24425e;
            StatsShareFragment statsShareFragment = this.f24426f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
                MaterialButton materialButton = statsShareFragment.m9921u0().f45307a;
                C5207g.m11110e(materialButton, "binding.btnShare");
                C4924a.m10457e0(materialButton);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = StatsShareFragment.f24390T0;
                MaterialButton materialButton2 = statsShareFragment.m9921u0().f45307a;
                C5207g.m11110e(materialButton2, "binding.btnShare");
                C4924a.m10422A(materialButton2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StatsShareFragment$onViewCreated$3$5(StatsShareFragment statsShareFragment, InterfaceC9968c<? super StatsShareFragment$onViewCreated$3$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24424f = statsShareFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new StatsShareFragment$onViewCreated$3$5(this.f24424f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((StatsShareFragment$onViewCreated$3$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24423e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = StatsShareFragment.f24390T0;
            StatsShareFragment statsShareFragment = this.f24424f;
            StatsShareViewModel statsShareViewModelM9922v0 = statsShareFragment.m9922v0();
            C37351 c37351 = new C37351(statsShareFragment, null);
            this.f24423e = 1;
            if (C0062b.m369m0(statsShareViewModelM9922v0.f24438M, c37351, this) == coroutineSingletons) {
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
