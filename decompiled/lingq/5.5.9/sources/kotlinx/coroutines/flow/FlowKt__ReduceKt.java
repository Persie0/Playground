package kotlinx.coroutines.flow;

import cm.InterfaceC2056p;
import dm.C5206f;
import java.util.NoSuchElementException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$a */
    public static final class C7099a<T> implements InterfaceC7117d<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref$ObjectRef f40139a;

        public C7099a(Ref$ObjectRef ref$ObjectRef) {
            this.f40139a = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            this.f40139a.f38127a = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$b */
    public static final class C7100b<T> implements InterfaceC7117d<T> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Ref$ObjectRef f40140a;

        public C7100b(Ref$ObjectRef ref$ObjectRef) {
            this.f40140a = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC7117d
        /* JADX INFO: renamed from: r */
        public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) {
            this.f40140a.f38127a = t10;
            throw new AbortFlowException(this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static final <T> Object m14360a(InterfaceC7116c<? extends T> interfaceC7116c, InterfaceC9968c<? super T> interfaceC9968c) {
        FlowKt__ReduceKt$first$1 flowKt__ReduceKt$first$1;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e10;
        C7099a c7099a;
        if (interfaceC9968c instanceof FlowKt__ReduceKt$first$1) {
            flowKt__ReduceKt$first$1 = (FlowKt__ReduceKt$first$1) interfaceC9968c;
            int i10 = flowKt__ReduceKt$first$1.f40151g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$1.f40151g = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(interfaceC9968c);
            }
        } else {
            flowKt__ReduceKt$first$1 = new FlowKt__ReduceKt$first$1(interfaceC9968c);
        }
        Object obj = flowKt__ReduceKt$first$1.f40150f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = flowKt__ReduceKt$first$1.f40151g;
        T t10 = (T) C5206f.f33272g;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            ref$ObjectRef2.f38127a = t10;
            C7099a c7099a2 = new C7099a(ref$ObjectRef2);
            try {
                flowKt__ReduceKt$first$1.f40148d = ref$ObjectRef2;
                flowKt__ReduceKt$first$1.f40149e = c7099a2;
                flowKt__ReduceKt$first$1.f40151g = 1;
                if (interfaceC7116c.mo9539a(c7099a2, flowKt__ReduceKt$first$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e11) {
                ref$ObjectRef = ref$ObjectRef2;
                e10 = e11;
                c7099a = c7099a2;
                if (e10.f40287a != c7099a) {
                    throw e10;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7099a = flowKt__ReduceKt$first$1.f40149e;
            ref$ObjectRef = flowKt__ReduceKt$first$1.f40148d;
            try {
                C7499b.m14977z0(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                if (e10.f40287a != c7099a) {
                    throw e10;
                }
            }
        }
        T t11 = ref$ObjectRef.f38127a;
        if (t11 != t10) {
            return t11;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0074  */
    /* JADX WARN: Code duplicated, block: B:31:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x007c  */
    /* JADX WARN: Code duplicated, block: B:35:0x0095  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:32:0x007c, please report this as an issue */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, kotlinx.coroutines.internal.r] */
    /* JADX WARN: Unreachable blocks removed: 3, instructions: 3 */
    /* JADX INFO: renamed from: b */
    public static final Object m14361b(InterfaceC7142w interfaceC7142w, InterfaceC2056p interfaceC2056p, InterfaceC9968c interfaceC9968c) {
        FlowKt__ReduceKt$first$3 flowKt__ReduceKt$first$3;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException abortFlowException;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$2;
        InterfaceC2056p interfaceC2056p2;
        Ref$ObjectRef ref$ObjectRef2;
        T t10;
        if (interfaceC9968c instanceof FlowKt__ReduceKt$first$3) {
            flowKt__ReduceKt$first$3 = (FlowKt__ReduceKt$first$3) interfaceC9968c;
            int i10 = flowKt__ReduceKt$first$3.f40156h;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$first$3.f40156h = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(interfaceC9968c);
            }
        } else {
            flowKt__ReduceKt$first$3 = new FlowKt__ReduceKt$first$3(interfaceC9968c);
        }
        Object obj = flowKt__ReduceKt$first$3.f40155g;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = flowKt__ReduceKt$first$3.f40156h;
        ?? r10 = C5206f.f33272g;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__ReduceKt$first$$inlined$collectWhile$2 = flowKt__ReduceKt$first$3.f40154f;
            ref$ObjectRef2 = flowKt__ReduceKt$first$3.f40153e;
            interfaceC2056p2 = flowKt__ReduceKt$first$3.f40152d;
            try {
                C7499b.m14977z0(obj);
            } catch (AbortFlowException e10) {
                ref$ObjectRef = ref$ObjectRef2;
                interfaceC2056p = interfaceC2056p2;
                abortFlowException = e10;
                if (abortFlowException.f40287a != flowKt__ReduceKt$first$$inlined$collectWhile$2) {
                    throw abortFlowException;
                }
                interfaceC2056p2 = interfaceC2056p;
                ref$ObjectRef2 = ref$ObjectRef;
            }
            t10 = ref$ObjectRef2.f38127a;
            if (t10 != r10) {
                return t10;
            }
            throw new NoSuchElementException("Expected at least one element matching the predicate " + interfaceC2056p2);
        }
        C7499b.m14977z0(obj);
        ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f38127a = r10;
        FlowKt__ReduceKt$first$$inlined$collectWhile$2 flowKt__ReduceKt$first$$inlined$collectWhile$3 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2(interfaceC2056p, ref$ObjectRef);
        try {
            flowKt__ReduceKt$first$3.f40152d = interfaceC2056p;
            flowKt__ReduceKt$first$3.f40153e = ref$ObjectRef;
            flowKt__ReduceKt$first$3.f40154f = flowKt__ReduceKt$first$$inlined$collectWhile$3;
            flowKt__ReduceKt$first$3.f40156h = 1;
            if (interfaceC7142w.mo9539a(flowKt__ReduceKt$first$$inlined$collectWhile$3, flowKt__ReduceKt$first$3) == obj2) {
                return obj2;
            }
        } catch (AbortFlowException e11) {
            abortFlowException = e11;
            flowKt__ReduceKt$first$$inlined$collectWhile$2 = flowKt__ReduceKt$first$$inlined$collectWhile$3;
            if (abortFlowException.f40287a != flowKt__ReduceKt$first$$inlined$collectWhile$2) {
                throw abortFlowException;
            }
        }
        interfaceC2056p2 = interfaceC2056p;
        ref$ObjectRef2 = ref$ObjectRef;
        t10 = ref$ObjectRef2.f38127a;
        if (t10 != r10) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + interfaceC2056p2);
        if (abortFlowException.f40287a != flowKt__ReduceKt$first$$inlined$collectWhile$2) {
            throw abortFlowException;
        }
        interfaceC2056p2 = interfaceC2056p;
        ref$ObjectRef2 = ref$ObjectRef;
        t10 = ref$ObjectRef2.f38127a;
        if (t10 != r10) {
            return t10;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + interfaceC2056p2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX INFO: renamed from: c */
    public static final <T> Object m14362c(InterfaceC7116c<? extends T> interfaceC7116c, InterfaceC9968c<? super T> interfaceC9968c) throws Throwable {
        FlowKt__ReduceKt$firstOrNull$1 flowKt__ReduceKt$firstOrNull$1;
        Ref$ObjectRef ref$ObjectRef;
        AbortFlowException e10;
        C7100b c7100b;
        if (interfaceC9968c instanceof FlowKt__ReduceKt$firstOrNull$1) {
            flowKt__ReduceKt$firstOrNull$1 = (FlowKt__ReduceKt$firstOrNull$1) interfaceC9968c;
            int i10 = flowKt__ReduceKt$firstOrNull$1.f40160g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ReduceKt$firstOrNull$1.f40160g = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(interfaceC9968c);
            }
        } else {
            flowKt__ReduceKt$firstOrNull$1 = new FlowKt__ReduceKt$firstOrNull$1(interfaceC9968c);
        }
        Object obj = flowKt__ReduceKt$firstOrNull$1.f40159f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = flowKt__ReduceKt$firstOrNull$1.f40160g;
        if (i11 == 0) {
            C7499b.m14977z0(obj);
            Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
            C7100b c7100b2 = new C7100b(ref$ObjectRef2);
            try {
                flowKt__ReduceKt$firstOrNull$1.f40157d = ref$ObjectRef2;
                flowKt__ReduceKt$firstOrNull$1.f40158e = c7100b2;
                flowKt__ReduceKt$firstOrNull$1.f40160g = 1;
                if (interfaceC7116c.mo9539a(c7100b2, flowKt__ReduceKt$firstOrNull$1) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                ref$ObjectRef = ref$ObjectRef2;
            } catch (AbortFlowException e11) {
                ref$ObjectRef = ref$ObjectRef2;
                e10 = e11;
                c7100b = c7100b2;
                if (e10.f40287a == c7100b) {
                    throw e10;
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c7100b = flowKt__ReduceKt$firstOrNull$1.f40158e;
            ref$ObjectRef = flowKt__ReduceKt$firstOrNull$1.f40157d;
            try {
                C7499b.m14977z0(obj);
            } catch (AbortFlowException e12) {
                e10 = e12;
                if (e10.f40287a == c7100b) {
                    throw e10;
                }
            }
        }
        return ref$ObjectRef.f38127a;
    }
}
