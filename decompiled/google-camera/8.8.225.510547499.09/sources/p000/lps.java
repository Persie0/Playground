package p000;

import android.util.Base64;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lps extends lpv {
    public lps(lpt lptVar, String str, Object obj) {
        super(lptVar, str, obj, false);
    }

    @Override // p000.lpv
    /* JADX INFO: renamed from: a */
    public final Object mo15831a(Object obj) {
        try {
            byte[] bArrDecode = Base64.decode((String) obj, 3);
            nxq nxqVarM18123Q = nxq.m18123Q(oha.f46004b, bArrDecode, 0, bArrDecode.length, nxf.f44904a);
            nxq.m18132ae(nxqVarM18123Q);
            return (oha) nxqVarM18123Q;
        } catch (IOException | IllegalArgumentException e) {
            Log.e("PhenotypeFlag", "Invalid byte[] value for " + super.m15846f() + ": " + ((String) obj));
            return null;
        }
    }
}
