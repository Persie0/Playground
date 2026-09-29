package com.lingq.core.settings;

import com.lingq.core.domain.language.C1378b;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.C3386nv;
import p000.c32;
import p000.fa4;
import p000.gm5;
import p000.jz1;
import p000.kz1;
import p000.lz1;
import p000.mz1;
import p000.rz8;
import p000.sz8;
import p000.tz8;
import p000.un1;
import p000.uz8;
import p000.vz8;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.settings.SettingsViewModel$saveDailyStreakTarget$3", m4291f = "SettingsViewModel.kt", m4292l = {362}, m4293m = "invokeSuspend", m4294v = 2)
final class SettingsViewModel$saveDailyStreakTarget$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f22697a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1873e f22698b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ jz1 f22699c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$saveDailyStreakTarget$3(C1873e c1873e, jz1 jz1Var, Continuation continuation) {
        super(2, continuation);
        this.f22698b = c1873e;
        this.f22699c = jz1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SettingsViewModel$saveDailyStreakTarget$3(this.f22698b, this.f22699c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingsViewModel$saveDailyStreakTarget$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        kz1 kz1VarM15733a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f22697a;
        C1873e c1873e = this.f22698b;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C1378b c1378b = c1873e.f22968h;
            String strMo4589b2 = c1873e.f22962b.mo4589b2();
            this.f22697a = 1;
            obj = c1378b.m7985b(strMo4589b2, this.f22699c, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        vz8 vz8Var = (vz8) obj;
        C3244l c3244l = c1873e.f22978r;
        do {
            value = c3244l.getValue();
            kz1 kz1Var = (kz1) value;
            if (fa4.m11650l(vz8Var, uz8.f64625a)) {
                kz1VarM15733a = kz1.m15733a(kz1Var, null, null, false, null, 1);
            } else if (fa4.m11650l(vz8Var, sz8.f61678a)) {
                kz1VarM15733a = kz1.m15733a(kz1Var, null, null, false, new mz1(R$string.settings_daily_streak_target_invalid), 2);
            } else if (vz8Var instanceof tz8) {
                kz1VarM15733a = kz1.m15733a(kz1Var, null, null, false, new lz1(((tz8) vz8Var).f63149a), 2);
            } else {
                if (!(vz8Var instanceof rz8)) {
                    gm5.m12750e();
                    return null;
                }
                kz1VarM15733a = kz1.m15733a(kz1Var, null, null, false, new mz1(R$string.settings_daily_streak_target_error), 2);
            }
        } while (!c3244l.m15570h(value, kz1VarM15733a));
        return xfa.f68157a;
    }
}
