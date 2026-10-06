package p000;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jle extends jku {
    public static final Parcelable.Creator CREATOR = new jie(14);

    /* JADX INFO: renamed from: a */
    public final String f34284a;

    /* JADX INFO: renamed from: b */
    public final int f34285b;

    /* JADX INFO: renamed from: c */
    public final boolean f34286c;

    /* JADX INFO: renamed from: d */
    public final String f34287d;

    /* JADX INFO: renamed from: e */
    public final int f34288e;

    /* JADX INFO: renamed from: f */
    public final Uri f34289f;

    /* JADX INFO: renamed from: g */
    public final jlf f34290g;

    /* JADX INFO: renamed from: h */
    public final long f34291h;

    /* JADX INFO: renamed from: i */
    public final Uri f34292i;

    /* JADX INFO: renamed from: j */
    public final jlg f34293j;

    /* JADX INFO: renamed from: k */
    public final Uri f34294k;

    /* JADX INFO: renamed from: l */
    private final byte[] f34295l;

    public jle(String str, int i, boolean z, String str2, int i2, Uri uri, jlf jlfVar, long j, Uri uri2, jlg jlgVar, byte[] bArr, Uri uri3) {
        boolean z2 = true;
        lku.m15669w(!str.isEmpty());
        lku.m15669w(i != 0);
        if (uri != null && str2 == null) {
            lku.m15669w(i2 == 3);
            uri2.getClass();
            jlgVar.getClass();
            uri3.getClass();
        } else {
            if (uri != null || str2 == null) {
                if (uri != null) {
                    throw new IllegalArgumentException("cannot call both #setFederatedOptions and #setPersonalizedOptions");
                }
                throw new IllegalArgumentException("must call exactly one of #setFederatedOptions or #setPersonalizedOptions");
            }
            lku.m15669w(!str2.isEmpty());
            switch (i2) {
                case 0:
                case 1:
                case 2:
                case 3:
                    break;
                default:
                    z2 = false;
                    break;
            }
            lku.m15669w(z2);
        }
        this.f34284a = str;
        this.f34285b = i;
        this.f34286c = z;
        this.f34287d = str2;
        this.f34288e = i2;
        this.f34289f = uri;
        this.f34292i = uri2;
        this.f34290g = jlfVar;
        this.f34291h = j;
        this.f34293j = jlgVar;
        this.f34295l = bArr == null ? new byte[0] : bArr;
        this.f34294k = uri3;
    }

    /* JADX INFO: renamed from: a */
    public static jld m13339a() {
        return new jld();
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m13340b() {
        byte[] bArr = this.f34295l;
        return Arrays.copyOf(bArr, bArr.length);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jle)) {
            return false;
        }
        jle jleVar = (jle) obj;
        return mpw.m16768g(this.f34284a, jleVar.f34284a) && this.f34285b == jleVar.f34285b && this.f34286c == jleVar.f34286c && mpw.m16768g(this.f34287d, jleVar.f34287d) && this.f34288e == jleVar.f34288e && mpw.m16768g(this.f34289f, jleVar.f34289f) && mpw.m16768g(this.f34292i, jleVar.f34292i) && mpw.m16768g(this.f34290g, jleVar.f34290g) && this.f34291h == jleVar.f34291h && mpw.m16768g(this.f34293j, jleVar.f34293j) && Arrays.equals(this.f34295l, jleVar.f34295l) && mpw.m16768g(this.f34294k, jleVar.f34294k);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34284a, Integer.valueOf(this.f34285b), Boolean.valueOf(this.f34286c), this.f34287d, Integer.valueOf(this.f34288e), this.f34289f, this.f34292i, this.f34290g, Long.valueOf(this.f34291h), this.f34293j, Integer.valueOf(Arrays.hashCode(this.f34295l)), this.f34294k});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13296w(parcel, 1, this.f34284a);
        jiy.m13287n(parcel, 2, this.f34285b);
        jiy.m13284k(parcel, 3, this.f34286c);
        jiy.m13296w(parcel, 4, this.f34287d);
        jiy.m13287n(parcel, 5, this.f34288e);
        jiy.m13295v(parcel, 6, this.f34289f, i);
        jiy.m13295v(parcel, 9, this.f34290g, i);
        jiy.m13288o(parcel, 10, this.f34291h);
        jiy.m13295v(parcel, 11, this.f34292i, i);
        jiy.m13295v(parcel, 12, this.f34293j, i);
        jiy.m13290q(parcel, 13, m13340b());
        jiy.m13295v(parcel, 14, this.f34294k, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
