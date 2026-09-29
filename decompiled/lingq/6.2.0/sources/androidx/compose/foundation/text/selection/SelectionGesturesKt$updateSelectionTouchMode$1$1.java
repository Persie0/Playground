package androidx.compose.foundation.text.selection;

import androidx.compose.p002ui.input.pointer.C0332f;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import p000.c32;
import p000.sm1;
import p000.xfa;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1", m4291f = "SelectionGestures.kt", m4292l = {94}, m4293m = "invokeSuspend", m4294v = 1)
final class SelectionGesturesKt$updateSelectionTouchMode$1$1 extends RestrictedSuspendLambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public int f3023b;

    /* JADX INFO: renamed from: c */
    public /* synthetic */ Object f3024c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ sm1 f3025d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectionGesturesKt$updateSelectionTouchMode$1$1(sm1 sm1Var, Continuation continuation) {
        super(2, continuation);
        this.f3025d = sm1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SelectionGesturesKt$updateSelectionTouchMode$1$1 selectionGesturesKt$updateSelectionTouchMode$1$1 = new SelectionGesturesKt$updateSelectionTouchMode$1$1(this.f3025d, continuation);
        selectionGesturesKt$updateSelectionTouchMode$1$1.f3024c = obj;
        return selectionGesturesKt$updateSelectionTouchMode$1$1;
    }

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectionGesturesKt$updateSelectionTouchMode$1$1) create((C0332f) obj, (Continuation) obj2)).invokeSuspend(xfa.f68157a);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:12:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r4.f3023b
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L11
            java.lang.Object r1 = r4.f3024c
            androidx.compose.ui.input.pointer.f r1 = (androidx.compose.p002ui.input.pointer.C0332f) r1
            kotlin.AbstractC3193b.m15359b(r5)
            goto L2d
        L11:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            p000.C3386nv.m17633t(r4)
            r4 = 0
            return r4
        L18:
            kotlin.AbstractC3193b.m15359b(r5)
            java.lang.Object r5 = r4.f3024c
            androidx.compose.ui.input.pointer.f r5 = (androidx.compose.p002ui.input.pointer.C0332f) r5
            r1 = r5
        L20:
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.p002ui.input.pointer.PointerEventPass.Initial
            r4.f3024c = r1
            r4.f3023b = r2
            java.lang.Object r5 = r1.m1473b(r5, r4)
            if (r5 != r0) goto L2d
            return r0
        L2d:
            fg7 r5 = (p000.fg7) r5
            boolean r5 = p000.bv8.m4195a(r5)
            r5 = r5 ^ r2
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            sm1 r3 = r4.f3025d
            r3.invoke(r5)
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.SelectionGesturesKt$updateSelectionTouchMode$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
