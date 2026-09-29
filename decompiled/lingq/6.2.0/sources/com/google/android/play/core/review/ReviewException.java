package com.google.android.play.core.review;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;
import java.util.Locale;
import p000.efb;

/* JADX INFO: loaded from: classes2.dex */
public class ReviewException extends ApiException {
    /* JADX WARN: Illegal instructions before constructor call */
    public ReviewException(int i) {
        String str;
        Locale locale = Locale.getDefault();
        Integer numValueOf = Integer.valueOf(i);
        HashMap map = efb.f37198a;
        Integer numValueOf2 = Integer.valueOf(i);
        if (map.containsKey(numValueOf2)) {
            str = ((String) map.get(numValueOf2)) + " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#" + ((String) efb.f37199b.get(numValueOf2)) + ")";
        } else {
            str = "";
        }
        super(new Status(i, String.format(locale, "Review Error(%d): %s", numValueOf, str), null, null));
    }
}
