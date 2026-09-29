package kotlinx.coroutines.flow;

import dm.C5206f;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class DistinctFlowImpl$collect$2<T> implements InterfaceC7117d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DistinctFlowImpl<T> f40043a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef<Object> f40044b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC7117d<T> f40045c;

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl$collect$2(DistinctFlowImpl<T> distinctFlowImpl, Ref$ObjectRef<Object> ref$ObjectRef, InterfaceC7117d<? super T> interfaceC7117d) {
        this.f40043a = distinctFlowImpl;
        this.f40044b = ref$ObjectRef;
        this.f40045c = interfaceC7117d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
        if (interfaceC9968c instanceof DistinctFlowImpl$collect$2$emit$1) {
            distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) interfaceC9968c;
            int i10 = distinctFlowImpl$collect$2$emit$1.f40048f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                distinctFlowImpl$collect$2$emit$1.f40048f = i10 - Integer.MIN_VALUE;
            } else {
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, interfaceC9968c);
            }
        } else {
            distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, interfaceC9968c);
        }
        Object obj = distinctFlowImpl$collect$2$emit$1.f40046d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = distinctFlowImpl$collect$2$emit$1.f40048f;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            DistinctFlowImpl<T> distinctFlowImpl = this.f40043a;
            T t11 = (T) distinctFlowImpl.f40041b.mo528n(t10);
            Ref$ObjectRef<Object> ref$ObjectRef = this.f40044b;
            Object obj2 = ref$ObjectRef.f38127a;
            if (obj2 != C5206f.f33272g && distinctFlowImpl.f40042c.mo1337m0(obj2, t11).booleanValue()) {
                return C9072e.f47360a;
            }
            ref$ObjectRef.f38127a = t11;
            distinctFlowImpl$collect$2$emit$1.f40048f = 1;
            if (this.f40045c.mo1339r(t10, distinctFlowImpl$collect$2$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C7499b.m14977z0(obj);
        }
        return C9072e.f47360a;
    }
}
