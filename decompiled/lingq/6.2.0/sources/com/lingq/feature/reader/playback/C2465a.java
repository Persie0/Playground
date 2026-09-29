package com.lingq.feature.reader.playback;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.data.repository.C1295k;
import com.lingq.core.data.repository.C1302r;
import com.lingq.core.domain.lesson.C1381c;
import com.lingq.core.domain.model.lesson.LessonTranslationSentence;
import com.lingq.core.player.C1808b;
import com.lingq.core.player.data.PlayerType;
import com.lingq.core.player.data.PlayerViewState;
import com.lingq.core.player.data.PlayingSource;
import com.lingq.core.player.service.PlayingFrom;
import com.lingq.feature.reader.playback.domain.C2466a;
import com.lingq.feature.reader.playback.domain.C2467b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.AbstractC3224d;
import kotlinx.coroutines.flow.C3228h;
import kotlinx.coroutines.flow.C3244l;
import p000.AbstractC3352my;
import p000.AbstractC3584sr;
import p000.C2907cy;
import p000.C2981ey;
import p000.C3139j9;
import p000.C3513qw;
import p000.C3713w8;
import p000.InterfaceC3055gy;
import p000.InterfaceC3812yx;
import p000.bx0;
import p000.c18;
import p000.c83;
import p000.cma;
import p000.dc7;
import p000.ea7;
import p000.f00;
import p000.h05;
import p000.hi8;
import p000.jy7;
import p000.m83;
import p000.o23;
import p000.q05;
import p000.qj2;
import p000.sca;
import p000.tb7;
import p000.u91;
import p000.un1;
import p000.v91;
import p000.vj6;
import p000.vz1;
import p000.w65;
import p000.wfb;
import p000.xi9;

