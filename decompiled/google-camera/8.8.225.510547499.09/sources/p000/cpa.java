package p000;

import java.io.File;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class cpa {

    /* JADX INFO: renamed from: a */
    public final kbz f8512a;

    /* JADX INFO: renamed from: b */
    public final Set f8513b;

    /* JADX INFO: renamed from: c */
    private coz f8514c;

    public cpa(kbz kbzVar, Set set) {
        this.f8512a = kbzVar;
        this.f8513b = set;
    }

    /* JADX INFO: renamed from: a */
    public final void m5218a(String str) {
        coz cozVar = new coz(this);
        this.f8514c = cozVar;
        cozVar.execute(str);
    }

    /* JADX INFO: renamed from: b */
    public final void m5219b(File file) {
        File[] fileArrListFiles = file.listFiles();
        lku.m15662p(fileArrListFiles);
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                m5219b(file2);
            } else {
                file2.delete();
            }
        }
        file.delete();
    }
}
