package kotlinx.datetime.internal.format;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import p000.AbstractC3021g0;
import p000.C3386nv;
import p000.cg1;
import p000.cha;
import p000.d33;
import p000.pc3;
import p000.qzb;
import p000.s87;
import p000.t47;
import p000.ux5;
import p000.v63;
import p000.vn7;
import p000.vz1;
import p000.zo6;

/* JADX INFO: renamed from: kotlinx.datetime.internal.format.d */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3259d implements d33 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3021g0 f48231a;

    /* JADX INFO: renamed from: b */
    public final Integer f48232b;

    /* JADX INFO: renamed from: c */
    public final Integer f48233c;

    public AbstractC3259d(AbstractC3021g0 abstractC3021g0, Integer num, Integer num2) {
        abstractC3021g0.getClass();
        this.f48231a = abstractC3021g0;
        this.f48232b = num;
        this.f48233c = num2;
        if (num.intValue() >= 0) {
            return;
        }
        v63.m23135m("The minimum number of digits (", num, ") is negative");
        throw null;
    }

    @Override // p000.d33
    /* JADX INFO: renamed from: a */
    public final pc3 mo10071a() {
        this.f48231a.mo3720a();
        int iIntValue = this.f48232b.intValue();
        cg1 cg1Var = new cg1();
        if (iIntValue < 0) {
            C3386nv.m17624j(ux5.m22989l("The minimum number of digits (", iIntValue, ") is negative"));
            return null;
        }
        if (iIntValue <= 9) {
            return this.f48233c != null ? new cg1() : cg1Var;
        }
        C3386nv.m17624j(ux5.m22989l("The minimum number of digits (", iIntValue, ") exceeds the length of an Int"));
        return null;
    }

    @Override // p000.d33
    /* JADX INFO: renamed from: b */
    public final t47 mo10072b() {
        AbstractC3021g0 abstractC3021g0 = this.f48231a;
        vn7 vn7VarMo3720a = abstractC3021g0.mo3720a();
        String strMo3722c = abstractC3021g0.mo3722c();
        vn7VarMo3720a.getClass();
        strMo3722c.getClass();
        Integer num = this.f48232b;
        Integer num2 = this.f48233c;
        ArrayList arrayListM23608N = vz1.m23608N(qzb.m20222a(num, null, num2, vn7VarMo3720a, strMo3722c, true));
        arrayListM23608N.add(qzb.m20222a(num, 4, num2, vn7VarMo3720a, strMo3722c, false));
        List listM23605K = vz1.m23605K(new s87("+"), new zo6(vz1.m23604J(new cha(5, null, vn7VarMo3720a, strMo3722c, false))));
        EmptyList emptyList = EmptyList.f47638a;
        arrayListM23608N.add(new t47(listM23605K, emptyList));
        return new t47(emptyList, arrayListM23608N);
    }

    @Override // p000.d33
    /* JADX INFO: renamed from: c */
    public final AbstractC3021g0 mo10073c() {
        return this.f48231a;
    }
}
