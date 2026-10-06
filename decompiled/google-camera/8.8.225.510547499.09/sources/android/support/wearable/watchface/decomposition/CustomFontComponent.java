package android.support.wearable.watchface.decomposition;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CustomFontComponent extends BaseComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: android.support.wearable.watchface.decomposition.CustomFontComponent.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new CustomFontComponent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new CustomFontComponent[i];
        }
    };

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public class Builder extends BaseComponent.BaseBuilder {

        /* JADX INFO: renamed from: android.support.wearable.watchface.decomposition.CustomFontComponent$Builder$1 */
        /* JADX INFO: compiled from: PG */
        class C00271 implements BaseComponent.ComponentFactory {
        }
    }

    public CustomFontComponent(Parcel parcel) {
        super(parcel.readBundle());
        this.f1404a.setClassLoader(getClass().getClassLoader());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f1404a);
    }
}
