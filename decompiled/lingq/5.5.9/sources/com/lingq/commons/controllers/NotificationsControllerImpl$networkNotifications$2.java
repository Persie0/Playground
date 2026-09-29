package com.lingq.commons.controllers;

import ci.InterfaceC2018k;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Lno/z;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "com.lingq.commons.controllers.NotificationsControllerImpl$networkNotifications$2", m19206f = "NotificationsController.kt", m19207l = {60, 61}, m19208m = "invokeSuspend")
public final class NotificationsControllerImpl$networkNotifications$2 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f16558e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ NotificationsControllerImpl f16559f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationsControllerImpl$networkNotifications$2(NotificationsControllerImpl notificationsControllerImpl, InterfaceC9968c<? super NotificationsControllerImpl$networkNotifications$2> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f16559f = notificationsControllerImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        return new NotificationsControllerImpl$networkNotifications$2(this.f16559f, interfaceC9968c);
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((NotificationsControllerImpl$networkNotifications$2) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f16558e;
        NotificationsControllerImpl notificationsControllerImpl = this.f16559f;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    C7499b.m14977z0(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C7499b.m14977z0(obj);
                }
                return C9072e.f47360a;
            }
            C7499b.m14977z0(obj);
            InterfaceC2018k interfaceC2018k = notificationsControllerImpl.f16544a;
            String strMo498E1 = notificationsControllerImpl.mo498E1();
            this.f16558e = 1;
            obj = interfaceC2018k.mo6091b(1, strMo498E1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            int iIntValue = ((Number) ((Pair) obj).f38013b).intValue();
            this.f16558e = 2;
            if (notificationsControllerImpl.mo9328D0(iIntValue, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return C9072e.f47360a;
    }
}
