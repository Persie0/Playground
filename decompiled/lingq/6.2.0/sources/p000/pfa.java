package p000;

import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.internal.WriteMode;

/* JADX INFO: loaded from: classes.dex */
public abstract class pfa {
    /* JADX INFO: renamed from: a */
    public static final SerialDescriptor m19111a(SerialDescriptor serialDescriptor, w41 w41Var) {
        SerialDescriptor serialDescriptorM19111a;
        KSerializer kSerializerM23727o;
        serialDescriptor.getClass();
        w41Var.getClass();
        if (!fa4.m11650l(serialDescriptor.getKind(), cy8.f34711y)) {
            return serialDescriptor.mo10855g() ? m19111a(serialDescriptor.mo3700i(0), w41Var) : serialDescriptor;
        }
        z21 z21VarM4432a = c9d.m4432a(serialDescriptor);
        SerialDescriptor descriptor = null;
        if (z21VarM4432a != null && (kSerializerM23727o = w41Var.m23727o(z21VarM4432a, EmptyList.f47638a)) != null) {
            descriptor = kSerializerM23727o.getDescriptor();
        }
        return (descriptor == null || (serialDescriptorM19111a = m19111a(descriptor, w41Var)) == null) ? serialDescriptor : serialDescriptorM19111a;
    }

    /* JADX INFO: renamed from: b */
    public static final Object m19112b(cn8 cn8Var, boolean z, cn8 cn8Var2, zi3 zi3Var) {
        Object dc1Var;
        Object objM15506Z;
        try {
            if (zi3Var instanceof BaseContinuationImpl) {
                lda.m16119e(2, zi3Var);
                dc1Var = zi3Var.invoke(cn8Var2, cn8Var);
            } else {
                dc1Var = AbstractC3584sr.m21631i0(zi3Var, cn8Var2, cn8Var);
            }
        } catch (DispatchException e) {
            Throwable th = e.f47748a;
            cn8Var.m15505Y(new dc1(th, false));
            throw th;
        } catch (Throwable th2) {
            dc1Var = new dc1(th2, false);
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (dc1Var == coroutineSingletons || (objM15506Z = cn8Var.m15506Z(dc1Var)) == AbstractC3584sr.f61279f) {
            return coroutineSingletons;
        }
        cn8Var.mo4899q0();
        if (!(objM15506Z instanceof dc1)) {
            return AbstractC3584sr.m21629h0(objM15506Z);
        }
        if (!z) {
            Throwable th3 = ((dc1) objM15506Z).f35375a;
            if ((th3 instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th3).f47759a == cn8Var) {
                if (dc1Var instanceof dc1) {
                    throw ((dc1) dc1Var).f35375a;
                }
                return dc1Var;
            }
        }
        throw ((dc1) objM15506Z).f35375a;
    }

    /* JADX INFO: renamed from: c */
    public static final WriteMode m19113c(df4 df4Var, SerialDescriptor serialDescriptor) {
        serialDescriptor.getClass();
        AbstractC3184kh kind = serialDescriptor.getKind();
        if (kind instanceof vg7) {
            return WriteMode.POLY_OBJ;
        }
        if (fa4.m11650l(kind, hl9.f42586z)) {
            return WriteMode.LIST;
        }
        if (!fa4.m11650l(kind, hl9.f42583A)) {
            return WriteMode.OBJ;
        }
        SerialDescriptor serialDescriptorM19111a = m19111a(serialDescriptor.mo3700i(0), df4Var.f35561b);
        AbstractC3184kh kind2 = serialDescriptorM19111a.getKind();
        if ((kind2 instanceof ak7) || fa4.m11650l(kind2, dy8.f36425y)) {
            return WriteMode.MAP;
        }
        throw fa4.m11641b(serialDescriptorM19111a);
    }

    /* JADX INFO: renamed from: d */
    public static final wta m19114d(z21 z21Var, dua duaVar, String str, nt3 nt3Var, qr1 qr1Var, ye1 ye1Var) {
        m58 m58VarM21061i;
        if (nt3Var != null) {
            cua cuaVarMo2116r = duaVar.mo2116r();
            cuaVarMo2116r.getClass();
            qr1Var.getClass();
            m58VarM21061i = new m58(cuaVarMo2116r, nt3Var, qr1Var);
        } else if (duaVar instanceof gr3) {
            cua cuaVarMo2116r2 = duaVar.mo2116r();
            zta ztaVarMo2102d = ((gr3) duaVar).mo2102d();
            cuaVarMo2116r2.getClass();
            ztaVarMo2102d.getClass();
            qr1Var.getClass();
            m58VarM21061i = new m58(cuaVarMo2116r2, ztaVarMo2102d, qr1Var);
        } else {
            m58VarM21061i = s46.m21061i(duaVar, null, 6);
        }
        return str != null ? ((ny8) m58VarM21061i.f50618b).m17675B(z21Var, str) : m58VarM21061i.m16643g(z21Var);
    }
}
