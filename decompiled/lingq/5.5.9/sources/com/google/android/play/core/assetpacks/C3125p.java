package com.google.android.play.core.assetpacks;

import com.google.android.play.core.assetpacks.C3125p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.p */
/* JADX INFO: loaded from: classes.dex */
public final class C3125p {

    /* JADX INFO: renamed from: a */
    public static final Pattern f15970a = Pattern.compile("[0-9]+-(NAM|LFH)\\.dat");

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static ArrayList m9009a(File file, File file2) throws IOException {
        File[] fileArr;
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file2.listFiles(new FilenameFilter() { // from class: qd.n1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file3, String str) {
                return C3125p.f15970a.matcher(str).matches();
            }
        });
        if (fileArrListFiles == null) {
            fileArr = new File[0];
        } else {
            File[] fileArr2 = new File[fileArrListFiles.length];
            for (File file3 : fileArrListFiles) {
                int i10 = Integer.parseInt(file3.getName().split("-")[0]);
                if (i10 > fileArrListFiles.length || fileArr2[i10] != null) {
                    throw new zzck("Metadata folder ordering corrupt.");
                }
                fileArr2[i10] = file3;
            }
            fileArr = fileArr2;
        }
        for (File file4 : fileArr) {
            arrayList.add(file4);
            if (file4.getName().contains("LFH")) {
                FileInputStream fileInputStream = new FileInputStream(file4);
                try {
                    String str = new C3115f(fileInputStream).m8983a().f45801a;
                    if (str == null) {
                        throw new zzck("Metadata files corrupt. Could not read local file header.");
                    }
                    File file5 = new File(file, str);
                    if (!file5.exists()) {
                        throw new zzck(String.format("Missing asset file %s during slice reconstruction.", file5.getCanonicalPath()));
                    }
                    arrayList.add(file5);
                    fileInputStream.close();
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th2;
                }
            }
        }
        return arrayList;
    }
}
