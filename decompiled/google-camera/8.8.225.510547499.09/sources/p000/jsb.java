package p000;

import android.net.Uri;
import com.google.android.gms.common.data.DataHolder;
import java.util.HashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jsb extends jgm {

    /* JADX INFO: renamed from: d */
    private final int f34709d;

    public jsb(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f34709d = i2;
    }

    public final String toString() {
        DataHolder dataHolder = this.f33966a;
        int i = this.f33967b;
        int i2 = this.f33968c;
        dataHolder.m4662c("data", i);
        byte[] blob = dataHolder.f7629d[i2].getBlob(i, dataHolder.f7628c.getInt("data"));
        HashMap map = new HashMap(this.f34709d);
        for (int i3 = 0; i3 < this.f34709d; i3++) {
            jgm jgmVar = new jgm(this.f33966a, this.f33967b + i3);
            if (jgmVar.mo4668c() != null) {
                map.put(jgmVar.mo4668c(), jgmVar);
            }
        }
        StringBuilder sb = new StringBuilder("DataItemRef{ ");
        sb.append("uri=".concat(String.valueOf(String.valueOf(Uri.parse(m13136a("path"))))));
        sb.append(", dataSz=".concat((blob == null ? "null" : Integer.valueOf(blob.length)).toString()));
        sb.append(", numAssets=" + map.size());
        sb.append(" }");
        return sb.toString();
    }
}
