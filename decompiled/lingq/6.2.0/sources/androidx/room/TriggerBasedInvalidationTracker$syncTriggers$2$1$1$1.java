package androidx.room;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.d9a;
import p000.e9a;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1", m4291f = "InvalidationTracker.kt", m4292l = {318, 319}, m4293m = "invokeSuspend")
final class TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public ObservedTableStates$ObserveOp[] f6807a;

    /* JADX INFO: renamed from: b */
    public C0750h f6808b;

    /* JADX INFO: renamed from: c */
    public e9a f6809c;

    /* JADX INFO: renamed from: d */
    public int f6810d;

    /* JADX INFO: renamed from: e */
    public int f6811e;

    /* JADX INFO: renamed from: f */
    public int f6812f;

    /* JADX INFO: renamed from: g */
    public int f6813g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ObservedTableStates$ObserveOp[] f6814h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C0750h f6815i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ e9a f6816j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr, C0750h c0750h, e9a e9aVar, Continuation continuation) {
        super(2, continuation);
        this.f6814h = observedTableStates$ObserveOpArr;
        this.f6815i = c0750h;
        this.f6816j = e9aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1(this.f6814h, this.f6815i, this.f6816j, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1) create((d9a) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    /* JADX WARN: Code duplicated, block: B:26:0x0077  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0077 -> B:27:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.f6813g
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 == r4) goto Ld
            if (r1 != r3) goto L1d
        Ld:
            int r1 = r12.f6812f
            int r5 = r12.f6811e
            int r6 = r12.f6810d
            e9a r7 = r12.f6809c
            androidx.room.h r8 = r12.f6808b
            androidx.room.ObservedTableStates$ObserveOp[] r9 = r12.f6807a
            kotlin.AbstractC3193b.m15359b(r13)
            goto L5c
        L1d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r12)
            return r2
        L23:
            kotlin.AbstractC3193b.m15359b(r13)
            androidx.room.ObservedTableStates$ObserveOp[] r13 = r12.f6814h
            int r1 = r13.length
            r5 = 0
            androidx.room.h r6 = r12.f6815i
            e9a r7 = r12.f6816j
            r9 = r13
            r13 = r5
            r8 = r6
        L31:
            if (r5 >= r1) goto L7a
            r6 = r9[r5]
            int r10 = r13 + 1
            int[] r11 = p000.dca.f35409a
            int r6 = r6.ordinal()
            r6 = r11[r6]
            if (r6 == r4) goto L77
            if (r6 == r3) goto L62
            r11 = 3
            if (r6 != r11) goto L5e
            r12.f6807a = r9
            r12.f6808b = r8
            r12.f6809c = r7
            r12.f6810d = r10
            r12.f6811e = r5
            r12.f6812f = r1
            r12.f6813g = r3
            java.lang.Object r13 = androidx.room.C0750h.m2855d(r8, r7, r13, r12)
            if (r13 != r0) goto L5b
            goto L76
        L5b:
            r6 = r10
        L5c:
            r13 = r6
            goto L78
        L5e:
            p000.gm5.m12750e()
            return r2
        L62:
            r12.f6807a = r9
            r12.f6808b = r8
            r12.f6809c = r7
            r12.f6810d = r10
            r12.f6811e = r5
            r12.f6812f = r1
            r12.f6813g = r4
            java.lang.Object r13 = androidx.room.C0750h.m2854c(r8, r7, r13, r12)
            if (r13 != r0) goto L5b
        L76:
            return r0
        L77:
            r13 = r10
        L78:
            int r5 = r5 + r4
            goto L31
        L7a:
            xfa r12 = p000.xfa.f68157a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
