package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "activity_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0201a();

    /* JADX INFO: renamed from: a */
    public final IntentSender f511a;

    /* JADX INFO: renamed from: b */
    public final Intent f512b;

    /* JADX INFO: renamed from: c */
    public final int f513c;

    /* JADX INFO: renamed from: d */
    public final int f514d;

    /* JADX INFO: renamed from: androidx.activity.result.IntentSenderRequest$a */
    public static final class C0201a implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "inParcel");
            Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
            C5207g.m11108c(parcelable);
            return new IntentSenderRequest((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final IntentSenderRequest[] newArray(int i10) {
            return new IntentSenderRequest[i10];
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i10, int i11) {
        C5207g.m11111f(intentSender, "intentSender");
        this.f511a = intentSender;
        this.f512b = intent;
        this.f513c = i10;
        this.f514d = i11;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "dest");
        parcel.writeParcelable(this.f511a, i10);
        parcel.writeParcelable(this.f512b, i10);
        parcel.writeInt(this.f513c);
        parcel.writeInt(this.f514d);
    }
}
