package p000;

import android.net.Uri;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes2.dex */
public final class njd {

    /* JADX INFO: renamed from: a */
    public final Uri f52863a;

    /* JADX INFO: renamed from: b */
    public final w5d f52864b;

    /* JADX INFO: renamed from: c */
    public final Optional f52865c;

    /* JADX INFO: renamed from: d */
    public final ImmutableList f52866d;

    public njd(Uri uri, w5d w5dVar, Optional optional, ImmutableList immutableList) {
        this.f52863a = uri;
        this.f52864b = w5dVar;
        this.f52865c = optional;
        this.f52866d = immutableList;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof njd)) {
            return false;
        }
        njd njdVar = (njd) obj;
        return this.f52863a.equals(njdVar.f52863a) && this.f52864b.equals(njdVar.f52864b) && this.f52865c.equals(njdVar.f52865c) && this.f52866d.equals(njdVar.f52866d);
    }

    public final int hashCode() {
        return ((((((this.f52866d.hashCode() ^ ((((((this.f52863a.hashCode() ^ 1000003) * 1000003) ^ this.f52864b.hashCode()) * 1000003) ^ this.f52865c.hashCode()) * 1000003)) * 1000003) ^ j13.f44894k.hashCode()) * 1000003) ^ 1231) * 1000003) ^ 1237;
    }

    public final String toString() {
        String string = this.f52863a.toString();
        int length = string.length();
        String string2 = this.f52864b.toString();
        int length2 = string2.length();
        j13 j13Var = j13.f44894k;
        String strValueOf = String.valueOf(this.f52865c);
        String strValueOf2 = String.valueOf(this.f52866d);
        String string3 = j13Var.toString();
        int length3 = strValueOf.length();
        int length4 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 34 + length2 + 10 + length3 + 13 + length4 + 16 + string3.length() + 32 + String.valueOf(true).length() + 22);
        AbstractC3393o1.m17725C(sb, "ProtoDataStoreConfig{uri=", string, ", schema=", string2);
        AbstractC3393o1.m17725C(sb, ", handler=", strValueOf, ", migrations=", strValueOf2);
        return AbstractC3393o1.m17739n(sb, ", variantConfig=", string3, ", useGeneratedExtensionRegistry=true, enableTracing=false}");
    }
}
