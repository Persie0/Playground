package p000;

import android.hardware.camera2.CaptureResult;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kxt {

    /* JADX INFO: renamed from: a */
    public final long f37674a;

    /* JADX INFO: renamed from: b */
    public final int f37675b;

    public kxt(long j, int i) {
        this.f37674a = j;
        this.f37675b = i;
    }

    /* JADX INFO: renamed from: f */
    private static mxk m15037f(int i) {
        if (i == 1) {
            return mxk.m17137I(0, 3);
        }
        return m15038g(i) ? mxk.m17139K(0, 1, 2, 6) : mxk.m17136H(0);
    }

    /* JADX INFO: renamed from: g */
    private static boolean m15038g(int i) {
        return i == 4 || i == 3;
    }

    /* JADX INFO: renamed from: a */
    public final kgc m15039a(CaptureResult.Key key, mxk mxkVar) {
        return new kgc(key, mxkVar, this.f37674a, this.f37675b);
    }

    /* JADX INFO: renamed from: b */
    public final kih m15040b(kex kexVar, boolean z, boolean z2, boolean z3) {
        HashSet hashSet = new HashSet();
        hashSet.add(m15039a(CaptureResult.CONTROL_AF_MODE, mxk.m17136H(kexVar.mo14092b())));
        if (z) {
            hashSet.add(m15039a(CaptureResult.CONTROL_AF_STATE, m15037f(kexVar.mo14092b().intValue())));
        }
        hashSet.add(m15039a(CaptureResult.CONTROL_AE_MODE, mxk.m17136H(kexVar.mo14091a())));
        if (z2) {
            hashSet.add(m15039a(CaptureResult.CONTROL_AE_STATE, kexVar.mo14091a().intValue() != 0 ? mxk.m17140L(0, 1, 2, 4, 5) : mxk.m17136H(0)));
        }
        hashSet.add(m15039a(CaptureResult.CONTROL_AWB_MODE, mxk.m17136H(kexVar.mo14093c())));
        if (z3) {
            hashSet.add(m15039a(CaptureResult.CONTROL_AWB_STATE, kexVar.mo14093c().intValue() != 0 ? mxk.m17138J(0, 1, 2) : mxk.m17136H(0)));
        }
        hashSet.add(m15039a(CaptureResult.FLASH_MODE, mxk.m17136H(kexVar.mo14095e())));
        if (kexVar.mo14095e().intValue() == 2) {
            hashSet.add(m15039a(CaptureResult.FLASH_STATE, mxk.m17137I(3, 0)));
        } else if (kexVar.mo14095e().intValue() == 0) {
            hashSet.add(m15039a(CaptureResult.FLASH_STATE, mxk.m17137I(2, 0)));
        }
        return new kih(mxk.m17134F(hashSet));
    }

    /* JADX INFO: renamed from: c */
    public final kih m15041c(kex kexVar, boolean z, boolean z2, boolean z3) {
        mxk mxkVarM17138J;
        HashSet hashSet = new HashSet();
        hashSet.add(m15039a(CaptureResult.CONTROL_AF_MODE, mxk.m17136H(kexVar.mo14092b())));
        if (z) {
            CaptureResult.Key key = CaptureResult.CONTROL_AF_STATE;
            int iIntValue = kexVar.mo14092b().intValue();
            if (iIntValue == 1) {
                mxkVarM17138J = m15037f(1);
            } else {
                mxkVarM17138J = m15038g(iIntValue) ? mxk.m17138J(0, 2, 6) : mxk.m17136H(0);
            }
            hashSet.add(m15039a(key, mxkVarM17138J));
        }
        hashSet.add(m15039a(CaptureResult.CONTROL_AE_MODE, mxk.m17136H(kexVar.mo14091a())));
        if (z2) {
            hashSet.add(m15039a(CaptureResult.CONTROL_AE_STATE, kexVar.mo14091a().intValue() != 0 ? mxk.m17137I(2, 4) : mxk.m17136H(0)));
        }
        hashSet.add(m15039a(CaptureResult.CONTROL_AWB_MODE, mxk.m17136H(kexVar.mo14093c())));
        if (z3) {
            hashSet.add(m15039a(CaptureResult.CONTROL_AWB_STATE, kexVar.mo14093c().intValue() == 1 ? mxk.m17136H(2) : mxk.m17136H(0)));
        }
        return new kih(mxk.m17134F(hashSet));
    }

    /* JADX INFO: renamed from: d */
    public final kih m15042d(kex kexVar, boolean z, boolean z2, boolean z3) {
        return new kih(mxk.m17134F(m15043e(kexVar, z, z2, z3)));
    }

    /* JADX INFO: renamed from: e */
    public final Set m15043e(kex kexVar, boolean z, boolean z2, boolean z3) {
        HashSet hashSet = new HashSet();
        hashSet.add(m15039a(CaptureResult.CONTROL_AF_MODE, mxk.m17136H(kexVar.mo14092b())));
        if (z) {
            hashSet.add(m15039a(CaptureResult.CONTROL_AF_STATE, kexVar.mo14092b().intValue() == 0 ? mxk.m17136H(0) : mxk.m17137I(4, 5)));
        }
        hashSet.add(m15039a(CaptureResult.CONTROL_AE_MODE, mxk.m17136H(kexVar.mo14091a())));
        if (z2) {
            hashSet.add(m15039a(CaptureResult.CONTROL_AE_STATE, kexVar.mo14091a().intValue() == 0 ? mxk.m17136H(0) : mxk.m17136H(3)));
        }
        hashSet.add(m15039a(CaptureResult.CONTROL_AWB_MODE, mxk.m17136H(kexVar.mo14093c())));
        if (z3) {
            hashSet.add(m15039a(CaptureResult.CONTROL_AWB_STATE, kexVar.mo14093c().intValue() == 0 ? mxk.m17136H(0) : mxk.m17136H(3)));
        }
        return hashSet;
    }
}
