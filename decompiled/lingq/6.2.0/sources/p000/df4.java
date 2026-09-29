package p000;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.internal.C3267c;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class df4 {

    /* JADX INFO: renamed from: d */
    public static final cf4 f35559d = new cf4(new kf4(false, false, false, true, "    ", "type", true, ClassDiscriminatorMode.POLYMORPHIC, true), iy8.f44783a);

    /* JADX INFO: renamed from: a */
    public final kf4 f35560a;

    /* JADX INFO: renamed from: b */
    public final w41 f35561b;

    /* JADX INFO: renamed from: c */
    public final ic2 f35562c = new ic2(0);

    public df4(kf4 kf4Var, w41 w41Var) {
        this.f35560a = kf4Var;
        this.f35561b = w41Var;
    }

    /* JADX INFO: renamed from: a */
    public final Object m10321a(String str, KSerializer kSerializer) {
        kSerializer.getClass();
        str.getClass();
        C3488q8 c3488q8M21988b = te1.m21988b(this, str);
        Object objMo15604w = new C3267c(this, WriteMode.OBJ, c3488q8M21988b, kSerializer.getDescriptor(), null).mo15604w(kSerializer);
        if (c3488q8M21988b.m19739g() == 10) {
            return objMo15604w;
        }
        C3488q8.m19714s(c3488q8M21988b, "Expected EOF after parsing, but had " + ((String) c3488q8M21988b.f57373g).charAt(c3488q8M21988b.f57368b - 1) + " instead", 0, null, 6);
        throw null;
    }

    /* JADX INFO: renamed from: b */
    public final String m10322b(KSerializer kSerializer, Object obj) {
        char[] cArr;
        kSerializer.getClass();
        C3126ix c3126ix = new C3126ix(5, (byte) 0);
        ou0 ou0Var = ou0.f54988c;
        synchronized (ou0Var) {
            C0825bv c0825bv = ou0Var.f54989a;
            cArr = null;
            char[] cArr2 = (char[]) (c0825bv.isEmpty() ? null : c0825bv.removeLast());
            if (cArr2 != null) {
                ou0Var.f54990b -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        c3126ix.f44721c = cArr;
        try {
            WriteMode writeMode = WriteMode.OBJ;
            mk9[] mk9VarArr = new mk9[WriteMode.getEntries().size()];
            writeMode.getClass();
            new mk9(new xe1(c3126ix), this, writeMode, mk9VarArr).mo15617m(kSerializer, obj);
            return c3126ix.toString();
        } finally {
            c3126ix.m14174j();
        }
    }
}
