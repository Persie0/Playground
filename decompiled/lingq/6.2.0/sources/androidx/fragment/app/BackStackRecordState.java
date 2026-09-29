package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.Lifecycle$State;
import java.util.ArrayList;
import p000.C3386nv;
import p000.g70;
import p000.vf3;

/* JADX INFO: loaded from: classes.dex */
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C0633a(0);

    /* JADX INFO: renamed from: H */
    public final ArrayList f5598H;

    /* JADX INFO: renamed from: I */
    public final boolean f5599I;

    /* JADX INFO: renamed from: a */
    public final int[] f5600a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f5601b;

    /* JADX INFO: renamed from: c */
    public final int[] f5602c;

    /* JADX INFO: renamed from: d */
    public final int[] f5603d;

    /* JADX INFO: renamed from: e */
    public final int f5604e;

    /* JADX INFO: renamed from: f */
    public final String f5605f;

    /* JADX INFO: renamed from: g */
    public final int f5606g;

    /* JADX INFO: renamed from: h */
    public final int f5607h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f5608i;

    /* JADX INFO: renamed from: j */
    public final int f5609j;

    /* JADX INFO: renamed from: k */
    public final CharSequence f5610k;

    /* JADX INFO: renamed from: l */
    public final ArrayList f5611l;

    public BackStackRecordState(g70 g70Var) {
        int size = g70Var.f40287a.size();
        this.f5600a = new int[size * 6];
        if (!g70Var.f40293g) {
            C3386nv.m17633t("Not on back stack");
            throw null;
        }
        this.f5601b = new ArrayList(size);
        this.f5602c = new int[size];
        this.f5603d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            vf3 vf3Var = (vf3) g70Var.f40287a.get(i2);
            int i3 = i + 1;
            this.f5600a[i] = vf3Var.f65304a;
            ArrayList arrayList = this.f5601b;
            AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = vf3Var.f65305b;
            arrayList.add(abstractComponentCallbacksC0635c != null ? abstractComponentCallbacksC0635c.f5693e : null);
            int[] iArr = this.f5600a;
            iArr[i3] = vf3Var.f65306c ? 1 : 0;
            iArr[i + 2] = vf3Var.f65307d;
            iArr[i + 3] = vf3Var.f65308e;
            int i4 = i + 5;
            iArr[i + 4] = vf3Var.f65309f;
            i += 6;
            iArr[i4] = vf3Var.f65310g;
            this.f5602c[i2] = vf3Var.f65311h.ordinal();
            this.f5603d[i2] = vf3Var.f65312i.ordinal();
        }
        this.f5604e = g70Var.f40292f;
        this.f5605f = g70Var.f40295i;
        this.f5606g = g70Var.f40306t;
        this.f5607h = g70Var.f40296j;
        this.f5608i = g70Var.f40297k;
        this.f5609j = g70Var.f40298l;
        this.f5610k = g70Var.f40299m;
        this.f5611l = g70Var.f40300n;
        this.f5598H = g70Var.f40301o;
        this.f5599I = g70Var.f40302p;
    }

    /* JADX INFO: renamed from: a */
    public final void m2062a(g70 g70Var) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int[] iArr = this.f5600a;
            boolean z = true;
            if (i >= iArr.length) {
                g70Var.f40292f = this.f5604e;
                g70Var.f40295i = this.f5605f;
                g70Var.f40293g = true;
                g70Var.f40296j = this.f5607h;
                g70Var.f40297k = this.f5608i;
                g70Var.f40298l = this.f5609j;
                g70Var.f40299m = this.f5610k;
                g70Var.f40300n = this.f5611l;
                g70Var.f40301o = this.f5598H;
                g70Var.f40302p = this.f5599I;
                return;
            }
            vf3 vf3Var = new vf3();
            int i3 = i + 1;
            vf3Var.f65304a = iArr[i];
            if (AbstractC0638f.m2128L(2)) {
                Log.v("FragmentManager", "Instantiate " + g70Var + " op #" + i2 + " base fragment #" + iArr[i3]);
            }
            vf3Var.f65311h = Lifecycle$State.values()[this.f5602c[i2]];
            vf3Var.f65312i = Lifecycle$State.values()[this.f5603d[i2]];
            int i4 = i + 2;
            if (iArr[i3] == 0) {
                z = false;
            }
            vf3Var.f65306c = z;
            int i5 = iArr[i4];
            vf3Var.f65307d = i5;
            int i6 = iArr[i + 3];
            vf3Var.f65308e = i6;
            int i7 = i + 5;
            int i8 = iArr[i + 4];
            vf3Var.f65309f = i8;
            i += 6;
            int i9 = iArr[i7];
            vf3Var.f65310g = i9;
            g70Var.f40288b = i5;
            g70Var.f40289c = i6;
            g70Var.f40290d = i8;
            g70Var.f40291e = i9;
            g70Var.m12392b(vf3Var);
            i2++;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f5600a);
        parcel.writeStringList(this.f5601b);
        parcel.writeIntArray(this.f5602c);
        parcel.writeIntArray(this.f5603d);
        parcel.writeInt(this.f5604e);
        parcel.writeString(this.f5605f);
        parcel.writeInt(this.f5606g);
        parcel.writeInt(this.f5607h);
        TextUtils.writeToParcel(this.f5608i, parcel, 0);
        parcel.writeInt(this.f5609j);
        TextUtils.writeToParcel(this.f5610k, parcel, 0);
        parcel.writeStringList(this.f5611l);
        parcel.writeStringList(this.f5598H);
        parcel.writeInt(this.f5599I ? 1 : 0);
    }

    public BackStackRecordState(Parcel parcel) {
        this.f5600a = parcel.createIntArray();
        this.f5601b = parcel.createStringArrayList();
        this.f5602c = parcel.createIntArray();
        this.f5603d = parcel.createIntArray();
        this.f5604e = parcel.readInt();
        this.f5605f = parcel.readString();
        this.f5606g = parcel.readInt();
        this.f5607h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f5608i = (CharSequence) creator.createFromParcel(parcel);
        this.f5609j = parcel.readInt();
        this.f5610k = (CharSequence) creator.createFromParcel(parcel);
        this.f5611l = parcel.createStringArrayList();
        this.f5598H = parcel.createStringArrayList();
        this.f5599I = parcel.readInt() != 0;
    }
}
