package com.lingq.feature.reader.old;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.u66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.reader.old.ReaderPageViewModel$setupSentencesUrls$1", m4291f = "ReaderPageViewModel.kt", m4292l = {1548}, m4293m = "invokeSuspend", m4294v = 2)
final class ReaderPageViewModel$setupSentencesUrls$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: H */
    public int f28712H;

    /* JADX INFO: renamed from: I */
    public int f28713I;

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C2411m f28714J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ List f28715K;

    /* JADX INFO: renamed from: a */
    public u66 f28716a;

    /* JADX INFO: renamed from: b */
    public List f28717b;

    /* JADX INFO: renamed from: c */
    public C2411m f28718c;

    /* JADX INFO: renamed from: d */
    public Object f28719d;

    /* JADX INFO: renamed from: e */
    public Map f28720e;

    /* JADX INFO: renamed from: f */
    public Iterator f28721f;

    /* JADX INFO: renamed from: g */
    public Map f28722g;

    /* JADX INFO: renamed from: h */
    public Integer f28723h;

    /* JADX INFO: renamed from: i */
    public int f28724i;

    /* JADX INFO: renamed from: j */
    public int f28725j;

    /* JADX INFO: renamed from: k */
    public int f28726k;

    /* JADX INFO: renamed from: l */
    public int f28727l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReaderPageViewModel$setupSentencesUrls$1(C2411m c2411m, List list, Continuation continuation) {
        super(2, continuation);
        this.f28714J = c2411m;
        this.f28715K = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ReaderPageViewModel$setupSentencesUrls$1(this.f28714J, this.f28715K, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((ReaderPageViewModel$setupSentencesUrls$1) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0069  */
    /* JADX WARN: Code duplicated, block: B:12:0x006a  */
    /* JADX WARN: Code duplicated, block: B:15:0x0082  */
    /* JADX WARN: Code duplicated, block: B:17:0x00c2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:28:0x00f2  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00c3 -> B:19:0x00cb). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.reader.old.ReaderPageViewModel$setupSentencesUrls$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
