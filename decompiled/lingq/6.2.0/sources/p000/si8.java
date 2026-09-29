package p000;

import androidx.compose.p002ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class si8 implements o39, w94 {

    /* JADX INFO: renamed from: a */
    public final gn1 f60901a;

    /* JADX INFO: renamed from: b */
    public final gn1 f60902b;

    /* JADX INFO: renamed from: c */
    public final gn1 f60903c;

    /* JADX INFO: renamed from: d */
    public final gn1 f60904d;

    public si8(gn1 gn1Var, gn1 gn1Var2, gn1 gn1Var3, gn1 gn1Var4) {
        this.f60901a = gn1Var;
        this.f60902b = gn1Var2;
        this.f60903c = gn1Var3;
        this.f60904d = gn1Var4;
    }

    /* JADX INFO: renamed from: c */
    public static si8 m21397c(si8 si8Var, gn1 gn1Var, gn1 gn1Var2, gn1 gn1Var3, gn1 gn1Var4, int i) {
        if ((i & 1) != 0) {
            gn1Var = si8Var.f60901a;
        }
        if ((i & 2) != 0) {
            gn1Var2 = si8Var.f60902b;
        }
        if ((i & 4) != 0) {
            gn1Var3 = si8Var.f60903c;
        }
        if ((i & 8) != 0) {
            gn1Var4 = si8Var.f60904d;
        }
        si8Var.getClass();
        return new si8(gn1Var, gn1Var2, gn1Var3, gn1Var4);
    }

    @Override // p000.w94
    /* JADX INFO: renamed from: a */
    public final Object mo11319a(Object obj, float f) {
        if (fa4.m11650l(obj, ss5.f61356d) || obj == null) {
            si8 si8Var = ui8.f63972a;
            pp7 pp7Var = new pp7();
            obj = new si8(pp7Var, pp7Var, pp7Var, pp7Var);
        }
        if (!(obj instanceof si8)) {
            return null;
        }
        si8 si8Var2 = (si8) obj;
        si8 si8Var3 = ui8.f63972a;
        return new si8(new ti8(this.f60901a, si8Var2.f60901a, f), new ti8(this.f60902b, si8Var2.f60902b, f), new ti8(this.f60903c, si8Var2.f60903c, f), new ti8(this.f60904d, si8Var2.f60904d, f));
    }

    @Override // p000.o39
    /* JADX INFO: renamed from: b */
    public final pk9 mo12726b(long j, LayoutDirection layoutDirection, fb2 fb2Var) {
        float fMo12761a = this.f60901a.mo12761a(j, fb2Var);
        float fMo12761a2 = this.f60902b.mo12761a(j, fb2Var);
        float fMo12761a3 = this.f60903c.mo12761a(j, fb2Var);
        float fMo12761a4 = this.f60904d.mo12761a(j, fb2Var);
        float fM24406c = x89.m24406c(j);
        float f = fMo12761a + fMo12761a4;
        if (f > fM24406c) {
            float f2 = fM24406c / f;
            fMo12761a *= f2;
            fMo12761a4 *= f2;
        }
        float f3 = fMo12761a2 + fMo12761a3;
        if (f3 > fM24406c) {
            float f4 = fM24406c / f3;
            fMo12761a2 *= f4;
            fMo12761a3 *= f4;
        }
        if (fMo12761a < 0.0f || fMo12761a2 < 0.0f || fMo12761a3 < 0.0f || fMo12761a4 < 0.0f) {
            l54.m15814a("Corner size in Px can't be negative(topStart = " + fMo12761a + ", topEnd = " + fMo12761a2 + ", bottomEnd = " + fMo12761a3 + ", bottomStart = " + fMo12761a4 + ")!");
        }
        if (fMo12761a + fMo12761a2 + fMo12761a3 + fMo12761a4 == 0.0f) {
            return new b07(wfb.m23907b(0L, j));
        }
        e28 e28VarM23907b = wfb.m23907b(0L, j);
        LayoutDirection layoutDirection2 = LayoutDirection.Ltr;
        float f5 = layoutDirection == layoutDirection2 ? fMo12761a : fMo12761a2;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
        if (layoutDirection == layoutDirection2) {
            fMo12761a = fMo12761a2;
        }
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fMo12761a)) << 32) | (((long) Float.floatToRawIntBits(fMo12761a)) & 4294967295L);
        float f6 = layoutDirection == layoutDirection2 ? fMo12761a3 : fMo12761a4;
        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f6)) << 32) | (((long) Float.floatToRawIntBits(f6)) & 4294967295L);
        if (layoutDirection != layoutDirection2) {
            fMo12761a4 = fMo12761a3;
        }
        return new c07(new mi8(e28VarM23907b.f36620a, e28VarM23907b.f36621b, e28VarM23907b.f36622c, e28VarM23907b.f36623d, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fMo12761a4)) << 32) | (((long) Float.floatToRawIntBits(fMo12761a4)) & 4294967295L)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si8)) {
            return false;
        }
        si8 si8Var = (si8) obj;
        return fa4.m11650l(this.f60901a, si8Var.f60901a) && fa4.m11650l(this.f60902b, si8Var.f60902b) && fa4.m11650l(this.f60903c, si8Var.f60903c) && fa4.m11650l(this.f60904d, si8Var.f60904d);
    }

    public final int hashCode() {
        return this.f60904d.hashCode() + ((this.f60903c.hashCode() + ((this.f60902b.hashCode() + (this.f60901a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RoundedCornerShape(topStart = " + this.f60901a + ", topEnd = " + this.f60902b + ", bottomEnd = " + this.f60903c + ", bottomStart = " + this.f60904d + ')';
    }
}
