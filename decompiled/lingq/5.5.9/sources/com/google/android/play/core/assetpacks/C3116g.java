package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.io.SequenceInputStream;
import java.util.zip.GZIPInputStream;
import p289o5.RunnableC7933m;
import p290o6.C7967l0;
import p338qd.C8525b0;
import p338qd.C8528c0;
import p338qd.C8543h0;
import p338qd.C8544h1;
import p338qd.C8561n0;
import p338qd.InterfaceC8589w1;
import td.InterfaceC9268p;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.g */
/* JADX INFO: loaded from: classes.dex */
public final class C3116g {

    /* JADX INFO: renamed from: g */
    public static final C7967l0 f15915g = new C7967l0("ExtractChunkTaskHandler");

    /* JADX INFO: renamed from: a */
    public final byte[] f15916a = new byte[8192];

    /* JADX INFO: renamed from: b */
    public final C3112c f15917b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9268p f15918c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC9268p f15919d;

    /* JADX INFO: renamed from: e */
    public final C8561n0 f15920e;

    /* JADX INFO: renamed from: f */
    public final C8544h1 f15921f;

    public C3116g(C3112c c3112c, InterfaceC9268p interfaceC9268p, InterfaceC9268p interfaceC9268p2, C8561n0 c8561n0, C8544h1 c8544h1) {
        this.f15917b = c3112c;
        this.f15918c = interfaceC9268p;
        this.f15919d = interfaceC9268p2;
        this.f15920e = c8561n0;
        this.f15921f = c8544h1;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x01ba  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.io.InputStream] */
    /* JADX INFO: renamed from: a */
    public final void m8985a(C8543h0 c8543h0) {
        InputStream inputStream;
        double d10;
        C8528c0 c8528c0M8983a;
        File fileM9001c;
        long length;
        int iMin;
        int iMax;
        long j10;
        int i10;
        C3112c c3112c = this.f15917b;
        String str = (String) c8543h0.f33657b;
        int i11 = c8543h0.f45862c;
        long j11 = c8543h0.f45863d;
        String str2 = c8543h0.f45865f;
        C3124o c3124o = new C3124o(c3112c, str, i11, j11, str2);
        c3112c.getClass();
        File file = new File(new File(new File(c3112c.m8969c(str, i11, j11), "_slices"), "_metadata"), str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        ?? r13 = 3;
        try {
            InputStream inputStream2 = c8543h0.f45871l;
            InputStream gZIPInputStream = c8543h0.f45866g != 1 ? inputStream2 : new GZIPInputStream(inputStream2, 8192);
            try {
                try {
                    if (c8543h0.f45867h > 0) {
                        C8525b0 c8525b0M9000b = c3124o.m9000b();
                        int i12 = c8525b0M9000b.f45795e;
                        int i13 = c8543h0.f45867h;
                        if (i12 != i13 - 1) {
                            throw new zzck(String.format("Trying to resume with chunk number %s when previously processed chunk was number %s.", Integer.valueOf(i13), Integer.valueOf(c8525b0M9000b.f45795e)), c8543h0.f33656a);
                        }
                        int i14 = c8525b0M9000b.f45791a;
                        if (i14 == 1) {
                            f15915g.m15811l("Resuming zip entry from last chunk during file %s.", c8525b0M9000b.f45792b);
                            File file2 = new File(c8525b0M9000b.f45792b);
                            if (!file2.exists()) {
                                throw new zzck("Partial file specified in checkpoint does not exist. Corrupt directory.", c8543h0.f33656a);
                            }
                            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
                            randomAccessFile.seek(c8525b0M9000b.f45793c);
                            long j12 = c8525b0M9000b.f45794d;
                            while (true) {
                                iMin = (int) Math.min(j12, 8192L);
                                iMax = Math.max(gZIPInputStream.read(this.f15916a, 0, iMin), 0);
                                if (iMax > 0) {
                                    randomAccessFile.write(this.f15916a, 0, iMax);
                                }
                                j10 = j12 - ((long) iMax);
                                if (j10 <= 0 || iMax <= 0) {
                                    break;
                                    break;
                                }
                                j12 = j10;
                            }
                            long length2 = randomAccessFile.length();
                            randomAccessFile.close();
                            if (iMax != iMin) {
                                f15915g.m15811l("Chunk has ended while resuming the previous chunks file content.", new Object[0]);
                                c3124o.m9003e(file2.getCanonicalPath(), length2, j10, c8543h0.f45867h);
                            } else {
                                gZIPInputStream = gZIPInputStream;
                                inputStream = gZIPInputStream;
                            }
                        } else if (i14 == 2) {
                            f15915g.m15811l("Resuming zip entry from last chunk during local file header.", new Object[0]);
                            C3112c c3112c2 = this.f15917b;
                            String str3 = (String) c8543h0.f33657b;
                            int i15 = c8543h0.f45862c;
                            long j13 = c8543h0.f45863d;
                            String str4 = c8543h0.f45865f;
                            c3112c2.getClass();
                            File file3 = new File(new File(new File(new File(c3112c2.m8969c(str3, i15, j13), "_slices"), "_metadata"), str4), "checkpoint_ext.dat");
                            if (!file3.exists()) {
                                throw new zzck("Checkpoint extension file not found.", c8543h0.f33656a);
                            }
                            SequenceInputStream sequenceInputStream = new SequenceInputStream(new FileInputStream(file3), gZIPInputStream);
                            gZIPInputStream = gZIPInputStream;
                            inputStream = sequenceInputStream;
                        } else {
                            if (i14 != 3) {
                                throw new zzck(String.format("Slice checkpoint file corrupt. Unexpected FileExtractionStatus %s.", Integer.valueOf(c8525b0M9000b.f45791a)), c8543h0.f33656a);
                            }
                            f15915g.m15811l("Resuming central directory from last chunk.", new Object[0]);
                            long j14 = c8525b0M9000b.f45793c;
                            byte[] bArr = c3124o.f15963a;
                            RandomAccessFile randomAccessFile2 = new RandomAccessFile(c3124o.m9001c(), "rw");
                            try {
                                randomAccessFile2.seek(j14);
                                do {
                                    i10 = gZIPInputStream.read(bArr);
                                    if (i10 > 0) {
                                        randomAccessFile2.write(bArr, 0, i10);
                                    }
                                } while (i10 == 8192);
                                randomAccessFile2.close();
                                if (!(c8543h0.f45867h + 1 == c8543h0.f45868i)) {
                                    throw new zzck("Chunk has ended twice during central directory. This should not be possible with chunk sizes of 50MB.", c8543h0.f33656a);
                                }
                            } catch (Throwable th2) {
                                try {
                                    randomAccessFile2.close();
                                } catch (Throwable unused) {
                                }
                                throw th2;
                            }
                        }
                        inputStream = null;
                        try {
                            r13.close();
                        } catch (Throwable unused2) {
                        }
                        throw th;
                    }
                    gZIPInputStream = gZIPInputStream;
                    inputStream = gZIPInputStream;
                    if (inputStream != null) {
                        C3115f c3115f = new C3115f(inputStream);
                        File fileM8975k = this.f15917b.m8975k((String) c8543h0.f33657b, c8543h0.f45862c, c8543h0.f45863d, c8543h0.f45865f);
                        if (!fileM8975k.exists()) {
                            fileM8975k.mkdirs();
                        }
                        do {
                            c8528c0M8983a = c3115f.m8983a();
                            if (!c8528c0M8983a.f45804d && !c3115f.f15914e) {
                                if (!(c8528c0M8983a.mo16641a() == 0) || c8528c0M8983a.m16659g()) {
                                    c3124o.m9007i(c3115f, c8528c0M8983a.f45806f);
                                } else {
                                    c3124o.m9006h(c8528c0M8983a.f45806f);
                                    File file4 = new File(fileM8975k, c8528c0M8983a.f45801a);
                                    file4.getParentFile().mkdirs();
                                    FileOutputStream fileOutputStream = new FileOutputStream(file4);
                                    int i16 = c3115f.read(this.f15916a, 0, 8192);
                                    while (i16 > 0) {
                                        fileOutputStream.write(this.f15916a, 0, i16);
                                        i16 = c3115f.read(this.f15916a, 0, 8192);
                                    }
                                    fileOutputStream.close();
                                }
                            }
                            if (c3115f.f15913d) {
                                break;
                            }
                        } while (!c3115f.f15914e);
                        if (c3115f.f15914e) {
                            f15915g.m15811l("Writing central directory metadata.", new Object[0]);
                            c3124o.m9007i(inputStream, c8528c0M8983a.f45806f);
                        }
                        if (!(c8543h0.f45867h + 1 == c8543h0.f45868i)) {
                            if (c8528c0M8983a.f45804d) {
                                f15915g.m15811l("Writing slice checkpoint for partial local file header.", new Object[0]);
                                c3124o.m9004f(c8528c0M8983a.f45806f, c8543h0.f45867h);
                            } else if (c3115f.f15914e) {
                                f15915g.m15811l("Writing slice checkpoint for central directory.", new Object[0]);
                                c3124o.m9002d(c8543h0.f45867h);
                            } else {
                                if (c8528c0M8983a.f45803c == 0) {
                                    f15915g.m15811l("Writing slice checkpoint for partial file.", new Object[0]);
                                    File fileM8975k2 = this.f15917b.m8975k((String) c8543h0.f33657b, c8543h0.f45862c, c8543h0.f45863d, c8543h0.f45865f);
                                    if (!fileM8975k2.exists()) {
                                        fileM8975k2.mkdirs();
                                    }
                                    fileM9001c = new File(fileM8975k2, c8528c0M8983a.f45801a);
                                    length = c8528c0M8983a.f45802b - c3115f.f15912c;
                                    if (fileM9001c.length() != length) {
                                        throw new zzck("Partial file is of unexpected size.");
                                    }
                                } else {
                                    f15915g.m15811l("Writing slice checkpoint for partial unextractable file.", new Object[0]);
                                    fileM9001c = c3124o.m9001c();
                                    length = fileM9001c.length();
                                }
                                c3124o.m9003e(fileM9001c.getCanonicalPath(), length, c3115f.f15912c, c8543h0.f45867h);
                            }
                        }
                    }
                    gZIPInputStream.close();
                    int i17 = c8543h0.f45867h;
                    if (i17 + 1 == c8543h0.f45868i) {
                        try {
                            c3124o.m9005g(i17);
                        } catch (IOException e10) {
                            f15915g.m15812m("Writing extraction finished checkpoint failed with %s.", e10.getMessage());
                            throw new zzck("Writing extraction finished checkpoint failed.", e10, c8543h0.f33656a);
                        }
                    }
                    f15915g.m15814o("Extraction finished for chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(c8543h0.f45867h), c8543h0.f45865f, (String) c8543h0.f33657b, Integer.valueOf(c8543h0.f33656a));
                    ((InterfaceC8589w1) this.f15918c.zza()).mo8959e((String) c8543h0.f33657b, c8543h0.f33656a, c8543h0.f45867h, c8543h0.f45865f);
                    try {
                        c8543h0.f45871l.close();
                    } catch (IOException unused3) {
                        f15915g.m15815p("Could not close file for chunk %s of slice %s of pack %s.", Integer.valueOf(c8543h0.f45867h), c8543h0.f45865f, (String) c8543h0.f33657b);
                    }
                    if (c8543h0.f45870k == 3) {
                        C3111b c3111b = (C3111b) this.f15919d.zza();
                        String str5 = (String) c8543h0.f33657b;
                        long j15 = c8543h0.f45869j;
                        C8561n0 c8561n0 = this.f15920e;
                        synchronized (c8561n0) {
                            d10 = (((double) c8543h0.f45867h) + 1.0d) / ((double) c8543h0.f45868i);
                            c8561n0.f45928a.put(str5, Double.valueOf(d10));
                        }
                        c3111b.f15904o.post(new RunnableC7933m(c3111b, 11, AssetPackState.m8941h(str5, 3, 0, j15, j15, d10, 1, c8543h0.f45864e, this.f15921f.m16650a((String) c8543h0.f33657b))));
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                r13 = gZIPInputStream;
            }
        } catch (IOException e11) {
            f15915g.m15812m("IOException during extraction %s.", e11.getMessage());
            throw new zzck(String.format("Error extracting chunk %s of slice %s of pack %s of session %s.", Integer.valueOf(c8543h0.f45867h), c8543h0.f45865f, (String) c8543h0.f33657b, Integer.valueOf(c8543h0.f33656a)), e11, c8543h0.f33656a);
        }
    }
}
