package com.lingq.p055ui.home.menu;

import ae.C0062b;
import android.widget.TextView;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.Locale;
import km.InterfaceC6727j;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p003a2.C0009a;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.InviteFriendsFragment$onViewCreated$3$1", m19206f = "InviteFriendsFragment.kt", m19207l = {ModuleDescriptor.MODULE_VERSION}, m19208m = "invokeSuspend")
public final class InviteFriendsFragment$onViewCreated$3$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f25049e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InviteFriendsFragment f25050f;

    /* JADX INFO: renamed from: com.lingq.ui.home.menu.InviteFriendsFragment$onViewCreated$3$1$1 */
    @Metadata(m13364d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@"}, m13365d2 = {"", "points", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
    @InterfaceC10224c(m19205c = "com.lingq.ui.home.menu.InviteFriendsFragment$onViewCreated$3$1$1", m19206f = "InviteFriendsFragment.kt", m19207l = {}, m19208m = "invokeSuspend")
    public static final class C38151 extends SuspendLambda implements InterfaceC2056p<Integer, InterfaceC9968c<? super C9072e>, Object> {

        /* JADX INFO: renamed from: e */
        public /* synthetic */ int f25051e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ InviteFriendsFragment f25052f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C38151(InviteFriendsFragment inviteFriendsFragment, InterfaceC9968c<? super C38151> interfaceC9968c) {
            super(2, interfaceC9968c);
            this.f25052f = inviteFriendsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: a */
        public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
            C38151 c38151 = new C38151(this.f25052f, interfaceC9968c);
            c38151.f25051e = ((Number) obj).intValue();
            return c38151;
        }

        @Override // cm.InterfaceC2056p
        /* JADX INFO: renamed from: m0 */
        public final Object mo1337m0(Integer num, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            return ((C38151) mo1336a(Integer.valueOf(num.intValue()), interfaceC9968c)).mo1338x(C9072e.f47360a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /* JADX INFO: renamed from: x */
        public final Object mo1338x(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            C7499b.m14977z0(obj);
            int i10 = this.f25051e;
            InterfaceC6727j<Object>[] interfaceC6727jArr = InviteFriendsFragment.f25038T0;
            TextView textView = this.f25052f.m9960w0().f44608k;
            C0009a.m32u(new Object[]{new Integer(i10)}, 1, Locale.getDefault(), "%d", "format(locale, format, *args)", textView);
            return C9072e.f47360a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InviteFriendsFragment$onViewCreated$3$1(InviteFriendsFragment inviteFriendsFragment, InterfaceC9968c<? super InviteFriendsFragment$onViewCreated$3$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f25050f = inviteFriendsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new InviteFriendsFragment$onViewCreated$3$1(this.f25050f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((InviteFriendsFragment$onViewCreated$3$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f25049e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC6727j<Object>[] interfaceC6727jArr = InviteFriendsFragment.f25038T0;
            InviteFriendsFragment inviteFriendsFragment = this.f25050f;
            InviteFriendsViewModel inviteFriendsViewModelM9961x0 = inviteFriendsFragment.m9961x0();
            C38151 c38151 = new C38151(inviteFriendsFragment, null);
            this.f25049e = 1;
            if (C0062b.m369m0(inviteFriendsViewModelM9961x0.f25079H, c38151, this) == coroutineSingletons) {
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
