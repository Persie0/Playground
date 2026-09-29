package com.lingq.core.database.dao;

import androidx.room.AbstractC0746d;
import androidx.room.util.AbstractC0758a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.AbstractC3393o1;
import p000.C3386nv;
import p000.bb0;
import p000.bl2;
import p000.bq1;
import p000.jl4;
import p000.mf2;
import p000.nf2;
import p000.of2;
import p000.qn0;
import p000.rv0;
import p000.sv0;
import p000.ux5;
import p000.xfa;

/* JADX INFO: renamed from: com.lingq.core.database.dao.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1318f extends bq1 {
    public static final of2 Companion = new of2();

    /* JADX INFO: renamed from: K */
    public final AbstractC0746d f17021K;

    /* JADX INFO: renamed from: L */
    public final qn0 f17022L;

    /* JADX INFO: renamed from: M */
    public final bl2 f17023M;

    /* JADX INFO: renamed from: N */
    public final bl2 f17024N;

    /* JADX INFO: renamed from: O */
    public final bl2 f17025O;

    public C1318f(AbstractC0746d abstractC0746d) {
        this.f17021K = abstractC0746d;
        int i = 11;
        this.f17022L = new qn0(i);
        int i2 = 12;
        this.f17023M = new bl2(new sv0(10), new qn0(i2));
        this.f17024N = new bl2(new sv0(i), new qn0(13));
        this.f17025O = new bl2(new sv0(i2), new qn0(14));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: B0 */
    public static Object m7473B0(C1318f c1318f, int i, String str, ContinuationImpl continuationImpl) throws Throwable {
        DictionaryDao$removeActiveDictionary$1 dictionaryDao$removeActiveDictionary$1;
        if (continuationImpl instanceof DictionaryDao$removeActiveDictionary$1) {
            dictionaryDao$removeActiveDictionary$1 = (DictionaryDao$removeActiveDictionary$1) continuationImpl;
            int i2 = dictionaryDao$removeActiveDictionary$1.f16921f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dictionaryDao$removeActiveDictionary$1.f16921f = i2 - Integer.MIN_VALUE;
            } else {
                dictionaryDao$removeActiveDictionary$1 = new DictionaryDao$removeActiveDictionary$1(c1318f, continuationImpl);
            }
        } else {
            dictionaryDao$removeActiveDictionary$1 = new DictionaryDao$removeActiveDictionary$1(c1318f, continuationImpl);
        }
        Object obj = dictionaryDao$removeActiveDictionary$1.f16919d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = dictionaryDao$removeActiveDictionary$1.f16921f;
        xfa xfaVar = xfa.f68157a;
        int i4 = 1;
        if (i3 == 0) {
            AbstractC3193b.m15359b(obj);
            dictionaryDao$removeActiveDictionary$1.f16916a = c1318f;
            dictionaryDao$removeActiveDictionary$1.f16917b = str;
            dictionaryDao$removeActiveDictionary$1.f16918c = i;
            dictionaryDao$removeActiveDictionary$1.f16921f = 1;
            if (c1318f.m7476C0(i, -1, dictionaryDao$removeActiveDictionary$1) != coroutineSingletons) {
            }
        }
        if (i3 != 1) {
            if (i3 == 2) {
                AbstractC3193b.m15359b(obj);
                return xfaVar;
            }
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i = dictionaryDao$removeActiveDictionary$1.f16918c;
        str = dictionaryDao$removeActiveDictionary$1.f16917b;
        c1318f = dictionaryDao$removeActiveDictionary$1.f16916a;
        AbstractC3193b.m15359b(obj);
        jl4 jl4Var = new jl4(str, i);
        dictionaryDao$removeActiveDictionary$1.f16916a = null;
        dictionaryDao$removeActiveDictionary$1.f16917b = null;
        dictionaryDao$removeActiveDictionary$1.f16918c = i;
        dictionaryDao$removeActiveDictionary$1.f16921f = 2;
        Object objM2861d = AbstractC0758a.m2861d(new nf2(c1318f, jl4Var, i4), c1318f.f17021K, dictionaryDao$removeActiveDictionary$1, false, true);
        if (objM2861d != coroutineSingletons) {
            objM2861d = xfaVar;
        }
        return objM2861d == coroutineSingletons ? coroutineSingletons : xfaVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x0093 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:? A[LOOP:0: B:20:0x0073->B:30:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        if (r10 == r1) goto L24;
     */
    /* JADX INFO: renamed from: z0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object m7474z0(C1318f c1318f, String str, ArrayList arrayList, ContinuationImpl continuationImpl) throws Throwable {
        DictionaryDao$removeActiveDictionaries$1 dictionaryDao$removeActiveDictionaries$1;
        String str2;
        Iterator it;
        C1318f c1318f2;
        int i;
        int iIntValue;
        if (continuationImpl instanceof DictionaryDao$removeActiveDictionaries$1) {
            dictionaryDao$removeActiveDictionaries$1 = (DictionaryDao$removeActiveDictionaries$1) continuationImpl;
            int i2 = dictionaryDao$removeActiveDictionaries$1.f16915g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dictionaryDao$removeActiveDictionaries$1.f16915g = i2 - Integer.MIN_VALUE;
            } else {
                dictionaryDao$removeActiveDictionaries$1 = new DictionaryDao$removeActiveDictionaries$1(c1318f, continuationImpl);
            }
        } else {
            dictionaryDao$removeActiveDictionaries$1 = new DictionaryDao$removeActiveDictionaries$1(c1318f, continuationImpl);
        }
        Object objM2861d = dictionaryDao$removeActiveDictionaries$1.f16913e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = dictionaryDao$removeActiveDictionaries$1.f16915g;
        if (i3 != 0) {
            if (i3 == 1) {
                str = dictionaryDao$removeActiveDictionaries$1.f16910b;
                c1318f = dictionaryDao$removeActiveDictionaries$1.f16909a;
                AbstractC3193b.m15359b(objM2861d);
            } else {
                if (i3 != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i = dictionaryDao$removeActiveDictionaries$1.f16912d;
                it = dictionaryDao$removeActiveDictionaries$1.f16911c;
                str2 = dictionaryDao$removeActiveDictionaries$1.f16910b;
                c1318f2 = dictionaryDao$removeActiveDictionaries$1.f16909a;
                AbstractC3193b.m15359b(objM2861d);
            }
            while (it.hasNext()) {
                iIntValue = ((Number) it.next()).intValue();
                dictionaryDao$removeActiveDictionaries$1.f16909a = c1318f2;
                dictionaryDao$removeActiveDictionaries$1.f16910b = str2;
                dictionaryDao$removeActiveDictionaries$1.f16911c = it;
                dictionaryDao$removeActiveDictionaries$1.f16912d = i;
                dictionaryDao$removeActiveDictionaries$1.f16915g = 2;
                if (c1318f2.m7475A0(iIntValue, str2, dictionaryDao$removeActiveDictionaries$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            return xfa.f68157a;
        }
        AbstractC3193b.m15359b(objM2861d);
        dictionaryDao$removeActiveDictionaries$1.f16909a = c1318f;
        dictionaryDao$removeActiveDictionaries$1.f16910b = str;
        dictionaryDao$removeActiveDictionaries$1.f16915g = 1;
        objM2861d = AbstractC0758a.m2861d(new bb0(AbstractC3393o1.m17736k(")", ux5.m22997t("SELECT id FROM LanguageActiveDictionaryJoin WHERE code = ? AND id NOT IN("), arrayList), str, arrayList, 6), c1318f.f17021K, dictionaryDao$removeActiveDictionaries$1, true, true);
        str2 = str;
        it = ((List) objM2861d).iterator();
        c1318f2 = c1318f;
        i = 0;
        while (it.hasNext()) {
            iIntValue = ((Number) it.next()).intValue();
            dictionaryDao$removeActiveDictionaries$1.f16909a = c1318f2;
            dictionaryDao$removeActiveDictionaries$1.f16910b = str2;
            dictionaryDao$removeActiveDictionaries$1.f16911c = it;
            dictionaryDao$removeActiveDictionaries$1.f16912d = i;
            dictionaryDao$removeActiveDictionaries$1.f16915g = 2;
            if (c1318f2.m7475A0(iIntValue, str2, dictionaryDao$removeActiveDictionaries$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: A0 */
    public final Object m7475A0(int i, String str, ContinuationImpl continuationImpl) {
        Object objM2860c = AbstractC0758a.m2860c(new DictionaryDao_Impl$removeActiveDictionary$2(this, i, str, null), this.f17021K, continuationImpl);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }

    /* JADX INFO: renamed from: C0 */
    public final Object m7476C0(int i, int i2, ContinuationImpl continuationImpl) {
        Object objM2861d = AbstractC0758a.m2861d(new rv0(i2, i, 2), this.f17021K, continuationImpl, false, true);
        return objM2861d == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2861d : xfa.f68157a;
    }

    @Override // p000.bq1
    /* JADX INFO: renamed from: w0 */
    public final Object mo4096w0(List list, Continuation continuation) {
        return AbstractC0758a.m2861d(new mf2(this, list, 1), this.f17021K, continuation, false, true);
    }

    /* JADX INFO: renamed from: y0 */
    public final Object m7477y0(String str, ArrayList arrayList, Continuation continuation) {
        Object objM2860c = AbstractC0758a.m2860c(new DictionaryDao_Impl$removeActiveDictionaries$2(this, str, arrayList, null), this.f17021K, continuation);
        return objM2860c == CoroutineSingletons.COROUTINE_SUSPENDED ? objM2860c : xfa.f68157a;
    }
}
