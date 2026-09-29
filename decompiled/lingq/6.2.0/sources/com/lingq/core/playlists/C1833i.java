package com.lingq.core.playlists;

import com.lingq.core.domain.model.playlist.Playlist;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.playlist.C1523f;
import com.lingq.core.p012ui.UpgradeReason;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3676v8;
import p000.C3713w8;
import p000.af7;
import p000.bia;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.eh9;
import p000.hm5;
import p000.lda;
import p000.md7;
import p000.nn1;
import p000.vf7;
import p000.web;
import p000.wf7;
import p000.wfb;
import p000.wta;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.core.playlists.i */
/* JADX INFO: loaded from: classes2.dex */
public final class C1833i extends wta implements cma, af7, bia {

    /* JADX INFO: renamed from: b */
    public final vf7 f22304b;

    /* JADX INFO: renamed from: c */
    public final C3713w8 f22305c;

    /* JADX INFO: renamed from: d */
    public final C3676v8 f22306d;

    /* JADX INFO: renamed from: e */
    public final C3713w8 f22307e;

    /* JADX INFO: renamed from: f */
    public final C3676v8 f22308f;

    /* JADX INFO: renamed from: g */
    public final web f22309g;

    /* JADX INFO: renamed from: h */
    public final C3713w8 f22310h;

    /* JADX INFO: renamed from: i */
    public final C3676v8 f22311i;

    /* JADX INFO: renamed from: j */
    public final hm5 f22312j;

    /* JADX INFO: renamed from: k */
    public final af7 f22313k;

    /* JADX INFO: renamed from: l */
    public final cma f22314l;

    /* JADX INFO: renamed from: m */
    public final bia f22315m;

    /* JADX INFO: renamed from: n */
    public final nn1 f22316n;

    /* JADX INFO: renamed from: o */
    public final C3244l f22317o;

    /* JADX INFO: renamed from: p */
    public final c18 f22318p;

    public C1833i(vf7 vf7Var, C1523f c1523f, C1523f c1523f2, C3713w8 c3713w8, C3676v8 c3676v8, C3713w8 c3713w9, C3676v8 c3676v9, web webVar, C3713w8 c3713w10, C3676v8 c3676v10, hm5 hm5Var, af7 af7Var, cma cmaVar, bia biaVar, nn1 nn1Var) {
        int i = vf7Var.f65316a;
        hm5Var.getClass();
        af7Var.getClass();
        cmaVar.getClass();
        biaVar.getClass();
        this.f22304b = vf7Var;
        this.f22305c = c3713w8;
        this.f22306d = c3676v8;
        this.f22307e = c3713w9;
        this.f22308f = c3676v9;
        this.f22309g = webVar;
        this.f22310h = c3713w10;
        this.f22311i = c3676v10;
        this.f22312j = hm5Var;
        this.f22313k = af7Var;
        this.f22314l = cmaVar;
        this.f22315m = biaVar;
        this.f22316n = nn1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(md7.f51107a);
        this.f22317o = c3244lM17114d;
        this.f22318p = AbstractC3224d.m15520B(new C3228h((!vf7Var.f65319d || i <= 0) ? c1523f.m8200b(cmaVar.mo4589b2()) : c1523f2.m8199a(i, cmaVar.mo4589b2()), c3244lM17114d, new PlaylistsSheetViewModel$uiState$1(this, null)), lda.m16103C(this), xi9.f68262a, wf7.f66757a);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f22314l.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f22314l.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f22314l.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f22314l.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f22314l.mo4575D0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f22314l.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f22314l.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f22314l.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f22314l.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f22314l.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f22314l.mo4581L0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f22315m.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f22314l.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f22314l.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f22314l.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f22314l.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f22314l.mo4586T0();
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: V1 */
    public final void mo343V1(Playlist playlist) {
        playlist.getClass();
        this.f22313k.mo343V1(playlist);
    }

    /* JADX INFO: renamed from: V2 */
    public final void m8509V2(String str, C1828d c1828d) {
        str.getClass();
        wfb.m23926u(lda.m16103C(this), this.f22316n, null, new PlaylistsSheetViewModel$createPlaylist$1(str, this, c1828d, null), 2);
    }

    /* JADX INFO: renamed from: W2 */
    public final void m8510W2() {
        C3244l c3244l = this.f22317o;
        c3244l.getClass();
        c3244l.m15572j(null, md7.f51107a);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f22314l.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final eh9 m8511X2() {
        return this.f22318p;
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m8512Y2(String str, String str2) {
        str.getClass();
        str2.getClass();
        wfb.m23926u(lda.m16103C(this), this.f22316n, null, new PlaylistsSheetViewModel$updatePlaylistName$1(this, str2, str, null), 2);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f22315m.mo3738Z();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f22314l.mo4588a0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f22314l.mo4589b2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f22314l.mo4590d0();
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: f2 */
    public final void mo344f2(Playlist playlist) {
        playlist.getClass();
        this.f22313k.mo344f2(playlist);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f22314l.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f22315m.mo3739j2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f22315m.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f22314l.mo4592m0();
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: m2 */
    public final c83 mo345m2() {
        return this.f22313k.mo345m2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f22314l.mo4593p0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f22315m.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f22314l.mo4594r1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f22315m.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f22314l.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f22314l.mo4596t();
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: t1 */
    public final c83 mo346t1() {
        return this.f22313k.mo346t1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f22314l.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f22314l.mo4598w2();
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: x */
    public final c83 mo347x() {
        return this.f22313k.mo347x();
    }

    @Override // p000.af7
    /* JADX INFO: renamed from: x0 */
    public final void mo348x0(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.f22313k.mo348x0(str, str2);
    }
}
