package com.lingq.core.player;

import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import java.util.LinkedHashMap;
import kotlin.collections.AbstractC3194a;
import p000.h0a;
import p000.hn1;
import p000.nob;
import p000.nr9;
import p000.rm5;
import p000.sm5;
import p000.un1;
import p000.v45;
import p000.w45;
import p000.wfb;
import p000.y15;

/* JADX INFO: renamed from: com.lingq.core.player.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1807a {
    private static final w45 Companion = new w45();

    /* JADX INFO: renamed from: a */
    public final y15 f21937a;

    /* JADX INFO: renamed from: b */
    public final nr9 f21938b;

    /* JADX INFO: renamed from: c */
    public final un1 f21939c;

    /* JADX INFO: renamed from: d */
    public final String f21940d;

    /* JADX INFO: renamed from: e */
    public final LinkedHashMap f21941e;

    /* JADX INFO: renamed from: f */
    public final LinkedHashMap f21942f;

    public C1807a(y15 y15Var, nr9 nr9Var, un1 un1Var, String str) {
        y15Var.getClass();
        un1Var.getClass();
        this.f21937a = y15Var;
        this.f21938b = nr9Var;
        this.f21939c = un1Var;
        this.f21940d = str;
        this.f21941e = new LinkedHashMap();
        this.f21942f = new LinkedHashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m8435a(v45 v45Var) {
        Double d = (Double) this.f21941e.remove(v45Var.m23096a());
        Long l = (Long) this.f21942f.remove(v45Var.m23096a());
        m8436b("clear sessionKey=" + v45Var.m23096a() + " coverage=" + (d != null ? nob.m17572a(6, d.doubleValue()) : 0.0d) + " remainderMs=" + (l != null ? l.longValue() : 0L));
    }

    /* JADX INFO: renamed from: b */
    public final void m8436b(String str) {
        rm5 rm5Var = sm5.Companion;
        String str2 = "[LessonTracking] " + this.f21940d + " " + str;
        rm5Var.getClass();
        h0a.f41641a.mo11431b(str2, new Object[0]);
    }

    /* JADX INFO: renamed from: c */
    public final void m8437c(v45 v45Var, double d, long j) {
        y15 y15Var = this.f21937a;
        if (j > 0) {
            String strM23096a = v45Var.m23096a();
            LinkedHashMap linkedHashMap = this.f21942f;
            long jLongValue = ((Number) linkedHashMap.getOrDefault(strM23096a, 0L)).longValue() + j;
            int i = (int) (jLongValue / 1000);
            long j2 = jLongValue % 1000;
            linkedHashMap.put(v45Var.m23096a(), Long.valueOf(j2));
            m8436b("recordListeningTime sessionKey=" + v45Var.m23096a() + " wallMs=" + j + " listeningSeconds=" + i + " remainderMs=" + j2);
            if (i > 0) {
                y15Var.mo49u1(LessonEngagedDataType.TimeSpentListening, Integer.valueOf(i));
            }
        }
        if (Double.isNaN(d) || Double.isInfinite(d) || d <= 1.0E-6d) {
            m8436b("recordProgress skippedInvalidCoverage sessionKey=" + v45Var.m23096a() + " coverageDelta=" + nob.m17572a(6, d) + " wallMs=" + j);
            return;
        }
        String strM23096a2 = v45Var.m23096a();
        Double dValueOf = Double.valueOf(0.0d);
        LinkedHashMap linkedHashMap2 = this.f21941e;
        double dDoubleValue = ((Number) linkedHashMap2.getOrDefault(strM23096a2, dValueOf)).doubleValue();
        double d2 = 1.0d - dDoubleValue;
        double d3 = d2 >= 0.0d ? d2 : 0.0d;
        if (d <= d3) {
            d3 = d;
        }
        if (d3 <= 1.0E-6d) {
            m8436b("recordProgress skippedNoRemainingCoverage sessionKey=" + v45Var.m23096a() + " accumulatedCoverage=" + nob.m17572a(6, dDoubleValue));
            return;
        }
        double dM17572a = nob.m17572a(9, d3);
        double d4 = dDoubleValue + dM17572a;
        linkedHashMap2.put(v45Var.m23096a(), Double.valueOf(d4 <= 1.0d ? d4 : 1.0d));
        String strM23096a3 = v45Var.m23096a();
        double dM17572a2 = nob.m17572a(6, d);
        double dM17572a3 = nob.m17572a(6, ((Number) AbstractC3194a.m15361N(v45Var.m23096a(), linkedHashMap2)).doubleValue());
        StringBuilder sb = new StringBuilder("recordProgress sessionKey=");
        sb.append(strM23096a3);
        sb.append(" wallMs=");
        sb.append(j);
        hn1.m13370t(sb, " coverageDelta=", dM17572a2, " recordedCoverage=");
        sb.append(dM17572a);
        sb.append(" accumulatedCoverage=");
        sb.append(dM17572a3);
        m8436b(sb.toString());
        y15Var.mo49u1(LessonEngagedDataType.TimesListened, Double.valueOf(dM17572a));
        wfb.m23926u(this.f21939c, null, null, new LessonListeningStatsRecorder$recordProgress$1(this, v45Var, dM17572a, null), 3);
    }
}
