package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: renamed from: cu */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class C0115cu implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C0050aw(4);

    /* JADX INFO: renamed from: a */
    public final String f9567a;

    /* JADX INFO: renamed from: b */
    public final String f9568b;

    /* JADX INFO: renamed from: c */
    public final boolean f9569c;

    /* JADX INFO: renamed from: d */
    public final int f9570d;

    /* JADX INFO: renamed from: e */
    public final int f9571e;

    /* JADX INFO: renamed from: f */
    public final String f9572f;

    /* JADX INFO: renamed from: g */
    public final boolean f9573g;

    /* JADX INFO: renamed from: h */
    public final boolean f9574h;

    /* JADX INFO: renamed from: i */
    public final boolean f9575i;

    /* JADX INFO: renamed from: j */
    public final boolean f9576j;

    /* JADX INFO: renamed from: k */
    public final int f9577k;

    /* JADX INFO: renamed from: l */
    public final String f9578l;

    /* JADX INFO: renamed from: m */
    public final int f9579m;

    /* JADX INFO: renamed from: n */
    public final boolean f9580n;

    public C0115cu(Parcel parcel) {
        this.f9567a = parcel.readString();
        this.f9568b = parcel.readString();
        this.f9569c = parcel.readInt() != 0;
        this.f9570d = parcel.readInt();
        this.f9571e = parcel.readInt();
        this.f9572f = parcel.readString();
        this.f9573g = parcel.readInt() != 0;
        this.f9574h = parcel.readInt() != 0;
        this.f9575i = parcel.readInt() != 0;
        this.f9576j = parcel.readInt() != 0;
        this.f9577k = parcel.readInt();
        this.f9578l = parcel.readString();
        this.f9579m = parcel.readInt();
        this.f9580n = parcel.readInt() != 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f9567a);
        sb.append(" (");
        sb.append(this.f9568b);
        sb.append(")}:");
        if (this.f9569c) {
            sb.append(" fromLayout");
        }
        if (this.f9571e != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.f9571e));
        }
        String str = this.f9572f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(this.f9572f);
        }
        if (this.f9573g) {
            sb.append(" retainInstance");
        }
        if (this.f9574h) {
            sb.append(" removing");
        }
        if (this.f9575i) {
            sb.append(" detached");
        }
        if (this.f9576j) {
            sb.append(" hidden");
        }
        if (this.f9578l != null) {
            sb.append(" targetWho=");
            sb.append(this.f9578l);
            sb.append(" targetRequestCode=");
            sb.append(this.f9579m);
        }
        if (this.f9580n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f9567a);
        parcel.writeString(this.f9568b);
        parcel.writeInt(this.f9569c ? 1 : 0);
        parcel.writeInt(this.f9570d);
        parcel.writeInt(this.f9571e);
        parcel.writeString(this.f9572f);
        parcel.writeInt(this.f9573g ? 1 : 0);
        parcel.writeInt(this.f9574h ? 1 : 0);
        parcel.writeInt(this.f9575i ? 1 : 0);
        parcel.writeInt(this.f9576j ? 1 : 0);
        parcel.writeInt(this.f9577k);
        parcel.writeString(this.f9578l);
        parcel.writeInt(this.f9579m);
        parcel.writeInt(this.f9580n ? 1 : 0);
    }

    public C0115cu(ComponentCallbacksC0077bw componentCallbacksC0077bw) {
        this.f9567a = componentCallbacksC0077bw.getClass().getName();
        this.f9568b = componentCallbacksC0077bw.f4609k;
        this.f9569c = componentCallbacksC0077bw.f4618t;
        this.f9570d = componentCallbacksC0077bw.f4575C;
        this.f9571e = componentCallbacksC0077bw.f4576D;
        this.f9572f = componentCallbacksC0077bw.f4577E;
        this.f9573g = componentCallbacksC0077bw.f4580H;
        this.f9574h = componentCallbacksC0077bw.f4616r;
        this.f9575i = componentCallbacksC0077bw.f4579G;
        this.f9576j = componentCallbacksC0077bw.f4578F;
        this.f9577k = componentCallbacksC0077bw.f4594V.ordinal();
        this.f9578l = componentCallbacksC0077bw.f4612n;
        this.f9579m = componentCallbacksC0077bw.f4613o;
        this.f9580n = componentCallbacksC0077bw.f4588P;
    }
}