/* JADX INFO: renamed from: com.lingq.feature.reader.playback.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2465a {

    /* JADX INFO: renamed from: a */
    public final C1808b f29767a;

    /* JADX INFO: renamed from: b */
    public final sca f29768b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3812yx f29769c;

    /* JADX INFO: renamed from: d */
    public final C2466a f29770d;

    /* JADX INFO: renamed from: e */
    public final o23 f29771e;

    /* JADX INFO: renamed from: f */
    public final C3713w8 f29772f;

    /* JADX INFO: renamed from: g */
    public final C2467b f29773g;

    /* JADX INFO: renamed from: h */
    public final C3139j9 f29774h;

    /* JADX INFO: renamed from: i */
    public final qj2 f29775i;

    /* JADX INFO: renamed from: j */
    public final C1381c f29776j;

    /* JADX INFO: renamed from: k */
    public final hi8 f29777k;

    /* JADX INFO: renamed from: l */
    public final vj6 f29778l;

    /* JADX INFO: renamed from: m */
    public final cma f29779m;

    /* JADX INFO: renamed from: n */
    public final dc7 f29780n;

    /* JADX INFO: renamed from: o */
    public final un1 f29781o;

    /* JADX INFO: renamed from: p */
    public final C3244l f29782p;

    /* JADX INFO: renamed from: q */
    public final c18 f29783q;

    /* JADX INFO: renamed from: r */
    public final C3244l f29784r;

    /* JADX INFO: renamed from: s */
    public List f29785s;

    /* JADX INFO: renamed from: t */
    public int f29786t;

    /* JADX INFO: renamed from: u */
    public String f29787u;

    /* JADX INFO: renamed from: v */
    public tb7 f29788v;

    /* JADX INFO: renamed from: w */
    public final C3244l f29789w;

    public C2465a(C1808b c1808b, sca scaVar, InterfaceC3812yx interfaceC3812yx, C2466a c2466a, o23 o23Var, C3713w8 c3713w8, C2467b c2467b, C3139j9 c3139j9, qj2 qj2Var, C1381c c1381c, hi8 hi8Var, vj6 vj6Var, cma cmaVar, dc7 dc7Var, un1 un1Var) {
        c1808b.getClass();
        scaVar.getClass();
        interfaceC3812yx.getClass();
        cmaVar.getClass();
        dc7Var.getClass();
        un1Var.getClass();
        this.f29767a = c1808b;
        this.f29768b = scaVar;
        this.f29769c = interfaceC3812yx;
        this.f29770d = c2466a;
        this.f29771e = o23Var;
        this.f29772f = c3713w8;
        this.f29773g = c2467b;
        this.f29774h = c3139j9;
        this.f29775i = qj2Var;
        this.f29776j = c1381c;
        this.f29777k = hi8Var;
        this.f29778l = vj6Var;
        this.f29779m = cmaVar;
        this.f29780n = dc7Var;
        this.f29781o = un1Var;
        C3244l c3244lM17114d = AbstractC3352my.m17114d(new jy7());
        this.f29782p = c3244lM17114d;
        this.f29783q = AbstractC3224d.m15520B(c3244lM17114d, un1Var, xi9.f68262a, new jy7());
        this.f29784r = AbstractC3352my.m17114d(null);
        this.f29785s = EmptyList.f47638a;
        this.f29787u = "";
        this.f29789w = AbstractC3352my.m17114d(Boolean.FALSE);
        AbstractC3224d.m15545x(new m83(scaVar.mo8494u(), new PlayerStateHolder$observeTtsPlayerStatus$1(this, null), 2), un1Var);
        AbstractC3224d.m15545x(new m83(c1808b.f21946D, new PlayerStateHolder$observePlayerState$1(this, null), 2), un1Var);
    }

    /* JADX INFO: renamed from: a */
    public static final void m9358a(C2465a c2465a, int i, String str, String str2, String str3, String str4, int i2, String str5, int i3, boolean z) {
        ArrayList arrayListM22604V0;
        tb7 tb7Var = new tb7(i, str2, str3, "", str4, i3 * DescriptorProtos.Edition.EDITION_2023_VALUE, str5, z, i2, str, PlayingSource.Reader, PlayerType.Audio, 12288);
        c2465a.f29788v = tb7Var;
        C1808b c1808b = c2465a.f29767a;
        List list = (List) ((C3244l) c1808b.f21944B.f9311a).getValue();
        Iterator it = list.iterator();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (!it.hasNext()) {
                i5 = -1;
                break;
            } else if (((tb7) it.next()).f62101a == i) {
                break;
            } else {
                i5++;
            }
        }
        if (i5 >= 0) {
            List list2 = list;
            arrayListM22604V0 = new ArrayList(v91.m23189q0(list2, 10));
            for (Object obj : list2) {
                int i6 = i4 + 1;
                if (i4 < 0) {
                    vz1.m23628e0();
                    throw null;
                }
                tb7 tb7Var2 = (tb7) obj;
                if (i4 == i5) {
                    tb7Var2 = tb7Var;
                }
                arrayListM22604V0.add(tb7Var2);
                i4 = i6;
            }
        } else {
            arrayListM22604V0 = u91.m22604V0(list, tb7Var);
        }
        c1808b.m8461a0(arrayListM22604V0);
    }

    /* JADX INFO: renamed from: f */
    public static void m9359f(C2465a c2465a, w65 w65Var) {
        Object value;
        c2465a.getClass();
        w65Var.getClass();
        C3244l c3244l = c2465a.f29782p;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, jy7.m14750a((jy7) value, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 65023)));
        wfb.m23926u(c2465a.f29781o, null, null, new PlayerStateHolder$playTts$2(c2465a, w65Var, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x005c  */
    /* JADX INFO: renamed from: b */
    public final void m9360b(int i, String str) {
        Object value;
        Object value2;
        this.f29786t = i;
        this.f29787u = str;
        this.f29780n.mo9211g0(PlayingFrom.Lesson);
        C1808b c1808b = this.f29767a;
        tb7 tb7VarM12625d = c1808b.f21961n.m12625d();
        boolean zM8445H = c1808b.m8445H(i);
        C3244l c3244l = this.f29782p;
        if (zM8445H) {
            if ((tb7VarM12625d != null ? tb7VarM12625d.f62111k : null) == PlayingSource.Reader) {
                do {
                    value2 = c3244l.getValue();
                } while (!c3244l.m15570h(value2, jy7.m14750a((jy7) value2, true, true, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 65532)));
            } else {
                c1808b.m8447J();
                c1808b.m8450M(false);
                do {
                    value = c3244l.getValue();
                } while (!c3244l.m15570h(value, jy7.m14750a((jy7) value, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 65532)));
            }
        } else {
            c1808b.m8447J();
            c1808b.m8450M(false);
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, jy7.m14750a((jy7) value, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 65532)));
        }
        int i2 = this.f29786t;
        q05 q05Var = (q05) ((C1295k) this.f29771e.f53649a).f16498b;
        c83 c83VarM15536o = AbstractC3224d.m15536o(AbstractC3224d.m15536o(new bx0(AbstractC3584sr.m21590A(q05Var.f57071K, false, new String[]{"LessonEntity"}, new h05(i2, q05Var, 9)), 13)));
        String str2 = this.f29787u;
        int i3 = this.f29786t;
        str2.getClass();
        m83 m83Var = new m83(AbstractC3224d.m15536o(new C3228h(c83VarM15536o, AbstractC3224d.m15536o(((C1302r) this.f29772f.f66505a).m7358r(i3, str2)), new PlayerStateHolder$startObservingAudio$1(3, null))), new PlayerStateHolder$startObservingAudio$2(this, null), 2);
        un1 un1Var = this.f29781o;
        AbstractC3224d.m15545x(m83Var, un1Var);
        AbstractC3224d.m15545x(new m83(this.f29777k.m13285v(this.f29787u), new PlayerStateHolder$observeTtsAvailability$1(this, null), 2), un1Var);
        wfb.m23926u(un1Var, null, null, new PlayerStateHolder$syncSentenceTimestamps$1(this, null), 3);
    }

    /* JADX INFO: renamed from: c */
    public final void m9361c() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f29782p;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, jy7.m14750a((jy7) value, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 64511)));
        wfb.m23926u(this.f29781o, null, null, new PlayerStateHolder$onConfirmGenerateAudio$2(this, null), 3);
    }

    /* JADX INFO: renamed from: d */
    public final void m9362d() {
        jy7 jy7Var = (jy7) this.f29782p.getValue();
        InterfaceC3055gy interfaceC3055gy = jy7Var.f46404l;
        if ((interfaceC3055gy instanceof C2907cy) || (interfaceC3055gy instanceof C2981ey)) {
            return;
        }
        if (jy7Var.f46393a) {
            this.f29767a.m8442C(ea7.f36943k);
        } else {
            wfb.m23926u(this.f29781o, null, null, new PlayerStateHolder$onPlayPause$1(this, null), 3);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m9363e(String str, int i, float f) {
        Object value;
        C3244l c3244l = this.f29782p;
        boolean z = ((jy7) c3244l.getValue()).f46399g;
        do {
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, jy7.m14750a((jy7) value, false, false, 0L, 0L, 0.0f, Integer.valueOf(i), false, false, false, false, false, null, false, false, null, null, 65503)));
        wfb.m23926u(this.f29781o, null, null, new PlayerStateHolder$playSentenceTts$2(this, i, str, f, z, null), 3);
    }

    /* JADX INFO: renamed from: g */
    public final void m9364g() {
        C3244l c3244l;
        Object value;
        do {
            c3244l = this.f29782p;
            value = c3244l.getValue();
        } while (!c3244l.m15570h(value, jy7.m14750a((jy7) value, false, true, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 65533)));
        this.f29767a.m8466e0(PlayerViewState.Opened);
    }

    /* JADX INFO: renamed from: h */
    public final void m9365h(C3513qw c3513qw, c18 c18Var) {
        c18Var.getClass();
        AbstractC3224d.m15545x(new m83(AbstractC3224d.m15521C(AbstractC3224d.m15532k(AbstractC3224d.m15536o(c3513qw), c18Var, AbstractC3224d.m15536o(new C3513qw(this.f29782p, 16)), new PlayerStateHolder$startObservingAudioWave$2(4, null)), new C2464x35f3aa0e(this, null)), new PlayerStateHolder$startObservingAudioWave$4(this, null), 2), this.f29781o);
    }

    /* JADX INFO: renamed from: i */
    public final void m9366i(List list) {
        C2465a c2465a = this;
        list.getClass();
        c2465a.f29785s = list;
        while (true) {
            C3244l c3244l = c2465a.f29782p;
            Object value = c3244l.getValue();
            if (c3244l.m15570h(value, jy7.m14750a((jy7) value, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, list, 32767))) {
                jy7 jy7Var = (jy7) c3244l.getValue();
                m9367j(jy7Var.f46393a, jy7Var.f46395c, jy7Var.f46397e);
                return;
            }
            c2465a = this;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m9367j(boolean z, long j, float f) {
        Object value;
        long j2;
        Object next;
        Object value2;
        Object value3;
        C3244l c3244l = this.f29782p;
        if (!z || this.f29785s.isEmpty()) {
            do {
                value = c3244l.getValue();
            } while (!c3244l.m15570h(value, jy7.m14750a((jy7) value, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 49151)));
            return;
        }
        float f2 = f < 0.1f ? 0.1f : f;
        Iterator it = this.f29785s.iterator();
        while (true) {
            if (!it.hasNext()) {
                j2 = j;
                next = null;
                break;
            }
            next = it.next();
            LessonTranslationSentence lessonTranslationSentence = (LessonTranslationSentence) next;
            Double d = lessonTranslationSentence.f19294c;
            if (d != null) {
                double dDoubleValue = d.doubleValue() * 1000.0d;
                Double d2 = lessonTranslationSentence.f19295d;
                if (d2 != null) {
                    double dDoubleValue2 = d2.doubleValue() * 1000.0d;
                    j2 = j;
                    double d3 = j2;
                    if (d3 >= dDoubleValue && d3 < dDoubleValue2) {
                        break;
                    }
                }
            }
        }
        LessonTranslationSentence lessonTranslationSentence2 = (LessonTranslationSentence) next;
        if (lessonTranslationSentence2 == null) {
            do {
                value3 = c3244l.getValue();
            } while (!c3244l.m15570h(value3, jy7.m14750a((jy7) value3, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 49151)));
            return;
        }
        Double d4 = lessonTranslationSentence2.f19294c;
        long jDoubleValue = (long) ((d4 != null ? d4.doubleValue() : 0.0d) * 1000.0d);
        Double d5 = lessonTranslationSentence2.f19295d;
        long jDoubleValue2 = ((long) ((d5 != null ? d5.doubleValue() : 0.0d) * 1000.0d)) - jDoubleValue;
        if (jDoubleValue2 <= 0) {
            do {
                value2 = c3244l.getValue();
            } while (!c3244l.m15570h(value2, jy7.m14750a((jy7) value2, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, null, null, 49151)));
            return;
        }
        while (true) {
            Object value4 = c3244l.getValue();
            long j3 = jDoubleValue;
            long j4 = jDoubleValue2;
            if (c3244l.m15570h(value4, jy7.m14750a((jy7) value4, false, false, 0L, 0L, 0.0f, null, false, false, false, false, false, null, false, false, new f00(lessonTranslationSentence2.f19292a, j3, j4, System.nanoTime(), j2, f2, 0), null, 49151))) {
                return;
            }
            j2 = j;
            jDoubleValue2 = j4;
            jDoubleValue = j3;
        }
    }
}
