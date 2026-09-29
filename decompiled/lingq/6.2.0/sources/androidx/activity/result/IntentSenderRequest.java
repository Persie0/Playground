package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import p000.hfb;

/* JADX INFO: loaded from: classes2.dex */
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new hfb(14);

    /* JADX INFO: renamed from: a */
    public final IntentSender f1009a;

    /* JADX INFO: renamed from: b */
    public final Intent f1010b;

    /* JADX INFO: renamed from: c */
    public final int f1011c;

    /* JADX INFO: renamed from: d */
    public final int f1012d;

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i, int i2) {
        intentSender.getClass();
        this.f1009a = intentSender;
        this.f1010b = intent;
        this.f1011c = i;
        this.f1012d = i2;
    }

    /* JADX INFO: renamed from: a */
    public final Intent m636a() {
        return this.f1010b;
    }

    /* JADX INFO: renamed from: b */
    public final int m637b() {
        return this.f1011c;
    }

    /* JADX INFO: renamed from: c */
    public final int m638c() {
        return this.f1012d;
    }

    /* JADX INFO: renamed from: d */
    public final IntentSender m639d() {
        return this.f1009a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.f1009a, i);
        parcel.writeParcelable(this.f1010b, i);
        parcel.writeInt(this.f1011c);
        parcel.writeInt(this.f1012d);
    }
}
