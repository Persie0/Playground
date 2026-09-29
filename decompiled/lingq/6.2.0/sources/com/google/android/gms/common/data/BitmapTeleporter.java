package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.nio.ByteBuffer;
import p000.C3386nv;
import p000.l70;
import p000.lda;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new y3a(4);

    /* JADX INFO: renamed from: a */
    public final int f11677a;

    /* JADX INFO: renamed from: b */
    public ParcelFileDescriptor f11678b;

    /* JADX INFO: renamed from: c */
    public final int f11679c;

    /* JADX INFO: renamed from: d */
    public Bitmap f11680d = null;

    /* JADX INFO: renamed from: e */
    public boolean f11681e = false;

    public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
        this.f11677a = i;
        this.f11678b = parcelFileDescriptor;
        this.f11679c = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.f11678b == null) {
            Bitmap bitmap = this.f11680d;
            lda.m16130p(bitmap);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getHeight() * bitmap.getRowBytes());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byteBufferAllocate.array();
            C3386nv.m17633t("setTempDir() must be called before writing this object to a parcel");
            return;
        }
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15935Z(parcel, 1, 4);
        parcel.writeInt(this.f11677a);
        l70.m15929T(parcel, 2, this.f11678b, i | 1);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11679c);
        l70.m15939b0(parcel, iM15937a0);
        this.f11678b = null;
    }
}
