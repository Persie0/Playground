package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import p000.jbt;
import p000.jib;
import p000.jij;
import p000.jiy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class DataHolder extends jij implements Closeable {
    public static final Parcelable.Creator CREATOR = new jbt(15);

    /* JADX INFO: renamed from: a */
    final int f7626a;

    /* JADX INFO: renamed from: b */
    public final String[] f7627b;

    /* JADX INFO: renamed from: c */
    public Bundle f7628c;

    /* JADX INFO: renamed from: d */
    public final CursorWindow[] f7629d;

    /* JADX INFO: renamed from: e */
    public final int f7630e;

    /* JADX INFO: renamed from: f */
    public final Bundle f7631f;

    /* JADX INFO: renamed from: g */
    public int[] f7632g;

    /* JADX INFO: renamed from: h */
    public int f7633h;

    /* JADX INFO: renamed from: i */
    boolean f7634i = false;

    /* JADX INFO: renamed from: j */
    private final boolean f7635j = true;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i, String[] strArr, CursorWindow[] cursorWindowArr, int i2, Bundle bundle) {
        this.f7626a = i;
        this.f7627b = strArr;
        this.f7629d = cursorWindowArr;
        this.f7630e = i2;
        this.f7631f = bundle;
    }

    /* JADX INFO: renamed from: a */
    public final int m4660a(int i) {
        int length;
        int i2 = 0;
        jib.m13201f(i >= 0 && i < this.f7633h);
        while (true) {
            int[] iArr = this.f7632g;
            length = iArr.length;
            if (i2 >= length) {
                break;
            }
            if (i < iArr[i2]) {
                i2--;
                break;
            }
            i2++;
        }
        return i2 == length ? i2 - 1 : i2;
    }

    /* JADX INFO: renamed from: b */
    public final String m4661b(String str, int i, int i2) {
        m4662c(str, i);
        return this.f7629d[i2].getString(i, this.f7628c.getInt(str));
    }

    /* JADX INFO: renamed from: c */
    public final void m4662c(String str, int i) {
        Bundle bundle = this.f7628c;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(str));
        }
        if (m4663d()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (i < 0 || i >= this.f7633h) {
            throw new CursorIndexOutOfBoundsException(i, this.f7633h);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            if (!this.f7634i) {
                this.f7634i = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f7629d;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final boolean m4663d() {
        boolean z;
        synchronized (this) {
            z = this.f7634i;
        }
        return z;
    }

    protected final void finalize() throws Throwable {
        try {
            if (this.f7635j && this.f7629d.length > 0 && !m4663d()) {
                close();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13297x(parcel, 1, this.f7627b);
        jiy.m13299z(parcel, 2, this.f7629d, i);
        jiy.m13287n(parcel, 3, this.f7630e);
        jiy.m13289p(parcel, 4, this.f7631f);
        jiy.m13287n(parcel, 1000, this.f7626a);
        jiy.m13283j(parcel, iM13281h);
        if ((i & 1) != 0) {
            close();
        }
    }
}
