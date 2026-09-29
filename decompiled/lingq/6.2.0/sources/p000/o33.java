package p000;

import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class o33 implements jj4 {

    /* JADX INFO: renamed from: a */
    public final boolean f53765a;

    public o33(boolean z) {
        this.f53765a = z;
    }

    @Override // p000.jj4
    /* JADX INFO: renamed from: a */
    public final String mo14496a(Object obj, sz6 sz6Var) {
        File file = (File) obj;
        if (!this.f53765a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
