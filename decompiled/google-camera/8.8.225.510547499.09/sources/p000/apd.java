package p000;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class apd {

    /* JADX INFO: renamed from: a */
    private static final C1137xz f1979a = C1137xz.m19593h();

    /* JADX INFO: renamed from: b */
    private static final Object f1980b = new Object();

    /* JADX INFO: renamed from: c */
    private static adm f1981c = null;

    /* JADX WARN: Code duplicated, block: B:109:0x007f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:110:0x00fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:20:0x003a  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ea  */
    /* JADX INFO: renamed from: a */
    public static void m1799a(Context context, boolean z) {
        File file;
        int i;
        boolean z2;
        File file2;
        long length;
        boolean z3;
        File file3;
        DataInputStream dataInputStream;
        apc apcVar;
        int i2;
        apc apcVar2;
        DataOutputStream dataOutputStream;
        int i3;
        if (z || f1981c == null) {
            synchronized (f1980b) {
                if (z) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length2 = file.length();
                    i = 0;
                    if (file.exists()) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists()) {
                        z3 = false;
                    } else {
                        z3 = false;
                    }
                    long j = apb.m1798a(context.getApplicationContext().getPackageManager(), context).lastUpdateTime;
                    file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        dataInputStream = new DataInputStream(new FileInputStream(file3));
                        apcVar = new apc(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                        dataInputStream.close();
                    } else {
                        apcVar = null;
                    }
                    if (apcVar == null) {
                        if (z2) {
                            i = 1;
                        } else if (z3) {
                            i = 2;
                        }
                    } else if (z2) {
                        i = 1;
                    } else if (z3) {
                        i = 2;
                    }
                    if (z) {
                        if (i != 1) {
                            i = 2;
                        } else {
                            i = 1;
                        }
                    }
                    if (apcVar == null) {
                        i2 = i;
                    } else {
                        i2 = i;
                    }
                    apcVar2 = new apc(1, i2, j, length);
                    if (apcVar != null) {
                        file3.delete();
                        dataOutputStream = new DataOutputStream(new FileOutputStream(file3));
                        dataOutputStream.writeInt(apcVar2.f1975a);
                        dataOutputStream.writeInt(apcVar2.f1976b);
                        dataOutputStream.writeLong(apcVar2.f1977c);
                        dataOutputStream.writeLong(apcVar2.f1978d);
                        dataOutputStream.close();
                    } else {
                        file3.delete();
                        dataOutputStream = new DataOutputStream(new FileOutputStream(file3));
                        dataOutputStream.writeInt(apcVar2.f1975a);
                        dataOutputStream.writeInt(apcVar2.f1976b);
                        dataOutputStream.writeLong(apcVar2.f1977c);
                        dataOutputStream.writeLong(apcVar2.f1978d);
                        dataOutputStream.close();
                    }
                    m1800b();
                    return;
                }
                if (f1981c == null) {
                    file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                    long length3 = file.length();
                    i = 0;
                    if (file.exists() || length3 <= 0) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                    length = file2.length();
                    if (file2.exists() || length <= 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    try {
                        long j2 = apb.m1798a(context.getApplicationContext().getPackageManager(), context).lastUpdateTime;
                        file3 = new File(context.getFilesDir(), "profileInstalled");
                        if (file3.exists()) {
                            try {
                                dataInputStream = new DataInputStream(new FileInputStream(file3));
                                try {
                                    apcVar = new apc(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                                    dataInputStream.close();
                                } catch (Throwable th) {
                                    try {
                                        dataInputStream.close();
                                        throw th;
                                    } catch (Throwable th2) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                        throw th;
                                    }
                                }
                            } catch (IOException e) {
                                m1800b();
                                return;
                            }
                        } else {
                            apcVar = null;
                        }
                        if (apcVar == null && apcVar.f1977c == j2 && (i3 = apcVar.f1976b) != 2) {
                            i = i3;
                        } else if (z2) {
                            i = 1;
                        } else if (z3) {
                            i = 2;
                        }
                        if (z && z3) {
                            if (i != 1) {
                                i = 2;
                            } else {
                                i = 1;
                            }
                        }
                        if (apcVar == null && apcVar.f1976b == 2 && i == 1) {
                            i2 = length3 < apcVar.f1978d ? 3 : 1;
                        } else {
                            i2 = i;
                        }
                        apcVar2 = new apc(1, i2, j2, length);
                        if (apcVar != null || !apcVar.equals(apcVar2)) {
                            try {
                                file3.delete();
                                dataOutputStream = new DataOutputStream(new FileOutputStream(file3));
                                try {
                                    dataOutputStream.writeInt(apcVar2.f1975a);
                                    dataOutputStream.writeInt(apcVar2.f1976b);
                                    dataOutputStream.writeLong(apcVar2.f1977c);
                                    dataOutputStream.writeLong(apcVar2.f1978d);
                                    dataOutputStream.close();
                                } catch (Throwable th3) {
                                    try {
                                        dataOutputStream.close();
                                        throw th3;
                                    } catch (Throwable th4) {
                                        Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                                        throw th3;
                                    }
                                }
                            } catch (IOException e2) {
                            }
                        }
                        m1800b();
                        return;
                    } catch (PackageManager.NameNotFoundException e3) {
                        m1800b();
                        return;
                    }
                }
                return;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m1800b() {
        adm admVar = new adm();
        f1981c = admVar;
        f1979a.mo19590f(admVar);
    }
}
