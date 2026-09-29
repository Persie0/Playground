package kotlinx.serialization.encoding;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.df1;
import p000.w41;

/* JADX INFO: loaded from: classes.dex */
public interface Decoder {
    /* JADX INFO: renamed from: E */
    Decoder mo4071E(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: H */
    byte mo4074H();

    /* JADX INFO: renamed from: I */
    short mo4075I();

    /* JADX INFO: renamed from: J */
    float mo4076J();

    /* JADX INFO: renamed from: M */
    double mo4078M();

    /* JADX INFO: renamed from: a */
    w41 mo10320a();

    /* JADX INFO: renamed from: b */
    df1 mo4079b(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: e */
    boolean mo4082e();

    /* JADX INFO: renamed from: f */
    char mo4083f();

    /* JADX INFO: renamed from: h */
    int mo4084h(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: n */
    int mo4089n();

    /* JADX INFO: renamed from: s */
    String mo4092s();

    /* JADX INFO: renamed from: u */
    long mo4093u();

    /* JADX INFO: renamed from: w */
    default Object mo15604w(KSerializer kSerializer) {
        kSerializer.getClass();
        return kSerializer.deserialize(this);
    }

    /* JADX INFO: renamed from: y */
    boolean mo4098y();
}
