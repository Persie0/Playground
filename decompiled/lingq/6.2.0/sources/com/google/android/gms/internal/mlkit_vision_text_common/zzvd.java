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
public final class zzvd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzvd> CREATOR = new nbd(12);

    /* JADX INFO: renamed from: a */
    public final String f12155a;

    /* JADX INFO: renamed from: b */
    public final Rect f12156b;

    /* JADX INFO: renamed from: c */
    public final List f12157c;

    /* JADX INFO: renamed from: d */
    public final String f12158d;

    /* JADX INFO: renamed from: e */
    public final List f12159e;

    /* JADX INFO: renamed from: f */
    public final float f12160f;

    /* JADX INFO: renamed from: g */
    public final float f12161g;

    public zzvd(float f, float f2, Rect rect, String str, String str2, ArrayList arrayList, ArrayList arrayList2) {
        this.f12155a = str;
        this.f12156b = rect;
        this.f12157c = arrayList;
        this.f12158d = str2;
        this.f12159e = arrayList2;
        this.f12160f = f;
        this.f12161g = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM15937a0 = l70.m15937a0(parcel, 20293);
        l70.m15930U(parcel, 1, this.f12155a);
        l70.m15929T(parcel, 2, this.f12156b, i);
        l70.m15934Y(parcel, 3, this.f12157c);
        l70.m15930U(parcel, 4, this.f12158d);
        l70.m15934Y(parcel, 5, this.f12159e);
        l70.m15935Z(parcel, 6, 4);
        parcel.writeFloat(this.f12160f);
        l70.m15935Z(parcel, 7, 4);
        parcel.writeFloat(this.f12161g);
        l70.m15939b0(parcel, iM15937a0);
    }
}
