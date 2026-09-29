package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import p000.l70;
import p000.y3a;

/* JADX INFO: loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new y3a(12);

    /* JADX INFO: renamed from: a */
    public final int f11682a;

    /* JADX INFO: renamed from: b */
    public final String[] f11683b;

    /* JADX INFO: renamed from: c */
    public Bundle f11684c;

    /* JADX INFO: renamed from: d */
    public final CursorWindow[] f11685d;

    /* JADX INFO: renamed from: e */
    public final int f11686e;

    /* JADX INFO: renamed from: f */
    public final Bundle f11687f;

    /* JADX INFO: renamed from: g */
    public int[] f11688g;

    /* JADX INFO: renamed from: h */
    public boolean f11689h = false;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f11682a = i;
        this.f11683b = strArr;
        this.f11685d = cursorWindowArr;
        this.f11686e = i2;
        this.f11687f = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.f11689h) {
                    this.f11689h = true;
                    int i = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.f11685d;
                        if (i >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i].close();
                        i++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() throws Throwable {
        boolean z;
        try {
            if (this.f11685d.length > 0) {
                synchronized (this) {
                    z = this.f11689h;
                }
                if (!z) {
                    close();
                    String string = toString();
                    StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 178);
                    sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                    sb.append(string);
                    sb.append(")");
                    Log.e("DataBuffer", sb.toString());
                }
            }
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15931V(parcel, 1, this.f11683b);
        l70.m15933X(parcel, 2, this.f11685d, i);
        l70.m15935Z(parcel, 3, 4);
        parcel.writeInt(this.f11686e);
        l70.m15924O(parcel, 4, this.f11687f);
        l70.m15935Z(parcel, DescriptorProtos.Edition.EDITION_2023_VALUE, 4);
        parcel.writeInt(this.f11682a);
        l70.m15939b0(parcel, iM15937a0);
        if ((i & 1) != 0) {
            close();
        }
    }
}
