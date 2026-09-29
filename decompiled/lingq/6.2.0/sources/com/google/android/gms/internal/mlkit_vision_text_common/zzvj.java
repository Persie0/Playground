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
public final class zzvj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvj> CREATOR = new nbd(15);

    /* JADX INFO: renamed from: a */
    public final String f12171a;

    /* JADX INFO: renamed from: b */
    public final Rect f12172b;

    /* JADX INFO: renamed from: c */
    public final List f12173c;

    /* JADX INFO: renamed from: d */
    public final float f12174d;

    /* JADX INFO: renamed from: e */
    public final float f12175e;

    public zzvj(String str, Rect rect, ArrayList arrayList, float f, float f2) {
        this.f12171a = str;
        this.f12172b = rect;
        this.f12173c = arrayList;
        this.f12174d = f;
        this.f12175e = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 1, this.f12171a);
        l70.m15929T(parcel, 2, this.f12172b, i);
        l70.m15934Y(parcel, 3, this.f12173c);
        l70.m15935Z(parcel, 4, 4);
        parcel.writeFloat(this.f12174d);
        l70.m15935Z(parcel, 5, 4);
        parcel.writeFloat(this.f12175e);
        l70.m15939b0(parcel, iM15937a0);
    }
}
