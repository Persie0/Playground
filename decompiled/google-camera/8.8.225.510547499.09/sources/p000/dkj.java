package p000;

import android.os.Build;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dkj extends kbj {
    @Override // p000.kbj
    /* JADX INFO: renamed from: a */
    public final kbk mo6311a(String str) {
        return new kbk(str, this);
    }

    @Override // p000.kbj
    /* JADX INFO: renamed from: b */
    public final boolean mo6312b(String str, int i) {
        int i2 = dkk.f11894a;
        if (i2 != 0) {
            return i2 <= i;
        }
        if (i == 2) {
            return dkk.m6313a(str, 2);
        }
        return "userdebug".equals(Build.TYPE) || "eng".equals(Build.TYPE) || dkk.m6313a(str, i);
    }
}
