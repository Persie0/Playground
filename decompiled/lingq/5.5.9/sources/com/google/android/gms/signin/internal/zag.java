package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0987y;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import ec.C5394g;
import gb.InterfaceC5740d;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zag extends AbstractSafeParcelable implements InterfaceC5740d {
    public static final Parcelable.Creator<zag> CREATOR = new C5394g();

    /* JADX INFO: renamed from: a */
    public final List<String> f14653a;

    /* JADX INFO: renamed from: b */
    public final String f14654b;

    public zag(ArrayList arrayList, String str) {
        this.f14653a = arrayList;
        this.f14654b = str;
    }

    @Override // gb.InterfaceC5740d
    /* JADX INFO: renamed from: m */
    public final Status mo5489m() {
        return this.f14654b != null ? Status.f13873f : Status.f13877j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iM3836r = C0987y.m3836r(parcel, 20293);
        List<String> list = this.f14653a;
        if (list != null) {
            int iM3836r2 = C0987y.m3836r(parcel, 1);
            parcel.writeStringList(list);
            C0987y.m3839u(parcel, iM3836r2);
        }
        C0987y.m3832n(parcel, 2, this.f14654b);
        C0987y.m3839u(parcel, iM3836r);
    }
}
