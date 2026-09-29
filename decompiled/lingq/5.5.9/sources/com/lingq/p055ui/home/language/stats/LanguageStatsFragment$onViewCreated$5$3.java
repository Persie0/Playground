package com.lingq.p055ui.home.language.stats;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$3", m19206f = "LanguageStatsFragment.kt", m19207l = {218}, m19208m = "invokeSuspend")
public final class LanguageStatsFragment$onViewCreated$5$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24266e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ LanguageStatsFragment f24267f;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$5$3$1", m19206f = "LanguageStatsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C37101 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24268e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LanguageStatsFragment f24269f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C37101(LanguageStatsFragment languageStatsFragment, InterfaceC9968c<? super C37101> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24269f = languageStatsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C37101 c37101 = new C37101(this.f24269f, interfaceC9968c);
            c37101.f24268e = obj;
            return c37101;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C37101) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f24268e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
            LanguageStatsViewModel languageStatsViewModelM9908p0 = this.f24269f.m9908p0();
            C5207g.m11111f(str, "timeRemaining");
            languageStatsViewModelM9908p0.f24288L.setValue(str);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LanguageStatsFragment$onViewCreated$5$3(LanguageStatsFragment languageStatsFragment, InterfaceC9968c<? super LanguageStatsFragment$onViewCreated$5$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f24267f = languageStatsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new LanguageStatsFragment$onViewCreated$5$3(this.f24267f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((LanguageStatsFragment$onViewCreated$5$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24266e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = LanguageStatsFragment.f24239F0;
            LanguageStatsFragment languageStatsFragment = this.f24267f;
            LanguageStatsViewModel languageStatsViewModelM9908p0 = languageStatsFragment.m9908p0();
            C37101 c37101 = new C37101(languageStatsFragment, null);
            this.f24266e = 1;
            if (C0062b.m369m0(languageStatsViewModelM9908p0.f24289M, c37101, this) == coroutineSingletons) {
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
