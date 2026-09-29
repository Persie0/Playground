package androidx.compose.p002ui.layout;

import kotlin.jvm.internal.FunctionReferenceImpl;
import p000.ss5;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AlignmentLineKt$FirstBaseline$1 extends FunctionReferenceImpl implements zi3 {

    /* JADX INFO: renamed from: i */
    public static final AlignmentLineKt$FirstBaseline$1 f4148i = new AlignmentLineKt$FirstBaseline$1(2, ss5.class, "min", "min(II)I", 1);

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        return Integer.valueOf(Math.min(((Number) obj).intValue(), ((Number) obj2).intValue()));
    }
}
