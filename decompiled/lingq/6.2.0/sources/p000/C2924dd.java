package p000;

import com.google.common.util.concurrent.C1114d;
import java.util.Set;

/* JADX INFO: renamed from: dd */
/* JADX INFO: loaded from: classes2.dex */
public final class C2924dd extends o2d {
    @Override // p000.o2d
    /* JADX INFO: renamed from: b */
    public final void mo4534b(C1114d c1114d, Set set) {
        synchronized (c1114d) {
            try {
                if (c1114d.f13529h == null) {
                    c1114d.f13529h = set;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.o2d
    /* JADX INFO: renamed from: c */
    public final int mo4535c(C1114d c1114d) {
        int i;
        synchronized (c1114d) {
            i = c1114d.f13530i - 1;
            c1114d.f13530i = i;
        }
        return i;
    }
}
