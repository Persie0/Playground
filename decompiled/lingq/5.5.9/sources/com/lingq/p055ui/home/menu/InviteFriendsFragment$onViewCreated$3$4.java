package com.lingq.p055ui.home.menu;

import ae.C0062b;
import android.content.Context;
import android.widget.ImageView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.bumptech.glide.ComponentCallbacks2C2080b;
import com.lingq.shared.uimodel.UserReferral;
import com.linguist.R;
import java.util.List;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.collections.C6752c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p007a6.C0034m;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.InviteFriendsFragment$onViewCreated$3$4", m19206f = "InviteFriendsFragment.kt", m19207l = {108}, m19208m = "invokeSuspend")
public final class InviteFriendsFragment$onViewCreated$3$4 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25061e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InviteFriendsFragment f25062f;

    /* JADX INFO: renamed from: com.lingq.ui.home.menu.InviteFriendsFragment$onViewCreated$3$4$1 */
    @Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m13365d2 = {"", "Lcom/lingq/shared/uimodel/UserReferral;", "referrals", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.InviteFriendsFragment$onViewCreated$3$4$1", m19206f = "InviteFriendsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38181 extends SuspendLambda implements InterfaceC2056p<List<? extends UserReferral>, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ Object f25063e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InviteFriendsFragment f25064f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38181(InviteFriendsFragment inviteFriendsFragment, InterfaceC9968c<? super C38181> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25064f = inviteFriendsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38181 c38181 = new C38181(this.f25064f, interfaceC9968c);
            c38181.f25063e = obj;
            return c38181;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(List<? extends UserReferral> list, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38181) mo1336a(list, interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            ImageView imageView;
            UserReferral userReferral;
            String str;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            List list = (List) this.f25063e;
            if (!list.isEmpty()) {
                int size = list.size();
                if (size > 5) {
                    size = 5;
                }
                for (int i10 = 0; i10 < size; i10++) {
                    InviteFriendsFragment inviteFriendsFragment = this.f25064f;
                    if (i10 == 0) {
                        InterfaceC6727j<Object>[] interfaceC6727jArr = InviteFriendsFragment.f25038T0;
                        imageView = inviteFriendsFragment.m9960w0().f44602e;
                    } else if (i10 == 1) {
                        InterfaceC6727j<Object>[] interfaceC6727jArr2 = InviteFriendsFragment.f25038T0;
                        imageView = inviteFriendsFragment.m9960w0().f44603f;
                    } else if (i10 == 2) {
                        InterfaceC6727j<Object>[] interfaceC6727jArr3 = InviteFriendsFragment.f25038T0;
                        imageView = inviteFriendsFragment.m9960w0().f44604g;
                    } else if (i10 == 3) {
                        InterfaceC6727j<Object>[] interfaceC6727jArr4 = InviteFriendsFragment.f25038T0;
                        imageView = inviteFriendsFragment.m9960w0().f44605h;
                    } else if (i10 != 4) {
                        imageView = null;
                    } else {
                        InterfaceC6727j<Object>[] interfaceC6727jArr5 = InviteFriendsFragment.f25038T0;
                        imageView = inviteFriendsFragment.m9960w0().f44606i;
                    }
                    if (imageView != null && (userReferral = (UserReferral) C6752c.m13426T(i10, list)) != null && (str = userReferral.f21630a) != null) {
                        Context contextM3578a0 = inviteFriendsFragment.m3578a0();
                        ComponentCallbacks2C2080b.m6236b(contextM3578a0).m6375f(contextM3578a0).m6259o(str).m12733x(new C0034m(), true).m12722k(R.drawable.ic_invite_friend_placeholder).m6245E(imageView);
                    }
                }
            }
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsFragment$onViewCreated$3$4(InviteFriendsFragment inviteFriendsFragment, InterfaceC9968c<? super InviteFriendsFragment$onViewCreated$3$4> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25062f = inviteFriendsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new InviteFriendsFragment$onViewCreated$3$4(this.f25062f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((InviteFriendsFragment$onViewCreated$3$4) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25061e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = InviteFriendsFragment.f25038T0;
            InviteFriendsFragment inviteFriendsFragment = this.f25062f;
            InviteFriendsViewModel inviteFriendsViewModelM9961x0 = inviteFriendsFragment.m9961x0();
            C38181 c38181 = new C38181(inviteFriendsFragment, null);
            this.f25061e = 1;
            if (C0062b.m369m0(inviteFriendsViewModelM9961x0.f25081J, c38181, this) == coroutineSingletons) {
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
