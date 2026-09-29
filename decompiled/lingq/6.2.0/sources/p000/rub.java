package p000;

import com.google.android.gms.internal.mlkit_vision_text_common.zzcw;

/* JADX INFO: loaded from: classes2.dex */
public final class rub implements kvb {

    /* JADX INFO: renamed from: b */
    public final int f59836b;

    /* JADX INFO: renamed from: c */
    public final zzcw f59837c;

    public rub(int i, zzcw zzcwVar) {
        this.f59836b = i;
        this.f59837c = zzcwVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return kvb.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kvb)) {
            return false;
        }
        kvb kvbVar = (kvb) obj;
        return this.f59836b == kvbVar.zza() && this.f59837c.equals(kvbVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f59836b ^ 14552422) + (this.f59837c.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f59836b + "intEncoding=" + this.f59837c + ')';
    }

    @Override // p000.kvb
    public final int zza() {
        return this.f59836b;
    }

    @Override // p000.kvb
    public final zzcw zzb() {
        return this.f59837c;
    }
}
