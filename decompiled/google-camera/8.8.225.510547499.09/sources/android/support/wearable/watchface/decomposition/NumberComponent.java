package android.support.wearable.watchface.decomposition;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class NumberComponent extends BaseDrawnComponent implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: android.support.wearable.watchface.decomposition.NumberComponent.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new NumberComponent(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new NumberComponent[i];
        }
    };

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes.dex */
    public class Builder extends BaseDrawnComponent.BaseDrawnBuilder {

        /* JADX INFO: renamed from: android.support.wearable.watchface.decomposition.NumberComponent$Builder$1 */
        /* JADX INFO: compiled from: PG */
        /* JADX INFO: loaded from: classes2.dex */
        class C00371 implements BaseComponent.ComponentFactory {
        }
    }

    public NumberComponent(Parcel parcel) {
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
