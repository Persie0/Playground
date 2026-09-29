package com.lingq.feature.reader.old;

import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.d65;
import p000.nob;
import p000.ox7;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.y02;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$updateLessonReadStat$1", m4291f = "ReaderViewModel.kt", m4292l = {2800}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$updateLessonReadStat$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f29153a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29154b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f29155c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$updateLessonReadStat$1(C2412n c2412n, int i, Continuation continuation) {
        super(2, continuation);
        this.f29154b = c2412n;
        this.f29155c = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderViewModel$updateLessonReadStat$1(this.f29154b, this.f29155c, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderViewModel$updateLessonReadStat$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29153a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            C2412n c2412n = this.f29154b;
            List list = (List) c2412n.f29269D0.getValue();
            int i2 = this.f29155c;
            ox7 ox7Var = (ox7) u91.m22592J0(i2, list);
            if (i2 >= 0 && ox7Var != null) {
                int size = ox7Var.f55132e.size();
                long jM24805c = y02.m24805c();
                Long l = c2412n.f29341b0;
                long jLongValue = (jM24805c - (l != null ? l.longValue() : 0L)) / 1000;
                if (size > 0 && c2412n.m9340t3() > 0 && jLongValue > 0) {
                    double d = size;
                    double dM9340t3 = d / ((double) c2412n.m9340t3());
                    if ((d / jLongValue) * 60.0d <= 350.0d && !Double.isNaN(dM9340t3) && !Double.isInfinite(dM9340t3) && dM9340t3 <= 1.0d) {
                        double dM17572a = nob.m17572a(9, dM9340t3);
                        c2412n.mo49u1(LessonEngagedDataType.TimesRead, new Double(nob.m17572a(3, dM17572a)));
                        d65 d65Var = c2412n.f29394p;
                        String strMo4589b2 = c2412n.f29340b.mo4589b2();
                        int iM9332l3 = c2412n.m9332l3();
                        this.f29153a = 1;
                        if (d65.m10120d(d65Var, strMo4589b2, iM9332l3, 0.0d, dM17572a, this, 4) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                }
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
