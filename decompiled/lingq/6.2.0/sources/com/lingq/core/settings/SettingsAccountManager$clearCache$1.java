package com.lingq.core.settings;

import android.content.Context;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.player.C1808b;
import java.io.File;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3156jq;
import p000.C3386nv;
import p000.c32;
import p000.k09;
import p000.ldd;
import p000.mb1;
import p000.nn1;
import p000.ob1;
import p000.un1;
import p000.xd7;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsAccountManager$clearCache$1", m4291f = "SettingsAccountManager.kt", m4292l = {69, 70}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsAccountManager$clearCache$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22635a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ k09 f22636b;

    /* JADX INFO: renamed from: com.lingq.core.settings.SettingsAccountManager$clearCache$1$1 */
    @c32(m4290c = "com.lingq.core.settings.SettingsAccountManager$clearCache$1$1", m4291f = "SettingsAccountManager.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C18561 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ k09 f22637a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18561(k09 k09Var, Continuation continuation) {
            super(2, continuation);
            this.f22637a = k09Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C18561(this.f22637a, continuation);
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) {
            return ((C18561) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            mb1 mb1Var = ob1.Companion;
            Context context = this.f22637a.f46505a;
            mb1Var.getClass();
            ArrayList<File> arrayListM16141a = ldd.m16141a(mb1.m16743c(context));
            if (arrayListM16141a == null) {
                return null;
            }
            for (File file : arrayListM16141a) {
                if (file.exists()) {
                    file.delete();
                }
            }
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsAccountManager$clearCache$1(k09 k09Var, Continuation continuation) {
        super(2, continuation);
        this.f22636b = k09Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsAccountManager$clearCache$1(this.f22636b, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsAccountManager$clearCache$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (p000.wfb.m23905G(r1, r8, r7) == r0) goto L18;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22635a;
        xfa xfaVar = xfa.f68157a;
        k09 k09Var = this.f22636b;
        if (i != 0) {
            if (i == 1) {
                AbstractC3193b.m15359b(obj);
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(obj);
            }
            k09Var.m14759a();
            return xfaVar;
        }
        AbstractC3193b.m15359b(obj);
        C3156jq c3156jq = k09Var.f46513i;
        this.f22635a = 1;
        C1808b c1808b = (C1808b) c3156jq.f45990a;
        c1808b.m8447J();
        c1808b.m8450M(false);
        Object objM7347g = ((C1302r) ((xd7) c3156jq.f45991b)).m7347g(this);
        if (objM7347g != coroutineSingletons) {
            objM7347g = xfaVar;
        }
        if (objM7347g != coroutineSingletons) {
        }
        return coroutineSingletons;
        nn1 nn1Var = k09Var.f46507c;
        C18561 c18561 = new C18561(k09Var, null);
        this.f22635a = 2;
    }
}
