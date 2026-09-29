package p000;

import com.google.android.gms.internal.mlkit_vision_document_scanner.zzao;

/* JADX INFO: loaded from: classes2.dex */
public final class zlb implements omb {

    /* JADX INFO: renamed from: b */
    public final int f71717b;

    /* JADX INFO: renamed from: c */
    public final zzao f71718c;

    public zlb(int i, zzao zzaoVar) {
        this.f71717b = i;
        this.f71718c = zzaoVar;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return omb.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof omb)) {
            return false;
        }
        omb ombVar = (omb) obj;
        return this.f71717b == ombVar.zza() && this.f71718c.equals(ombVar.zzb());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.f71717b ^ 14552422) + (this.f71718c.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f71717b + "intEncoding=" + this.f71718c + ')';
    }

    @Override // p000.omb
    public final int zza() {
        return this.f71717b;
    }

    @Override // p000.omb
    public final zzao zzb() {
        return this.f71718c;
    }
}
