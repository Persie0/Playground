package kn;

import androidx.datastore.preferences.PreferencesProto$Value;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$MemberKind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Modality;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Visibility;
import kotlin.reflect.jvm.internal.impl.protobuf.C6995f;

/* JADX INFO: renamed from: kn.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C6732b {

    /* JADX INFO: renamed from: A */
    public static final a f37950A;

    /* JADX INFO: renamed from: B */
    public static final a f37951B;

    /* JADX INFO: renamed from: C */
    public static final a f37952C;

    /* JADX INFO: renamed from: D */
    public static final a f37953D;

    /* JADX INFO: renamed from: E */
    public static final a f37954E;

    /* JADX INFO: renamed from: F */
    public static final a f37955F;

    /* JADX INFO: renamed from: G */
    public static final a f37956G;

    /* JADX INFO: renamed from: H */
    public static final a f37957H;

    /* JADX INFO: renamed from: I */
    public static final a f37958I;

    /* JADX INFO: renamed from: J */
    public static final a f37959J;

    /* JADX INFO: renamed from: K */
    public static final a f37960K;

    /* JADX INFO: renamed from: L */
    public static final a f37961L;

    /* JADX INFO: renamed from: M */
    public static final a f37962M;

    /* JADX INFO: renamed from: a */
    public static final a f37963a;

    /* JADX INFO: renamed from: b */
    public static final a f37964b;

    /* JADX INFO: renamed from: c */
    public static final a f37965c;

    /* JADX INFO: renamed from: d */
    public static final b f37966d;

    /* JADX INFO: renamed from: e */
    public static final b f37967e;

    /* JADX INFO: renamed from: f */
    public static final b f37968f;

    /* JADX INFO: renamed from: g */
    public static final a f37969g;

    /* JADX INFO: renamed from: h */
    public static final a f37970h;

    /* JADX INFO: renamed from: i */
    public static final a f37971i;

    /* JADX INFO: renamed from: j */
    public static final a f37972j;

    /* JADX INFO: renamed from: k */
    public static final a f37973k;

    /* JADX INFO: renamed from: l */
    public static final a f37974l;

    /* JADX INFO: renamed from: m */
    public static final a f37975m;

    /* JADX INFO: renamed from: n */
    public static final a f37976n;

    /* JADX INFO: renamed from: o */
    public static final b f37977o;

    /* JADX INFO: renamed from: p */
    public static final a f37978p;

    /* JADX INFO: renamed from: q */
    public static final a f37979q;

    /* JADX INFO: renamed from: r */
    public static final a f37980r;

    /* JADX INFO: renamed from: s */
    public static final a f37981s;

    /* JADX INFO: renamed from: t */
    public static final a f37982t;

    /* JADX INFO: renamed from: u */
    public static final a f37983u;

    /* JADX INFO: renamed from: v */
    public static final a f37984v;

    /* JADX INFO: renamed from: w */
    public static final a f37985w;

    /* JADX INFO: renamed from: x */
    public static final a f37986x;

    /* JADX INFO: renamed from: y */
    public static final a f37987y;

    /* JADX INFO: renamed from: z */
    public static final a f37988z;

    /* JADX INFO: renamed from: kn.b$a */
    public static class a extends c<Boolean> {
        public a(int i10) {
            super(i10, 1);
        }

        /* JADX INFO: renamed from: c */
        public final Boolean m13346c(int i10) {
            Boolean boolValueOf = Boolean.valueOf((i10 & (1 << this.f37990a)) != 0);
            if (boolValueOf != null) {
                return boolValueOf;
            }
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$BooleanFlagField", "get"));
        }

        /* JADX INFO: renamed from: d */
        public final int m13347d(Boolean bool) {
            if (bool.booleanValue()) {
                return 1 << this.f37990a;
            }
            return 0;
        }
    }

    /* JADX INFO: renamed from: kn.b$b */
    public static class b<E extends C6995f.a> extends c<E> {

        /* JADX INFO: renamed from: c */
        public final E[] f37989c;

        /* JADX WARN: Illegal instructions before constructor call */
        /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
        public b(int i10, E[] eArr) {
            int i11 = 1;
            if (eArr == null) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "enumEntries", "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField", "bitWidth"));
            }
            int length = eArr.length - 1;
            if (length != 0) {
                for (int i12 = 31; i12 >= 0; i12--) {
                    if (((1 << i12) & length) != 0) {
                        i11 = 1 + i12;
                    }
                }
                throw new IllegalStateException("Empty enum: " + eArr.getClass());
            }
            super(i10, i11);
            this.f37989c = eArr;
        }

        /* JADX INFO: renamed from: c */
        public final Object m13348c(int i10) {
            int i11 = (1 << this.f37991b) - 1;
            int i12 = this.f37990a;
            int i13 = (i10 & (i11 << i12)) >> i12;
            for (E e10 : this.f37989c) {
                if (e10.getNumber() == i13) {
                    return e10;
                }
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: kn.b$c */
    public static abstract class c<E> {

        /* JADX INFO: renamed from: a */
        public final int f37990a;

        /* JADX INFO: renamed from: b */
        public final int f37991b;

        public c(int i10, int i11) {
            this.f37990a = i10;
            this.f37991b = i11;
        }

        /* JADX INFO: renamed from: a */
        public static a m13349a(c<?> cVar) {
            return new a(cVar.f37990a + cVar.f37991b);
        }

        /* JADX INFO: renamed from: b */
        public static a m13350b() {
            return new a(0);
        }
    }

    static {
        a aVarM13350b = c.m13350b();
        f37963a = aVarM13350b;
        f37964b = c.m13349a(aVarM13350b);
        a aVarM13350b2 = c.m13350b();
        f37965c = aVarM13350b2;
        b bVar = new b(1, ProtoBuf$Visibility.values());
        f37966d = bVar;
        ProtoBuf$Modality[] protoBuf$ModalityArrValues = ProtoBuf$Modality.values();
        int i10 = 1 + bVar.f37991b;
        b bVar2 = new b(i10, protoBuf$ModalityArrValues);
        f37967e = bVar2;
        ProtoBuf$Class.Kind[] kindArrValues = ProtoBuf$Class.Kind.values();
        int i11 = bVar2.f37991b;
        b bVar3 = new b(i10 + i11, kindArrValues);
        f37968f = bVar3;
        a aVarM13349a = c.m13349a(bVar3);
        f37969g = aVarM13349a;
        a aVarM13349a2 = c.m13349a(aVarM13349a);
        f37970h = aVarM13349a2;
        a aVarM13349a3 = c.m13349a(aVarM13349a2);
        f37971i = aVarM13349a3;
        a aVarM13349a4 = c.m13349a(aVarM13349a3);
        f37972j = aVarM13349a4;
        a aVarM13349a5 = c.m13349a(aVarM13349a4);
        f37973k = aVarM13349a5;
        f37974l = c.m13349a(aVarM13349a5);
        a aVarM13349a6 = c.m13349a(bVar);
        f37975m = aVarM13349a6;
        f37976n = c.m13349a(aVarM13349a6);
        b bVar4 = new b(i10 + i11, ProtoBuf$MemberKind.values());
        f37977o = bVar4;
        a aVarM13349a7 = c.m13349a(bVar4);
        f37978p = aVarM13349a7;
        a aVarM13349a8 = c.m13349a(aVarM13349a7);
        f37979q = aVarM13349a8;
        a aVarM13349a9 = c.m13349a(aVarM13349a8);
        f37980r = aVarM13349a9;
        a aVarM13349a10 = c.m13349a(aVarM13349a9);
        f37981s = aVarM13349a10;
        a aVarM13349a11 = c.m13349a(aVarM13349a10);
        f37982t = aVarM13349a11;
        a aVarM13349a12 = c.m13349a(aVarM13349a11);
        f37983u = aVarM13349a12;
        a aVarM13349a13 = c.m13349a(aVarM13349a12);
        f37984v = aVarM13349a13;
        f37985w = c.m13349a(aVarM13349a13);
        a aVarM13349a14 = c.m13349a(bVar4);
        f37986x = aVarM13349a14;
        a aVarM13349a15 = c.m13349a(aVarM13349a14);
        f37987y = aVarM13349a15;
        a aVarM13349a16 = c.m13349a(aVarM13349a15);
        f37988z = aVarM13349a16;
        a aVarM13349a17 = c.m13349a(aVarM13349a16);
        f37950A = aVarM13349a17;
        a aVarM13349a18 = c.m13349a(aVarM13349a17);
        f37951B = aVarM13349a18;
        a aVarM13349a19 = c.m13349a(aVarM13349a18);
        f37952C = aVarM13349a19;
        a aVarM13349a20 = c.m13349a(aVarM13349a19);
        f37953D = aVarM13349a20;
        a aVarM13349a21 = c.m13349a(aVarM13349a20);
        f37954E = aVarM13349a21;
        f37955F = c.m13349a(aVarM13349a21);
        a aVarM13349a22 = c.m13349a(aVarM13350b2);
        f37956G = aVarM13349a22;
        a aVarM13349a23 = c.m13349a(aVarM13349a22);
        f37957H = aVarM13349a23;
        f37958I = c.m13349a(aVarM13349a23);
        a aVarM13349a24 = c.m13349a(bVar2);
        f37959J = aVarM13349a24;
        a aVarM13349a25 = c.m13349a(aVarM13349a24);
        f37960K = aVarM13349a25;
        f37961L = c.m13349a(aVarM13349a25);
        f37962M = c.m13350b();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0029  */
    /* JADX WARN: Code duplicated, block: B:18:0x0036  */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m13345a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "modality";
        } else if (i10 == 2) {
            objArr[0] = "kind";
        } else if (i10 == 5) {
            objArr[0] = "modality";
        } else if (i10 == 6) {
            objArr[0] = "memberKind";
        } else if (i10 == 8) {
            objArr[0] = "modality";
        } else if (i10 == 9) {
            objArr[0] = "memberKind";
        } else if (i10 != 11) {
            objArr[0] = "visibility";
        } else {
            objArr[0] = "modality";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags";
        switch (i10) {
            case 3:
                objArr[2] = "getConstructorFlags";
                break;
            case 4:
            case 5:
            case PreferencesProto$Value.STRING_SET_FIELD_NUMBER /* 6 */:
                objArr[2] = "getFunctionFlags";
                break;
            case PreferencesProto$Value.DOUBLE_FIELD_NUMBER /* 7 */:
            case 8:
            case 9:
                objArr[2] = "getPropertyFlags";
                break;
            case 10:
            case 11:
                objArr[2] = "getAccessorFlags";
                break;
            default:
                objArr[2] = "getClassFlags";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }
}
