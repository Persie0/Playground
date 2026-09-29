package com.lingq.feature.reader.old;

import com.lingq.core.domain.model.LanguageLearn;
import com.lingq.core.domain.model.reader.ReaderPageMode;
import com.lingq.core.domain.model.theme.ReaderFont;
import com.lingq.core.domain.model.theme.TextHighlightStyle;
import com.lingq.core.domain.store.AudioUnderlineMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.C3386nv;
import p000.aj3;
import p000.c32;
import p000.cma;
import p000.e83;
import p000.fa4;
import p000.nz9;
import p000.vs3;
import p000.xfa;
import p000.xv7;
import p000.yz7;
import p000.zz7;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$20$invokeSuspend$$inlined$combine$1$3", m4291f = "ReaderViewModel.kt", m4292l = {234}, m4293m = "invokeSuspend", m4294v = 2)
public final class ReaderViewModel$20$invokeSuspend$$inlined$combine$1$3 extends SuspendLambda implements aj3 {

    /* JADX INFO: renamed from: a */
    public int f28859a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ e83 f28860b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object[] f28861c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C2412n f28862d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$20$invokeSuspend$$inlined$combine$1$3(C2412n c2412n, Continuation continuation) {
        super(3, continuation);
        this.f28862d = c2412n;
    }

    @Override // p000.aj3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ReaderViewModel$20$invokeSuspend$$inlined$combine$1$3 readerViewModel$20$invokeSuspend$$inlined$combine$1$3 = new ReaderViewModel$20$invokeSuspend$$inlined$combine$1$3(this.f28862d, (Continuation) obj3);
        readerViewModel$20$invokeSuspend$$inlined$combine$1$3.f28860b = (e83) obj;
        readerViewModel$20$invokeSuspend$$inlined$combine$1$3.f28861c = (Object[]) obj2;
        return readerViewModel$20$invokeSuspend$$inlined$combine$1$3.invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b9  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Map mapM15370W;
        Pair pair;
        Pair pair2;
        Object value;
        C2412n c2412n = this.f28862d;
        cma cmaVar = c2412n.f29340b;
        e83 e83Var = this.f28860b;
        Object[] objArr = this.f28861c;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f28859a;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            Object obj2 = objArr[0];
            Map map = obj2 instanceof Map ? (Map) obj2 : null;
            if (map == null) {
                mapM15370W = AbstractC3194a.m15360M();
            } else {
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    Object key = entry.getKey();
                    Object value2 = entry.getValue();
                    if (!(key instanceof String)) {
                        key = null;
                    }
                    String str = (String) key;
                    if (str != null) {
                        if (!(value2 instanceof ReaderFont)) {
                            value2 = null;
                        }
                        ReaderFont readerFont = (ReaderFont) value2;
                        if (readerFont == null) {
                            pair = null;
                        } else {
                            pair = new Pair(str, readerFont);
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
            Object obj3 = objArr[1];
            obj3.getClass();
            int iIntValue = ((Integer) obj3).intValue();
            Object obj4 = objArr[2];
            obj4.getClass();
            double dDoubleValue = ((Double) obj4).doubleValue();
            Object obj5 = objArr[3];
            obj5.getClass();
            TextHighlightStyle textHighlightStyle = (TextHighlightStyle) obj5;
            Object obj6 = objArr[4];
            obj6.getClass();
            String str2 = (String) obj6;
            Object obj7 = objArr[5];
            obj7.getClass();
            vs3 vs3Var = (vs3) obj7;
            Object obj8 = objArr[6];
            Pair pair3 = obj8 instanceof Pair ? (Pair) obj8 : null;
            if (pair3 == null) {
                pair2 = null;
            } else {
                Object obj9 = pair3.f47623a;
                if (!(obj9 instanceof ReaderFont)) {
                    obj9 = null;
                }
                ReaderFont readerFont2 = (ReaderFont) obj9;
                if (readerFont2 == null) {
                    pair2 = null;
                } else {
                    Object obj10 = pair3.f47624b;
                    if (!(obj10 instanceof Integer)) {
                        obj10 = null;
                    }
                    Integer num = (Integer) obj10;
                    if (num == null) {
                        pair2 = null;
                    } else {
                        pair2 = new Pair(readerFont2, num);
                    }
                }
            }
            Object obj11 = objArr[7];
            obj11.getClass();
            String str3 = (String) obj11;
            Object obj12 = objArr[8];
            obj12.getClass();
            String str4 = (String) obj12;
            Object obj13 = objArr[9];
            obj13.getClass();
            String str5 = (String) obj13;
            Object obj14 = objArr[10];
            obj14.getClass();
            String str6 = (String) obj14;
            Object obj15 = objArr[11];
            obj15.getClass();
            String str7 = (String) obj15;
            Object obj16 = objArr[12];
            obj16.getClass();
            Boolean bool = (Boolean) obj16;
            boolean zBooleanValue = bool.booleanValue();
            Object obj17 = objArr[13];
            obj17.getClass();
            ReaderPageMode readerPageMode = (ReaderPageMode) obj17;
            String strMo4589b2 = cmaVar.mo4589b2();
            if (fa4.m11650l(strMo4589b2, LanguageLearn.Japanese.getCode())) {
                str3 = str5;
            } else if (!fa4.m11650l(strMo4589b2, LanguageLearn.Mandarin.getCode())) {
                if (fa4.m11650l(strMo4589b2, LanguageLearn.ChineseTraditional.getCode())) {
                    str3 = str4;
                } else if (fa4.m11650l(strMo4589b2, LanguageLearn.Cantonese.getCode())) {
                    str3 = str6;
                } else {
                    str3 = AbstractC3184kh.m15230y(strMo4589b2) ? str7 : "Off";
                }
            }
            C3244l c3244l = c2412n.f29296M0;
            do {
                value = c3244l.getValue();
                ((Boolean) value).getClass();
            } while (!c3244l.m15570h(value, bool));
            ReaderFont readerFontM24710a = (ReaderFont) mapM15370W.get(cmaVar.mo4589b2());
            if (readerFontM24710a == null) {
                xv7 xv7Var = ReaderFont.Companion;
                String strMo4589b3 = cmaVar.mo4589b2();
                xv7Var.getClass();
                readerFontM24710a = xv7.m24710a(strMo4589b3);
            }
            ReaderFont readerFont3 = readerFontM24710a;
            xv7 xv7Var2 = ReaderFont.Companion;
            String strMo4589b4 = cmaVar.mo4589b2();
            xv7Var2.getClass();
            ArrayList arrayListM24712c = xv7.m24712c(strMo4589b4);
            zz7 zz7Var = zz7.f72426a;
            yz7 yz7VarM25898a = zz7.m25898a(str2);
            if (yz7VarM25898a == null) {
                yz7VarM25898a = zz7.f72427b;
            }
            nz9 nz9Var = new nz9(iIntValue, dDoubleValue, arrayListM24712c, readerFont3, pair2, yz7VarM25898a, vs3Var, textHighlightStyle, !str3.equals("Off") && dDoubleValue < 1.15d, zBooleanValue, readerPageMode, false, false, false, false, (AudioUnderlineMode) null, false, false, false, false, (List) null, (String) null, (List) null, (String) null, 33552384);
            this.f28860b = null;
            this.f28861c = null;
            this.f28859a = 1;
            if (e83Var.emit(nz9Var, this) == coroutineSingletons) {
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
