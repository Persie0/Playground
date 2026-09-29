package kotlinx.coroutines.flow;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FlowKt__ErrorsKt$catchImpl$2<T> implements InterfaceC7117d {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC7117d<T> f40115a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Ref$ObjectRef<Throwable> f40116b;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ErrorsKt$catchImpl$2(InterfaceC7117d<? super T> interfaceC7117d, Ref$ObjectRef<Throwable> ref$ObjectRef) {
        this.f40115a = interfaceC7117d;
        this.f40116b = ref$ObjectRef;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // kotlinx.coroutines.flow.InterfaceC7117d
    /* JADX INFO: renamed from: r */
    public final Object mo1339r(T t10, InterfaceC9968c<? super C9072e> interfaceC9968c) throws Throwable {
        FlowKt__ErrorsKt$catchImpl$2$emit$1 flowKt__ErrorsKt$catchImpl$2$emit$1;
        Object obj;
        FlowKt__ErrorsKt$catchImpl$2<T> flowKt__ErrorsKt$catchImpl$2;
        if (interfaceC9968c instanceof FlowKt__ErrorsKt$catchImpl$2$emit$1) {
            flowKt__ErrorsKt$catchImpl$2$emit$1 = (FlowKt__ErrorsKt$catchImpl$2$emit$1) interfaceC9968c;
            int i10 = flowKt__ErrorsKt$catchImpl$2$emit$1.f40120g;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$2$emit$1.f40120g = i10 - Integer.MIN_VALUE;
            } else {
                flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, interfaceC9968c);
            }
        } else {
            flowKt__ErrorsKt$catchImpl$2$emit$1 = new FlowKt__ErrorsKt$catchImpl$2$emit$1(this, interfaceC9968c);
        }
        Object obj2 = flowKt__ErrorsKt$catchImpl$2$emit$1.f40118e;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i11 = flowKt__ErrorsKt$catchImpl$2$emit$1.f40120g;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            flowKt__ErrorsKt$catchImpl$2 = flowKt__ErrorsKt$catchImpl$2$emit$1.f40117d;
            try {
                C7499b.m14977z0(obj2);
                return C9072e.f47360a;
            } catch (Throwable 
            /*  JADX ERROR: Method code generation error
                java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getCodeVar()" because "ssaVar" is null
                	at jadx.core.codegen.RegionGen.makeCatchBlock(RegionGen.java:372)
                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:335)
                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*
                this = this;
                boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                if (r0 == 0) goto L14
                r0 = r10
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1) r0
                int r1 = r0.f40120g
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L14
                r5 = 6
                int r1 = r1 - r2
                r0.f40120g = r1
                goto L1a
            L14:
                r6 = 5
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2$emit$1
                r0.<init>(r8, r10)
            L1a:
                java.lang.Object r10 = r0.f40118e
                kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                int r2 = r0.f40120g
                r4 = 1
                r3 = r4
                if (r2 == 0) goto L3a
                r6 = 5
                if (r2 != r3) goto L2f
                kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2 r9 = r0.f40117d
                p260m8.C7499b.m14977z0(r10)     // Catch: java.lang.Throwable -> L2d
                goto L4c
            L2d:
                r10 = move-exception
                goto L52
            L2f:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                r7 = 2
                java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
                r10 = r4
                r9.<init>(r10)
                throw r9
                r6 = 1
            L3a:
                p260m8.C7499b.m14977z0(r10)
                r7 = 4
                r7 = 7
                kotlinx.coroutines.flow.d<T> r10 = r8.f40115a     // Catch: java.lang.Throwable -> L4f
                r0.f40117d = r8     // Catch: java.lang.Throwable -> L4f
                r0.f40120g = r3     // Catch: java.lang.Throwable -> L4f
                java.lang.Object r9 = r10.mo1339r(r9, r0)     // Catch: java.lang.Throwable -> L4f
                if (r9 != r1) goto L4c
                return r1
            L4c:
                sl.e r9 = sl.C9072e.f47360a
                return r9
            L4f:
                r9 = move-exception
                r10 = r9
                r9 = r8
            L52:
                kotlin.jvm.internal.Ref$ObjectRef<java.lang.Throwable> r9 = r9.f40116b
                r9.f38127a = r10
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catchImpl$2.mo1339r(java.lang.Object, wl.c):java.lang.Object");
        }
    }
