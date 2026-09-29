package com.lingq.p055ui.home.language.stats;

import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p487xi.C10201i;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m19206f = "LanguageStatsFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class C3707x2a82f6fa extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24247e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f24248f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle.State f24249g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ LanguageStatsFragment f24250h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C10201i f24251i;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.LanguageStatsFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m19206f = "LanguageStatsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24252e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ LanguageStatsFragment f24253f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C10201i f24254g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(C10201i c10201i, LanguageStatsFragment languageStatsFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24253f = languageStatsFragment;
            this.f24254g = c10201i;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24254g, this.f24253f, interfaceC9968c);
            anonymousClass1.f24252e = obj;
            return anonymousClass1;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((AnonymousClass1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f24252e;
            LanguageStatsFragment languageStatsFragment = this.f24253f;
            C7828f.m15570d(interfaceC7882z, null, null, new LanguageStatsFragment$onViewCreated$5$1(languageStatsFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LanguageStatsFragment$onViewCreated$5$2(this.f24254g, languageStatsFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LanguageStatsFragment$onViewCreated$5$3(languageStatsFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LanguageStatsFragment$onViewCreated$5$4(languageStatsFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new LanguageStatsFragment$onViewCreated$5$5(languageStatsFragment, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3707x2a82f6fa(Fragment fragment, Lifecycle.State state, InterfaceC9968c interfaceC9968c, LanguageStatsFragment languageStatsFragment, C10201i c10201i) {
        super(2, interfaceC9968c);
        this.f24248f = fragment;
        this.f24249g = state;
        this.f24250h = languageStatsFragment;
        this.f24251i = c10201i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C3707x2a82f6fa(this.f24248f, this.f24249g, interfaceC9968c, this.f24250h, this.f24251i);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C3707x2a82f6fa) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24247e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0980t0 c0980t0M3601v = this.f24248f.m3601v();
            c0980t0M3601v.m3813c();
            C1052r c1052r = c0980t0M3601v.f6415d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24251i, this.f24250h, null);
            this.f24247e = 1;
            if (RepeatOnLifecycleKt.m3906b(c1052r, this.f24249g, anonymousClass1, this) == coroutineSingletons) {
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
