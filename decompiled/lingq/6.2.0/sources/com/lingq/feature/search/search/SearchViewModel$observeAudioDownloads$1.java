package com.lingq.feature.search.search;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.vi3;
import p000.xfa;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.search.search.SearchViewModel$observeAudioDownloads$1", m4291f = "SearchViewModel.kt", m4292l = {623, 627}, m4293m = "invokeSuspend", m4294v = 2)
final class SearchViewModel$observeAudioDownloads$1 extends SuspendLambda implements vi3 {

    /* JADX INFO: renamed from: a */
    public C2779e f33015a;

    /* JADX INFO: renamed from: b */
    public Collection f33016b;

    /* JADX INFO: renamed from: c */
    public Iterator f33017c;

    /* JADX INFO: renamed from: d */
    public Collection f33018d;

    /* JADX INFO: renamed from: e */
    public int f33019e;

    /* JADX INFO: renamed from: f */
    public int f33020f;

    /* JADX INFO: renamed from: g */
    public int f33021g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ ArrayList f33022h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2779e f33023i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchViewModel$observeAudioDownloads$1(C2779e c2779e, ArrayList arrayList, Continuation continuation) {
        super(1, continuation);
        this.f33022h = arrayList;
        this.f33023i = c2779e;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new SearchViewModel$observeAudioDownloads$1(this.f33023i, this.f33022h, continuation);
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        return ((SearchViewModel$observeAudioDownloads$1) create((Continuation) obj)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0056  */
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
            int r1 = r14.f33021g
            xfa r2 = p000.xfa.f68157a
            com.lingq.feature.search.search.e r3 = r14.f33023i
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r1 == 0) goto L31
            if (r1 == r5) goto L1d
            if (r1 != r4) goto L17
            kotlin.AbstractC3193b.m15359b(r15)
            goto Lc2
        L17:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r14)
            return r7
        L1d:
            int r1 = r14.f33020f
            int r8 = r14.f33019e
            java.util.Collection r9 = r14.f33018d
            java.util.Collection r9 = (java.util.Collection) r9
            java.util.Iterator r10 = r14.f33017c
            java.util.Collection r11 = r14.f33016b
            java.util.Collection r11 = (java.util.Collection) r11
            com.lingq.feature.search.search.e r12 = r14.f33015a
            kotlin.AbstractC3193b.m15359b(r15)
            goto L80
        L31:
            kotlin.AbstractC3193b.m15359b(r15)
            java.util.ArrayList r15 = r14.f33022h
            r1 = 100
            java.util.ArrayList r15 = p000.u91.m22632y0(r15, r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r8 = 10
            int r8 = p000.v91.m23189q0(r15, r8)
            r1.<init>(r8)
            java.util.Iterator r15 = r15.iterator()
            r10 = r15
            r9 = r1
            r12 = r3
            r1 = r6
            r8 = r1
        L50:
            boolean r15 = r10.hasNext()
            if (r15 == 0) goto L87
            java.lang.Object r15 = r10.next()
            java.util.List r15 = (java.util.List) r15
            e23 r11 = r12.f33104l
            cma r13 = r12.f33094b
            r13.mo4589b2()
            r14.f33015a = r12
            r13 = r9
            java.util.Collection r13 = (java.util.Collection) r13
            r14.f33016b = r13
            r14.f33017c = r10
            r14.f33018d = r13
            r14.f33019e = r8
            r14.f33020f = r1
            r14.f33021g = r5
            y95 r11 = r11.f36613a
            com.lingq.core.data.repository.l r11 = (com.lingq.core.data.repository.C1296l) r11
            c83 r15 = r11.m7316k(r15)
            if (r15 != r0) goto L7f
            goto Lc1
        L7f:
            r11 = r9
        L80:
            c83 r15 = (p000.c83) r15
            r9.add(r15)
            r9 = r11
            goto L50
        L87:
            java.util.List r9 = (java.util.List) r9
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.List r15 = p000.u91.m22622n1(r9)
            java.util.Collection r15 = (java.util.Collection) r15
            c83[] r1 = new p000.c83[r6]
            java.lang.Object[] r15 = r15.toArray(r1)
            c83[] r15 = (p000.c83[]) r15
            kt8 r1 = new kt8
            r1.<init>(r3, r6)
            r14.f33015a = r7
            r14.f33016b = r7
            r14.f33017c = r7
            r14.f33018d = r7
            r14.f33021g = r4
            b91 r3 = new b91
            r4 = 14
            r3.<init>(r15, r4)
            com.lingq.feature.search.search.SearchViewModel$observeAudioDownloads$1$invokeSuspend$$inlined$combine$1$3 r4 = new com.lingq.feature.search.search.SearchViewModel$observeAudioDownloads$1$invokeSuspend$$inlined$combine$1$3
            r5 = 3
            r4.<init>(r5, r7)
            java.lang.Object r14 = kotlinx.coroutines.flow.internal.AbstractC3238h.m15568a(r1, r3, r4, r14, r15)
            kotlin.coroutines.intrinsics.CoroutineSingletons r15 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r14 != r15) goto Lbe
            goto Lbf
        Lbe:
            r14 = r2
        Lbf:
            if (r14 != r0) goto Lc2
        Lc1:
            return r0
        Lc2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.search.search.SearchViewModel$observeAudioDownloads$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
