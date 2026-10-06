package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fvu extends kmr implements kmd {
    public fvu(kmd kmdVar) {
        super(kmdVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return mpw.m16768g(mo14556i(), ((fvu) obj).mo14556i());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{mo14556i()});
    }
}
