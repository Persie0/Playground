package p000;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class nk9 {

    /* JADX INFO: renamed from: a */
    public static final Set f52891a = AbstractC3550rv.m20855w0(new SerialDescriptor[]{nea.f52658b, sea.f60770b, iea.f44032b, zea.f71477b});

    /* JADX INFO: renamed from: a */
    public static final boolean m17481a(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return serialDescriptor.mo10855g() && serialDescriptor.equals(sf4.f60791a);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m17482b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        return serialDescriptor.mo10855g() && f52891a.contains(serialDescriptor);
    }
}
