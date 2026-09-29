package com.lingq.feature.playlist;

import com.lingq.core.common.util.AbstractC1263a;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.model.CoursePlaylistSort;
import com.lingq.core.domain.model.audio.DownloadItem;
import com.lingq.core.domain.model.user.ProfileAccount;
import com.lingq.core.domain.playlist.C1522e;
import com.lingq.core.domain.premiumlessons.C1525a;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.service.PlayingFrom;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3243k;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.C3386nv;
import p000.InterfaceC3812yx;
import p000.bia;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.dc7;
import p000.eh9;
import p000.fa4;
import p000.g41;
import p000.l55;
import p000.lda;
import p000.nl8;
import p000.nm7;
import p000.nn1;
import p000.q2c;
import p000.tb7;
import p000.ud7;
import p000.uo1;
import p000.ux5;
import p000.vk9;
import p000.wfb;
import p000.wta;
import p000.wz0;
import p000.xi9;
import p000.y25;
import p000.y95;
import p000.z81;

/* JADX INFO: renamed from: com.lingq.feature.playlist.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2251a extends wta implements cma, dc7, bia, InterfaceC3812yx {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ cma f27773b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ dc7 f27774c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ bia f27775d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InterfaceC3812yx f27776e;

    /* JADX INFO: renamed from: f */
    public final C1525a f27777f;

    /* JADX INFO: renamed from: g */
    public final C1522e f27778g;

    /* JADX INFO: renamed from: h */
    public final y95 f27779h;

    /* JADX INFO: renamed from: i */
    public final C1307w f27780i;

    /* JADX INFO: renamed from: j */
    public final nm7 f27781j;

    /* JADX INFO: renamed from: k */
    public final C1381c f27782k;

    /* JADX INFO: renamed from: l */
    public final nn1 f27783l;

    /* JADX INFO: renamed from: m */
    public final C1808b f27784m;

    /* JADX INFO: renamed from: n */
    public final z81 f27785n;

    /* JADX INFO: renamed from: o */
    public final C3244l f27786o;

    /* JADX INFO: renamed from: p */
    public final C3244l f27787p;

    /* JADX INFO: renamed from: q */
    public final c18 f27788q;

    /* JADX INFO: renamed from: r */
    public final C3244l f27789r;

    /* JADX INFO: renamed from: s */
    public final c18 f27790s;

    /* JADX INFO: renamed from: t */
    public final C3244l f27791t;

    /* JADX INFO: renamed from: u */
    public final C3244l f27792u;

    /* JADX INFO: renamed from: v */
    public final C3244l f27793v;

    /* JADX INFO: renamed from: w */
    public final C3244l f27794w;

    /* JADX INFO: renamed from: x */
    public final C3244l f27795x;

    /* JADX INFO: renamed from: y */
    public final C3244l f27796y;

    /* JADX INFO: renamed from: z */
    public final c18 f27797z;

    public C2251a(C1525a c1525a, C1522e c1522e, y95 y95Var, C1307w c1307w, nm7 nm7Var, C1381c c1381c, nn1 nn1Var, C1808b c1808b, cma cmaVar, dc7 dc7Var, InterfaceC3812yx interfaceC3812yx, bia biaVar, nl8 nl8Var) {
        y95Var.getClass();
        c1307w.getClass();
        nm7Var.getClass();
        c1808b.getClass();
        cmaVar.getClass();
        dc7Var.getClass();
        interfaceC3812yx.getClass();
        biaVar.getClass();
        nl8Var.getClass();
        this.f27773b = cmaVar;
        this.f27774c = dc7Var;
        this.f27775d = biaVar;
        this.f27776e = interfaceC3812yx;
        this.f27777f = c1525a;
        this.f27778g = c1522e;
        this.f27779h = y95Var;
        this.f27780i = c1307w;
        this.f27781j = nm7Var;
        this.f27782k = c1381c;
        this.f27783l = nn1Var;
        this.f27784m = c1808b;
        z81.Companion.getClass();
        if (!nl8Var.m17487a("courseId")) {
            C3386nv.m17626m("Required argument \"courseId\" is missing and does not have an android:defaultValue");
            throw null;
        }
        Integer num = (Integer) nl8Var.m17488b("courseId");
        if (num == null) {
            C3386nv.m17626m("Argument \"courseId\" of type integer does not support null values");
            throw null;
        }
        if (!nl8Var.m17487a("courseTitle")) {
            C3386nv.m17626m("Required argument \"courseTitle\" is missing and does not have an android:defaultValue");
            throw null;
        }
        String str = (String) nl8Var.m17488b("courseTitle");
        if (str == null) {
            C3386nv.m17626m("Argument \"courseTitle\" is marked as non-null but was passed a null value");
            throw null;
        }
        if (!nl8Var.m17487a("shelfCode")) {
            C3386nv.m17626m("Required argument \"shelfCode\" is missing and does not have an android:defaultValue");
            throw null;
        }
        String str2 = (String) nl8Var.m17488b("shelfCode");
        if (str2 == null) {
            C3386nv.m17626m("Argument \"shelfCode\" is marked as non-null but was passed a null value");
            throw null;
        }
        this.f27785n = new z81(str, num.intValue(), str2);
        EmptyList emptyList = EmptyList.f47638a;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(emptyList);
        this.f27786o = c3244lM17114d;
        CoursePlaylistSort coursePlaylistSort = CoursePlaylistSort.All;
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(coursePlaylistSort);
        this.f27787p = c3244lM17114d2;
        g41 g41VarM16103C = lda.m16103C(this);
        C3243k c3243k = xi9.f68262a;
        this.f27788q = AbstractC3224d.m15520B(c3244lM17114d2, g41VarM16103C, c3243k, coursePlaylistSort);
        Boolean bool = Boolean.FALSE;
        C3244l c3244lM17114d3 = AbstractC3352my.m17114d(bool);
        this.f27789r = c3244lM17114d3;
        this.f27790s = AbstractC3224d.m15520B(AbstractC3224d.m15521C(c3244lM17114d, new CollectionPlaylistViewModel$audioSources$1(this, null)), lda.m16103C(this), c3243k, emptyList);
        c18 c18VarM15520B = AbstractC3224d.m15520B(AbstractC3224d.m15521C(c3244lM17114d, new CollectionPlaylistViewModel$showPlayer$1(3, null)), lda.m16103C(this), c3243k, bool);
        C3244l c3244lM17114d4 = AbstractC3352my.m17114d(0);
        this.f27791t = c3244lM17114d4;
        C3244l c3244lM17114d5 = AbstractC3352my.m17114d(bool);
        this.f27792u = c3244lM17114d5;
        C3244l c3244lM17114d6 = AbstractC3352my.m17114d(null);
        this.f27793v = c3244lM17114d6;
        C3244l c3244lM17114d7 = AbstractC3352my.m17114d(null);
        this.f27794w = c3244lM17114d7;
        this.f27795x = AbstractC3352my.m17114d(null);
        C3244l c3244lM17114d8 = AbstractC3352my.m17114d(new y25());
        this.f27796y = c3244lM17114d8;
        this.f27797z = AbstractC3224d.m15520B(new wz0(5, new c83[]{c3244lM17114d, c3244lM17114d3, c3244lM17114d4, c3244lM17114d5, c3244lM17114d6, c3244lM17114d7, c18VarM15520B, c1808b.f21946D, c3244lM17114d8}, this), lda.m16103C(this), c3243k, uo1.f64126a);
        m9205X2();
        c1808b.m8461a0(emptyList);
        c1808b.m8450M(true);
        wfb.m23926u(lda.m16103C(this), null, null, new CollectionPlaylistViewModel$1(this, null), 3);
        wfb.m23926u(lda.m16103C(this), null, null, new CollectionPlaylistViewModel$2(this, null), 3);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: A */
    public final c83 mo4571A() {
        return this.f27773b.mo4571A();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B0 */
    public final eh9 mo4572B0() {
        return this.f27773b.mo4572B0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: B1 */
    public final eh9 mo4573B1() {
        return this.f27773b.mo4573B1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: C1 */
    public final c83 mo4574C1() {
        return this.f27773b.mo4574C1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: D0 */
    public final Object mo4575D0(Continuation continuation) {
        return this.f27773b.mo4575D0(continuation);
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: E0 */
    public final boolean mo8231E0(int i) {
        return this.f27776e.mo8231E0(i);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: F1 */
    public final Object mo4576F1(String str, Continuation continuation) {
        return this.f27773b.mo4576F1(str, continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: H */
    public final eh9 mo4577H() {
        return this.f27773b.mo4577H();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: J */
    public final Object mo4578J(Continuation continuation) {
        return this.f27773b.mo4578J(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K */
    public final Object mo4579K(Continuation continuation) {
        return this.f27773b.mo4579K(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: K1 */
    public final String mo4580K1() {
        return this.f27773b.mo4580K1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: L0 */
    public final boolean mo4581L0() {
        return this.f27773b.mo4581L0();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: M0 */
    public final eh9 mo9201M0() {
        return this.f27774c.mo9201M0();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: M1 */
    public final void mo3737M1(UpgradeReason upgradeReason) {
        upgradeReason.getClass();
        this.f27775d.mo3737M1(upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: N */
    public final c83 mo4582N() {
        return this.f27773b.mo4582N();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: O1 */
    public final c83 mo4583O1() {
        return this.f27773b.mo4583O1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: Q0 */
    public final int mo4584Q0() {
        return this.f27773b.mo4584Q0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: R */
    public final eh9 mo4585R() {
        return this.f27773b.mo4585R();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: T0 */
    public final boolean mo4586T0() {
        return this.f27773b.mo4586T0();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: T1 */
    public final void mo9202T1(int i, long j, boolean z) {
        this.f27774c.mo9202T1(i, j, z);
    }

    /* JADX INFO: renamed from: V2 */
    public final void m9203V2() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f27796y;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, new y25()));
    }

    /* JADX INFO: renamed from: W2 */
    public final void m9204W2(ud7 ud7Var) {
        Object next;
        ud7Var.getClass();
        int i = ud7Var.f63767a;
        Iterator it = ((Iterable) ((C3244l) this.f27790s.f9311a).getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((tb7) next).f62101a != i);
        tb7 tb7Var = (tb7) next;
        if (tb7Var != null) {
            if (!vk9.m23391n0(tb7Var.f62102b) || tb7Var.f62108h) {
                wfb.m23926u(lda.m16103C(this), this.f27783l, null, new CollectionPlaylistViewModel$findTrackAndDownload$1(this, tb7Var, null), 2);
            } else if (ud7Var.f63780n == null) {
                m9210c3(i);
            }
        }
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: X */
    public final void mo4587X() {
        this.f27773b.mo4587X();
    }

    /* JADX INFO: renamed from: X2 */
    public final void m9205X2() {
        AbstractC1263a.m7047b(lda.m16103C(this), this.f27783l, ux5.m22988k(this.f27785n.f71040a, "course playlist "), new CollectionPlaylistViewModel$getCoursePlaylist$1(this, null));
    }

    /* JADX INFO: renamed from: Y2 */
    public final void m9206Y2() {
        C3244l c3244l;
        Object value;
        C3244l c3244l2;
        Object value2;
        C3244l c3244l3;
        Object value3;
        C3244l c3244l4;
        Object value4;
        do {
            c3244l = this.f27791t;
            value = c3244l.getValue();
            ((Number) value).intValue();
        } while (!c3244l.m15570h(value, 0));
        do {
            c3244l2 = this.f27792u;
            value2 = c3244l2.getValue();
            ((Boolean) value2).getClass();
        } while (!c3244l2.m15570h(value2, Boolean.FALSE));
        do {
            c3244l3 = this.f27794w;
            value3 = c3244l3.getValue();
        } while (!c3244l3.m15570h(value3, null));
        do {
            c3244l4 = this.f27793v;
            value4 = c3244l4.getValue();
        } while (!c3244l4.m15570h(value4, null));
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: Z */
    public final c83 mo3738Z() {
        return this.f27775d.mo3738Z();
    }

    /* JADX INFO: renamed from: Z2 */
    public final boolean m9207Z2(int i) {
        Object next;
        Iterator it = q2c.m19624a((List) this.f27786o.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((l55) next).f49081a.f63767a != i);
        l55 l55Var = (l55) next;
        ud7 ud7Var = l55Var != null ? l55Var.f49081a : null;
        return (ud7Var == null || ud7Var.f63787u || ud7Var.f63784r <= 0) ? false : true;
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: a0 */
    public final boolean mo4588a0() {
        return this.f27773b.mo4588a0();
    }

    /* JADX INFO: renamed from: a3 */
    public final void m9208a3(List list) {
        if (list.isEmpty()) {
            return;
        }
        this.f27784m.m8461a0(list);
        AbstractC1263a.m7048c(lda.m16103C(this), ux5.m22988k(this.f27785n.f71040a, "tracksDownload "), new CollectionPlaylistViewModel$resetAndSetupTracks$1(list, this, null));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: b2 */
    public final String mo4589b2() {
        return this.f27773b.mo4589b2();
    }

    /* JADX INFO: renamed from: b3 */
    public final void m9209b3(int i) {
        wfb.m23926u(lda.m16103C(this), null, null, new CollectionPlaylistViewModel$showBuyPremiumLesson$1(this, i, null), 3);
    }

    /* JADX INFO: renamed from: c3 */
    public final void m9210c3(int i) {
        C3244l c3244l;
        Object value;
        C3244l c3244l2;
        Object value2;
        if (fa4.m11650l(this.f27795x.getValue(), Boolean.TRUE)) {
            do {
                c3244l2 = this.f27791t;
                value2 = c3244l2.getValue();
                ((Number) value2).intValue();
            } while (!c3244l2.m15570h(value2, Integer.valueOf(i)));
            return;
        }
        do {
            c3244l = this.f27792u;
            value = c3244l.getValue();
            ((Boolean) value).getClass();
        } while (!c3244l.m15570h(value, Boolean.TRUE));
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: d0 */
    public final boolean mo4590d0() {
        return this.f27773b.mo4590d0();
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: e2 */
    public final void mo8233e2(String str, List list) {
        str.getClass();
        this.f27776e.mo8233e2(str, list);
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: g0 */
    public final void mo9211g0(PlayingFrom playingFrom) {
        playingFrom.getClass();
        this.f27774c.mo9211g0(playingFrom);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: h0 */
    public final Object mo4591h0(ProfileAccount profileAccount, Continuation continuation) {
        return this.f27773b.mo4591h0(profileAccount, continuation);
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: j1 */
    public final void mo9212j1() {
        this.f27774c.mo9212j1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: j2 */
    public final void mo3739j2() {
        this.f27775d.mo3739j2();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: k2 */
    public final eh9 mo3740k2() {
        return this.f27775d.mo3740k2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: m0 */
    public final boolean mo4592m0() {
        return this.f27773b.mo4592m0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: p0 */
    public final boolean mo4593p0() {
        return this.f27773b.mo4593p0();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: q */
    public final c83 mo9213q() {
        return this.f27774c.mo9213q();
    }

    @Override // p000.InterfaceC3812yx
    /* JADX INFO: renamed from: r */
    public final Object mo8234r(DownloadItem downloadItem, Continuation continuation) {
        return this.f27776e.mo8234r(downloadItem, continuation);
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: r0 */
    public final void mo3741r0(String str, boolean z, UpgradeReason upgradeReason) {
        str.getClass();
        this.f27775d.mo3741r0(str, z, upgradeReason);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: r1 */
    public final eh9 mo4594r1() {
        return this.f27773b.mo4594r1();
    }

    @Override // p000.bia
    /* JADX INFO: renamed from: s0 */
    public final c83 mo3742s0() {
        return this.f27775d.mo3742s0();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: s1 */
    public final boolean mo4595s1() {
        return this.f27773b.mo4595s1();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: t */
    public final c83 mo4596t() {
        return this.f27773b.mo4596t();
    }

    @Override // p000.dc7
    /* JADX INFO: renamed from: t2 */
    public final eh9 mo9214t2() {
        return this.f27774c.mo9214t2();
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w0 */
    public final Object mo4597w0(Continuation continuation) {
        return this.f27773b.mo4597w0(continuation);
    }

    @Override // p000.cma
    /* JADX INFO: renamed from: w2 */
    public final boolean mo4598w2() {
        return this.f27773b.mo4598w2();
    }
}
