package p000;

import com.google.android.gms.common.data.DataHolder;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class jrz extends jgm {

    /* JADX INFO: renamed from: d */
    private final int f34700d;

    public jrz(DataHolder dataHolder, int i, int i2) {
        super(dataHolder, i);
        this.f34700d = i2;
    }

    public final String toString() {
        String str;
        if (m13137b() == 1) {
            str = "changed";
        } else {
            str = m13137b() == 2 ? "deleted" : "unknown";
        }
        return "DataEventRef{ type=" + str + ", dataitem=" + new jsb(this.f33966a, this.f33967b, this.f34700d).toString() + " }";
    }
}
