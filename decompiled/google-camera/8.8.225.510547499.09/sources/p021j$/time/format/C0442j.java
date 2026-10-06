package p021j$.time.format;

import p021j$.time.temporal.EnumC0472a;

/* JADX INFO: renamed from: j$.time.format.j */
/* JADX INFO: loaded from: classes3.dex */
final class C0442j implements InterfaceC0439g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f32940a;

    /* JADX INFO: renamed from: b */
    private final Object f32941b;

    public /* synthetic */ C0442j(int i, Object obj) {
        this.f32940a = i;
        this.f32941b = obj;
    }

    /* JADX INFO: renamed from: b */
    private static void m12281b(StringBuilder sb, int i) {
        sb.append((char) ((i / 10) + 48));
        sb.append((char) ((i % 10) + 48));
    }

    @Override // p021j$.time.format.InterfaceC0439g
    /* JADX INFO: renamed from: a */
    public final boolean mo12277a(C0455w c0455w, StringBuilder sb) {
        int i = this.f32940a;
        Object obj = this.f32941b;
        switch (i) {
            case 0:
                Long lM12313e = c0455w.m12313e(EnumC0472a.OFFSET_SECONDS);
                if (lM12313e == null) {
                    return false;
                }
                sb.append("GMT");
                long jLongValue = lM12313e.longValue();
                int i2 = (int) jLongValue;
                if (jLongValue != i2) {
                    throw new ArithmeticException();
                }
                if (i2 == 0) {
                    return true;
                }
                int iAbs = Math.abs((i2 / 3600) % 100);
                int iAbs2 = Math.abs((i2 / 60) % 60);
                int iAbs3 = Math.abs(i2 % 60);
                sb.append(i2 < 0 ? "-" : "+");
                if (((EnumC0432C) obj) == EnumC0432C.FULL) {
                    m12281b(sb, iAbs);
                    sb.append(':');
                    m12281b(sb, iAbs2);
                    if (iAbs3 == 0) {
                        return true;
                    }
                } else {
                    if (iAbs >= 10) {
                        sb.append((char) ((iAbs / 10) + 48));
                    }
                    sb.append((char) ((iAbs % 10) + 48));
                    if (iAbs2 == 0 && iAbs3 == 0) {
                        return true;
                    }
                    sb.append(':');
                    m12281b(sb, iAbs2);
                    if (iAbs3 == 0) {
                        return true;
                    }
                }
                sb.append(':');
                m12281b(sb, iAbs3);
                return true;
            default:
                sb.append((String) obj);
                return true;
        }
    }

    public final String toString() {
        int i = this.f32940a;
        Object obj = this.f32941b;
        switch (i) {
            case 0:
                return "LocalizedOffset(" + String.valueOf((EnumC0432C) obj) + ")";
            default:
                return "'" + ((String) obj).replace("'", "''") + "'";
        }
    }
}
