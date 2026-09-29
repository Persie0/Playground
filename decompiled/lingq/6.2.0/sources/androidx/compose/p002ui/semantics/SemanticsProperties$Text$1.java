package androidx.compose.p002ui.semantics;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
final class SemanticsProperties$Text$1 extends Lambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public static final SemanticsProperties$Text$1 f4934b = new SemanticsProperties$Text$1(2);

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        List list = (List) obj;
        List list2 = (List) obj2;
        if (list == null) {
            return list2;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(list2);
        return arrayList;
    }
}
