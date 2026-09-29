package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.lesson.Lesson;
import com.lingq.core.domain.model.reader.ReaderPageMode;
import com.lingq.core.domain.model.theme.ReaderFont;
import java.util.ArrayList;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.AbstractC3184kh;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.cma;
import p000.e83;
import p000.fa4;
import p000.u65;
import p000.v65;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$special$$inlined$combine$1$3", m4291f = "ReaderViewModel.kt", m4292l = {234}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderViewModel$special$$inlined$combine$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f29090a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f29091b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f29092c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2412n f29093d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$special$$inlined$combine$1$3(C2412n c2412n, Continuation continuation) {
        super(3, continuation);
        this.f29093d = c2412n;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$special$$inlined$combine$1$3 readerViewModel$special$$inlined$combine$1$3 = new ReaderViewModel$special$$inlined$combine$1$3(this.f29093d, (Continuation) obj3);
        readerViewModel$special$$inlined$combine$1$3.f29091b = (e83) obj;
        readerViewModel$special$$inlined$combine$1$3.f29092c = (Object[]) obj2;
        return readerViewModel$special$$inlined$combine$1$3.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006e  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map mapM15370W;
        Pair pair;
        String str;
        cma cmaVar = this.f29093d.f29340b;
        e83 e83Var = this.f29091b;
        Object[] objArr = this.f29092c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f29090a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Object obj2 = objArr[0];
            obj2.getClass();
            Lesson lesson = (Lesson) obj2;
            Object obj3 = objArr[1];
            obj3.getClass();
            u65 u65Var = (u65) obj3;
            Object obj4 = objArr[2];
            Map map = obj4 instanceof Map ? (Map) obj4 : null;
            if (map == null) {
                mapM15370W = AbstractC3194a.m15360M();
            } else {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    if (!(key instanceof String)) {
                        key = null;
                    }
                    String str2 = (String) key;
                    if (str2 != null) {
                        if (!(value instanceof ReaderFont)) {
                            value = null;
                        }
                        ReaderFont readerFont = (ReaderFont) value;
                        if (readerFont == null) {
                            pair = null;
                        } else {
                            pair = new Pair(str2, readerFont);
                        }
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                mapM15370W = AbstractC3194a.m15370W(arrayList);
            }
            Object obj5 = objArr[3];
            obj5.getClass();
            int iIntValue = ((Integer) obj5).intValue();
            Object obj6 = objArr[4];
            obj6.getClass();
            double dDoubleValue = ((Double) obj6).doubleValue();
            Object obj7 = objArr[5];
            obj7.getClass();
            String str3 = (String) obj7;
            Object obj8 = objArr[6];
            obj8.getClass();
            String str4 = (String) obj8;
            Object obj9 = objArr[7];
            obj9.getClass();
            String str5 = (String) obj9;
            Object obj10 = objArr[8];
            obj10.getClass();
            String str6 = (String) obj10;
            Object obj11 = objArr[9];
            obj11.getClass();
            String str7 = (String) obj11;
            Object obj12 = objArr[10];
            obj12.getClass();
            boolean zBooleanValue = ((Boolean) obj12).booleanValue();
            Object obj13 = objArr[11];
            obj13.getClass();
            ReaderPageMode readerPageMode = (ReaderPageMode) obj13;
            ReaderFont readerFont2 = (ReaderFont) mapM15370W.get(cmaVar.mo4589b2());
            if (readerFont2 == null) {
                readerFont2 = ReaderFont.DmSans;
            }
            ReaderFont readerFont3 = readerFont2;
            String strMo4589b2 = cmaVar.mo4589b2();
            if (fa4.m11650l(strMo4589b2, LanguageLearn.Japanese.getCode())) {
                str = str5;
            } else if (fa4.m11650l(strMo4589b2, LanguageLearn.Mandarin.getCode())) {
                str = str3;
            } else if (fa4.m11650l(strMo4589b2, LanguageLearn.ChineseTraditional.getCode())) {
                str = str4;
            } else if (fa4.m11650l(strMo4589b2, LanguageLearn.Cantonese.getCode())) {
                str = str6;
            } else {
                str = AbstractC3184kh.m15230y(strMo4589b2) ? str7 : "Off";
            }
            double d = dDoubleValue;
            String str8 = u65Var.f63489a;
            ArrayList arrayList2 = u65Var.f63490b;
            if (!str.equals("Off") && d < 1.15d) {
                d = 1.15d;
            }
            v65 v65Var = new v65(lesson, str8, arrayList2, readerFont3, iIntValue, d, u65Var.f63492d, u65Var.f63491c, str3, str4, str5, str6, str7, zBooleanValue, readerPageMode);
            this.f29091b = null;
            this.f29092c = null;
            this.f29090a = 1;
            if (e83Var.emit(v65Var, this) == coroutineSingletons) {
                return coroutineSingletons;
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
