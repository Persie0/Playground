package com.google.mlkit.vision.documentscanner;

import android.net.Uri;
import p000.C3386nv;

/* JADX INFO: loaded from: classes2.dex */
abstract class zzc extends GmsDocumentScanningResult.Pdf {

    /* JADX INFO: renamed from: a */
    public final Uri f13919a;

    /* JADX INFO: renamed from: b */
    public final int f13920b;

    public zzc(Uri uri, int i) {
        if (uri == null) {
            C3386nv.m17635v("Null uri");
            throw null;
        }
        this.f13919a = uri;
        this.f13920b = i;
    }

    @Override // com.google.mlkit.vision.documentscanner.GmsDocumentScanningResult.Pdf
    /* JADX INFO: renamed from: a */
    public final int mo6777a() {
        return this.f13920b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof GmsDocumentScanningResult.Pdf) {
            zzc zzcVar = (zzc) ((GmsDocumentScanningResult.Pdf) obj);
            if (this.f13919a.equals(zzcVar.f13919a) && this.f13920b == zzcVar.f13920b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f13920b ^ ((this.f13919a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        String string = this.f13919a.toString();
        int length = string.length();
        int i = this.f13920b;
        StringBuilder sb = new StringBuilder(length + 20 + String.valueOf(i).length() + 1);
        sb.append("Pdf{uri=");
        sb.append(string);
        sb.append(", pageCount=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
