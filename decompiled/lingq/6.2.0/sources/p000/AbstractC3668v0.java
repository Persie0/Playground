package p000;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.AbstractC3262b;
import kotlinx.serialization.json.AbstractC3264d;
import kotlinx.serialization.json.C3261a;
import kotlinx.serialization.json.C3263c;
import kotlinx.serialization.json.JsonDecodingException;
import kotlinx.serialization.json.JsonNull;

/* JADX INFO: renamed from: v0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3668v0 implements pf4, Decoder, df1 {

    /* JADX INFO: renamed from: a */
    public final ArrayList f64636a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public boolean f64637b;

    /* JADX INFO: renamed from: c */
    public final df4 f64638c;

    /* JADX INFO: renamed from: d */
    public final String f64639d;

    /* JADX INFO: renamed from: e */
    public final kf4 f64640e;

    public AbstractC3668v0(df4 df4Var, String str) {
        this.f64638c = df4Var;
        this.f64639d = str;
        this.f64640e = df4Var.f35560a;
    }

    /* JADX INFO: renamed from: B */
    public final float m23021B(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC3262b abstractC3262bMo13894c = mo13894c(str);
        boolean z = abstractC3262bMo13894c instanceof AbstractC3264d;
        df4 df4Var = this.f64638c;
        if (!z) {
            throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(AbstractC3264d.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bMo13894c.getClass()).m25414c() + " as the serialized body of float", m23030W(str), null, df4Var.f35560a.f47133i ? fa4.m11627A(abstractC3262bMo13894c.toString(), -1).toString() : null));
        }
        AbstractC3264d abstractC3264d = (AbstractC3264d) abstractC3262bMo13894c;
        try {
            e54 e54Var = sf4.f60791a;
            float f = Float.parseFloat(abstractC3264d.mo15621d());
            kf4 kf4Var = df4Var.f35560a;
            if (Math.abs(f) <= Float.MAX_VALUE) {
                return f;
            }
            throw new JsonDecodingException(fa4.m11656r(-1, fa4.m11628B(Float.valueOf(f), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", df4Var.f35560a.f47133i ? fa4.m11627A(m23032g().toString(), -1).toString() : null));
        } catch (IllegalArgumentException unused) {
            m23031X(abstractC3264d, "float", str);
            throw null;
        }
    }

    @Override // p000.pf4
    /* JADX INFO: renamed from: C */
    public final df4 mo15627C() {
        return this.f64638c;
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: D */
    public final Object mo4070D(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        this.f64636a.add(m23027S(serialDescriptor, i));
        Object objMo15604w = (kSerializer.getDescriptor().mo11826c() || mo4098y()) ? mo15604w(kSerializer) : null;
        if (!this.f64637b) {
            m23028U();
        }
        this.f64637b = false;
        return objMo15604w;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: E */
    public final Decoder mo4071E(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        if (u91.m22598P0(this.f64636a) != null) {
            return m23022K(m23028U(), serialDescriptor);
        }
        return new ig4(this.f64638c, mo13893T(), this.f64639d).mo4071E(serialDescriptor);
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: F */
    public final double mo4072F(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return m23036z(m23027S(serialDescriptor, i));
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: G */
    public final Object mo4073G(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        serialDescriptor.getClass();
        kSerializer.getClass();
        this.f64636a.add(m23027S(serialDescriptor, i));
        kSerializer.getClass();
        Object objMo15604w = mo15604w(kSerializer);
        if (!this.f64637b) {
            m23028U();
        }
        this.f64637b = false;
        return objMo15604w;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: H */
    public final byte mo4074H() {
        return m23034r(m23028U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: I */
    public final short mo4075I() {
        return m23025P(m23028U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: J */
    public final float mo4076J() {
        return m23021B(m23028U());
    }

    /* JADX INFO: renamed from: K */
    public final Decoder m23022K(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        str.getClass();
        serialDescriptor.getClass();
        if (!nk9.m17482b(serialDescriptor)) {
            this.f64636a.add(str);
            return this;
        }
        AbstractC3262b abstractC3262bMo13894c = mo13894c(str);
        String strMo3694a = serialDescriptor.mo3694a();
        boolean z = abstractC3262bMo13894c instanceof AbstractC3264d;
        df4 df4Var = this.f64638c;
        if (z) {
            return new qf4(te1.m21988b(df4Var, ((AbstractC3264d) abstractC3262bMo13894c).mo15621d()), df4Var);
        }
        throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(AbstractC3264d.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bMo13894c.getClass()).m25414c() + " as the serialized body of " + strMo3694a, m23030W(str), null, df4Var.f35560a.f47133i ? fa4.m11627A(abstractC3262bMo13894c.toString(), -1).toString() : null));
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: L */
    public final float mo4077L(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return m23021B(m23027S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: M */
    public final double mo4078M() {
        return m23036z(m23028U());
    }

    /* JADX INFO: renamed from: N */
    public final int m23023N(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC3262b abstractC3262bMo13894c = mo13894c(str);
        if (!(abstractC3262bMo13894c instanceof AbstractC3264d)) {
            throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(AbstractC3264d.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bMo13894c.getClass()).m25414c() + " as the serialized body of int", m23030W(str), null, this.f64638c.f35560a.f47133i ? fa4.m11627A(abstractC3262bMo13894c.toString(), -1).toString() : null));
        }
        AbstractC3264d abstractC3264d = (AbstractC3264d) abstractC3262bMo13894c;
        try {
            long jM21340g = sf4.m21340g(abstractC3264d);
            Integer numValueOf = (-2147483648L > jM21340g || jM21340g > 2147483647L) ? null : Integer.valueOf((int) jM21340g);
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
            m23031X(abstractC3264d, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m23031X(abstractC3264d, "int", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: O */
    public final long m23024O(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC3262b abstractC3262bMo13894c = mo13894c(str);
        if (abstractC3262bMo13894c instanceof AbstractC3264d) {
            AbstractC3264d abstractC3264d = (AbstractC3264d) abstractC3262bMo13894c;
            try {
                return sf4.m21340g(abstractC3264d);
            } catch (IllegalArgumentException unused) {
                m23031X(abstractC3264d, "long", str);
                throw null;
            }
        }
        throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(AbstractC3264d.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bMo13894c.getClass()).m25414c() + " as the serialized body of long", m23030W(str), null, this.f64638c.f35560a.f47133i ? fa4.m11627A(abstractC3262bMo13894c.toString(), -1).toString() : null));
    }

    /* JADX INFO: renamed from: P */
    public final short m23025P(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC3262b abstractC3262bMo13894c = mo13894c(str);
        if (!(abstractC3262bMo13894c instanceof AbstractC3264d)) {
            throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(AbstractC3264d.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bMo13894c.getClass()).m25414c() + " as the serialized body of short", m23030W(str), null, this.f64638c.f35560a.f47133i ? fa4.m11627A(abstractC3262bMo13894c.toString(), -1).toString() : null));
        }
        AbstractC3264d abstractC3264d = (AbstractC3264d) abstractC3262bMo13894c;
        try {
            long jM21340g = sf4.m21340g(abstractC3264d);
            Short shValueOf = (-32768 > jM21340g || jM21340g > 32767) ? null : Short.valueOf((short) jM21340g);
            if (shValueOf != null) {
                return shValueOf.shortValue();
            }
            m23031X(abstractC3264d, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m23031X(abstractC3264d, "short", str);
            throw null;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final String m23026Q(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC3262b abstractC3262bMo13894c = mo13894c(str);
        boolean z = abstractC3262bMo13894c instanceof AbstractC3264d;
        df4 df4Var = this.f64638c;
        if (!z) {
            throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(AbstractC3264d.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bMo13894c.getClass()).m25414c() + " as the serialized body of string", m23030W(str), null, df4Var.f35560a.f47133i ? fa4.m11627A(abstractC3262bMo13894c.toString(), -1).toString() : null));
        }
        AbstractC3264d abstractC3264d = (AbstractC3264d) abstractC3262bMo13894c;
        if (!(abstractC3264d instanceof zf4)) {
            throw new JsonDecodingException(fa4.m11656r(-1, wq1.m24118n("Expected string value for a non-null key '", str, "', got null literal instead"), m23030W(str), "Use 'coerceInputValues = true' in 'Json {}' builder to coerce nulls if property has a default value.", df4Var.f35560a.f47133i ? fa4.m11627A(m23032g().toString(), -1).toString() : null));
        }
        zf4 zf4Var = (zf4) abstractC3264d;
        if (zf4Var.f71489a || df4Var.f35560a.f47127c) {
            return zf4Var.f71490b;
        }
        throw new JsonDecodingException(fa4.m11656r(-1, wq1.m24118n("String literal for value of key '", str, "' should be quoted"), m23030W(str), "Use 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.", df4Var.f35560a.f47133i ? fa4.m11627A(m23032g().toString(), -1).toString() : null));
    }

    /* JADX INFO: renamed from: R */
    public String mo15175R(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return serialDescriptor.mo3698f(i);
    }

    /* JADX INFO: renamed from: S */
    public final String m23027S(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        String strMo15175R = mo15175R(serialDescriptor, i);
        strMo15175R.getClass();
        return strMo15175R;
    }

    /* JADX INFO: renamed from: T */
    public abstract AbstractC3262b mo13893T();

    /* JADX INFO: renamed from: U */
    public final Object m23028U() {
        ArrayList arrayList = this.f64636a;
        Object objRemove = arrayList.remove(vz1.m23602H(arrayList));
        this.f64637b = true;
        return objRemove;
    }

    /* JADX INFO: renamed from: V */
    public final String m23029V() {
        ArrayList arrayList = this.f64636a;
        return arrayList.isEmpty() ? "$" : u91.m22596N0(arrayList, ".", "$.", null, null, 60);
    }

    /* JADX INFO: renamed from: W */
    public final String m23030W(String str) {
        str.getClass();
        return m23029V() + '.' + str;
    }

    /* JADX INFO: renamed from: X */
    public final void m23031X(AbstractC3264d abstractC3264d, String str, String str2) {
        throw new JsonDecodingException(fa4.m11656r(-1, "Failed to parse literal '" + abstractC3264d + "' as " + (cl9.m4842Y(str, "i", false) ? "an " : "a ").concat(str) + " value", m23030W(str2), null, this.f64638c.f35560a.f47133i ? fa4.m11627A(m23032g().toString(), -1).toString() : null));
    }

    @Override // kotlinx.serialization.encoding.Decoder, p000.df1
    /* JADX INFO: renamed from: a */
    public final w41 mo10320a() {
        return this.f64638c.f35561b;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: b */
    public df1 mo4079b(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        AbstractC3262b abstractC3262bM23032g = m23032g();
        AbstractC3184kh kind = serialDescriptor.getKind();
        boolean zM11650l = fa4.m11650l(kind, hl9.f42586z);
        df4 df4Var = this.f64638c;
        if (zM11650l || (kind instanceof vg7)) {
            String strMo3694a = serialDescriptor.mo3694a();
            if (abstractC3262bM23032g instanceof C3261a) {
                return new lg4(df4Var, (C3261a) abstractC3262bM23032g);
            }
            throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(C3261a.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bM23032g.getClass()).m25414c() + " as the serialized body of " + strMo3694a, m23029V(), null, df4Var.f35560a.f47133i ? fa4.m11627A(abstractC3262bM23032g.toString(), -1).toString() : null));
        }
        if (!fa4.m11650l(kind, hl9.f42583A)) {
            String strMo3694a2 = serialDescriptor.mo3694a();
            if (abstractC3262bM23032g instanceof C3263c) {
                return new kg4(df4Var, (C3263c) abstractC3262bM23032g, this.f64639d, 8);
            }
            throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(C3263c.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bM23032g.getClass()).m25414c() + " as the serialized body of " + strMo3694a2, m23029V(), null, df4Var.f35560a.f47133i ? fa4.m11627A(abstractC3262bM23032g.toString(), -1).toString() : null));
        }
        SerialDescriptor serialDescriptorM19111a = pfa.m19111a(serialDescriptor.mo3700i(0), df4Var.f35561b);
        AbstractC3184kh kind2 = serialDescriptorM19111a.getKind();
        if (!(kind2 instanceof ak7) && !fa4.m11650l(kind2, dy8.f36425y)) {
            throw fa4.m11641b(serialDescriptorM19111a);
        }
        String strMo3694a3 = serialDescriptor.mo3694a();
        if (abstractC3262bM23032g instanceof C3263c) {
            return new mg4(df4Var, (C3263c) abstractC3262bM23032g);
        }
        throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(C3263c.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bM23032g.getClass()).m25414c() + " as the serialized body of " + strMo3694a3, m23029V(), null, df4Var.f35560a.f47133i ? fa4.m11627A(abstractC3262bM23032g.toString(), -1).toString() : null));
    }

    /* JADX INFO: renamed from: c */
    public abstract AbstractC3262b mo13894c(String str);

    @Override // p000.df1
    /* JADX INFO: renamed from: d */
    public final Decoder mo4080d(vj7 vj7Var, int i) {
        vj7Var.getClass();
        return m23022K(m23027S(vj7Var, i), vj7Var.mo3700i(i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: e */
    public final boolean mo4082e() {
        return m23033p(m23028U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: f */
    public final char mo4083f() {
        return m23035t(m23028U());
    }

    /* JADX INFO: renamed from: g */
    public final AbstractC3262b m23032g() {
        AbstractC3262b abstractC3262bMo13894c;
        String str = (String) u91.m22598P0(this.f64636a);
        return (str == null || (abstractC3262bMo13894c = mo13894c(str)) == null) ? mo13893T() : abstractC3262bMo13894c;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: h */
    public final int mo4084h(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        String str = (String) m23028U();
        str.getClass();
        AbstractC3262b abstractC3262bMo13894c = mo13894c(str);
        String strMo3694a = serialDescriptor.mo3694a();
        boolean z = abstractC3262bMo13894c instanceof AbstractC3264d;
        df4 df4Var = this.f64638c;
        if (z) {
            return AbstractC3695vr.m23506q(serialDescriptor, df4Var, ((AbstractC3264d) abstractC3262bMo13894c).mo15621d(), "");
        }
        throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(AbstractC3264d.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bMo13894c.getClass()).m25414c() + " as the serialized body of " + strMo3694a, m23030W(str), null, df4Var.f35560a.f47133i ? fa4.m11627A(abstractC3262bMo13894c.toString(), -1).toString() : null));
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: i */
    public final long mo4085i(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return m23024O(m23027S(serialDescriptor, i));
    }

    /* JADX INFO: renamed from: j */
    public void mo4086j(SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: k */
    public final char mo4087k(vj7 vj7Var, int i) {
        vj7Var.getClass();
        return m23035t(m23027S(vj7Var, i));
    }

    @Override // p000.pf4
    /* JADX INFO: renamed from: l */
    public final AbstractC3262b mo15628l() {
        return m23032g();
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: m */
    public final byte mo4088m(vj7 vj7Var, int i) {
        vj7Var.getClass();
        return m23034r(m23027S(vj7Var, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: n */
    public final int mo4089n() {
        return m23023N(m23028U());
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: o */
    public final short mo4090o(vj7 vj7Var, int i) {
        vj7Var.getClass();
        return m23025P(m23027S(vj7Var, i));
    }

    /* JADX INFO: renamed from: p */
    public final boolean m23033p(Object obj) {
        Boolean bool;
        String str = (String) obj;
        str.getClass();
        AbstractC3262b abstractC3262bMo13894c = mo13894c(str);
        if (!(abstractC3262bMo13894c instanceof AbstractC3264d)) {
            throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(AbstractC3264d.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bMo13894c.getClass()).m25414c() + " as the serialized body of boolean", m23030W(str), null, this.f64638c.f35560a.f47133i ? fa4.m11627A(abstractC3262bMo13894c.toString(), -1).toString() : null));
        }
        AbstractC3264d abstractC3264d = (AbstractC3264d) abstractC3262bMo13894c;
        try {
            e54 e54Var = sf4.f60791a;
            String strMo15621d = abstractC3264d.mo15621d();
            String[] strArr = rk9.f59448a;
            strMo15621d.getClass();
            if (strMo15621d.equalsIgnoreCase("true")) {
                bool = Boolean.TRUE;
            } else {
                bool = strMo15621d.equalsIgnoreCase("false") ? Boolean.FALSE : null;
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            m23031X(abstractC3264d, "boolean", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m23031X(abstractC3264d, "boolean", str);
            throw null;
        }
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: q */
    public final int mo4091q(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return m23023N(m23027S(serialDescriptor, i));
    }

    /* JADX INFO: renamed from: r */
    public final byte m23034r(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC3262b abstractC3262bMo13894c = mo13894c(str);
        if (!(abstractC3262bMo13894c instanceof AbstractC3264d)) {
            throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(AbstractC3264d.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bMo13894c.getClass()).m25414c() + " as the serialized body of byte", m23030W(str), null, this.f64638c.f35560a.f47133i ? fa4.m11627A(abstractC3262bMo13894c.toString(), -1).toString() : null));
        }
        AbstractC3264d abstractC3264d = (AbstractC3264d) abstractC3262bMo13894c;
        try {
            long jM21340g = sf4.m21340g(abstractC3264d);
            Byte bValueOf = (-128 > jM21340g || jM21340g > 127) ? null : Byte.valueOf((byte) jM21340g);
            if (bValueOf != null) {
                return bValueOf.byteValue();
            }
            m23031X(abstractC3264d, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            m23031X(abstractC3264d, "byte", str);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: s */
    public final String mo4092s() {
        return m23026Q(m23028U());
    }

    /* JADX INFO: renamed from: t */
    public final char m23035t(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC3262b abstractC3262bMo13894c = mo13894c(str);
        if (!(abstractC3262bMo13894c instanceof AbstractC3264d)) {
            throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(AbstractC3264d.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bMo13894c.getClass()).m25414c() + " as the serialized body of char", m23030W(str), null, this.f64638c.f35560a.f47133i ? fa4.m11627A(abstractC3262bMo13894c.toString(), -1).toString() : null));
        }
        AbstractC3264d abstractC3264d = (AbstractC3264d) abstractC3262bMo13894c;
        try {
            String strMo15621d = abstractC3264d.mo15621d();
            strMo15621d.getClass();
            int length = strMo15621d.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return strMo15621d.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            m23031X(abstractC3264d, "char", str);
            throw null;
        }
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: u */
    public final long mo4093u() {
        return m23024O(m23028U());
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: v */
    public final boolean mo4094v(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return m23033p(m23027S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: w */
    public final Object mo15604w(KSerializer kSerializer) {
        kSerializer.getClass();
        if (!(kSerializer instanceof AbstractC3168k1)) {
            return kSerializer.deserialize(this);
        }
        df4 df4Var = this.f64638c;
        kf4 kf4Var = df4Var.f35560a;
        AbstractC3168k1 abstractC3168k1 = (AbstractC3168k1) kSerializer;
        String strM16808c = mfc.m16808c(df4Var, abstractC3168k1.getDescriptor());
        AbstractC3262b abstractC3262bM23032g = m23032g();
        String strMo3694a = abstractC3168k1.getDescriptor().mo3694a();
        if (abstractC3262bM23032g instanceof C3263c) {
            C3263c c3263c = (C3263c) abstractC3262bM23032g;
            AbstractC3262b abstractC3262b = (AbstractC3262b) c3263c.get(strM16808c);
            try {
                return u8d.m22578b(df4Var, strM16808c, c3263c, sfc.m21342a((AbstractC3168k1) kSerializer, this, abstractC3262b != null ? sf4.m21337d(sf4.m21339f(abstractC3262b)) : null));
            } catch (SerializationException e) {
                String message = e.getMessage();
                message.getClass();
                throw new JsonDecodingException(fa4.m11656r(-1, message, null, null, df4Var.f35560a.f47133i ? fa4.m11627A(c3263c.toString(), -1).toString() : null));
            }
        }
        throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(C3263c.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bM23032g.getClass()).m25414c() + " as the serialized body of " + strMo3694a, m23029V(), null, df4Var.f35560a.f47133i ? fa4.m11627A(abstractC3262bM23032g.toString(), -1).toString() : null));
    }

    @Override // p000.df1
    /* JADX INFO: renamed from: x */
    public final String mo4097x(SerialDescriptor serialDescriptor, int i) {
        serialDescriptor.getClass();
        return m23026Q(m23027S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    /* JADX INFO: renamed from: y */
    public boolean mo4098y() {
        return !(m23032g() instanceof JsonNull);
    }

    /* JADX INFO: renamed from: z */
    public final double m23036z(Object obj) {
        String str = (String) obj;
        str.getClass();
        AbstractC3262b abstractC3262bMo13894c = mo13894c(str);
        boolean z = abstractC3262bMo13894c instanceof AbstractC3264d;
        df4 df4Var = this.f64638c;
        if (!z) {
            throw new JsonDecodingException(fa4.m11656r(-1, "Expected " + y38.m24933a(AbstractC3264d.class).m25414c() + ", but had " + y38.m24933a(abstractC3262bMo13894c.getClass()).m25414c() + " as the serialized body of double", m23030W(str), null, df4Var.f35560a.f47133i ? fa4.m11627A(abstractC3262bMo13894c.toString(), -1).toString() : null));
        }
        AbstractC3264d abstractC3264d = (AbstractC3264d) abstractC3262bMo13894c;
        try {
            e54 e54Var = sf4.f60791a;
            double d = Double.parseDouble(abstractC3264d.mo15621d());
            kf4 kf4Var = df4Var.f35560a;
            if (Math.abs(d) <= Double.MAX_VALUE) {
                return d;
            }
            throw new JsonDecodingException(fa4.m11656r(-1, fa4.m11628B(Double.valueOf(d), str), null, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", df4Var.f35560a.f47133i ? fa4.m11627A(m23032g().toString(), -1).toString() : null));
        } catch (IllegalArgumentException unused) {
            m23031X(abstractC3264d, "double", str);
            throw null;
        }
    }
}
