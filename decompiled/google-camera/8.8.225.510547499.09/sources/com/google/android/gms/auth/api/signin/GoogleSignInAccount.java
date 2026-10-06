package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p000.C0870ob;
import p000.jij;
import p000.jiy;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class GoogleSignInAccount extends jij implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new C0870ob(18);

    /* JADX INFO: renamed from: a */
    final int f7557a;

    /* JADX INFO: renamed from: b */
    public final String f7558b;

    /* JADX INFO: renamed from: c */
    public final String f7559c;

    /* JADX INFO: renamed from: d */
    public final String f7560d;

    /* JADX INFO: renamed from: e */
    public final String f7561e;

    /* JADX INFO: renamed from: f */
    public final Uri f7562f;

    /* JADX INFO: renamed from: g */
    public String f7563g;

    /* JADX INFO: renamed from: h */
    public final long f7564h;

    /* JADX INFO: renamed from: i */
    public final String f7565i;

    /* JADX INFO: renamed from: j */
    public final List f7566j;

    /* JADX INFO: renamed from: k */
    public final String f7567k;

    /* JADX INFO: renamed from: l */
    public final String f7568l;

    /* JADX INFO: renamed from: m */
    private final Set f7569m = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List list, String str7, String str8) {
        this.f7557a = i;
        this.f7558b = str;
        this.f7559c = str2;
        this.f7560d = str3;
        this.f7561e = str4;
        this.f7562f = uri;
        this.f7563g = str5;
        this.f7564h = j;
        this.f7565i = str6;
        this.f7566j = list;
        this.f7567k = str7;
        this.f7568l = str8;
    }

    /* JADX INFO: renamed from: a */
    public final Set m4636a() {
        HashSet hashSet = new HashSet(this.f7566j);
        hashSet.addAll(this.f7569m);
        return hashSet;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f7565i.equals(this.f7565i) && googleSignInAccount.m4636a().equals(m4636a());
    }

    public final int hashCode() {
        return ((this.f7565i.hashCode() + 527) * 31) + m4636a().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f7557a);
        jiy.m13296w(parcel, 2, this.f7558b);
        jiy.m13296w(parcel, 3, this.f7559c);
        jiy.m13296w(parcel, 4, this.f7560d);
        jiy.m13296w(parcel, 5, this.f7561e);
        jiy.m13295v(parcel, 6, this.f7562f, i);
        jiy.m13296w(parcel, 7, this.f7563g);
        jiy.m13288o(parcel, 8, this.f7564h);
        jiy.m13296w(parcel, 9, this.f7565i);
        jiy.m13239A(parcel, 10, this.f7566j);
        jiy.m13296w(parcel, 11, this.f7567k);
        jiy.m13296w(parcel, 12, this.f7568l);
        jiy.m13283j(parcel, iM13281h);
    }
}
