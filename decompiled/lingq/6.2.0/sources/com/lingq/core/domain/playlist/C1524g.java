package com.lingq.core.domain.playlist;

import com.lingq.core.data.repository.C1290f;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.database.dao.C1322j;
import com.lingq.core.domain.model.user.ProfileAccount;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import p000.AbstractC3584sr;
import p000.C3540rl;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.io1;
import p000.m58;
import p000.ql4;
import p000.t70;
import p000.xd7;
import p000.xo1;

/* JADX INFO: renamed from: com.lingq.core.domain.playlist.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1524g implements cma {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cma f19948a;

    /* JADX INFO: renamed from: b */
    public final xd7 f19949b;

    /* JADX INFO: renamed from: c */
    public final xo1 f19950c;

    /* JADX INFO: renamed from: d */
    public final m58 f19951d;

    public C1524g(xd7 xd7Var, xo1 xo1Var, m58 m58Var, cma cmaVar) {
        xd7Var.getClass();
        xo1Var.getClass();
        cmaVar.getClass();
        this.f19948a = cmaVar;
        this.f19949b = xd7Var;
        this.f19950c = xo1Var;
        this.f19951d = m58Var;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f19948a.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f19948a.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f19948a.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f19948a.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f19948a.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f19948a.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f19948a.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f19948a.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f19948a.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f19948a.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f19948a.mo4581L0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f19948a.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f19948a.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f19948a.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f19948a.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f19948a.mo4586T0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f19948a.mo4587X();
    }

    /* JADX INFO: renamed from: a */
    public final c83 m8201a(int i, String str) {
        str.getClass();
        String strMo4589b2 = this.f19948a.mo4589b2();
        C1302r c1302r = (C1302r) this.f19949b;
        c1302r.getClass();
        strMo4589b2.getClass();
        C1322j c1322j = c1302r.f16534c;
        c1322j.getClass();
        int i2 = 5;
        C3540rl c3540rl = new C3540rl(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1322j.f17045K, true, new String[]{"PlaylistEntity", "PlaylistAndLessonsJoin", "LibraryDataEntity", "LibraryCounterEntity"}, new ql4(str, 12))), i2);
        c1302r.getClass();
        C1322j c1322j2 = c1302r.f16534c;
        c1322j2.getClass();
        C3540rl c3540rl2 = new C3540rl(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(c1322j2.f17045K, true, new String[]{"PlaylistEntity", "LibraryDataEntity", "PlaylistAndLessonsJoin"}, new ql4(str, 17))), i2);
        C1290f c1290f = (C1290f) this.f19950c;
        c1290f.getClass();
        io1 io1Var = c1290f.f16474b;
        io1Var.getClass();
        return AbstractC3224d.m15536o(AbstractC3224d.m15521C(AbstractC3224d.m15536o(AbstractC3224d.m15532k(c3540rl, c3540rl2, new C3540rl(AbstractC3224d.m15536o(AbstractC3584sr.m21590A(io1Var.f44343K, true, new String[]{"LibraryDataEntity", "CoursesAndLessonsJoin", "PlaylistAndLessonsJoin", "PlaylistEntity", "LibraryCounterEntity"}, new t70(str, 13))), i2), new GetPlaylistLessonsUseCase$invoke$structureFlow$1())), new GetPlaylistLessonsUseCase$invoke$$inlined$flatMapLatest$1(null, this, strMo4589b2)));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f19948a.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f19948a.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f19948a.mo4590d0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f19948a.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f19948a.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f19948a.mo4593p0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f19948a.mo4594r1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f19948a.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f19948a.mo4596t();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f19948a.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f19948a.mo4598w2();
    }
}
