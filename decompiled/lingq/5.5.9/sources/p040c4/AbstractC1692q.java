package p040c4;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.result.C0204c;
import dm.C5206f;
import dm.C5207g;
import java.io.Serializable;
import mo.C7661i;

/* JADX INFO: renamed from: c4.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1692q<T> {

    /* JADX INFO: renamed from: b */
    public static final f f9442b = new f();

    /* JADX INFO: renamed from: c */
    public static final i f9443c = new i();

    /* JADX INFO: renamed from: d */
    public static final e f9444d = new e();

    /* JADX INFO: renamed from: e */
    public static final h f9445e = new h();

    /* JADX INFO: renamed from: f */
    public static final g f9446f = new g();

    /* JADX INFO: renamed from: g */
    public static final d f9447g = new d();

    /* JADX INFO: renamed from: h */
    public static final c f9448h = new c();

    /* JADX INFO: renamed from: i */
    public static final b f9449i = new b();

    /* JADX INFO: renamed from: j */
    public static final a f9450j = new a();

    /* JADX INFO: renamed from: k */
    public static final k f9451k = new k();

    /* JADX INFO: renamed from: l */
    public static final j f9452l = new j();

    /* JADX INFO: renamed from: a */
    public final boolean f9453a;

    /* JADX INFO: renamed from: c4.q$a */
    public static final class a extends AbstractC1692q<boolean[]> {
        public a() {
            super(true);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final boolean[] mo5419a(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return "boolean[]";
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final boolean[] mo5423e(String str) {
            C5207g.m11111f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, boolean[] zArr) {
            C5207g.m11111f(str, "key");
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* JADX INFO: renamed from: c4.q$b */
    public static final class b extends AbstractC1692q<Boolean> {
        public b() {
            super(false);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final Boolean mo5419a(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return "boolean";
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final Boolean mo5423e(String str) {
            boolean z10;
            C5207g.m11111f(str, "value");
            if (C5207g.m11106a(str, "true")) {
                z10 = true;
            } else {
                if (!C5207g.m11106a(str, "false")) {
                    throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
                }
                z10 = false;
            }
            return Boolean.valueOf(z10);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            C5207g.m11111f(str, "key");
            bundle.putBoolean(str, zBooleanValue);
        }
    }

    /* JADX INFO: renamed from: c4.q$c */
    public static final class c extends AbstractC1692q<float[]> {
        public c() {
            super(true);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final float[] mo5419a(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return "float[]";
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final float[] mo5423e(String str) {
            C5207g.m11111f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, float[] fArr) {
            C5207g.m11111f(str, "key");
            bundle.putFloatArray(str, fArr);
        }
    }

    /* JADX INFO: renamed from: c4.q$d */
    public static final class d extends AbstractC1692q<Float> {
        public d() {
            super(false);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final Float mo5419a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Float.valueOf(((Float) obj).floatValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return "float";
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final Float mo5423e(String str) {
            C5207g.m11111f(str, "value");
            return Float.valueOf(Float.parseFloat(str));
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, Float f3) {
            float fFloatValue = f3.floatValue();
            C5207g.m11111f(str, "key");
            bundle.putFloat(str, fFloatValue);
        }
    }

    /* JADX INFO: renamed from: c4.q$e */
    public static final class e extends AbstractC1692q<int[]> {
        public e() {
            super(true);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final int[] mo5419a(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return "integer[]";
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final int[] mo5423e(String str) {
            C5207g.m11111f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, int[] iArr) {
            C5207g.m11111f(str, "key");
            bundle.putIntArray(str, iArr);
        }
    }

    /* JADX INFO: renamed from: c4.q$f */
    public static final class f extends AbstractC1692q<Integer> {
        public f() {
            super(false);
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final Integer mo5419a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return "integer";
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final Integer mo5423e(String str) {
            int i10;
            C5207g.m11111f(str, "value");
            if (C7661i.m15256V2(str, "0x", false)) {
                String strSubstring = str.substring(2);
                C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                C5206f.m11029x0(16);
                i10 = Integer.parseInt(strSubstring, 16);
            } else {
                i10 = Integer.parseInt(str);
            }
            return Integer.valueOf(i10);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, Integer num) {
            int iIntValue = num.intValue();
            C5207g.m11111f(str, "key");
            bundle.putInt(str, iIntValue);
        }
    }

    /* JADX INFO: renamed from: c4.q$g */
    public static final class g extends AbstractC1692q<long[]> {
        public g() {
            super(true);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final long[] mo5419a(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return "long[]";
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final long[] mo5423e(String str) {
            C5207g.m11111f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, long[] jArr) {
            C5207g.m11111f(str, "key");
            bundle.putLongArray(str, jArr);
        }
    }

    /* JADX INFO: renamed from: c4.q$h */
    public static final class h extends AbstractC1692q<Long> {
        public h() {
            super(false);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final Long mo5419a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Long.valueOf(((Long) obj).longValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return "long";
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final Long mo5423e(String str) {
            String strSubstring;
            long j10;
            C5207g.m11111f(str, "value");
            if (C7661i.m15248N2(str, "L")) {
                strSubstring = str.substring(0, str.length() - 1);
                C5207g.m11110e(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
            } else {
                strSubstring = str;
            }
            if (C7661i.m15256V2(str, "0x", false)) {
                String strSubstring2 = strSubstring.substring(2);
                C5207g.m11110e(strSubstring2, "this as java.lang.String).substring(startIndex)");
                C5206f.m11029x0(16);
                j10 = Long.parseLong(strSubstring2, 16);
            } else {
                j10 = Long.parseLong(strSubstring);
            }
            return Long.valueOf(j10);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, Long l10) {
            long jLongValue = l10.longValue();
            C5207g.m11111f(str, "key");
            bundle.putLong(str, jLongValue);
        }
    }

    /* JADX INFO: renamed from: c4.q$i */
    public static final class i extends AbstractC1692q<Integer> {
        public i() {
            super(false);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final Integer mo5419a(Bundle bundle, String str) {
            Object obj = bundle.get(str);
            if (obj != null) {
                return Integer.valueOf(((Integer) obj).intValue());
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return "reference";
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final Integer mo5423e(String str) {
            int i10;
            C5207g.m11111f(str, "value");
            if (C7661i.m15256V2(str, "0x", false)) {
                String strSubstring = str.substring(2);
                C5207g.m11110e(strSubstring, "this as java.lang.String).substring(startIndex)");
                C5206f.m11029x0(16);
                i10 = Integer.parseInt(strSubstring, 16);
            } else {
                i10 = Integer.parseInt(str);
            }
            return Integer.valueOf(i10);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, Integer num) {
            int iIntValue = num.intValue();
            C5207g.m11111f(str, "key");
            bundle.putInt(str, iIntValue);
        }
    }

    /* JADX INFO: renamed from: c4.q$j */
    public static final class j extends AbstractC1692q<String[]> {
        public j() {
            super(true);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final String[] mo5419a(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return "string[]";
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final String[] mo5423e(String str) {
            C5207g.m11111f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, String[] strArr) {
            C5207g.m11111f(str, "key");
            bundle.putStringArray(str, strArr);
        }
    }

    /* JADX INFO: renamed from: c4.q$k */
    public static final class k extends AbstractC1692q<String> {
        public k() {
            super(true);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final String mo5419a(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return "string";
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final String mo5423e(String str) {
            C5207g.m11111f(str, "value");
            return str;
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, String str2) {
            C5207g.m11111f(str, "key");
            bundle.putString(str, str2);
        }
    }

    /* JADX INFO: renamed from: c4.q$l */
    public static final class l<D extends Enum<?>> extends p<D> {

        /* JADX INFO: renamed from: n */
        public final Class<D> f9454n;

        public l(Class<D> cls) {
            super(cls, 0);
            if (cls.isEnum()) {
                this.f9454n = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is not an Enum type.").toString());
        }

        @Override // p040c4.AbstractC1692q.p, p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return this.f9454n.getName();
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        @Override // p040c4.AbstractC1692q.p
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public final D mo5423e(String str) {
            D d10;
            C5207g.m11111f(str, "value");
            Class<D> cls = this.f9454n;
            D[] enumConstants = cls.getEnumConstants();
            C5207g.m11110e(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    d10 = null;
                    break;
                }
                d10 = enumConstants[i10];
                if (C7661i.m15249O2(d10.name(), str)) {
                    break;
                }
                i10++;
            }
            D d11 = d10;
            if (d11 != null) {
                return d11;
            }
            StringBuilder sbM854m = C0204c.m854m("Enum value ", str, " not found for type ");
            sbM854m.append(cls.getName());
            sbM854m.append('.');
            throw new IllegalArgumentException(sbM854m.toString());
        }
    }

    /* JADX INFO: renamed from: c4.q$m */
    public static final class m<D extends Parcelable> extends AbstractC1692q<D[]> {

        /* JADX INFO: renamed from: m */
        public final Class<D[]> f9455m;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public m(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Parcelable.").toString());
            }
            try {
                this.f9455m = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final Object mo5419a(Bundle bundle, String str) {
            return (Parcelable[]) bundle.get(str);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return this.f9455m.getName();
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final Object mo5423e(String str) {
            C5207g.m11111f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, Object obj) {
            Parcelable[] parcelableArr = (Parcelable[]) obj;
            C5207g.m11111f(str, "key");
            this.f9455m.cast(parcelableArr);
            bundle.putParcelableArray(str, parcelableArr);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C5207g.m11106a(m.class, obj.getClass())) {
                return false;
            }
            return C5207g.m11106a(this.f9455m, ((m) obj).f9455m);
        }

        public final int hashCode() {
            return this.f9455m.hashCode();
        }
    }

    /* JADX INFO: renamed from: c4.q$n */
    public static final class n<D> extends AbstractC1692q<D> {

        /* JADX INFO: renamed from: m */
        public final Class<D> f9456m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Class<D> cls) {
            super(true);
            boolean z10 = true;
            if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
                z10 = false;
            }
            if (z10) {
                this.f9456m = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Parcelable or Serializable.").toString());
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final D mo5419a(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return this.f9456m.getName();
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final D mo5423e(String str) {
            C5207g.m11111f(str, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, D d10) {
            C5207g.m11111f(str, "key");
            this.f9456m.cast(d10);
            if (d10 == null || (d10 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d10);
            } else if (d10 instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) d10);
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C5207g.m11106a(n.class, obj.getClass())) {
                return false;
            }
            return C5207g.m11106a(this.f9456m, ((n) obj).f9456m);
        }

        public final int hashCode() {
            return this.f9456m.hashCode();
        }
    }

    /* JADX INFO: renamed from: c4.q$o */
    public static final class o<D extends Serializable> extends AbstractC1692q<D[]> {

        /* JADX INFO: renamed from: m */
        public final Class<D[]> f9457m;

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public o(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            try {
                this.f9457m = (Class<D[]>) Class.forName("[L" + cls.getName() + ';');
            } catch (ClassNotFoundException e10) {
                throw new RuntimeException(e10);
            }
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final Object mo5419a(Bundle bundle, String str) {
            return (Serializable[]) bundle.get(str);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public final String mo5420b() {
            return this.f9457m.getName();
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: c */
        public final Object mo5423e(String str) {
            C5207g.m11111f(str, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v1, types: [java.io.Serializable, java.io.Serializable[], java.lang.Object] */
        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, Object obj) {
            ?? r10 = (Serializable[]) obj;
            C5207g.m11111f(str, "key");
            this.f9457m.cast(r10);
            bundle.putSerializable(str, r10);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !C5207g.m11106a(o.class, obj.getClass())) {
                return false;
            }
            return C5207g.m11106a(this.f9457m, ((o) obj).f9457m);
        }

        public final int hashCode() {
            return this.f9457m.hashCode();
        }
    }

    /* JADX INFO: renamed from: c4.q$p */
    public static class p<D extends Serializable> extends AbstractC1692q<D> {

        /* JADX INFO: renamed from: m */
        public final Class<D> f9458m;

        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
            }
            if (true ^ cls.isEnum()) {
                this.f9458m = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " is an Enum. You should use EnumType instead.").toString());
        }

        /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
        public p(Class cls, int i10) {
            super(false);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.f9458m = cls;
                return;
            }
            throw new IllegalArgumentException((cls + " does not implement Serializable.").toString());
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: a */
        public final Object mo5419a(Bundle bundle, String str) {
            return (Serializable) bundle.get(str);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: b */
        public String mo5420b() {
            return this.f9458m.getName();
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: d */
        public final void mo5422d(Bundle bundle, String str, Object obj) {
            Serializable serializable = (Serializable) obj;
            C5207g.m11111f(str, "key");
            C5207g.m11111f(serializable, "value");
            this.f9458m.cast(serializable);
            bundle.putSerializable(str, serializable);
        }

        @Override // p040c4.AbstractC1692q
        /* JADX INFO: renamed from: e */
        public D mo5423e(String str) {
            C5207g.m11111f(str, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            return C5207g.m11106a(this.f9458m, ((p) obj).f9458m);
        }

        public final int hashCode() {
            return this.f9458m.hashCode();
        }
    }

    public AbstractC1692q(boolean z10) {
        this.f9453a = z10;
    }

    /* JADX INFO: renamed from: a */
    public abstract T mo5419a(Bundle bundle, String str);

    /* JADX INFO: renamed from: b */
    public abstract String mo5420b();

    /* JADX INFO: renamed from: c */
    public abstract T mo5423e(String str);

    /* JADX INFO: renamed from: d */
    public abstract void mo5422d(Bundle bundle, String str, T t10);

    public final String toString() {
        return mo5420b();
    }
}
