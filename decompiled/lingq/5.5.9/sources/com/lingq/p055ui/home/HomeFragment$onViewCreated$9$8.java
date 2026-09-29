package com.lingq.p055ui.home;

import ad.AbstractC0057a;
import ad.AbstractC0060d;
import ae.C0062b;
import android.util.SparseArray;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.material.badge.BadgeState;
import com.google.android.material.badge.C2947a;
import com.linguist.R;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$8", m19206f = "HomeFragment.kt", m19207l = {405}, m19208m = "invokeSuspend")
public final class HomeFragment$onViewCreated$9$8 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f22724e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ HomeFragment f22725f;

    /* JADX INFO: renamed from: com.lingq.ui.home.HomeFragment$onViewCreated$9$8$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "unreadNotifications", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.HomeFragment$onViewCreated$9$8$1", m19206f = "HomeFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C34751 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f22726e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ HomeFragment f22727f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C34751(HomeFragment homeFragment, InterfaceC9968c<? super C34751> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f22727f = homeFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C34751 c34751 = new C34751(this.f22727f, interfaceC9968c);
            c34751.f22726e = ((Number) obj).intValue();
            return c34751;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C34751) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f22726e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
            AbstractC0060d abstractC0060d = this.f22727f.m9769r0().f45267a.f15422b;
            abstractC0060d.getClass();
            int[] iArr = AbstractC0060d.f111b0;
            SparseArray<C2947a> sparseArray = abstractC0060d.f118M;
            C2947a c2947a = sparseArray.get(R.id.nav_graph_more);
            AbstractC0057a abstractC0057a = null;
            if (c2947a == null) {
                C2947a c2947a2 = new C2947a(abstractC0060d.getContext(), null);
                sparseArray.put(R.id.nav_graph_more, c2947a2);
                c2947a = c2947a2;
            }
            AbstractC0057a[] abstractC0057aArr = abstractC0060d.f135f;
            if (abstractC0057aArr == null) {
                break;
                break;
            }
            int length = abstractC0057aArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                }
                AbstractC0057a abstractC0057a2 = abstractC0057aArr[i11];
                if (abstractC0057a2.getId() == R.id.nav_graph_more) {
                    abstractC0057a = abstractC0057a2;
                    break;
                }
                i11++;
            }
            if (abstractC0057a != null) {
                abstractC0057a.setBadge(c2947a);
            }
            BadgeState badgeState = c2947a.f14760e;
            if (i10 <= 0) {
                Boolean bool = Boolean.FALSE;
                badgeState.f14720a.f14736L = bool;
                badgeState.f14721b.f14736L = bool;
                c2947a.setVisible(bool.booleanValue(), false);
            } else {
                Boolean bool2 = Boolean.TRUE;
                badgeState.f14720a.f14736L = bool2;
                badgeState.f14721b.f14736L = bool2;
                c2947a.setVisible(bool2.booleanValue(), false);
                int iMax = Math.max(0, i10);
                BadgeState badgeState2 = c2947a.f14760e;
                BadgeState.State state = badgeState2.f14721b;
                if (state.f14752j != iMax) {
                    badgeState2.f14720a.f14752j = iMax;
                    state.f14752j = iMax;
                    c2947a.f14758c.f52042d = true;
                    c2947a.m8578g();
                    c2947a.m8580i();
                    c2947a.invalidateSelf();
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeFragment$onViewCreated$9$8(HomeFragment homeFragment, InterfaceC9968c<? super HomeFragment$onViewCreated$9$8> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f22725f = homeFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new HomeFragment$onViewCreated$9$8(this.f22725f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((HomeFragment$onViewCreated$9$8) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f22724e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = HomeFragment.f22653M0;
            HomeFragment homeFragment = this.f22725f;
            InterfaceC7142w<Integer> interfaceC7142wMo9327C1 = homeFragment.m9770s0().mo9327C1();
            C34751 c34751 = new C34751(homeFragment, null);
            this.f22724e = 1;
            if (C0062b.m369m0(interfaceC7142wMo9327C1, c34751, this) == coroutineSingletons) {
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
