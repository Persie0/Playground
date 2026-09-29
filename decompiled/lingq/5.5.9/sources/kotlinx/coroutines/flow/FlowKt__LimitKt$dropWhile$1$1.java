package kotlinx.coroutines.flow;

import cm.InterfaceC2056p;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$BooleanRef;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements InterfaceC7117d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Ref$BooleanRef f40127a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC7117d<T> f40128b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InterfaceC2056p<T, InterfaceC9968c<? super Boolean>, Object> f40129c;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(Ref$BooleanRef ref$BooleanRef, InterfaceC7117d<? super T> interfaceC7117d, InterfaceC2056p<? super T, ? super InterfaceC9968c<? super Boolean>, ? extends Object> interfaceC2056p) {
        this.f40127a = ref$BooleanRef;
        this.f40128b = interfaceC7117d;
        this.f40129c = interfaceC2056p;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0087  */
    /* JADX WARN: Code duplicated, block: B:37:0x009d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
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
    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        FlowKt__LimitKt$dropWhile$1$1<T> flowKt__LimitKt$dropWhile$1$1;
        if (interfaceC9968c instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) interfaceC9968c;
            int i10 = flowKt__LimitKt$dropWhile$1$1$emit$1.f40134h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.f40134h = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, interfaceC9968c);
            }
        } else {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, interfaceC9968c);
        }
        Object objMo1337m0 = flowKt__LimitKt$dropWhile$1$1$emit$1.f40132f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = flowKt__LimitKt$dropWhile$1$1$emit$1.f40134h;
        if (i11 == 0) {
            C7499b.m14977z0(objMo1337m0);
            if (this.f40127a.f38122a) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.f40134h = 1;
                if (this.f40128b.mo1339r(t10, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                return C9072e.f47360a;
            }
            flowKt__LimitKt$dropWhile$1$1$emit$1.f40130d = this;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f40131e = t10;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f40134h = 2;
            objMo1337m0 = this.f40129c.mo1337m0(t10, flowKt__LimitKt$dropWhile$1$1$emit$1);
            if (objMo1337m0 == coroutineSingletons) {
                return coroutineSingletons;
            }
            flowKt__LimitKt$dropWhile$1$1 = this;
            if (!((Boolean) objMo1337m0).booleanValue()) {
                return C9072e.f47360a;
            }
            flowKt__LimitKt$dropWhile$1$1.f40127a.f38122a = true;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f40130d = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f40131e = null;
            flowKt__LimitKt$dropWhile$1$1$emit$1.f40134h = 3;
            if (flowKt__LimitKt$dropWhile$1$1.f40128b.mo1339r(t10, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i11 == 1) {
                C7499b.m14977z0(objMo1337m0);
                return C9072e.f47360a;
            }
            if (i11 == 2) {
                t10 = (T) flowKt__LimitKt$dropWhile$1$1$emit$1.f40131e;
                flowKt__LimitKt$dropWhile$1$1 = flowKt__LimitKt$dropWhile$1$1$emit$1.f40130d;
                C7499b.m14977z0(objMo1337m0);
                if (!((Boolean) objMo1337m0).booleanValue()) {
                    return C9072e.f47360a;
                }
                flowKt__LimitKt$dropWhile$1$1.f40127a.f38122a = true;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f40130d = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f40131e = null;
                flowKt__LimitKt$dropWhile$1$1$emit$1.f40134h = 3;
                if (flowKt__LimitKt$dropWhile$1$1.f40128b.mo1339r(t10, flowKt__LimitKt$dropWhile$1$1$emit$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C7499b.m14977z0(objMo1337m0);
            }
        }
        return C9072e.f47360a;
    }
}
