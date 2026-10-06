package p000;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jic extends jij {
    public static final Parcelable.Creator CREATOR = new jie(1);

    /* JADX INFO: renamed from: a */
    final int f34109a;

    /* JADX INFO: renamed from: b */
    public final Account f34110b;

    /* JADX INFO: renamed from: c */
    public final int f34111c;

    /* JADX INFO: renamed from: d */
    public final GoogleSignInAccount f34112d;

    public jic(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f34109a = i;
        this.f34110b = account;
        this.f34111c = i2;
        this.f34112d = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34109a);
        jiy.m13295v(parcel, 2, this.f34110b, i);
        jiy.m13287n(parcel, 3, this.f34111c);
        jiy.m13295v(parcel, 4, this.f34112d, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
