package com.lingq.p055ui.home.menu;

import ae.C0062b;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.linguist.R;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p225kk.C6716m;
import p260m8.C7499b;
import p338qd.C8573r0;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.MoreFragment$onViewCreated$3$3", m19206f = "MoreFragment.kt", m19207l = {149}, m19208m = "invokeSuspend")
public final class MoreFragment$onViewCreated$3$3 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25123e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MoreFragment f25124f;

    /* JADX INFO: renamed from: com.lingq.ui.home.menu.MoreFragment$onViewCreated$3$3$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "url", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.MoreFragment$onViewCreated$3$3$1", m19206f = "MoreFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38261 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25125e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ MoreFragment f25126f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38261(MoreFragment moreFragment, InterfaceC9968c<? super C38261> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25126f = moreFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38261 c38261 = new C38261(this.f25126f, interfaceC9968c);
            c38261.f25125e = obj;
            return c38261;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38261) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f25125e;
            List<Integer> list = C6716m.f37937a;
            MoreFragment moreFragment = this.f25126f;
            C6716m.m13329n(moreFragment.m3578a0(), str, new Integer(R.string.lingq_grammar_resource), C8573r0.m16725g0(moreFragment));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreFragment$onViewCreated$3$3(MoreFragment moreFragment, InterfaceC9968c<? super MoreFragment$onViewCreated$3$3> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25124f = moreFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new MoreFragment$onViewCreated$3$3(this.f25124f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((MoreFragment$onViewCreated$3$3) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25123e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
            MoreFragment moreFragment = this.f25124f;
            MoreViewModel moreViewModelM9963o0 = moreFragment.m9963o0();
            C38261 c38261 = new C38261(moreFragment, null);
            this.f25123e = 1;
            if (C0062b.m369m0(moreViewModelM9963o0.f25147g, c38261, this) == coroutineSingletons) {
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
