package p288o4;

import android.annotation.SuppressLint;
import dm.C5207g;

/* JADX INFO: renamed from: o4.a */
/* JADX INFO: loaded from: classes.dex */
public final class C7915a implements InterfaceC7919e {

    /* JADX INFO: renamed from: a */
    public final String f43143a;

    /* JADX INFO: renamed from: b */
    public final Object[] f43144b;

    /* JADX INFO: renamed from: o4.a$a */
    public static final class a {
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: a */
        public static void m15734a(InterfaceC7918d interfaceC7918d, Object[] objArr) {
            if (objArr == null) {
                return;
            }
            int length = objArr.length;
            int i10 = 0;
            while (i10 < length) {
                Object obj = objArr[i10];
                i10++;
                if (obj == null) {
                    interfaceC7918d.mo13193J0(i10);
                } else if (obj instanceof byte[]) {
                    interfaceC7918d.mo13199r0((byte[]) obj, i10);
                } else if (obj instanceof Float) {
                    interfaceC7918d.mo13192F0(((Number) obj).floatValue(), i10);
                } else if (obj instanceof Double) {
                    interfaceC7918d.mo13192F0(((Number) obj).doubleValue(), i10);
                } else if (obj instanceof Long) {
                    interfaceC7918d.mo13194W(i10, ((Number) obj).longValue());
                } else if (obj instanceof Integer) {
                    interfaceC7918d.mo13194W(i10, ((Number) obj).intValue());
                } else if (obj instanceof Short) {
                    interfaceC7918d.mo13194W(i10, ((Number) obj).shortValue());
                } else if (obj instanceof Byte) {
                    interfaceC7918d.mo13194W(i10, ((Number) obj).byteValue());
                } else if (obj instanceof String) {
                    interfaceC7918d.mo13197h0((String) obj, i10);
                } else {
                    if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                    }
                    interfaceC7918d.mo13194W(i10, ((Boolean) obj).booleanValue() ? 1L : 0L);
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C7915a(String str) {
        this(str, null);
        C5207g.m11111f(str, "query");
    }

    public C7915a(String str, Object[] objArr) {
        C5207g.m11111f(str, "query");
        this.f43143a = str;
        this.f43144b = objArr;
    }

    @Override // p288o4.InterfaceC7919e
    /* JADX INFO: renamed from: a */
    public final void mo13195a(InterfaceC7918d interfaceC7918d) {
        a.m15734a(interfaceC7918d, this.f43144b);
    }

    @Override // p288o4.InterfaceC7919e
    /* JADX INFO: renamed from: b */
    public final String mo13196b() {
        return this.f43143a;
    }
}
