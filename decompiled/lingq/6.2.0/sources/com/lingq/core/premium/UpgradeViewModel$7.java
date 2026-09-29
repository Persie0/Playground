package com.lingq.core.premium;

import android.os.CountDownTimer;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import org.joda.time.DateTime;
import p000.c32;
import p000.cja;
import p000.f0a;
import p000.h0a;
import p000.rm5;
import p000.sm5;
import p000.up6;
import p000.ux5;
import p000.vk8;
import p000.vk9;
import p000.wia;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.premium.UpgradeViewModel$7", m4291f = "UpgradeViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class UpgradeViewModel$7 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f22404a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1853l f22405b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpgradeViewModel$7(C1853l c1853l, Continuation continuation) {
        super(2, continuation);
        this.f22405b = c1853l;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UpgradeViewModel$7 upgradeViewModel$7 = new UpgradeViewModel$7(this.f22405b, continuation);
        upgradeViewModel$7.f22404a = obj;
        return upgradeViewModel$7;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        UpgradeViewModel$7 upgradeViewModel$7 = (UpgradeViewModel$7) create((up6) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        upgradeViewModel$7.invokeSuspend(xfaVar);
        return xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0072 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:8:0x005f, B:13:0x006a, B:19:0x007a, B:24:0x0084, B:28:0x008d, B:32:0x00d3, B:33:0x00d6, B:37:0x0111, B:38:0x0114, B:16:0x0072), top: B:49:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0083  */
    /* JADX WARN: Code duplicated, block: B:26:0x0088  */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d3 A[Catch: Exception -> 0x006f, TRY_ENTER, TryCatch #0 {Exception -> 0x006f, blocks: (B:8:0x005f, B:13:0x006a, B:19:0x007a, B:24:0x0084, B:28:0x008d, B:32:0x00d3, B:33:0x00d6, B:37:0x0111, B:38:0x0114, B:16:0x0072), top: B:49:0x005f }] */
    /* JADX WARN: Code duplicated, block: B:36:0x010f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x0111 A[Catch: Exception -> 0x006f, TryCatch #0 {Exception -> 0x006f, blocks: (B:8:0x005f, B:13:0x006a, B:19:0x007a, B:24:0x0084, B:28:0x008d, B:32:0x00d3, B:33:0x00d6, B:37:0x0111, B:38:0x0114, B:16:0x0072), top: B:49:0x005f }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1853l c1853l;
        up6 up6Var;
        Object value;
        DateTime dateTimeM18332e;
        boolean z;
        String str;
        CountDownTimer countDownTimer;
        Object value2;
        up6 up6Var2 = (up6) this.f22404a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        C1853l c1853l2 = this.f22405b;
        C3244l c3244l = c1853l2.f22544h;
        while (true) {
            Object value3 = c3244l.getValue();
            c1853l = c1853l2;
            up6Var = up6Var2;
            if (c3244l.m15570h(value3, wia.m23988a((wia) value3, null, null, null, false, null, null, false, null, null, null, false, false, false, up6Var2, false, 1835007))) {
                break;
            }
            c1853l2 = c1853l;
            up6Var2 = up6Var;
        }
        if (up6Var != null) {
            String str2 = up6Var.f64175c;
            String str3 = up6Var.f64179g;
            String str4 = up6Var.f64180h;
            DateTime dateTime = new DateTime();
            boolean z2 = up6Var.f64182j;
            boolean z3 = up6Var.f64181i;
            if (str4 != null) {
                try {
                    String str5 = !vk9.m23391n0(str4) ? str4 : null;
                    if (str5 != null) {
                        dateTimeM18332e = DateTime.m18332e(str5);
                    } else {
                        dateTimeM18332e = DateTime.m18332e(str3);
                    }
                    if (z3 || z2 || !dateTime.m22364c(dateTimeM18332e)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    rm5 rm5Var = sm5.Companion;
                    if (z) {
                        str = "hidden";
                    } else {
                        str = "running";
                    }
                    rm5Var.getClass();
                    h0a.f41641a.mo11430a("[Offers] startTimerForOffer code=" + str2 + " enabled=" + z3 + " ended=" + z2 + " target=" + dateTimeM18332e + " now=" + dateTime + " → " + str, new Object[0]);
                    countDownTimer = c1853l.f22546j;
                    if (z) {
                        if (countDownTimer != null) {
                            countDownTimer.cancel();
                        }
                        do {
                            value2 = c3244l.getValue();
                        } while (!c3244l.m15570h(value2, wia.m23988a((wia) value2, null, null, null, false, new vk8(0, 0, 0, 0, 15), null, false, null, null, null, false, false, false, null, false, 2097135)));
                    } else {
                        if (countDownTimer != null) {
                            countDownTimer.cancel();
                        }
                        cja cjaVar = new cja(c1853l, dateTimeM18332e, dateTimeM18332e.mo18366b() - dateTime.mo18366b());
                        c1853l.f22546j = cjaVar;
                        cjaVar.start();
                    }
                } catch (Exception e) {
                    rm5 rm5Var2 = sm5.Companion;
                    StringBuilder sbM23000w = ux5.m23000w("[Offers] startTimerForOffer parse failed code=", str2, " dateCountdown=", str4, " dateEnd=");
                    sbM23000w.append(str3);
                    String string = sbM23000w.toString();
                    rm5Var2.getClass();
                    f0a f0aVar = h0a.f41641a;
                    f0aVar.mo11431b(string, new Object[0]);
                    f0aVar.mo11432c(e);
                }
            } else {
                dateTimeM18332e = DateTime.m18332e(str3);
                if (z3) {
                    z = true;
                } else {
                    z = true;
                }
                rm5 rm5Var3 = sm5.Companion;
                if (z) {
                    str = "hidden";
                } else {
                    str = "running";
                }
                rm5Var3.getClass();
                h0a.f41641a.mo11430a("[Offers] startTimerForOffer code=" + str2 + " enabled=" + z3 + " ended=" + z2 + " target=" + dateTimeM18332e + " now=" + dateTime + " → " + str, new Object[0]);
                countDownTimer = c1853l.f22546j;
                if (z) {
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    do {
                        value2 = c3244l.getValue();
                    } while (!c3244l.m15570h(value2, wia.m23988a((wia) value2, null, null, null, false, new vk8(0, 0, 0, 0, 15), null, false, null, null, null, false, false, false, null, false, 2097135)));
                } else {
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    cja cjaVar2 = new cja(c1853l, dateTimeM18332e, dateTimeM18332e.mo18366b() - dateTime.mo18366b());
                    c1853l.f22546j = cjaVar2;
                    cjaVar2.start();
                }
            }
        } else {
            CountDownTimer countDownTimer2 = c1853l.f22546j;
            if (countDownTimer2 != null) {
                countDownTimer2.cancel();
            }
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, wia.m23988a((wia) value, null, null, null, false, new vk8(0, 0, 0, 0, 15), null, false, null, null, null, false, false, false, null, false, 2097135)));
        }
        return xfa.f68157a;
    }
}
