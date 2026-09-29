package p000;

import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes.dex */
public interface zk3 extends KSerializer {
    KSerializer[] childSerializers();

    default KSerializer[] typeParametersSerializers() {
        return te1.f62178b;
    }
}
