package com.google.android.gms.internal.mlkit_vision_text_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p000.l70;
import p000.nbd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvb extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvb> CREATOR = new nbd(11);

    /* JADX INFO: renamed from: a */
    public final String f12148a;

    /* JADX INFO: renamed from: b */
    public final Rect f12149b;

    /* JADX INFO: renamed from: c */
    public final List f12150c;

    /* JADX INFO: renamed from: d */
    public final String f12151d;

    /* JADX INFO: renamed from: e */
    public final float f12152e;

    /* JADX INFO: renamed from: f */
    public final float f12153f;

    /* JADX INFO: renamed from: g */
    public final List f12154g;

    public zzvb(float f, float f2, Rect rect, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.f12148a = str;
        this.f12149b = rect;
        this.f12150c = arrayList;
        this.f12151d = str2;
        this.f12152e = f;
        this.f12153f = f2;
        this.f12154g = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 1, this.f12148a);
        l70.m15929T(parcel, 2, this.f12149b, i);
        l70.m15934Y(parcel, 3, this.f12150c);
        l70.m15930U(parcel, 4, this.f12151d);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeFloat(this.f12152e);
        l70.m15935Z(parcel, 6, 4);
        parcel.writeFloat(this.f12153f);
        l70.m15934Y(parcel, 7, this.f12154g);
        l70.m15939b0(parcel, iM15937a0);
    }
}
