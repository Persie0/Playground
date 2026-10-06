package p000;

import android.graphics.Rect;
import com.google.android.gms.dynamite.p017ho.DNTdN;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class gdz {

    /* JADX INFO: renamed from: a */
    public final kna f24347a;

    /* JADX INFO: renamed from: b */
    public final kbc f24348b;

    /* JADX INFO: renamed from: c */
    public final Rect f24349c;

    /* JADX INFO: renamed from: d */
    private final kna f24350d;

    public gdz(kna knaVar, kna knaVar2, kbc kbcVar, Rect rect) {
        this.f24347a = knaVar;
        this.f24350d = knaVar2;
        this.f24348b = kbcVar;
        this.f24349c = rect;
    }

    /* JADX INFO: renamed from: a */
    public static gdz m9082a(kmd kmdVar, kbc kbcVar, int i) throws gdy {
        List<kbc> listMo14571x = kmdVar.mo14571x(i);
        if (listMo14571x.isEmpty()) {
            throw new gdy(DNTdN.eDypNMCO + i);
        }
        lku.m15613H(!listMo14571x.isEmpty());
        long j = Long.MAX_VALUE;
        kbc kbcVarM13914c = null;
        for (kbc kbcVar2 : listMo14571x) {
            long jM13905b = kbcVar2.m13905b();
            if (kbcVar2.f35517a >= kbcVar.f35517a && kbcVar2.f35518b >= kbcVar.f35518b && jM13905b < j) {
                kbcVarM13914c = kbcVar2;
                j = jM13905b;
            }
        }
        if (kbcVarM13914c == null) {
            kbcVarM13914c = kbd.m13914c(listMo14571x);
        }
        return new gdz(new kna(i, kbcVarM13914c), new kna(i, kbd.m13914c(listMo14571x)), kbcVar, kan.m13873j(kbcVar).m13879e(kbcVarM13914c));
    }

    /* JADX INFO: renamed from: b */
    public final kbc m9083b() {
        return this.f24350d.f36581b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gdz)) {
            return false;
        }
        gdz gdzVar = (gdz) obj;
        return this.f24348b.equals(gdzVar.f24348b) && this.f24350d.equals(gdzVar.f24350d) && this.f24347a.equals(gdzVar.f24347a) && this.f24349c.equals(gdzVar.f24349c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f24348b, this.f24350d, this.f24347a, this.f24349c});
    }

    public final String toString() {
        mrl mrlVarM16766e = mpw.m16766e("PictureSizeCalculator.Configuration");
        mrlVarM16766e.m16823b("desired size", this.f24348b);
        mrlVarM16766e.m16823b("large image reader", this.f24347a);
        mrlVarM16766e.m16823b("full-size image reader", this.f24350d);
        mrlVarM16766e.m16823b("crop", this.f24349c);
        return mrlVarM16766e.toString();
    }
}
