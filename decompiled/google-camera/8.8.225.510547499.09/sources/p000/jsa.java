package p000;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.wear.widget.iZcI.hiCTUJiAxf;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import com.google.android.material.behavior.iWN.zuAgeeF;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsa extends jij {
    public static final Parcelable.Creator CREATOR = new jri(14);

    /* JADX INFO: renamed from: a */
    public final Uri f34706a;

    /* JADX INFO: renamed from: b */
    public byte[] f34707b;

    /* JADX INFO: renamed from: c */
    private final Map f34708c;

    public jsa(Uri uri, Bundle bundle, byte[] bArr) {
        this.f34706a = uri;
        HashMap map = new HashMap();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        jib.m13205j(classLoader);
        bundle.setClassLoader(classLoader);
        for (String str : bundle.keySet()) {
            Parcelable parcelable = bundle.getParcelable(str);
            jib.m13205j(parcelable);
            map.put(str, (DataItemAssetParcelable) parcelable);
        }
        this.f34708c = map;
        this.f34707b = bArr;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(zuAgeeF.KnhFqGVFEZYejkN);
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        byte[] bArr = this.f34707b;
        sb.append(",dataSz=".concat((bArr == null ? "null" : Integer.valueOf(bArr.length)).toString()));
        sb.append(hiCTUJiAxf.yrn + this.f34708c.size());
        sb.append(", uri=".concat(String.valueOf(String.valueOf(this.f34706a))));
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iM13281h = jiy.m13281h(parcel);
        jiy.m13295v(parcel, 2, this.f34706a, i);
        Bundle bundle = new Bundle();
        ClassLoader classLoader = DataItemAssetParcelable.class.getClassLoader();
        jib.m13205j(classLoader);
        bundle.setClassLoader(classLoader);
        for (Map.Entry entry : this.f34708c.entrySet()) {
            bundle.putParcelable((String) entry.getKey(), new DataItemAssetParcelable((jqs) entry.getValue()));
        }
        jiy.m13289p(parcel, 4, bundle);
        jiy.m13290q(parcel, 5, this.f34707b);
        jiy.m13283j(parcel, iM13281h);
    }
}
