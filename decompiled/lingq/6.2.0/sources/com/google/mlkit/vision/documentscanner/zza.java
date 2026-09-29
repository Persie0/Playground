package com.google.mlkit.vision.documentscanner;

import java.util.ArrayList;
import java.util.List;
import p000.AbstractC3393o1;

/* JADX INFO: loaded from: classes2.dex */
abstract class zza extends GmsDocumentScanningResult {

    /* JADX INFO: renamed from: a */
    public final List f13915a;

    /* JADX INFO: renamed from: b */
    public final GmsDocumentScanningResult.Pdf f13916b;

    public zza(ArrayList arrayList, GmsDocumentScanningResult.Pdf pdf) {
        this.f13915a = arrayList;
        this.f13916b = pdf;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult
    /* JADX INFO: renamed from: a */
    public final List mo6774a() {
        return this.f13915a;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult
    /* JADX INFO: renamed from: b */
    public final GmsDocumentScanningResult.Pdf mo6775b() {
        return this.f13916b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GmsDocumentScanningResult) {
            GmsDocumentScanningResult gmsDocumentScanningResult = (GmsDocumentScanningResult) obj;
            List list = this.f13915a;
            if (list != null ? list.equals(((zza) gmsDocumentScanningResult).f13915a) : ((zza) gmsDocumentScanningResult).f13915a == null) {
                GmsDocumentScanningResult.Pdf pdf = this.f13916b;
                if (pdf != null ? pdf.equals(((zza) gmsDocumentScanningResult).f13916b) : ((zza) gmsDocumentScanningResult).f13916b == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        List list = this.f13915a;
        int iHashCode = list == null ? 0 : list.hashCode();
        GmsDocumentScanningResult.Pdf pdf = this.f13916b;
        return ((iHashCode ^ 1000003) * 1000003) ^ (pdf != null ? pdf.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f13915a);
        String strValueOf2 = String.valueOf(this.f13916b);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 38 + strValueOf2.length() + 1);
        AbstractC3393o1.m17725C(sb, "GmsDocumentScanningResult{pages=", strValueOf, ", pdf=", strValueOf2);
        sb.append("}");
        return sb.toString();
    }
}
