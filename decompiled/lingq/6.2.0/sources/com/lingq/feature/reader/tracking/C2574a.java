package com.lingq.feature.reader.tracking;

import android.os.SystemClock;
import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import com.lingq.core.player.C1807a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.AbstractC3194a;
import p000.AbstractC3393o1;
import p000.c65;
import p000.h0a;
import p000.hn1;
import p000.k55;
import p000.m97;
import p000.ma3;
import p000.nob;
import p000.nr9;
import p000.o23;
import p000.pg9;
import p000.rm5;
import p000.sm5;
import p000.t65;
import p000.u91;
import p000.un1;
import p000.ux5;
import p000.v45;
import p000.v91;
import p000.vk9;
import p000.wfb;
import p000.wq1;
import p000.y15;
import p000.yp9;

/* JADX INFO: renamed from: com.lingq.feature.reader.tracking.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C2574a {
    private static final t65 Companion = new t65();

    /* JADX INFO: renamed from: a */
    public final y15 f31141a;

    /* JADX INFO: renamed from: b */
    public final o23 f31142b;

    /* JADX INFO: renamed from: c */
    public final yp9 f31143c;

    /* JADX INFO: renamed from: d */
    public final un1 f31144d;

    /* JADX INFO: renamed from: e */
    public final C1807a f31145e;

    /* JADX INFO: renamed from: f */
    public String f31146f;

    /* JADX INFO: renamed from: g */
    public int f31147g;

    /* JADX INFO: renamed from: h */
    public final LinkedHashSet f31148h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashSet f31149i;

    /* JADX INFO: renamed from: j */
    public Map f31150j;

    /* JADX INFO: renamed from: k */
    public final LinkedHashSet f31151k;

    /* JADX INFO: renamed from: l */
    public final LinkedHashMap f31152l;

    /* JADX INFO: renamed from: m */
    public double f31153m;

    /* JADX INFO: renamed from: n */
    public double f31154n;

    /* JADX INFO: renamed from: o */
    public double f31155o;

    /* JADX INFO: renamed from: p */
    public String f31156p;

    /* JADX INFO: renamed from: q */
    public Long f31157q;

    /* JADX INFO: renamed from: r */
    public pg9 f31158r;

    /* JADX INFO: renamed from: s */
    public k55 f31159s;

    /* JADX INFO: renamed from: t */
    public Long f31160t;

    /* JADX INFO: renamed from: u */
    public Long f31161u;

    /* JADX INFO: renamed from: v */
    public double f31162v;

    /* JADX INFO: renamed from: w */
    public long f31163w;

    public C2574a(y15 y15Var, o23 o23Var, nr9 nr9Var, yp9 yp9Var, un1 un1Var) {
        y15Var.getClass();
        yp9Var.getClass();
        un1Var.getClass();
        this.f31141a = y15Var;
        this.f31142b = o23Var;
        this.f31143c = yp9Var;
        this.f31144d = un1Var;
        this.f31145e = new C1807a(y15Var, nr9Var, un1Var, "CONTROLLER_LISTEN");
        this.f31146f = "";
        this.f31148h = new LinkedHashSet();
        this.f31149i = new LinkedHashSet();
        this.f31150j = AbstractC3194a.m15360M();
        this.f31151k = new LinkedHashSet();
        this.f31152l = new LinkedHashMap();
        this.f31159s = new k55(false, 0L, 0L, 15);
    }

    /* JADX INFO: renamed from: i */
    public static void m9489i(String str) {
        rm5 rm5Var = sm5.Companion;
        String strConcat = "[LessonTracking] ".concat(str);
        rm5Var.getClass();
        h0a.f41641a.mo11431b(strConcat, new Object[0]);
    }

    /* JADX INFO: renamed from: l */
    public static String m9490l(Set set) {
        return u91.m22596N0(u91.m22614f1(set, new ma3(26)), null, "[", "]", null, 57);
    }

    /* JADX INFO: renamed from: m */
    public static double m9491m(c65 c65Var) {
        int i;
        int i2 = c65Var.f9632b;
        if (i2 <= 0 || (i = c65Var.f9633c) <= 0) {
            return 0.0d;
        }
        return ((double) i2) / ((double) i);
    }

    /* JADX INFO: renamed from: q */
    public static String m9492q(k55 k55Var) {
        boolean z = k55Var.f46725a;
        long j = k55Var.f46726b;
        long j2 = k55Var.f46727c;
        m97 m97Var = k55Var.f46728d;
        return "playing=" + z + " positionMs=" + j + " durationMs=" + j2 + " interval=" + (m97Var != null ? Long.valueOf(m97Var.f50813a) : null) + ".." + (m97Var != null ? Long.valueOf(m97Var.f50814b) : null);
    }

    /* JADX INFO: renamed from: a */
    public final void m9493a(int i, double d) {
        if (d <= 1.0E-6d) {
            return;
        }
        double dM17572a = nob.m17572a(9, d);
        double d2 = this.f31155o + dM17572a;
        this.f31155o = d2;
        m9489i("awardReadCoverage coverage=" + dM17572a + " wordsRead=" + i + " totalAwardedReadCoverage=" + nob.m17572a(6, d2));
        LessonEngagedDataType lessonEngagedDataType = LessonEngagedDataType.TimesRead;
        Double dValueOf = Double.valueOf(dM17572a);
        y15 y15Var = this.f31141a;
        y15Var.mo49u1(lessonEngagedDataType, dValueOf);
        if (i > 0) {
            y15Var.mo49u1(LessonEngagedDataType.WordsRead, Integer.valueOf(i));
        }
        wfb.m23926u(this.f31144d, null, null, new LessonStudyTrackingController$awardReadCoverage$1(this, dM17572a, null), 3);
    }

    /* JADX INFO: renamed from: b */
    public final void m9494b(String str) {
        pg9 pg9Var = this.f31158r;
        if (pg9Var != null && pg9Var.mo4538b()) {
            m9489i("READ_TIMER cancelled reason=" + str + " currentUnit=" + this.f31156p);
        }
        pg9 pg9Var2 = this.f31158r;
        if (pg9Var2 != null) {
            pg9Var2.mo4537a(null);
        }
        this.f31158r = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m9495c() {
        Long l = this.f31160t;
        if (l != null || this.f31161u != null) {
            long jLongValue = l != null ? l.longValue() : 0L;
            Long l2 = this.f31161u;
            long jLongValue2 = l2 != null ? l2.longValue() : 0L;
            StringBuilder sbM22996s = ux5.m22996s(jLongValue, "clearListeningAnchor positionMs=", " realtimeMs=");
            sbM22996s.append(jLongValue2);
            m9489i(sbM22996s.toString());
        }
        this.f31160t = null;
        this.f31161u = null;
    }

    /* JADX INFO: renamed from: d */
    public final void m9496d(String str, c65 c65Var, long j, double d, String str2) {
        LinkedHashSet linkedHashSet = this.f31151k;
        if (linkedHashSet.contains(str)) {
            return;
        }
        m9494b("complete:" + str);
        linkedHashSet.add(str);
        double dM17572a = nob.m17572a(2, d);
        double dM17572a2 = nob.m17572a(6, m9491m(c65Var));
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(" completed key=");
        sb.append(str);
        sb.append(" accumulatedReadMs=");
        sb.append(j);
        hn1.m13370t(sb, " requiredReadMs=", dM17572a, " coverage=");
        sb.append(dM17572a2);
        m9489i(sb.toString());
        m9493a(c65Var.f9632b, m9491m(c65Var));
        this.f31154n = m9491m(c65Var) + this.f31154n;
    }

    /* JADX INFO: renamed from: e */
    public final void m9497e(long j) {
        c65 c65Var;
        String str = this.f31156p;
        if (str == null || (c65Var = (c65) this.f31150j.get(str)) == null) {
            return;
        }
        Long l = this.f31157q;
        long jLongValue = l != null ? j - l.longValue() : 0L;
        LinkedHashMap linkedHashMap = this.f31152l;
        if (jLongValue > 0) {
            linkedHashMap.put(str, Long.valueOf(((Number) linkedHashMap.getOrDefault(str, 0L)).longValue() + jLongValue));
        }
        this.f31157q = null;
        if (this.f31151k.contains(str)) {
            m9489i("flushCurrentReadUnit skippedAlreadyCompleted key=" + str + " nowMs=" + j);
            return;
        }
        long jLongValue2 = ((Number) linkedHashMap.getOrDefault(str, 0L)).longValue();
        int i = c65Var.f9632b;
        double d = i <= 0 ? 0.0d : (((double) i) / 350.0d) * 60000.0d;
        if (jLongValue2 + 1.0E-6d >= d) {
            m9496d(str, c65Var, jLongValue2, d, "flushCurrentReadUnit");
            return;
        }
        m9489i("flushCurrentReadUnit pending key=" + str + " elapsedMs=" + jLongValue + " accumulatedReadMs=" + jLongValue2 + " requiredReadMs=" + nob.m17572a(2, d) + " coverage=" + nob.m17572a(6, m9491m(c65Var)));
    }

    /* JADX INFO: renamed from: f */
    public final void m9498f(boolean z) {
        if (!z) {
            long j = this.f31163w;
            if (j < 5000) {
                m9489i("flushPendingListening skippedBelowThreshold force=" + z + " pendingListeningWallMs=" + j + " pendingListeningCoverage=" + nob.m17572a(6, this.f31162v));
                return;
            }
        }
        double d = this.f31162v;
        if (d <= 1.0E-6d && this.f31163w <= 0) {
            m9489i("flushPendingListening skippedEmpty force=" + z);
            return;
        }
        m9489i("flushPendingListening force=" + z + " pendingListeningWallMs=" + this.f31163w + " pendingListeningCoverage=" + nob.m17572a(6, d));
        this.f31145e.m8437c(m9500h(), this.f31162v, this.f31163w);
        this.f31162v = 0.0d;
        this.f31163w = 0L;
    }

    /* JADX INFO: renamed from: g */
    public final void m9499g(int i, String str) {
        str.getClass();
        if (!vk9.m23391n0(this.f31146f) && this.f31147g > 0) {
            this.f31145e.m8435a(m9500h());
        }
        this.f31146f = str;
        this.f31147g = i;
        this.f31148h.clear();
        this.f31149i.clear();
        this.f31150j = AbstractC3194a.m15360M();
        this.f31151k.clear();
        this.f31152l.clear();
        this.f31153m = 0.0d;
        this.f31154n = 0.0d;
        this.f31155o = 0.0d;
        this.f31156p = null;
        this.f31157q = null;
        m9494b("resetState");
        this.f31159s = new k55(false, 0L, 0L, 15);
        this.f31160t = null;
        this.f31161u = null;
        this.f31162v = 0.0d;
        this.f31163w = 0L;
        m9489i("resetState");
        m9489i("initialize language=" + str + " lessonId=" + i);
    }

    /* JADX INFO: renamed from: h */
    public final v45 m9500h() {
        return new v45("controller:" + this.f31146f + ":" + this.f31147g, this.f31147g, this.f31146f);
    }

    /* JADX INFO: renamed from: j */
    public final void m9501j() {
        m9489i("onLessonCompleted start uniqueReadCoverage=" + nob.m17572a(6, this.f31154n) + " totalConfiguredReadCoverage=" + nob.m17572a(6, this.f31153m) + " totalAwardedReadCoverage=" + nob.m17572a(6, this.f31155o));
        this.f31143c.getClass();
        m9497e(SystemClock.elapsedRealtime());
        m9498f(true);
        double d = this.f31153m;
        boolean z = d > 1.0E-6d && this.f31154n + 1.0E-6d >= d;
        if (z) {
            double d2 = this.f31155o;
            if (d2 >= 0.95d && 1.0E-6d + d2 < 1.0d) {
                m9489i("onLessonCompleted toppingUpReadCoverage amount=" + nob.m17572a(6, 1.0d - d2));
                m9493a(0, 1.0d - this.f31155o);
                return;
            }
        }
        m9489i("onLessonCompleted noTopUp hasCoveredWholeLesson=" + z + " totalAwardedReadCoverage=" + nob.m17572a(6, this.f31155o));
    }

    /* JADX INFO: renamed from: k */
    public final void m9502k(String str) {
        this.f31143c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = this.f31156p;
        m9497e(jElapsedRealtime);
        if (str == null || !this.f31150j.containsKey(str)) {
            str = null;
        }
        this.f31156p = str;
        StringBuilder sbM23000w = ux5.m23000w("onReadingUnitChanged from=", str2, " to=", str, " nowMs=");
        sbM23000w.append(jElapsedRealtime);
        m9489i(sbM23000w.toString());
        m9506r(jElapsedRealtime);
    }

    /* JADX INFO: renamed from: n */
    public final void m9503n(TrackingPauseReason trackingPauseReason, boolean z, boolean z2, boolean z3) {
        trackingPauseReason.getClass();
        this.f31143c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        LinkedHashSet linkedHashSet = this.f31148h;
        String strM9490l = m9490l(linkedHashSet);
        LinkedHashSet linkedHashSet2 = this.f31149i;
        String strM9490l2 = m9490l(linkedHashSet2);
        StringBuilder sb = new StringBuilder("setPauseReason reason=");
        sb.append(trackingPauseReason);
        sb.append(" paused=");
        sb.append(z);
        sb.append(" pauseReading=");
        wq1.m24101A(sb, z2, " pauseListening=", z3, " beforeReading=");
        AbstractC3393o1.m17725C(sb, strM9490l, " beforeListening=", strM9490l2, " nowMs=");
        sb.append(jElapsedRealtime);
        m9489i(sb.toString());
        m9497e(jElapsedRealtime);
        if (z && z2) {
            linkedHashSet.add(trackingPauseReason);
        } else {
            linkedHashSet.remove(trackingPauseReason);
        }
        if (z && z3) {
            linkedHashSet2.add(trackingPauseReason);
        } else {
            linkedHashSet2.remove(trackingPauseReason);
        }
        m9489i("setPauseReason applied reason=" + trackingPauseReason + " paused=" + z + " afterReading=" + m9490l(linkedHashSet) + " afterListening=" + m9490l(linkedHashSet2));
        m9506r(jElapsedRealtime);
    }

    /* JADX INFO: renamed from: o */
    public final void m9504o(List list) {
        list.getClass();
        List list2 = list;
        int iM15363P = AbstractC3194a.m15363P(v91.m23189q0(list2, 10));
        if (iM15363P < 16) {
            iM15363P = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM15363P);
        for (Object obj : list2) {
            linkedHashMap.put(((c65) obj).f9631a, obj);
        }
        this.f31150j = linkedHashMap;
        Iterator it = list2.iterator();
        double dM9491m = 0.0d;
        while (it.hasNext()) {
            dM9491m += m9491m((c65) it.next());
        }
        this.f31153m = dM9491m;
        String str = this.f31156p;
        if (str == null || !this.f31150j.containsKey(str)) {
            str = null;
        }
        this.f31156p = str;
        if (str == null) {
            this.f31157q = null;
        }
        m9489i("setReadingUnits count=" + list.size() + " totalConfiguredReadCoverage=" + nob.m17572a(6, this.f31153m) + " currentUnit=" + this.f31156p);
    }

    /* JADX INFO: renamed from: p */
    public final void m9505p() {
        m9489i("stop");
        this.f31143c.getClass();
        m9497e(SystemClock.elapsedRealtime());
        m9494b("stop");
        m9495c();
        m9498f(true);
        if (vk9.m23391n0(this.f31146f) || this.f31147g <= 0) {
            return;
        }
        this.f31145e.m8435a(m9500h());
    }

    /* JADX INFO: renamed from: r */
    public final void m9506r(long j) {
        LinkedHashSet linkedHashSet = this.f31148h;
        boolean zIsEmpty = linkedHashSet.isEmpty();
        k55 k55Var = this.f31159s;
        LinkedHashSet linkedHashSet2 = this.f31149i;
        boolean z = linkedHashSet2.isEmpty() && k55Var.f46725a;
        String str = this.f31156p;
        String strM9492q = m9492q(this.f31159s);
        String strM9490l = m9490l(linkedHashSet);
        String strM9490l2 = m9490l(linkedHashSet2);
        StringBuilder sb = new StringBuilder("syncTrackingState nowMs=");
        sb.append(j);
        sb.append(" readingEligible=");
        sb.append(zIsEmpty);
        sb.append(" listeningEligible=");
        sb.append(z);
        sb.append(" currentUnit=");
        sb.append(str);
        AbstractC3393o1.m17725C(sb, " playback=", strM9492q, " readingPauseReasons=", strM9490l);
        sb.append(" listeningPauseReasons=");
        sb.append(strM9490l2);
        m9489i(sb.toString());
        k55 k55Var2 = this.f31159s;
        if (linkedHashSet2.isEmpty() && k55Var2.f46725a) {
            if (this.f31160t == null) {
                long j2 = this.f31159s.f46726b;
                this.f31160t = Long.valueOf(j2);
                m9489i("ensureListeningAnchor position=" + j2);
            }
            if (this.f31161u == null) {
                this.f31161u = Long.valueOf(j);
                m9489i("ensureListeningAnchor realtimeMs=" + j);
            }
        } else {
            m9495c();
            m9498f(true);
        }
        if (!linkedHashSet.isEmpty()) {
            m9494b("readingNotEligible");
            return;
        }
        String str2 = this.f31156p;
        if (str2 == null) {
            return;
        }
        if (!linkedHashSet.isEmpty()) {
            String strM9490l3 = m9490l(linkedHashSet);
            String strM9492q2 = m9492q(this.f31159s);
            StringBuilder sbM23000w = ux5.m23000w("ensureReadTimerStarted skippedNotEligible key=", str2, " readingPauseReasons=", strM9490l3, " playback=");
            sbM23000w.append(strM9492q2);
            m9489i(sbM23000w.toString());
            return;
        }
        LinkedHashSet linkedHashSet3 = this.f31151k;
        if (linkedHashSet3.contains(str2)) {
            m9489i("ensureReadTimerStarted skippedCompleted key=".concat(str2));
            return;
        }
        if (this.f31157q == null) {
            this.f31157q = Long.valueOf(j);
            m9489i("ensureReadTimerStarted started key=" + str2 + " startedAtMs=" + j);
        }
        c65 c65Var = (c65) this.f31150j.get(str2);
        if (c65Var == null) {
            m9494b("missingUnit:".concat(str2));
            return;
        }
        if (linkedHashSet3.contains(str2)) {
            m9494b("unitCompleted:".concat(str2));
            return;
        }
        Long l = this.f31157q;
        long jLongValue = j - (l != null ? l.longValue() : j);
        if (jLongValue < 0) {
            jLongValue = 0;
        }
        long jLongValue2 = ((Number) this.f31152l.getOrDefault(str2, 0L)).longValue() + jLongValue;
        int i = c65Var.f9632b;
        double d = i <= 0 ? 0.0d : (((double) i) / 350.0d) * 60000.0d;
        double d2 = d - jLongValue2;
        double d3 = d2 >= 0.0d ? d2 : 0.0d;
        if (d3 <= 1.0E-6d) {
            m9496d(str2, c65Var, jLongValue2, d, "scheduleReadCompletionIfNeeded");
            return;
        }
        m9494b("reschedule:".concat(str2));
        long jCeil = (long) Math.ceil(d3);
        double dM17572a = nob.m17572a(2, d);
        double dM17572a2 = nob.m17572a(2, d3);
        StringBuilder sb2 = new StringBuilder("READ_TIMER scheduled key=");
        sb2.append(str2);
        sb2.append(" accumulatedReadMs=");
        sb2.append(jLongValue2);
        hn1.m13370t(sb2, " requiredReadMs=", dM17572a, " remainingReadMs=");
        sb2.append(dM17572a2);
        sb2.append(" delayMs=");
        sb2.append(jCeil);
        m9489i(sb2.toString());
        this.f31158r = wfb.m23926u(this.f31144d, null, null, new LessonStudyTrackingController$scheduleReadCompletionIfNeeded$1(this, str2, jCeil, d, c65Var, null), 3);
    }

    /* JADX INFO: renamed from: s */
    public final void m9507s(k55 k55Var) {
        long j;
        long j2;
        String str;
        long j3;
        String str2;
        long jLongValue;
        long j4;
        long jM16700d;
        k55Var.getClass();
        this.f31143c.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        k55 k55Var2 = this.f31159s;
        LinkedHashSet linkedHashSet = this.f31149i;
        boolean z = linkedHashSet.isEmpty() && k55Var2.f46725a;
        String strM9492q = m9492q(k55Var2);
        long j5 = k55Var2.f46727c;
        m97 m97Var = k55Var2.f46728d;
        long j6 = k55Var2.f46726b;
        String strM9492q2 = m9492q(k55Var);
        String strM9490l = m9490l(this.f31148h);
        String strM9490l2 = m9490l(linkedHashSet);
        StringBuilder sbM23000w = ux5.m23000w("updatePlayback prev=", strM9492q, " new=", strM9492q2, " readingPauseReasons=");
        AbstractC3393o1.m17725C(sbM23000w, strM9490l, " listeningPauseReasons=", strM9490l2, " wasListeningEligible=");
        sbM23000w.append(z);
        sbM23000w.append(" nowMs=");
        sbM23000w.append(jElapsedRealtime);
        m9489i(sbM23000w.toString());
        if (z) {
            Long l = this.f31160t;
            long jLongValue2 = l != null ? l.longValue() : j6;
            Long l2 = this.f31161u;
            long jLongValue3 = l2 != null ? l2.longValue() : jElapsedRealtime;
            j3 = 0;
            long j7 = k55Var.f46726b;
            long j8 = j7 - jLongValue2;
            long j9 = jElapsedRealtime - jLongValue3;
            j2 = j5;
            long j10 = j9 < 0 ? 0L : j9;
            StringBuilder sbM22996s = ux5.m22996s(jLongValue2, "accumulateListeningDelta anchorPositionMs=", " anchorRealtimeMs=");
            long j11 = j10;
            sbM22996s.append(jLongValue3);
            sbM22996s.append(" positionDeltaMs=");
            sbM22996s.append(j8);
            sbM22996s.append(" wallDeltaMs=");
            sbM22996s.append(j11);
            m9489i(sbM22996s.toString());
            if (j8 <= 0 || j11 <= 0) {
                j = jElapsedRealtime;
                str = " new=";
                this.f31160t = Long.valueOf(j7);
                this.f31161u = Long.valueOf(j);
                m9489i("accumulateListeningDelta skippedNonPositiveDelta new=".concat(m9492q(k55Var)));
            } else {
                double d = j11;
                long j12 = ((long) (2.5d * d)) + 1000;
                if (j8 > j12) {
                    this.f31160t = Long.valueOf(j7);
                    this.f31161u = Long.valueOf(jElapsedRealtime);
                    String strM9492q3 = m9492q(k55Var);
                    StringBuilder sbM22996s2 = ux5.m22996s(j8, "accumulateListeningDelta skippedSeekLikeDelta positionDeltaMs=", " maxExpectedDeltaMs=");
                    sbM22996s2.append(j12);
                    sbM22996s2.append(" new=");
                    sbM22996s2.append(strM9492q3);
                    m9489i(sbM22996s2.toString());
                    j = jElapsedRealtime;
                    str = " new=";
                } else {
                    m97 m97Var2 = k55Var.f46728d;
                    if (m97Var2 == null) {
                        m97Var2 = m97Var;
                    }
                    if (m97Var2 != null) {
                        str2 = " new=";
                        jLongValue = m97Var2.f50815c;
                    } else {
                        str2 = " new=";
                        long j13 = k55Var.f46727c;
                        Long lValueOf = Long.valueOf(j13);
                        if (j13 <= 0) {
                            lValueOf = null;
                        }
                        if (lValueOf != null) {
                            jLongValue = lValueOf.longValue();
                        } else {
                            Long lValueOf2 = j2 > 0 ? Long.valueOf(j2) : null;
                            jLongValue = lValueOf2 != null ? lValueOf2.longValue() : 0L;
                        }
                    }
                    if (jLongValue <= 0) {
                        this.f31160t = Long.valueOf(j7);
                        this.f31161u = Long.valueOf(jElapsedRealtime);
                        m9489i("accumulateListeningDelta skippedMissingDuration new=".concat(m9492q(k55Var)));
                    } else {
                        if (m97Var2 != null) {
                            j4 = j7;
                            jM16700d = m97Var2.m16700d(jLongValue2, j4);
                        } else {
                            j4 = j7;
                            jM16700d = j8;
                        }
                        if (jM16700d <= 0) {
                            this.f31160t = Long.valueOf(j4);
                            this.f31161u = Long.valueOf(jElapsedRealtime);
                            m9489i("accumulateListeningDelta skippedOutsideInterval new=".concat(m9492q(k55Var)));
                        } else {
                            long j14 = j4;
                            double d2 = jM16700d;
                            long j15 = (long) ((d * d2) / j8);
                            double d3 = (d2 / jLongValue) + this.f31162v;
                            this.f31162v = d3;
                            str = str2;
                            this.f31163w += j15;
                            double dM17572a = nob.m17572a(6, d3);
                            long j16 = this.f31163w;
                            j = jElapsedRealtime;
                            StringBuilder sbM22996s3 = ux5.m22996s(j8, "accumulateListeningDelta applied positionDeltaMs=", " trackedPositionDeltaMs=");
                            sbM22996s3.append(jM16700d);
                            sbM22996s3.append(" durationMs=");
                            sbM22996s3.append(jLongValue);
                            sbM22996s3.append(" pendingListeningCoverage=");
                            sbM22996s3.append(dM17572a);
                            sbM22996s3.append(" pendingListeningWallMs=");
                            sbM22996s3.append(j16);
                            m9489i(sbM22996s3.toString());
                            this.f31160t = Long.valueOf(j14);
                            this.f31161u = Long.valueOf(j);
                            m9498f(this.f31163w >= 5000);
                        }
                    }
                    j = jElapsedRealtime;
                    str = str2;
                }
            }
        } else {
            j = jElapsedRealtime;
            j2 = j5;
            str = " new=";
            j3 = 0;
        }
        if (!linkedHashSet.isEmpty() || !k55Var2.f46725a) {
            m9489i("maybeTrackPlaybackCompletion skippedPreviousNotEligible prev=".concat(m9492q(k55Var2)));
        } else if (k55Var.f46725a) {
            m9489i("maybeTrackPlaybackCompletion skippedStillPlaying new=".concat(m9492q(k55Var)));
        } else if (m97Var != null) {
            m9489i("maybeTrackPlaybackCompletion skippedBoundedPlayback prev=".concat(m9492q(k55Var2)));
        } else if (j2 <= j3) {
            m9489i("maybeTrackPlaybackCompletion skippedMissingDuration prev=".concat(m9492q(k55Var2)));
        } else {
            long j17 = j2 - j6;
            if (j17 <= j3 || j17 > 1500) {
                m9489i("maybeTrackPlaybackCompletion skippedOutsideTolerance remainingMs=" + j17 + " prev=" + m9492q(k55Var2) + str + m9492q(k55Var));
            } else {
                double d4 = (j17 / j2) + this.f31162v;
                this.f31162v = d4;
                double dM17572a2 = nob.m17572a(6, d4);
                StringBuilder sbM22996s4 = ux5.m22996s(j17, "maybeTrackPlaybackCompletion toppedUp remainingMs=", " pendingListeningCoverage=");
                sbM22996s4.append(dM17572a2);
                m9489i(sbM22996s4.toString());
                m9498f(true);
            }
        }
        this.f31159s = k55Var;
        m9506r(j);
    }
}
