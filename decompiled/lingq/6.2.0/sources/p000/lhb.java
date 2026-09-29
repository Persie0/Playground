package p000;

import com.google.android.gms.internal.mlkit_vision_common.zzah;

/* JADX INFO: loaded from: classes2.dex */
public final class lhb implements wkb {

    /* JADX INFO: renamed from: b */
    public final int f49675b;

    /* JADX INFO: renamed from: c */
    public final zzah f49676c;

    public lhb(int i, zzah zzahVar) {
        this.f49675b = i;
        this.f49676c = zzahVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return wkb.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wkb)) {
            return false;
        }
        wkb wkbVar = (wkb) obj;
        return this.f49675b == wkbVar.zza() && this.f49676c.equals(wkbVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f49675b ^ 14552422) + (this.f49676c.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f49675b + "intEncoding=" + this.f49676c + ')';
    }

    @Override // p000.wkb
    public final int zza() {
        return this.f49675b;
    }

    @Override // p000.wkb
    public final zzah zzb() {
        return this.f49676c;
    }
}
