package androidx.compose.foundation.text.selection;

import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.C3386nv;
import p000.c32;
import p000.cx9;
import p000.eh0;
import p000.fa4;
import p000.mq6;
import p000.un1;
import p000.wfb;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager$maybeSuggestSelection$1", m4291f = "TextFieldSelectionManager.kt", m4292l = {571}, m4293m = "invokeSuspend", m4294v = 1)
final class TextFieldSelectionManager$maybeSuggestSelection$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public int f3043a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0200a f3044b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f3045c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ long f3046d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ cx9 f3047e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C0205f f3048f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ mq6 f3049g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$maybeSuggestSelection$1(C0200a c0200a, String str, long j, cx9 cx9Var, C0205f c0205f, mq6 mq6Var, Continuation continuation) {
        super(2, continuation);
        this.f3044b = c0200a;
        this.f3045c = str;
        this.f3046d = j;
        this.f3047e = cx9Var;
        this.f3048f = c0205f;
        this.f3049g = mq6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TextFieldSelectionManager$maybeSuggestSelection$1(this.f3044b, this.f3045c, this.f3046d, this.f3047e, this.f3048f, this.f3049g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TextFieldSelectionManager$maybeSuggestSelection$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f3043a;
        String str = this.f3045c;
        if (i == 0) {
            AbstractC3193b.m15359b(obj);
            this.f3043a = 1;
            C0200a c0200a = this.f3044b;
            c0200a.getClass();
            if (str.length() == 0) {
                obj = null;
            } else {
                long j = this.f3046d;
                if (cx9.m9921c(j)) {
                    obj = null;
                } else {
                    obj = wfb.m23905G(new C0192xa7a7d588(c0200a, new C0194xcb45b7e0(j, c0200a, str, null), null), c0200a.f3061a, this);
                }
            }
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            AbstractC3193b.m15359b(obj);
        }
        cx9 cx9Var = (cx9) obj;
        xfa xfaVar = xfa.f68157a;
        if (cx9Var != null) {
            long j2 = cx9Var.f34694a;
            mq6 mq6Var = this.f3049g;
            long jM11127g = eh0.m11127g(mq6Var.mo13407j((int) (j2 >> 32)), mq6Var.mo13407j((int) (j2 & 4294967295L)));
            if (!cx9.m9919a(this.f3047e, jM11127g)) {
                C0205f c0205f = this.f3048f;
                if (fa4.m11650l(c0205f.m1114o().f65990a.f54604b, str) && mq6Var == c0205f.f3077b) {
                    c0205f.f3078c.invoke(C0205f.m1103e(c0205f.m1114o().f65990a, jM11127g));
                    c0205f.f3098w = new cx9(jM11127g);
                }
            }
        }
        return xfaVar;
    }
}
