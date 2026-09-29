package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.view.Lifecycle;
import com.kochava.tracker.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0934a();

    /* JADX INFO: renamed from: H */
    public Bundle f6217H;

    /* JADX INFO: renamed from: a */
    public final String f6218a;

    /* JADX INFO: renamed from: b */
    public final String f6219b;

    /* JADX INFO: renamed from: c */
    public final boolean f6220c;

    /* JADX INFO: renamed from: d */
    public final int f6221d;

    /* JADX INFO: renamed from: e */
    public final int f6222e;

    /* JADX INFO: renamed from: f */
    public final String f6223f;

    /* JADX INFO: renamed from: g */
    public final boolean f6224g;

    /* JADX INFO: renamed from: h */
    public final boolean f6225h;

    /* JADX INFO: renamed from: i */
    public final boolean f6226i;

    /* JADX INFO: renamed from: j */
    public final Bundle f6227j;

    /* JADX INFO: renamed from: k */
    public final boolean f6228k;

    /* JADX INFO: renamed from: l */
    public final int f6229l;

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentState$a */
    public class C0934a implements Parcelable.Creator<FragmentState> {
        @Override // android.os.Parcelable.Creator
        public final FragmentState createFromParcel(Parcel parcel) {
            return new FragmentState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final FragmentState[] newArray(int i10) {
            return new FragmentState[i10];
        }
    }

    public FragmentState(Parcel parcel) {
        this.f6218a = parcel.readString();
        this.f6219b = parcel.readString();
        boolean z10 = true;
        this.f6220c = parcel.readInt() != 0;
        this.f6221d = parcel.readInt();
        this.f6222e = parcel.readInt();
        this.f6223f = parcel.readString();
        this.f6224g = parcel.readInt() != 0;
        this.f6225h = parcel.readInt() != 0;
        this.f6226i = parcel.readInt() != 0;
        this.f6227j = parcel.readBundle();
        this.f6228k = parcel.readInt() == 0 ? false : z10;
        this.f6217H = parcel.readBundle();
        this.f6229l = parcel.readInt();
    }

    public FragmentState(Fragment fragment) {
        this.f6218a = fragment.getClass().getName();
        this.f6219b = fragment.f6099f;
        this.f6220c = fragment.f6072J;
        this.f6221d = fragment.f6081S;
        this.f6222e = fragment.f6082T;
        this.f6223f = fragment.f6083U;
        this.f6224g = fragment.f6086X;
        this.f6225h = fragment.f6070H;
        this.f6226i = fragment.f6085W;
        this.f6227j = fragment.f6101g;
        this.f6228k = fragment.f6084V;
        this.f6229l = fragment.f6110k0.ordinal();
    }

    /* JADX INFO: renamed from: a */
    public final Fragment m3681a(C0985w c0985w, ClassLoader classLoader) {
        Fragment fragmentMo3674a = c0985w.mo3674a(this.f6218a);
        Bundle bundle = this.f6227j;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentMo3674a.m3583e0(bundle);
        fragmentMo3674a.f6099f = this.f6219b;
        fragmentMo3674a.f6072J = this.f6220c;
        fragmentMo3674a.f6074L = true;
        fragmentMo3674a.f6081S = this.f6221d;
        fragmentMo3674a.f6082T = this.f6222e;
        fragmentMo3674a.f6083U = this.f6223f;
        fragmentMo3674a.f6086X = this.f6224g;
        fragmentMo3674a.f6070H = this.f6225h;
        fragmentMo3674a.f6085W = this.f6226i;
        fragmentMo3674a.f6084V = this.f6228k;
        fragmentMo3674a.f6110k0 = Lifecycle.State.values()[this.f6229l];
        Bundle bundle2 = this.f6217H;
        if (bundle2 != null) {
            fragmentMo3674a.f6091b = bundle2;
        } else {
            fragmentMo3674a.f6091b = new Bundle();
        }
        return fragmentMo3674a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(BuildConfig.SDK_TRUNCATE_LENGTH);
        sb2.append("FragmentState{");
        sb2.append(this.f6218a);
        sb2.append(" (");
        sb2.append(this.f6219b);
        sb2.append(")}:");
        if (this.f6220c) {
            sb2.append(" fromLayout");
        }
        int i10 = this.f6222e;
        if (i10 != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(i10));
        }
        String str = this.f6223f;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(str);
        }
        if (this.f6224g) {
            sb2.append(" retainInstance");
        }
        if (this.f6225h) {
            sb2.append(" removing");
        }
        if (this.f6226i) {
            sb2.append(" detached");
        }
        if (this.f6228k) {
            sb2.append(" hidden");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f6218a);
        parcel.writeString(this.f6219b);
        parcel.writeInt(this.f6220c ? 1 : 0);
        parcel.writeInt(this.f6221d);
        parcel.writeInt(this.f6222e);
        parcel.writeString(this.f6223f);
        parcel.writeInt(this.f6224g ? 1 : 0);
        parcel.writeInt(this.f6225h ? 1 : 0);
        parcel.writeInt(this.f6226i ? 1 : 0);
        parcel.writeBundle(this.f6227j);
        parcel.writeInt(this.f6228k ? 1 : 0);
        parcel.writeBundle(this.f6217H);
        parcel.writeInt(this.f6229l);
    }
}
