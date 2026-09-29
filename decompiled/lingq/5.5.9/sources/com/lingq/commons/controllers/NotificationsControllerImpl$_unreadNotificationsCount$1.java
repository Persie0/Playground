package com.lingq.commons.controllers;

import cm.InterfaceC2057q;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC7117d;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u00020\u0005*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002H\u008a@"}, m13365d2 = {"Lkotlinx/coroutines/flow/d;", "", "", "", "it", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.NotificationsControllerImpl$_unreadNotificationsCount$1", m19206f = "NotificationsController.kt", m19207l = {39}, m19208m = "invokeSuspend")
final class NotificationsControllerImpl$_unreadNotificationsCount$1 extends SuspendLambda implements InterfaceC2057q<InterfaceC7117d<? super Integer>, Map<String, ? extends Integer>, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f16550e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ InterfaceC7117d f16551f;

    /* JADX INFO: renamed from: g */
    public /* synthetic */ Map f16552g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ NotificationsControllerImpl f16553h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsControllerImpl$_unreadNotificationsCount$1(NotificationsControllerImpl notificationsControllerImpl, InterfaceC9968c<? super NotificationsControllerImpl$_unreadNotificationsCount$1> interfaceC9968c) {
        super(3, interfaceC9968c);
        this.f16553h = notificationsControllerImpl;
    }

    @Override // cm.InterfaceC2057q
    /* JADX INFO: renamed from: M */
    public final Object mo1343M(InterfaceC7117d<? super Integer> interfaceC7117d, Map<String, ? extends Integer> map, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        NotificationsControllerImpl$_unreadNotificationsCount$1 notificationsControllerImpl$_unreadNotificationsCount$1 = new NotificationsControllerImpl$_unreadNotificationsCount$1(this.f16553h, interfaceC9968c);
        notificationsControllerImpl$_unreadNotificationsCount$1.f16551f = interfaceC7117d;
        notificationsControllerImpl$_unreadNotificationsCount$1.f16552g = map;
        return notificationsControllerImpl$_unreadNotificationsCount$1.mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f16550e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            InterfaceC7117d interfaceC7117d = this.f16551f;
            Object obj2 = this.f16552g.get(this.f16553h.mo498E1());
            this.f16551f = null;
            this.f16550e = 1;
            if (interfaceC7117d.mo1339r(obj2, this) == coroutineSingletons) {
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
