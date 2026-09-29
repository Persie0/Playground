package androidx.compose.foundation.gestures;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.AbstractC3208a;
import kotlinx.coroutines.channels.C3211a;
import p000.C3386nv;
import p000.c32;
import p000.un1;
import p000.x36;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingEvents$1", m4291f = "MouseWheelScrollingLogic.kt", m4292l = {109, 112}, m4293m = "invokeSuspend", m4294v = 1)
final class MouseWheelScrollingLogic$startReceivingEvents$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f2009a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f2010b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0106n f2011c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MouseWheelScrollingLogic$startReceivingEvents$1(C0106n c0106n, Continuation continuation) {
        super(2, continuation);
        this.f2011c = c0106n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MouseWheelScrollingLogic$startReceivingEvents$1 mouseWheelScrollingLogic$startReceivingEvents$1 = new MouseWheelScrollingLogic$startReceivingEvents$1(this.f2011c, continuation);
        mouseWheelScrollingLogic$startReceivingEvents$1.f2010b = obj;
        return mouseWheelScrollingLogic$startReceivingEvents$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((MouseWheelScrollingLogic$startReceivingEvents$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0013, B:18:0x0031, B:20:0x003b, B:24:0x004e, B:15:0x0026), top: B:32:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x006c, code lost:
    
        if (androidx.compose.foundation.gestures.C0106n.m894c(r5, r6, r7, r8, r9, r10) == r0) goto L26;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x006c -> B:9:0x0017). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        un1 un1Var;
        un1 un1Var2;
        MouseWheelScrollingLogic$startReceivingEvents$1 mouseWheelScrollingLogic$startReceivingEvents$1;
        Object objM15448I;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f2009a;
        C0106n c0106n = this.f2011c;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                un1Var = (un1) this.f2010b;
                if (AbstractC3208a.m15443j(un1Var.mo1309x())) {
                    c0106n.f2295h = null;
                    return xfa.f68157a;
                }
                C3211a c3211a = c0106n.f2294g;
                this.f2010b = un1Var;
                this.f2009a = 1;
                c3211a.getClass();
                objM15448I = C3211a.m15448I(c3211a, this);
                if (objM15448I == coroutineSingletons) {
                    un1Var2 = un1Var;
                    obj = objM15448I;
                    x36 x36Var = (x36) obj;
                    float fMo912g0 = c0106n.f2298c.mo912g0(6.0f);
                    float fMo912g1 = c0106n.f2298c.mo912g0(1.0f);
                    C0116v c0116v = c0106n.f2296a;
                    this.f2010b = un1Var2;
                    this.f2009a = 2;
                    mouseWheelScrollingLogic$startReceivingEvents$1 = this;
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                un1Var2 = (un1) this.f2010b;
                AbstractC3193b.m15359b(obj);
                x36 x36Var2 = (x36) obj;
                float fMo912g2 = c0106n.f2298c.mo912g0(6.0f);
                float fMo912g3 = c0106n.f2298c.mo912g0(1.0f);
                C0116v c0116v2 = c0106n.f2296a;
                this.f2010b = un1Var2;
                this.f2009a = 2;
                mouseWheelScrollingLogic$startReceivingEvents$1 = this;
            } else {
                if (i != 2) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                un1Var2 = (un1) this.f2010b;
                AbstractC3193b.m15359b(obj);
                mouseWheelScrollingLogic$startReceivingEvents$1 = this;
            }
            un1Var = un1Var2;
            this = mouseWheelScrollingLogic$startReceivingEvents$1;
            if (AbstractC3208a.m15443j(un1Var.mo1309x())) {
                c0106n.f2295h = null;
                return xfa.f68157a;
            }
            C3211a c3211a2 = c0106n.f2294g;
            this.f2010b = un1Var;
            this.f2009a = 1;
            c3211a2.getClass();
            objM15448I = C3211a.m15448I(c3211a2, this);
            if (objM15448I == coroutineSingletons) {
                un1Var2 = un1Var;
                obj = objM15448I;
                x36 x36Var3 = (x36) obj;
                float fMo912g4 = c0106n.f2298c.mo912g0(6.0f);
                float fMo912g5 = c0106n.f2298c.mo912g0(1.0f);
                C0116v c0116v3 = c0106n.f2296a;
                this.f2010b = un1Var2;
                this.f2009a = 2;
                mouseWheelScrollingLogic$startReceivingEvents$1 = this;
            }
            return coroutineSingletons;
        } catch (Throwable th) {
            c0106n.f2295h = null;
            throw th;
        }
    }
}
