package p000;

import java.io.File;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class lmo implements Comparable {

    /* JADX INFO: renamed from: a */
    final pam f38696a;

    /* JADX INFO: renamed from: b */
    final File f38697b;

    /* JADX INFO: renamed from: c */
    final lmo f38698c;

    /* JADX INFO: renamed from: d */
    final int f38699d;

    /* JADX INFO: renamed from: e */
    final boolean f38700e;

    /* JADX INFO: renamed from: f */
    final String f38701f;

    /* JADX INFO: renamed from: g */
    long f38702g;

    public lmo(lmo lmoVar, boolean z, String str) {
        this.f38702g = 0L;
        this.f38696a = lmoVar.f38696a;
        this.f38697b = lmoVar.f38697b;
        this.f38698c = lmoVar;
        this.f38699d = lmoVar.f38699d + 1;
        this.f38700e = z;
        if (lmoVar.f38699d != 0) {
            str = lmoVar.f38701f + "/" + str;
        }
        this.f38701f = str;
    }

    public lmo(pam pamVar, File file) {
        this.f38702g = 0L;
        this.f38696a = pamVar;
        this.f38697b = file;
        this.f38698c = null;
        this.f38699d = 0;
        this.f38700e = true;
        this.f38701f = "";
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        lmo lmoVar = (lmo) obj;
        int i = this.f38699d;
        int i2 = lmoVar.f38699d;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        boolean z = this.f38700e;
        if (z != lmoVar.f38700e) {
            return !z ? 1 : -1;
        }
        return this.f38701f.compareTo(lmoVar.f38701f);
    }
}
