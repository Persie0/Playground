package com.lingq.core.domain.stats;

import com.lingq.core.domain.model.milestones.Badge;
import com.lingq.core.domain.model.milestones.Milestone;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.bj3;
import p000.br5;
import p000.c32;
import p000.cl9;
import p000.dr5;
import p000.ma3;
import p000.u91;
import p000.ux5;
import p000.vy5;
import p000.wy5;
import p000.x75;
import p000.xfa;
import p000.y75;
import p000.z75;
import p000.zy5;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.domain.stats.GetLevelStatsUseCase$invoke$1", m4291f = "GetLevelStatsUseCase.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class GetLevelStatsUseCase$invoke$1 extends SuspendLambda implements bj3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ zy5 f19963a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ List f19964b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ List f19965c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C1527b f19966d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetLevelStatsUseCase$invoke$1(C1527b c1527b, Continuation continuation) {
        super(4, continuation);
        this.f19966d = c1527b;
    }

    @Override // p000.bj3
    /* JADX INFO: renamed from: e */
    public final Object mo825e(Object obj, Object obj2, Object obj3, Object obj4) {
        GetLevelStatsUseCase$invoke$1 getLevelStatsUseCase$invoke$1 = new GetLevelStatsUseCase$invoke$1(this.f19966d, (Continuation) obj4);
        getLevelStatsUseCase$invoke$1.f19963a = (zy5) obj;
        getLevelStatsUseCase$invoke$1.f19964b = (List) obj2;
        getLevelStatsUseCase$invoke$1.f19965c = (List) obj3;
        return getLevelStatsUseCase$invoke$1.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:61:0x010b  */
    /* JADX WARN: Code duplicated, block: B:75:0x012c  */
    /* JADX WARN: Code duplicated, block: B:77:0x0134  */
    /* JADX WARN: Failed to find 'out' block for switch in B:56:0x00fe. Please report as an issue. */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object next;
        Object objPrevious;
        Object next2;
        wy5 wy5VarM23593b;
        String str;
        Integer numM4844a0;
        wy5 wy5Var;
        zy5 zy5Var = this.f19963a;
        List list = this.f19964b;
        List list2 = this.f19965c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        if (list.isEmpty()) {
            return x75.f67887a;
        }
        if (zy5Var != null) {
            int i = zy5Var.f72382b;
            Iterator it = list.iterator();
            wy5 wy5Var2 = null;
            if (it.hasNext()) {
                next = it.next();
                if (it.hasNext()) {
                    int i2 = ((Milestone) next).f19534c;
                    do {
                        Object next3 = it.next();
                        int i3 = ((Milestone) next3).f19534c;
                        if (i2 < i3) {
                            next = next3;
                            i2 = i3;
                        }
                    } while (it.hasNext());
                }
            } else {
                next = null;
            }
            Milestone milestone = (Milestone) next;
            if (milestone != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next4 = it2.next();
                    Badge badge = (Badge) next4;
                    if (cl9.m4842Y(badge.f19509c, "level.", false) && badge.f19511e > 0) {
                        arrayList.add(next4);
                    }
                }
                List listM22614f1 = u91.m22614f1(arrayList, new ma3(18));
                ListIterator listIterator = listM22614f1.listIterator(listM22614f1.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        objPrevious = null;
                        break;
                    }
                    objPrevious = listIterator.previous();
                } while (((Badge) objPrevious).f19511e > i);
                Badge badge2 = (Badge) objPrevious;
                Iterator it3 = listM22614f1.iterator();
                do {
                    if (!it3.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it3.next();
                } while (((Badge) next2).f19511e <= i);
                Badge badge3 = (Badge) next2;
                if (badge3 != null) {
                    wy5VarM23593b = new wy5(badge3.f19509c, badge3.f19510d);
                } else {
                    wy5.Companion.getClass();
                    wy5VarM23593b = vy5.m23593b(milestone);
                }
                int i4 = badge2 != null ? badge2.f19511e : 0;
                int i5 = badge3 != null ? badge3.f19511e : milestone.f19534c;
                if (badge2 != null) {
                    wy5Var2 = new wy5(badge2.f19509c, badge2.f19510d);
                } else {
                    String str2 = wy5VarM23593b.f67522c;
                    String strM22988k = "beginner1";
                    switch (str2) {
                        case "beginner1":
                            if (!str2.equals("beginner1")) {
                                dr5 dr5VarM15426e = wy5.f67518d.m15426e(str2);
                                if (dr5VarM15426e == null && (str = (String) ((br5) dr5VarM15426e.m10610a()).get(1)) != null && (numM4844a0 = cl9.m4844a0(str)) != null) {
                                    int iIntValue = numM4844a0.intValue();
                                    if (iIntValue <= 1) {
                                        strM22988k = "intermediate2";
                                    } else {
                                        strM22988k = ux5.m22988k(iIntValue - 1, "advanced");
                                    }
                                    wy5.Companion.getClass();
                                    wy5Var = new wy5("level.".concat(strM22988k), vy5.m23592a(strM22988k));
                                    break;
                                }
                            }
                            wy5Var = null;
                            break;
                        case "beginner2":
                            int iIntValue2 = numM4844a0.intValue();
                            if (iIntValue2 <= 1) {
                                strM22988k = "intermediate2";
                            } else {
                                strM22988k = ux5.m22988k(iIntValue2 - 1, "advanced");
                            }
                            wy5.Companion.getClass();
                            wy5Var = new wy5("level.".concat(strM22988k), vy5.m23592a(strM22988k));
                            break;
                        case "intermediate1":
                            strM22988k = "beginner2";
                        case "intermediate2":
                            strM22988k = "intermediate1";
                        case "advanced1":
                            strM22988k = "intermediate2";
                        default:
                            dr5 dr5VarM15426e2 = wy5.f67518d.m15426e(str2);
                            if (dr5VarM15426e2 == null && (str = (String) ((br5) dr5VarM15426e2.m10610a()).get(1)) != null && (numM4844a0 = cl9.m4844a0(str)) != null) {
                                int iIntValue3 = numM4844a0.intValue();
                                if (iIntValue3 <= 1) {
                                    strM22988k = "intermediate2";
                                } else {
                                    strM22988k = ux5.m22988k(iIntValue3 - 1, "advanced");
                                }
                                wy5.Companion.getClass();
                                wy5Var = new wy5("level.".concat(strM22988k), vy5.m23592a(strM22988k));
                                break;
                            }
                    }
                    if (listM22614f1.isEmpty()) {
                        wy5Var2 = wy5Var;
                    }
                }
                int i6 = i - i4;
                if (i6 < 0) {
                    i6 = 0;
                }
                int i7 = i5 - i4;
                return new z75(wy5Var2, wy5VarM23593b, i7 >= 0 ? i7 : 0, i6);
            }
        }
        return y75.f69407a;
    }
}
