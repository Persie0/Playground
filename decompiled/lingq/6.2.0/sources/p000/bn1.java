package p000;

import android.view.autofill.AutofillValue;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bn1 implements vi3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8710a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cn1 f8711b;

    public /* synthetic */ bn1(cn1 cn1Var, tv8 tv8Var) {
        this.f8710a = 3;
        this.f8711b = cn1Var;
    }

    @Override // p000.vi3
    public final Object invoke(Object obj) {
        int i = this.f8710a;
        boolean z = false;
        cn1 cn1Var = this.f8711b;
        switch (i) {
            case 0:
                t66 t66Var = cn1Var.f10308N.f70588t;
                Boolean bool = Boolean.TRUE;
                ((xc9) t66Var).setValue(bool);
                ((xc9) cn1Var.f10308N.f70587s).setValue(bool);
                yw4 yw4Var = cn1Var.f10308N;
                AutofillValue autofillValue = ((C0848ci) obj).f10108a;
                CharSequence textValue = autofillValue.isText() ? autofillValue.getTextValue() : null;
                textValue.getClass();
                cn1.m4882c1(yw4Var, (String) textValue, cn1Var.f10309O);
                return bool;
            case 1:
                List list = (List) obj;
                if (cn1Var.f10308N.m25363d() != null) {
                    sw9 sw9VarM25363d = cn1Var.f10308N.m25363d();
                    sw9VarM25363d.getClass();
                    list.add(sw9VarM25363d.f61519a);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                cn1.m4882c1(cn1Var.f10308N, ((C3419on) obj).f54604b, cn1Var.f10309O);
                return Boolean.TRUE;
            default:
                C3419on c3419on = (C3419on) obj;
                if (cn1Var.f10309O) {
                    hw9 hw9Var = cn1Var.f10308N.f70573e;
                    if (hw9Var != null) {
                        List listM23605K = vz1.m23605K(new k43(), new hb1(c3419on, 1));
                        yw4 yw4Var2 = cn1Var.f10308N;
                        bl2 bl2Var = yw4Var2.f70572d;
                        sm1 sm1Var = yw4Var2.f70590v;
                        vv9 vv9VarM3856m = bl2Var.m3856m(listM23605K);
                        hw9Var.m13542a(null, vv9VarM3856m);
                        sm1Var.invoke(vv9VarM3856m);
                    } else {
                        vv9 vv9Var = cn1Var.f10307M;
                        String str = vv9Var.f65990a.f54604b;
                        long j = vv9Var.f65991b;
                        int i2 = cx9.f34693c;
                        String string = vk9.m23400w0(str, (int) (j >> 32), (int) (j & 4294967295L), c3419on).toString();
                        int length = c3419on.f54604b.length() + ((int) (cn1Var.f10307M.f65991b >> 32));
                        cn1Var.f10308N.f70590v.invoke(new vv9(string, 4, eh0.m11127g(length, length)));
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ bn1(cn1 cn1Var, int i) {
        this.f8710a = i;
        this.f8711b = cn1Var;
    }
}
