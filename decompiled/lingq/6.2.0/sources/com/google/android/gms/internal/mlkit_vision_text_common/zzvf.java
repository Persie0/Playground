package com.google.android.gms.internal.mlkit_vision_text_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.List;
import p000.l70;
import p000.nbd;

/* JADX INFO: loaded from: classes2.dex */
public final class zzvf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvf> CREATOR = new nbd(13);

    /* JADX INFO: renamed from: a */
    public final String f12162a;

    /* JADX INFO: renamed from: b */
    public final List f12163b;

    public zzvf(String str, ArrayList arrayList) {
        this.f12162a = str;
        this.f12163b = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 1, this.f12162a);
        l70.m15934Y(parcel, 2, this.f12163b);
        l70.m15939b0(parcel, iM15937a0);
    }
}
