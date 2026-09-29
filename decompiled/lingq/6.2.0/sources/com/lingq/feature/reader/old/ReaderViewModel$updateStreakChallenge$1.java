package com.lingq.feature.reader.old;

import com.lingq.core.data.profile.C1267a;
import com.lingq.core.datastore.C1368a;
import com.lingq.core.domain.model.notification.InAppNotificationType;
import com.lingq.core.domain.model.user.ProfileSettings;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.h24;
import p000.km7;
import p000.si7;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$updateStreakChallenge$1", m4291f = "ReaderViewModel.kt", m4292l = {2740, 2741}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$updateStreakChallenge$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29162a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29163b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f29164c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$updateStreakChallenge$1(C2412n c2412n, int i, Continuation continuation) {
        super(2, continuation);
        this.f29163b = c2412n;
        this.f29164c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$updateStreakChallenge$1(this.f29163b, this.f29164c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$updateStreakChallenge$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00b8, code lost:
    
        if (r4 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29162a;
        xfa xfaVar = xfa.f68157a;
        int i2 = this.f29164c;
        C2412n c2412n = this.f29163b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            si7 si7Var = c2412n.f29271E;
            this.f29162a = 1;
            if (((C1368a) si7Var).m7912y(true, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            AbstractC3193b.m15359b(obj);
        } else {
            if (i != 2) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        if (i2 > 0) {
            h24 h24Var = new h24(InAppNotificationType.StreakChallenge, null, new Integer(i2), 14);
            c2412n.getClass();
            c2412n.f29384m.mo7013g1(h24Var);
        }
        return xfaVar;
        km7 km7Var = c2412n.f29418x;
        ProfileSettings profileSettings = new ProfileSettings(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Integer(i2), null, null, null, null, null, null, -1, -1, 16775167);
        this.f29162a = 2;
        ((C1267a) km7Var).m7061B(profileSettings);
    }
}
