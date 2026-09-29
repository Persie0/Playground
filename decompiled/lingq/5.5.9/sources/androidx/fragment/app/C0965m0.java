package androidx.fragment.app;

import android.view.View;
import java.util.ArrayList;
import p406u4.C9428p;

/* JADX INFO: renamed from: androidx.fragment.app.m0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0965m0 {

    /* JADX INFO: renamed from: a */
    public static final C0969o0 f6370a = new C0969o0();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0977s0 f6371b;

    static {
        AbstractC0977s0 abstractC0977s0;
        try {
            abstractC0977s0 = (AbstractC0977s0) C9428p.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            abstractC0977s0 = null;
        }
        f6371b = abstractC0977s0;
    }

    /* JADX INFO: renamed from: a */
    public static void m3778a(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }
}
