package androidx.compose.foundation.text.selection;

import android.content.ClipDescription;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.contextmenu.modifier.C0174c;
import androidx.compose.foundation.text.contextmenu.modifier.ToolbarHandlerState;
import androidx.compose.runtime.AbstractC0278f;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import java.util.ArrayList;
import kotlin.AbstractC3193b;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.CoroutineStart;
import p000.AbstractC3695vr;
import p000.C3300lj;
import p000.C3386nv;
import p000.C3419on;
import p000.C3610tg;
import p000.b16;
import p000.bna;
import p000.ci8;
import p000.cx9;
import p000.d32;
import p000.dr3;
import p000.e16;
import p000.eh0;
import p000.er3;
import p000.f37;
import p000.fa4;
import p000.g9c;
import p000.gq6;
import p000.ij6;
import p000.jc9;
import p000.kwa;
import p000.l70;
import p000.lda;
import p000.mq6;
import p000.nj0;
import p000.ou8;
import p000.pg9;
import p000.pj3;
import p000.pu8;
import p000.pv9;
import p000.pw9;
import p000.qna;
import p000.qt9;
import p000.rfa;
import p000.rw9;
import p000.sw9;
import p000.t31;
import p000.t66;
import p000.tf4;
import p000.ui3;
import p000.un1;
import p000.vi3;
import p000.vm1;
import p000.vv9;
import p000.vz1;
import p000.w46;
import p000.wfb;
import p000.x44;
import p000.x87;
import p000.xc9;
import p000.xfa;
import p000.yw4;
import p000.z93;

