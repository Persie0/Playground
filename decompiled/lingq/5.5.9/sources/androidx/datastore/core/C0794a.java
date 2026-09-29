package androidx.datastore.core;

import cm.InterfaceC2052l;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import p129g3.InterfaceC5689f;
import p260m8.C7499b;
import p464wl.InterfaceC9968c;

/* JADX INFO: renamed from: androidx.datastore.core.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0794a<T> {

    /* JADX INFO: renamed from: a */
    public static final a f5757a = new a();

    /* JADX INFO: renamed from: androidx.datastore.core.a$a */
    public static final class a {
        /* JADX WARN: Code duplicated, block: B:25:0x008b  */
        /* JADX WARN: Code duplicated, block: B:36:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:38:0x00be  */
        /* JADX WARN: Code duplicated, block: B:43:0x00a0 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:23:0x0084->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x001d  */
        /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Throwable] */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00a7 -> B:23:0x0084). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00ab -> B:23:0x0084). Please report as a decompilation issue!!! */
        /* JADX INFO: renamed from: a */
        public static final Object m3016a(a aVar, List list, InterfaceC5689f interfaceC5689f, InterfaceC9968c interfaceC9968c) throws Throwable {
            DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
            List list2;
            Iterator<T> it;
            Ref$ObjectRef ref$ObjectRef;
            Throwable th2;
            InterfaceC2052l interfaceC2052l;
            aVar.getClass();
            if (interfaceC9968c instanceof DataMigrationInitializer$Companion$runMigrations$1) {
                dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) interfaceC9968c;
                int i10 = dataMigrationInitializer$Companion$runMigrations$1.f5643h;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    dataMigrationInitializer$Companion$runMigrations$1.f5643h = i10 - Integer.MIN_VALUE;
                } else {
                    dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(aVar, interfaceC9968c);
                }
            } else {
                dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(aVar, interfaceC9968c);
            }
            Object obj = dataMigrationInitializer$Companion$runMigrations$1.f5641f;
            Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i11 = dataMigrationInitializer$Companion$runMigrations$1.f5643h;
            if (i11 != 0) {
                if (i11 == 1) {
                    list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.f5639d;
                    C7499b.m14977z0(obj);
                } else {
                    if (i11 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = dataMigrationInitializer$Companion$runMigrations$1.f5640e;
                    ref$ObjectRef = (Ref$ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.f5639d;
                    try {
                        C7499b.m14977z0(obj);
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
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
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
                        r5 = r9
                        r5.getClass()
                        boolean r0 = r12 instanceof androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                        r7 = 7
                        if (r0 == 0) goto L1d
                        r8 = 6
                        r0 = r12
                        androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = (androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1) r0
                        int r1 = r0.f5643h
                        r7 = 5
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r8 = 6
                        r3 = r1 & r2
                        if (r3 == 0) goto L1d
                        r8 = 3
                        int r1 = r1 - r2
                        r0.f5643h = r1
                        r8 = 5
                        goto L23
                    L1d:
                        androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1 r0 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1
                        r0.<init>(r5, r12)
                        r7 = 6
                    L23:
                        java.lang.Object r5 = r0.f5641f
                        kotlin.coroutines.intrinsics.CoroutineSingletons r12 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
                        r8 = 7
                        int r1 = r0.f5643h
                        r7 = 1
                        r2 = 2
                        r8 = 1
                        r3 = r8
                        if (r1 == 0) goto L57
                        if (r1 == r3) goto L4e
                        if (r1 != r2) goto L42
                        r8 = 4
                        java.util.Iterator r10 = r0.f5640e
                        r7 = 7
                        java.io.Serializable r11 = r0.f5639d
                        r7 = 3
                        kotlin.jvm.internal.Ref$ObjectRef r11 = (kotlin.jvm.internal.Ref$ObjectRef) r11
                        r7 = 6
                        p260m8.C7499b.m14977z0(r5)     // Catch: java.lang.Throwable -> La2
                        goto L84
                    L42:
                        r8 = 3
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        r8 = 3
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r10 = r7
                        r5.<init>(r10)
                        r8 = 2
                        throw r5
                    L4e:
                        java.io.Serializable r10 = r0.f5639d
                        java.util.List r10 = (java.util.List) r10
                        r8 = 5
                        p260m8.C7499b.m14977z0(r5)
                        goto L7a
                    L57:
                        r7 = 3
                        p260m8.C7499b.m14977z0(r5)
                        r7 = 6
                        java.util.ArrayList r5 = new java.util.ArrayList
                        r7 = 1
                        r5.<init>()
                        r7 = 2
                        androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2 r1 = new androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$2
                        r8 = 0
                        r4 = r8
                        r1.<init>(r10, r5, r4)
                        r7 = 1
                        r0.f5639d = r5
                        r0.f5643h = r3
                        java.lang.Object r7 = r11.mo3015b(r1, r0)
                        r10 = r7
                        if (r10 != r12) goto L78
                        r8 = 2
                        goto Lbd
                    L78:
                        r8 = 1
                        r10 = r5
                    L7a:
                        kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
                        r5.<init>()
                        java.util.Iterator r10 = r10.iterator()
                        r11 = r5
                    L84:
                        boolean r8 = r10.hasNext()
                        r5 = r8
                        if (r5 == 0) goto Lb3
                        r8 = 2
                        java.lang.Object r5 = r10.next()
                        cm.l r5 = (cm.InterfaceC2052l) r5
                        r7 = 4
                        r0.f5639d = r11     // Catch: java.lang.Throwable -> La2
                        r0.f5640e = r10     // Catch: java.lang.Throwable -> La2
                        r7 = 1
                        r0.f5643h = r2     // Catch: java.lang.Throwable -> La2
                        java.lang.Object r5 = r5.mo528n(r0)     // Catch: java.lang.Throwable -> La2
                        if (r5 != r12) goto L84
                        r7 = 3
                        goto Lbd
                    La2:
                        r5 = move-exception
                        T r1 = r11.f38127a
                        if (r1 != 0) goto Lab
                        r7 = 6
                        r11.f38127a = r5
                        goto L84
                    Lab:
                        r8 = 5
                        java.lang.Throwable r1 = (java.lang.Throwable) r1
                        p349qo.C8656b.m16899g(r1, r5)
                        r7 = 5
                        goto L84
                    Lb3:
                        T r5 = r11.f38127a
                        r7 = 1
                        java.lang.Throwable r5 = (java.lang.Throwable) r5
                        if (r5 != 0) goto Lbe
                        r8 = 5
                        sl.e r12 = sl.C9072e.f47360a
                    Lbd:
                        return r12
                    Lbe:
                        throw r5
                        r8 = 7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.C0794a.a.m3016a(androidx.datastore.core.a$a, java.util.List, g3.f, wl.c):java.lang.Object");
                }
            }
        }
