package com.lingq.commons.controllers;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.UserMilestone;
import com.lingq.shared.uimodel.language.UserLanguage;
import com.lingq.shared.util.DailyGoalMet;
import dm.C5207g;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.channels.AbstractChannel;
import kotlinx.coroutines.flow.C7114a;
import kotlinx.coroutines.flow.C7120g;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7133n;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.flow.StateFlowImpl;
import ni.C7794b;
import no.C7828f;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p015ak.InterfaceC0113j;
import p244lh.InterfaceC7367d;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class MilestonesControllerDelegateImpl implements InterfaceC7367d, InterfaceC0113j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC0113j f16524a;

    /* JADX INFO: renamed from: b */
    public final LinkedHashSet f16525b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f16526c;

    /* JADX INFO: renamed from: d */
    public final AbstractChannel f16527d;

    /* JADX INFO: renamed from: e */
    public final C7114a f16528e;

    /* JADX INFO: renamed from: f */
    public final StateFlowImpl f16529f;

    /* JADX INFO: renamed from: com.lingq.commons.controllers.MilestonesControllerDelegateImpl$1 */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.commons.controllers.MilestonesControllerDelegateImpl$1", m19206f = "MilestonesControllerDelegate.kt", m19207l = {47}, m19208m = "invokeSuspend")
    public static final class C32661 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public int f16530e;

        /* JADX INFO: renamed from: com.lingq.commons.controllers.MilestonesControllerDelegateImpl$1$1, reason: invalid class name */
        @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@"}, m13365d2 = {"Lcom/lingq/shared/uimodel/language/UserLanguage;", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
        @InterfaceC10224c(m19205c = "com.lingq.commons.controllers.MilestonesControllerDelegateImpl$1$1", m19206f = "MilestonesControllerDelegate.kt", m19207l = {}, m19208m = "invokeSuspend")
        public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<UserLanguage, InterfaceC9968c<? super C9072e>, Object> {

            /* JADX INFO: renamed from: e */
            public final /* synthetic */ MilestonesControllerDelegateImpl f16532e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(MilestonesControllerDelegateImpl milestonesControllerDelegateImpl, InterfaceC9968c<? super AnonymousClass1> interfaceC9968c) {
                super(2, interfaceC9968c);
                this.f16532e = milestonesControllerDelegateImpl;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: a */
            public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
                return new AnonymousClass1(this.f16532e, interfaceC9968c);
            }

            @Override // cm.InterfaceC2056p
            /* JADX INFO: renamed from: m0 */
            public final Object mo1337m0(UserLanguage userLanguage, InterfaceC9968c<? super C9072e> interfaceC9968c) {
                return ((AnonymousClass1) mo1336a(userLanguage, interfaceC9968c)).mo1338x(C9072e.f47360a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /* JADX INFO: renamed from: x */
            public final Object mo1338x(Object obj) throws Throwable {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                C7499b.m14977z0(obj);
                MilestonesControllerDelegateImpl milestonesControllerDelegateImpl = this.f16532e;
                milestonesControllerDelegateImpl.f16525b.clear();
                milestonesControllerDelegateImpl.f16526c.clear();
                return C9072e.f47360a;
            }
        }

        public C32661(InterfaceC9968c<? super C32661> interfaceC9968c) {
            super(2, interfaceC9968c);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            return MilestonesControllerDelegateImpl.this.new C32661(interfaceC9968c);
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C32661) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i10 = this.f16530e;
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                MilestonesControllerDelegateImpl milestonesControllerDelegateImpl = MilestonesControllerDelegateImpl.this;
                InterfaceC7142w<UserLanguage> interfaceC7142wMo509w0 = milestonesControllerDelegateImpl.mo509w0();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(milestonesControllerDelegateImpl, null);
                this.f16530e = 1;
                if (C0062b.m369m0(interfaceC7142wMo509w0, anonymousClass1, this) == coroutineSingletons) {
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

    public MilestonesControllerDelegateImpl(InterfaceC0113j interfaceC0113j, InterfaceC7882z interfaceC7882z) {
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC7882z, "coroutineScope");
        this.f16524a = interfaceC0113j;
        this.f16525b = new LinkedHashSet();
        this.f16526c = new LinkedHashSet();
        AbstractChannel abstractChannelM16738m = C8573r0.m16738m(-1, null, 6);
        this.f16527d = abstractChannelM16738m;
        this.f16528e = C0062b.m287L1(abstractChannelM16738m);
        this.f16529f = C7120g.m14379a(Boolean.FALSE);
        C7828f.m15570d(interfaceC7882z, null, null, new C32661(null), 3);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f16524a.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16524a.mo497B0(interfaceC9968c);
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: D1 */
    public final void mo9321D1(List<C7794b> list) {
        this.f16525b.addAll(list);
        m9323b();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f16524a.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16524a.mo499J(profile, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f16524a.mo500P();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: a */
    public final InterfaceC7133n<Boolean> mo9322a() {
        return this.f16529f;
    }

    /* JADX INFO: renamed from: b */
    public final void m9323b() {
        String strM21i;
        if (!((Boolean) this.f16529f.getValue()).booleanValue()) {
            LinkedHashSet linkedHashSet = this.f16525b;
            if (!linkedHashSet.isEmpty()) {
                C7794b c7794b = (C7794b) C6752c.m13422P(linkedHashSet);
                Object obj = c7794b.f42867b;
                if (obj instanceof UserMilestone) {
                    strM21i = C0009a.m21i(((UserMilestone) obj).f21627b, "_", mo498E1());
                } else {
                    strM21i = obj instanceof DailyGoalMet ? C0009a.m21i(((DailyGoalMet) obj).f22151f, "_", mo498E1()) : "";
                }
                if (this.f16526c.contains(strM21i)) {
                    linkedHashSet.remove(c7794b);
                    m9323b();
                    return;
                }
                this.f16527d.mo16479j(C6752c.m13422P(linkedHashSet));
            }
        }
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16524a.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        this.f16524a.mo502f0();
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16524a.mo503f1(interfaceC9968c);
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: h2 */
    public final void mo9324h2(C7794b c7794b) {
        LinkedHashSet linkedHashSet = this.f16525b;
        if (linkedHashSet.contains(c7794b)) {
            this.f16529f.setValue(Boolean.FALSE);
            linkedHashSet.remove(c7794b);
            Object obj = c7794b.f42867b;
            boolean z10 = obj instanceof UserMilestone;
            LinkedHashSet linkedHashSet2 = this.f16526c;
            if (z10) {
                linkedHashSet2.add(((UserMilestone) obj).f21627b + "_" + mo498E1());
            } else if (obj instanceof DailyGoalMet) {
                linkedHashSet2.add(((DailyGoalMet) obj).f22151f + "_" + mo498E1());
            }
            if (!linkedHashSet.isEmpty()) {
                m9323b();
            }
        }
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f16524a.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16524a.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f16524a.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f16524a.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f16524a.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f16524a.mo509w0();
    }

    @Override // p244lh.InterfaceC7367d
    /* JADX INFO: renamed from: w1 */
    public final InterfaceC7116c<C7794b> mo9325w1() {
        return this.f16528e;
    }
}
