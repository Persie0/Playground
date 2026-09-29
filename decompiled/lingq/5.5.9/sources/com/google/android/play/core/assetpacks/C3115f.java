package com.google.android.play.core.assetpacks;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import p338qd.C8528c0;
import p338qd.C8529c1;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.f */
/* JADX INFO: loaded from: classes.dex */
public final class C3115f extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public final C8529c1 f15910a;

    /* JADX INFO: renamed from: b */
    public byte[] f15911b;

    /* JADX INFO: renamed from: c */
    public long f15912c;

    /* JADX INFO: renamed from: d */
    public boolean f15913d;

    /* JADX INFO: renamed from: e */
    public boolean f15914e;

    public C3115f(InputStream inputStream) {
        super(inputStream);
        this.f15910a = new C8529c1();
        this.f15911b = new byte[4096];
        this.f15913d = false;
        this.f15914e = false;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public final C8528c0 m8983a() throws IOException {
        byte[] bArr;
        if (this.f15912c > 0) {
            do {
                bArr = this.f15911b;
            } while (read(bArr, 0, bArr.length) != -1);
        }
        if (!this.f15913d && !this.f15914e) {
            boolean zM8984b = m8984b(30);
            C8529c1 c8529c1 = this.f15910a;
            if (!zM8984b) {
                this.f15913d = true;
                return c8529c1.m16648b();
            }
            C8528c0 c8528c0M16648b = c8529c1.m16648b();
            if (c8528c0M16648b.f45805e) {
                this.f15914e = true;
                return c8528c0M16648b;
            }
            if (c8528c0M16648b.f45802b == 4294967295L) {
                throw new zzck("Files bigger than 4GiB are not supported.");
            }
            int i10 = c8529c1.f45812f - 30;
            long j10 = i10;
            int length = this.f15911b.length;
            if (j10 > length) {
                do {
                    length += length;
                } while (length < j10);
                this.f15911b = Arrays.copyOf(this.f15911b, length);
            }
            if (!m8984b(i10)) {
                this.f15913d = true;
                return c8529c1.m16648b();
            }
            C8528c0 c8528c0M16648b2 = c8529c1.m16648b();
            this.f15912c = c8528c0M16648b2.f45802b;
            return c8528c0M16648b2;
        }
        return new C8528c0(null, -1L, -1, false, false, null);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m8984b(int i10) throws IOException {
        int iMax = Math.max(0, super.read(this.f15911b, 0, i10));
        C8529c1 c8529c1 = this.f15910a;
        if (iMax != i10) {
            int i11 = i10 - iMax;
            if (Math.max(0, super.read(this.f15911b, iMax, i11)) != i11) {
                c8529c1.m16647a(this.f15911b, 0, iMax);
                return false;
            }
        }
        c8529c1.m16647a(this.f15911b, 0, i10);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        long j10 = this.f15912c;
        if (j10 <= 0 || this.f15913d) {
            return -1;
        }
        int iMax = Math.max(0, super.read(bArr, i10, (int) Math.min(j10, i11)));
        this.f15912c -= (long) iMax;
        if (iMax != 0) {
            return iMax;
        }
        this.f15913d = true;
        return 0;
    }
}
