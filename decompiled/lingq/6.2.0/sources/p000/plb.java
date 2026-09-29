package p000;

import android.util.Log;

/* JADX INFO: loaded from: classes2.dex */
public final class plb extends aib {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f56424i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ plb(k58 k58Var, String str, Object obj, int i) {
        super(k58Var, str, obj);
        this.f56424i = i;
    }

    @Override // p000.aib
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object mo447c(String str) {
        switch (this.f56424i) {
            case 0:
                if (xmd.f68369c.matcher(str).matches()) {
                    return Boolean.TRUE;
                }
                if (xmd.f68370d.matcher(str).matches()) {
                    return Boolean.FALSE;
                }
                String str2 = this.f717b;
                StringBuilder sb = new StringBuilder(str.length() + String.valueOf(str2).length() + 28);
                sb.append("Invalid boolean value for ");
                sb.append(str2);
                sb.append(": ");
                sb.append(str);
                Log.e("PhenotypeFlag", sb.toString());
                return null;
            default:
                return str;
        }
    }
}
