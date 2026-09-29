package androidx.compose.foundation.text.selection;

import kotlin.coroutines.jvm.internal.ContinuationImpl;
import p000.c32;

/* JADX INFO: loaded from: classes.dex */
@c32(m4290c = "androidx.compose.foundation.text.selection.TextFieldSelectionManager", m4291f = "TextFieldSelectionManager.kt", m4292l = {827}, m4293m = "updateClipboardEntry$foundation", m4294v = 1)
final class TextFieldSelectionManager$updateClipboardEntry$1 extends ContinuationImpl {

    /* JADX INFO: renamed from: a */
    public C0205f f3052a;

    /* JADX INFO: renamed from: b */
    public /* synthetic */ Object f3053b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C0205f f3054c;

    /* JADX INFO: renamed from: d */
    public int f3055d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldSelectionManager$updateClipboardEntry$1(C0205f c0205f, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.f3054c = c0205f;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f3053b = obj;
        this.f3055d |= Integer.MIN_VALUE;
        return this.f3054c.m1119t(this);
    }
}
