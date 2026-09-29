package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class CTInboxStyleConfig implements Parcelable {
    public static final Parcelable.Creator<CTInboxStyleConfig> CREATOR = new C2170a();

    /* JADX INFO: renamed from: H */
    public final String f10964H;

    /* JADX INFO: renamed from: a */
    public final String f10965a;

    /* JADX INFO: renamed from: b */
    public final String f10966b;

    /* JADX INFO: renamed from: c */
    public final String f10967c;

    /* JADX INFO: renamed from: d */
    public final String f10968d;

    /* JADX INFO: renamed from: e */
    public final String f10969e;

    /* JADX INFO: renamed from: f */
    public final String f10970f;

    /* JADX INFO: renamed from: g */
    public final String f10971g;

    /* JADX INFO: renamed from: h */
    public final String f10972h;

    /* JADX INFO: renamed from: i */
    public final String f10973i;

    /* JADX INFO: renamed from: j */
    public final String f10974j;

    /* JADX INFO: renamed from: k */
    public final String f10975k;

    /* JADX INFO: renamed from: l */
    public final String[] f10976l;

    /* JADX INFO: renamed from: com.clevertap.android.sdk.CTInboxStyleConfig$a */
    public class C2170a implements Parcelable.Creator<CTInboxStyleConfig> {
        @Override // android.os.Parcelable.Creator
        public final CTInboxStyleConfig createFromParcel(Parcel parcel) {
            return new CTInboxStyleConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final CTInboxStyleConfig[] newArray(int i10) {
            return new CTInboxStyleConfig[i10];
        }
    }

    public CTInboxStyleConfig() {
        this.f10968d = "#FFFFFF";
        this.f10969e = "App Inbox";
        this.f10970f = "#333333";
        this.f10967c = "#D3D4DA";
        this.f10965a = "#333333";
        this.f10973i = "#1C84FE";
        this.f10964H = "#808080";
        this.f10974j = "#1C84FE";
        this.f10975k = "#FFFFFF";
        this.f10976l = new String[0];
        this.f10971g = "No Message(s) to show";
        this.f10972h = "#000000";
        this.f10966b = "ALL";
    }

    public CTInboxStyleConfig(Parcel parcel) {
        this.f10968d = parcel.readString();
        this.f10969e = parcel.readString();
        this.f10970f = parcel.readString();
        this.f10967c = parcel.readString();
        this.f10976l = parcel.createStringArray();
        this.f10965a = parcel.readString();
        this.f10973i = parcel.readString();
        this.f10964H = parcel.readString();
        this.f10974j = parcel.readString();
        this.f10975k = parcel.readString();
        this.f10971g = parcel.readString();
        this.f10972h = parcel.readString();
        this.f10966b = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f10968d);
        parcel.writeString(this.f10969e);
        parcel.writeString(this.f10970f);
        parcel.writeString(this.f10967c);
        parcel.writeStringArray(this.f10976l);
        parcel.writeString(this.f10965a);
        parcel.writeString(this.f10973i);
        parcel.writeString(this.f10964H);
        parcel.writeString(this.f10974j);
        parcel.writeString(this.f10975k);
        parcel.writeString(this.f10971g);
        parcel.writeString(this.f10972h);
        parcel.writeString(this.f10966b);
    }
}
