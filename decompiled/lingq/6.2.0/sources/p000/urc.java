package p000;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import com.google.android.gms.internal.mlkit_vision_document_scanner.zzx;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class urc {

    /* JADX INFO: renamed from: a */
    public static final String[] f64258a = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze", "com.waze."};

    /* JADX INFO: renamed from: b */
    public static final String[] f64259b;

    /* JADX INFO: renamed from: c */
    public static final String[] f64260c;

    static {
        String str = Build.HARDWARE;
        f64259b = new String[]{"media", (str.equals("goldfish") || str.equals("ranchu")) ? "androidx.test.services.storage.runfiles" : ""};
        f64260c = new String[]{"", "", "com.google.android.apps.docs.storage.legacy"};
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01a4 A[Catch: IOException -> 0x0170, FileNotFoundException -> 0x0173, TryCatch #8 {FileNotFoundException -> 0x0173, IOException -> 0x0170, blocks: (B:77:0x0133, B:79:0x014d, B:81:0x0155, B:83:0x015e, B:85:0x0164, B:120:0x01d0, B:122:0x01d4, B:95:0x0185, B:97:0x018b, B:99:0x0191, B:103:0x01a0, B:105:0x01a4, B:107:0x01a8, B:112:0x01ba, B:114:0x01be, B:116:0x01c2, B:119:0x01cd, B:125:0x01db, B:126:0x01e0, B:128:0x01e2, B:130:0x01e4, B:131:0x01e9, B:133:0x01eb, B:92:0x0176, B:134:0x01ec, B:136:0x01f2, B:137:0x01f3, B:138:0x01f8, B:139:0x01f9, B:140:0x0202), top: B:165:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a8 A[Catch: IOException -> 0x0170, FileNotFoundException -> 0x0173, TRY_LEAVE, TryCatch #8 {FileNotFoundException -> 0x0173, IOException -> 0x0170, blocks: (B:77:0x0133, B:79:0x014d, B:81:0x0155, B:83:0x015e, B:85:0x0164, B:120:0x01d0, B:122:0x01d4, B:95:0x0185, B:97:0x018b, B:99:0x0191, B:103:0x01a0, B:105:0x01a4, B:107:0x01a8, B:112:0x01ba, B:114:0x01be, B:116:0x01c2, B:119:0x01cd, B:125:0x01db, B:126:0x01e0, B:128:0x01e2, B:130:0x01e4, B:131:0x01e9, B:133:0x01eb, B:92:0x0176, B:134:0x01ec, B:136:0x01f2, B:137:0x01f3, B:138:0x01f8, B:139:0x01f9, B:140:0x0202), top: B:165:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x01be A[Catch: IOException -> 0x0170, FileNotFoundException -> 0x0173, TryCatch #8 {FileNotFoundException -> 0x0173, IOException -> 0x0170, blocks: (B:77:0x0133, B:79:0x014d, B:81:0x0155, B:83:0x015e, B:85:0x0164, B:120:0x01d0, B:122:0x01d4, B:95:0x0185, B:97:0x018b, B:99:0x0191, B:103:0x01a0, B:105:0x01a4, B:107:0x01a8, B:112:0x01ba, B:114:0x01be, B:116:0x01c2, B:119:0x01cd, B:125:0x01db, B:126:0x01e0, B:128:0x01e2, B:130:0x01e4, B:131:0x01e9, B:133:0x01eb, B:92:0x0176, B:134:0x01ec, B:136:0x01f2, B:137:0x01f3, B:138:0x01f8, B:139:0x01f9, B:140:0x0202), top: B:165:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01c2 A[Catch: IOException -> 0x0170, FileNotFoundException -> 0x0173, TryCatch #8 {FileNotFoundException -> 0x0173, IOException -> 0x0170, blocks: (B:77:0x0133, B:79:0x014d, B:81:0x0155, B:83:0x015e, B:85:0x0164, B:120:0x01d0, B:122:0x01d4, B:95:0x0185, B:97:0x018b, B:99:0x0191, B:103:0x01a0, B:105:0x01a4, B:107:0x01a8, B:112:0x01ba, B:114:0x01be, B:116:0x01c2, B:119:0x01cd, B:125:0x01db, B:126:0x01e0, B:128:0x01e2, B:130:0x01e4, B:131:0x01e9, B:133:0x01eb, B:92:0x0176, B:134:0x01ec, B:136:0x01f2, B:137:0x01f3, B:138:0x01f8, B:139:0x01f9, B:140:0x0202), top: B:165:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x01d4 A[Catch: IOException -> 0x0170, FileNotFoundException -> 0x0173, TryCatch #8 {FileNotFoundException -> 0x0173, IOException -> 0x0170, blocks: (B:77:0x0133, B:79:0x014d, B:81:0x0155, B:83:0x015e, B:85:0x0164, B:120:0x01d0, B:122:0x01d4, B:95:0x0185, B:97:0x018b, B:99:0x0191, B:103:0x01a0, B:105:0x01a4, B:107:0x01a8, B:112:0x01ba, B:114:0x01be, B:116:0x01c2, B:119:0x01cd, B:125:0x01db, B:126:0x01e0, B:128:0x01e2, B:130:0x01e4, B:131:0x01e9, B:133:0x01eb, B:92:0x0176, B:134:0x01ec, B:136:0x01f2, B:137:0x01f3, B:138:0x01f8, B:139:0x01f9, B:140:0x0202), top: B:165:0x0133 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x01b6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x019c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:181:0x01b3 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x01cd A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x0185 A[Catch: IOException -> 0x0170, FileNotFoundException -> 0x0173, TryCatch #8 {FileNotFoundException -> 0x0173, IOException -> 0x0170, blocks: (B:77:0x0133, B:79:0x014d, B:81:0x0155, B:83:0x015e, B:85:0x0164, B:120:0x01d0, B:122:0x01d4, B:95:0x0185, B:97:0x018b, B:99:0x0191, B:103:0x01a0, B:105:0x01a4, B:107:0x01a8, B:112:0x01ba, B:114:0x01be, B:116:0x01c2, B:119:0x01cd, B:125:0x01db, B:126:0x01e0, B:128:0x01e2, B:130:0x01e4, B:131:0x01e9, B:133:0x01eb, B:92:0x0176, B:134:0x01ec, B:136:0x01f2, B:137:0x01f3, B:138:0x01f8, B:139:0x01f9, B:140:0x0202), top: B:165:0x0133 }] */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r14.f42674a == false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009d, code lost:
    
        if (r14 != false) goto L65;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static InputStream m22878a(Context context, Uri uri, hnc hncVar) throws FileNotFoundException {
        Context contextCreateDeviceProtectedStorageContext;
        File[] externalFilesDirs;
        int length;
        int i;
        int i2;
        File file;
        File dataDir;
        int i3;
        ContentResolver contentResolver = context.getContentResolver();
        if (Build.VERSION.SDK_INT < 30) {
            uri = Uri.parse(uri.toString());
        }
        String scheme = uri.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(uri);
        }
        int i4 = 0;
        if ("content".equals(scheme)) {
            String authority = uri.getAuthority();
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            if (providerInfoResolveContentProvider == null) {
                int iLastIndexOf = authority.lastIndexOf(64);
                if (iLastIndexOf >= 0) {
                    authority = authority.substring(iLastIndexOf + 1);
                    providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
                }
                if (providerInfoResolveContentProvider == null) {
                }
            }
            zzx zzxVar = hncVar.f42675b;
            int size = zzxVar.size();
            int i5 = 0;
            while (true) {
                if (i5 >= size) {
                    i3 = 3;
                    break;
                }
                ((dec) zzxVar.get(i5)).getClass();
                i5++;
                if (((uri.getAuthority().lastIndexOf(64) < 0 || q0c.m19594b(context, "android.permission.INTERACT_ACROSS_USERS") != 0) ? 3 : 2) - 1 == 1) {
                    i3 = 2;
                    break;
                }
            }
            if (i3 - 1 != 1) {
                boolean zEquals = context.getPackageName().equals(providerInfoResolveContentProvider.packageName);
                boolean z = hncVar.f42674a;
                if (!zEquals) {
                    if (!z) {
                        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && providerInfoResolveContentProvider.exported) {
                            String[] strArr = f64259b;
                            int length2 = strArr.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 >= 2) {
                                    String[] strArr2 = f64260c;
                                    int length3 = strArr2.length;
                                    int i7 = 0;
                                    while (true) {
                                        if (i7 >= 3) {
                                            while (i4 < 7) {
                                                String str = f64258a[i4];
                                                char cCharAt = str.charAt(str.length() - 1);
                                                String str2 = providerInfoResolveContentProvider.packageName;
                                                if (cCharAt == '.') {
                                                    if (!str2.startsWith(str)) {
                                                        i4++;
                                                    }
                                                } else if (!str2.equals(str)) {
                                                    i4++;
                                                }
                                            }
                                            break;
                                        }
                                        if (strArr2[i7].equals(authority)) {
                                            break;
                                        }
                                        i7++;
                                    }
                                } else {
                                    if (strArr[i6].equals(authority)) {
                                        break;
                                    }
                                    i6++;
                                }
                            }
                        }
                        InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                        if (inputStreamOpenInputStream != null) {
                            return inputStreamOpenInputStream;
                        }
                        throw new FileNotFoundException("Content resolver returned null value.");
                    }
                }
            }
            throw new FileNotFoundException("Can't open content uri.");
        }
        if (!"file".equals(scheme)) {
            throw new FileNotFoundException("Unsupported scheme");
        }
        try {
            ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(uri.getPath()).getCanonicalFile()), "r");
            try {
                String canonicalPath = new File(uri.getPath()).getCanonicalPath();
                m22879b(parcelFileDescriptorOpenFileDescriptor, canonicalPath);
                if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
                    zzx zzxVar2 = hncVar.f42676c;
                    if (zzxVar2.size() > 0) {
                        if (zzxVar2.get(0) == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                    File dataDir2 = context.getDataDir();
                    if (dataDir2 != null) {
                        if (!canonicalPath.startsWith(m22880c(dataDir2))) {
                            contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                            if (contextCreateDeviceProtectedStorageContext != null || (dataDir = contextCreateDeviceProtectedStorageContext.getDataDir()) == null || !canonicalPath.startsWith(m22880c(dataDir))) {
                                try {
                                    externalFilesDirs = context.getExternalFilesDirs(null);
                                    length = externalFilesDirs.length;
                                    i = 0;
                                    while (true) {
                                        if (i >= length) {
                                            try {
                                                for (File file2 : context.getExternalCacheDirs()) {
                                                    if (file2 != null || !canonicalPath.startsWith(m22880c(file2))) {
                                                    }
                                                }
                                                break;
                                            } catch (NullPointerException e) {
                                                throw e;
                                            } catch (Exception e2) {
                                                throw new RuntimeException(e2);
                                            }
                                        }
                                        file = externalFilesDirs[i];
                                        if (file != null || !canonicalPath.startsWith(m22880c(file))) {
                                            i++;
                                        }
                                    }
                                } catch (NullPointerException e3) {
                                    throw e3;
                                } catch (Exception e4) {
                                    throw new RuntimeException(e4);
                                }
                            }
                        }
                        if (i4 == hncVar.f42674a) {
                            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
                        }
                    } else if (!canonicalPath.startsWith(m22880c(Environment.getDataDirectory()))) {
                        contextCreateDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                        if (contextCreateDeviceProtectedStorageContext != null) {
                            externalFilesDirs = context.getExternalFilesDirs(null);
                            length = externalFilesDirs.length;
                            i = 0;
                            while (true) {
                                if (i >= length) {
                                    while (i2 < r2) {
                                        if (file2 != null) {
                                        }
                                    }
                                    break;
                                    break;
                                }
                                file = externalFilesDirs[i];
                                if (file != null) {
                                }
                                i++;
                            }
                        } else {
                            externalFilesDirs = context.getExternalFilesDirs(null);
                            length = externalFilesDirs.length;
                            i = 0;
                            while (true) {
                                if (i >= length) {
                                    while (i2 < r2) {
                                        if (file2 != null) {
                                        }
                                    }
                                    break;
                                    break;
                                }
                                file = externalFilesDirs[i];
                                if (file != null) {
                                }
                                i++;
                            }
                        }
                        if (i4 == hncVar.f42674a) {
                            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
                        }
                    }
                    i4 = 1;
                    if (i4 == hncVar.f42674a) {
                        return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptorOpenFileDescriptor);
                    }
                }
                throw new FileNotFoundException("Can't open file: ".concat(canonicalPath));
            } catch (FileNotFoundException e5) {
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                } catch (IOException e6) {
                    e5.addSuppressed(e6);
                }
                throw e5;
            } catch (IOException e7) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e7);
                try {
                    parcelFileDescriptorOpenFileDescriptor.close();
                    throw fileNotFoundException;
                } catch (IOException e8) {
                    fileNotFoundException.addSuppressed(e8);
                    throw fileNotFoundException;
                }
            }
        } catch (IOException e9) {
            FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
            fileNotFoundException2.initCause(e9);
            throw fileNotFoundException2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m22879b(ParcelFileDescriptor parcelFileDescriptor, String str) throws IOException {
        try {
            StructStat structStatFstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat structStatLstat = Os.lstat(str);
                if (OsConstants.S_ISLNK(structStatLstat.st_mode)) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                if (structStatFstat.st_dev != structStatLstat.st_dev || structStatFstat.st_ino != structStatLstat.st_ino) {
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m22880c(File file) throws IOException {
        String canonicalPath = file.getCanonicalPath();
        return !canonicalPath.endsWith("/") ? canonicalPath.concat("/") : canonicalPath;
    }
}
