package p000;

import android.content.Context;
import android.os.Bundle;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aby {
    /* JADX INFO: renamed from: a */
    static File[] m173a(Context context) {
        return context.getExternalMediaDirs();
    }

    /* JADX INFO: renamed from: b */
    public static final alj m174b(Bundle bundle, Bundle bundle2) {
        if (bundle == null) {
            if (bundle2 == null) {
                return new alj();
            }
            HashMap map = new HashMap();
            for (String str : bundle2.keySet()) {
                str.getClass();
                map.put(str, bundle2.get(str));
            }
            return new alj(map);
        }
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
        ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
        if (parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) {
            throw new IllegalStateException("Invalid bundle passed as restored state");
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = parcelableArrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = parcelableArrayList.get(i);
            obj.getClass();
            linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
        }
        return new alj(linkedHashMap);
    }
}
