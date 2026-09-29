package p225kk;

import dm.C5207g;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import mo.C7661i;
import p003a2.C0009a;

/* JADX INFO: renamed from: kk.k */
/* JADX INFO: loaded from: classes2.dex */
public final class C6714k {

    /* JADX INFO: renamed from: kk.k$a */
    public static final class a implements FilenameFilter {

        /* JADX INFO: renamed from: a */
        public final String f37935a = ".mp3";

        @Override // java.io.FilenameFilter
        public final boolean accept(File file, String str) {
            C5207g.m11111f(file, "dir");
            C5207g.m11111f(str, "name");
            return C7661i.m15248N2(str, this.f37935a);
        }
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m13315a(File file) {
        a aVar = new a();
        if (!file.isDirectory()) {
            return null;
        }
        String[] list = file.list(aVar);
        if (list != null && list.length == 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (String str : list) {
                File file2 = new File(C0009a.m21i(file.getAbsolutePath(), File.separator, str));
                if (file2.exists()) {
                    arrayList.add(file2);
                }
            }
        }
        return arrayList;
    }
}
