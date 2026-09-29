package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p000.hfb;
import p000.u1d;

/* JADX INFO: loaded from: classes.dex */
public final class ActivityResult implements Parcelable {
    public static final Parcelable.Creator<ActivityResult> CREATOR = new hfb(1);

    /* JADX INFO: renamed from: a */
    public final int f1007a;

    /* JADX INFO: renamed from: b */
    public final Intent f1008b;

    public ActivityResult(Intent intent, int i) {
        this.f1007a = i;
        this.f1008b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "ActivityResult{resultCode=" + u1d.m22391b(this.f1007a) + ", data=" + this.f1008b + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.f1007a);
        Intent intent = this.f1008b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
