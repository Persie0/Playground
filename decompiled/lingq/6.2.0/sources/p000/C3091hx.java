package p000;

import com.google.firebase.encoders.proto.Protobuf$IntEncoding;

/* JADX INFO: renamed from: hx */
/* JADX INFO: loaded from: classes.dex */
public final class C3091hx implements fo7 {

    /* JADX INFO: renamed from: b */
    public final int f43084b;

    /* JADX INFO: renamed from: c */
    public final Protobuf$IntEncoding f43085c;

    public C3091hx(int i, Protobuf$IntEncoding protobuf$IntEncoding) {
        this.f43084b = i;
        this.f43085c = protobuf$IntEncoding;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return fo7.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo7)) {
            return false;
        }
        fo7 fo7Var = (fo7) obj;
        return this.f43084b == fo7Var.tag() && this.f43085c.equals(fo7Var.intEncoding());
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f43084b) + (this.f43085c.hashCode() ^ 2041407134);
    }

    @Override // p000.fo7
    public final Protobuf$IntEncoding intEncoding() {
        return this.f43085c;
    }

    @Override // p000.fo7
    public final int tag() {
        return this.f43084b;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f43084b + "intEncoding=" + this.f43085c + ')';
    }
}
