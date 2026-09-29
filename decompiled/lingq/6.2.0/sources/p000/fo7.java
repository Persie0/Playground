package p000;

import com.google.firebase.encoders.proto.Protobuf$IntEncoding;

/* JADX INFO: loaded from: classes2.dex */
public @interface fo7 {
    Protobuf$IntEncoding intEncoding() default Protobuf$IntEncoding.DEFAULT;

    int tag();
}
