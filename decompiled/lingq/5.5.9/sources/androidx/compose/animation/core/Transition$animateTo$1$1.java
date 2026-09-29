package androidx.compose.animation.core;

import cm.InterfaceC2052l;
import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import no.InterfaceC7882z;
import p081e0.C5300c0;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK}, m13369xi = 48)
@InterfaceC10224c(m19205c = "androidx.compose.animation.core.Transition$animateTo$1$1", m19206f = "Transition.kt", m19207l = {434}, m19208m = "invokeSuspend")
public final class Transition$animateTo$1$1 extends SuspendLambda implements InterfaceC2056p<InterfaceC7882z, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: e */
    public int f1593e;

    /* JADX INFO: renamed from: f */
    public /* synthetic */ Object f1594f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Transition<S> f1595g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1(Transition<S> transition, InterfaceC9968c<? super Transition$animateTo$1$1> interfaceC9968c) {
        super(2, interfaceC9968c);
        this.f1595g = transition;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        Transition$animateTo$1$1 transition$animateTo$1$1 = new Transition$animateTo$1$1(this.f1595g, interfaceC9968c);
        transition$animateTo$1$1.f1594f = obj;
        return transition$animateTo$1$1;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC7882z interfaceC7882z, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((Transition$animateTo$1$1) mo1336a(interfaceC7882z, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final Object mo1338x(Object obj) throws Throwable {
        InterfaceC7882z interfaceC7882z;
        InterfaceC2052l<Long, C9072e> interfaceC2052l;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i10 = this.f1593e;
        if (i10 == 0) {
            C7499b.m14977z0(obj);
            interfaceC7882z = (InterfaceC7882z) this.f1594f;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC7882z = (InterfaceC7882z) this.f1594f;
            C7499b.m14977z0(obj);
        }
        do {
            final float fM1359f = SuspendAnimationKt.m1359f(interfaceC7882z.getF6528b());
            final Transition<S> transition = this.f1595g;
            interfaceC2052l = new InterfaceC2052l<Long, C9072e>() { // from class: androidx.compose.animation.core.Transition$animateTo$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // cm.InterfaceC2052l
                /* JADX INFO: renamed from: n */
                public final C9072e mo528n(Long l10) {
                    long jLongValue = l10.longValue();
                    Transition<S> transition2 = transition;
                    if (!transition2.m1365e()) {
                        transition2.m1366f(fM1359f, jLongValue / 1);
                    }
                    return C9072e.f47360a;
                }
            };
            this.f1594f = interfaceC7882z;
            this.f1593e = 1;
        } while (C5300c0.m11449b(interfaceC2052l, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
