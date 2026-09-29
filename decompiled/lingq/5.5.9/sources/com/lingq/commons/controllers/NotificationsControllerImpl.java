package com.lingq.commons.controllers;

import ae.C0062b;
import ci.InterfaceC2018k;
import com.lingq.shared.domain.Profile;
import com.lingq.shared.domain.ProfileAccount;
import com.lingq.shared.uimodel.language.UserLanguage;
import dm.C5207g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C6753d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.C7135p;
import kotlinx.coroutines.flow.FlowKt__ReduceKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.InterfaceC7116c;
import kotlinx.coroutines.flow.InterfaceC7142w;
import kotlinx.coroutines.scheduling.ExecutorC7177a;
import no.C7828f;
import no.InterfaceC7882z;
import p015ak.InterfaceC0113j;
import p076di.InterfaceC5182d;
import p225kk.C6715l;
import p244lh.InterfaceC7368e;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
public final class NotificationsControllerImpl implements InterfaceC7368e, InterfaceC0113j {

    /* JADX INFO: renamed from: a */
    public final InterfaceC2018k f16544a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC5182d f16545b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC7882z f16546c;

    /* JADX INFO: renamed from: d */
    public final CoroutineDispatcher f16547d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC0113j f16548e;

    /* JADX INFO: renamed from: f */
    public final C7135p f16549f;

