package android.support.wearable.watchface.decomposition;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class FontComponent extends BaseComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: android.support.wearable.watchface.decomposition.FontComponent.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new FontComponent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new FontComponent[i];
        }
    };

    /* JADX INFO: compiled from: PG */
    public class Builder extends BaseComponent.BaseBuilder {

        /* JADX INFO: renamed from: android.support.wearable.watchface.decomposition.FontComponent$Builder$1 */
        /* JADX INFO: compiled from: PG */
        class C00311 implements BaseComponent.ComponentFactory {
        }
    }

    public FontComponent(Parcel parcel) {
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
