package com.google.android.datatransport.cct.internal;

import android.util.SparseArray;

/* JADX INFO: loaded from: classes2.dex */
public enum ComplianceData$ProductIdOrigin {
    NOT_SET(0),
    EVENT_OVERRIDE(5);

    private static final SparseArray<ComplianceData$ProductIdOrigin> valueMap;
    private final int value;

    static {
        ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin = NOT_SET;
        ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin2 = EVENT_OVERRIDE;
        SparseArray<ComplianceData$ProductIdOrigin> sparseArray = new SparseArray<>();
        valueMap = sparseArray;
        sparseArray.put(0, complianceData$ProductIdOrigin);
        sparseArray.put(5, complianceData$ProductIdOrigin2);
    }

    ComplianceData$ProductIdOrigin(int i) {
        this.value = i;
    }

    public static ComplianceData$ProductIdOrigin forNumber(int i) {
        return valueMap.get(i);
    }

    public int getValue() {
        return this.value;
    }
}
