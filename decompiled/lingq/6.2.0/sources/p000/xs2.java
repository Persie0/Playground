package p000;

import java.util.Iterator;
import kotlin.AbstractC3192a;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class xs2 extends bg7 {

    /* JADX INFO: renamed from: l */
    public final dy8 f68634l;

    /* JADX INFO: renamed from: m */
    public final cs4 f68635m;

    public xs2(String str, int i) {
        super(str, null, i);
        this.f68634l = dy8.f36425y;
        this.f68635m = AbstractC3192a.m15356a(new ws2(i, str, this));
    }

    @Override // p000.bg7
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof SerialDescriptor)) {
            return false;
        }
        SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
        return serialDescriptor.getKind() == dy8.f36425y && this.f8502a.equals(serialDescriptor.mo3694a()) && fa4.m11650l(eh0.m11129i(this), eh0.m11129i(serialDescriptor));
    }

    @Override // p000.bg7, kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC3184kh getKind() {
        return this.f68634l;
    }

    @Override // p000.bg7
    public final int hashCode() {
        int iHashCode = this.f8502a.hashCode();
        Iterator it = new ay8(this).iterator();
        int iHashCode2 = 1;
        while (true) {
            om2 om2Var = (om2) it;
            if (!om2Var.hasNext()) {
                return (iHashCode * 31) + iHashCode2;
            }
            int i = iHashCode2 * 31;
            String str = (String) om2Var.next();
            iHashCode2 = i + (str != null ? str.hashCode() : 0);
        }
    }

    @Override // p000.bg7, kotlinx.serialization.descriptors.SerialDescriptor
    /* JADX INFO: renamed from: i */
    public final SerialDescriptor mo3700i(int i) {
        return ((SerialDescriptor[]) this.f68635m.getValue())[i];
    }

    @Override // p000.bg7
    public final String toString() {
        return u91.m22596N0(new ay8(this), ", ", this.f8502a.concat("("), ")", null, 56);
    }
}
