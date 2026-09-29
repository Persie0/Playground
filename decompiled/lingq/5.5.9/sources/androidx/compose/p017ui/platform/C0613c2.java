package androidx.compose.p017ui.platform;

import android.view.View;
import dm.C5207g;
import java.util.Map;

/* JADX INFO: renamed from: androidx.compose.ui.platform.c2 */
/* JADX INFO: loaded from: classes.dex */
public final class C0613c2 {

    /* JADX INFO: renamed from: a */
    public static final C0613c2 f4292a = new C0613c2();

    /* JADX INFO: renamed from: a */
    public final Map<Integer, Integer> m2345a(View view) {
        C5207g.m11111f(view, "view");
        Map<Integer, Integer> attributeSourceResourceMap = view.getAttributeSourceResourceMap();
        C5207g.m11110e(attributeSourceResourceMap, "view.attributeSourceResourceMap");
        return attributeSourceResourceMap;
    }
}
