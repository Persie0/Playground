package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p000.AbstractC3081hn;
import p000.C0817bn;
import p000.C3386nv;
import p000.C3615tl;
import p000.C3801ym;
import p000.c32;
import p000.do7;
import p000.or9;
import p000.vi3;
import p000.xc9;
import p000.xfa;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.animation.core.Animatable$runAnimation$2", m4291f = "Animatable.kt", m4292l = {308}, m4293m = "invokeSuspend", m4294v = 1)
final class Animatable$runAnimation$2 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public C0817bn f1491a;

    /* JADX INFO: renamed from: b */
    public Ref$BooleanRef f1492b;

    /* JADX INFO: renamed from: c */
    public int f1493c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C0059a f1494d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f1495e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ or9 f1496f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ long f1497g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ vi3 f1498h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(C0059a c0059a, Object obj, or9 or9Var, long j, vi3 vi3Var, Continuation continuation) {
        super(1, continuation);
        this.f1494d = c0059a;
        this.f1495e = obj;
        this.f1496f = or9Var;
        this.f1497g = j;
        this.f1498h = vi3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new Animatable$runAnimation$2(this.f1494d, this.f1495e, this.f1496f, this.f1497g, this.f1498h, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((Animatable$runAnimation$2) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        C0817bn c0817bn;
        Ref$BooleanRef ref$BooleanRef;
        or9 or9Var = this.f1496f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.f1493c;
        C0059a c0059a = this.f1494d;
        try {
            if (i == 0) {
                AbstractC3193b.m15359b(obj);
                c0059a.f1540c.f8705c = (AbstractC3081hn) c0059a.f1538a.f45442a.invoke(this.f1495e);
                ((xc9) c0059a.f1542e).setValue(or9Var.f54792c);
                ((xc9) c0059a.f1541d).setValue(Boolean.TRUE);
                C0817bn c0817bn2 = c0059a.f1540c;
                C0817bn c0817bn3 = new C0817bn(c0817bn2.f8703a, ((xc9) c0817bn2.f8704b).getValue(), do7.m10533i(c0817bn2.f8705c), c0817bn2.f8706d, Long.MIN_VALUE, c0817bn2.f8708f);
                Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                long j = this.f1497g;
                C3615tl c3615tl = new C3615tl(c0059a, c0817bn3, this.f1498h, ref$BooleanRef2, 0);
                this.f1491a = c0817bn3;
                this.f1492b = ref$BooleanRef2;
                this.f1493c = 1;
                if (AbstractC0063e.m755b(c0817bn3, or9Var, j, c3615tl, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                c0817bn = c0817bn3;
                ref$BooleanRef = ref$BooleanRef2;
            } else {
                if (i != 1) {
                    C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                ref$BooleanRef = this.f1492b;
                c0817bn = this.f1491a;
                AbstractC3193b.m15359b(obj);
            }
            AnimationEndReason animationEndReason = ref$BooleanRef.f47713a ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            C0059a.m743b(c0059a);
            return new C3801ym(c0817bn, animationEndReason);
        } catch (CancellationException e) {
            C0059a.m743b(c0059a);
            throw e;
        }
    }
}
