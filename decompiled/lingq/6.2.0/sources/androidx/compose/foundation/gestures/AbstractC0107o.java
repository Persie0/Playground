package androidx.compose.foundation.gestures;

import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.C3386nv;
import p000.b64;
import p000.fb2;
import p000.fg7;
import p000.kg7;
import p000.mn9;
import p000.pfa;
import p000.xfa;
import p000.zi3;

/* JADX INFO: renamed from: androidx.compose.foundation.gestures.o */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0107o {

    /* JADX INFO: renamed from: a */
    public final C0116v f2296a;

    /* JADX INFO: renamed from: b */
    public final zi3 f2297b;

    /* JADX INFO: renamed from: c */
    public fb2 f2298c;

    /* JADX INFO: renamed from: d */
    public boolean f2299d;

    /* JADX INFO: renamed from: e */
    public final b64 f2300e = new b64(29);

    public AbstractC0107o(C0116v c0116v, zi3 zi3Var, fb2 fb2Var) {
        this.f2296a = c0116v;
        this.f2297b = zi3Var;
        this.f2298c = fb2Var;
    }

    /* JADX INFO: renamed from: a */
    public static void m899a(fg7 fg7Var) {
        List list = fg7Var.f39071a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((kg7) list.get(i)).m15189a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m900b(zi3 zi3Var, ContinuationImpl continuationImpl) throws Throwable {
        NonTouchScrollingLogic$userScroll$1 nonTouchScrollingLogic$userScroll$1;
        if (continuationImpl instanceof NonTouchScrollingLogic$userScroll$1) {
            nonTouchScrollingLogic$userScroll$1 = (NonTouchScrollingLogic$userScroll$1) continuationImpl;
            int i = nonTouchScrollingLogic$userScroll$1.f2014c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nonTouchScrollingLogic$userScroll$1.f2014c = i - Integer.MIN_VALUE;
            } else {
                nonTouchScrollingLogic$userScroll$1 = new NonTouchScrollingLogic$userScroll$1(this, continuationImpl);
            }
        } else {
            nonTouchScrollingLogic$userScroll$1 = new NonTouchScrollingLogic$userScroll$1(this, continuationImpl);
        }
        Object obj = nonTouchScrollingLogic$userScroll$1.f2012a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = nonTouchScrollingLogic$userScroll$1.f2014c;
        if (i2 == 0) {
            AbstractC3193b.m15359b(obj);
            this.f2299d = true;
            NonTouchScrollingLogic$userScroll$2 nonTouchScrollingLogic$userScroll$2 = new NonTouchScrollingLogic$userScroll$2(this, zi3Var, null);
            nonTouchScrollingLogic$userScroll$1.f2014c = 1;
            mn9 mn9Var = new mn9(nonTouchScrollingLogic$userScroll$1.getContext(), nonTouchScrollingLogic$userScroll$1);
            if (pfa.m19112b(mn9Var, true, mn9Var, nonTouchScrollingLogic$userScroll$2) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        this.f2299d = false;
        return xfa.f68157a;
    }
}
