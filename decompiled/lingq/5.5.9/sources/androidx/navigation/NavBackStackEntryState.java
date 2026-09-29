package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.view.Lifecycle;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p040c4.C1685j;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m13365d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "navigation-runtime_release"}, m13366k = 1, m13367mv = {1, PreferencesProto$Value.STRING_SET_FIELD_NUMBER, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@SuppressLint({"BanParcelableUsage"})
public final class NavBackStackEntryState implements Parcelable {
    public static final Parcelable.Creator<NavBackStackEntryState> CREATOR = new C1073a();

    /* JADX INFO: renamed from: a */
    public final String f6745a;

    /* JADX INFO: renamed from: b */
    public final int f6746b;

    /* JADX INFO: renamed from: c */
    public final Bundle f6747c;

    /* JADX INFO: renamed from: d */
    public final Bundle f6748d;

    /* JADX INFO: renamed from: androidx.navigation.NavBackStackEntryState$a */
    public static final class C1073a implements Parcelable.Creator<NavBackStackEntryState> {
        @Override // android.os.Parcelable.Creator
        public final NavBackStackEntryState createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "inParcel");
            return new NavBackStackEntryState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final NavBackStackEntryState[] newArray(int i10) {
            return new NavBackStackEntryState[i10];
        }
    }

    public NavBackStackEntryState(Parcel parcel) {
        C5207g.m11111f(parcel, "inParcel");
        String string = parcel.readString();
        C5207g.m11108c(string);
        this.f6745a = string;
        this.f6746b = parcel.readInt();
        this.f6747c = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle bundle = parcel.readBundle(NavBackStackEntryState.class.getClassLoader());
        C5207g.m11108c(bundle);
        this.f6748d = bundle;
    }

    public NavBackStackEntryState(NavBackStackEntry navBackStackEntry) {
        C5207g.m11111f(navBackStackEntry, "entry");
        this.f6745a = navBackStackEntry.f6735f;
        this.f6746b = navBackStackEntry.f6731b.f6834h;
        this.f6747c = navBackStackEntry.f6732c;
        Bundle bundle = new Bundle();
        this.f6748d = bundle;
        navBackStackEntry.f6738i.m15300c(bundle);
    }

    /* JADX INFO: renamed from: a */
    public final NavBackStackEntry m3978a(Context context, NavDestination navDestination, Lifecycle.State state, C1685j c1685j) {
        C5207g.m11111f(context, "context");
        C5207g.m11111f(state, "hostLifecycleState");
        Bundle bundle = this.f6747c;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = this.f6748d;
        String str = this.f6745a;
        C5207g.m11111f(str, "id");
        return new NavBackStackEntry(context, navDestination, bundle, state, c1685j, str, bundle2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        C5207g.m11111f(parcel, "parcel");
        parcel.writeString(this.f6745a);
        parcel.writeInt(this.f6746b);
        parcel.writeBundle(this.f6747c);
        parcel.writeBundle(this.f6748d);
    }
}
