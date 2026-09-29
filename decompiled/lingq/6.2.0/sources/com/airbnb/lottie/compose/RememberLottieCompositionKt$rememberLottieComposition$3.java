package com.airbnb.lottie.compose;

import android.content.Context;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.aj3;
import p000.c32;
import p000.nl5;
import p000.t66;
import p000.un1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", m4291f = "rememberLottieComposition.kt", m4292l = {93, 95}, m4293m = "invokeSuspend")
final class RememberLottieCompositionKt$rememberLottieComposition$3 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Throwable f10707a;

    /* JADX INFO: renamed from: b */
    public int f10708b;

    /* JADX INFO: renamed from: c */
    public int f10709c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ aj3 f10710d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Context f10711e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ nl5 f10712f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ t66 f10713g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$rememberLottieComposition$3(aj3 aj3Var, Context context, nl5 nl5Var, t66 t66Var, Continuation continuation) {
        super(2, continuation);
        this.f10710d = aj3Var;
        this.f10711e = context;
        this.f10712f = nl5Var;
        this.f10713g = t66Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RememberLottieCompositionKt$rememberLottieComposition$3(this.f10710d, this.f10711e, this.f10712f, this.f10713g, continuation);
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((RememberLottieCompositionKt$rememberLottieComposition$3) create((un1) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0048 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x006c A[PHI: r0 r1
      0x006c: PHI (r0v23 int) = (r0v27 int), (r0v28 int) binds: [B:23:0x006a, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]
      0x006c: PHI (r1v4 java.lang.Throwable) = (r1v7 java.lang.Throwable), (r1v8 java.lang.Throwable) binds: [B:23:0x006a, B:18:0x0048] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:25:0x006e, B:32:0x008d, B:39:0x00a5, B:35:0x0098, B:38:0x00a0, B:28:0x007c, B:31:0x0086), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0086 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:25:0x006e, B:32:0x008d, B:39:0x00a5, B:35:0x0098, B:38:0x00a0, B:28:0x007c, B:31:0x0086), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0097 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:35:0x0098 A[Catch: all -> 0x00e9, TryCatch #2 {all -> 0x00e9, blocks: (B:25:0x006e, B:32:0x008d, B:39:0x00a5, B:35:0x0098, B:38:0x00a0, B:28:0x007c, B:31:0x0086), top: B:79:0x006e }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:47:0x00d3 A[Catch: all -> 0x0019, DONT_GENERATE, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x0019, blocks: (B:7:0x0012, B:43:0x00b7, B:44:0x00c1, B:47:0x00d3, B:50:0x00e1, B:54:0x00e8, B:45:0x00c2, B:49:0x00d5), top: B:81:0x0012, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00d5 A[Catch: all -> 0x00e6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:45:0x00c2, B:49:0x00d5), top: B:75:0x00c2, outer: #3 }] */
    /* JADX WARN: Code duplicated, block: B:75:0x00c2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00b6 -> B:43:0x00b7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x00ec -> B:16:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
