package com.lingq.feature.reader.stats;

import android.os.Bundle;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$AdjustedStat;
import com.lingq.core.analytics.data.LqAnalyticsValues$AdjustedStatAction;
import com.lingq.core.analytics.data.LqAnalyticsValues$AdjustedStatLocation;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3139j9;
import p000.C3386nv;
import p000.c32;
import p000.cma;
import p000.hm5;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.stats.LessonCompleteViewModel$updateLessonStat$1", m4291f = "LessonCompleteViewModel.kt", m4292l = {908, 934}, m4293m = "invokeSuspend", m4294v = 2)
final class LessonCompleteViewModel$updateLessonStat$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f30714a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f30715b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C2535j f30716c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ double f30717d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LessonCompleteViewModel$updateLessonStat$1(String str, C2535j c2535j, double d, Continuation continuation) {
        super(2, continuation);
        this.f30715b = str;
        this.f30716c = c2535j;
        this.f30717d = d;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LessonCompleteViewModel$updateLessonStat$1(this.f30715b, this.f30716c, this.f30717d, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((LessonCompleteViewModel$updateLessonStat$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:24:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:25:0x00d0  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f5, code lost:
    
        if (p000.C3139j9.m14345c(r0, r1, r2, r24.f30717d, 0.0d, r24, 8) == r12) goto L28;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        String str;
        String str2;
        String str3;
        String value;
        C2535j c2535j = this.f30716c;
        cma cmaVar = c2535j.f30818b;
        hm5 hm5Var = c2535j.f30830h;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f30714a;
        double d = this.f30717d;
        String str4 = this.f30715b;
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
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(obj);
        if (str4.equals("Read")) {
            Bundle bundle = new Bundle();
            bundle.putString("adjusted stat", LqAnalyticsValues$AdjustedStat.Reading.getValue());
            bundle.putString("adjustment location", LqAnalyticsValues$AdjustedStatLocation.LessonComplete.getValue());
            bundle.putString("increase or decrease", d > 0.0d ? LqAnalyticsValues$AdjustedStatAction.Increase.getValue() : LqAnalyticsValues$AdjustedStatAction.Decrease.getValue());
            ((C1240a) hm5Var).m7025f("Stat adjusted", bundle);
            C3139j9 c3139j9 = c2535j.f30792B;
            String strMo4589b2 = cmaVar.mo4589b2();
            int i2 = c2535j.f30803M;
            this.f30714a = 1;
            str = "Stat adjusted";
            str2 = "adjusted stat";
            str3 = str4;
            if (C3139j9.m14345c(c3139j9, strMo4589b2, i2, 0.0d, this.f30717d, this, 4) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (str3.equals("Listen")) {
            Bundle bundle2 = new Bundle();
            bundle2.putString(str2, LqAnalyticsValues$AdjustedStat.Listening.getValue());
            bundle2.putString("adjustment location", LqAnalyticsValues$AdjustedStatLocation.LessonComplete.getValue());
            if (d > 0.0d) {
                value = LqAnalyticsValues$AdjustedStatAction.Increase.getValue();
            } else {
                value = LqAnalyticsValues$AdjustedStatAction.Decrease.getValue();
            }
            bundle2.putString("increase or decrease", value);
            ((C1240a) hm5Var).m7025f(str, bundle2);
            C3139j9 c3139j10 = c2535j.f30792B;
            String strMo4589b3 = cmaVar.mo4589b2();
            int i3 = c2535j.f30803M;
            this.f30714a = 2;
        }
        return xfa.f68157a;
        str2 = "adjusted stat";
        str = "Stat adjusted";
        str3 = str4;
        if (str3.equals("Listen")) {
            Bundle bundle3 = new Bundle();
            bundle3.putString(str2, LqAnalyticsValues$AdjustedStat.Listening.getValue());
            bundle3.putString("adjustment location", LqAnalyticsValues$AdjustedStatLocation.LessonComplete.getValue());
            if (d > 0.0d) {
                value = LqAnalyticsValues$AdjustedStatAction.Increase.getValue();
            } else {
                value = LqAnalyticsValues$AdjustedStatAction.Decrease.getValue();
            }
            bundle3.putString("increase or decrease", value);
            ((C1240a) hm5Var).m7025f(str, bundle3);
            C3139j9 c3139j11 = c2535j.f30792B;
            String strMo4589b4 = cmaVar.mo4589b2();
            int i4 = c2535j.f30803M;
            this.f30714a = 2;
        }
        return xfa.f68157a;
    }
}
