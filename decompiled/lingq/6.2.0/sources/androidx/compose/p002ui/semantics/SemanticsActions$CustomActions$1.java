package androidx.compose.p002ui.semantics;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Lambda;
import p000.u91;
import p000.zi3;

/* JADX INFO: loaded from: classes.dex */
final class SemanticsActions$CustomActions$1 extends Lambda implements zi3 {

    /* JADX INFO: renamed from: b */
    public static final SemanticsActions$CustomActions$1 f4917b = new SemanticsActions$CustomActions$1(2);

    @Override // p000.zi3
    public final Object invoke(Object obj, Object obj2) {
        Collection collection = (List) obj;
        List list = (List) obj2;
        if (collection == null) {
            collection = EmptyList.f47638a;
        }
        return u91.m22603U0(list, collection);
    }
}
