package com.lingq.p055ui.home.menu;

import ae.C0062b;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.lingq.util.C4924a;
import dm.C5207g;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7142w;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.MoreFragment$onViewCreated$3$5", m19206f = "MoreFragment.kt", m19207l = {170}, m19208m = "invokeSuspend")
public final class MoreFragment$onViewCreated$3$5 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25131e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ MoreFragment f25132f;

    /* JADX INFO: renamed from: com.lingq.ui.home.menu.MoreFragment$onViewCreated$3$5$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "unreadNotifications", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.MoreFragment$onViewCreated$3$5$1", m19206f = "MoreFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38281 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f25133e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ MoreFragment f25134f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38281(MoreFragment moreFragment, InterfaceC9968c<? super C38281> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25134f = moreFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38281 c38281 = new C38281(this.f25134f, interfaceC9968c);
            c38281.f25133e = ((Number) obj).intValue();
            return c38281;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38281) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f25133e;
            MoreFragment moreFragment = this.f25134f;
            if (i10 <= 0) {
                InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
                TextView textView = moreFragment.m9962n0().f45418b;
                C5207g.m11110e(textView, "binding.tvUnreadNotifications");
                C4924a.m10442U(textView);
            } else {
                InterfaceC6727j<Object>[] interfaceC6727jArr2 = MoreFragment.f25104E0;
                TextView textView2 = moreFragment.m9962n0().f45418b;
                C5207g.m11110e(textView2, "binding.tvUnreadNotifications");
                C4924a.m10457e0(textView2);
                moreFragment.m9962n0().f45418b.setText(String.valueOf(i10));
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MoreFragment$onViewCreated$3$5(MoreFragment moreFragment, InterfaceC9968c<? super MoreFragment$onViewCreated$3$5> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25132f = moreFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new MoreFragment$onViewCreated$3$5(this.f25132f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((MoreFragment$onViewCreated$3$5) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25131e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = MoreFragment.f25104E0;
            MoreFragment moreFragment = this.f25132f;
            InterfaceC7142w<Integer> interfaceC7142wMo9327C1 = moreFragment.m9963o0().mo9327C1();
            C38281 c38281 = new C38281(moreFragment, null);
            this.f25131e = 1;
            if (C0062b.m369m0(interfaceC7142wMo9327C1, c38281, this) == coroutineSingletons) {
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
