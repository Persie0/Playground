package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.C0166e;
import com.android.installreferrer.api.InstallReferrerClient;
import dm.C5207g;
import kotlin.Metadata;
import p081e0.C5310f1;
import p081e0.C5314h0;
import p081e0.C5334r0;
import p081e0.C5348y0;
import p081e0.InterfaceC5350z0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m13364d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003¨\u0006\u0004"}, m13365d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Le0/y0;", "Landroid/os/Parcelable;", "runtime_release"}, m13366k = 1, m13367mv = {1, 8, InstallReferrerClient.InstallReferrerResponse.f10530OK})
@SuppressLint({"BanParcelableUsage"})
public final class ParcelableSnapshotMutableState<T> extends C5348y0<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new C0469a();

    /* JADX INFO: renamed from: androidx.compose.runtime.ParcelableSnapshotMutableState$a */
    public static final class C0469a implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        /* JADX INFO: renamed from: a */
        public static ParcelableSnapshotMutableState m1703a(Parcel parcel, ClassLoader classLoader) {
            InterfaceC5350z0 interfaceC5350z0;
            C5207g.m11111f(parcel, "parcel");
            if (classLoader == null) {
                classLoader = C0469a.class.getClassLoader();
            }
            Object value = parcel.readValue(classLoader);
            int i10 = parcel.readInt();
            if (i10 == 0) {
                interfaceC5350z0 = C5314h0.f33585a;
            } else if (i10 == 1) {
                interfaceC5350z0 = C5310f1.f33583a;
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException(C0166e.m762h("Unsupported MutableState policy ", i10, " was restored"));
                }
                interfaceC5350z0 = C5334r0.f33610a;
            }
            return new ParcelableSnapshotMutableState(value, interfaceC5350z0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            C5207g.m11111f(parcel, "parcel");
            return m1703a(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* bridge */ /* synthetic */ ParcelableSnapshotMutableState<Object> createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return m1703a(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i10) {
            return new ParcelableSnapshotMutableState[i10];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ParcelableSnapshotMutableState(T t10, InterfaceC5350z0<T> interfaceC5350z0) {
        super(t10, interfaceC5350z0);
        C5207g.m11111f(interfaceC5350z0, "policy");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int i11;
        C5207g.m11111f(parcel, "parcel");
        parcel.writeValue(getValue());
        C5314h0 c5314h0 = C5314h0.f33585a;
        InterfaceC5350z0<T> interfaceC5350z0 = this.f33648a;
        if (C5207g.m11106a(interfaceC5350z0, c5314h0)) {
            i11 = 0;
        } else if (C5207g.m11106a(interfaceC5350z0, C5310f1.f33583a)) {
            i11 = 1;
        } else {
            if (!C5207g.m11106a(interfaceC5350z0, C5334r0.f33610a)) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i11 = 2;
        }
        parcel.writeInt(i11);
    }
}
