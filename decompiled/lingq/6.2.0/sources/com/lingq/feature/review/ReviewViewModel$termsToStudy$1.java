package com.lingq.feature.review;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.review.ReviewViewModel$termsToStudy$1", m4291f = "ReviewViewModel.kt", m4292l = {365, 372, 374}, m4293m = "invokeSuspend", m4294v = 2)
final class ReviewViewModel$termsToStudy$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public C2758f f31900a;

    /* JADX INFO: renamed from: b */
    public Collection f31901b;

    /* JADX INFO: renamed from: c */
    public Iterator f31902c;

    /* JADX INFO: renamed from: d */
    public Collection f31903d;

    /* JADX INFO: renamed from: e */
    public int f31904e;

    /* JADX INFO: renamed from: f */
    public int f31905f;

    /* JADX INFO: renamed from: g */
    public int f31906g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Set f31907h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2758f f31908i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f31909j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f31910k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewViewModel$termsToStudy$1(Set set, C2758f c2758f, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.f31907h = set;
        this.f31908i = c2758f;
        this.f31909j = z;
        this.f31910k = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReviewViewModel$termsToStudy$1(this.f31907h, this.f31908i, this.f31909j, this.f31910k, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReviewViewModel$termsToStudy$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0118  */
    /* JADX WARN: Code duplicated, block: B:32:0x0126  */
    /* JADX WARN: Code duplicated, block: B:35:0x0142  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00e7 -> B:25:0x00e8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0164 -> B:41:0x0165). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.review.ReviewViewModel$termsToStudy$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
