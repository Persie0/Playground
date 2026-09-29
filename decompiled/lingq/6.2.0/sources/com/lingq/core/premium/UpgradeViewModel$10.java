package com.lingq.core.premium;

import android.os.CountDownTimer;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.bja;
import p000.c32;
import p000.uk8;
import p000.wia;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.UpgradeViewModel$10", m4291f = "UpgradeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeViewModel$10 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22387a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1853l f22388b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeViewModel$10(C1853l c1853l, Continuation continuation) {
        super(2, continuation);
        this.f22388b = c1853l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeViewModel$10 upgradeViewModel$10 = new UpgradeViewModel$10(this.f22388b, continuation);
        upgradeViewModel$10.f22387a = obj;
        return upgradeViewModel$10;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UpgradeViewModel$10 upgradeViewModel$10 = (UpgradeViewModel$10) create((String) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        upgradeViewModel$10.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        String str = (String) this.f22387a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1853l c1853l = this.f22388b;
        String str2 = c1853l.f22547k;
        String str3 = str2 == null ? str : str2;
        if (str.length() > 0) {
            DateTime dateTime = new DateTime();
            if (str.equals("special-welcome")) {
                uk8 uk8VarMo8581S = c1853l.f22541e.mo8581S();
                CountDownTimer countDownTimer = c1853l.f22546j;
                if (countDownTimer != null) {
                    countDownTimer.cancel();
                }
                bja bjaVar = new bja(c1853l, dateTime, uk8VarMo8581S, uk8VarMo8581S.f64026c.mo18366b() - dateTime.mo18366b());
                c1853l.f22546j = bjaVar;
                bjaVar.start();
            }
        }
        C3244l c3244l = c1853l.f22544h;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, null, null, false, null, str3, false, null, null, null, false, false, false, null, false, 2097087)));
        return xfa.f68157a;
    }
}
