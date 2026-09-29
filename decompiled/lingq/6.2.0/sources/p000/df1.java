package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes.dex */
public interface df1 {
    /* JADX INFO: renamed from: A */
    int mo10319A(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: D */
    Object mo4070D(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    /* JADX INFO: renamed from: F */
    double mo4072F(SerialDescriptor serialDescriptor, int i);

    /* JADX INFO: renamed from: G */
    Object mo4073G(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj);

    /* JADX INFO: renamed from: L */
    float mo4077L(SerialDescriptor serialDescriptor, int i);

    /* JADX INFO: renamed from: a */
    w41 mo10320a();

    /* JADX INFO: renamed from: d */
    Decoder mo4080d(vj7 vj7Var, int i);

    /* JADX INFO: renamed from: i */
    long mo4085i(SerialDescriptor serialDescriptor, int i);

    /* JADX INFO: renamed from: j */
    void mo4086j(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: k */
    char mo4087k(vj7 vj7Var, int i);

    /* JADX INFO: renamed from: m */
    byte mo4088m(vj7 vj7Var, int i);

    /* JADX INFO: renamed from: o */
    short mo4090o(vj7 vj7Var, int i);

    /* JADX INFO: renamed from: q */
    int mo4091q(SerialDescriptor serialDescriptor, int i);

    /* JADX INFO: renamed from: v */
    boolean mo4094v(SerialDescriptor serialDescriptor, int i);

    /* JADX INFO: renamed from: x */
    String mo4097x(SerialDescriptor serialDescriptor, int i);
}
