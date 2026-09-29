package com.lingq.feature.challenges.bookchallenge;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.feature.challenges.domain.C1982a;
import com.lingq.feature.challenges.domain.C1983b;
import com.lingq.feature.challenges.domain.C1984c;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.af0;
import p000.bia;
import p000.c18;
import p000.c83;
import p000.cf0;
import p000.cma;
import p000.df0;
import p000.eh9;
import p000.lda;
import p000.nl8;
import p000.nn1;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.challenges.bookchallenge.c */
/* JADX INFO: loaded from: classes2.dex */
public final class C1972c extends wta implements cma, bia {
    private static final cf0 Companion = new cf0();

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f24542b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ bia f24543c;

    /* JADX INFO: renamed from: d */
    public final C1982a f24544d;

    /* JADX INFO: renamed from: e */
    public final C1984c f24545e;

    /* JADX INFO: renamed from: f */
    public final C1983b f24546f;

    /* JADX INFO: renamed from: g */
    public final nn1 f24547g;

    /* JADX INFO: renamed from: h */
    public final af0 f24548h;

    /* JADX INFO: renamed from: i */
    public final C3244l f24549i;

    /* JADX INFO: renamed from: j */
    public final c18 f24550j;

    /* JADX INFO: renamed from: k */
    public byte[] f24551k;

    public C1972c(C1982a c1982a, C1984c c1984c, C1983b c1983b, nn1 nn1Var, cma cmaVar, bia biaVar, nl8 nl8Var) {
        Boolean bool;
        Integer num;
        cmaVar.getClass();
        biaVar.getClass();
        nl8Var.getClass();
        this.f24542b = cmaVar;
        this.f24543c = biaVar;
        this.f24544d = c1982a;
        this.f24545e = c1984c;
        this.f24546f = c1983b;
        this.f24547g = nn1Var;
        af0.Companion.getClass();
        if (!nl8Var.m17487a("isJoined")) {
            C3386nv.m17626m("Required argument \"isJoined\" is missing and does not have an android:defaultValue");
            throw null;
        }
        Boolean bool2 = (Boolean) nl8Var.m17488b("isJoined");
        if (bool2 == null) {
            C3386nv.m17626m("Argument \"isJoined\" of type boolean does not support null values");
            throw null;
        }
        if (nl8Var.m17487a("multiBookEnabled")) {
            bool = (Boolean) nl8Var.m17488b("multiBookEnabled");
            if (bool == null) {
                C3386nv.m17626m("Argument \"multiBookEnabled\" of type boolean does not support null values");
                throw null;
            }
        } else {
            bool = Boolean.FALSE;
        }
        if (nl8Var.m17487a("replaceBookId")) {
            num = (Integer) nl8Var.m17488b("replaceBookId");
            if (num == null) {
                C3386nv.m17626m("Argument \"replaceBookId\" of type integer does not support null values");
                throw null;
            }
        } else {
            num = -1;
        }
        boolean zBooleanValue = bool2.booleanValue();
        boolean zBooleanValue2 = bool.booleanValue();
        int iIntValue = num.intValue();
        this.f24548h = new af0(iIntValue, zBooleanValue, zBooleanValue2);
        boolean z = iIntValue >= 0;
        int i = 255 & 2;
        EmptyList emptyList = EmptyList.f47638a;
        if (i == 0) {
            emptyList = null;
        }
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new df0("", emptyList, (255 & 4) != 0 ? emptyList : null, null, null, false, null, 0, (255 & 256) != 0 ? false : zBooleanValue, (255 & 512) != 0 ? false : z));
        this.f24549i = c3244lM17114d;
        this.f24550j = AbstractC3224d.m15520B(c3244lM17114d, lda.m16103C(this), xi9.f68262a, c3244lM17114d.getValue());
        m8812V2("");
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f24542b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f24542b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f24542b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f24542b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f24542b.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f24542b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f24542b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f24542b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f24542b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f24542b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f24542b.mo4581L0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f24543c.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f24542b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f24542b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f24542b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f24542b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f24542b.mo4586T0();
    }

    /* JADX INFO: renamed from: V2 */
    public final void m8812V2(String str) {
        str.getClass();
        while (true) {
            C3244l c3244l = this.f24549i;
            Object value = c3244l.getValue();
            String str2 = str;
            if (c3244l.m15570h(value, df0.m10318a((df0) value, str2, null, null, null, null, false, null, 0, 1022))) {
                AbstractC1263a.m7047b(lda.m16103C(this), this.f24547g, "bookChallengeCourses", new BookChallengeChooserParentViewModel$search$2(str2, this, null));
                return;
            }
            str = str2;
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f24542b.mo4587X();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f24543c.mo3738Z();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f24542b.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f24542b.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f24542b.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f24542b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f24543c.mo3739j2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f24543c.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f24542b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f24542b.mo4593p0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f24543c.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f24542b.mo4594r1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f24543c.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f24542b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f24542b.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f24542b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f24542b.mo4598w2();
    }
}
