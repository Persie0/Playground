package com.lingq.p055ui.lesson.player;

import ae.C0062b;
import android.widget.LinearLayout;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$7", m19206f = "ListeningModeFragment.kt", m19207l = {477}, m19208m = "invokeSuspend")
public final class ListeningModeFragment$onViewCreated$7$7 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f28781e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ ListeningModeFragment f28782f;

    /* JADX INFO: renamed from: com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$7$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "isLoading", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.lesson.player.ListeningModeFragment$onViewCreated$7$7$1", m19206f = "ListeningModeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C43991 extends SuspendLambda implements InterfaceC2056p<Boolean, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ boolean f28783e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ListeningModeFragment f28784f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C43991(ListeningModeFragment listeningModeFragment, InterfaceC9968c<? super C43991> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f28784f = listeningModeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C43991 c43991 = new C43991(this.f28784f, interfaceC9968c);
            c43991.f28783e = ((Boolean) obj).booleanValue();
            return c43991;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Boolean bool, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C43991) mo1336a(Boolean.valueOf(bool.booleanValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            boolean z10 = this.f28783e;
            ListeningModeFragment listeningModeFragment = this.f28784f;
            if (z10) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
                LinearLayout linearLayout = (LinearLayout) listeningModeFragment.m10210o0().f45238o.f45085a;
                C5207g.m11110e(linearLayout, "binding.loadingViews.root");
                C4924a.m10457e0(linearLayout);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = ListeningModeFragment.f28729F0;
                LinearLayout linearLayout2 = (LinearLayout) listeningModeFragment.m10210o0().f45238o.f45085a;
                C5207g.m11110e(linearLayout2, "binding.loadingViews.root");
                C4924a.m10442U(linearLayout2);
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ListeningModeFragment$onViewCreated$7$7(ListeningModeFragment listeningModeFragment, InterfaceC9968c<? super ListeningModeFragment$onViewCreated$7$7> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f28782f = listeningModeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new ListeningModeFragment$onViewCreated$7$7(this.f28782f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ListeningModeFragment$onViewCreated$7$7) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f28781e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = ListeningModeFragment.f28729F0;
            ListeningModeFragment listeningModeFragment = this.f28782f;
            ListeningModeViewModel listeningModeViewModelM10211p0 = listeningModeFragment.m10211p0();
            C43991 c43991 = new C43991(listeningModeFragment, null);
            this.f28781e = 1;
            if (C0062b.m369m0(listeningModeViewModelM10211p0.f28803S, c43991, this) == coroutineSingletons) {
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
