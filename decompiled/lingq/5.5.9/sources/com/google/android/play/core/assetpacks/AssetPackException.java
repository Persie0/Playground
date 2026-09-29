package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.zzj;
import java.util.HashMap;
import p364rd.C8769a;

/* JADX INFO: loaded from: classes.dex */
public class AssetPackException extends zzj {
    /* JADX WARN: Illegal instructions before constructor call */
    public AssetPackException(int i10) {
        String string;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(i10);
        HashMap map = C8769a.f46488a;
        Integer numValueOf = Integer.valueOf(i10);
        if (map.containsKey(numValueOf)) {
            String str = (String) map.get(numValueOf);
            String str2 = (String) C8769a.f46489b.get(numValueOf);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 113 + String.valueOf(str2).length());
            sb2.append(str);
            sb2.append(" (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#");
            sb2.append(str2);
            sb2.append(")");
            string = sb2.toString();
        } else {
            string = "";
        }
        objArr[1] = string;
        super(String.format("Asset Pack Download Error(%d): %s", objArr));
        if (i10 == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
