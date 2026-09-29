package com.lingq.feature.reader.old;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.C3386nv;
import p000.c32;
import p000.c83;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$19", m4291f = "ReaderViewModel.kt", m4292l = {DescriptorProtos.Edition.EDITION_PROTO2_VALUE}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$19 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f28847a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f28848b;

    /* JADX INFO: renamed from: com.lingq.feature.reader.old.ReaderViewModel$19$1 */
    @c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$19$1", m4291f = "ReaderViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C23831 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f28849a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2412n f28850b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C23831(C2412n c2412n, Continuation continuation) {
            super(2, continuation);
            this.f28850b = c2412n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C23831 c23831 = new C23831(this.f28850b, continuation);
            c23831.f28849a = obj;
            return c23831;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C23831 c23831 = (C23831) create((InAppNotificationAction) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c23831.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            InAppNotificationAction inAppNotificationAction = (InAppNotificationAction) this.f28849a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            if (inAppNotificationAction == InAppNotificationAction.Reload) {
                this.f28850b.m9336p3(true);
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$19(C2412n c2412n, Continuation continuation) {
        super(2, continuation);
        this.f28848b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$19(this.f28848b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$19) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28847a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f28848b;
            c83 c83VarMo7015o2 = c2412n.f29384m.mo7015o2();
            C23831 c23831 = new C23831(c2412n, null);
            this.f28847a = 1;
            if (AbstractC3224d.m15529h(c83VarMo7015o2, c23831, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        return xfa.f68157a;
    }
}
