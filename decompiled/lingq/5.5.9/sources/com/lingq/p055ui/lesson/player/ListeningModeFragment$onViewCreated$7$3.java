package com.lingq.p055ui.lesson.player;

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
import p304ok.InterfaceC8066b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import pk.InterfaceC8402c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$3", m19206f = "ListeningModeFragment.kt", m19207l = {344}, m19208m = "invokeSuspend")
public final class ListeningModeFragment$onViewCreated$7$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28761e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListeningModeFragment f28762f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "progress", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$3$1", m19206f = "ListeningModeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43951 extends SuspendLambda implements InterfaceC2056p<Double, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ double f28763e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ListeningModeFragment f28764f;

        /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$3$1$a */
        public static final class a implements InterfaceC8402c {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ double f28765a;

            public a(double d10) {
                this.f28765a = d10;
            }

            @Override // pk.InterfaceC8402c
            /* JADX INFO: renamed from: a */
            public final void mo5247a(InterfaceC8066b interfaceC8066b) {
                C5207g.m11111f(interfaceC8066b, "youTubePlayer");
                interfaceC8066b.mo15932c((float) this.f28765a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43951(ListeningModeFragment listeningModeFragment, InterfaceC9968c<? super C43951> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28764f = listeningModeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43951 c43951 = new C43951(this.f28764f, interfaceC9968c);
            c43951.f28763e = ((Number) obj).doubleValue();
            return c43951;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Double d10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43951) mo1336a(Double.valueOf(d10.doubleValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            double d10 = this.f28763e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
            this.f28764f.m10210o0().f45247x.m10491a(new a(d10));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListeningModeFragment$onViewCreated$7$3(ListeningModeFragment listeningModeFragment, InterfaceC9968c<? super ListeningModeFragment$onViewCreated$7$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28762f = listeningModeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ListeningModeFragment$onViewCreated$7$3(this.f28762f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ListeningModeFragment$onViewCreated$7$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28761e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
            ListeningModeFragment listeningModeFragment = this.f28762f;
            ListeningModeViewModel listeningModeViewModelM10211p0 = listeningModeFragment.m10211p0();
            C43951 c43951 = new C43951(listeningModeFragment, null);
            this.f28761e = 1;
            if (C0062b.m369m0(listeningModeViewModelM10211p0.f28800P, c43951, this) == coroutineSingletons) {
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