/* JADX INFO: renamed from: androidx.compose.foundation.text.selection.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0205f {

    /* JADX INFO: renamed from: A */
    public final x44 f3074A;

    /* JADX INFO: renamed from: B */
    public boolean f3075B;

    /* JADX INFO: renamed from: a */
    public final rfa f3076a;

    /* JADX INFO: renamed from: d */
    public yw4 f3079d;

    /* JADX INFO: renamed from: g */
    public ui3 f3082g;

    /* JADX INFO: renamed from: h */
    public t31 f3083h;

    /* JADX INFO: renamed from: i */
    public un1 f3084i;

    /* JADX INFO: renamed from: j */
    public C0200a f3085j;

    /* JADX INFO: renamed from: k */
    public dr3 f3086k;

    /* JADX INFO: renamed from: l */
    public z93 f3087l;

    /* JADX INFO: renamed from: m */
    public final t66 f3088m;

    /* JADX INFO: renamed from: n */
    public final t66 f3089n;

    /* JADX INFO: renamed from: o */
    public long f3090o;

    /* JADX INFO: renamed from: p */
    public cx9 f3091p;

    /* JADX INFO: renamed from: q */
    public long f3092q;

    /* JADX INFO: renamed from: r */
    public final t66 f3093r;

    /* JADX INFO: renamed from: s */
    public final t66 f3094s;

    /* JADX INFO: renamed from: t */
    public int f3095t;

    /* JADX INFO: renamed from: u */
    public vv9 f3096u;

    /* JADX INFO: renamed from: v */
    public x44 f3097v;

    /* JADX INFO: renamed from: w */
    public cx9 f3098w;

    /* JADX INFO: renamed from: x */
    public final t66 f3099x;

    /* JADX INFO: renamed from: y */
    public final C0174c f3100y;

    /* JADX INFO: renamed from: z */
    public final pv9 f3101z;

    /* JADX INFO: renamed from: b */
    public mq6 f3077b = qna.f57992a;

    /* JADX INFO: renamed from: c */
    public vi3 f3078c = new tf4(9);

    /* JADX INFO: renamed from: e */
    public final t66 f3080e = AbstractC0278f.m1260j(new vv9((String) null, 7, 0));

    /* JADX INFO: renamed from: f */
    public kwa f3081f = g9c.f40432f;

    public C0205f(rfa rfaVar) {
        this.f3076a = rfaVar;
        Boolean bool = Boolean.TRUE;
        this.f3088m = AbstractC0278f.m1260j(bool);
        this.f3089n = AbstractC0278f.m1260j(bool);
        this.f3090o = 0L;
        this.f3092q = 0L;
        this.f3093r = AbstractC0278f.m1260j(null);
        this.f3094s = AbstractC0278f.m1260j(null);
        this.f3095t = -1;
        this.f3096u = new vv9((String) null, 7, 0L);
        this.f3099x = AbstractC0278f.m1260j(Boolean.FALSE);
        C0174c c0174c = new C0174c();
        c0174c.f2883b = ToolbarHandlerState.Uninitialized;
        this.f3100y = c0174c;
        this.f3101z = new pv9(this);
        this.f3074A = new x44(this);
    }

    /* JADX INFO: renamed from: a */
    public static final Pair m1100a(C0205f c0205f) {
        String str;
        cx9 cx9Var;
        C3419on c3419onM1113n = c0205f.m1113n();
        if (c3419onM1113n == null || (str = c3419onM1113n.f54604b) == null || (cx9Var = c0205f.f3098w) == null) {
            return null;
        }
        long j = cx9Var.f34694a;
        return new Pair(str, new cx9(eh0.m11127g(c0205f.f3077b.mo13411t((int) (j >> 32)), c0205f.f3077b.mo13411t((int) (j & 4294967295L)))));
    }

    /* JADX INFO: renamed from: b */
    public static final void m1101b(C0205f c0205f, cx9 cx9Var) {
        C3419on c3419onM1113n;
        String str;
        un1 un1Var;
        if (cx9Var == null) {
            return;
        }
        long j = cx9Var.f34694a;
        C0200a c0200a = c0205f.f3085j;
        if (c0200a == null || (c3419onM1113n = c0205f.m1113n()) == null || (str = c3419onM1113n.f54604b) == null) {
            return;
        }
        mq6 mq6Var = c0205f.f3077b;
        long jM11127g = eh0.m11127g(mq6Var.mo13411t((int) (j >> 32)), mq6Var.mo13411t((int) (j & 4294967295L)));
        if (str.length() <= 0 || cx9.m9921c(jM11127g) || (un1Var = c0205f.f3084i) == null) {
            return;
        }
        wfb.m23926u(un1Var, null, null, new TextFieldSelectionManager$maybeSuggestSelection$1(c0200a, str, jM11127g, cx9Var, c0205f, mq6Var, null), 3);
    }

    /* JADX INFO: renamed from: c */
    public static final long m1102c(C0205f c0205f, vv9 vv9Var, long j, boolean z, boolean z2, ij6 ij6Var, boolean z3, er3 er3Var) {
        sw9 sw9VarM25363d;
        long j2;
        int i;
        long j3;
        pu8 pu8Var;
        pu8 pu8Var2;
        boolean z4;
        boolean z5;
        dr3 dr3Var;
        ou8 ou8VarM3950g;
        ou8 ou8Var;
        ou8 ou8Var2;
        yw4 yw4Var = c0205f.f3079d;
        if (yw4Var == null || (sw9VarM25363d = yw4Var.m25363d()) == null) {
            return cx9.f34692b;
        }
        mq6 mq6Var = c0205f.f3077b;
        long j4 = vv9Var.f65991b;
        C3419on c3419on = vv9Var.f65990a;
        int i2 = cx9.f34693c;
        long jM11127g = eh0.m11127g(mq6Var.mo13411t((int) (j4 >> 32)), c0205f.f3077b.mo13411t((int) (j4 & 4294967295L)));
        int iM21754b = sw9VarM25363d.m21754b(j, false);
        int i3 = (z2 || z) ? iM21754b : (int) (jM11127g >> 32);
        if (!z2 || z) {
            j2 = 4294967295L;
            i = iM21754b;
        } else {
            j2 = 4294967295L;
            i = (int) (jM11127g & 4294967295L);
        }
        x44 x44Var = c0205f.f3097v;
        int i4 = -1;
        if (z || x44Var == null) {
            j3 = j2;
        } else {
            j3 = j2;
            int i5 = c0205f.f3095t;
            if (i5 != -1) {
                i4 = i5;
            }
        }
        rw9 rw9Var = sw9VarM25363d.f61519a;
        if (z) {
            pu8Var = null;
        } else {
            int i6 = (int) (jM11127g >> 32);
            int i7 = (int) (jM11127g & j3);
            pu8Var = new pu8(new ou8(wfb.m23923r(rw9Var, i6), i6, 1L), new ou8(wfb.m23923r(rw9Var, i7), i7, 1L), cx9.m9925g(jM11127g));
        }
        x44 x44Var2 = new x44(z2, pu8Var, new pj3(i3, i, i4, rw9Var), 2);
        if (pu8Var != null && x44Var != null && z2 == x44Var.f67751b) {
            pj3 pj3Var = (pj3) x44Var.f67753d;
            if (i3 == pj3Var.f56311b && i == pj3Var.f56312c) {
                return j4;
            }
        }
        c0205f.f3097v = x44Var2;
        c0205f.f3095t = iM21754b;
        switch (ij6Var.f44188a) {
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                pj3 pj3Var2 = (pj3) x44Var2.f67753d;
                pu8Var2 = new pu8(pj3Var2.m19196b(pj3Var2.f56311b), pj3Var2.m19196b(pj3Var2.f56312c), x44Var2.m24265b() == CrossStatus.CROSSED);
                break;
            case 24:
                pu8Var2 = bna.m3946e(x44Var2, nj0.f52797P);
                break;
            case 25:
                pu8Var2 = bna.m3946e(x44Var2, g9c.f40431e);
                break;
            default:
                pu8Var2 = (pu8) x44Var2.f67752c;
                pj3 pj3Var3 = (pj3) x44Var2.f67753d;
                if (pu8Var2 != null) {
                    ou8 ou8Var3 = pu8Var2.f56818b;
                    ou8 ou8Var4 = pu8Var2.f56817a;
                    if (x44Var2.f67751b) {
                        ou8VarM3950g = bna.m3950g(x44Var2, pj3Var3, ou8Var4);
                        ou8Var2 = ou8Var3;
                        ou8Var3 = ou8Var4;
                        ou8Var = ou8VarM3950g;
                    } else {
                        ou8VarM3950g = bna.m3950g(x44Var2, pj3Var3, ou8Var3);
                        ou8Var = ou8Var4;
                        ou8Var2 = ou8VarM3950g;
                    }
                    if (!fa4.m11650l(ou8VarM3950g, ou8Var3)) {
                        pu8Var2 = bna.m3922K(new pu8(ou8Var, ou8Var2, x44Var2.m24265b() == CrossStatus.CROSSED || (x44Var2.m24265b() == CrossStatus.COLLAPSED && ou8Var.f55005b > ou8Var2.f55005b)), x44Var2);
                    }
                } else {
                    pu8Var2 = bna.m3946e(x44Var2, nj0.f52797P);
                }
                break;
        }
        long jM11127g2 = eh0.m11127g(c0205f.f3077b.mo13407j(pu8Var2.f56817a.f55005b), c0205f.f3077b.mo13407j(pu8Var2.f56818b.f55005b));
        if (cx9.m9920b(jM11127g2, j4)) {
            return j4;
        }
        boolean z6 = cx9.m9925g(jM11127g2) != cx9.m9925g(j4) && cx9.m9920b(eh0.m11127g((int) (jM11127g2 & j3), (int) (jM11127g2 >> 32)), j4);
        boolean z7 = cx9.m9921c(jM11127g2) && cx9.m9921c(j4);
        if (z3 && c3419on.f54604b.length() > 0 && !z6 && !z7 && er3Var != null && (dr3Var = c0205f.f3086k) != null) {
            ((x87) dr3Var).m24403a(er3Var.f37744a);
        }
        c0205f.f3078c.invoke(m1103e(c3419on, jM11127g2));
        c0205f.f3098w = new cx9(jM11127g2);
        if (!z3) {
            c0205f.m1120u(!cx9.m9921c(jM11127g2));
        }
        yw4 yw4Var2 = c0205f.f3079d;
        if (yw4Var2 != null) {
            ((xc9) yw4Var2.f70585q).setValue(Boolean.valueOf(z3));
        }
        yw4 yw4Var3 = c0205f.f3079d;
        if (yw4Var3 != null) {
            ((xc9) yw4Var3.f70581m).setValue(Boolean.valueOf(!cx9.m9921c(jM11127g2) && AbstractC3695vr.m23515z(c0205f, true)));
        }
        yw4 yw4Var4 = c0205f.f3079d;
        if (yw4Var4 != null) {
            if (cx9.m9921c(jM11127g2)) {
                z4 = false;
            } else {
                z4 = false;
                if (AbstractC3695vr.m23515z(c0205f, false)) {
                    z5 = true;
                }
                ((xc9) yw4Var4.f70582n).setValue(Boolean.valueOf(z5));
            }
            z5 = z4;
            ((xc9) yw4Var4.f70582n).setValue(Boolean.valueOf(z5));
        } else {
            z4 = false;
        }
        yw4 yw4Var5 = c0205f.f3079d;
        if (yw4Var5 != null) {
            if (cx9.m9921c(jM11127g2) && AbstractC3695vr.m23515z(c0205f, true)) {
                z4 = true;
            }
            ((xc9) yw4Var5.f70583o).setValue(Boolean.valueOf(z4));
        }
        return jM11127g2;
    }

    /* JADX INFO: renamed from: e */
    public static vv9 m1103e(C3419on c3419on, long j) {
        return new vv9(c3419on, j, (cx9) null);
    }

    /* JADX INFO: renamed from: d */
    public final pg9 m1104d(boolean z) {
        un1 un1Var = this.f3084i;
        if (un1Var != null) {
            return wfb.m23926u(un1Var, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$copy$1(this, z, null), 1);
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    public final void m1105f() {
        un1 un1Var = this.f3084i;
        if (un1Var != null) {
            wfb.m23926u(un1Var, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null), 1);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m1106g(gq6 gq6Var) {
        if (!cx9.m9921c(m1114o().f65991b)) {
            yw4 yw4Var = this.f3079d;
            sw9 sw9VarM25363d = yw4Var != null ? yw4Var.m25363d() : null;
            int iM9923e = (gq6Var == null || sw9VarM25363d == null) ? cx9.m9923e(m1114o().f65991b) : this.f3077b.mo13407j(sw9VarM25363d.m21754b(gq6Var.f41189a, true));
            vv9 vv9VarM23560a = vv9.m23560a(m1114o(), null, eh0.m11127g(iM9923e, iM9923e), 5);
            this.f3078c.invoke(vv9VarM23560a);
            this.f3098w = new cx9(vv9VarM23560a.f65991b);
        }
        m1117r((gq6Var == null || m1114o().f65990a.f54604b.length() <= 0) ? HandleState.None : HandleState.Cursor);
        m1120u(false);
    }

    /* JADX INFO: renamed from: h */
    public final void m1107h(boolean z) {
        z93 z93Var;
        yw4 yw4Var = this.f3079d;
        if (yw4Var != null && !yw4Var.m25361b() && (z93Var = this.f3087l) != null) {
            z93.m25512a(z93Var);
        }
        this.f3096u = m1114o();
        m1120u(z);
        m1117r(HandleState.Selection);
    }

    /* JADX INFO: renamed from: i */
    public final e16 m1108i() {
        if (!m1111l()) {
            return b16.f7762a;
        }
        return fa4.m11635I(d32.m10038f0(new TextFieldSelectionManager$contextMenuAreaModifier$1(this, null)), this.f3100y, new TextFieldSelectionManager$contextMenuAreaModifier$2(this, null), new TextFieldSelectionManager$contextMenuAreaModifier$3(this, null), new vm1(this, 2));
    }

    /* JADX INFO: renamed from: j */
    public final gq6 m1109j() {
        return (gq6) ((xc9) this.f3094s).getValue();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m1110k() {
        return ((Boolean) ((xc9) this.f3088m).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: l */
    public final boolean m1111l() {
        return ((Boolean) ((xc9) this.f3089n).getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: m */
    public final long m1112m(boolean z) {
        sw9 sw9VarM25363d;
        long j;
        yw4 yw4Var = this.f3079d;
        if (yw4Var == null || (sw9VarM25363d = yw4Var.m25363d()) == null) {
            return 9205357640488583168L;
        }
        rw9 rw9Var = sw9VarM25363d.f61519a;
        w46 w46Var = rw9Var.f59976b;
        C3419on c3419onM1113n = m1113n();
        if (c3419onM1113n == null) {
            return 9205357640488583168L;
        }
        if (!fa4.m11650l(c3419onM1113n.f54604b, rw9Var.f59975a.f58295a.f54604b)) {
            return 9205357640488583168L;
        }
        vv9 vv9VarM1114o = m1114o();
        if (z) {
            long j2 = vv9VarM1114o.f65991b;
            int i = cx9.f34693c;
            j = j2 >> 32;
        } else {
            long j3 = vv9VarM1114o.f65991b;
            int i2 = cx9.f34693c;
            j = j3 & 4294967295L;
        }
        int iMo13411t = this.f3077b.mo13411t((int) j);
        boolean zM9925g = cx9.m9925g(m1114o().f65991b);
        long j4 = rw9Var.f59977c;
        int iM23743d = w46Var.m23743d(iMo13411t);
        if (iM23743d >= w46Var.f66381f) {
            return 9205357640488583168L;
        }
        boolean z2 = rw9Var.m20954a(((!z || zM9925g) && (z || !zM9925g)) ? Math.max(iMo13411t + (-1), 0) : iMo13411t) == rw9Var.m20961h(iMo13411t);
        w46Var.m23749l(iMo13411t);
        int length = ((C3419on) w46Var.f66376a.f66365a).f54604b.length();
        ArrayList arrayList = w46Var.f66383h;
        f37 f37Var = (f37) arrayList.get(iMo13411t == length ? vz1.m23602H(arrayList) : ci8.m4737v(iMo13411t, arrayList));
        C3300lj c3300lj = f37Var.f38358a;
        int iM11527d = f37Var.m11527d(iMo13411t);
        pw9 pw9Var = c3300lj.f49728d;
        return (((long) Float.floatToRawIntBits(l70.m15944g(w46Var.m23741b(iM23743d), 0.0f, (int) (j4 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(l70.m15944g(z2 ? pw9Var.m19553j(iM11527d, false) : pw9Var.m19554k(iM11527d, false), 0.0f, (int) (j4 >> 32)))) << 32);
    }

    /* JADX INFO: renamed from: n */
    public final C3419on m1113n() {
        yw4 yw4Var = this.f3079d;
        if (yw4Var != null) {
            return yw4Var.f70569a.f64340a;
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public final vv9 m1114o() {
        return (vv9) ((xc9) this.f3080e).getValue();
    }

    /* JADX INFO: renamed from: p */
    public final void m1115p() {
        pg9 pg9Var;
        qt9 qt9Var = this.f3100y.f2882a;
        if (qt9Var == null || (pg9Var = qt9Var.f58196P) == null) {
            return;
        }
        pg9Var.mo4537a(null);
        qt9Var.f58196P = null;
    }

    /* JADX INFO: renamed from: q */
    public final void m1116q() {
        un1 un1Var = this.f3084i;
        if (un1Var != null) {
            wfb.m23926u(un1Var, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$paste$1(this, null), 1);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m1117r(HandleState handleState) {
        yw4 yw4Var = this.f3079d;
        if (yw4Var != null) {
            if (yw4Var.m25360a() == handleState) {
                yw4Var = null;
            }
            if (yw4Var != null) {
                ((xc9) yw4Var.f70579k).setValue(handleState);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m1118s() {
        yw4 yw4Var;
        jc9 jc9VarM16139y = lda.m16139y();
        vi3 vi3VarMo3163e = jc9VarM16139y != null ? jc9VarM16139y.mo3163e() : null;
        jc9 jc9VarM16106F = lda.m16106F(jc9VarM16139y);
        try {
            if (!m1111l() || ((yw4Var = this.f3079d) != null && !((Boolean) ((xc9) yw4Var.f70585q).getValue()).booleanValue())) {
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            } else {
                lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
                this.f3100y.m1066a();
            }
        } catch (Throwable th) {
            lda.m16110J(jc9VarM16139y, jc9VarM16106F, vi3VarMo3163e);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: t */
    public final Object m1119t(ContinuationImpl continuationImpl) throws Throwable {
        TextFieldSelectionManager$updateClipboardEntry$1 textFieldSelectionManager$updateClipboardEntry$1;
        if (continuationImpl instanceof TextFieldSelectionManager$updateClipboardEntry$1) {
            textFieldSelectionManager$updateClipboardEntry$1 = (TextFieldSelectionManager$updateClipboardEntry$1) continuationImpl;
            int i = textFieldSelectionManager$updateClipboardEntry$1.f3055d;
            if ((i & Integer.MIN_VALUE) != 0) {
                textFieldSelectionManager$updateClipboardEntry$1.f3055d = i - Integer.MIN_VALUE;
            } else {
                textFieldSelectionManager$updateClipboardEntry$1 = new TextFieldSelectionManager$updateClipboardEntry$1(this, continuationImpl);
            }
        } else {
            textFieldSelectionManager$updateClipboardEntry$1 = new TextFieldSelectionManager$updateClipboardEntry$1(this, continuationImpl);
        }
        Object objValueOf = textFieldSelectionManager$updateClipboardEntry$1.f3053b;
        Object obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = textFieldSelectionManager$updateClipboardEntry$1.f3055d;
        if (i2 == 0) {
            AbstractC3193b.m15359b(objValueOf);
            t31 t31Var = this.f3083h;
            if (t31Var != null) {
                textFieldSelectionManager$updateClipboardEntry$1.f3052a = this;
                textFieldSelectionManager$updateClipboardEntry$1.f3055d = 1;
                ClipDescription primaryClipDescription = ((C3610tg) t31Var).f62240a.m3360m().getPrimaryClipDescription();
                objValueOf = Boolean.valueOf(primaryClipDescription != null && primaryClipDescription.hasMimeType("text/*"));
                if (objValueOf == obj) {
                    return obj;
                }
            }
            return xfa.f68157a;
        }
        if (i2 != 1) {
            C3386nv.m17633t("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        this = textFieldSelectionManager$updateClipboardEntry$1.f3052a;
        AbstractC3193b.m15359b(objValueOf);
        Boolean bool = (Boolean) objValueOf;
        bool.getClass();
        ((xc9) this.f3099x).setValue(bool);
        return xfa.f68157a;
    }

    /* JADX INFO: renamed from: u */
    public final void m1120u(boolean z) {
        yw4 yw4Var = this.f3079d;
        if (yw4Var != null) {
            ((xc9) yw4Var.f70580l).setValue(Boolean.valueOf(z));
        }
        if (z) {
            m1118s();
        } else {
            m1115p();
        }
    }
}
