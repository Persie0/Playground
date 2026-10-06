package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jpc extends jij {
    public static final Parcelable.Creator CREATOR = new jny(13);

    /* JADX INFO: renamed from: a */
    final int f34527a;

    /* JADX INFO: renamed from: b */
    public final jcu f34528b;

    /* JADX INFO: renamed from: c */
    public final jid f34529c;

    public jpc(int i, jcu jcuVar, jid jidVar) {
        this.f34527a = i;
        this.f34528b = jcuVar;
        this.f34529c = jidVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13287n(parcel, 1, this.f34527a);
        jiy.m13295v(parcel, 2, this.f34528b, i);
        jiy.m13295v(parcel, 3, this.f34529c, i);
        jiy.m13283j(parcel, iM13281h);
    }
}
