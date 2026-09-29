package kotlinx.datetime.internal.format;

import java.util.List;
import kotlin.collections.EmptyList;
import p000.AbstractC3021g0;
import p000.d33;
import p000.ig1;
import p000.pc3;
import p000.t47;
import p000.vn7;
import p000.vz1;
import p000.zi1;
import p000.zo6;

/* JADX INFO: renamed from: kotlinx.datetime.internal.format.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3256a implements d33 {

    /* JADX INFO: renamed from: a */
    public final AbstractC3021g0 f48224a;

    /* JADX INFO: renamed from: b */
    public final List f48225b;

    public AbstractC3256a(AbstractC3021g0 abstractC3021g0, List list) {
        abstractC3021g0.getClass();
        this.f48224a = abstractC3021g0;
        this.f48225b = list;
    }

    @Override // p000.d33
    /* JADX INFO: renamed from: a */
    public final pc3 mo10071a() {
        return new ig1(new DecimalFractionFieldFormatDirective$formatter$1(1, this.f48224a.mo3720a(), vn7.class, "getterNotNull", "getterNotNull(Ljava/lang/Object;)Ljava/lang/Object;", 0), this.f48225b);
    }

    @Override // p000.d33
    /* JADX INFO: renamed from: b */
    public final t47 mo10072b() {
        AbstractC3021g0 abstractC3021g0 = this.f48224a;
        return new t47(vz1.m23604J(new zo6(vz1.m23604J(new zi1(abstractC3021g0.mo3720a(), abstractC3021g0.mo3722c())))), EmptyList.f47638a);
    }

    @Override // p000.d33
    /* JADX INFO: renamed from: c */
    public final AbstractC3021g0 mo10073c() {
        return this.f48224a;
    }
}
