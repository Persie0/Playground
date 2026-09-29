package androidx.compose.animation.core;

import cm.InterfaceC2052l;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$BooleanRef;
import p260m8.C7499b;
import p338qd.C8573r0;
import p374s.AbstractC8911i;
import p374s.C8897b;
import p374s.C8899c;
import p374s.C8903e;
import p374s.InterfaceC8895a;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\u008a@"}, m13365d2 = {"T", "Ls/i;", "V", "Ls/b;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.animation.core.Animatable$runAnimation$2", m19206f = "Animatable.kt", m19207l = {305}, m19208m = "invokeSuspend")
final class Animatable$runAnimation$2 extends SuspendLambda implements InterfaceC2052l<InterfaceC9968c<? super C8897b<Object, AbstractC8911i>>, Object> {

    /* JADX INFO: renamed from: e */
    public C8903e f1510e;

    /* JADX INFO: renamed from: f */
    public Ref$BooleanRef f1511f;

    /* JADX INFO: renamed from: g */
    public int f1512g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C0369a<Object, AbstractC8911i> f1513h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f1514i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC8895a<Object, AbstractC8911i> f1515j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ long f1516k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC2052l<C0369a<Object, AbstractC8911i>, C9072e> f1517l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Animatable$runAnimation$2(C0369a<Object, AbstractC8911i> c0369a, Object obj, InterfaceC8895a<Object, AbstractC8911i> interfaceC8895a, long j10, InterfaceC2052l<? super C0369a<Object, AbstractC8911i>, C9072e> interfaceC2052l, InterfaceC9968c<? super Animatable$runAnimation$2> interfaceC9968c) {
        super(1, interfaceC9968c);
        this.f1513h = c0369a;
        this.f1514i = obj;
        this.f1515j = interfaceC8895a;
        this.f1516k = j10;
        this.f1517l = interfaceC2052l;
    }

    @Override // cm.InterfaceC2052l
    /* JADX INFO: renamed from: n */
    public final Object mo528n(InterfaceC9968c<? super C8897b<Object, AbstractC8911i>> interfaceC9968c) {
        return ((Animatable$runAnimation$2) mo1353s(interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: s */
    public final InterfaceC9968c<C9072e> mo1353s(InterfaceC9968c<?> interfaceC9968c) {
        return new Animatable$runAnimation$2(this.f1513h, this.f1514i, this.f1515j, this.f1516k, this.f1517l, interfaceC9968c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        Ref$BooleanRef ref$BooleanRef;
        C8903e c8903e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1512g;
        final C0369a<Object, AbstractC8911i> c0369a = this.f1513h;
        try {
            if (i10 == 0) {
                C7499b.m14977z0(obj);
                C8903e<Object, V> c8903e2 = c0369a.f1655c;
                V v10 = (V) c0369a.f1653a.mo17140a().mo528n(this.f1514i);
                c8903e2.getClass();
                C5207g.m11111f(v10, "<set-?>");
                c8903e2.f46800c = v10;
                c0369a.f1657e.setValue(this.f1515j.mo17132g());
                c0369a.f1656d.setValue(Boolean.TRUE);
                C8903e<Object, V> c8903e3 = c0369a.f1655c;
                final C8903e c8903e4 = new C8903e(c8903e3.f46798a, c8903e3.getValue(), C8573r0.m16709Y(c8903e3.f46800c), c8903e3.f46801d, Long.MIN_VALUE, c8903e3.f46803f);
                final Ref$BooleanRef ref$BooleanRef2 = new Ref$BooleanRef();
                InterfaceC8895a<Object, AbstractC8911i> interfaceC8895a = this.f1515j;
                long j10 = this.f1516k;
                final InterfaceC2052l<C0369a<Object, AbstractC8911i>, C9072e> interfaceC2052l = this.f1517l;
                InterfaceC2052l<C8899c<Object, AbstractC8911i>, C9072e> interfaceC2052l2 = new InterfaceC2052l<C8899c<Object, AbstractC8911i>, C9072e>() { // from class: androidx.compose.animation.core.Animatable$runAnimation$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // cm.InterfaceC2052l
                    /* JADX INFO: renamed from: n */
                    public final C9072e mo528n(C8899c<Object, AbstractC8911i> c8899c) {
                        C8899c<Object, AbstractC8911i> c8899c2 = c8899c;
                        C5207g.m11111f(c8899c2, "$this$animate");
                        C0369a<Object, AbstractC8911i> c0369a2 = c0369a;
                        SuspendAnimationKt.m1360g(c8899c2, c0369a2.f1655c);
                        Object objM1381a = C0369a.m1381a(c0369a2, c8899c2.m17133a());
                        boolean zM11106a = C5207g.m11106a(objM1381a, c8899c2.m17133a());
                        InterfaceC2052l<C0369a<Object, AbstractC8911i>, C9072e> interfaceC2052l3 = interfaceC2052l;
                        if (!zM11106a) {
                            c0369a2.f1655c.f46799b.setValue(objM1381a);
                            c8903e4.f46799b.setValue(objM1381a);
                            if (interfaceC2052l3 != null) {
                                interfaceC2052l3.mo528n(c0369a2);
                            }
                            c8899c2.f46795i.setValue(Boolean.FALSE);
                            c8899c2.f46790d.mo807E();
                            ref$BooleanRef2.f38122a = true;
                        } else if (interfaceC2052l3 != null) {
                            interfaceC2052l3.mo528n(c0369a2);
                        }
                        return C9072e.f47360a;
                    }
                };
                this.f1510e = c8903e4;
                this.f1511f = ref$BooleanRef2;
                this.f1512g = 1;
                if (SuspendAnimationKt.m1354a(c8903e4, interfaceC8895a, j10, interfaceC2052l2, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$BooleanRef = ref$BooleanRef2;
                c8903e = c8903e4;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ref$BooleanRef = this.f1511f;
                c8903e = this.f1510e;
                C7499b.m14977z0(obj);
            }
            AnimationEndReason animationEndReason = ref$BooleanRef.f38122a ? AnimationEndReason.BoundReached : AnimationEndReason.Finished;
            C8903e<Object, V> c8903e5 = c0369a.f1655c;
            c8903e5.f46800c.mo17138d();
            c8903e5.f46801d = Long.MIN_VALUE;
            c0369a.f1656d.setValue(Boolean.FALSE);
            return new C8897b(c8903e, animationEndReason);
        } catch (CancellationException e10) {
            C8903e<Object, V> c8903e6 = c0369a.f1655c;
            c8903e6.f46800c.mo17138d();
            c8903e6.f46801d = Long.MIN_VALUE;
            c0369a.f1656d.setValue(Boolean.FALSE);
            throw e10;
        }
    }
}
