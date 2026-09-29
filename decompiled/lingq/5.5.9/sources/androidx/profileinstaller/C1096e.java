package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;
import p003a2.C0010b;

/* JADX INFO: renamed from: androidx.profileinstaller.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1096e {

    /* JADX INFO: renamed from: a */
    public static final C0010b<c> f6895a = new C0010b<>();

    /* JADX INFO: renamed from: b */
    public static final Object f6896b = new Object();

    /* JADX INFO: renamed from: c */
    public static c f6897c = null;

    /* JADX INFO: renamed from: androidx.profileinstaller.e$a */
    public static class a {
        /* JADX INFO: renamed from: a */
        public static PackageInfo m4067a(PackageManager packageManager, Context context) throws PackageManager.NameNotFoundException {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.e$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final int f6898a;

        /* JADX INFO: renamed from: b */
        public final int f6899b;

        /* JADX INFO: renamed from: c */
        public final long f6900c;

        /* JADX INFO: renamed from: d */
        public final long f6901d;

        public b(int i10, int i11, long j10, long j11) {
            this.f6898a = i10;
            this.f6899b = i11;
            this.f6900c = j10;
            this.f6901d = j11;
        }

        /* JADX INFO: renamed from: a */
        public static b m4068a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } catch (Throwable th2) {
                try {
                    dataInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        /* JADX INFO: renamed from: b */
        public final void m4069b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f6898a);
                dataOutputStream.writeInt(this.f6899b);
                dataOutputStream.writeLong(this.f6900c);
                dataOutputStream.writeLong(this.f6901d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f6899b == bVar.f6899b && this.f6900c == bVar.f6900c && this.f6898a == bVar.f6898a && this.f6901d == bVar.f6901d;
        }

        public final int hashCode() {
            return Objects.hash(Integer.valueOf(this.f6899b), Long.valueOf(this.f6900c), Integer.valueOf(this.f6898a), Long.valueOf(this.f6901d));
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.e$c */
    public static class c {
    }

    /* JADX INFO: renamed from: a */
    public static long m4064a(Context context) throws PackageManager.NameNotFoundException {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.m4067a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* JADX INFO: renamed from: b */
    public static c m4065b(int i10, boolean z10, boolean z11) {
        c cVar = new c();
        f6897c = cVar;
        f6895a.m36q(cVar);
        return f6897c;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:29:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x008c  */
    /* JADX WARN: Code duplicated, block: B:48:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:82:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:87:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: c */
    public static void m4066c(Context context, boolean z10) {
        int i10;
        int i11;
        File file;
        boolean z11;
        File file2;
        long length;
        boolean z12;
        File file3;
        b bVarM4068a;
        b bVar;
        int i12;
        if (z10 || f6897c == null) {
            synchronized (f6896b) {
                if (z10) {
                    i10 = Build.VERSION.SDK_INT;
                    i11 = 0;
                    if (i10 >= 28) {
                        file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                        long length2 = file.length();
                        if (file.exists()) {
                            z11 = false;
                        } else {
                            z11 = false;
                        }
                        file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                        length = file2.length();
                        if (file2.exists()) {
                            z12 = false;
                        } else {
                            z12 = false;
                        }
                        long jM4064a = m4064a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            bVarM4068a = b.m4068a(file3);
                        } else {
                            bVarM4068a = null;
                        }
                        if (bVarM4068a == null) {
                            if (z11) {
                                i11 = 1;
                            } else if (z12) {
                                i11 = 2;
                            }
                        } else if (z11) {
                            i11 = 1;
                        } else if (z12) {
                            i11 = 2;
                        }
                        if (z10) {
                            i11 = 2;
                        }
                        if (bVarM4068a != null) {
                            i11 = 3;
                        }
                        bVar = new b(1, i11, jM4064a, length);
                        if (bVarM4068a != null) {
                            bVar.m4069b(file3);
                        } else {
                            bVar.m4069b(file3);
                        }
                        m4065b(i11, z11, z12);
                        return;
                    }
                    m4065b(262144, false, false);
                    return;
                }
                if (f6897c != null) {
                    return;
                }
                i10 = Build.VERSION.SDK_INT;
                i11 = 0;
                if (i10 >= 28 && i10 != 30) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    if (file.exists() || length3 <= 0) {
                        z11 = false;
                    } else {
                        z11 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z12 = false;
                    } else {
                        z12 = true;
                    }
                    try {
                        long jM4064a2 = m4064a(context);
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                bVarM4068a = b.m4068a(file3);
                            } catch (IOException unused) {
                                m4065b(131072, z11, z12);
                                return;
                            }
                        } else {
                            bVarM4068a = null;
                        }
                        if (bVarM4068a == null && bVarM4068a.f6900c == jM4064a2 && (i12 = bVarM4068a.f6899b) != 2) {
                            i11 = i12;
                        } else if (z11) {
                            i11 = 1;
                        } else if (z12) {
                            i11 = 2;
                        }
                        if (z10 && z12 && i11 != 1) {
                            i11 = 2;
                        }
                        if (bVarM4068a != null && bVarM4068a.f6899b == 2 && i11 == 1 && length3 < bVarM4068a.f6901d) {
                            i11 = 3;
                        }
                        bVar = new b(1, i11, jM4064a2, length);
                        if (bVarM4068a != null || !bVarM4068a.equals(bVar)) {
                            try {
                                bVar.m4069b(file3);
                            } catch (IOException unused2) {
                                i11 = 196608;
                            }
                        }
                        m4065b(i11, z11, z12);
                        return;
                    } catch (PackageManager.NameNotFoundException unused3) {
                        m4065b(65536, z11, z12);
                        return;
                    }
                }
                m4065b(262144, false, false);
                return;
                throw th;
            }
        }
    }
}
