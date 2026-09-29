package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle$State;
import p000.de3;

/* JADX INFO: loaded from: classes.dex */
final class FragmentState implements Parcelable {
    public static final Parcelable.Creator<FragmentState> CREATOR = new C0633a(4);

    /* JADX INFO: renamed from: H */
    public final String f5639H;

    /* JADX INFO: renamed from: I */
    public final int f5640I;

    /* JADX INFO: renamed from: J */
    public final boolean f5641J;

    /* JADX INFO: renamed from: a */
    public final String f5642a;

    /* JADX INFO: renamed from: b */
    public final String f5643b;

    /* JADX INFO: renamed from: c */
    public final boolean f5644c;

    /* JADX INFO: renamed from: d */
    public final boolean f5645d;

    /* JADX INFO: renamed from: e */
    public final int f5646e;

    /* JADX INFO: renamed from: f */
    public final int f5647f;

    /* JADX INFO: renamed from: g */
    public final String f5648g;

    /* JADX INFO: renamed from: h */
    public final boolean f5649h;

    /* JADX INFO: renamed from: i */
    public final boolean f5650i;

    /* JADX INFO: renamed from: j */
    public final boolean f5651j;

    /* JADX INFO: renamed from: k */
    public final boolean f5652k;

    /* JADX INFO: renamed from: l */
    public final int f5653l;

    public FragmentState(Parcel parcel) {
        this.f5642a = parcel.readString();
        this.f5643b = parcel.readString();
        this.f5644c = parcel.readInt() != 0;
        this.f5645d = parcel.readInt() != 0;
        this.f5646e = parcel.readInt();
        this.f5647f = parcel.readInt();
        this.f5648g = parcel.readString();
        this.f5649h = parcel.readInt() != 0;
        this.f5650i = parcel.readInt() != 0;
        this.f5651j = parcel.readInt() != 0;
        this.f5652k = parcel.readInt() != 0;
        this.f5653l = parcel.readInt();
        this.f5639H = parcel.readString();
        this.f5640I = parcel.readInt();
        this.f5641J = parcel.readInt() != 0;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC0635c m2064a(de3 de3Var) {
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635cM10309a = de3Var.m10309a(this.f5642a);
        abstractComponentCallbacksC0635cM10309a.f5693e = this.f5643b;
        abstractComponentCallbacksC0635cM10309a.f5668J = this.f5644c;
        abstractComponentCallbacksC0635cM10309a.f5670L = this.f5645d;
        abstractComponentCallbacksC0635cM10309a.f5671M = true;
        abstractComponentCallbacksC0635cM10309a.f5678T = this.f5646e;
        abstractComponentCallbacksC0635cM10309a.f5679U = this.f5647f;
        abstractComponentCallbacksC0635cM10309a.f5680V = this.f5648g;
        abstractComponentCallbacksC0635cM10309a.f5683Y = this.f5649h;
        abstractComponentCallbacksC0635cM10309a.f5707l = this.f5650i;
        abstractComponentCallbacksC0635cM10309a.f5682X = this.f5651j;
        abstractComponentCallbacksC0635cM10309a.f5681W = this.f5652k;
        abstractComponentCallbacksC0635cM10309a.f5708l0 = Lifecycle$State.values()[this.f5653l];
        abstractComponentCallbacksC0635cM10309a.f5699h = this.f5639H;
        abstractComponentCallbacksC0635cM10309a.f5701i = this.f5640I;
        abstractComponentCallbacksC0635cM10309a.f5696f0 = this.f5641J;
        return abstractComponentCallbacksC0635cM10309a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f5642a);
        sb.append(" (");
        sb.append(this.f5643b);
        sb.append(")}:");
        if (this.f5644c) {
            sb.append(" fromLayout");
        }
        if (this.f5645d) {
            sb.append(" dynamicContainer");
        }
        int i = this.f5647f;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f5648g;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f5649h) {
            sb.append(" retainInstance");
        }
        if (this.f5650i) {
            sb.append(" removing");
        }
        if (this.f5651j) {
            sb.append(" detached");
        }
        if (this.f5652k) {
            sb.append(" hidden");
        }
        String str2 = this.f5639H;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f5640I);
        }
        if (this.f5641J) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f5642a);
        parcel.writeString(this.f5643b);
        parcel.writeInt(this.f5644c ? 1 : 0);
        parcel.writeInt(this.f5645d ? 1 : 0);
        parcel.writeInt(this.f5646e);
        parcel.writeInt(this.f5647f);
        parcel.writeString(this.f5648g);
        parcel.writeInt(this.f5649h ? 1 : 0);
        parcel.writeInt(this.f5650i ? 1 : 0);
        parcel.writeInt(this.f5651j ? 1 : 0);
        parcel.writeInt(this.f5652k ? 1 : 0);
        parcel.writeInt(this.f5653l);
        parcel.writeString(this.f5639H);
        parcel.writeInt(this.f5640I);
        parcel.writeInt(this.f5641J ? 1 : 0);
    }

    public FragmentState(AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        this.f5642a = abstractComponentCallbacksC0635c.getClass().getName();
        this.f5643b = abstractComponentCallbacksC0635c.f5693e;
        this.f5644c = abstractComponentCallbacksC0635c.f5668J;
        this.f5645d = abstractComponentCallbacksC0635c.f5670L;
        this.f5646e = abstractComponentCallbacksC0635c.f5678T;
        this.f5647f = abstractComponentCallbacksC0635c.f5679U;
        this.f5648g = abstractComponentCallbacksC0635c.f5680V;
        this.f5649h = abstractComponentCallbacksC0635c.f5683Y;
        this.f5650i = abstractComponentCallbacksC0635c.f5707l;
        this.f5651j = abstractComponentCallbacksC0635c.f5682X;
        this.f5652k = abstractComponentCallbacksC0635c.f5681W;
        this.f5653l = abstractComponentCallbacksC0635c.f5708l0.ordinal();
        this.f5639H = abstractComponentCallbacksC0635c.f5699h;
        this.f5640I = abstractComponentCallbacksC0635c.f5701i;
        this.f5641J = abstractComponentCallbacksC0635c.f5696f0;
    }
}