    public NotificationsControllerImpl(InterfaceC2018k interfaceC2018k, InterfaceC5182d interfaceC5182d, InterfaceC0113j interfaceC0113j, InterfaceC7882z interfaceC7882z, ExecutorC7177a executorC7177a) {
        C5207g.m11111f(interfaceC2018k, "notificationRepository");
        C5207g.m11111f(interfaceC5182d, "utilStore");
        C5207g.m11111f(interfaceC0113j, "userSessionViewModelDelegate");
        C5207g.m11111f(interfaceC7882z, "coroutineScope");
        this.f16544a = interfaceC2018k;
        this.f16545b = interfaceC5182d;
        this.f16546c = interfaceC7882z;
        this.f16547d = executorC7177a;
        this.f16548e = interfaceC0113j;
        this.f16549f = C0062b.m353h2(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(C0062b.m399t2(interfaceC5182d.mo9678b(), new NotificationsControllerImpl$_unreadNotificationsCount$1(this, null))), interfaceC7882z, C6715l.f37936a, 0);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B */
    public final InterfaceC7142w<List<UserLanguage>> mo496B() {
        return this.f16548e.mo496B();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: B0 */
    public final Object mo497B0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16548e.mo497B0(interfaceC9968c);
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: C1 */
    public final InterfaceC7142w<Integer> mo9327C1() {
        return this.f16549f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: D0 */
    public final Object mo9328D0(int i10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        NotificationsControllerImpl$updateUnreadNotifications$1 notificationsControllerImpl$updateUnreadNotifications$1;
        NotificationsControllerImpl notificationsControllerImpl;
        if (interfaceC9968c instanceof NotificationsControllerImpl$updateUnreadNotifications$1) {
            notificationsControllerImpl$updateUnreadNotifications$1 = (NotificationsControllerImpl$updateUnreadNotifications$1) interfaceC9968c;
            int i11 = notificationsControllerImpl$updateUnreadNotifications$1.f16564h;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                notificationsControllerImpl$updateUnreadNotifications$1.f16564h = i11 - Integer.MIN_VALUE;
            } else {
                notificationsControllerImpl$updateUnreadNotifications$1 = new NotificationsControllerImpl$updateUnreadNotifications$1(this, interfaceC9968c);
            }
        } else {
            notificationsControllerImpl$updateUnreadNotifications$1 = new NotificationsControllerImpl$updateUnreadNotifications$1(this, interfaceC9968c);
        }
        Object objM14360a = notificationsControllerImpl$updateUnreadNotifications$1.f16562f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i12 = notificationsControllerImpl$updateUnreadNotifications$1.f16564h;
        if (i12 != 0) {
            if (i12 == 1) {
                i10 = notificationsControllerImpl$updateUnreadNotifications$1.f16561e;
                notificationsControllerImpl = notificationsControllerImpl$updateUnreadNotifications$1.f16560d;
                C7499b.m14977z0(objM14360a);
            } else {
                if (i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM14360a);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM14360a);
        InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9678b = this.f16545b.mo9678b();
        notificationsControllerImpl$updateUnreadNotifications$1.f16560d = this;
        notificationsControllerImpl$updateUnreadNotifications$1.f16561e = i10;
        notificationsControllerImpl$updateUnreadNotifications$1.f16564h = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9678b, notificationsControllerImpl$updateUnreadNotifications$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        notificationsControllerImpl = this;
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
        linkedHashMapM13467T0.put(notificationsControllerImpl.mo498E1(), new Integer(i10));
        Map mapM13465R0 = C6753d.m13465R0(linkedHashMapM13467T0);
        notificationsControllerImpl$updateUnreadNotifications$1.f16560d = null;
        notificationsControllerImpl$updateUnreadNotifications$1.f16564h = 2;
        if (notificationsControllerImpl.f16545b.mo9687k(mapM13465R0, notificationsControllerImpl$updateUnreadNotifications$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: E1 */
    public final String mo498E1() {
        return this.f16548e.mo498E1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: J */
    public final Object mo499J(Profile profile, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16548e.mo499J(profile, interfaceC9968c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: O */
    public final Object mo9329O(InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        NotificationsControllerImpl$clearNotifications$1 notificationsControllerImpl$clearNotifications$1;
        NotificationsControllerImpl notificationsControllerImpl;
        if (interfaceC9968c instanceof NotificationsControllerImpl$clearNotifications$1) {
            notificationsControllerImpl$clearNotifications$1 = (NotificationsControllerImpl$clearNotifications$1) interfaceC9968c;
            int i10 = notificationsControllerImpl$clearNotifications$1.f16557g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                notificationsControllerImpl$clearNotifications$1.f16557g = i10 - Integer.MIN_VALUE;
            } else {
                notificationsControllerImpl$clearNotifications$1 = new NotificationsControllerImpl$clearNotifications$1(this, interfaceC9968c);
            }
        } else {
            notificationsControllerImpl$clearNotifications$1 = new NotificationsControllerImpl$clearNotifications$1(this, interfaceC9968c);
        }
        Object objM14360a = notificationsControllerImpl$clearNotifications$1.f16555e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = notificationsControllerImpl$clearNotifications$1.f16557g;
        if (i11 != 0) {
            if (i11 == 1) {
                notificationsControllerImpl = notificationsControllerImpl$clearNotifications$1.f16554d;
                C7499b.m14977z0(objM14360a);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objM14360a);
            }
            return C9072e.f47360a;
        }
        C7499b.m14977z0(objM14360a);
        InterfaceC7116c<Map<String, Integer>> interfaceC7116cMo9678b = this.f16545b.mo9678b();
        notificationsControllerImpl$clearNotifications$1.f16554d = this;
        notificationsControllerImpl$clearNotifications$1.f16557g = 1;
        objM14360a = FlowKt__ReduceKt.m14360a(interfaceC7116cMo9678b, notificationsControllerImpl$clearNotifications$1);
        if (objM14360a == coroutineSingletons) {
            return coroutineSingletons;
        }
        notificationsControllerImpl = this;
        LinkedHashMap linkedHashMapM13467T0 = C6753d.m13467T0((Map) objM14360a);
        linkedHashMapM13467T0.put(notificationsControllerImpl.mo498E1(), new Integer(0));
        Map mapM13465R0 = C6753d.m13465R0(linkedHashMapM13467T0);
        notificationsControllerImpl$clearNotifications$1.f16554d = null;
        notificationsControllerImpl$clearNotifications$1.f16557g = 2;
        if (notificationsControllerImpl.f16545b.mo9687k(mapM13465R0, notificationsControllerImpl$clearNotifications$1) == coroutineSingletons) {
            return coroutineSingletons;
        }
        return C9072e.f47360a;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: P */
    public final InterfaceC7142w<List<String>> mo500P() {
        return this.f16548e.mo500P();
    }

    @Override // p244lh.InterfaceC7368e
    /* JADX INFO: renamed from: Q0 */
    public final Object mo9330Q0(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        C7828f.m15570d(this.f16546c, this.f16547d, null, new NotificationsControllerImpl$networkNotifications$2(this, null), 2);
        return C9072e.f47360a;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: d */
    public final Object mo501d(String str, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16548e.mo501d(str, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f0 */
    public final boolean mo502f0() {
        InterfaceC0113j interfaceC0113j = this.f16548e;
        return true;
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: f1 */
    public final Object mo503f1(InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16548e.mo503f1(interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: j1 */
    public final InterfaceC7116c<Profile> mo504j1() {
        return this.f16548e.mo504j1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l0 */
    public final Object mo505l0(ProfileAccount profileAccount, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return this.f16548e.mo505l0(profileAccount, interfaceC9968c);
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: l1 */
    public final boolean mo506l1() {
        return this.f16548e.mo506l1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: p1 */
    public final String mo507p1() {
        return this.f16548e.mo507p1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: t1 */
    public final InterfaceC7116c<ProfileAccount> mo508t1() {
        return this.f16548e.mo508t1();
    }

    @Override // p015ak.InterfaceC0113j
    /* JADX INFO: renamed from: w0 */
    public final InterfaceC7142w<UserLanguage> mo509w0() {
        return this.f16548e.mo509w0();
    }
}
