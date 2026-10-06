package p000;

import java.io.Serializable;
import java.util.EnumMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
final class mwl implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a */
    final EnumMap f41730a;

    public mwl(EnumMap enumMap) {
        this.f41730a = enumMap;
    }

    Object readResolve() {
        return new mwm(this.f41730a);
    }
}
