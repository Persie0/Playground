package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import p000.jib;
import p000.jij;
import p000.jiy;
import p000.jqs;
import p000.jri;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class DataItemAssetParcelable extends jij implements ReflectedParcelable, jqs {
    public static final Parcelable.Creator CREATOR = new jri(13);

    /* JADX INFO: renamed from: a */
    public final String f7785a;

    /* JADX INFO: renamed from: b */
    public final String f7786b;

    public DataItemAssetParcelable(String str, String str2) {
        this.f7785a = str;
        this.f7786b = str2;
    }

    public DataItemAssetParcelable(jqs jqsVar) {
        String strMo4669d = jqsVar.mo4669d();
        jib.m13205j(strMo4669d);
        this.f7785a = strMo4669d;
        String strMo4668c = jqsVar.mo4668c();
        jib.m13205j(strMo4668c);
        this.f7786b = strMo4668c;
    }

    @Override // p000.jqs
    /* JADX INFO: renamed from: c */
    public final String mo4668c() {
        return this.f7786b;
    }

    @Override // p000.jqs
    /* JADX INFO: renamed from: d */
    public final String mo4669d() {
        return this.f7785a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DataItemAssetParcelable[@");
        sb.append(Integer.toHexString(hashCode()));
        if (this.f7785a == null) {
            sb.append(",noid");
        } else {
            sb.append(",");
            sb.append(this.f7785a);
        }
        sb.append(", key=");
        sb.append(this.f7786b);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 2, this.f7785a);
        jiy.m13296w(parcel, 3, this.f7786b);
        jiy.m13283j(parcel, iM13281h);
    }
}
