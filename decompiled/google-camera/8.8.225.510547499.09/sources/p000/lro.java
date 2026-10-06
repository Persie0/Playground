package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.OsConstants;
import android.system.StructStat;
import com.google.android.apps.camera.smarts.ScBZ.IuyLAqNmW;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lro {

    /* JADX INFO: renamed from: a */
    private static final String[] f39094a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};

    /* JADX INFO: renamed from: b */
    private static final String[] f39095b;

    /* JADX INFO: renamed from: c */
    private static final String[] f39096c;

    static {
        String[] strArr = new String[2];
        strArr[0] = "media";
        strArr[1] = true != (Build.HARDWARE.equals("goldfish") || Build.HARDWARE.equals("ranchu")) ? "" : "androidx.test.services.storage.runfiles";
        f39095b = strArr;
        f39096c = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    /* JADX INFO: renamed from: a */
    public static AssetFileDescriptor m15916a(Context context, Uri uri, String str) {
        return m15917b(context, uri, str, lrn.f39090a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:112:0x01e7 A[Catch: IOException -> 0x0273, FileNotFoundException -> 0x0282, TryCatch #2 {FileNotFoundException -> 0x0282, IOException -> 0x0273, blocks: (B:91:0x0160, B:98:0x01ae, B:100:0x01b6, B:102:0x01be, B:104:0x01c4, B:106:0x01ca, B:136:0x0244, B:112:0x01e7, B:114:0x01ed, B:116:0x01f3, B:119:0x01ff, B:121:0x020e, B:123:0x0212, B:126:0x021e, B:127:0x0221, B:129:0x0230, B:131:0x0234, B:134:0x0240, B:109:0x01d7, B:139:0x0249, B:140:0x0256, B:141:0x0257, B:142:0x0264, B:143:0x0265, B:144:0x0272), top: B:154:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x01ff A[Catch: IOException -> 0x0273, FileNotFoundException -> 0x0282, TryCatch #2 {FileNotFoundException -> 0x0282, IOException -> 0x0273, blocks: (B:91:0x0160, B:98:0x01ae, B:100:0x01b6, B:102:0x01be, B:104:0x01c4, B:106:0x01ca, B:136:0x0244, B:112:0x01e7, B:114:0x01ed, B:116:0x01f3, B:119:0x01ff, B:121:0x020e, B:123:0x0212, B:126:0x021e, B:127:0x0221, B:129:0x0230, B:131:0x0234, B:134:0x0240, B:109:0x01d7, B:139:0x0249, B:140:0x0256, B:141:0x0257, B:142:0x0264, B:143:0x0265, B:144:0x0272), top: B:154:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x020e A[Catch: IOException -> 0x0273, FileNotFoundException -> 0x0282, TryCatch #2 {FileNotFoundException -> 0x0282, IOException -> 0x0273, blocks: (B:91:0x0160, B:98:0x01ae, B:100:0x01b6, B:102:0x01be, B:104:0x01c4, B:106:0x01ca, B:136:0x0244, B:112:0x01e7, B:114:0x01ed, B:116:0x01f3, B:119:0x01ff, B:121:0x020e, B:123:0x0212, B:126:0x021e, B:127:0x0221, B:129:0x0230, B:131:0x0234, B:134:0x0240, B:109:0x01d7, B:139:0x0249, B:140:0x0256, B:141:0x0257, B:142:0x0264, B:143:0x0265, B:144:0x0272), top: B:154:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:123:0x0212 A[Catch: IOException -> 0x0273, FileNotFoundException -> 0x0282, TryCatch #2 {FileNotFoundException -> 0x0282, IOException -> 0x0273, blocks: (B:91:0x0160, B:98:0x01ae, B:100:0x01b6, B:102:0x01be, B:104:0x01c4, B:106:0x01ca, B:136:0x0244, B:112:0x01e7, B:114:0x01ed, B:116:0x01f3, B:119:0x01ff, B:121:0x020e, B:123:0x0212, B:126:0x021e, B:127:0x0221, B:129:0x0230, B:131:0x0234, B:134:0x0240, B:109:0x01d7, B:139:0x0249, B:140:0x0256, B:141:0x0257, B:142:0x0264, B:143:0x0265, B:144:0x0272), top: B:154:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x0230 A[Catch: IOException -> 0x0273, FileNotFoundException -> 0x0282, TryCatch #2 {FileNotFoundException -> 0x0282, IOException -> 0x0273, blocks: (B:91:0x0160, B:98:0x01ae, B:100:0x01b6, B:102:0x01be, B:104:0x01c4, B:106:0x01ca, B:136:0x0244, B:112:0x01e7, B:114:0x01ed, B:116:0x01f3, B:119:0x01ff, B:121:0x020e, B:123:0x0212, B:126:0x021e, B:127:0x0221, B:129:0x0230, B:131:0x0234, B:134:0x0240, B:109:0x01d7, B:139:0x0249, B:140:0x0256, B:141:0x0257, B:142:0x0264, B:143:0x0265, B:144:0x0272), top: B:154:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:131:0x0234 A[Catch: IOException -> 0x0273, FileNotFoundException -> 0x0282, TryCatch #2 {FileNotFoundException -> 0x0282, IOException -> 0x0273, blocks: (B:91:0x0160, B:98:0x01ae, B:100:0x01b6, B:102:0x01be, B:104:0x01c4, B:106:0x01ca, B:136:0x0244, B:112:0x01e7, B:114:0x01ed, B:116:0x01f3, B:119:0x01ff, B:121:0x020e, B:123:0x0212, B:126:0x021e, B:127:0x0221, B:129:0x0230, B:131:0x0234, B:134:0x0240, B:109:0x01d7, B:139:0x0249, B:140:0x0256, B:141:0x0257, B:142:0x0264, B:143:0x0265, B:144:0x0272), top: B:154:0x0160 }] */
    /* JADX WARN: Code duplicated, block: B:167:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:169:0x021e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x0243 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:173:0x0240 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        if (r20.f39091b == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00db, code lost:
    
        if (r20.f39091b != false) goto L84;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AssetFileDescriptor m15917b(Context context, Uri uri, String str, lrn lrnVar) throws FileNotFoundException {
        boolean z;
        Context contextM163a;
        File[] fileArrM15920e;
        int length;
        int i;
        File[] fileArrM15920e2;
        int length2;
        int i2;
        File file;
        File file2;
        File fileM164b;
        int i3;
        int i4;
        ContentResolver contentResolver = context.getContentResolver();
        String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(uri, str);
        }
        int i5 = 0;
        if (!"content".equals(scheme)) {
            if (!"file".equals(scheme)) {
                throw new FileNotFoundException(IuyLAqNmW.YOAxjZLjnE);
            }
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, str);
            m15921f(assetFileDescriptorOpenAssetFileDescriptor);
            try {
                ParcelFileDescriptor parcelFileDescriptor = assetFileDescriptorOpenAssetFileDescriptor.getParcelFileDescriptor();
                String canonicalPath = new File(uri.getPath()).getCanonicalPath();
                StructStat structStat = (StructStat) lqi.m15859d(new kij(parcelFileDescriptor.getFileDescriptor(), 12));
                long j = structStat.st_dev;
                long j2 = structStat.st_ino;
                OsConstants.S_ISLNK(structStat.st_mode);
                StructStat structStat2 = (StructStat) lqi.m15859d(new kij(canonicalPath, 11));
                long j3 = structStat2.st_dev;
                long j4 = structStat2.st_ino;
                if (OsConstants.S_ISLNK(structStat2.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
                }
                if (j != j3 || j2 != j4) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
                }
                if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
                    lrn lrnVar2 = lrn.f39090a;
                    if (!lrnVar.f39092c) {
                        File fileM164b2 = abv.m164b(context);
                        if (fileM164b2 != null) {
                            if (canonicalPath.startsWith(m15918c(fileM164b2))) {
                                z = true;
                            } else {
                                contextM163a = abv.m163a(context);
                                if (contextM163a != null || (fileM164b = abv.m164b(contextM163a)) == null || !canonicalPath.startsWith(m15918c(fileM164b))) {
                                    fileArrM15920e = m15920e(new kij(context, 9));
                                    length = fileArrM15920e.length;
                                    i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            fileArrM15920e2 = m15920e(new kij(context, 10));
                                            length2 = fileArrM15920e2.length;
                                            i2 = 0;
                                            while (true) {
                                                if (i2 >= length2) {
                                                    z = false;
                                                    break;
                                                }
                                                file = fileArrM15920e2[i2];
                                                if (file == null && canonicalPath.startsWith(m15918c(file))) {
                                                    z = true;
                                                    break;
                                                }
                                                i2++;
                                            }
                                        } else {
                                            file2 = fileArrM15920e[i];
                                            if (file2 == null && canonicalPath.startsWith(m15918c(file2))) {
                                                z = true;
                                                break;
                                            }
                                            i++;
                                        }
                                    }
                                } else {
                                    z = true;
                                }
                            }
                        } else if (canonicalPath.startsWith(m15918c(Environment.getDataDirectory()))) {
                            z = true;
                        } else {
                            contextM163a = abv.m163a(context);
                            if (contextM163a != null) {
                                fileArrM15920e = m15920e(new kij(context, 9));
                                length = fileArrM15920e.length;
                                i = 0;
                                while (true) {
                                    if (i >= length) {
                                        fileArrM15920e2 = m15920e(new kij(context, 10));
                                        length2 = fileArrM15920e2.length;
                                        i2 = 0;
                                        while (true) {
                                            if (i2 >= length2) {
                                                z = false;
                                                break;
                                            }
                                            file = fileArrM15920e2[i2];
                                            if (file == null) {
                                            }
                                            i2++;
                                        }
                                    } else {
                                        file2 = fileArrM15920e[i];
                                        if (file2 == null) {
                                        }
                                        i++;
                                    }
                                }
                            } else {
                                fileArrM15920e = m15920e(new kij(context, 9));
                                length = fileArrM15920e.length;
                                i = 0;
                                while (true) {
                                    if (i >= length) {
                                        fileArrM15920e2 = m15920e(new kij(context, 10));
                                        length2 = fileArrM15920e2.length;
                                        i2 = 0;
                                        while (true) {
                                            if (i2 >= length2) {
                                                z = false;
                                                break;
                                            }
                                            file = fileArrM15920e2[i2];
                                            if (file == null) {
                                            }
                                            i2++;
                                        }
                                    } else {
                                        file2 = fileArrM15920e[i];
                                        if (file2 == null) {
                                        }
                                        i++;
                                    }
                                }
                            }
                        }
                        if (z == lrnVar.f39091b) {
                            return assetFileDescriptorOpenAssetFileDescriptor;
                        }
                    }
                }
                throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(canonicalPath)));
            } catch (FileNotFoundException e) {
                m15919d(assetFileDescriptorOpenAssetFileDescriptor, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                m15919d(assetFileDescriptorOpenAssetFileDescriptor, fileNotFoundException);
                throw fileNotFoundException;
            }
        }
        switch (str) {
            case "r":
                i3 = 1;
                break;
            case "w":
            case "wt":
            case "rw":
            case "rwt":
                i3 = 2;
                break;
            default:
                throw new IllegalArgumentException();
        }
        String authority = uri.getAuthority();
        ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (providerInfoResolveContentProvider == null) {
            int iLastIndexOf = authority.lastIndexOf(64);
            if (iLastIndexOf >= 0) {
                authority = authority.substring(iLastIndexOf + 1);
                providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (providerInfoResolveContentProvider == null) {
                lrn lrnVar3 = lrn.f39090a;
            }
        }
        lpe lpeVar = new lpe(uri, providerInfoResolveContentProvider);
        lrn lrnVar4 = lrn.f39090a;
        mws mwsVar = lrnVar.f39093d;
        int i6 = ((mzr) mwsVar).f41859c;
        while (true) {
            if (i5 < i6) {
                int iMo15914a = ((lrp) mwsVar.get(i5)).mo15914a(context, lpeVar, lrnVar.f39091b) - 1;
                i5++;
                switch (iMo15914a) {
                    case 0:
                        i4 = 1;
                        break;
                    case 1:
                        i4 = 2;
                        break;
                    default:
                        break;
                }
            } else {
                i4 = 3;
            }
        }
        switch (i4 - 1) {
            case 0:
                AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(uri, str);
                m15921f(assetFileDescriptorOpenAssetFileDescriptor2);
                return assetFileDescriptorOpenAssetFileDescriptor2;
            case 1:
                throw new FileNotFoundException("Can't open content uri.");
            default:
                if (!context.getPackageName().equals(providerInfoResolveContentProvider.packageName)) {
                    if (!lrnVar.f39091b) {
                        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), i3) != 0 && providerInfoResolveContentProvider.exported) {
                            String[] strArr = f39095b;
                            int length3 = strArr.length;
                            for (int i7 = 0; i7 < 2; i7++) {
                                if (!strArr[i7].equals(authority)) {
                                }
                            }
                            String[] strArr2 = f39096c;
                            int length4 = strArr2.length;
                            for (int i8 = 0; i8 < 3; i8++) {
                                if (!strArr2[i8].equals(authority)) {
                                }
                            }
                            String[] strArr3 = f39094a;
                            for (int i9 = 0; i9 < 6; i9++) {
                                String str2 = strArr3[i9];
                                if (str2.charAt(str2.length() - 1) == '.') {
                                    if (!providerInfoResolveContentProvider.packageName.startsWith(str2)) {
                                    }
                                } else if (!providerInfoResolveContentProvider.packageName.equals(str2)) {
                                }
                            }
                        }
                        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor3 = contentResolver.openAssetFileDescriptor(uri, str);
                        m15921f(assetFileDescriptorOpenAssetFileDescriptor3);
                        return assetFileDescriptorOpenAssetFileDescriptor3;
                    }
                    throw new FileNotFoundException("Can't open content uri.");
                }
                break;
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    private static String m15918c(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? String.valueOf(canonicalPath).concat("/") : canonicalPath;
    }

    /* JADX INFO: renamed from: d */
    private static void m15919d(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            try {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(fileNotFoundException, e);
            } catch (Exception e2) {
            }
        }
    }

    /* JADX INFO: renamed from: e */
    private static File[] m15920e(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }

    /* JADX INFO: renamed from: f */
    private static void m15921f(Object obj) throws FileNotFoundException {
        if (obj == null) {
            throw new FileNotFoundException("Content resolver returned null value.");
        }
    }
}
