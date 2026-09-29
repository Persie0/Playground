package kotlinx.serialization.encoding;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.mk9;
import p000.w41;

/* JADX INFO: loaded from: classes.dex */
public interface Encoder {
    /* JADX INFO: renamed from: a */
    w41 mo15605a();

    /* JADX INFO: renamed from: b */
    mk9 mo15606b(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: c */
    void mo15607c();

    /* JADX INFO: renamed from: d */
    void mo15608d(double d);

    /* JADX INFO: renamed from: e */
    void mo15609e(short s);

    /* JADX INFO: renamed from: f */
    void mo15610f(byte b);

    /* JADX INFO: renamed from: g */
    void mo15611g(boolean z);

    /* JADX INFO: renamed from: h */
    void mo15612h(float f);

    /* JADX INFO: renamed from: i */
    void mo15613i(char c);

    /* JADX INFO: renamed from: j */
    void mo15614j(SerialDescriptor serialDescriptor, int i);

    /* JADX INFO: renamed from: k */
    void mo15615k(int i);

    /* JADX INFO: renamed from: l */
    Encoder mo15616l(SerialDescriptor serialDescriptor);

    /* JADX INFO: renamed from: m */
    default void mo15617m(KSerializer kSerializer, Object obj) {
        kSerializer.getClass();
        kSerializer.serialize(this, obj);
    }

    /* JADX INFO: renamed from: n */
    default mk9 m15618n(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return mo15606b(serialDescriptor);
    }

    /* JADX INFO: renamed from: o */
    void mo15619o(long j);

    /* JADX INFO: renamed from: p */
    void mo15620p(String str);
}
