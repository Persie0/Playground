package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.view.Lifecycle;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
final class BackStackRecordState implements Parcelable {
    public static final Parcelable.Creator<BackStackRecordState> CREATOR = new C0906a();

    /* JADX INFO: renamed from: H */
    public final ArrayList<String> f6053H;

    /* JADX INFO: renamed from: I */
    public final boolean f6054I;

    /* JADX INFO: renamed from: a */
    public final int[] f6055a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<String> f6056b;

    /* JADX INFO: renamed from: c */
    public final int[] f6057c;

    /* JADX INFO: renamed from: d */
    public final int[] f6058d;

    /* JADX INFO: renamed from: e */
    public final int f6059e;

    /* JADX INFO: renamed from: f */
    public final String f6060f;

    /* JADX INFO: renamed from: g */
    public final int f6061g;

    /* JADX INFO: renamed from: h */
    public final int f6062h;

    /* JADX INFO: renamed from: i */
    public final CharSequence f6063i;

    /* JADX INFO: renamed from: j */
    public final int f6064j;

    /* JADX INFO: renamed from: k */
    public final CharSequence f6065k;

    /* JADX INFO: renamed from: l */
    public final ArrayList<String> f6066l;

    /* JADX INFO: renamed from: androidx.fragment.app.BackStackRecordState$a */
    public class C0906a implements Parcelable.Creator<BackStackRecordState> {
        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState createFromParcel(Parcel parcel) {
            return new BackStackRecordState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final BackStackRecordState[] newArray(int i10) {
            return new BackStackRecordState[i10];
        }
    }

    public BackStackRecordState(Parcel parcel) {
        this.f6055a = parcel.createIntArray();
        this.f6056b = parcel.createStringArrayList();
        this.f6057c = parcel.createIntArray();
        this.f6058d = parcel.createIntArray();
        this.f6059e = parcel.readInt();
        this.f6060f = parcel.readString();
        this.f6061g = parcel.readInt();
        this.f6062h = parcel.readInt();
        this.f6063i = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f6064j = parcel.readInt();
        this.f6065k = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f6066l = parcel.createStringArrayList();
        this.f6053H = parcel.createStringArrayList();
        this.f6054I = parcel.readInt() != 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    public BackStackRecordState(C0940a c0940a) {
        int size = c0940a.f6344a.size();
        this.f6055a = new int[size * 6];
        if (!c0940a.f6350g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f6056b = new ArrayList<>(size);
        this.f6057c = new int[size];
        this.f6058d = new int[size];
        int i10 = 0;
        int i11 = 0;
        while (i10 < size) {
            AbstractC0963l0.a aVar = c0940a.f6344a.get(i10);
            int i12 = i11 + 1;
            this.f6055a[i11] = aVar.f6360a;
            ArrayList<String> arrayList = this.f6056b;
            Fragment fragment = aVar.f6361b;
            arrayList.add(fragment != null ? fragment.f6099f : null);
            int[] iArr = this.f6055a;
            int i13 = i12 + 1;
            iArr[i12] = aVar.f6362c ? 1 : 0;
            int i14 = i13 + 1;
            iArr[i13] = aVar.f6363d;
            int i15 = i14 + 1;
            iArr[i14] = aVar.f6364e;
            int i16 = i15 + 1;
            iArr[i15] = aVar.f6365f;
            iArr[i16] = aVar.f6366g;
            this.f6057c[i10] = aVar.f6367h.ordinal();
            this.f6058d[i10] = aVar.f6368i.ordinal();
            i10++;
            i11 = i16 + 1;
        }
        this.f6059e = c0940a.f6349f;
        this.f6060f = c0940a.f6352i;
        this.f6061g = c0940a.f6252s;
        this.f6062h = c0940a.f6353j;
        this.f6063i = c0940a.f6354k;
        this.f6064j = c0940a.f6355l;
        this.f6065k = c0940a.f6356m;
        this.f6066l = c0940a.f6357n;
        this.f6053H = c0940a.f6358o;
        this.f6054I = c0940a.f6359p;
    }

    /* JADX INFO: renamed from: a */
    public final void m3555a(C0940a c0940a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f6055a;
            boolean z10 = true;
            if (i10 >= iArr.length) {
                c0940a.f6349f = this.f6059e;
                c0940a.f6352i = this.f6060f;
                c0940a.f6350g = true;
                c0940a.f6353j = this.f6062h;
                c0940a.f6354k = this.f6063i;
                c0940a.f6355l = this.f6064j;
                c0940a.f6356m = this.f6065k;
                c0940a.f6357n = this.f6066l;
                c0940a.f6358o = this.f6053H;
                c0940a.f6359p = this.f6054I;
                return;
            }
            AbstractC0963l0.a aVar = new AbstractC0963l0.a();
            int i12 = i10 + 1;
            aVar.f6360a = iArr[i10];
            if (FragmentManager.m3608K(2)) {
                Log.v("FragmentManager", "Instantiate " + c0940a + " op #" + i11 + " base fragment #" + iArr[i12]);
            }
            aVar.f6367h = Lifecycle.State.values()[this.f6057c[i11]];
            aVar.f6368i = Lifecycle.State.values()[this.f6058d[i11]];
            int i13 = i12 + 1;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f6362c = z10;
            int i14 = i13 + 1;
            int i15 = iArr[i13];
            aVar.f6363d = i15;
            int i16 = i14 + 1;
            int i17 = iArr[i14];
            aVar.f6364e = i17;
            int i18 = i16 + 1;
            int i19 = iArr[i16];
            aVar.f6365f = i19;
            int i20 = iArr[i18];
            aVar.f6366g = i20;
            c0940a.f6345b = i15;
            c0940a.f6346c = i17;
            c0940a.f6347d = i19;
            c0940a.f6348e = i20;
            c0940a.m3774c(aVar);
            i11++;
            i10 = i18 + 1;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f6055a);
        parcel.writeStringList(this.f6056b);
        parcel.writeIntArray(this.f6057c);
        parcel.writeIntArray(this.f6058d);
        parcel.writeInt(this.f6059e);
        parcel.writeString(this.f6060f);
        parcel.writeInt(this.f6061g);
        parcel.writeInt(this.f6062h);
        TextUtils.writeToParcel(this.f6063i, parcel, 0);
        parcel.writeInt(this.f6064j);
        TextUtils.writeToParcel(this.f6065k, parcel, 0);
        parcel.writeStringList(this.f6066l);
        parcel.writeStringList(this.f6053H);
        parcel.writeInt(this.f6054I ? 1 : 0);
    }
}
