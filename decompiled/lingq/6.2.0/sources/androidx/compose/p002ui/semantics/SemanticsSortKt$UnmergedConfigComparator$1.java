package androidx.compose.p002ui.semantics;

import kotlin.jvm.internal.Lambda;
import p000.kv8;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
final class SemanticsSortKt$UnmergedConfigComparator$1 extends Lambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public static final SemanticsSortKt$UnmergedConfigComparator$1 f4941b = new SemanticsSortKt$UnmergedConfigComparator$1(2);

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        Object objValueOf = Float.valueOf(0.0f);
        C0423c c0423c = (C0423c) obj2;
        kv8 kv8Var = ((C0423c) obj).f4974d;
        C0427g c0427g = AbstractC0424d.f5014u;
        Object objM17255g = kv8Var.f48471a.m17255g(c0427g);
        if (objM17255g == null) {
            objM17255g = objValueOf;
        }
        float fFloatValue = ((Number) objM17255g).floatValue();
        Object objM17255g2 = c0423c.f4974d.f48471a.m17255g(c0427g);
        if (objM17255g2 != null) {
            objValueOf = objM17255g2;
        }
        return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
    }
}
