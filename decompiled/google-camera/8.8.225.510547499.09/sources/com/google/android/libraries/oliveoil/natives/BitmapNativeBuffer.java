package com.google.android.libraries.oliveoil.natives;

import android.graphics.Bitmap;
import com.google.android.libraries.oliveoil.util.JniUtil;
import java.nio.ByteBuffer;
import p000.kzi;
import p000.lbm;
import p000.lfr;
import p000.lfx;
import p000.lgb;
import p000.lku;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class BitmapNativeBuffer extends lfx {

    /* JADX INFO: renamed from: b */
    private final Bitmap f7950b;

    /* JADX INFO: renamed from: c */
    private int f7951c;

    /* JADX INFO: renamed from: d */
    private ByteBuffer f7952d;

    public BitmapNativeBuffer(Bitmap bitmap) {
        super(new lbm(kzi.m15087d(bitmap.getWidth(), bitmap.getHeight()), bitmap.getRowBytes() * 8));
        this.f7951c = 0;
        lku.m15669w(bitmap.getConfig() == Bitmap.Config.ARGB_8888);
        this.f7950b = bitmap;
        int i = JniUtil.f7954a;
    }

    private static native ByteBuffer lockBitmapPixels(Bitmap bitmap);

    private static native void unlockBitmapPixels(Bitmap bitmap);

    /* JADX INFO: renamed from: a */
    public final synchronized ByteBuffer m4708a() {
        ByteBuffer byteBuffer;
        int i = this.f7951c;
        this.f7951c = i + 1;
        if (i == 0) {
            this.f7952d = lockBitmapPixels(this.f7950b);
        }
        byteBuffer = this.f7952d;
        if (byteBuffer == null) {
            this.f7951c--;
            throw new RuntimeException("Could not lock bitmap pixels!");
        }
        return byteBuffer;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m4709b() {
        lku.m15613H(this.f7952d != null);
        int i = this.f7951c - 1;
        this.f7951c = i;
        if (i == 0) {
            unlockBitmapPixels(this.f7950b);
            this.f7952d = null;
        }
    }

    @Override // p000.lfw
    /* JADX INFO: renamed from: c */
    public final lgb mo4710c() {
        return new lfr(this);
    }

    @Override // p000.kzf, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
