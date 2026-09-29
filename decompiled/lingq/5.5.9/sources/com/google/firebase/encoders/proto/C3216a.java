package com.google.firebase.encoders.proto;

import java.lang.annotation.Annotation;

/* JADX INFO: renamed from: com.google.firebase.encoders.proto.a */
/* JADX INFO: loaded from: classes.dex */
public final class C3216a implements Protobuf {

    /* JADX INFO: renamed from: a */
    public final int f16235a;

    /* JADX INFO: renamed from: b */
    public final Protobuf.IntEncoding f16236b;

    public C3216a(int i10, Protobuf.IntEncoding intEncoding) {
        this.f16235a = i10;
        this.f16236b = intEncoding;
    }

    @Override // java.lang.annotation.Annotation
    public final Class<? extends Annotation> annotationType() {
        return Protobuf.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Protobuf)) {
            return false;
        }
        Protobuf protobuf = (Protobuf) obj;
        return this.f16235a == ((C3216a) protobuf).f16235a && this.f16236b.equals(((C3216a) protobuf).f16236b);
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (14552422 ^ this.f16235a) + (this.f16236b.hashCode() ^ 2041407134);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f16235a + "intEncoding=" + this.f16236b + ')';
    }
}
