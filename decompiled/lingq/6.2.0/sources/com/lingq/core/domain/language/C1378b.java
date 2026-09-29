package com.lingq.core.domain.language;

import com.lingq.core.data.repository.C1293i;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.AbstractC3264d;
import kotlinx.serialization.json.C3261a;
import kotlinx.serialization.json.C3263c;
import p000.C3386nv;
import p000.ak6;
import p000.e54;
import p000.fa4;
import p000.gm5;
import p000.hz1;
import p000.jz1;
import p000.lm4;
import p000.ow8;
import p000.rz8;
import p000.sf4;
import p000.ss5;
import p000.sz8;
import p000.tz8;
import p000.u91;
import p000.um5;
import p000.uz8;
import p000.vf4;
import p000.vk9;
import p000.vm5;
import p000.vz1;
import p000.wm5;
import p000.wz8;
import p000.xj6;
import p000.xm5;
import p000.yf4;
import p000.ym5;
import p000.zj6;

/* JADX INFO: renamed from: com.lingq.core.domain.language.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C1378b {
    private static final wz8 Companion = new wz8();

    /* JADX INFO: renamed from: b */
    public static final yf4 f18644b = ss5.m21704c(new ow8(5));

    /* JADX INFO: renamed from: c */
    public static final List f18645c = vz1.m23605K("streak_goal", "intense", "non_field_errors", "detail");

    /* JADX INFO: renamed from: a */
    public final lm4 f18646a;

    public C1378b(lm4 lm4Var) {
        lm4Var.getClass();
        this.f18646a = lm4Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static String m7984a(AbstractC3262b abstractC3262b) {
        String strM21337d;
        if (abstractC3262b instanceof C3261a) {
            return m7984a((AbstractC3262b) u91.m22591I0((List) abstractC3262b));
        }
        if (!(abstractC3262b instanceof AbstractC3264d) || (strM21337d = sf4.m21337d((AbstractC3264d) abstractC3262b)) == null || vk9.m23391n0(strM21337d)) {
            return null;
        }
        return strM21337d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m7985b(String str, jz1 jz1Var, ContinuationImpl continuationImpl) throws Throwable {
        SetDailyStreakTargetUseCase$invoke$1 setDailyStreakTargetUseCase$invoke$1;
        int i;
        String str2;
        Object failure;
        C3263c c3263c;
        C3263c c3263c2;
        if (continuationImpl instanceof SetDailyStreakTargetUseCase$invoke$1) {
            setDailyStreakTargetUseCase$invoke$1 = (SetDailyStreakTargetUseCase$invoke$1) continuationImpl;
            int i2 = setDailyStreakTargetUseCase$invoke$1.f18642c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                setDailyStreakTargetUseCase$invoke$1.f18642c = i2 - Integer.MIN_VALUE;
            } else {
                setDailyStreakTargetUseCase$invoke$1 = new SetDailyStreakTargetUseCase$invoke$1(this, continuationImpl);
            }
        } else {
            setDailyStreakTargetUseCase$invoke$1 = new SetDailyStreakTargetUseCase$invoke$1(this, continuationImpl);
        }
        Object objM7217n = setDailyStreakTargetUseCase$invoke$1.f18640a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = setDailyStreakTargetUseCase$invoke$1.f18642c;
        String strM7984a = null;
        AbstractC3262b abstractC3262b = null;
        strM7984a = null;
        strM7984a = null;
        strM7984a = null;
        strM7984a = null;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM7217n);
            if ((jz1Var instanceof hz1) && (1 > (i = ((hz1) jz1Var).f43235a) || i >= 1001)) {
                return sz8.f61678a;
            }
            setDailyStreakTargetUseCase$invoke$1.f18642c = 1;
            objM7217n = ((C1293i) this.f18646a).m7217n(str, jz1Var, setDailyStreakTargetUseCase$invoke$1);
            if (objM7217n == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(objM7217n);
        }
        ym5 ym5Var = (ym5) objM7217n;
        if (ym5Var instanceof xm5) {
            return uz8.f64625a;
        }
        if (!(ym5Var instanceof um5)) {
            if ((ym5Var instanceof vm5) || fa4.m11650l(ym5Var, wm5.f67054a)) {
                return new rz8(zj6.f71653a);
            }
            gm5.m12750e();
            return null;
        }
        ak6 ak6Var = (ak6) ((um5) ym5Var).f64075a;
        xj6 xj6Var = ak6Var instanceof xj6 ? (xj6) ak6Var : null;
        if (xj6Var != null) {
            if (xj6Var.f68289a != 400) {
                xj6Var = null;
            }
            if (xj6Var != null && (str2 = xj6Var.f68291c) != null && !vk9.m23391n0(str2)) {
                try {
                    yf4 yf4Var = f18644b;
                    yf4Var.getClass();
                    AbstractC3262b abstractC3262b2 = (AbstractC3262b) yf4Var.m10321a(str2, vf4.f65313a);
                    e54 e54Var = sf4.f60791a;
                    abstractC3262b2.getClass();
                    if (abstractC3262b2 instanceof C3263c) {
                        c3263c2 = (C3263c) abstractC3262b2;
                    } else {
                        c3263c = null;
                    }
                    if (c3263c == null) {
                        c3263c = c3263c2;
                        sf4.m21336c(abstractC3262b2, "JsonObject");
                        throw null;
                    }
                    c3263c = c3263c2;
                    failure = c3263c;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                boolean z = failure instanceof Result.Failure;
                Object obj = failure;
                if (z) {
                    obj = null;
                }
                C3263c c3263c3 = (C3263c) obj;
                if (c3263c3 != null) {
                    Iterator it = f18645c.iterator();
                    while (it.hasNext()) {
                        AbstractC3262b abstractC3262b3 = (AbstractC3262b) c3263c3.get((String) it.next());
                        if (abstractC3262b3 != null) {
                            abstractC3262b = abstractC3262b3;
                            break;
                        }
                    }
                    if (abstractC3262b == null) {
                        abstractC3262b = (AbstractC3262b) u91.m22590H0(c3263c3.f48242a.values());
                    }
                    strM7984a = m7984a(abstractC3262b);
                }
            }
        }
        return strM7984a != null ? new tz8(strM7984a) : new rz8(ak6Var);
    }
}
