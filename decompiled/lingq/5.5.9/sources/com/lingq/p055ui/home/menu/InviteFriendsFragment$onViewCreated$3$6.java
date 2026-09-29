package com.lingq.p055ui.home.menu;

import ae.C0062b;
import android.content.Intent;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
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
@InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.InviteFriendsFragment$onViewCreated$3$6", m19206f = "InviteFriendsFragment.kt", m19207l = {149}, m19208m = "invokeSuspend")
public final class InviteFriendsFragment$onViewCreated$3$6 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25069e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InviteFriendsFragment f25070f;

    /* JADX INFO: renamed from: com.lingq.ui.home.menu.InviteFriendsFragment$onViewCreated$3$6$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "referralLink", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.InviteFriendsFragment$onViewCreated$3$6$1", m19206f = "InviteFriendsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38201 extends SuspendLambda implements InterfaceC2056p<String, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25071e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InviteFriendsFragment f25072f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38201(InviteFriendsFragment inviteFriendsFragment, InterfaceC9968c<? super C38201> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25072f = inviteFriendsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38201 c38201 = new C38201(this.f25072f, interfaceC9968c);
            c38201.f25071e = obj;
            return c38201;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38201) mo1336a(str, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            String str = (String) this.f25071e;
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", str);
            intent.setType("text/plain");
            this.f25072f.m3595l0(Intent.createChooser(intent, null));
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsFragment$onViewCreated$3$6(InviteFriendsFragment inviteFriendsFragment, InterfaceC9968c<? super InviteFriendsFragment$onViewCreated$3$6> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25070f = inviteFriendsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new InviteFriendsFragment$onViewCreated$3$6(this.f25070f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((InviteFriendsFragment$onViewCreated$3$6) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25069e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = InviteFriendsFragment.f25038T0;
            InviteFriendsFragment inviteFriendsFragment = this.f25070f;
            InviteFriendsViewModel inviteFriendsViewModelM9961x0 = inviteFriendsFragment.m9961x0();
            C38201 c38201 = new C38201(inviteFriendsFragment, null);
            this.f25069e = 1;
            if (C0062b.m369m0(inviteFriendsViewModelM9961x0.f25089k, c38201, this) == coroutineSingletons) {
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
