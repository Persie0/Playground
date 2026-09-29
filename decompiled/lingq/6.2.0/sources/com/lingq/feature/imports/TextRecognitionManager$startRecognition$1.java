package com.lingq.feature.imports;

import android.content.ContentResolver;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import p000.c32;
import p000.e83;
import p000.gx9;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes3.dex */
@c32(m4290c = "com.lingq.feature.imports.TextRecognitionManager$startRecognition$1", m4291f = "TextRecognitionManager.kt", m4292l = {111, 126, 145}, m4293m = "invokeSuspend", m4294v = 2)
final class TextRecognitionManager$startRecognition$1 extends SuspendLambda implements zi3 {

    /* JADX INFO: renamed from: a */
    public Iterator f25980a;

    /* JADX INFO: renamed from: b */
    public gx9 f25981b;

    /* JADX INFO: renamed from: c */
    public StringBuilder f25982c;

    /* JADX INFO: renamed from: d */
    public Iterator f25983d;

    /* JADX INFO: renamed from: e */
    public int f25984e;

    /* JADX INFO: renamed from: f */
    public int f25985f;

    /* JADX INFO: renamed from: g */
    public int f25986g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f25987h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2104a f25988i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ String f25989j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ List f25990k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ ContentResolver f25991l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextRecognitionManager$startRecognition$1(C2104a c2104a, String str, List list, ContentResolver contentResolver, Continuation continuation) {
        super(2, continuation);
        this.f25988i = c2104a;
        this.f25989j = str;
        this.f25990k = list;
        this.f25991l = contentResolver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TextRecognitionManager$startRecognition$1 textRecognitionManager$startRecognition$1 = new TextRecognitionManager$startRecognition$1(this.f25988i, this.f25989j, this.f25990k, this.f25991l, continuation);
        textRecognitionManager$startRecognition$1.f25987h = obj;
        return textRecognitionManager$startRecognition$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((TextRecognitionManager$startRecognition$1) create((e83) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:35:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e5 A[PHI: r13
      0x00e5: PHI (r13v4 java.util.Iterator) = (r13v0 java.util.Iterator), (r13v5 java.util.Iterator) binds: [B:58:0x00e5, B:38:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00d8 -> B:36:0x00dd). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lingq.feature.imports.TextRecognitionManager$startRecognition$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
