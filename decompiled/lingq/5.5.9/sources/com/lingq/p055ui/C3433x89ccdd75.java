package com.lingq.p055ui;

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
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: renamed from: com.lingq.ui.StartFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.StartFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1", m19206f = "StartFragment.kt", m19207l = {119}, m19208m = "invokeSuspend")
public final class C3433x89ccdd75 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22381e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Fragment f22382f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Lifecycle.State f22383g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ StartFragment f22384h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f22385i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f22386j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f22387k;

    /* JADX INFO: renamed from: com.lingq.ui.StartFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1, reason: invalid class name */
    @Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.StartFragment$onViewCreated$$inlined$launchAndRepeatWithViewLifecycle$default$1$1", m19206f = "StartFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class AnonymousClass1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f22388e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ StartFragment f22389f;

        /* JADX INFO: renamed from: g */
        public final /* synthetic */ int f22390g;

        /* JADX INFO: renamed from: h */
        public final /* synthetic */ int f22391h;

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ int f22392i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i10, int i11, int i12, StartFragment startFragment, InterfaceC9968c interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22389f = startFragment;
            this.f22390g = i10;
            this.f22391h = i11;
            this.f22392i = i12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22390g, this.f22391h, this.f22392i, this.f22389f, interfaceC9968c);
            anonymousClass1.f22388e = obj;
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
            InterfaceC7882z interfaceC7882z = (InterfaceC7882z) this.f22388e;
            StartFragment startFragment = this.f22389f;
            C7828f.m15570d(interfaceC7882z, null, null, new StartFragment$onViewCreated$2$1(startFragment, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new StartFragment$onViewCreated$2$2(this.f22390g, this.f22391h, this.f22392i, this.f22389f, null), 3);
            C7828f.m15570d(interfaceC7882z, null, null, new StartFragment$onViewCreated$2$3(startFragment, null), 3);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3433x89ccdd75(Fragment fragment, Lifecycle.State state, InterfaceC9968c interfaceC9968c, StartFragment startFragment, int i10, int i11, int i12) {
        super(2, interfaceC9968c);
        this.f22382f = fragment;
        this.f22383g = state;
        this.f22384h = startFragment;
        this.f22385i = i10;
        this.f22386j = i11;
        this.f22387k = i12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new C3433x89ccdd75(this.f22382f, this.f22383g, interfaceC9968c, this.f22384h, this.f22385i, this.f22386j, this.f22387k);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((C3433x89ccdd75) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22381e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            C0980t0 c0980t0M3601v = this.f22382f.m3601v();
            c0980t0M3601v.m3813c();
            C1052r c1052r = c0980t0M3601v.f6415d;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f22385i, this.f22386j, this.f22387k, this.f22384h, null);
            this.f22381e = 1;
            if (RepeatOnLifecycleKt.m3906b(c1052r, this.f22383g, anonymousClass1, this) == coroutineSingletons) {
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
