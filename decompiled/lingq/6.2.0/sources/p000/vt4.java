package p000;

import androidx.compose.foundation.lazy.layout.C0139h;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final class vt4 implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f65879a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0139h f65880b;

    public /* synthetic */ vt4(C0139h c0139h, int i) {
        this.f65879a = i;
        this.f65880b = c0139h;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.f65879a;
        C0139h c0139h = this.f65880b;
        switch (i) {
            case 0:
                return ss5.m21718o(Integer.valueOf(c0139h.m1018a(((du4) obj).getKey())), Integer.valueOf(c0139h.m1018a(((du4) obj2).getKey())));
            case 1:
                return ss5.m21718o(Integer.valueOf(c0139h.m1018a(((du4) obj).getKey())), Integer.valueOf(c0139h.m1018a(((du4) obj2).getKey())));
            case 2:
                return ss5.m21718o(Integer.valueOf(c0139h.m1018a(((du4) obj2).getKey())), Integer.valueOf(c0139h.m1018a(((du4) obj).getKey())));
            default:
                return ss5.m21718o(Integer.valueOf(c0139h.m1018a(((du4) obj2).getKey())), Integer.valueOf(c0139h.m1018a(((du4) obj).getKey())));
        }
    }
}
