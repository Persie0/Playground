package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import p000.AbstractC3393o1;
import p000.C3386nv;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzb extends GmsDocumentScanningResult.Page {

    /* JADX INFO: renamed from: a */
    public final Uri f13917a;

    /* JADX INFO: renamed from: b */
    public final String f13918b;

    public zzb(Uri uri, String str) {
        if (uri == null) {
            C3386nv.m17635v("Null imageUri");
            throw null;
        }
        this.f13917a = uri;
        this.f13918b = str;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult.Page
    /* JADX INFO: renamed from: a */
    public final Uri mo6776a() {
        return this.f13917a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GmsDocumentScanningResult.Page) {
            zzb zzbVar = (zzb) ((GmsDocumentScanningResult.Page) obj);
            if (this.f13917a.equals(zzbVar.f13917a)) {
                String str = zzbVar.f13918b;
                String str2 = this.f13918b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f13917a.hashCode() ^ 1000003;
        String str = this.f13918b;
        return (str == null ? 0 : str.hashCode()) ^ (iHashCode * 1000003);
    }

    public final String toString() {
        String string = this.f13917a.toString();
        int length = string.length();
        String str = this.f13918b;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(str).length() + 1);
        AbstractC3393o1.m17725C(sb, "Page{imageUri=", string, ", originalImageHash=", str);
        sb.append("}");
        return sb.toString();
    }
}
