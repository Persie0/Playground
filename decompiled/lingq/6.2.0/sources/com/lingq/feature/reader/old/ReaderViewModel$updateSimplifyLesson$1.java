package com.lingq.feature.reader.old;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderViewModel$updateSimplifyLesson$1", m4291f = "ReaderViewModel.kt", m4292l = {2728, 2729}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderViewModel$updateSimplifyLesson$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public int f29158a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C2412n f29159b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderViewModel$updateSimplifyLesson$1(C2412n c2412n, Continuation continuation) {
        super(1, continuation);
        this.f29159b = c2412n;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ReaderViewModel$updateSimplifyLesson$1(this.f29159b, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((ReaderViewModel$updateSimplifyLesson$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020  */
    /* JADX WARN: Code duplicated, block: B:13:0x002a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0036  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:19:0x0046  */
    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x0055  */
    /* JADX WARN: Code duplicated, block: B:25:0x0062  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x007f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x009f -> B:11:0x0020). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            com.lingq.feature.reader.old.n r0 = r9.f29159b
            c18 r1 = r0.f29363g2
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r3 = r9.f29158a
            r4 = 2
            r5 = 1
            r6 = 0
            if (r3 == 0) goto L1d
            if (r3 == r5) goto L18
            if (r3 != r4) goto L12
            goto L1d
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r9)
            return r6
        L18:
            kotlin.AbstractC3193b.m15359b(r10)
            goto L97
        L1d:
            kotlin.AbstractC3193b.m15359b(r10)
        L20:
            u66 r10 = r1.f9311a
            kotlinx.coroutines.flow.l r10 = (kotlinx.coroutines.flow.C3244l) r10
            java.lang.Object r10 = r10.getValue()
            if (r10 == 0) goto L82
            u66 r10 = r1.f9311a
            kotlinx.coroutines.flow.l r10 = (kotlinx.coroutines.flow.C3244l) r10
            java.lang.Object r10 = r10.getValue()
            com.lingq.core.domain.model.library.LessonInfo r10 = (com.lingq.core.domain.model.library.LessonInfo) r10
            if (r10 == 0) goto L39
            java.lang.String r10 = r10.f19361Q
            goto L3a
        L39:
            r10 = r6
        L3a:
            com.lingq.core.domain.model.lesson.LessonProcessingStatus r3 = com.lingq.core.domain.model.lesson.LessonProcessingStatus.AI
            java.lang.String r3 = r3.getValue()
            boolean r10 = p000.fa4.m11650l(r10, r3)
            if (r10 != 0) goto L82
            u66 r10 = r1.f9311a
            kotlinx.coroutines.flow.l r10 = (kotlinx.coroutines.flow.C3244l) r10
            java.lang.Object r10 = r10.getValue()
            com.lingq.core.domain.model.library.LessonInfo r10 = (com.lingq.core.domain.model.library.LessonInfo) r10
            if (r10 == 0) goto L55
            java.lang.String r10 = r10.f19370f
            goto L56
        L55:
            r10 = r6
        L56:
            com.lingq.core.domain.model.lesson.LessonStatus r3 = com.lingq.core.domain.model.lesson.LessonStatus.INACESSIBLE_I
            java.lang.String r3 = r3.getValue()
            boolean r10 = p000.fa4.m11650l(r10, r3)
            if (r10 != 0) goto L82
            u66 r10 = r1.f9311a
            kotlinx.coroutines.flow.l r10 = (kotlinx.coroutines.flow.C3244l) r10
            java.lang.Object r10 = r10.getValue()
            com.lingq.core.domain.model.library.LessonInfo r10 = (com.lingq.core.domain.model.library.LessonInfo) r10
            if (r10 == 0) goto L71
            java.lang.String r10 = r10.f19370f
            goto L72
        L71:
            r10 = r6
        L72:
            com.lingq.core.domain.model.lesson.LessonStatus r3 = com.lingq.core.domain.model.lesson.LessonStatus.INACESSIBLE
            java.lang.String r3 = r3.getValue()
            boolean r10 = p000.fa4.m11650l(r10, r3)
            if (r10 == 0) goto L7f
            goto L82
        L7f:
            xfa r9 = p000.xfa.f68157a
            return r9
        L82:
            d65 r10 = r0.f29394p
            cma r3 = r0.f29340b
            java.lang.String r3 = r3.mo4589b2()
            int r7 = r0.m9332l3()
            r9.f29158a = r5
            java.lang.Object r10 = p000.d65.m10118b(r10, r3, r7, r9)
            if (r10 != r2) goto L97
            goto La1
        L97:
            r9.f29158a = r4
            r7 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r10 = kotlinx.coroutines.AbstractC3208a.m15437d(r7, r9)
            if (r10 != r2) goto L20
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.reader.old.ReaderViewModel$updateSimplifyLesson$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
