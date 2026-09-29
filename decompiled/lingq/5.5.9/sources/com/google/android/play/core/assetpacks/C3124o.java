package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import p290o6.C7967l0;
import p338qd.C8525b0;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.o */
/* JADX INFO: loaded from: classes.dex */
public final class C3124o {

    /* JADX INFO: renamed from: h */
    public static final C7967l0 f15962h = new C7967l0("SliceMetadataManager");

    /* JADX INFO: renamed from: b */
    public final C3112c f15964b;

    /* JADX INFO: renamed from: c */
    public final String f15965c;

    /* JADX INFO: renamed from: d */
    public final int f15966d;

    /* JADX INFO: renamed from: e */
    public final long f15967e;

    /* JADX INFO: renamed from: f */
    public final String f15968f;

    /* JADX INFO: renamed from: a */
    public final byte[] f15963a = new byte[8192];

    /* JADX INFO: renamed from: g */
    public int f15969g = -1;

    public C3124o(C3112c c3112c, String str, int i10, long j10, String str2) {
        this.f15964b = c3112c;
        this.f15965c = str;
        this.f15966d = i10;
        this.f15967e = j10;
        this.f15968f = str2;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final int m8999a() throws IOException {
        C3112c c3112c = this.f15964b;
        c3112c.getClass();
        File file = new File(new File(new File(new File(c3112c.m8969c(this.f15965c, this.f15966d, this.f15967e), "_slices"), "_metadata"), this.f15968f), "checkpoint.dat");
        if (!file.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new zzck("Slice checkpoint file corrupt.");
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public final C8525b0 m9000b() throws IOException {
        C3112c c3112c = this.f15964b;
        c3112c.getClass();
        File file = new File(new File(new File(new File(c3112c.m8969c(this.f15965c, this.f15966d, this.f15967e), "_slices"), "_metadata"), this.f15968f), "checkpoint.dat");
        if (!file.exists()) {
            throw new zzck("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new zzck("Slice checkpoint file corrupt.");
            }
            try {
                int i10 = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long j10 = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long j11 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int i11 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.f15969g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new C8525b0(i10, property, j10, j11, i11);
            } catch (NumberFormatException e10) {
                throw new zzck("Slice checkpoint file corrupt.", e10);
            }
        } catch (Throwable th2) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: c */
    public final File m9001c() {
        C3112c c3112c = this.f15964b;
        c3112c.getClass();
        File file = new File(new File(new File(c3112c.m8969c(this.f15965c, this.f15966d, this.f15967e), "_slices"), "_metadata"), this.f15968f);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, String.format("%s-NAM.dat", Integer.valueOf(this.f15969g)));
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: d */
    public final void m9002d(int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(m9001c().length()));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f15969g));
        FileOutputStream fileOutputStream = new FileOutputStream(m9008j());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: e */
    public final void m9003e(String str, long j10, long j11, int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j10));
        properties.put("remainingBytes", String.valueOf(j11));
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f15969g));
        FileOutputStream fileOutputStream = new FileOutputStream(m9008j());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m9004f(byte[] bArr, int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f15969g));
        FileOutputStream fileOutputStream = new FileOutputStream(m9008j());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            C3112c c3112c = this.f15964b;
            c3112c.getClass();
            File file = new File(new File(new File(new File(c3112c.m8969c(this.f15965c, this.f15966d, this.f15967e), "_slices"), "_metadata"), this.f15968f), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(file);
            try {
                fileOutputStream2.write(bArr);
                fileOutputStream2.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream2.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused2) {
            }
            throw th3;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final void m9005g(int i10) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i10));
        properties.put("metadataFileCounter", String.valueOf(this.f15969g));
        FileOutputStream fileOutputStream = new FileOutputStream(m9008j());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: h */
    public final void m9006h(byte[] bArr) throws IOException {
        this.f15969g++;
        C3112c c3112c = this.f15964b;
        c3112c.getClass();
        File file = new File(new File(new File(c3112c.m8969c(this.f15965c, this.f15966d, this.f15967e), "_slices"), "_metadata"), this.f15968f);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, String.format("%s-LFH.dat", Integer.valueOf(this.f15969g))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th2) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th2;
            }
        } catch (IOException e10) {
            throw new zzck("Could not write metadata file.", e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m9007i(InputStream inputStream, byte[] bArr) throws IOException {
        byte[] bArr2 = this.f15963a;
        this.f15969g++;
        FileOutputStream fileOutputStream = new FileOutputStream(m9001c());
        try {
            fileOutputStream.write(bArr);
            int i10 = inputStream.read(bArr2);
            while (i10 > 0) {
                fileOutputStream.write(bArr2, 0, i10);
                i10 = inputStream.read(bArr2);
            }
            fileOutputStream.close();
        } catch (Throwable th2) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: j */
    public final File m9008j() throws IOException {
        C3112c c3112c = this.f15964b;
        c3112c.getClass();
        File file = new File(new File(new File(new File(c3112c.m8969c(this.f15965c, this.f15966d, this.f15967e), "_slices"), "_metadata"), this.f15968f), "checkpoint.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        return file;
    }
}
