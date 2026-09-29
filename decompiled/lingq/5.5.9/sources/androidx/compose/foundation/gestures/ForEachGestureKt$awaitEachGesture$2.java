package androidx.compose.foundation.gestures;

import cm.InterfaceC2056p;
import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p060d1.InterfaceC5016c;
import p464wl.InterfaceC9968c;
import p490xl.InterfaceC10224c;
import sl.C9072e;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, m13365d2 = {"Ld1/c;", "Lsl/e;", "<anonymous>"}, m13366k = 3, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@InterfaceC10224c(m19205c = "androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2", m19206f = "ForEachGesture.kt", m19207l = {104, 107, 112}, m19208m = "invokeSuspend")
public final class ForEachGestureKt$awaitEachGesture$2 extends RestrictedSuspendLambda implements InterfaceC2056p<InterfaceC5016c, InterfaceC9968c<? super C9072e>, Object> {

    /* JADX INFO: renamed from: c */
    public int f2134c;

    /* JADX INFO: renamed from: d */
    public /* synthetic */ Object f2135d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ CoroutineContext f2136e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ InterfaceC2056p<InterfaceC5016c, InterfaceC9968c<? super C9072e>, Object> f2137f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForEachGestureKt$awaitEachGesture$2(InterfaceC9968c interfaceC9968c, CoroutineContext coroutineContext, InterfaceC2056p interfaceC2056p) {
        super(interfaceC9968c);
        this.f2136e = coroutineContext;
        this.f2137f = interfaceC2056p;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: a */
    public final InterfaceC9968c<C9072e> mo1336a(Object obj, InterfaceC9968c<?> interfaceC9968c) {
        ForEachGestureKt$awaitEachGesture$2 forEachGestureKt$awaitEachGesture$2 = new ForEachGestureKt$awaitEachGesture$2(interfaceC9968c, this.f2136e, this.f2137f);
        forEachGestureKt$awaitEachGesture$2.f2135d = obj;
        return forEachGestureKt$awaitEachGesture$2;
    }

    @Override // cm.InterfaceC2056p
    /* JADX INFO: renamed from: m0 */
    public final Object mo1337m0(InterfaceC5016c interfaceC5016c, InterfaceC9968c<? super C9072e> interfaceC9968c) {
        return ((ForEachGestureKt$awaitEachGesture$2) mo1336a(interfaceC5016c, interfaceC9968c)).mo1338x(C9072e.f47360a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    /* JADX WARN: Code duplicated, block: B:28:0x0065  */
    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:48:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v2, types: [d1.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r5v0, types: [d1.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
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
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0075 -> B:22:0x004b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x009b -> B:22:0x004b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /* JADX INFO: renamed from: x */
    public final java.lang.Object mo1338x(java.lang.Object r11) {
        /*
            r10 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r10.f2134c
            r8 = 3
            r2 = r8
            r8 = 2
            r3 = r8
            r8 = 1
            r4 = r8
            if (r1 == 0) goto L41
            r9 = 3
            if (r1 == r4) goto L33
            if (r1 == r3) goto L29
            if (r1 != r2) goto L1d
            java.lang.Object r1 = r10.f2135d
            r9 = 3
            d1.c r1 = (p060d1.InterfaceC5016c) r1
            r9 = 1
            p260m8.C7499b.m14977z0(r11)
            goto L31
        L1d:
            r9 = 3
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            r9 = 5
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            r9 = 4
            throw r11
            r9 = 4
        L29:
            java.lang.Object r1 = r10.f2135d
            d1.c r1 = (p060d1.InterfaceC5016c) r1
            r9 = 1
            p260m8.C7499b.m14977z0(r11)     // Catch: java.util.concurrent.CancellationException -> L3d
        L31:
            r11 = r1
            goto L4a
        L33:
            java.lang.Object r1 = r10.f2135d
            d1.c r1 = (p060d1.InterfaceC5016c) r1
            r9 = 3
            p260m8.C7499b.m14977z0(r11)     // Catch: java.util.concurrent.CancellationException -> L3d
            r11 = r10
            goto L68
        L3d:
            r11 = move-exception
            r5 = r1
            r1 = r10
            goto L84
        L41:
            p260m8.C7499b.m14977z0(r11)
            r9 = 6
            java.lang.Object r11 = r10.f2135d
            d1.c r11 = (p060d1.InterfaceC5016c) r11
            r9 = 6
        L4a:
            r1 = r10
        L4b:
            kotlin.coroutines.CoroutineContext r5 = r1.f2136e
            boolean r5 = ae.C0062b.m394s1(r5)
            if (r5 == 0) goto L9f
            r9 = 3
            cm.p<d1.c, wl.c<? super sl.e>, java.lang.Object> r5 = r1.f2137f     // Catch: java.util.concurrent.CancellationException -> L80
            r9 = 7
            r1.f2135d = r11     // Catch: java.util.concurrent.CancellationException -> L80
            r9 = 1
            r1.f2134c = r4     // Catch: java.util.concurrent.CancellationException -> L80
            r9 = 3
            java.lang.Object r5 = r5.mo1337m0(r11, r1)     // Catch: java.util.concurrent.CancellationException -> L80
            if (r5 != r0) goto L65
            r9 = 5
            return r0
        L65:
            r7 = r1
            r1 = r11
            r11 = r7
        L68:
            r11.f2135d = r1     // Catch: java.util.concurrent.CancellationException -> L7a
            r11.f2134c = r3     // Catch: java.util.concurrent.CancellationException -> L7a
            r9 = 5
            java.lang.Object r8 = androidx.compose.foundation.gestures.ForEachGestureKt.m1457a(r1, r11)     // Catch: java.util.concurrent.CancellationException -> L7a
            r5 = r8
            if (r5 != r0) goto L75
            return r0
        L75:
            r9 = 5
            r7 = r1
            r1 = r11
            r11 = r7
            goto L4b
        L7a:
            r5 = move-exception
            r7 = r1
            r1 = r11
            r11 = r5
            r5 = r7
            goto L84
        L80:
            r5 = move-exception
            r7 = r5
            r5 = r11
            r11 = r7
        L84:
            kotlin.coroutines.CoroutineContext r6 = r1.f2136e
            r9 = 7
            boolean r6 = ae.C0062b.m394s1(r6)
            if (r6 == 0) goto L9d
            r1.f2135d = r5
            r9 = 5
            r1.f2134c = r2
            java.lang.Object r8 = androidx.compose.foundation.gestures.ForEachGestureKt.m1457a(r5, r1)
            r11 = r8
            if (r11 != r0) goto L9b
            r9 = 3
            return r0
        L9b:
            r11 = r5
            goto L4b
        L9d:
            throw r11
            r9 = 5
        L9f:
            r9 = 2
            sl.e r11 = sl.C9072e.f47360a
            r9 = 6
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ForEachGestureKt$awaitEachGesture$2.mo1338x(java.lang.Object):java.lang.Object");
    }
}
