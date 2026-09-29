package p000;

import kotlin.time.DurationUnit;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes.dex */
public final class hn2 implements KSerializer {

    /* JADX INFO: renamed from: a */
    public static final hn2 f42649a = new hn2();

    /* JADX INFO: renamed from: b */
    public static final gk7 f42650b = new gk7("kotlin.time.Duration", ak7.f772G);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        iy5 iy5Var = cn2.f10315b;
        String strMo4092s = decoder.mo4092s();
        strMo4092s.getClass();
        try {
            long jM17098Q = AbstractC3352my.m17098Q(strMo4092s);
            if (jM17098Q == cn2.f10318e) {
                throw new IllegalStateException("invariant failed");
            }
            return new cn2(jM17098Q);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException(wq1.m24118n("Invalid ISO duration string format: '", strMo4092s, "'."), e);
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return f42650b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        long j = ((cn2) obj).f10319a;
        iy5 iy5Var = cn2.f10315b;
        StringBuilder sb = new StringBuilder();
        if (j < 0) {
            sb.append('-');
        }
        sb.append("PT");
        long jM4892j = j < 0 ? cn2.m4892j(j) : j;
        long jM4890h = cn2.m4890h(jM4892j, DurationUnit.HOURS);
        boolean z = false;
        int iM4890h = cn2.m4888f(jM4892j) ? 0 : (int) (cn2.m4890h(jM4892j, DurationUnit.MINUTES) % 60);
        int iM4890h2 = cn2.m4888f(jM4892j) ? 0 : (int) (cn2.m4890h(jM4892j, DurationUnit.SECONDS) % 60);
        int iM4887e = cn2.m4887e(jM4892j);
        if (cn2.m4888f(j)) {
            jM4890h = 9999999999999L;
        }
        boolean z2 = jM4890h != 0;
        boolean z3 = (iM4890h2 == 0 && iM4887e == 0) ? false : true;
        if (iM4890h != 0 || (z3 && z2)) {
            z = true;
        }
        if (z2) {
            sb.append(jM4890h);
            sb.append('H');
        }
        if (z) {
            sb.append(iM4890h);
            sb.append('M');
        }
        if (z3 || (!z2 && !z)) {
            cn2.m4884b(sb, iM4890h2, iM4887e, 9, "S", true);
        }
        encoder.mo15620p(sb.toString());
    }
}
