package p448w4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;
import p003a2.C0009a;
import p326q.C8446b;

/* JADX INFO: renamed from: w4.b */
/* JADX INFO: loaded from: classes.dex */
public final class C9811b extends VersionedParcel {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f49940d;

    /* JADX INFO: renamed from: e */
    public final Parcel f49941e;

    /* JADX INFO: renamed from: f */
    public final int f49942f;

    /* JADX INFO: renamed from: g */
    public final int f49943g;

    /* JADX INFO: renamed from: h */
    public final String f49944h;

    /* JADX INFO: renamed from: i */
    public int f49945i;

    /* JADX INFO: renamed from: j */
    public int f49946j;

    /* JADX INFO: renamed from: k */
    public int f49947k;

    public C9811b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C8446b(), new C8446b(), new C8446b());
    }

    public C9811b(Parcel parcel, int i10, int i11, String str, C8446b<String, Method> c8446b, C8446b<String, Method> c8446b2, C8446b<String, Class> c8446b3) {
        super(c8446b, c8446b2, c8446b3);
        this.f49940d = new SparseIntArray();
        this.f49945i = -1;
        this.f49947k = -1;
        this.f49941e = parcel;
        this.f49942f = i10;
        this.f49943g = i11;
        this.f49946j = i10;
        this.f49944h = str;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: a */
    public final C9811b mo4617a() {
        Parcel parcel = this.f49941e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f49946j;
        if (i10 == this.f49942f) {
            i10 = this.f49943g;
        }
        return new C9811b(parcel, iDataPosition, i10, C0009a.m23l(new StringBuilder(), this.f49944h, "  "), this.f7631a, this.f7632b, this.f7633c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: e */
    public final boolean mo4621e() {
        return this.f49941e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: f */
    public final byte[] mo4622f() {
        Parcel parcel = this.f49941e;
        int i10 = parcel.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        parcel.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: g */
    public final CharSequence mo4623g() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f49941e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: h */
    public final boolean mo4624h(int i10) {
        while (this.f49946j < this.f49943g) {
            int i11 = this.f49947k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            int i12 = this.f49946j;
            Parcel parcel = this.f49941e;
            parcel.setDataPosition(i12);
            int i13 = parcel.readInt();
            this.f49947k = parcel.readInt();
            this.f49946j += i13;
        }
        return this.f49947k == i10;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: i */
    public final int mo4625i() {
        return this.f49941e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: k */
    public final <T extends Parcelable> T mo4627k() {
        return (T) this.f49941e.readParcelable(C9811b.class.getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: m */
    public final String mo4629m() {
        return this.f49941e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: o */
    public final void mo4631o(int i10) {
        m18291x();
        this.f49945i = i10;
        this.f49940d.put(i10, this.f49941e.dataPosition());
        mo4635s(0);
        mo4635s(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: p */
    public final void mo4632p(boolean z10) {
        this.f49941e.writeInt(z10 ? 1 : 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: q */
    public final void mo4633q(byte[] bArr) {
        Parcel parcel = this.f49941e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            parcel.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: r */
    public final void mo4634r(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f49941e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: s */
    public final void mo4635s(int i10) {
        this.f49941e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: u */
    public final void mo4637u(Parcelable parcelable) {
        this.f49941e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: v */
    public final void mo4638v(String str) {
        this.f49941e.writeString(str);
    }

    /* JADX INFO: renamed from: x */
    public final void m18291x() {
        int i10 = this.f49945i;
        if (i10 >= 0) {
            int i11 = this.f49940d.get(i10);
            Parcel parcel = this.f49941e;
            int iDataPosition = parcel.dataPosition();
            parcel.setDataPosition(i11);
            parcel.writeInt(iDataPosition - i11);
            parcel.setDataPosition(iDataPosition);
        }
    }
}
