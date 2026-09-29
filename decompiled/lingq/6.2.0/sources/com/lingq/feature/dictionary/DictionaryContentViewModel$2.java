package com.lingq.feature.dictionary;

import com.lingq.core.domain.model.language.DictionaryData;
import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.fa4;
import p000.lf2;
import p000.pf2;
import p000.v91;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.dictionary.DictionaryContentViewModel$2", m4291f = "DictionaryContentViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class DictionaryContentViewModel$2 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f25773a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2069m f25774b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DictionaryContentViewModel$2(C2069m c2069m, Continuation continuation) {
        super(2, continuation);
        this.f25774b = c2069m;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DictionaryContentViewModel$2 dictionaryContentViewModel$2 = new DictionaryContentViewModel$2(this.f25774b, continuation);
        dictionaryContentViewModel$2.f25773a = obj;
        return dictionaryContentViewModel$2;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        DictionaryContentViewModel$2 dictionaryContentViewModel$2 = (DictionaryContentViewModel$2) create((List) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        dictionaryContentViewModel$2.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        lf2 lf2Var;
        ArrayList arrayList;
        List list = (List) this.f25773a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List<DictionaryData> list2 = list;
        String str = "";
        int i = 0;
        for (DictionaryData dictionaryData : list2) {
            if (!fa4.m11650l(dictionaryData.f19014g, str)) {
                str = dictionaryData.f19014g;
                i++;
            }
        }
        C3244l c3244l = this.f25774b.f25850e;
        do {
            value = c3244l.getValue();
            lf2Var = (lf2) value;
            arrayList = new ArrayList(v91.m23189q0(list2, 10));
            for (DictionaryData dictionaryData2 : list2) {
                boolean z = true;
                if (i <= 1) {
                    z = false;
                }
                arrayList.add(new pf2(dictionaryData2, z));
            }
        } while (!c3244l.m15570h(value, lf2.m16158a(lf2Var, null, null, false, null, null, arrayList, false, null, 223)));
        return xfa.f68157a;
    }
}
