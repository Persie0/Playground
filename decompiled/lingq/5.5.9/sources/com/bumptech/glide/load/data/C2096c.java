package com.bumptech.glide.load.data;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import p407u5.InterfaceC9451b;

/* JADX INFO: renamed from: com.bumptech.glide.load.data.c */
/* JADX INFO: loaded from: classes.dex */
public final class C2096c extends OutputStream {

    /* JADX INFO: renamed from: a */
    public final OutputStream f10608a;

    /* JADX INFO: renamed from: b */
    public byte[] f10609b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC9451b f10610c;

    /* JADX INFO: renamed from: d */
    public int f10611d;

    public C2096c(FileOutputStream fileOutputStream, InterfaceC9451b interfaceC9451b) {
        this.f10608a = fileOutputStream;
        this.f10610c = interfaceC9451b;
        this.f10609b = (byte[]) interfaceC9451b.mo17852d(65536, byte[].class);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        OutputStream outputStream = this.f10608a;
        try {
            flush();
            outputStream.close();
            byte[] bArr = this.f10609b;
            if (bArr != null) {
                this.f10610c.mo17851c(bArr);
                this.f10609b = null;
            }
        } finally {
            outputStream.close();
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        int i10 = this.f10611d;
        OutputStream outputStream = this.f10608a;
        if (i10 > 0) {
            outputStream.write(this.f10609b, 0, i10);
            this.f10611d = 0;
        }
        outputStream.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i10) throws IOException {
        byte[] bArr = this.f10609b;
        int i11 = this.f10611d;
        int i12 = i11 + 1;
        this.f10611d = i12;
        bArr[i11] = (byte) i10;
        if (i12 != bArr.length || i12 <= 0) {
            return;
        }
        this.f10608a.write(bArr, 0, i12);
        this.f10611d = 0;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        do {
            int i13 = i11 - i12;
            int i14 = i10 + i12;
            int i15 = this.f10611d;
            OutputStream outputStream = this.f10608a;
            if (i15 == 0 && i13 >= this.f10609b.length) {
                outputStream.write(bArr, i14, i13);
                return;
            }
            int iMin = Math.min(i13, this.f10609b.length - i15);
            System.arraycopy(bArr, i14, this.f10609b, this.f10611d, iMin);
            int i16 = this.f10611d + iMin;
            this.f10611d = i16;
            i12 += iMin;
            byte[] bArr2 = this.f10609b;
            if (i16 == bArr2.length && i16 > 0) {
                outputStream.write(bArr2, 0, i16);
                this.f10611d = 0;
            }
        } while (i12 < i11);
    }
}
