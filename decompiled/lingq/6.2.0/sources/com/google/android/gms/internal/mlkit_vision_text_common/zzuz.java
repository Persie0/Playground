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
public final class zzuz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzuz> CREATOR = new nbd(10);

    /* JADX INFO: renamed from: a */
    public final String f12143a;

    /* JADX INFO: renamed from: b */
    public final Rect f12144b;

    /* JADX INFO: renamed from: c */
    public final List f12145c;

    /* JADX INFO: renamed from: d */
    public final String f12146d;

    /* JADX INFO: renamed from: e */
    public final List f12147e;

    public zzuz(String str, Rect rect, ArrayList arrayList, String str2, ArrayList arrayList2) {
        this.f12143a = str;
        this.f12144b = rect;
        this.f12145c = arrayList;
        this.f12146d = str2;
        this.f12147e = arrayList2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 1, this.f12143a);
        l70.m15929T(parcel, 2, this.f12144b, i);
        l70.m15934Y(parcel, 3, this.f12145c);
        l70.m15930U(parcel, 4, this.f12146d);
        l70.m15934Y(parcel, 5, this.f12147e);
        l70.m15939b0(parcel, iM15937a0);
    }
}
