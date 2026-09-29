package com.lingq.core.player;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.PlaybackException;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.domain.lesson.C1385g;
import com.lingq.core.domain.model.language.AppUsageType;
import com.lingq.core.player.data.PlayerState;
import com.lingq.core.player.data.PlayerType;
import com.lingq.core.player.data.PlayerViewState;
import com.lingq.core.player.service.PlayingFrom;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3184kh;
import p000.AbstractC3352my;
import p000.C3476px;
import p000.C3509qs;
import p000.InterfaceC3733ws;
import p000.RunnableC0002a0;
import p000.ac7;
import p000.ba7;
import p000.bna;
import p000.c18;
import p000.cc4;
import p000.dc7;
import p000.dw6;
import p000.ea7;
import p000.f0a;
import p000.fa4;
import p000.fn3;
import p000.g2c;
import p000.gh1;
import p000.gm5;
import p000.h0a;
import p000.h33;
import p000.hc7;
import p000.hm5;
import p000.hn1;
import p000.i62;
import p000.jw2;
import p000.k02;
import p000.l52;
import p000.m97;
import p000.mb1;
import p000.mn7;
import p000.n2c;
import p000.n97;
import p000.nb7;
import p000.nn1;
import p000.nob;
import p000.ob1;
import p000.pg9;
import p000.pp9;
import p000.pu5;
import p000.q97;
import p000.qb7;
import p000.qp9;
import p000.rb7;
import p000.rm5;
import p000.sg5;
import p000.sm5;
import p000.ss5;
import p000.sv2;
import p000.tb7;
import p000.ub7;
import p000.uma;
import p000.un1;
import p000.ux5;
import p000.v45;
import p000.vb7;
import p000.vg5;
import p000.vma;
import p000.wfb;
import p000.xt2;
import p000.xv2;
import p000.xx6;

