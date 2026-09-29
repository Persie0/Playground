package p000;

import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yyc {
    /* JADX INFO: renamed from: a */
    public static final void m25385a(mo8 mo8Var, vi3 vi3Var, vi3 vi3Var2, ye1 ye1Var, int i) {
        vi3Var.getClass();
        vi3Var2.getClass();
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1641091987);
        int i2 = (tj3Var.m22120g(mo8Var) ? 4 : 2) | i | (tj3Var.m22124i(vi3Var) ? 32 : 16) | (tj3Var.m22124i(vi3Var2) ? 256 : 128);
        if (tj3Var.m22099R(i2 & 1, (i2 & 147) != 146)) {
            r46.m20381f(c99.m4412e(b16.f7762a, 1.0f), null, null, null, ci8.m4703P(-1193353475, new a05(mo8Var, vi3Var, vi3Var2, 12), tj3Var), tj3Var, 24582, 14);
        } else {
            tj3Var.m22102U();
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new lo6(i, 17, mo8Var, vi3Var, vi3Var2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m25386b(z21 z21Var, String str) {
        String string;
        z21Var.getClass();
        String str2 = "in the polymorphic scope of '" + z21Var.m25414c() + '\'';
        if (str == null) {
            string = ux5.m22986i('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder sbM23000w = ux5.m23000w("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            AbstractC3393o1.m17725C(sbM23000w, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            sbM23000w.append(z21Var.m25414c());
            sbM23000w.append("' has to be sealed and '@Serializable'.");
            string = sbM23000w.toString();
        }
        throw new SerializationException(string);
    }
}
