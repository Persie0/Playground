package p000;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: qd */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0926qd implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0870ob(5);

    /* JADX INFO: renamed from: a */
    public final IntentSender f47475a;

    /* JADX INFO: renamed from: b */
    public final Intent f47476b;

    /* JADX INFO: renamed from: c */
    public final int f47477c;

    /* JADX INFO: renamed from: d */
    public final int f47478d;

    public C0926qd(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f47475a = intentSender;
        this.f47476b = intent;
        this.f47477c = i;
        this.f47478d = i2;
    }

    public C0926qd(Parcel parcel) {
        this.f47475a = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.f47476b = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.f47477c = parcel.readInt();
        this.f47478d = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f47475a, i);
        parcel.writeParcelable(this.f47476b, i);
        parcel.writeInt(this.f47477c);
        parcel.writeInt(this.f47478d);
    }
}
