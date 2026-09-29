package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import androidx.datastore.preferences.PreferencesProto$Value;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import p169i4.C6176b;
import p169i4.C6177c;
import p208k.ExecutorC6558a;

/* JADX INFO: renamed from: androidx.profileinstaller.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1094c {

    /* JADX INFO: renamed from: a */
    public static final a f6891a = new a();

    /* JADX INFO: renamed from: b */
    public static final b f6892b = new b();

    /* JADX INFO: renamed from: androidx.profileinstaller.c$a */
    public class a implements c {
        @Override // androidx.profileinstaller.C1094c.c
        /* JADX INFO: renamed from: a */
        public final void mo4041a() {
        }

        @Override // androidx.profileinstaller.C1094c.c
        /* JADX INFO: renamed from: b */
        public final void mo4042b(int i10, Object obj) {
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$b */
    public class b implements c {
        @Override // androidx.profileinstaller.C1094c.c
        /* JADX INFO: renamed from: a */
        public final void mo4041a() {
            Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // androidx.profileinstaller.C1094c.c
        /* JADX INFO: renamed from: b */
        public final void mo4042b(int i10, Object obj) {
            String str;
            switch (i10) {
                case 1:
                    str = "RESULT_INSTALL_SUCCESS";
                    break;
                case 2:
                    str = "RESULT_ALREADY_INSTALLED";
                    break;
                case 3:
                    str = "RESULT_UNSUPPORTED_ART_VERSION";
                    break;
                case 4:
                    str = "RESULT_NOT_WRITABLE";
                    break;
                case 5:
                    str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                    break;
                case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                    str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                    break;
                case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
                    str = "RESULT_IO_EXCEPTION";
                    break;
                case 8:
                    str = "RESULT_PARSE_EXCEPTION";
                    break;
                case 9:
                    str = "";
                    break;
                case 10:
                    str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                    break;
                case 11:
                    str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                    break;
                default:
                    str = "";
                    break;
            }
            if (i10 == 6 || i10 == 7 || i10 == 8) {
                Log.e("ProfileInstaller", str, (Throwable) obj);
            } else {
                Log.d("ProfileInstaller", str);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.c$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo4041a();

        /* JADX INFO: renamed from: b */
        void mo4042b(int i10, Object obj);
    }

    /* JADX INFO: renamed from: a */
    public static void m4048a(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019e A[Catch: all -> 0x01a4, TRY_ENTER, TryCatch #1 {all -> 0x01a4, blocks: (B:95:0x0183, B:97:0x018f, B:100:0x019e, B:101:0x01a3), top: B:230:0x0183 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x01b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01b2 A[Catch: IllegalStateException -> 0x01b6, IOException -> 0x01bf, FileNotFoundException -> 0x01c5, TRY_LEAVE, TryCatch #27 {FileNotFoundException -> 0x01c5, IOException -> 0x01bf, IllegalStateException -> 0x01b6, blocks: (B:93:0x017b, B:98:0x0199, B:111:0x01b2, B:109:0x01af, B:108:0x01ac), top: B:268:0x017b }] */
    /* JADX WARN: Code duplicated, block: B:121:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ef A[Catch: all -> 0x0205, TRY_LEAVE, TryCatch #23 {all -> 0x0205, blocks: (B:130:0x01e3, B:132:0x01ef, B:135:0x01fb), top: B:248:0x01e3, outer: #28 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01fb A[Catch: all -> 0x0205, TRY_ENTER, TRY_LEAVE, TryCatch #23 {all -> 0x0205, blocks: (B:130:0x01e3, B:132:0x01ef, B:135:0x01fb), top: B:248:0x01e3, outer: #28 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x0220  */
    /* JADX WARN: Code duplicated, block: B:155:0x022a  */
    /* JADX WARN: Code duplicated, block: B:156:0x022d  */
    /* JADX WARN: Code duplicated, block: B:164:0x0247  */
    /* JADX WARN: Code duplicated, block: B:212:0x029f  */
    /* JADX WARN: Code duplicated, block: B:216:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:221:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:223:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:230:0x0183 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:262:0x0112 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:263:0x0231 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:265:0x00fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:267:0x01de A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:268:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:269:0x0251 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:56:0x011c A[Catch: IllegalStateException -> 0x0132, all -> 0x0134, IOException -> 0x0136, TRY_LEAVE, TryCatch #33 {IOException -> 0x0136, IllegalStateException -> 0x0132, blocks: (B:54:0x0112, B:56:0x011c, B:67:0x0138, B:68:0x013d), top: B:262:0x0112, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0138 A[Catch: IllegalStateException -> 0x0132, all -> 0x0134, IOException -> 0x0136, TRY_ENTER, TryCatch #33 {IOException -> 0x0136, IllegalStateException -> 0x0132, blocks: (B:54:0x0112, B:56:0x011c, B:67:0x0138, B:68:0x013d), top: B:262:0x0112, outer: #15 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0167  */
    /* JADX WARN: Code duplicated, block: B:88:0x0170  */
    /* JADX WARN: Code duplicated, block: B:90:0x0174  */
    /* JADX WARN: Code duplicated, block: B:91:0x0177  */
    /* JADX WARN: Code duplicated, block: B:97:0x018f A[Catch: all -> 0x01a4, TRY_LEAVE, TryCatch #1 {all -> 0x01a4, blocks: (B:95:0x0183, B:97:0x018f, B:100:0x019e, B:101:0x01a3), top: B:230:0x0183 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX INFO: renamed from: b */
    public static void m4049b(Context context, ExecutorC6558a executorC6558a, c cVar, boolean z10) throws IOException {
        boolean z11;
        byte[] bArr;
        FileInputStream fileInputStreamM4046a;
        int i10;
        C6176b[] c6176bArrM4057h;
        C6176b[] c6176bArr;
        int i11;
        boolean z12;
        C1093b c1093b;
        FileInputStream fileInputStreamM4046a2;
        c cVar2;
        C6176b[] c6176bArr2;
        byte[] bArr2;
        ?? r10;
        ByteArrayInputStream byteArrayInputStream;
        FileOutputStream fileOutputStream;
        Throwable th2;
        byte[] bArr3;
        int i12;
        ?? r11;
        boolean z13;
        ?? r12;
        byte[] bArr4;
        ByteArrayOutputStream byteArrayOutputStream;
        ?? r13;
        boolean z14;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z10) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long j10 = dataInputStream.readLong();
                            dataInputStream.close();
                            z14 = j10 == packageInfo.lastUpdateTime;
                            if (z14) {
                                cVar.mo4042b(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z14 = false;
                    }
                } else {
                    z14 = false;
                }
                if (z14) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    C1096e.m4066c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i13 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C1093b c1093b2 = c1093b;
            C1093b c1093b3 = new C1093b(assets, executorC6558a, cVar, name, file2);
            byte[] bArr5 = c1093b2.f6885c;
            if (bArr5 != null) {
                if (file2.canWrite()) {
                    c1093b2.f6888f = true;
                    z11 = true;
                } else {
                    c1093b2.m4047b(4, null);
                }
                if (z11) {
                    ?? r14 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?";
                    if (c1093b2.f6888f) {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    bArr = C1095d.f6893a;
                    if (bArr5 != null) {
                        try {
                            fileInputStreamM4046a = c1093b2.m4046a(assets, "dexopt/baseline.prof");
                        } catch (FileNotFoundException e10) {
                            cVar.mo4042b(6, e10);
                            fileInputStreamM4046a = null;
                        } catch (IOException e11) {
                            cVar.mo4042b(7, e11);
                            fileInputStreamM4046a = null;
                        }
                        try {
                            if (fileInputStreamM4046a != null) {
                                try {
                                    if (Arrays.equals(bArr, C6177c.m12696b(4, fileInputStreamM4046a))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    c6176bArrM4057h = C1095d.m4057h(fileInputStreamM4046a, C6177c.m12696b(4, fileInputStreamM4046a), c1093b2.f6887e);
                                    try {
                                        fileInputStreamM4046a.close();
                                    } catch (IOException e12) {
                                        cVar.mo4042b(7, e12);
                                    }
                                    c1093b2.f6889g = c6176bArrM4057h;
                                } catch (IOException e13) {
                                    i10 = 7;
                                    cVar.mo4042b(7, e13);
                                    try {
                                        fileInputStreamM4046a.close();
                                    } catch (IOException e14) {
                                        cVar.mo4042b(i10, e14);
                                    }
                                    c6176bArrM4057h = null;
                                } catch (IllegalStateException e15) {
                                    cVar.mo4042b(8, e15);
                                    i10 = 7;
                                    fileInputStreamM4046a.close();
                                    c6176bArrM4057h = null;
                                }
                            }
                            c6176bArr = c1093b2.f6889g;
                            if (c6176bArr != null) {
                                i11 = Build.VERSION.SDK_INT;
                                if (i11 > 33) {
                                    switch (i11) {
                                        case 31:
                                        case 32:
                                        case 33:
                                            z12 = true;
                                            break;
                                        default:
                                            z12 = false;
                                            break;
                                    }
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    try {
                                        fileInputStreamM4046a2 = c1093b2.m4046a(assets, "dexopt/baseline.profm");
                                        if (fileInputStreamM4046a2 == null) {
                                            try {
                                                if (Arrays.equals(C1095d.f6894b, C6177c.m12696b(4, fileInputStreamM4046a2))) {
                                                    throw new IllegalStateException("Invalid magic");
                                                }
                                                c1093b2.f6889g = C1095d.m4054e(fileInputStreamM4046a2, C6177c.m12696b(4, fileInputStreamM4046a2), bArr5, c6176bArr);
                                                fileInputStreamM4046a2.close();
                                                c1093b = c1093b2;
                                            } catch (Throwable th5) {
                                                try {
                                                    fileInputStreamM4046a2.close();
                                                    throw th5;
                                                } catch (Throwable th6) {
                                                    th5.addSuppressed(th6);
                                                    throw th5;
                                                }
                                            }
                                        } else {
                                            if (fileInputStreamM4046a2 != null) {
                                                fileInputStreamM4046a2.close();
                                            }
                                            c1093b = null;
                                        }
                                    } catch (FileNotFoundException e16) {
                                        cVar.mo4042b(9, e16);
                                    } catch (IOException e17) {
                                        cVar.mo4042b(7, e17);
                                    } catch (IllegalStateException e18) {
                                        c1093b2.f6889g = null;
                                        cVar.mo4042b(8, e18);
                                    }
                                    if (c1093b != null) {
                                        c1093b2 = c1093b;
                                    }
                                }
                            }
                        } catch (Throwable th7) {
                            try {
                                fileInputStreamM4046a.close();
                                throw th7;
                            } catch (IOException e19) {
                                cVar.mo4042b(7, e19);
                                throw th7;
                            }
                        }
                    }
                    cVar2 = c1093b2.f6884b;
                    c6176bArr2 = c1093b2.f6889g;
                    if (c6176bArr2 != null && (bArr4 = c1093b2.f6885c) != null) {
                        if (c1093b2.f6888f) {
                            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                        }
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byteArrayOutputStream.write(bArr);
                                byteArrayOutputStream.write(bArr4);
                                if (C1095d.m4059j(byteArrayOutputStream, bArr4, c6176bArr2)) {
                                    c1093b2.f6890h = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    c1093b2.f6889g = null;
                                } else {
                                    cVar2.mo4042b(5, null);
                                    c1093b2.f6889g = null;
                                    byteArrayOutputStream.close();
                                }
                            } catch (Throwable th8) {
                                try {
                                    byteArrayOutputStream.close();
                                    throw th8;
                                } catch (Throwable th9) {
                                    th8.addSuppressed(th9);
                                    throw th8;
                                }
                            }
                        } catch (IOException e20) {
                            cVar2.mo4042b(7, e20);
                        } catch (IllegalStateException e21) {
                            cVar2.mo4042b(8, e21);
                        }
                    }
                    bArr2 = c1093b2.f6890h;
                    if (bArr2 == null) {
                        r12 = 1;
                    } else {
                        try {
                            if (c1093b2.f6888f) {
                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                            }
                            try {
                                try {
                                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                    try {
                                        fileOutputStream = new FileOutputStream(c1093b2.f6886d);
                                        try {
                                            try {
                                                bArr3 = new byte[512];
                                                while (true) {
                                                    i12 = byteArrayInputStream.read(bArr3);
                                                    if (i12 > 0) {
                                                        try {
                                                            fileOutputStream.write(bArr3, 0, i12);
                                                        } catch (Throwable th10) {
                                                            th2 = th10;
                                                            try {
                                                                fileOutputStream.close();
                                                                throw th2;
                                                            } catch (Throwable th11) {
                                                                th2.addSuppressed(th11);
                                                                throw th2;
                                                            }
                                                        }
                                                    } else {
                                                        r11 = 1;
                                                        try {
                                                            c1093b2.m4047b(1, null);
                                                            fileOutputStream.close();
                                                            byteArrayInputStream.close();
                                                            c1093b2.f6890h = null;
                                                            c1093b2.f6889g = null;
                                                            z13 = true;
                                                            if (z13) {
                                                                m4048a(packageInfo, filesDir);
                                                            }
                                                        } catch (Throwable th12) {
                                                            th = th12;
                                                            th2 = th;
                                                            fileOutputStream.close();
                                                            throw th2;
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th13) {
                                                th = th13;
                                                Throwable th14 = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th14;
                                                } catch (Throwable th15) {
                                                    th14.addSuppressed(th15);
                                                    throw th14;
                                                }
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                        }
                                    } catch (Throwable th17) {
                                        th = th17;
                                    }
                                } catch (FileNotFoundException e22) {
                                    e = e22;
                                    r14 = 1;
                                    c1093b2.m4047b(6, e);
                                    r10 = r14;
                                    c1093b2.f6890h = null;
                                    c1093b2.f6889g = null;
                                    r12 = r10;
                                    z13 = false;
                                    r11 = r12;
                                } catch (IOException e23) {
                                    e = e23;
                                    r14 = 1;
                                    c1093b2.m4047b(7, e);
                                    r10 = r14;
                                    c1093b2.f6890h = null;
                                    c1093b2.f6889g = null;
                                    r12 = r10;
                                    z13 = false;
                                    r11 = r12;
                                }
                            } catch (FileNotFoundException e24) {
                                e = e24;
                                c1093b2.m4047b(6, e);
                                r10 = r14;
                                c1093b2.f6890h = null;
                                c1093b2.f6889g = null;
                                r12 = r10;
                                z13 = false;
                                r11 = r12;
                            } catch (IOException e25) {
                                e = e25;
                                c1093b2.m4047b(7, e);
                                r10 = r14;
                                c1093b2.f6890h = null;
                                c1093b2.f6889g = null;
                                r12 = r10;
                                z13 = false;
                                r11 = r12;
                            }
                        } catch (Throwable th18) {
                            c1093b2.f6890h = null;
                            c1093b2.f6889g = null;
                            throw th18;
                        }
                    }
                    z13 = false;
                    r11 = r12;
                    if (z13) {
                        m4048a(packageInfo, filesDir);
                    }
                } else {
                    r11 = 1;
                    z13 = false;
                }
                if (z13 || !z10) {
                    r13 = 0;
                } else {
                    r13 = r11;
                }
                C1096e.m4066c(context, r13);
            }
            c1093b2.m4047b(3, Integer.valueOf(i13));
            z11 = false;
            if (z11) {
                r11 = 1;
                z13 = false;
            } else {
                ?? r15 = "This device doesn't support aot. Did you call deviceSupportsAotProfile()?";
                if (c1093b2.f6888f) {
                    throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                }
                bArr = C1095d.f6893a;
                if (bArr5 != null) {
                    fileInputStreamM4046a = c1093b2.m4046a(assets, "dexopt/baseline.prof");
                    if (fileInputStreamM4046a != null) {
                        if (Arrays.equals(bArr, C6177c.m12696b(4, fileInputStreamM4046a))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c6176bArrM4057h = C1095d.m4057h(fileInputStreamM4046a, C6177c.m12696b(4, fileInputStreamM4046a), c1093b2.f6887e);
                        fileInputStreamM4046a.close();
                        c1093b2.f6889g = c6176bArrM4057h;
                    }
                    c6176bArr = c1093b2.f6889g;
                    if (c6176bArr != null) {
                        i11 = Build.VERSION.SDK_INT;
                        if (i11 > 33) {
                            switch (i11) {
                                case 31:
                                case 32:
                                case 33:
                                    z12 = true;
                                    break;
                                default:
                                    z12 = false;
                                    break;
                            }
                        } else {
                            z12 = false;
                        }
                        if (z12) {
                            fileInputStreamM4046a2 = c1093b2.m4046a(assets, "dexopt/baseline.profm");
                            if (fileInputStreamM4046a2 == null) {
                                if (fileInputStreamM4046a2 != null) {
                                    fileInputStreamM4046a2.close();
                                }
                                c1093b = null;
                            } else {
                                if (Arrays.equals(C1095d.f6894b, C6177c.m12696b(4, fileInputStreamM4046a2))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                c1093b2.f6889g = C1095d.m4054e(fileInputStreamM4046a2, C6177c.m12696b(4, fileInputStreamM4046a2), bArr5, c6176bArr);
                                fileInputStreamM4046a2.close();
                                c1093b = c1093b2;
                            }
                            if (c1093b != null) {
                                c1093b2 = c1093b;
                            }
                        }
                    }
                }
                cVar2 = c1093b2.f6884b;
                c6176bArr2 = c1093b2.f6889g;
                if (c6176bArr2 != null) {
                    if (c1093b2.f6888f) {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    byteArrayOutputStream.write(bArr);
                    byteArrayOutputStream.write(bArr4);
                    if (C1095d.m4059j(byteArrayOutputStream, bArr4, c6176bArr2)) {
                        cVar2.mo4042b(5, null);
                        c1093b2.f6889g = null;
                        byteArrayOutputStream.close();
                    } else {
                        c1093b2.f6890h = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        c1093b2.f6889g = null;
                    }
                }
                bArr2 = c1093b2.f6890h;
                if (bArr2 == null) {
                    r12 = 1;
                } else {
                    if (c1093b2.f6888f) {
                        throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                    }
                    byteArrayInputStream = new ByteArrayInputStream(bArr2);
                    fileOutputStream = new FileOutputStream(c1093b2.f6886d);
                    bArr3 = new byte[512];
                    while (true) {
                        i12 = byteArrayInputStream.read(bArr3);
                        if (i12 > 0) {
                            fileOutputStream.write(bArr3, 0, i12);
                        } else {
                            r11 = 1;
                            c1093b2.m4047b(1, null);
                            fileOutputStream.close();
                            byteArrayInputStream.close();
                            c1093b2.f6890h = null;
                            c1093b2.f6889g = null;
                            z13 = true;
                            if (z13) {
                                m4048a(packageInfo, filesDir);
                            }
                        }
                    }
                }
                z13 = false;
                r11 = r12;
                if (z13) {
                    m4048a(packageInfo, filesDir);
                }
            }
            if (z13) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            C1096e.m4066c(context, r13);
        } catch (PackageManager.NameNotFoundException e26) {
            cVar.mo4042b(7, e26);
            C1096e.m4066c(context, false);
        }
    }
}
