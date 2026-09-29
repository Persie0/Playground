package com.lingq.core.p012ui.highlightedtext;

import androidx.compose.animation.AbstractC0072k;
import androidx.compose.animation.core.C0059a;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.status.WordStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.AbstractC3193b;
import kotlin.collections.AbstractC3194a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aa1;
import p000.c32;
import p000.cd9;
import p000.fa4;
import p000.fda;
import p000.jt3;
import p000.oc9;
import p000.oh9;
import p000.q7b;
import p000.s78;
import p000.un1;
import p000.v91;
import p000.wfb;
import p000.xc9;
import p000.xfa;
import p000.zi3;
import p000.zs3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.core.ui.highlightedtext.HighlightedTextKt$HighlightedText$4$1", m4291f = "HighlightedText.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
final class HighlightedTextKt$HighlightedText$4$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public /* synthetic */ Object f23998a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ jt3 f23999b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ cd9 f24000c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ s78 f24001d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ fda f24002e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HighlightedTextKt$HighlightedText$4$1(jt3 jt3Var, cd9 cd9Var, s78 s78Var, fda fdaVar, Continuation continuation) {
        super(2, continuation);
        this.f23999b = jt3Var;
        this.f24000c = cd9Var;
        this.f24001d = s78Var;
        this.f24002e = fdaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        HighlightedTextKt$HighlightedText$4$1 highlightedTextKt$HighlightedText$4$1 = new HighlightedTextKt$HighlightedText$4$1(this.f23999b, this.f24000c, this.f24001d, this.f24002e, continuation);
        highlightedTextKt$HighlightedText$4$1.f23998a = obj;
        return highlightedTextKt$HighlightedText$4$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        HighlightedTextKt$HighlightedText$4$1 highlightedTextKt$HighlightedText$4$1 = (HighlightedTextKt$HighlightedText$4$1) create((un1) obj, (Continuation) obj2);
        xfa xfaVar = xfa.f68157a;
        highlightedTextKt$HighlightedText$4$1.invokeSuspend(xfaVar);
        return xfaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        fda fdaVar;
        cd9 cd9Var;
        long j;
        un1 un1Var = (un1) this.f23998a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        AbstractC3193b.m15359b(obj);
        List list = this.f23999b.f46105c;
        int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list, 10));
        if (iM15363P < 16) {
            iM15363P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
        for (Object obj2 : list) {
            linkedHashMap.put(new Integer(((q7b) obj2).f57357a.f69009f), obj2);
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            fdaVar = this.f24002e;
            cd9Var = this.f24000c;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it.next();
            int iIntValue = ((Number) entry.getKey()).intValue();
            q7b q7bVar = (q7b) entry.getValue();
            int i = zs3.f72038c;
            q7bVar.getClass();
            s78 s78Var = this.f24001d;
            s78Var.getClass();
            if (q7bVar.f57365i) {
                j = aa1.f411j;
            } else if (q7bVar.f57358b) {
                int i2 = q7bVar.f57360d;
                if (i2 == CardStatus.New.getValue()) {
                    j = s78Var.f60471a;
                } else if (i2 == CardStatus.Known.getValue()) {
                    j = s78Var.f60475e;
                } else if (i2 == CardStatus.Recognized.getValue()) {
                    j = s78Var.f60472b;
                } else if (i2 == CardStatus.Familiar.getValue()) {
                    j = s78Var.f60473c;
                } else {
                    j = i2 == CardStatus.Learned.getValue() ? s78Var.f60474d : aa1.f411j;
                }
            } else {
                String str = q7bVar.f57362f;
                j = fa4.m11650l(str, WordStatus.New.getValue()) ? s78Var.f60476f : fa4.m11650l(str, WordStatus.Known.getValue()) ? s78Var.f60477g : aa1.f411j;
            }
            Integer num = new Integer(iIntValue);
            Object objM784a = cd9Var.get(num);
            if (objM784a == null) {
                objM784a = AbstractC0072k.m784a(aa1.m198b(0.0f, j));
                cd9Var.put(num, objM784a);
            }
            C0059a c0059a = (C0059a) objM784a;
            if (!aa1.m199c(((aa1) c0059a.m745d()).f414a, j)) {
                wfb.m23926u(un1Var, null, null, new HighlightedTextKt$HighlightedText$4$1$1$1(c0059a, j, fdaVar, null), 3);
            }
        }
        oc9 oc9Var = cd9Var.f9942c;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = oc9Var.iterator();
        while (((oh9) it2).hasNext()) {
            Object next = ((oh9) it2).next();
            if (!linkedHashMap.containsKey(new Integer(((Number) next).intValue()))) {
                arrayList.add(next);
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0059a c0059a2 = (C0059a) cd9Var.get(new Integer(((Number) it3.next()).intValue()));
            if (c0059a2 != null && !aa1.m199c(((aa1) ((xc9) c0059a2.f1542e).getValue()).f414a, aa1.f411j)) {
                wfb.m23926u(un1Var, null, null, new HighlightedTextKt$HighlightedText$4$1$2$1$1(c0059a2, fdaVar, null), 3);
            }
        }
        return xfa.f68157a;
    }
}
