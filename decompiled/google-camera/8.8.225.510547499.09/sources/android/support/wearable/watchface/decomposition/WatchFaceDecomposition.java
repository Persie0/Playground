package android.support.wearable.watchface.decomposition;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class WatchFaceDecomposition implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() { // from class: android.support.wearable.watchface.decomposition.WatchFaceDecomposition.1
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            return new WatchFaceDecomposition(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return new WatchFaceDecomposition[i];
        }
    };

    /* JADX INFO: renamed from: a */
    private final List f1414a;

    /* JADX INFO: renamed from: b */
    private final List f1415b;

    /* JADX INFO: renamed from: c */
    private final List f1416c;

    /* JADX INFO: renamed from: d */
    private final List f1417d;

    /* JADX INFO: renamed from: e */
    private final List f1418e;

    /* JADX INFO: renamed from: f */
    private final List f1419f;

    /* JADX INFO: renamed from: g */
    private final List f1420g;

    /* JADX INFO: renamed from: h */
    private final List f1421h;

    /* JADX INFO: renamed from: i */
    private final boolean f1422i;

    /* JADX INFO: renamed from: j */
    private final int f1423j;

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public class Builder {
        public Builder() {
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
            new ArrayList();
        }
    }

    /* JADX INFO: compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface ColorFormat {
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes2.dex */
    public interface Component {
    }

    /* JADX INFO: compiled from: PG */
    public interface DrawnComponent extends Component {
    }

    public WatchFaceDecomposition(Parcel parcel) {
        Bundle bundle = parcel.readBundle(getClass().getClassLoader());
        List parcelableArrayList = bundle.getParcelableArrayList("images");
        List parcelableArrayList2 = bundle.getParcelableArrayList("numbers");
        List parcelableArrayList3 = bundle.getParcelableArrayList("color_numbers");
        List parcelableArrayList4 = bundle.getParcelableArrayList("color_strings");
        List parcelableArrayList5 = bundle.getParcelableArrayList("date_times");
        List parcelableArrayList6 = bundle.getParcelableArrayList("fonts");
        List parcelableArrayList7 = bundle.getParcelableArrayList("custom_fonts");
        List parcelableArrayList8 = bundle.getParcelableArrayList("complications");
        this.f1414a = parcelableArrayList == null ? Collections.emptyList() : parcelableArrayList;
        this.f1415b = parcelableArrayList2 == null ? Collections.emptyList() : parcelableArrayList2;
        this.f1416c = parcelableArrayList3 == null ? Collections.emptyList() : parcelableArrayList3;
        this.f1417d = parcelableArrayList4 == null ? Collections.emptyList() : parcelableArrayList4;
        this.f1418e = parcelableArrayList5 == null ? Collections.emptyList() : parcelableArrayList5;
        this.f1419f = parcelableArrayList6 == null ? Collections.emptyList() : parcelableArrayList6;
        this.f1420g = parcelableArrayList7 == null ? Collections.emptyList() : parcelableArrayList7;
        this.f1421h = parcelableArrayList8 == null ? Collections.emptyList() : parcelableArrayList8;
        this.f1422i = bundle.getBoolean("convert_units");
        this.f1423j = bundle.getInt("color_format");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("images", new ArrayList<>(this.f1414a));
        bundle.putParcelableArrayList("numbers", new ArrayList<>(this.f1415b));
        bundle.putParcelableArrayList("color_numbers", new ArrayList<>(this.f1416c));
        bundle.putParcelableArrayList("color_strings", new ArrayList<>(this.f1417d));
        bundle.putParcelableArrayList("date_times", new ArrayList<>(this.f1418e));
        bundle.putParcelableArrayList("fonts", new ArrayList<>(this.f1419f));
        bundle.putParcelableArrayList("custom_fonts", new ArrayList<>(this.f1420g));
        bundle.putParcelableArrayList("complications", new ArrayList<>(this.f1421h));
        bundle.putBoolean("convert_units", this.f1422i);
        bundle.putInt("color_format", this.f1423j);
        parcel.writeBundle(bundle);
    }
}
