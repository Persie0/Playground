package com.lingq.feature.statistics;

import com.lingq.core.domain.model.language.LanguageProgress;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.stats.ActivityScore;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C0010a8;
import p000.c32;
import p000.cj3;
import p000.cn4;
import p000.gm5;
import p000.ii9;
import p000.io4;
import p000.jo4;
import p000.no4;
import p000.xfa;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.statistics.LanguageStatsDetailsViewModel$languageStatsDetailsUiState$2", m4291f = "LanguageStatsDetailsViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class LanguageStatsDetailsViewModel$languageStatsDetailsUiState$2 extends SuspendLambda implements cj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ LanguageProgress f33201a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f33202b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ LanguageProgressMetric f33203c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ LanguageProgressPeriod f33204d;

    @Override // p000.cj3
    /* JADX INFO: renamed from: i */
    public final Object mo1291i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        LanguageStatsDetailsViewModel$languageStatsDetailsUiState$2 languageStatsDetailsViewModel$languageStatsDetailsUiState$2 = new LanguageStatsDetailsViewModel$languageStatsDetailsUiState$2(5, (Continuation) obj5);
        languageStatsDetailsViewModel$languageStatsDetailsUiState$2.f33201a = (LanguageProgress) obj;
        languageStatsDetailsViewModel$languageStatsDetailsUiState$2.f33202b = (List) obj2;
        languageStatsDetailsViewModel$languageStatsDetailsUiState$2.f33203c = (LanguageProgressMetric) obj3;
        languageStatsDetailsViewModel$languageStatsDetailsUiState$2.f33204d = (LanguageProgressPeriod) obj4;
        return languageStatsDetailsViewModel$languageStatsDetailsUiState$2.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:45:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0113  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x0119  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        cn4 cn4Var;
        Double d;
        Number num;
        double dDoubleValue;
        Number d2;
        Integer num2;
        boolean z;
        LanguageProgress languageProgress = this.f33201a;
        List list = this.f33202b;
        LanguageProgressMetric languageProgressMetric = this.f33203c;
        LanguageProgressPeriod languageProgressPeriod = this.f33204d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        int[] iArr = no4.f53056a;
        switch (iArr[languageProgressMetric.ordinal()]) {
            case 1:
                cn4Var = ii9.f44150b;
                break;
            case 2:
                cn4Var = ii9.f44149a;
                break;
            case 3:
                cn4Var = ii9.f44152d;
                break;
            case 4:
                cn4Var = ii9.f44151c;
                break;
            case 5:
                cn4Var = ii9.f44153e;
                break;
            case 6:
                cn4Var = ii9.f44154f;
                break;
            case 7:
                cn4Var = ii9.f44155g;
                break;
            case 8:
                cn4Var = ii9.f44156h;
                break;
            case 9:
                cn4Var = ii9.f44157i;
                break;
            case 10:
                cn4Var = ii9.f44158j;
                break;
            default:
                gm5.m12750e();
                return null;
        }
        cn4 cn4Var2 = cn4Var;
        if (languageProgress == null) {
            return new io4(cn4Var2, languageProgressPeriod);
        }
        switch (iArr[languageProgressMetric.ordinal()]) {
            case 1:
                d = new Double(languageProgress.f19063q);
                num = d;
                dDoubleValue = num.doubleValue();
                switch (iArr[languageProgressMetric.ordinal()]) {
                    case 1:
                        d2 = new Double(languageProgress.f19056j);
                        double dDoubleValue2 = d2.doubleValue();
                        String str = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str, dDoubleValue, dDoubleValue2, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue2));
                    case 2:
                        num2 = new Integer(languageProgress.f19062p);
                        d2 = num2;
                        double dDoubleValue3 = d2.doubleValue();
                        String str2 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str2, dDoubleValue, dDoubleValue3, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue3));
                    case 3:
                        num2 = new Integer(languageProgress.f19049c);
                        d2 = num2;
                        double dDoubleValue4 = d2.doubleValue();
                        String str3 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str3, dDoubleValue, dDoubleValue4, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue4));
                    case 4:
                        d2 = new Double(languageProgress.f19050d);
                        double dDoubleValue5 = d2.doubleValue();
                        String str4 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str4, dDoubleValue, dDoubleValue5, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue5));
                    case 5:
                        num2 = new Integer(languageProgress.f19055i);
                        d2 = num2;
                        double dDoubleValue6 = d2.doubleValue();
                        String str5 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str5, dDoubleValue, dDoubleValue6, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue6));
                    case 6:
                        num2 = new Integer(languageProgress.f19058l);
                        d2 = num2;
                        double dDoubleValue7 = d2.doubleValue();
                        String str6 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str6, dDoubleValue, dDoubleValue7, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue7));
                    case 7:
                        num2 = new Integer(languageProgress.f19066t);
                        d2 = num2;
                        double dDoubleValue8 = d2.doubleValue();
                        String str7 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str7, dDoubleValue, dDoubleValue8, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue8));
                    case 8:
                        num2 = new Integer(languageProgress.f19068v);
                        d2 = num2;
                        double dDoubleValue9 = d2.doubleValue();
                        String str8 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str8, dDoubleValue, dDoubleValue9, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue9));
                    case 9:
                        d2 = new Integer(0);
                        double dDoubleValue10 = d2.doubleValue();
                        String str9 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str9, dDoubleValue, dDoubleValue10, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue10));
                    case 10:
                        d2 = new Integer(0);
                        double dDoubleValue11 = d2.doubleValue();
                        String str10 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str10, dDoubleValue, dDoubleValue11, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11));
                    default:
                        gm5.m12750e();
                        return null;
                }
            case 2:
                d = new Double(languageProgress.f19052f);
                num = d;
                dDoubleValue = num.doubleValue();
                switch (iArr[languageProgressMetric.ordinal()]) {
                    case 1:
                        d2 = new Double(languageProgress.f19056j);
                        double dDoubleValue12 = d2.doubleValue();
                        String str11 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11, dDoubleValue, dDoubleValue12, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue12));
                    case 2:
                        num2 = new Integer(languageProgress.f19062p);
                        d2 = num2;
                        double dDoubleValue13 = d2.doubleValue();
                        String str12 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str12, dDoubleValue, dDoubleValue13, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue13));
                    case 3:
                        num2 = new Integer(languageProgress.f19049c);
                        d2 = num2;
                        double dDoubleValue14 = d2.doubleValue();
                        String str13 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str13, dDoubleValue, dDoubleValue14, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue14));
                    case 4:
                        d2 = new Double(languageProgress.f19050d);
                        double dDoubleValue15 = d2.doubleValue();
                        String str14 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str14, dDoubleValue, dDoubleValue15, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue15));
                    case 5:
                        num2 = new Integer(languageProgress.f19055i);
                        d2 = num2;
                        double dDoubleValue16 = d2.doubleValue();
                        String str15 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str15, dDoubleValue, dDoubleValue16, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue16));
                    case 6:
                        num2 = new Integer(languageProgress.f19058l);
                        d2 = num2;
                        double dDoubleValue17 = d2.doubleValue();
                        String str16 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str16, dDoubleValue, dDoubleValue17, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue17));
                    case 7:
                        num2 = new Integer(languageProgress.f19066t);
                        d2 = num2;
                        double dDoubleValue18 = d2.doubleValue();
                        String str17 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str17, dDoubleValue, dDoubleValue18, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue18));
                    case 8:
                        num2 = new Integer(languageProgress.f19068v);
                        d2 = num2;
                        double dDoubleValue19 = d2.doubleValue();
                        String str18 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str18, dDoubleValue, dDoubleValue19, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue19));
                    case 9:
                        d2 = new Integer(0);
                        double dDoubleValue110 = d2.doubleValue();
                        String str19 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str19, dDoubleValue, dDoubleValue110, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue110));
                    case 10:
                        d2 = new Integer(0);
                        double dDoubleValue111 = d2.doubleValue();
                        String str110 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str110, dDoubleValue, dDoubleValue111, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111));
                    default:
                        gm5.m12750e();
                        return null;
                }
            case 3:
                num = new Integer(languageProgress.f19065s);
                dDoubleValue = num.doubleValue();
                switch (iArr[languageProgressMetric.ordinal()]) {
                    case 1:
                        d2 = new Double(languageProgress.f19056j);
                        double dDoubleValue112 = d2.doubleValue();
                        String str111 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111, dDoubleValue, dDoubleValue112, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue112));
                    case 2:
                        num2 = new Integer(languageProgress.f19062p);
                        d2 = num2;
                        double dDoubleValue113 = d2.doubleValue();
                        String str112 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str112, dDoubleValue, dDoubleValue113, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue113));
                    case 3:
                        num2 = new Integer(languageProgress.f19049c);
                        d2 = num2;
                        double dDoubleValue114 = d2.doubleValue();
                        String str113 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str113, dDoubleValue, dDoubleValue114, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue114));
                    case 4:
                        d2 = new Double(languageProgress.f19050d);
                        double dDoubleValue115 = d2.doubleValue();
                        String str114 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str114, dDoubleValue, dDoubleValue115, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue115));
                    case 5:
                        num2 = new Integer(languageProgress.f19055i);
                        d2 = num2;
                        double dDoubleValue116 = d2.doubleValue();
                        String str115 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str115, dDoubleValue, dDoubleValue116, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue116));
                    case 6:
                        num2 = new Integer(languageProgress.f19058l);
                        d2 = num2;
                        double dDoubleValue117 = d2.doubleValue();
                        String str116 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str116, dDoubleValue, dDoubleValue117, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue117));
                    case 7:
                        num2 = new Integer(languageProgress.f19066t);
                        d2 = num2;
                        double dDoubleValue118 = d2.doubleValue();
                        String str117 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str117, dDoubleValue, dDoubleValue118, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue118));
                    case 8:
                        num2 = new Integer(languageProgress.f19068v);
                        d2 = num2;
                        double dDoubleValue119 = d2.doubleValue();
                        String str118 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str118, dDoubleValue, dDoubleValue119, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue119));
                    case 9:
                        d2 = new Integer(0);
                        double dDoubleValue1110 = d2.doubleValue();
                        String str119 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str119, dDoubleValue, dDoubleValue1110, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1110));
                    case 10:
                        d2 = new Integer(0);
                        double dDoubleValue1111 = d2.doubleValue();
                        String str1110 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1110, dDoubleValue, dDoubleValue1111, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111));
                    default:
                        gm5.m12750e();
                        return null;
                }
            case 4:
                d = new Double(languageProgress.f19057k);
                num = d;
                dDoubleValue = num.doubleValue();
                switch (iArr[languageProgressMetric.ordinal()]) {
                    case 1:
                        d2 = new Double(languageProgress.f19056j);
                        double dDoubleValue1112 = d2.doubleValue();
                        String str1111 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111, dDoubleValue, dDoubleValue1112, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1112));
                    case 2:
                        num2 = new Integer(languageProgress.f19062p);
                        d2 = num2;
                        double dDoubleValue1113 = d2.doubleValue();
                        String str1112 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1112, dDoubleValue, dDoubleValue1113, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1113));
                    case 3:
                        num2 = new Integer(languageProgress.f19049c);
                        d2 = num2;
                        double dDoubleValue1114 = d2.doubleValue();
                        String str1113 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1113, dDoubleValue, dDoubleValue1114, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1114));
                    case 4:
                        d2 = new Double(languageProgress.f19050d);
                        double dDoubleValue1115 = d2.doubleValue();
                        String str1114 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1114, dDoubleValue, dDoubleValue1115, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1115));
                    case 5:
                        num2 = new Integer(languageProgress.f19055i);
                        d2 = num2;
                        double dDoubleValue1116 = d2.doubleValue();
                        String str1115 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1115, dDoubleValue, dDoubleValue1116, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1116));
                    case 6:
                        num2 = new Integer(languageProgress.f19058l);
                        d2 = num2;
                        double dDoubleValue1117 = d2.doubleValue();
                        String str1116 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1116, dDoubleValue, dDoubleValue1117, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1117));
                    case 7:
                        num2 = new Integer(languageProgress.f19066t);
                        d2 = num2;
                        double dDoubleValue1118 = d2.doubleValue();
                        String str1117 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1117, dDoubleValue, dDoubleValue1118, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1118));
                    case 8:
                        num2 = new Integer(languageProgress.f19068v);
                        d2 = num2;
                        double dDoubleValue1119 = d2.doubleValue();
                        String str1118 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1118, dDoubleValue, dDoubleValue1119, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1119));
                    case 9:
                        d2 = new Integer(0);
                        double dDoubleValue11110 = d2.doubleValue();
                        String str1119 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1119, dDoubleValue, dDoubleValue11110, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11110));
                    case 10:
                        d2 = new Integer(0);
                        double dDoubleValue11111 = d2.doubleValue();
                        String str11110 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11110, dDoubleValue, dDoubleValue11111, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111));
                    default:
                        gm5.m12750e();
                        return null;
                }
            case 5:
                num = new Integer(languageProgress.f19059m);
                dDoubleValue = num.doubleValue();
                switch (iArr[languageProgressMetric.ordinal()]) {
                    case 1:
                        d2 = new Double(languageProgress.f19056j);
                        double dDoubleValue11112 = d2.doubleValue();
                        String str11111 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11111, dDoubleValue, dDoubleValue11112, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11112));
                    case 2:
                        num2 = new Integer(languageProgress.f19062p);
                        d2 = num2;
                        double dDoubleValue11113 = d2.doubleValue();
                        String str11112 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11112, dDoubleValue, dDoubleValue11113, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11113));
                    case 3:
                        num2 = new Integer(languageProgress.f19049c);
                        d2 = num2;
                        double dDoubleValue11114 = d2.doubleValue();
                        String str11113 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11113, dDoubleValue, dDoubleValue11114, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11114));
                    case 4:
                        d2 = new Double(languageProgress.f19050d);
                        double dDoubleValue11115 = d2.doubleValue();
                        String str11114 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11114, dDoubleValue, dDoubleValue11115, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11115));
                    case 5:
                        num2 = new Integer(languageProgress.f19055i);
                        d2 = num2;
                        double dDoubleValue11116 = d2.doubleValue();
                        String str11115 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11115, dDoubleValue, dDoubleValue11116, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11116));
                    case 6:
                        num2 = new Integer(languageProgress.f19058l);
                        d2 = num2;
                        double dDoubleValue11117 = d2.doubleValue();
                        String str11116 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11116, dDoubleValue, dDoubleValue11117, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11117));
                    case 7:
                        num2 = new Integer(languageProgress.f19066t);
                        d2 = num2;
                        double dDoubleValue11118 = d2.doubleValue();
                        String str11117 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11117, dDoubleValue, dDoubleValue11118, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11118));
                    case 8:
                        num2 = new Integer(languageProgress.f19068v);
                        d2 = num2;
                        double dDoubleValue11119 = d2.doubleValue();
                        String str11118 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11118, dDoubleValue, dDoubleValue11119, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11119));
                    case 9:
                        d2 = new Integer(0);
                        double dDoubleValue111110 = d2.doubleValue();
                        String str11119 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11119, dDoubleValue, dDoubleValue111110, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111110));
                    case 10:
                        d2 = new Integer(0);
                        double dDoubleValue111111 = d2.doubleValue();
                        String str111110 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111110, dDoubleValue, dDoubleValue111111, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111111));
                    default:
                        gm5.m12750e();
                        return null;
                }
            case 6:
                num = new Integer(languageProgress.f19061o);
                dDoubleValue = num.doubleValue();
                switch (iArr[languageProgressMetric.ordinal()]) {
                    case 1:
                        d2 = new Double(languageProgress.f19056j);
                        double dDoubleValue111112 = d2.doubleValue();
                        String str111111 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111111, dDoubleValue, dDoubleValue111112, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111112));
                    case 2:
                        num2 = new Integer(languageProgress.f19062p);
                        d2 = num2;
                        double dDoubleValue111113 = d2.doubleValue();
                        String str111112 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111112, dDoubleValue, dDoubleValue111113, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111113));
                    case 3:
                        num2 = new Integer(languageProgress.f19049c);
                        d2 = num2;
                        double dDoubleValue111114 = d2.doubleValue();
                        String str111113 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111113, dDoubleValue, dDoubleValue111114, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111114));
                    case 4:
                        d2 = new Double(languageProgress.f19050d);
                        double dDoubleValue111115 = d2.doubleValue();
                        String str111114 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111114, dDoubleValue, dDoubleValue111115, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111115));
                    case 5:
                        num2 = new Integer(languageProgress.f19055i);
                        d2 = num2;
                        double dDoubleValue111116 = d2.doubleValue();
                        String str111115 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111115, dDoubleValue, dDoubleValue111116, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111116));
                    case 6:
                        num2 = new Integer(languageProgress.f19058l);
                        d2 = num2;
                        double dDoubleValue111117 = d2.doubleValue();
                        String str111116 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111116, dDoubleValue, dDoubleValue111117, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111117));
                    case 7:
                        num2 = new Integer(languageProgress.f19066t);
                        d2 = num2;
                        double dDoubleValue111118 = d2.doubleValue();
                        String str111117 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111117, dDoubleValue, dDoubleValue111118, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111118));
                    case 8:
                        num2 = new Integer(languageProgress.f19068v);
                        d2 = num2;
                        double dDoubleValue111119 = d2.doubleValue();
                        String str111118 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111118, dDoubleValue, dDoubleValue111119, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111119));
                    case 9:
                        d2 = new Integer(0);
                        double dDoubleValue1111110 = d2.doubleValue();
                        String str111119 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111119, dDoubleValue, dDoubleValue1111110, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111110));
                    case 10:
                        d2 = new Integer(0);
                        double dDoubleValue1111111 = d2.doubleValue();
                        String str1111110 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111110, dDoubleValue, dDoubleValue1111111, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111111));
                    default:
                        gm5.m12750e();
                        return null;
                }
            case 7:
                num = new Integer(languageProgress.f19064r);
                dDoubleValue = num.doubleValue();
                switch (iArr[languageProgressMetric.ordinal()]) {
                    case 1:
                        d2 = new Double(languageProgress.f19056j);
                        double dDoubleValue1111112 = d2.doubleValue();
                        String str1111111 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111111, dDoubleValue, dDoubleValue1111112, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111112));
                    case 2:
                        num2 = new Integer(languageProgress.f19062p);
                        d2 = num2;
                        double dDoubleValue1111113 = d2.doubleValue();
                        String str1111112 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111112, dDoubleValue, dDoubleValue1111113, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111113));
                    case 3:
                        num2 = new Integer(languageProgress.f19049c);
                        d2 = num2;
                        double dDoubleValue1111114 = d2.doubleValue();
                        String str1111113 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111113, dDoubleValue, dDoubleValue1111114, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111114));
                    case 4:
                        d2 = new Double(languageProgress.f19050d);
                        double dDoubleValue1111115 = d2.doubleValue();
                        String str1111114 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111114, dDoubleValue, dDoubleValue1111115, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111115));
                    case 5:
                        num2 = new Integer(languageProgress.f19055i);
                        d2 = num2;
                        double dDoubleValue1111116 = d2.doubleValue();
                        String str1111115 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111115, dDoubleValue, dDoubleValue1111116, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111116));
                    case 6:
                        num2 = new Integer(languageProgress.f19058l);
                        d2 = num2;
                        double dDoubleValue1111117 = d2.doubleValue();
                        String str1111116 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111116, dDoubleValue, dDoubleValue1111117, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111117));
                    case 7:
                        num2 = new Integer(languageProgress.f19066t);
                        d2 = num2;
                        double dDoubleValue1111118 = d2.doubleValue();
                        String str1111117 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111117, dDoubleValue, dDoubleValue1111118, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111118));
                    case 8:
                        num2 = new Integer(languageProgress.f19068v);
                        d2 = num2;
                        double dDoubleValue1111119 = d2.doubleValue();
                        String str1111118 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111118, dDoubleValue, dDoubleValue1111119, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111119));
                    case 9:
                        d2 = new Integer(0);
                        double dDoubleValue11111110 = d2.doubleValue();
                        String str1111119 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111119, dDoubleValue, dDoubleValue11111110, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111110));
                    case 10:
                        d2 = new Integer(0);
                        double dDoubleValue11111111 = d2.doubleValue();
                        String str11111110 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11111110, dDoubleValue, dDoubleValue11111111, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111111));
                    default:
                        gm5.m12750e();
                        return null;
                }
            case 8:
                num = new Integer(languageProgress.f19067u);
                dDoubleValue = num.doubleValue();
                switch (iArr[languageProgressMetric.ordinal()]) {
                    case 1:
                        d2 = new Double(languageProgress.f19056j);
                        double dDoubleValue11111112 = d2.doubleValue();
                        String str11111111 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11111111, dDoubleValue, dDoubleValue11111112, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111112));
                    case 2:
                        num2 = new Integer(languageProgress.f19062p);
                        d2 = num2;
                        double dDoubleValue11111113 = d2.doubleValue();
                        String str11111112 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11111112, dDoubleValue, dDoubleValue11111113, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111113));
                    case 3:
                        num2 = new Integer(languageProgress.f19049c);
                        d2 = num2;
                        double dDoubleValue11111114 = d2.doubleValue();
                        String str11111113 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11111113, dDoubleValue, dDoubleValue11111114, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111114));
                    case 4:
                        d2 = new Double(languageProgress.f19050d);
                        double dDoubleValue11111115 = d2.doubleValue();
                        String str11111114 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11111114, dDoubleValue, dDoubleValue11111115, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111115));
                    case 5:
                        num2 = new Integer(languageProgress.f19055i);
                        d2 = num2;
                        double dDoubleValue11111116 = d2.doubleValue();
                        String str11111115 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11111115, dDoubleValue, dDoubleValue11111116, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111116));
                    case 6:
                        num2 = new Integer(languageProgress.f19058l);
                        d2 = num2;
                        double dDoubleValue11111117 = d2.doubleValue();
                        String str11111116 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11111116, dDoubleValue, dDoubleValue11111117, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111117));
                    case 7:
                        num2 = new Integer(languageProgress.f19066t);
                        d2 = num2;
                        double dDoubleValue11111118 = d2.doubleValue();
                        String str11111117 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11111117, dDoubleValue, dDoubleValue11111118, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111118));
                    case 8:
                        num2 = new Integer(languageProgress.f19068v);
                        d2 = num2;
                        double dDoubleValue11111119 = d2.doubleValue();
                        String str11111118 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11111118, dDoubleValue, dDoubleValue11111119, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111119));
                    case 9:
                        d2 = new Integer(0);
                        double dDoubleValue111111110 = d2.doubleValue();
                        String str11111119 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11111119, dDoubleValue, dDoubleValue111111110, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111111110));
                    case 10:
                        d2 = new Integer(0);
                        double dDoubleValue111111111 = d2.doubleValue();
                        String str111111110 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111111110, dDoubleValue, dDoubleValue111111111, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111111111));
                    default:
                        gm5.m12750e();
                        return null;
                }
            case 9:
                num = new Integer(languageProgress.f19070x);
                dDoubleValue = num.doubleValue();
                switch (iArr[languageProgressMetric.ordinal()]) {
                    case 1:
                        d2 = new Double(languageProgress.f19056j);
                        double dDoubleValue111111112 = d2.doubleValue();
                        String str111111111 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111111111, dDoubleValue, dDoubleValue111111112, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111111112));
                    case 2:
                        num2 = new Integer(languageProgress.f19062p);
                        d2 = num2;
                        double dDoubleValue111111113 = d2.doubleValue();
                        String str111111112 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111111112, dDoubleValue, dDoubleValue111111113, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111111113));
                    case 3:
                        num2 = new Integer(languageProgress.f19049c);
                        d2 = num2;
                        double dDoubleValue111111114 = d2.doubleValue();
                        String str111111113 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111111113, dDoubleValue, dDoubleValue111111114, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111111114));
                    case 4:
                        d2 = new Double(languageProgress.f19050d);
                        double dDoubleValue111111115 = d2.doubleValue();
                        String str111111114 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111111114, dDoubleValue, dDoubleValue111111115, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111111115));
                    case 5:
                        num2 = new Integer(languageProgress.f19055i);
                        d2 = num2;
                        double dDoubleValue111111116 = d2.doubleValue();
                        String str111111115 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111111115, dDoubleValue, dDoubleValue111111116, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111111116));
                    case 6:
                        num2 = new Integer(languageProgress.f19058l);
                        d2 = num2;
                        double dDoubleValue111111117 = d2.doubleValue();
                        String str111111116 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111111116, dDoubleValue, dDoubleValue111111117, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111111117));
                    case 7:
                        num2 = new Integer(languageProgress.f19066t);
                        d2 = num2;
                        double dDoubleValue111111118 = d2.doubleValue();
                        String str111111117 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111111117, dDoubleValue, dDoubleValue111111118, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111111118));
                    case 8:
                        num2 = new Integer(languageProgress.f19068v);
                        d2 = num2;
                        double dDoubleValue111111119 = d2.doubleValue();
                        String str111111118 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111111118, dDoubleValue, dDoubleValue111111119, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue111111119));
                    case 9:
                        d2 = new Integer(0);
                        double dDoubleValue1111111110 = d2.doubleValue();
                        String str111111119 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str111111119, dDoubleValue, dDoubleValue1111111110, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111111110));
                    case 10:
                        d2 = new Integer(0);
                        double dDoubleValue1111111111 = d2.doubleValue();
                        String str1111111110 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111111110, dDoubleValue, dDoubleValue1111111111, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111111111));
                    default:
                        gm5.m12750e();
                        return null;
                }
            case 10:
                num = new Integer(languageProgress.f19069w);
                dDoubleValue = num.doubleValue();
                switch (iArr[languageProgressMetric.ordinal()]) {
                    case 1:
                        d2 = new Double(languageProgress.f19056j);
                        double dDoubleValue1111111112 = d2.doubleValue();
                        String str1111111111 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111111111, dDoubleValue, dDoubleValue1111111112, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111111112));
                    case 2:
                        num2 = new Integer(languageProgress.f19062p);
                        d2 = num2;
                        double dDoubleValue1111111113 = d2.doubleValue();
                        String str1111111112 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111111112, dDoubleValue, dDoubleValue1111111113, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111111113));
                    case 3:
                        num2 = new Integer(languageProgress.f19049c);
                        d2 = num2;
                        double dDoubleValue1111111114 = d2.doubleValue();
                        String str1111111113 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111111113, dDoubleValue, dDoubleValue1111111114, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111111114));
                    case 4:
                        d2 = new Double(languageProgress.f19050d);
                        double dDoubleValue1111111115 = d2.doubleValue();
                        String str1111111114 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111111114, dDoubleValue, dDoubleValue1111111115, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111111115));
                    case 5:
                        num2 = new Integer(languageProgress.f19055i);
                        d2 = num2;
                        double dDoubleValue1111111116 = d2.doubleValue();
                        String str1111111115 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111111115, dDoubleValue, dDoubleValue1111111116, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111111116));
                    case 6:
                        num2 = new Integer(languageProgress.f19058l);
                        d2 = num2;
                        double dDoubleValue1111111117 = d2.doubleValue();
                        String str1111111116 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111111116, dDoubleValue, dDoubleValue1111111117, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111111117));
                    case 7:
                        num2 = new Integer(languageProgress.f19066t);
                        d2 = num2;
                        double dDoubleValue1111111118 = d2.doubleValue();
                        String str1111111117 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111111117, dDoubleValue, dDoubleValue1111111118, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111111118));
                    case 8:
                        num2 = new Integer(languageProgress.f19068v);
                        d2 = num2;
                        double dDoubleValue1111111119 = d2.doubleValue();
                        String str1111111118 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111111118, dDoubleValue, dDoubleValue1111111119, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue1111111119));
                    case 9:
                        d2 = new Integer(0);
                        double dDoubleValue11111111110 = d2.doubleValue();
                        String str1111111119 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str1111111119, dDoubleValue, dDoubleValue11111111110, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111111110));
                    case 10:
                        d2 = new Integer(0);
                        double dDoubleValue11111111111 = d2.doubleValue();
                        String str11111111110 = languageProgress.f19048b;
                        switch (iArr[languageProgressMetric.ordinal()]) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                z = true;
                                break;
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                z = false;
                                break;
                            default:
                                gm5.m12750e();
                                return null;
                        }
                        ActivityScore.Companion.getClass();
                        return new jo4(cn4Var2, languageProgressPeriod, str11111111110, dDoubleValue, dDoubleValue11111111111, z, list, C0010a8.m168a(dDoubleValue, dDoubleValue11111111111));
                    default:
                        gm5.m12750e();
                        return null;
                }
            default:
                gm5.m12750e();
                return null;
        }
    }
}
