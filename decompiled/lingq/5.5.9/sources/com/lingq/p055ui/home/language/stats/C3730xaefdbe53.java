package com.lingq.p055ui.home.language.stats;

import androidx.fragment.app.C0980t0;
import androidx.fragment.app.Fragment;
import androidx.view.C1052r;
import androidx.view.Lifecycle;
import androidx.view.RepeatOnLifecycleKt;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import dk.C5197b;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.C7828f;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m19206f = "StatsShareFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class C3730xaefdbe53 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f24397e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f24398f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle.State f24399g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ StatsShareFragment f24400h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C5197b f24401i;

    /* JADX INFO: renamed from: com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.language.stats.StatsShareFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m19206f = "StatsShareFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f24402e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ StatsShareFragment f24403f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ C5197b f24404g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StatsShareFragment statsShareFragment, C5197b c5197b, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f24403f = statsShareFragment;
            this.f24404g = c5197b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24403f, this.f24404g, interfaceC9968c);
            anonymousClass1.f24402e = obj;
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
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f24402e;
            StatsShareFragment statsShareFragment = this.f24403f;
            C7828f.m15570d(interfaceC7882z, null, null, new StatsShareFragment$onViewCreated$3$1(statsShareFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new StatsShareFragment$onViewCreated$3$2(statsShareFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new StatsShareFragment$onViewCreated$3$3(statsShareFragment, this.f24404g, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new StatsShareFragment$onViewCreated$3$4(statsShareFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new StatsShareFragment$onViewCreated$3$5(statsShareFragment, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3730xaefdbe53(Fragment fragment, Lifecycle.State state, InterfaceC9968c interfaceC9968c, StatsShareFragment statsShareFragment, C5197b c5197b) {
        super(2, interfaceC9968c);
        this.f24398f = fragment;
        this.f24399g = state;
        this.f24400h = statsShareFragment;
        this.f24401i = c5197b;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C3730xaefdbe53(this.f24398f, this.f24399g, interfaceC9968c, this.f24400h, this.f24401i);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C3730xaefdbe53) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f24397e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0980t0 c0980t0M3601v = this.f24398f.m3601v();
            c0980t0M3601v.m3813c();
            C1052r c1052r = c0980t0M3601v.f6415d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f24400h, this.f24401i, null);
            this.f24397e = 1;
            if (RepeatOnLifecycleKt.m3906b(c1052r, this.f24399g, anonymousClass1, this) == coroutineSingletons) {
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