/* JADX INFO: renamed from: com.lingq.core.player.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1808b implements ba7 {
    private static final ub7 Companion = new ub7();

    /* JADX INFO: renamed from: A */
    public final C3244l f21943A;

    /* JADX INFO: renamed from: B */
    public final c18 f21944B;

    /* JADX INFO: renamed from: C */
    public final C3244l f21945C;

    /* JADX INFO: renamed from: D */
    public final c18 f21946D;

    /* JADX INFO: renamed from: E */
    public final C3244l f21947E;

    /* JADX INFO: renamed from: a */
    public final Context f21948a;

    /* JADX INFO: renamed from: b */
    public final un1 f21949b;

    /* JADX INFO: renamed from: c */
    public final nn1 f21950c;

    /* JADX INFO: renamed from: d */
    public final vma f21951d;

    /* JADX INFO: renamed from: e */
    public final C3509qs f21952e;

    /* JADX INFO: renamed from: f */
    public final dc7 f21953f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC3733ws f21954g;

    /* JADX INFO: renamed from: h */
    public final C1385g f21955h;

    /* JADX INFO: renamed from: i */
    public final q97 f21956i;

    /* JADX INFO: renamed from: j */
    public final rb7 f21957j;

    /* JADX INFO: renamed from: k */
    public final cc4 f21958k;

    /* JADX INFO: renamed from: l */
    public int f21959l;

    /* JADX INFO: renamed from: m */
    public final jw2 f21960m;

    /* JADX INFO: renamed from: n */
    public final gh1 f21961n;

    /* JADX INFO: renamed from: o */
    public final RunnableC0002a0 f21962o;

    /* JADX INFO: renamed from: p */
    public final Handler f21963p;

    /* JADX INFO: renamed from: q */
    public final File f21964q;

    /* JADX INFO: renamed from: r */
    public long f21965r;

    /* JADX INFO: renamed from: s */
    public long f21966s;

    /* JADX INFO: renamed from: t */
    public Integer f21967t;

    /* JADX INFO: renamed from: u */
    public Integer f21968u;

    /* JADX INFO: renamed from: v */
    public boolean f21969v;

    /* JADX INFO: renamed from: w */
    public int f21970w;

    /* JADX INFO: renamed from: x */
    public pg9 f21971x;

    /* JADX INFO: renamed from: y */
    public pg9 f21972y;

    /* JADX INFO: renamed from: z */
    public boolean f21973z;

    /* JADX WARN: Multi-variable type inference failed */
    public C1808b(Context context, un1 un1Var, nn1 nn1Var, vma vmaVar, C3509qs c3509qs, dc7 dc7Var, InterfaceC3733ws interfaceC3733ws, C1385g c1385g, q97 q97Var, rb7 rb7Var, cc4 cc4Var) {
        un1Var.getClass();
        vmaVar.getClass();
        c3509qs.getClass();
        dc7Var.getClass();
        interfaceC3733ws.getClass();
        q97Var.getClass();
        rb7Var.getClass();
        this.f21948a = context;
        this.f21949b = un1Var;
        this.f21950c = nn1Var;
        this.f21951d = vmaVar;
        this.f21952e = c3509qs;
        this.f21953f = dc7Var;
        this.f21954g = interfaceC3733ws;
        this.f21955h = c1385g;
        this.f21956i = q97Var;
        this.f21957j = rb7Var;
        this.f21958k = cc4Var;
        this.f21961n = new gh1(2);
        this.f21962o = new RunnableC0002a0(this, 14);
        this.f21963p = new Handler(Looper.getMainLooper());
        ob1.Companion.getClass();
        this.f21964q = mb1.m16743c(context);
        C3244l c3244lM17114d = AbstractC3352my.m17114d(EmptyList.f47638a);
        this.f21943A = c3244lM17114d;
        this.f21944B = AbstractC3224d.m15524c(c3244lM17114d);
        C3244l c3244lM17114d2 = AbstractC3352my.m17114d(new hc7(null, 0 == true ? 1 : 0, 8191));
        this.f21945C = c3244lM17114d2;
        this.f21946D = AbstractC3224d.m15524c(c3244lM17114d2);
        this.f21947E = AbstractC3352my.m17114d(AbstractC3194a.m15360M());
        sv2 sv2Var = new sv2(context);
        C3476px c3476px = new C3476px(2);
        bna.m3987z(!sv2Var.f61477u);
        sv2Var.f61465i = c3476px;
        bna.m3987z(!sv2Var.f61477u);
        sv2Var.f61477u = true;
        jw2 jw2Var = new jw2(sv2Var);
        this.f21960m = jw2Var;
        jw2Var.f46295m.m23268a(this);
        jw2 jw2Var2 = this.f21960m;
        if (jw2Var2 == null) {
            fa4.m11636J("player");
            throw null;
        }
        xt2 xt2Var = new xt2();
        l52 l52Var = jw2Var2.f46300r;
        l52Var.getClass();
        l52Var.f49069f.m23268a(xt2Var);
        float f = q97Var.m19809a().f486a;
        jw2 jw2Var3 = this.f21960m;
        if (jw2Var3 == null) {
            fa4.m11636J("player");
            throw null;
        }
        n97 n97Var = new n97(f, jw2Var3.m14720p().f52511b);
        jw2 jw2Var4 = this.f21960m;
        if (jw2Var4 == null) {
            fa4.m11636J("player");
            throw null;
        }
        jw2Var4.m14697C(n97Var);
        wfb.m23926u(un1Var, null, null, new PlayerControllerImpl$1(this, null), 3);
        wfb.m23926u(un1Var, null, null, new PlayerControllerImpl$2(this, null), 3);
        this.f21971x = wfb.m23926u(un1Var, nn1Var, null, new PlayerControllerImpl$playerPooling$1(this, null), 2);
        wfb.m23926u(un1Var, null, null, new PlayerControllerImpl$3(this, null), 3);
    }

    /* JADX INFO: renamed from: E */
    public static boolean m8438E(PlayerType playerType) {
        return playerType == PlayerType.Video;
    }

    /* JADX INFO: renamed from: O */
    public static void m8440O(C1808b c1808b, int i, int i2) {
        tb7 tb7VarM12625d = c1808b.f21961n.m12625d();
        Integer numValueOf = tb7VarM12625d != null ? Integer.valueOf(tb7VarM12625d.m21939g()) : null;
        if ((i2 & 2) != 0) {
            i = c1808b.m8467g();
        }
        c1808b.f21968u = numValueOf;
        c1808b.f21967t = numValueOf != null ? Integer.valueOf(i) : null;
    }

    /* JADX INFO: renamed from: Y */
    public static void m8441Y(C1808b c1808b, boolean z, int i) {
        Object obj;
        hc7 hc7Var;
        boolean z2 = (i & 1) != 0 ? false : z;
        int i2 = 2;
        boolean z3 = (i & 2) == 0;
        tb7 tb7VarM12625d = c1808b.f21961n.m12625d();
        C3244l c3244l = c1808b.f21945C;
        while (true) {
            Object value = c3244l.getValue();
            hc7 hc7Var2 = (hc7) value;
            if (tb7VarM12625d == null || z2) {
                obj = value;
                hc7Var = new hc7(hc7Var2.f42184l, hc7Var2.f42185m, 2047);
            } else {
                jw2 jw2Var = c1808b.f21960m;
                if (jw2Var == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                jw2Var.m14705K();
                boolean z4 = jw2Var.f46257D;
                boolean z5 = c1808b.f21969v;
                int i3 = vb7.f65167a[hc7Var2.f42173a.ordinal()];
                q97 q97Var = c1808b.f21956i;
                ac7 ac7VarM19809a = i3 == i2 ? (ac7) q97Var.f57454b.get(q97Var.f57456d) : q97Var.m19809a();
                long jM8454S = m8438E(hc7Var2.f42173a) ? hc7Var2.f42176d : c1808b.m8454S();
                int iM8467g = c1808b.m8467g();
                jw2 jw2Var2 = c1808b.f21960m;
                if (jw2Var2 == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                obj = value;
                hc7Var = hc7.m13196a(hc7Var2, null, null, null, jM8454S, iM8467g, jw2Var2.m14708d(), z4, z5, ac7VarM19809a, tb7VarM12625d, z3, null, null, 6151);
            }
            if (c3244l.m15570h(obj, hc7Var)) {
                return;
            } else {
                i2 = 2;
            }
        }
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: A */
    public final void mo3505A(PlaybackException playbackException) {
        playbackException.getClass();
        playbackException.printStackTrace();
    }

    /* JADX INFO: renamed from: C */
    public final void m8442C(n2c n2cVar) {
        String str;
        boolean zEquals = n2cVar.equals(ea7.f36943k);
        gh1 gh1Var = this.f21961n;
        if (zEquals) {
            if (((ArrayList) gh1Var.f40792d).isEmpty()) {
                return;
            }
            if (m8444G()) {
                m8447J();
                return;
            }
            tb7 tb7VarM12625d = gh1Var.m12625d();
            if (tb7VarM12625d != null) {
                rb7 rb7Var = this.f21957j;
                rb7Var.getClass();
                hm5 hm5Var = rb7Var.f59025a;
                Bundle bundle = new Bundle();
                bundle.putInt("Lesson ID", tb7VarM12625d.m21939g());
                bundle.putString("Lesson language", AbstractC3184kh.m15223q(tb7VarM12625d.m21938f()));
                bundle.putString("Lesson name", tb7VarM12625d.m21941i());
                bundle.putString("Lesson level", tb7VarM12625d.m21940h());
                bundle.putString("Course name", tb7VarM12625d.m21935c());
                bundle.putInt("Course ID", tb7VarM12625d.m21934b());
                int i = qb7.f57546a[tb7VarM12625d.m21942j().ordinal()];
                if (i == 1) {
                    str = "reader";
                } else {
                    if (i != 2) {
                        gm5.m12750e();
                        return;
                    }
                    str = "playlist";
                }
                bundle.putString("audio play location", str);
                ((C1240a) hm5Var).m7025f("Lesson audio played", bundle);
            }
            m8458W();
            return;
        }
        if (n2cVar.equals(ea7.f36942j)) {
            m8458W();
            return;
        }
        if (n2cVar.equals(ea7.f36941i)) {
            m8447J();
            return;
        }
        if (n2cVar.equals(ea7.f36936d)) {
            m8452Q(m8467g() - 5000);
            return;
        }
        if (n2cVar.equals(ea7.f36938f)) {
            m8452Q(m8467g() + 5000);
            return;
        }
        if (n2cVar.equals(ea7.f36946n)) {
            this.f21969v = !this.f21969v;
            m8451P();
            return;
        }
        boolean zEquals2 = n2cVar.equals(ea7.f36947o);
        jw2 jw2Var = this.f21960m;
        if (zEquals2) {
            if (jw2Var == null) {
                fa4.m11636J("player");
                throw null;
            }
            jw2Var.m14705K();
            boolean z = !jw2Var.f46257D;
            vg5 vg5Var = jw2Var.f46295m;
            jw2Var.m14705K();
            if (jw2Var.f46257D != z) {
                jw2Var.f46257D = z;
                qp9 qp9Var = jw2Var.f46294l.f59932h;
                qp9Var.getClass();
                pp9 pp9VarM20096b = qp9.m20096b();
                pp9VarM20096b.f56637a = qp9Var.f58033a.obtainMessage(12, z ? 1 : 0, 0);
                pp9VarM20096b.m19440b();
                vg5Var.m23270c(9, new xv2(0, z));
                jw2Var.m14701G();
                vg5Var.m23269b();
            }
            m8451P();
            return;
        }
        if (n2cVar.equals(ea7.f36939g)) {
            m8455T();
            return;
        }
        if (n2cVar.equals(ea7.f36945m)) {
            m8456U();
            return;
        }
        if (!n2cVar.equals(ea7.f36944l)) {
            if (n2cVar instanceof nb7) {
                nb7 nb7Var = (nb7) n2cVar;
                if (nb7Var.m17316a() == -1.0d) {
                    return;
                }
                m8452Q((int) (nb7Var.m17316a() * 1000.0d));
                return;
            }
            if (n2cVar.equals(ea7.f36940h)) {
                m8466e0(PlayerViewState.Opened);
                return;
            } else if (n2cVar.equals(ea7.f36937e)) {
                m8466e0(PlayerViewState.Closed);
                return;
            } else {
                gm5.m12750e();
                return;
            }
        }
        if (gh1Var.m12625d() == null) {
            return;
        }
        PlayerType playerType = ((hc7) this.f21945C.getValue()).f42173a;
        PlayerType playerType2 = PlayerType.Video;
        q97 q97Var = this.f21956i;
        if (playerType == playerType2) {
            int i2 = q97Var.f57456d;
            List list = q97Var.f57454b;
            int size = (i2 + 1) % list.size();
            q97Var.f57456d = size;
        } else {
            q97Var.f57455c = (q97Var.f57455c + 1) % q97Var.f57453a.size();
            float f = q97Var.m19809a().f486a;
            if (jw2Var == null) {
                fa4.m11636J("player");
                throw null;
            }
            n97 n97Var = new n97(f, jw2Var.m14720p().f52511b);
            if (jw2Var == null) {
                fa4.m11636J("player");
                throw null;
            }
            jw2Var.m14697C(n97Var);
        }
        m8451P();
    }

    /* JADX INFO: renamed from: F */
    public final boolean m8443F() {
        hc7 hc7Var = (hc7) this.f21945C.getValue();
        if (m8438E(hc7Var.f42173a)) {
            return hc7Var.f42174b == PlayerState.Playing;
        }
        jw2 jw2Var = this.f21960m;
        if (jw2Var != null) {
            return jw2Var.m14721q() == 3;
        }
        fa4.m11636J("player");
        throw null;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m8444G() {
        return ((hc7) this.f21945C.getValue()).f42174b == PlayerState.Playing;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m8445H(int i) {
        tb7 tb7VarM12625d;
        return m8444G() && (tb7VarM12625d = this.f21961n.m12625d()) != null && tb7VarM12625d.m21939g() == i;
    }

    /* JADX INFO: renamed from: I */
    public final void m8446I(int i, boolean z) {
        tb7 tb7Var;
        gh1 gh1Var = this.f21961n;
        ArrayList arrayList = (ArrayList) gh1Var.f40792d;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    tb7Var = null;
                    break;
                }
                tb7Var = (tb7) arrayList.get(i2);
                if (i == tb7Var.m21939g()) {
                    gh1Var.f40790b = i2;
                    break;
                }
                i2++;
            }
        } else {
            tb7Var = null;
            break;
        }
        if (tb7Var != null) {
            m8460Z(tb7Var, z);
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m8447J() {
        Object value;
        m8469l("pause");
        m8440O(this, 0, 3);
        C3244l c3244l = this.f21945C;
        if (vb7.f65167a[((hc7) c3244l.getValue()).f42173a.ordinal()] != 2) {
            jw2 jw2Var = this.f21960m;
            if (jw2Var == null) {
                fa4.m11636J("player");
                throw null;
            }
            jw2Var.m14696B(false);
        }
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, null, PlayerState.Paused, null, 0L, 0, 0L, false, false, null, null, false, null, null, 8189)));
        m8451P();
        this.f21973z = false;
        this.f21954g.mo9034v0(AppUsageType.Listening);
    }

    /* JADX INFO: renamed from: K */
    public final void m8448K(String str, int i, boolean z) {
        Object value;
        Object value2;
        C3244l c3244l = this.f21945C;
        if (((hc7) c3244l.getValue()).f42173a == PlayerType.Audio) {
            Uri uri = Uri.parse(str);
            uri.getClass();
            this.f21963p.removeCallbacks(this.f21962o);
            int i2 = 2;
            m8441Y(this, !m8445H(i), 2);
            k02 k02Var = new k02(uri);
            h33 h33Var = new h33();
            try {
                h33Var.mo10000b(k02Var);
                dw6 dw6Var = new dw6(h33Var, i2);
                pu5 pu5VarM19482a = pu5.m19482a(uri);
                i62 i62Var = new i62();
                synchronized (i62Var) {
                    i62Var.f43582a = 4;
                }
                synchronized (i62Var) {
                }
                mn7 mn7VarM11952e = new fn3(dw6Var, i62Var).m11952e(pu5VarM19482a);
                this.f21970w = 0;
                jw2 jw2Var = this.f21960m;
                if (jw2Var == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                jw2Var.m14696B(false);
                jw2 jw2Var2 = this.f21960m;
                if (jw2Var2 == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                jw2Var2.m14695A(mn7VarM11952e);
                jw2 jw2Var3 = this.f21960m;
                if (jw2Var3 == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                jw2Var3.m14726x();
                if (!m8445H(i)) {
                    do {
                        value2 = c3244l.getValue();
                    } while (!c3244l.m15570h(value2, hc7.m13196a((hc7) value2, PlayerType.Audio, PlayerState.Paused, null, 0L, 0, 0L, false, false, null, null, false, null, null, 8188)));
                }
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, null, null, null, m8454S(), 0, 0L, false, false, null, null, false, null, null, 8183)));
                float f = this.f21956i.m19809a().f486a;
                jw2 jw2Var4 = this.f21960m;
                if (jw2Var4 == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                n97 n97Var = new n97(f, jw2Var4.m14720p().f52511b);
                jw2 jw2Var5 = this.f21960m;
                if (jw2Var5 == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                jw2Var5.m14697C(n97Var);
                tb7 tb7VarM12625d = this.f21961n.m12625d();
                if (tb7VarM12625d == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                pg9 pg9Var = this.f21972y;
                if (pg9Var != null) {
                    pg9Var.mo4537a(null);
                }
                this.f21972y = wfb.m23926u(this.f21949b, this.f21950c, null, new PlayerControllerImpl$observeBookmarkAndSeek$1(this, tb7VarM12625d, z, null), 2);
                m8451P();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public final void m8449L(long j, long j2) {
        int iIntValue;
        tb7 tb7VarM12625d = this.f21961n.m12625d();
        if (tb7VarM12625d != null) {
            int iM8468j = m8468j();
            int i = vb7.f65167a[((hc7) this.f21945C.getValue()).f42173a.ordinal()];
            q97 q97Var = this.f21956i;
            float f = (i == 2 ? (ac7) q97Var.f57454b.get(q97Var.f57456d) : q97Var.m19809a()).f486a;
            rb7 rb7Var = this.f21957j;
            rb7Var.getClass();
            m97 m97VarM12305a = g2c.m12305a(tb7VarM12625d);
            if (m97VarM12305a != null) {
                iIntValue = (int) m97VarM12305a.m16698b();
            } else {
                int iM21936d = tb7VarM12625d.m21936d();
                Integer numValueOf = Integer.valueOf(iM21936d);
                if (iM21936d <= 0) {
                    numValueOf = null;
                }
                iIntValue = numValueOf != null ? numValueOf.intValue() : iM8468j;
            }
            if (iIntValue <= 0) {
                return;
            }
            double d = j2 / ((double) iIntValue);
            rm5 rm5Var = sm5.Companion;
            int iM21939g = tb7VarM12625d.m21939g();
            int iM21936d2 = tb7VarM12625d.m21936d();
            StringBuilder sb = new StringBuilder("[LessonTracking] PLAYER_LISTEN recordListeningTime lessonId=");
            sb.append(iM21939g);
            sb.append(" wallMs=");
            sb.append(j);
            sb.append(" listenedMediaMs=");
            sb.append(j2);
            sb.append(" durationMs=");
            hn1.m13360j(iM8468j, iIntValue, " trackingDurationMs=", " trackDurationMs=", sb);
            sb.append(iM21936d2);
            sb.append(" speed=");
            sb.append(f);
            sb.append(" rawCoverage=");
            sb.append(d);
            String string = sb.toString();
            rm5Var.getClass();
            h0a.f41641a.mo11431b(string, new Object[0]);
            rb7Var.f59026b.m8437c(rb7.m20570a(tb7VarM12625d), d, j);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m8450M(boolean z) {
        m8447J();
        m8461a0(EmptyList.f47638a);
        if (z) {
            m8441Y(this, false, 3);
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m8451P() {
        C3244l c3244l;
        Object value;
        int i;
        tb7 tb7VarM12625d = this.f21961n.m12625d();
        if (tb7VarM12625d != null) {
            m8441Y(this, false, 3);
            long jM8467g = m8467g();
            do {
                c3244l = this.f21945C;
                value = c3244l.getValue();
                i = (int) jM8467g;
            } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, null, null, null, 0L, i, 0L, false, false, null, null, false, null, null, 8175)));
            m8459X(i);
            Handler handler = this.f21963p;
            RunnableC0002a0 runnableC0002a0 = this.f21962o;
            handler.removeCallbacks(runnableC0002a0);
            PlayerType playerType = ((hc7) c3244l.getValue()).f42173a;
            PlayerType playerType2 = PlayerType.Audio;
            jw2 jw2Var = this.f21960m;
            if (playerType == playerType2) {
                if (jw2Var == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                if (jw2Var.m14721q() == 1) {
                    return;
                }
                if (jw2Var == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                if (jw2Var.m14721q() == 4) {
                    return;
                }
            } else if (((hc7) c3244l.getValue()).f42174b != PlayerState.Playing) {
                return;
            }
            long j = 125;
            if (m8444G() && m8443F()) {
                j = 125 - (jM8467g % 125);
                int iM21939g = tb7VarM12625d.m21939g();
                if (jw2Var == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                m8463c(iM21939g, jw2Var.m14720p().f52510a, i);
                if (this.f21965r >= 5000) {
                    wfb.m23926u(this.f21949b, null, null, new PlayerControllerImpl$scheduledUpdate$1$2(this, tb7VarM12625d, jM8467g, null), 3);
                    m8449L(this.f21965r, this.f21966s);
                    this.f21965r = 0L;
                    this.f21966s = 0L;
                }
            }
            handler.postDelayed(runnableC0002a0, j);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m8452Q(int i) {
        C3244l c3244l;
        Object value;
        int i2;
        m8469l("seekTo");
        long jMin = Math.min(Math.max(0, i), m8468j());
        do {
            c3244l = this.f21945C;
            value = c3244l.getValue();
            i2 = (int) jMin;
        } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, null, null, null, 0L, i2, 0L, false, false, null, null, false, null, null, 8175)));
        if (vb7.f65167a[((hc7) c3244l.getValue()).f42173a.ordinal()] == 1) {
            jw2 jw2Var = this.f21960m;
            if (jw2Var == null) {
                fa4.m11636J("player");
                throw null;
            }
            jw2Var.m14727y(jMin);
        }
        m8440O(this, i2, 1);
        m8441Y(this, false, 1);
        m8459X(i2);
    }

    /* JADX INFO: renamed from: R */
    public final void m8453R(float f) {
        jw2 jw2Var = this.f21960m;
        if (jw2Var == null) {
            fa4.m11636J("player");
            throw null;
        }
        jw2Var.m14705K();
        final float fM22811f = uma.m22811f(f, 0.0f, 1.0f);
        if (jw2Var.f46274U == fM22811f) {
            return;
        }
        jw2Var.f46274U = fM22811f;
        jw2Var.f46294l.f59932h.m20097a(32, Float.valueOf(fM22811f)).m19440b();
        jw2Var.f46295m.m23271d(22, new sg5() { // from class: wv2
            @Override // p000.sg5
            public final void invoke(Object obj) {
                ((ba7) obj).mo3512f(fM22811f);
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public final int m8454S() {
        jw2 jw2Var = this.f21960m;
        if (jw2Var == null) {
            fa4.m11636J("player");
            throw null;
        }
        if (jw2Var.m14718n() != -9223372036854775807L) {
            if (jw2Var != null) {
                return (int) jw2Var.m14718n();
            }
            fa4.m11636J("player");
            throw null;
        }
        gh1 gh1Var = this.f21961n;
        tb7 tb7VarM12625d = gh1Var.m12625d();
        if (tb7VarM12625d == null) {
            return 0;
        }
        if (tb7VarM12625d.m21936d() != 0) {
            return tb7VarM12625d.m21936d();
        }
        int i = this.f21970w;
        if (i != 0) {
            return i;
        }
        try {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            File file = this.f21964q;
            tb7 tb7VarM12625d2 = gh1Var.m12625d();
            mediaMetadataRetriever.setDataSource(file + "/" + (tb7VarM12625d2 != null ? Integer.valueOf(tb7VarM12625d2.m21939g()) : null) + ".mp3");
            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
            mediaMetadataRetriever.release();
            if (strExtractMetadata != null) {
                this.f21970w = Integer.parseInt(strExtractMetadata);
            }
            return this.f21970w;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m8455T() {
        m8447J();
        tb7 tb7Var = null;
        jw2 jw2Var = this.f21960m;
        if (jw2Var == null) {
            fa4.m11636J("player");
            throw null;
        }
        jw2Var.m14705K();
        boolean z = jw2Var.f46257D;
        boolean z2 = true;
        gh1 gh1Var = this.f21961n;
        if (z) {
            ArrayList arrayList = (ArrayList) gh1Var.f40793e;
            ArrayList arrayList2 = (ArrayList) gh1Var.f40792d;
            if (!arrayList2.isEmpty()) {
                if (arrayList.size() != arrayList2.size()) {
                    arrayList.clear();
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        arrayList.add(Integer.valueOf(i));
                    }
                    Collections.shuffle(arrayList);
                    gh1Var.f40791c = 0;
                } else if (gh1Var.f40791c + 1 < arrayList.size()) {
                    gh1Var.f40791c++;
                } else {
                    Collections.shuffle(arrayList);
                    gh1Var.f40791c = 0;
                }
                int iIntValue = ((Number) arrayList.get(gh1Var.f40791c)).intValue();
                gh1Var.f40790b = iIntValue;
                tb7Var = (tb7) arrayList2.get(iIntValue);
            }
            if (tb7Var != null) {
                m8460Z(tb7Var, true);
                return;
            }
            return;
        }
        tb7 tb7VarM12625d = gh1Var.m12625d();
        boolean z3 = this.f21969v;
        ArrayList arrayList3 = (ArrayList) gh1Var.f40792d;
        if (!arrayList3.isEmpty()) {
            int i2 = gh1Var.f40790b;
            int i3 = i2 + 1;
            gh1Var.f40790b = i3;
            if (i3 > arrayList3.size() - 1) {
                if (z3) {
                    i2 = 0;
                }
                gh1Var.f40790b = i2;
            }
            tb7Var = (tb7) arrayList3.get(gh1Var.f40790b);
        }
        if (tb7Var != null) {
            if (!this.f21969v && fa4.m11650l(tb7VarM12625d, tb7Var)) {
                z2 = false;
            }
            m8460Z(tb7Var, z2);
        }
        if (tb7Var == null || fa4.m11650l(tb7VarM12625d, tb7Var)) {
            this.f21973z = false;
            this.f21954g.mo9034v0(AppUsageType.Listening);
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m8456U() {
        tb7 tb7Var;
        m8447J();
        boolean z = this.f21969v;
        gh1 gh1Var = this.f21961n;
        ArrayList arrayList = (ArrayList) gh1Var.f40792d;
        if (arrayList.isEmpty()) {
            tb7Var = null;
        } else {
            int size = gh1Var.f40790b;
            int i = size - 1;
            gh1Var.f40790b = i;
            if (i < 0) {
                if (z) {
                    size = arrayList.size() - 1;
                }
                gh1Var.f40790b = size;
            }
            tb7Var = (tb7) arrayList.get(gh1Var.f40790b);
        }
        if (tb7Var != null) {
            m8460Z(tb7Var, true);
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m8457V() {
        if (this.f21961n.m12625d() != null) {
            wfb.m23926u(this.f21949b, null, null, new PlayerControllerImpl$skipVideoToNext$1$1(this, null), 3);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m8458W() {
        Object value;
        Object value2;
        C3244l c3244l = this.f21945C;
        if (m8438E(((hc7) c3244l.getValue()).f42173a)) {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, hc7.m13196a((hc7) value2, null, PlayerState.Playing, null, 0L, 0, 0L, false, false, null, null, false, null, null, 8189)));
            m8459X(m8467g());
            m8451P();
            return;
        }
        int iM8467g = m8467g();
        int iM8468j = m8468j();
        gh1 gh1Var = this.f21961n;
        if (iM8467g >= iM8468j || m8467g() < 0) {
            m8452Q(0);
            m8447J();
            tb7 tb7VarM12625d = gh1Var.m12625d();
            if (tb7VarM12625d != null) {
                wfb.m23926u(this.f21949b, null, null, new PlayerControllerImpl$start$2$1(this, tb7VarM12625d, tb7VarM12625d.m21939g(), null), 3);
            }
        }
        tb7 tb7VarM12625d2 = gh1Var.m12625d();
        if (tb7VarM12625d2 != null) {
            tb7 tb7Var = ((hc7) c3244l.getValue()).f42182j;
            if (tb7Var != null && tb7Var.m21939g() == tb7VarM12625d2.m21939g() && m8443F()) {
                jw2 jw2Var = this.f21960m;
                if (jw2Var == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                jw2Var.m14696B(true);
            } else {
                m8448K(this.f21964q + "/" + tb7VarM12625d2.m21939g() + ".mp3", tb7VarM12625d2.m21939g(), true);
            }
        }
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, null, PlayerState.Playing, null, 0L, 0, 0L, false, false, null, null, false, null, null, 8189)));
        m8459X(m8467g());
        m8451P();
    }

    /* JADX INFO: renamed from: X */
    public final void m8459X(int i) {
        tb7 tb7VarM12625d;
        m97 m97VarM12305a;
        boolean zM8444G = m8444G();
        gh1 gh1Var = this.f21961n;
        boolean z = zM8444G && ((tb7VarM12625d = gh1Var.m12625d()) == null || (m97VarM12305a = g2c.m12305a(tb7VarM12625d)) == null || m97VarM12305a.m16697a((long) i));
        InterfaceC3733ws interfaceC3733ws = this.f21954g;
        Map mapMo9032h = interfaceC3733ws.mo9032h();
        AppUsageType appUsageType = AppUsageType.Listening;
        boolean zContainsKey = mapMo9032h.containsKey(appUsageType);
        if (z && !zContainsKey) {
            this.f21973z = true;
            tb7 tb7VarM12625d2 = gh1Var.m12625d();
            interfaceC3733ws.mo9033o1(appUsageType, tb7VarM12625d2 != null ? Integer.valueOf(tb7VarM12625d2.m21939g()) : null);
        } else if (!z && this.f21973z && zContainsKey) {
            this.f21973z = false;
            interfaceC3733ws.mo9034v0(appUsageType);
        } else {
            if (z || zContainsKey) {
                return;
            }
            this.f21973z = false;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m8460Z(tb7 tb7Var, boolean z) {
        Object value;
        m97 m97VarM12305a;
        Object value2;
        tb7 tb7Var2;
        if (this.f21953f.mo9214t2().getValue() == PlayingFrom.Playlist) {
            int iM21939g = tb7Var.m21939g();
            SharedPreferences.Editor editorEdit = this.f21952e.f58118b.edit();
            editorEdit.getClass();
            editorEdit.putInt("playlistTrack", iM21939g);
            editorEdit.apply();
        }
        PlayerType playerType = vb7.f65167a[tb7Var.m21937e().ordinal()] == 2 ? PlayerType.Video : PlayerType.Audio;
        C3244l c3244l = this.f21945C;
        boolean z2 = false;
        boolean z3 = ((hc7) c3244l.getValue()).f42173a == PlayerType.Audio;
        boolean zM8438E = m8438E(playerType);
        if (m8444G() && (tb7Var2 = ((hc7) c3244l.getValue()).f42182j) != null && tb7Var2.m21939g() == tb7Var.m21939g()) {
            while (true) {
                Object value3 = c3244l.getValue();
                if (c3244l.m15570h(value3, hc7.m13196a((hc7) value3, playerType, null, null, 0L, 0, 0L, false, false, null, tb7Var, false, null, tb7Var, 3582))) {
                    break;
                } else {
                    z2 = false;
                }
            }
        } else {
            PlayerState playerState = (zM8438E && z) ? PlayerState.Playing : PlayerState.Paused;
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, playerType, playerState, null, 0L, (!zM8438E || (m97VarM12305a = g2c.m12305a(tb7Var)) == null) ? 0 : (int) m97VarM12305a.m16699c(), 0L, false, false, null, tb7Var, false, null, tb7Var, 3524)));
        }
        if (z3 && zM8438E) {
            jw2 jw2Var = this.f21960m;
            if (jw2Var == null) {
                fa4.m11636J("player");
                throw null;
            }
            jw2Var.m14699E();
            if (jw2Var == null) {
                fa4.m11636J("player");
                throw null;
            }
            jw2Var.m14707c();
        }
        this.f21963p.removeCallbacks(this.f21962o);
        if (tb7Var.m21937e() == PlayerType.Video) {
            pg9 pg9Var = this.f21972y;
            if (pg9Var != null) {
                pg9Var.mo4537a(null);
            }
            this.f21972y = wfb.m23926u(this.f21949b, this.f21950c, null, new PlayerControllerImpl$observeBookmarkAndSeek$1(this, tb7Var, z, null), 2);
            if (z) {
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, hc7.m13196a((hc7) value2, null, PlayerState.Playing, null, 0L, 0, 0L, false, false, null, null, false, null, null, 8189)));
            }
            m8441Y(this, false, 3);
            return;
        }
        ob1.Companion.getClass();
        File file = new File(mb1.m16743c(this.f21948a) + "/" + tb7Var.m21939g() + ".mp3");
        if (!file.exists()) {
            m8447J();
            m8441Y(this, false, 3);
        } else {
            int iM21939g2 = tb7Var.m21939g();
            String absolutePath = file.getAbsolutePath();
            absolutePath.getClass();
            m8448K(absolutePath, iM21939g2, z);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m8461a0(List list) {
        C3244l c3244l;
        Object value;
        list.getClass();
        C3244l c3244l2 = this.f21943A;
        c3244l2.getClass();
        c3244l2.m15572j(null, list);
        do {
            c3244l = this.f21945C;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, null, null, null, 0L, 0, 0L, false, false, null, null, false, list, null, 6143)));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m8462b0(long j) {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f21945C;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, null, null, null, j, 0, 0L, false, false, null, null, false, null, null, 8183)));
    }

    /* JADX INFO: renamed from: c */
    public final void m8463c(int i, float f, int i2) {
        m97 m97VarM12305a;
        Integer num = this.f21968u;
        Integer num2 = this.f21967t;
        if (num == null || num.intValue() != i || num2 == null) {
            this.f21968u = Integer.valueOf(i);
            this.f21967t = Integer.valueOf(i2);
            return;
        }
        int iIntValue = i2 - num2.intValue();
        this.f21967t = Integer.valueOf(i2);
        if (iIntValue <= 0) {
            return;
        }
        if (iIntValue > 10000) {
            rm5 rm5Var = sm5.Companion;
            StringBuilder sbM22994q = ux5.m22994q(i, iIntValue, "[LessonTracking] PLAYER_LISTEN accumulateListeningProgress skippedLargeDelta lessonId=", " mediaDeltaMs=", " lastPositionMs=");
            sbM22994q.append(num2);
            sbM22994q.append(" positionMs=");
            sbM22994q.append(i2);
            String string = sbM22994q.toString();
            rm5Var.getClass();
            h0a.f41641a.mo11431b(string, new Object[0]);
            return;
        }
        tb7 tb7VarM12625d = this.f21961n.m12625d();
        long jM16700d = (tb7VarM12625d == null || (m97VarM12305a = g2c.m12305a(tb7VarM12625d)) == null) ? iIntValue : m97VarM12305a.m16700d(num2.intValue(), i2);
        if (jM16700d <= 0) {
            return;
        }
        Float fValueOf = Float.valueOf(f);
        if (f <= 0.0f) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 1.0f;
        this.f21966s += jM16700d;
        this.f21965r = ss5.m21694U(jM16700d / fFloatValue) + this.f21965r;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m8464c0(int i) {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f21945C;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, null, null, null, 0L, i, 0L, false, false, null, null, false, null, null, 8175)));
        m8459X(i);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m8465d0(PlayerState playerState, boolean z) {
        PlayerType playerTypeM21937e;
        C3244l c3244l;
        Object value;
        playerState.getClass();
        tb7 tb7VarM12625d = this.f21961n.m12625d();
        if (tb7VarM12625d == null || (playerTypeM21937e = tb7VarM12625d.m21937e()) == null) {
            playerTypeM21937e = PlayerType.Undefined;
        }
        if (m8438E(playerTypeM21937e) || z) {
            do {
                c3244l = this.f21945C;
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, null, playerState, null, 0L, 0, 0L, false, false, null, null, false, null, null, 8189)));
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m8466e0(PlayerViewState playerViewState) {
        C3244l c3244l;
        Object value;
        playerViewState.getClass();
        do {
            c3244l = this.f21945C;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, hc7.m13196a((hc7) value, null, null, playerViewState, 0L, 0, 0L, false, false, null, null, false, null, null, 8187)));
    }

    /* JADX INFO: renamed from: g */
    public final int m8467g() {
        return ((hc7) this.f21945C.getValue()).f42177e;
    }

    /* JADX INFO: renamed from: j */
    public final int m8468j() {
        return (int) ((hc7) this.f21945C.getValue()).f42176d;
    }

    /* JADX INFO: renamed from: l */
    public final void m8469l(String str) {
        gh1 gh1Var = this.f21961n;
        tb7 tb7VarM12625d = gh1Var.m12625d();
        if (tb7VarM12625d != null) {
            int iM21939g = tb7VarM12625d.m21939g();
            int iM8467g = m8467g();
            jw2 jw2Var = this.f21960m;
            if (jw2Var == null) {
                fa4.m11636J("player");
                throw null;
            }
            m8463c(iM21939g, jw2Var.m14720p().f52510a, iM8467g);
        }
        if (this.f21965r > 0 || this.f21966s > 0) {
            rm5 rm5Var = sm5.Companion;
            tb7 tb7VarM12625d2 = gh1Var.m12625d();
            Integer numValueOf = tb7VarM12625d2 != null ? Integer.valueOf(tb7VarM12625d2.m21939g()) : null;
            String str2 = "[LessonTracking] PLAYER_LISTEN flushPendingListeningForCurrentTrack reason=" + str + " lessonId=" + numValueOf + " wallMs=" + this.f21965r + " mediaMs=" + this.f21966s + " position=" + m8467g() + " duration=" + m8468j();
            rm5Var.getClass();
            h0a.f41641a.mo11431b(str2, new Object[0]);
            m8449L(this.f21965r, this.f21966s);
            this.f21965r = 0L;
            this.f21966s = 0L;
        }
    }

    @Override // p000.ba7
    /* JADX INFO: renamed from: u */
    public final void mo3524u(int i, boolean z) {
        Object value;
        Object value2;
        int i2;
        C3244l c3244l;
        Object value3;
        LinkedHashMap linkedHashMapM15372Y;
        Object value4;
        Object value5;
        Object value6;
        jw2 jw2Var = this.f21960m;
        if (jw2Var == null) {
            fa4.m11636J("player");
            throw null;
        }
        this.f21953f.mo9202T1(i, jw2Var.m14714j(), z);
        C3244l c3244l2 = this.f21945C;
        if (m8438E(((hc7) c3244l2.getValue()).f42173a)) {
            this.f21959l = i;
            return;
        }
        if (i == 3 && z) {
            do {
                value6 = c3244l2.getValue();
            } while (!c3244l2.m15570h(value6, hc7.m13196a((hc7) value6, PlayerType.Audio, PlayerState.Playing, null, m8454S(), 0, 0L, false, false, null, null, false, null, null, 8180)));
            this.f21959l = 3;
            m8459X(m8467g());
        } else if (i == 3) {
            do {
                value4 = c3244l2.getValue();
            } while (!c3244l2.m15570h(value4, hc7.m13196a((hc7) value4, null, null, null, m8454S(), 0, 0L, false, false, null, null, false, null, null, 8183)));
            if (!m8444G()) {
                do {
                    value5 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value5, hc7.m13196a((hc7) value5, PlayerType.Audio, PlayerState.Paused, null, 0L, 0, 0L, false, false, null, null, false, null, null, 8188)));
            }
            this.f21959l = 3;
        } else if (i == 2) {
            this.f21959l = 2;
        } else {
            gh1 gh1Var = this.f21961n;
            if (i == 4) {
                do {
                    value2 = c3244l2.getValue();
                } while (!c3244l2.m15570h(value2, hc7.m13196a((hc7) value2, PlayerType.Audio, PlayerState.Paused, null, 0L, 0, 0L, false, false, null, null, false, null, null, 8188)));
                rm5 rm5Var = sm5.Companion;
                tb7 tb7VarM12625d = gh1Var.m12625d();
                Integer numValueOf = tb7VarM12625d != null ? Integer.valueOf(tb7VarM12625d.m21939g()) : null;
                int i3 = this.f21959l;
                if (jw2Var == null) {
                    fa4.m11636J("player");
                    throw null;
                }
                long jM14714j = jw2Var.m14714j();
                long j = ((hc7) c3244l2.getValue()).f42176d;
                tb7 tb7VarM12625d2 = gh1Var.m12625d();
                String str = "[LessonTracking] PLAYER_LISTEN onPlayerStateChanged STATE_ENDED lessonId=" + numValueOf + " playerLastState=" + i3 + " currentPosition=" + jM14714j + " uiDuration=" + j + " trackDuration=" + (tb7VarM12625d2 != null ? Integer.valueOf(tb7VarM12625d2.m21936d()) : null);
                rm5Var.getClass();
                f0a f0aVar = h0a.f41641a;
                f0aVar.mo11431b(str, new Object[0]);
                if (this.f21959l != 4) {
                    tb7 tb7VarM12625d3 = gh1Var.m12625d();
                    if (tb7VarM12625d3 != null) {
                        int iM21939g = tb7VarM12625d3.m21939g();
                        int iM8467g = m8467g();
                        int iM8468j = m8468j();
                        int iM21936d = tb7VarM12625d3.m21936d();
                        long j2 = this.f21965r;
                        long j3 = this.f21966s;
                        StringBuilder sbM22994q = ux5.m22994q(iM21939g, iM8467g, "[LessonTracking] PLAYER_LISTEN trackEnded lessonId=", " currentPosition=", " duration=");
                        hn1.m13360j(iM8468j, iM21936d, " trackDuration=", " wallMs=", sbM22994q);
                        sbM22994q.append(j2);
                        sbM22994q.append(" mediaMs=");
                        sbM22994q.append(j3);
                        f0aVar.mo11431b(sbM22994q.toString(), new Object[0]);
                        m8469l("trackEnded");
                        rb7 rb7Var = this.f21957j;
                        rb7Var.getClass();
                        hm5 hm5Var = rb7Var.f59025a;
                        Bundle bundle = new Bundle();
                        bundle.putInt("Lesson ID", tb7VarM12625d3.m21939g());
                        bundle.putString("Lesson language", AbstractC3184kh.m15223q(tb7VarM12625d3.m21938f()));
                        bundle.putString("Lesson name", tb7VarM12625d3.m21941i());
                        bundle.putString("Lesson level", tb7VarM12625d3.m21940h());
                        bundle.putString("Course name", tb7VarM12625d3.m21935c());
                        bundle.putInt("Course ID", tb7VarM12625d3.m21934b());
                        String lowerCase = tb7VarM12625d3.m21942j().name().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        bundle.putString("audio play location", lowerCase);
                        ((C1240a) hm5Var).m7025f("Lesson audio completed", bundle);
                        v45 v45VarM20570a = rb7.m20570a(tb7VarM12625d3);
                        C1807a c1807a = rb7Var.f59026b;
                        c1807a.getClass();
                        double dDoubleValue = ((Number) c1807a.f21941e.getOrDefault(v45VarM20570a.m23096a(), Double.valueOf(0.0d))).doubleValue();
                        if (new xx6().m24791a(Double.valueOf(dDoubleValue))) {
                            double d = 1.0d - dDoubleValue;
                            c1807a.m8436b("topUpToWholeIfNeeded sessionKey=" + v45VarM20570a.m23096a() + " remainingCoverage=" + nob.m17572a(6, d));
                            c1807a.m8437c(v45VarM20570a, d, 0L);
                        } else {
                            c1807a.m8436b("topUpToWholeIfNeeded skipped sessionKey=" + v45VarM20570a.m23096a() + " accumulatedCoverage=" + nob.m17572a(6, dDoubleValue));
                        }
                        c1807a.m8435a(v45VarM20570a);
                        this.f21968u = Integer.valueOf(tb7VarM12625d3.m21939g());
                        this.f21967t = 0;
                        do {
                            c3244l = this.f21947E;
                            value3 = c3244l.getValue();
                            linkedHashMapM15372Y = AbstractC3194a.m15372Y((Map) value3);
                            linkedHashMapM15372Y.put(Integer.valueOf(tb7VarM12625d3.m21939g()), 0);
                        } while (!c3244l.m15570h(value3, linkedHashMapM15372Y));
                        m8452Q(0);
                        m8447J();
                        wfb.m23926u(this.f21949b, null, null, new PlayerControllerImpl$trackEnded$2(this, tb7VarM12625d3, null), 3);
                    }
                    m8455T();
                    i2 = 4;
                } else {
                    i2 = 4;
                }
                this.f21959l = i2;
            } else if (i == 1) {
                do {
                    value = c3244l2.getValue();
                } while (!c3244l2.m15570h(value, hc7.m13196a((hc7) value, PlayerType.Audio, PlayerState.Paused, null, 0L, 0, 0L, false, false, null, null, false, null, null, 8188)));
                tb7 tb7VarM12625d4 = gh1Var.m12625d();
                if (tb7VarM12625d4 != null && !m8445H(tb7VarM12625d4.m21939g())) {
                    m8460Z(tb7VarM12625d4, true);
                }
            }
        }
        m8451P();
    }
}
