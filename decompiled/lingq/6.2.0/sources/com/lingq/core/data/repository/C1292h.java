package com.lingq.core.data.repository;

import androidx.room.AbstractC0747e;
import androidx.room.util.AbstractC0758a;
import androidx.work.BackoffPolicy;
import androidx.work.NetworkType;
import androidx.work.impl.C0773b;
import com.lingq.core.data.workers.DictionaryAddWorker;
import com.lingq.core.data.workers.DictionaryDeleteWorker;
import com.lingq.core.database.LingQDatabase;
import com.lingq.core.database.dao.C1318f;
import com.lingq.core.network.api.result.ResultDictionariesForUser;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3386nv;
import p000.c83;
import p000.df4;
import p000.hi8;
import p000.i93;
import p000.jd0;
import p000.jl4;
import p000.lda;
import p000.md0;
import p000.nf2;
import p000.qf2;
import p000.rv0;
import p000.t70;
import p000.tx6;
import p000.u91;
import p000.ui5;
import p000.ux6;
import p000.v91;
import p000.vl4;
import p000.wi5;
import p000.xf2;
import p000.xfa;
import p000.xj1;
import p000.yf2;

/* JADX INFO: renamed from: com.lingq.core.data.repository.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1292h implements xf2 {

    /* JADX INFO: renamed from: a */
    public final LingQDatabase f16482a;

    /* JADX INFO: renamed from: b */
    public final C1318f f16483b;

    /* JADX INFO: renamed from: c */
    public final wi5 f16484c;

    /* JADX INFO: renamed from: d */
    public final yf2 f16485d;

    /* JADX INFO: renamed from: e */
    public final C0773b f16486e;

    /* JADX INFO: renamed from: f */
    public final df4 f16487f;

    public C1292h(LingQDatabase lingQDatabase, C1318f c1318f, wi5 wi5Var, yf2 yf2Var, C0773b c0773b, df4 df4Var) {
        lingQDatabase.getClass();
        c1318f.getClass();
        wi5Var.getClass();
        yf2Var.getClass();
        c0773b.getClass();
        df4Var.getClass();
        this.f16482a = lingQDatabase;
        this.f16483b = c1318f;
        this.f16484c = wi5Var;
        this.f16485d = yf2Var;
        this.f16486e = c0773b;
        this.f16487f = df4Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0094  */
    /* JADX WARN: Code duplicated, block: B:39:0x0095 A[Catch: Exception -> 0x00e7, PHI: r12 r14
      0x0095: PHI (r12v4 java.lang.String) = (r12v3 java.lang.String), (r12v12 java.lang.String) binds: [B:37:0x0092, B:20:0x0044] A[DONT_GENERATE, DONT_INLINE]
      0x0095: PHI (r14v9 java.lang.Object) = (r14v8 java.lang.Object), (r14v1 java.lang.Object) binds: [B:37:0x0092, B:20:0x0044] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x00e7, blocks: (B:15:0x0037, B:46:0x00c7, B:49:0x00cc, B:51:0x00d5, B:53:0x00de, B:20:0x0044, B:39:0x0095, B:42:0x009a, B:23:0x004a, B:36:0x0072, B:26:0x0050, B:32:0x0064, B:29:0x0057), top: B:57:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Serializable m7195a(String str, ContinuationImpl continuationImpl) throws Throwable {
        DictionaryRepositoryImpl$activeAndAvailableDictionaries$1 dictionaryRepositoryImpl$activeAndAvailableDictionaries$1;
        String str2;
        List list;
        Object objM15542u;
        List list2;
        List list3;
        if (continuationImpl instanceof DictionaryRepositoryImpl$activeAndAvailableDictionaries$1) {
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1 = (DictionaryRepositoryImpl$activeAndAvailableDictionaries$1) continuationImpl;
            int i = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15112e;
            if ((i & Integer.MIN_VALUE) != 0) {
                dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15112e = i - Integer.MIN_VALUE;
            } else {
                dictionaryRepositoryImpl$activeAndAvailableDictionaries$1 = new DictionaryRepositoryImpl$activeAndAvailableDictionaries$1(this, continuationImpl);
            }
        } else {
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1 = new DictionaryRepositoryImpl$activeAndAvailableDictionaries$1(this, continuationImpl);
        }
        Object objM25110b = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15110c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15112e;
        C1318f c1318f = this.f16483b;
        EmptyList emptyList = EmptyList.f47638a;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM25110b);
                yf2 yf2Var = this.f16485d;
                dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15108a = str;
                dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15112e = 1;
                objM25110b = yf2Var.m25110b(str, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1);
                if (objM25110b == coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i2 == 1) {
                str = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15108a;
                AbstractC3193b.m15359b(objM25110b);
            } else {
                if (i2 == 2) {
                    str2 = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15108a;
                    AbstractC3193b.m15359b(objM25110b);
                    c1318f.getClass();
                    str2.getClass();
                    i93 i93VarM21590A = AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryDataEntity", "LanguageActiveDictionaryJoin"}, new jd0(str2, 6));
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15108a = str2;
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15112e = 3;
                    objM25110b = AbstractC3224d.m15542u(i93VarM21590A, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1);
                    if (objM25110b == coroutineSingletons) {
                        list = (List) objM25110b;
                        if (list == null) {
                            list = emptyList;
                        }
                        c1318f.getClass();
                        str2.getClass();
                        i93 i93VarM21590A2 = AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryDataEntity", "LanguageContextEntity", "LanguageAvailableDictionaryJoin"}, new jd0(str2, 7));
                        dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15108a = null;
                        dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15109b = list;
                        dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15112e = 4;
                        objM15542u = AbstractC3224d.m15542u(i93VarM21590A2, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1);
                        if (objM15542u != coroutineSingletons) {
                            List list4 = list;
                            objM25110b = objM15542u;
                            list2 = list4;
                        }
                    }
                    return coroutineSingletons;
                }
                if (i2 == 3) {
                    str2 = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15108a;
                    AbstractC3193b.m15359b(objM25110b);
                    list = (List) objM25110b;
                    if (list == null) {
                        list = emptyList;
                    }
                    c1318f.getClass();
                    str2.getClass();
                    i93 i93VarM21590A3 = AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryDataEntity", "LanguageContextEntity", "LanguageAvailableDictionaryJoin"}, new jd0(str2, 7));
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15108a = null;
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15109b = list;
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15112e = 4;
                    objM15542u = AbstractC3224d.m15542u(i93VarM21590A3, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1);
                    if (objM15542u != coroutineSingletons) {
                        List list5 = list;
                        objM25110b = objM15542u;
                        list2 = list5;
                    }
                    return coroutineSingletons;
                }
                if (i2 != 4) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15109b;
                AbstractC3193b.m15359b(objM25110b);
            }
            list3 = (List) objM25110b;
            if (list3 == null) {
                list3 = emptyList;
            }
            if (!list2.isEmpty() && !list3.isEmpty()) {
                return u91.m22603U0(list3, list2);
            }
            return emptyList;
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15108a = str;
            dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15112e = 2;
            if (m7203i(str, (ResultDictionariesForUser) objM25110b, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1) != coroutineSingletons) {
                str2 = str;
                c1318f.getClass();
                str2.getClass();
                i93 i93VarM21590A4 = AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryDataEntity", "LanguageActiveDictionaryJoin"}, new jd0(str2, 6));
                dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15108a = str2;
                dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15112e = 3;
                objM25110b = AbstractC3224d.m15542u(i93VarM21590A4, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1);
                if (objM25110b == coroutineSingletons) {
                    list = (List) objM25110b;
                    if (list == null) {
                        list = emptyList;
                    }
                    c1318f.getClass();
                    str2.getClass();
                    i93 i93VarM21590A5 = AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryDataEntity", "LanguageContextEntity", "LanguageAvailableDictionaryJoin"}, new jd0(str2, 7));
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15108a = null;
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15109b = list;
                    dictionaryRepositoryImpl$activeAndAvailableDictionaries$1.f15112e = 4;
                    objM15542u = AbstractC3224d.m15542u(i93VarM21590A5, dictionaryRepositoryImpl$activeAndAvailableDictionaries$1);
                    if (objM15542u != coroutineSingletons) {
                        List list6 = list;
                        objM25110b = objM15542u;
                        list2 = list6;
                        list3 = (List) objM25110b;
                        if (list3 == null) {
                            list3 = emptyList;
                        }
                        if (!list2.isEmpty()) {
                            return u91.m22603U0(list3, list2);
                        }
                        return emptyList;
                    }
                }
            }
            return coroutineSingletons;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 == r1) goto L36;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7196b(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        DictionaryRepositoryImpl$addDictionaryActive$1 dictionaryRepositoryImpl$addDictionaryActive$1;
        Integer num;
        Object objM2861d;
        if (continuationImpl instanceof DictionaryRepositoryImpl$addDictionaryActive$1) {
            dictionaryRepositoryImpl$addDictionaryActive$1 = (DictionaryRepositoryImpl$addDictionaryActive$1) continuationImpl;
            int i2 = dictionaryRepositoryImpl$addDictionaryActive$1.f15117e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dictionaryRepositoryImpl$addDictionaryActive$1.f15117e = i2 - Integer.MIN_VALUE;
            } else {
                dictionaryRepositoryImpl$addDictionaryActive$1 = new DictionaryRepositoryImpl$addDictionaryActive$1(this, continuationImpl);
            }
        } else {
            dictionaryRepositoryImpl$addDictionaryActive$1 = new DictionaryRepositoryImpl$addDictionaryActive$1(this, continuationImpl);
        }
        Object objM2861d2 = dictionaryRepositoryImpl$addDictionaryActive$1.f15115c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = dictionaryRepositoryImpl$addDictionaryActive$1.f15117e;
        xfa xfaVar = xfa.f68157a;
        C1318f c1318f = this.f16483b;
        int i4 = 0;
        int i5 = 1;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM2861d2);
            dictionaryRepositoryImpl$addDictionaryActive$1.f15113a = str;
            dictionaryRepositoryImpl$addDictionaryActive$1.f15114b = i;
            dictionaryRepositoryImpl$addDictionaryActive$1.f15117e = 1;
            objM2861d2 = AbstractC0758a.m2861d(new t70(str, 24), c1318f.f17021K, dictionaryRepositoryImpl$addDictionaryActive$1, true, false);
            if (objM2861d2 != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            i = dictionaryRepositoryImpl$addDictionaryActive$1.f15114b;
            str = dictionaryRepositoryImpl$addDictionaryActive$1.f15113a;
            AbstractC3193b.m15359b(objM2861d2);
        } else if (i3 == 2) {
            i = dictionaryRepositoryImpl$addDictionaryActive$1.f15114b;
            str = dictionaryRepositoryImpl$addDictionaryActive$1.f15113a;
            AbstractC3193b.m15359b(objM2861d2);
            jl4 jl4Var = new jl4(str, i);
            dictionaryRepositoryImpl$addDictionaryActive$1.f15113a = str;
            dictionaryRepositoryImpl$addDictionaryActive$1.f15114b = i;
            dictionaryRepositoryImpl$addDictionaryActive$1.f15117e = 3;
            objM2861d = AbstractC0758a.m2861d(new nf2(c1318f, jl4Var, i4), c1318f.f17021K, dictionaryRepositoryImpl$addDictionaryActive$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
        } else {
            if (i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = dictionaryRepositoryImpl$addDictionaryActive$1.f15114b;
            str = dictionaryRepositoryImpl$addDictionaryActive$1.f15113a;
            AbstractC3193b.m15359b(objM2861d2);
        }
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(DictionaryAddWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("id", Integer.valueOf(i))};
        hi8 hi8Var = new hi8(10);
        while (i4 < 2) {
            Pair pair = pairArr[i4];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
            i4++;
        }
        this.f16486e.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfaVar;
        Integer num2 = (Integer) objM2861d2;
        if (num2 == null) {
            num = new Integer(0);
        } else {
            int iIntValue = num2.intValue();
            Integer num3 = new Integer(iIntValue + 1);
            lda.m16121g(iIntValue);
            num = num3;
        }
        int iIntValue2 = num.intValue();
        dictionaryRepositoryImpl$addDictionaryActive$1.f15113a = str;
        dictionaryRepositoryImpl$addDictionaryActive$1.f15114b = i;
        dictionaryRepositoryImpl$addDictionaryActive$1.f15117e = 2;
        Object objM2861d3 = AbstractC0758a.m2861d(new rv0(iIntValue2, i, i5), c1318f.f17021K, dictionaryRepositoryImpl$addDictionaryActive$1, false, true);
        if (objM2861d3 != coroutineSingletons) {
            objM2861d3 = xfaVar;
        }
        if (objM2861d3 != coroutineSingletons) {
            jl4 jl4Var2 = new jl4(str, i);
            dictionaryRepositoryImpl$addDictionaryActive$1.f15113a = str;
            dictionaryRepositoryImpl$addDictionaryActive$1.f15114b = i;
            dictionaryRepositoryImpl$addDictionaryActive$1.f15117e = 3;
            objM2861d = AbstractC0758a.m2861d(new nf2(c1318f, jl4Var2, i4), c1318f.f17021K, dictionaryRepositoryImpl$addDictionaryActive$1, false, true);
            if (objM2861d != coroutineSingletons) {
                objM2861d = xfaVar;
            }
        }
        return coroutineSingletons;
    }

    /* JADX INFO: renamed from: c */
    public final Object m7197c(int i, int i2, String str, SuspendLambda suspendLambda) {
        return AbstractC0747e.m2849b(this.f16482a, new DictionaryRepositoryImpl$changePosition$2(this, str, i, i2, null), suspendLambda);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0102  */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:55:0x012c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0129 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: d */
    public final Object m7198d(String str, ContinuationImpl continuationImpl) throws Throwable {
        DictionaryRepositoryImpl$fetchAvailableLocales$1 dictionaryRepositoryImpl$fetchAvailableLocales$1;
        ArrayList arrayList;
        String str2;
        Iterator it;
        int i;
        boolean zHasNext;
        Object obj;
        Object objM2861d;
        if (continuationImpl instanceof DictionaryRepositoryImpl$fetchAvailableLocales$1) {
            dictionaryRepositoryImpl$fetchAvailableLocales$1 = (DictionaryRepositoryImpl$fetchAvailableLocales$1) continuationImpl;
            int i2 = dictionaryRepositoryImpl$fetchAvailableLocales$1.f15134g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dictionaryRepositoryImpl$fetchAvailableLocales$1.f15134g = i2 - Integer.MIN_VALUE;
            } else {
                dictionaryRepositoryImpl$fetchAvailableLocales$1 = new DictionaryRepositoryImpl$fetchAvailableLocales$1(this, continuationImpl);
            }
        } else {
            dictionaryRepositoryImpl$fetchAvailableLocales$1 = new DictionaryRepositoryImpl$fetchAvailableLocales$1(this, continuationImpl);
        }
        Object objM25110b = dictionaryRepositoryImpl$fetchAvailableLocales$1.f15132e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = dictionaryRepositoryImpl$fetchAvailableLocales$1.f15134g;
        int i4 = 0;
        wi5 wi5Var = this.f16484c;
        if (i3 == 0) {
            AbstractC3193b.m15359b(objM25110b);
            dictionaryRepositoryImpl$fetchAvailableLocales$1.f15128a = str;
            dictionaryRepositoryImpl$fetchAvailableLocales$1.f15134g = 1;
            objM25110b = this.f16485d.m25110b(str, dictionaryRepositoryImpl$fetchAvailableLocales$1);
            if (objM25110b != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i3 == 1) {
            str = dictionaryRepositoryImpl$fetchAvailableLocales$1.f15128a;
            AbstractC3193b.m15359b(objM25110b);
        } else if (i3 == 2) {
            arrayList = dictionaryRepositoryImpl$fetchAvailableLocales$1.f15129b;
            str = dictionaryRepositoryImpl$fetchAvailableLocales$1.f15128a;
            AbstractC3193b.m15359b(objM25110b);
            str2 = str;
            it = arrayList.iterator();
            i = 0;
        } else {
            if (i3 != 3) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = dictionaryRepositoryImpl$fetchAvailableLocales$1.f15131d;
            it = dictionaryRepositoryImpl$fetchAvailableLocales$1.f15130c;
            str2 = dictionaryRepositoryImpl$fetchAvailableLocales$1.f15128a;
            AbstractC3193b.m15359b(objM25110b);
        }
        do {
            zHasNext = it.hasNext();
            obj = xfa.f68157a;
            if (zHasNext) {
                return obj;
            }
            vl4 vl4Var = new vl4(str2, ((qf2) it.next()).f57682a);
            dictionaryRepositoryImpl$fetchAvailableLocales$1.f15128a = str2;
            dictionaryRepositoryImpl$fetchAvailableLocales$1.f15129b = null;
            dictionaryRepositoryImpl$fetchAvailableLocales$1.f15130c = it;
            dictionaryRepositoryImpl$fetchAvailableLocales$1.f15131d = i;
            dictionaryRepositoryImpl$fetchAvailableLocales$1.f15134g = 3;
            objM2861d = AbstractC0758a.m2861d(new ui5(i4, wi5Var, vl4Var), wi5Var.f66849K, dictionaryRepositoryImpl$fetchAvailableLocales$1, false, true);
            if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                obj = objM2861d;
            }
        } while (obj != coroutineSingletons);
        return coroutineSingletons;
        Map map = ((ResultDictionariesForUser) objM25110b).f20824c;
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Pair pair = str3 != null ? new Pair(entry.getKey(), str3) : null;
            if (pair != null) {
                arrayList2.add(pair);
            }
        }
        ArrayList<Pair> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((CharSequence) ((Pair) obj2).f47624b).length() != 0) {
                arrayList3.add(obj2);
            }
        }
        ArrayList arrayList4 = new ArrayList(v91.m23189q0(arrayList3, 10));
        for (Pair pair2 : arrayList3) {
            arrayList4.add(new qf2((String) pair2.f47623a, (String) pair2.f47624b));
        }
        dictionaryRepositoryImpl$fetchAvailableLocales$1.f15128a = str;
        dictionaryRepositoryImpl$fetchAvailableLocales$1.f15129b = arrayList4;
        dictionaryRepositoryImpl$fetchAvailableLocales$1.f15134g = 2;
        if (wi5Var.mo4096w0(arrayList4, dictionaryRepositoryImpl$fetchAvailableLocales$1) != coroutineSingletons) {
            arrayList = arrayList4;
            str2 = str;
            it = arrayList.iterator();
            i = 0;
            do {
                zHasNext = it.hasNext();
                obj = xfa.f68157a;
                if (zHasNext) {
                    return obj;
                }
                vl4 vl4Var2 = new vl4(str2, ((qf2) it.next()).f57682a);
                dictionaryRepositoryImpl$fetchAvailableLocales$1.f15128a = str2;
                dictionaryRepositoryImpl$fetchAvailableLocales$1.f15129b = null;
                dictionaryRepositoryImpl$fetchAvailableLocales$1.f15130c = it;
                dictionaryRepositoryImpl$fetchAvailableLocales$1.f15131d = i;
                dictionaryRepositoryImpl$fetchAvailableLocales$1.f15134g = 3;
                objM2861d = AbstractC0758a.m2861d(new ui5(i4, wi5Var, vl4Var2), wi5Var.f66849K, dictionaryRepositoryImpl$fetchAvailableLocales$1, false, true);
                if (objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED) {
                    obj = objM2861d;
                }
            } while (obj != coroutineSingletons);
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (m7203i(r7, (com.lingq.core.network.api.result.ResultDictionariesForUser) r8, r0) == r1) goto L25;
     */
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m7199e(String str, ContinuationImpl continuationImpl) throws Throwable {
        DictionaryRepositoryImpl$fetchDictionaries$1 dictionaryRepositoryImpl$fetchDictionaries$1;
        if (continuationImpl instanceof DictionaryRepositoryImpl$fetchDictionaries$1) {
            dictionaryRepositoryImpl$fetchDictionaries$1 = (DictionaryRepositoryImpl$fetchDictionaries$1) continuationImpl;
            int i = dictionaryRepositoryImpl$fetchDictionaries$1.f15138d;
            if ((i & Integer.MIN_VALUE) != 0) {
                dictionaryRepositoryImpl$fetchDictionaries$1.f15138d = i - Integer.MIN_VALUE;
            } else {
                dictionaryRepositoryImpl$fetchDictionaries$1 = new DictionaryRepositoryImpl$fetchDictionaries$1(this, continuationImpl);
            }
        } else {
            dictionaryRepositoryImpl$fetchDictionaries$1 = new DictionaryRepositoryImpl$fetchDictionaries$1(this, continuationImpl);
        }
        Object objM25110b = dictionaryRepositoryImpl$fetchDictionaries$1.f15136b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = dictionaryRepositoryImpl$fetchDictionaries$1.f15138d;
        try {
            if (i2 == 0) {
                AbstractC3193b.m15359b(objM25110b);
                yf2 yf2Var = this.f16485d;
                dictionaryRepositoryImpl$fetchDictionaries$1.f15135a = str;
                dictionaryRepositoryImpl$fetchDictionaries$1.f15138d = 1;
                objM25110b = yf2Var.m25110b(str, dictionaryRepositoryImpl$fetchDictionaries$1);
                if (objM25110b == obj) {
                }
                return obj;
            }
            if (i2 == 1) {
                str = dictionaryRepositoryImpl$fetchDictionaries$1.f15135a;
                AbstractC3193b.m15359b(objM25110b);
            } else {
                if (i2 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                AbstractC3193b.m15359b(objM25110b);
            }
            return xfa.f68157a;
            dictionaryRepositoryImpl$fetchDictionaries$1.f15135a = null;
            dictionaryRepositoryImpl$fetchDictionaries$1.f15138d = 2;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: f */
    public final c83 m7200f(String str, String str2) {
        str.getClass();
        str2.getClass();
        C1318f c1318f = this.f16483b;
        c1318f.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryDataEntity", "LanguageContextEntity", "LanguageAvailableDictionaryJoin"}, new md0(str2, 10, str)));
    }

    /* JADX INFO: renamed from: g */
    public final c83 m7201g(String str) {
        str.getClass();
        C1318f c1318f = this.f16483b;
        c1318f.getClass();
        return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1318f.f17021K, true, new String[]{"DictionaryLocaleEntity", "LanguageDictionaryLocaleJoin"}, new t70(str, 25)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m7202h(int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        DictionaryRepositoryImpl$removeActiveDictionary$1 dictionaryRepositoryImpl$removeActiveDictionary$1;
        if (continuationImpl instanceof DictionaryRepositoryImpl$removeActiveDictionary$1) {
            dictionaryRepositoryImpl$removeActiveDictionary$1 = (DictionaryRepositoryImpl$removeActiveDictionary$1) continuationImpl;
            int i2 = dictionaryRepositoryImpl$removeActiveDictionary$1.f15143e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dictionaryRepositoryImpl$removeActiveDictionary$1.f15143e = i2 - Integer.MIN_VALUE;
            } else {
                dictionaryRepositoryImpl$removeActiveDictionary$1 = new DictionaryRepositoryImpl$removeActiveDictionary$1(this, continuationImpl);
            }
        } else {
            dictionaryRepositoryImpl$removeActiveDictionary$1 = new DictionaryRepositoryImpl$removeActiveDictionary$1(this, continuationImpl);
        }
        Object obj = dictionaryRepositoryImpl$removeActiveDictionary$1.f15141c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = dictionaryRepositoryImpl$removeActiveDictionary$1.f15143e;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            dictionaryRepositoryImpl$removeActiveDictionary$1.f15140b = str;
            dictionaryRepositoryImpl$removeActiveDictionary$1.f15139a = i;
            dictionaryRepositoryImpl$removeActiveDictionary$1.f15143e = 1;
            if (this.f16483b.m7475A0(i, str, dictionaryRepositoryImpl$removeActiveDictionary$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = dictionaryRepositoryImpl$removeActiveDictionary$1.f15139a;
            str = dictionaryRepositoryImpl$removeActiveDictionary$1.f15140b;
            AbstractC3193b.m15359b(obj);
        }
        xj1 xj1Var = new xj1();
        xj1Var.m24558b(NetworkType.CONNECTED);
        tx6 tx6Var = (tx6) ((tx6) new tx6(DictionaryDeleteWorker.class).m15005d(BackoffPolicy.LINEAR, 10000L, TimeUnit.MILLISECONDS)).m15006e(xj1Var.m24557a());
        Pair[] pairArr = {new Pair("language", str), new Pair("pk", Integer.valueOf(i))};
        hi8 hi8Var = new hi8(10);
        for (int i4 = 0; i4 < 2; i4++) {
            Pair pair = pairArr[i4];
            hi8Var.m13287x(pair.f47624b, (String) pair.f47623a);
        }
        this.f16486e.m2912a((ux6) ((tx6) tx6Var.m15008g(hi8Var.m13282k())).m15004a());
        return xfa.f68157a;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x011f  */
    /* JADX WARN: Code duplicated, block: B:26:0x0159  */
    /* JADX WARN: Code duplicated, block: B:29:0x0160  */
    /* JADX WARN: Code duplicated, block: B:31:0x0167  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [java.util.Iterator, java.util.List, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0159 -> B:27:0x015c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: i */
    public final java.lang.Object m7203i(java.lang.String r17, com.lingq.core.network.api.result.ResultDictionariesForUser r18, kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instruction units count: 1038
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.core.data.repository.C1292h.m7203i(java.lang.String, com.lingq.core.network.api.result.ResultDictionariesForUser, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
