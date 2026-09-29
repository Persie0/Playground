package com.lingq.feature.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC3193b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C3244l;
import p000.c32;
import p000.u91;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes2.dex */
@c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeLessonDataDownloads$1", m4291f = "CollectionViewModel.kt", m4292l = {1172, 1175}, m4293m = "invokeSuspend", m4294v = 2)
final class CollectionViewModel$observeLessonDataDownloads$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C2034d f25481a;

    /* JADX INFO: renamed from: b */
    public String f25482b;

    /* JADX INFO: renamed from: c */
    public Collection f25483c;

    /* JADX INFO: renamed from: d */
    public Iterator f25484d;

    /* JADX INFO: renamed from: e */
    public Collection f25485e;

    /* JADX INFO: renamed from: f */
    public int f25486f;

    /* JADX INFO: renamed from: g */
    public int f25487g;

    /* JADX INFO: renamed from: h */
    public int f25488h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ ArrayList f25489i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ C2034d f25490j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ String f25491k;

    /* JADX INFO: renamed from: com.lingq.feature.collections.CollectionViewModel$observeLessonDataDownloads$1$3 */
    @c32(m4290c = "com.lingq.feature.collections.CollectionViewModel$observeLessonDataDownloads$1$3", m4291f = "CollectionViewModel.kt", m4292l = {}, m4293m = "invokeSuspend", m4294v = 2)
    final class C20253 extends SuspendLambda implements zi3 {

        /* JADX INFO: renamed from: a */
        public /* synthetic */ Object f25492a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C2034d f25493b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20253(C2034d c2034d, Continuation continuation) {
            super(2, continuation);
            this.f25493b = c2034d;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C20253 c20253 = new C20253(this.f25493b, continuation);
            c20253.f25492a = obj;
            return c20253;
        }

        @Override // p000.zi3
        public final Object invoke(Object obj, Object obj2) throws Throwable {
            C20253 c20253 = (C20253) create((List) obj, (Continuation) obj2);
            xfa xfaVar = xfa.f68157a;
            c20253.invokeSuspend(xfaVar);
            return xfaVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            List list = (List) this.f25492a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            AbstractC3193b.m15359b(obj);
            C3244l c3244l = this.f25493b.f25565X;
            ArrayList arrayListM22587E0 = u91.m22587E0(list);
            c3244l.getClass();
            c3244l.m15572j(null, arrayListM22587E0);
            return xfa.f68157a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CollectionViewModel$observeLessonDataDownloads$1(C2034d c2034d, String str, ArrayList arrayList, Continuation continuation) {
        super(2, continuation);
        this.f25489i = arrayList;
        this.f25490j = c2034d;
        this.f25491k = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CollectionViewModel$observeLessonDataDownloads$1(this.f25490j, this.f25491k, this.f25489i, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((CollectionViewModel$observeLessonDataDownloads$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0059  */
    /* JADX WARN: Code duplicated, block: B:16:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x007f -> B:17:0x0080). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r14.f25488h
            com.lingq.feature.collections.d r2 = r14.f25490j
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r1 == 0) goto L31
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            kotlin.AbstractC3193b.m15359b(r15)
            goto Lb6
        L15:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r14)
            return r6
        L1b:
            int r1 = r14.f25487g
            int r7 = r14.f25486f
            java.util.Collection r8 = r14.f25485e
            java.util.Collection r8 = (java.util.Collection) r8
            java.util.Iterator r9 = r14.f25484d
            java.util.Collection r10 = r14.f25483c
            java.util.Collection r10 = (java.util.Collection) r10
            java.lang.String r11 = r14.f25482b
            com.lingq.feature.collections.d r12 = r14.f25481a
            kotlin.AbstractC3193b.m15359b(r15)
            goto L80
        L31:
            kotlin.AbstractC3193b.m15359b(r15)
            java.util.ArrayList r15 = r14.f25489i
            r1 = 100
            java.util.ArrayList r15 = p000.u91.m22632y0(r15, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r7 = 10
            int r7 = p000.v91.m23189q0(r15, r7)
            r1.<init>(r7)
            java.util.Iterator r15 = r15.iterator()
            java.lang.String r7 = r14.f25491k
            r9 = r15
            r8 = r1
            r12 = r2
            r1 = r5
            r11 = r7
            r7 = r1
        L53:
            boolean r15 = r9.hasNext()
            if (r15 == 0) goto L87
            java.lang.Object r15 = r9.next()
            java.util.List r15 = (java.util.List) r15
            s23 r10 = r12.f25587q
            r14.f25481a = r12
            r14.f25482b = r11
            r13 = r8
            java.util.Collection r13 = (java.util.Collection) r13
            r14.f25483c = r13
            r14.f25484d = r9
            r14.f25485e = r13
            r14.f25486f = r7
            r14.f25487g = r1
            r14.f25488h = r4
            y95 r10 = r10.f60177a
            com.lingq.core.data.repository.l r10 = (com.lingq.core.data.repository.C1296l) r10
            c83 r15 = r10.m7318m(r15)
            if (r15 != r0) goto L7f
            goto Lb5
        L7f:
            r10 = r8
        L80:
            c83 r15 = (p000.c83) r15
            r8.add(r15)
            r8 = r10
            goto L53
        L87:
            java.util.List r8 = (java.util.List) r8
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.List r15 = p000.u91.m22622n1(r8)
            java.util.Collection r15 = (java.util.Collection) r15
            c83[] r1 = new p000.c83[r5]
            java.lang.Object[] r15 = r15.toArray(r1)
            c83[] r15 = (p000.c83[]) r15
            t91 r1 = new t91
            r1.<init>(r15, r4)
            com.lingq.feature.collections.CollectionViewModel$observeLessonDataDownloads$1$3 r15 = new com.lingq.feature.collections.CollectionViewModel$observeLessonDataDownloads$1$3
            r15.<init>(r2, r6)
            r14.f25481a = r6
            r14.f25482b = r6
            r14.f25483c = r6
            r14.f25484d = r6
            r14.f25485e = r6
            r14.f25488h = r3
            java.lang.Object r14 = kotlinx.coroutines.flow.AbstractC3224d.m15529h(r1, r15, r14)
            if (r14 != r0) goto Lb6
        Lb5:
            return r0
        Lb6:
            xfa r14 = p000.xfa.f68157a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.collections.CollectionViewModel$observeLessonDataDownloads$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
