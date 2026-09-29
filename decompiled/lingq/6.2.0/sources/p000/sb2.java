package p000;

import android.content.Context;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.core.widgets.analyzer.AbstractC0473h;
import androidx.constraintlayout.core.widgets.analyzer.C0466a;
import androidx.constraintlayout.core.widgets.analyzer.C0467b;
import androidx.constraintlayout.core.widgets.analyzer.C0468c;
import androidx.constraintlayout.core.widgets.analyzer.C0470e;
import androidx.constraintlayout.core.widgets.analyzer.C0472g;
import androidx.room.RoomDatabase$JournalMode;
import androidx.room.coroutines.C0742c;
import androidx.sqlite.driver.C0763a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;

/* JADX INFO: loaded from: classes.dex */
public final class sb2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60611a;

    /* JADX INFO: renamed from: b */
    public boolean f60612b;

    /* JADX INFO: renamed from: c */
    public boolean f60613c;

    /* JADX INFO: renamed from: d */
    public Object f60614d;

    /* JADX INFO: renamed from: e */
    public Object f60615e;

    /* JADX INFO: renamed from: f */
    public Object f60616f;

    /* JADX INFO: renamed from: g */
    public Object f60617g;

    /* JADX INFO: renamed from: h */
    public Object f60618h;

    /* JADX INFO: renamed from: i */
    public Object f60619i;

    public sb2(s02 s02Var, lq2 lq2Var, zi3 zi3Var) {
        int i;
        Object objM18989a;
        this.f60611a = 2;
        RoomDatabase$JournalMode roomDatabase$JournalMode = s02Var.f60118g;
        xn9 xn9Var = s02Var.f60114c;
        ck8 ck8Var = s02Var.f60127p;
        String str = s02Var.f60113b;
        this.f60614d = s02Var;
        this.f60615e = lq2Var;
        Object obj = s02Var.f60116e;
        this.f60616f = obj == null ? EmptyList.f47638a : obj;
        if (ck8Var != null) {
            this.f60618h = null;
            if (ck8Var.mo4516r()) {
                objM18989a = new C0742c(new C3156jq(this, ck8Var), str == null ? ":memory:" : str, zi3Var);
            } else if (str == null) {
                objM18989a = p8d.m18990b(new C3156jq(this, ck8Var));
            } else {
                C3156jq c3156jq = new C3156jq(this, ck8Var);
                roomDatabase$JournalMode.getClass();
                int[] iArr = aa0.f402a;
                int i2 = iArr[roomDatabase$JournalMode.ordinal()];
                if (i2 == 1) {
                    i = 1;
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + roomDatabase$JournalMode + '\'').toString());
                    }
                    i = 4;
                }
                int i3 = iArr[roomDatabase$JournalMode.ordinal()];
                if (i3 != 1 && i3 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + roomDatabase$JournalMode + '\'').toString());
                }
                objM18989a = p8d.m18989a(c3156jq, str, i);
            }
            this.f60617g = objM18989a;
        } else {
            if (xn9Var == null) {
                C3386nv.m17626m("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            Context context = s02Var.f60112a;
            context.getClass();
            yn9 yn9VarMo14502f = xn9Var.mo14502f(new wn9(context, str, new C3126ix(this, lq2Var.f49997a), false, false));
            this.f60618h = yn9VarMo14502f;
            yn9VarMo14502f.getClass();
            cc4 cc4Var = new cc4();
            cc4Var.f9881a = yn9VarMo14502f;
            this.f60617g = new C0742c(cc4Var, str == null ? ":memory:" : str, zi3Var);
        }
        boolean z = roomDatabase$JournalMode == RoomDatabase$JournalMode.WRITE_AHEAD_LOGGING;
        yn9 yn9Var = (yn9) this.f60618h;
        if (yn9Var != null) {
            yn9Var.setWriteAheadLoggingEnabled(z);
        }
    }

    /* JADX INFO: renamed from: a */
    public static final void m21192a(sb2 sb2Var, bk8 bk8Var) throws Exception {
        Object failure;
        lq2 lq2Var = (lq2) sb2Var.f60615e;
        m21193f(bk8Var);
        s02 s02Var = (s02) sb2Var.f60614d;
        RoomDatabase$JournalMode roomDatabase$JournalMode = s02Var.f60118g;
        RoomDatabase$JournalMode roomDatabase$JournalMode2 = RoomDatabase$JournalMode.WRITE_AHEAD_LOGGING;
        if (roomDatabase$JournalMode == roomDatabase$JournalMode2) {
            AbstractC3695vr.m23496g(bk8Var, "PRAGMA journal_mode = WAL");
        } else {
            AbstractC3695vr.m23496g(bk8Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (s02Var.f60118g == roomDatabase$JournalMode2) {
            AbstractC3695vr.m23496g(bk8Var, "PRAGMA synchronous = NORMAL");
        } else {
            AbstractC3695vr.m23496g(bk8Var, "PRAGMA synchronous = FULL");
        }
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("PRAGMA user_version");
        try {
            ik8VarMo2873e0.mo2876a0();
            int i = (int) ik8VarMo2873e0.getLong(0);
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            int i2 = lq2Var.f49997a;
            if (i != i2) {
                AbstractC3695vr.m23496g(bk8Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        sb2Var.m21201j(bk8Var);
                    } else {
                        sb2Var.m21202k(bk8Var, i, i2);
                    }
                    AbstractC3695vr.m23496g(bk8Var, "PRAGMA user_version = " + i2);
                    failure = xfa.f68157a;
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                if (!(failure instanceof Result.Failure)) {
                    AbstractC3695vr.m23496g(bk8Var, "END TRANSACTION");
                }
                Throwable thM15355a = Result.m15355a(failure);
                if (thM15355a != null) {
                    AbstractC3695vr.m23496g(bk8Var, "ROLLBACK TRANSACTION");
                    throw thM15355a;
                }
            }
            sb2Var.m21203l(bk8Var);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th2);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m21193f(bk8 bk8Var) throws Exception {
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("PRAGMA busy_timeout");
        try {
            ik8VarMo2873e0.mo2876a0();
            long j = ik8VarMo2873e0.getLong(0);
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            if (j < 3000) {
                AbstractC3695vr.m23496g(bk8Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m21194b(C0466a c0466a, int i, ArrayList arrayList, ak8 ak8Var) {
        AbstractC0473h abstractC0473h = c0466a.f5335d;
        ak8 ak8Var2 = abstractC0473h.f5352c;
        C0466a c0466a2 = abstractC0473h.f5358i;
        C0466a c0466a3 = abstractC0473h.f5357h;
        if (ak8Var2 == null) {
            wj1 wj1Var = (wj1) this.f60614d;
            if (abstractC0473h == wj1Var.f65464d || abstractC0473h == wj1Var.f65466e) {
                return;
            }
            if (ak8Var == null) {
                ak8Var = new ak8(abstractC0473h);
                arrayList.add(ak8Var);
            }
            abstractC0473h.f5352c = ak8Var;
            ak8Var.m531a(abstractC0473h);
            for (nb2 nb2Var : c0466a3.f5342k) {
                if (nb2Var instanceof C0466a) {
                    m21194b((C0466a) nb2Var, i, arrayList, ak8Var);
                }
            }
            for (nb2 nb2Var2 : c0466a2.f5342k) {
                if (nb2Var2 instanceof C0466a) {
                    m21194b((C0466a) nb2Var2, i, arrayList, ak8Var);
                }
            }
            if (i == 1 && (abstractC0473h instanceof C0472g)) {
                for (nb2 nb2Var3 : ((C0472g) abstractC0473h).f5348k.f5342k) {
                    if (nb2Var3 instanceof C0466a) {
                        m21194b((C0466a) nb2Var3, i, arrayList, ak8Var);
                    }
                }
            }
            Iterator it = c0466a3.f5343l.iterator();
            while (it.hasNext()) {
                m21194b((C0466a) it.next(), i, arrayList, ak8Var);
            }
            Iterator it2 = c0466a2.f5343l.iterator();
            while (it2.hasNext()) {
                m21194b((C0466a) it2.next(), i, arrayList, ak8Var);
            }
            if (i == 1 && (abstractC0473h instanceof C0472g)) {
                Iterator it3 = ((C0472g) abstractC0473h).f5348k.f5343l.iterator();
                while (it3.hasNext()) {
                    m21194b((C0466a) it3.next(), i, arrayList, ak8Var);
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m21195c(wj1 wj1Var) {
        char c;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4;
        Iterator it = wj1Var.f66917t0.iterator();
        while (it.hasNext()) {
            vj1 vj1Var = (vj1) it.next();
            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = vj1Var.f65451T;
            bj1[] bj1VarArr = vj1Var.f65448Q;
            bj1 bj1Var = vj1Var.f65443L;
            bj1 bj1Var2 = vj1Var.f65441J;
            bj1 bj1Var3 = vj1Var.f65442K;
            bj1 bj1Var4 = vj1Var.f65440I;
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = constraintWidget$DimensionBehaviourArr[0];
            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = constraintWidget$DimensionBehaviourArr[1];
            if (vj1Var.f65473h0 == 8) {
                vj1Var.f65458a = true;
            } else {
                float f = vj1Var.f65499w;
                if (f < 1.0f && constraintWidget$DimensionBehaviour5 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                    vj1Var.f65492r = 2;
                }
                float f2 = vj1Var.f65502z;
                if (f2 < 1.0f) {
                    c = 0;
                    if (constraintWidget$DimensionBehaviour6 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT) {
                        vj1Var.f65494s = 2;
                    }
                } else {
                    c = 0;
                }
                if (vj1Var.f65455X > 0.0f) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour7 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour7 && (constraintWidget$DimensionBehaviour6 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour6 == ConstraintWidget$DimensionBehaviour.FIXED)) {
                        vj1Var.f65492r = 3;
                    } else if (constraintWidget$DimensionBehaviour6 == constraintWidget$DimensionBehaviour7 && (constraintWidget$DimensionBehaviour5 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT || constraintWidget$DimensionBehaviour5 == ConstraintWidget$DimensionBehaviour.FIXED)) {
                        vj1Var.f65494s = 3;
                    } else if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour7 && constraintWidget$DimensionBehaviour6 == constraintWidget$DimensionBehaviour7) {
                        if (vj1Var.f65492r == 0) {
                            vj1Var.f65492r = 3;
                        }
                        if (vj1Var.f65494s == 0) {
                            vj1Var.f65494s = 3;
                        }
                    }
                }
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour8 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour8 && vj1Var.f65492r == 1 && (bj1Var4.f8582f == null || bj1Var3.f8582f == null)) {
                    constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                }
                if (constraintWidget$DimensionBehaviour6 == constraintWidget$DimensionBehaviour8 && vj1Var.f65494s == 1 && (bj1Var2.f8582f == null || bj1Var.f8582f == null)) {
                    constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                }
                C0470e c0470e = vj1Var.f65464d;
                c0470e.f5353d = constraintWidget$DimensionBehaviour5;
                int i = vj1Var.f65492r;
                c0470e.f5350a = i;
                C0472g c0472g = vj1Var.f65466e;
                c0472g.f5353d = constraintWidget$DimensionBehaviour6;
                int i2 = vj1Var.f65494s;
                c0472g.f5350a = i2;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour9 = ConstraintWidget$DimensionBehaviour.MATCH_PARENT;
                Iterator it2 = it;
                if ((constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour9 || constraintWidget$DimensionBehaviour5 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour5 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) && (constraintWidget$DimensionBehaviour6 == constraintWidget$DimensionBehaviour9 || constraintWidget$DimensionBehaviour6 == ConstraintWidget$DimensionBehaviour.FIXED || constraintWidget$DimensionBehaviour6 == ConstraintWidget$DimensionBehaviour.WRAP_CONTENT)) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour10 = constraintWidget$DimensionBehaviour6;
                    int iM23326r = vj1Var.m23326r();
                    if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour9) {
                        iM23326r = (wj1Var.m23326r() - bj1Var4.f8583g) - bj1Var3.f8583g;
                        constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.FIXED;
                    }
                    int iM23322l = vj1Var.m23322l();
                    if (constraintWidget$DimensionBehaviour10 == constraintWidget$DimensionBehaviour9) {
                        iM23322l = (wj1Var.m23322l() - bj1Var2.f8583g) - bj1Var.f8583g;
                        constraintWidget$DimensionBehaviour10 = ConstraintWidget$DimensionBehaviour.FIXED;
                    }
                    m21199h(vj1Var, constraintWidget$DimensionBehaviour5, iM23326r, constraintWidget$DimensionBehaviour10, iM23322l);
                    vj1Var.f65464d.f5354e.mo1914d(vj1Var.m23326r());
                    vj1Var.f65466e.f5354e.mo1914d(vj1Var.m23322l());
                    vj1Var.f65458a = true;
                } else {
                    if (constraintWidget$DimensionBehaviour5 != constraintWidget$DimensionBehaviour8 || (constraintWidget$DimensionBehaviour6 != (constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) && constraintWidget$DimensionBehaviour6 != ConstraintWidget$DimensionBehaviour.FIXED)) {
                        constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviour6;
                    } else if (i == 3) {
                        if (constraintWidget$DimensionBehaviour6 == constraintWidget$DimensionBehaviour4) {
                            m21199h(vj1Var, constraintWidget$DimensionBehaviour4, 0, constraintWidget$DimensionBehaviour4, 0);
                        }
                        int iM23322l2 = vj1Var.m23322l();
                        int i3 = (int) ((iM23322l2 * vj1Var.f65455X) + 0.5f);
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour11 = ConstraintWidget$DimensionBehaviour.FIXED;
                        m21199h(vj1Var, constraintWidget$DimensionBehaviour11, i3, constraintWidget$DimensionBehaviour11, iM23322l2);
                        vj1Var.f65464d.f5354e.mo1914d(vj1Var.m23326r());
                        vj1Var.f65466e.f5354e.mo1914d(vj1Var.m23322l());
                        vj1Var.f65458a = true;
                    } else if (i == 1) {
                        m21199h(vj1Var, constraintWidget$DimensionBehaviour4, 0, constraintWidget$DimensionBehaviour6, 0);
                        vj1Var.f65464d.f5354e.f5344m = vj1Var.m23326r();
                    } else {
                        constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviour6;
                        if (i == 2) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour12 = wj1Var.f65451T[c];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour13 = ConstraintWidget$DimensionBehaviour.FIXED;
                            if (constraintWidget$DimensionBehaviour12 == constraintWidget$DimensionBehaviour13 || constraintWidget$DimensionBehaviour12 == constraintWidget$DimensionBehaviour9) {
                                m21199h(vj1Var, constraintWidget$DimensionBehaviour13, (int) ((f * wj1Var.m23326r()) + 0.5f), constraintWidget$DimensionBehaviour, vj1Var.m23322l());
                                vj1Var.f65464d.f5354e.mo1914d(vj1Var.m23326r());
                                vj1Var.f65466e.f5354e.mo1914d(vj1Var.m23322l());
                                vj1Var.f65458a = true;
                            }
                        } else if (bj1VarArr[c].f8582f == null || bj1VarArr[1].f8582f == null) {
                            m21199h(vj1Var, constraintWidget$DimensionBehaviour4, 0, constraintWidget$DimensionBehaviour, 0);
                            vj1Var.f65464d.f5354e.mo1914d(vj1Var.m23326r());
                            vj1Var.f65466e.f5354e.mo1914d(vj1Var.m23322l());
                            vj1Var.f65458a = true;
                        }
                    }
                    if (constraintWidget$DimensionBehaviour != constraintWidget$DimensionBehaviour8 || (constraintWidget$DimensionBehaviour5 != (constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT) && constraintWidget$DimensionBehaviour5 != ConstraintWidget$DimensionBehaviour.FIXED)) {
                        constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour;
                    } else if (i2 == 3) {
                        if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour3) {
                            m21199h(vj1Var, constraintWidget$DimensionBehaviour3, 0, constraintWidget$DimensionBehaviour3, 0);
                        }
                        int iM23326r2 = vj1Var.m23326r();
                        float f3 = vj1Var.f65455X;
                        if (vj1Var.f65456Y == -1) {
                            f3 = 1.0f / f3;
                        }
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour14 = ConstraintWidget$DimensionBehaviour.FIXED;
                        m21199h(vj1Var, constraintWidget$DimensionBehaviour14, iM23326r2, constraintWidget$DimensionBehaviour14, (int) ((iM23326r2 * f3) + 0.5f));
                        vj1Var.f65464d.f5354e.mo1914d(vj1Var.m23326r());
                        vj1Var.f65466e.f5354e.mo1914d(vj1Var.m23322l());
                        vj1Var.f65458a = true;
                    } else if (i2 == 1) {
                        m21199h(vj1Var, constraintWidget$DimensionBehaviour5, 0, constraintWidget$DimensionBehaviour3, 0);
                        vj1Var.f65466e.f5354e.f5344m = vj1Var.m23322l();
                    } else {
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour15 = constraintWidget$DimensionBehaviour5;
                        if (i2 == 2) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour16 = wj1Var.f65451T[1];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour17 = constraintWidget$DimensionBehaviour;
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour18 = ConstraintWidget$DimensionBehaviour.FIXED;
                            if (constraintWidget$DimensionBehaviour16 == constraintWidget$DimensionBehaviour18 || constraintWidget$DimensionBehaviour16 == constraintWidget$DimensionBehaviour9) {
                                m21199h(vj1Var, constraintWidget$DimensionBehaviour15, vj1Var.m23326r(), constraintWidget$DimensionBehaviour18, (int) ((f2 * wj1Var.m23322l()) + 0.5f));
                                vj1Var.f65464d.f5354e.mo1914d(vj1Var.m23326r());
                                vj1Var.f65466e.f5354e.mo1914d(vj1Var.m23322l());
                                vj1Var.f65458a = true;
                            } else {
                                constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour17;
                                constraintWidget$DimensionBehaviour5 = constraintWidget$DimensionBehaviour15;
                            }
                        } else {
                            constraintWidget$DimensionBehaviour5 = constraintWidget$DimensionBehaviour15;
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour19 = constraintWidget$DimensionBehaviour;
                            if (bj1VarArr[2].f8582f == null || bj1VarArr[3].f8582f == null) {
                                m21199h(vj1Var, constraintWidget$DimensionBehaviour3, 0, constraintWidget$DimensionBehaviour19, 0);
                                vj1Var.f65464d.f5354e.mo1914d(vj1Var.m23326r());
                                vj1Var.f65466e.f5354e.mo1914d(vj1Var.m23322l());
                                vj1Var.f65458a = true;
                            } else {
                                constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviour19;
                            }
                        }
                    }
                    if (constraintWidget$DimensionBehaviour5 == constraintWidget$DimensionBehaviour8 && constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour8) {
                        if (i == 1 || i2 == 1) {
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour20 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                            m21199h(vj1Var, constraintWidget$DimensionBehaviour20, 0, constraintWidget$DimensionBehaviour20, 0);
                            vj1Var.f65464d.f5354e.f5344m = vj1Var.m23326r();
                            vj1Var.f65466e.f5354e.f5344m = vj1Var.m23322l();
                        } else if (i2 == 2 && i == 2) {
                            ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr2 = wj1Var.f65451T;
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour21 = constraintWidget$DimensionBehaviourArr2[c];
                            ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour22 = ConstraintWidget$DimensionBehaviour.FIXED;
                            if (constraintWidget$DimensionBehaviour21 == constraintWidget$DimensionBehaviour22 && constraintWidget$DimensionBehaviourArr2[1] == constraintWidget$DimensionBehaviour22) {
                                m21199h(vj1Var, constraintWidget$DimensionBehaviour22, (int) ((f * wj1Var.m23326r()) + 0.5f), constraintWidget$DimensionBehaviour22, (int) ((f2 * wj1Var.m23322l()) + 0.5f));
                                vj1Var.f65464d.f5354e.mo1914d(vj1Var.m23326r());
                                vj1Var.f65466e.f5354e.mo1914d(vj1Var.m23322l());
                                vj1Var.f65458a = true;
                            }
                        }
                    }
                }
                it = it2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public void m21196d() {
        wj1 wj1Var = (wj1) this.f60614d;
        ArrayList arrayList = (ArrayList) this.f60617g;
        ArrayList<AbstractC0473h> arrayList2 = (ArrayList) this.f60616f;
        arrayList2.clear();
        wj1 wj1Var2 = (wj1) this.f60615e;
        wj1Var2.f65464d.mo1917f();
        wj1Var2.f65466e.mo1917f();
        arrayList2.add(wj1Var2.f65464d);
        arrayList2.add(wj1Var2.f65466e);
        HashSet hashSet = null;
        for (vj1 vj1Var : wj1Var2.f66917t0) {
            if (vj1Var instanceof gq3) {
                arrayList2.add(new hq3((gq3) vj1Var));
            } else {
                if (vj1Var.m23333y()) {
                    if (vj1Var.f65460b == null) {
                        vj1Var.f65460b = new mp0(vj1Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(vj1Var.f65460b);
                } else {
                    arrayList2.add(vj1Var.f65464d);
                }
                if (vj1Var.m23334z()) {
                    if (vj1Var.f65462c == null) {
                        vj1Var.f65462c = new mp0(vj1Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(vj1Var.f65462c);
                } else {
                    arrayList2.add(vj1Var.f65466e);
                }
                if (vj1Var instanceof os3) {
                    arrayList2.add(new C0468c(vj1Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            ((AbstractC0473h) it.next()).mo1917f();
        }
        for (AbstractC0473h abstractC0473h : arrayList2) {
            if (abstractC0473h.f5351b != wj1Var2) {
                abstractC0473h.mo1915d();
            }
        }
        arrayList.clear();
        m21198g(wj1Var.f65464d, 0, arrayList);
        m21198g(wj1Var.f65466e, 1, arrayList);
        this.f60612b = false;
    }

    /* JADX INFO: renamed from: e */
    public int m21197e(wj1 wj1Var, int i) {
        ArrayList arrayList = (ArrayList) this.f60617g;
        int size = arrayList.size();
        long jMax = 0;
        for (int i2 = 0; i2 < size; i2++) {
            jMax = Math.max(jMax, ((ak8) arrayList.get(i2)).m532b(wj1Var, i));
        }
        return (int) jMax;
    }

    /* JADX INFO: renamed from: g */
    public void m21198g(AbstractC0473h abstractC0473h, int i, ArrayList arrayList) {
        C0466a c0466a = abstractC0473h.f5357h;
        C0466a c0466a2 = abstractC0473h.f5358i;
        for (nb2 nb2Var : c0466a.f5342k) {
            if (nb2Var instanceof C0466a) {
                m21194b((C0466a) nb2Var, i, arrayList, null);
            } else if (nb2Var instanceof AbstractC0473h) {
                m21194b(((AbstractC0473h) nb2Var).f5357h, i, arrayList, null);
            }
        }
        for (nb2 nb2Var2 : c0466a2.f5342k) {
            if (nb2Var2 instanceof C0466a) {
                m21194b((C0466a) nb2Var2, i, arrayList, null);
            } else if (nb2Var2 instanceof AbstractC0473h) {
                m21194b(((AbstractC0473h) nb2Var2).f5358i, i, arrayList, null);
            }
        }
        if (i == 1) {
            for (nb2 nb2Var3 : ((C0472g) abstractC0473h).f5348k.f5342k) {
                if (nb2Var3 instanceof C0466a) {
                    m21194b((C0466a) nb2Var3, i, arrayList, null);
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m21199h(vj1 vj1Var, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour, int i, ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2, int i2) {
        ua0 ua0Var = (ua0) this.f60619i;
        ua0Var.f63626a = constraintWidget$DimensionBehaviour;
        ua0Var.f63627b = constraintWidget$DimensionBehaviour2;
        ua0Var.f63628c = i;
        ua0Var.f63629d = i2;
        ((ij1) this.f60618h).m13942b(vj1Var, ua0Var);
        vj1Var.m23313P(ua0Var.f63630e);
        vj1Var.m23310M(ua0Var.f63631f);
        vj1Var.f65436E = ua0Var.f63633h;
        vj1Var.m23307J(ua0Var.f63632g);
    }

    /* JADX INFO: renamed from: i */
    public void m21200i() {
        sb2 sb2Var;
        na0 na0Var;
        for (vj1 vj1Var : ((wj1) this.f60614d).f66917t0) {
            if (!vj1Var.f65458a) {
                ConstraintWidget$DimensionBehaviour[] constraintWidget$DimensionBehaviourArr = vj1Var.f65451T;
                boolean z = false;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = constraintWidget$DimensionBehaviourArr[0];
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = constraintWidget$DimensionBehaviourArr[1];
                int i = vj1Var.f65492r;
                int i2 = vj1Var.f65494s;
                ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.WRAP_CONTENT;
                boolean z2 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3 || (constraintWidget$DimensionBehaviour == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && i == 1);
                if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3 || (constraintWidget$DimensionBehaviour2 == ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT && i2 == 1)) {
                    z = true;
                }
                C0467b c0467b = vj1Var.f65464d.f5354e;
                boolean z3 = c0467b.f5341j;
                C0467b c0467b2 = vj1Var.f65466e.f5354e;
                boolean z4 = c0467b2.f5341j;
                if (z3 && z4) {
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.FIXED;
                    sb2Var = this;
                    sb2Var.m21199h(vj1Var, constraintWidget$DimensionBehaviour4, c0467b.f5338g, constraintWidget$DimensionBehaviour4, c0467b2.f5338g);
                    vj1Var.f65458a = true;
                } else if (z3 && z) {
                    sb2Var = this;
                    sb2Var.m21199h(vj1Var, ConstraintWidget$DimensionBehaviour.FIXED, c0467b.f5338g, constraintWidget$DimensionBehaviour3, c0467b2.f5338g);
                    ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                    C0472g c0472g = vj1Var.f65466e;
                    if (constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour5) {
                        c0472g.f5354e.f5344m = vj1Var.m23322l();
                    } else {
                        c0472g.f5354e.mo1914d(vj1Var.m23322l());
                        vj1Var.f65458a = true;
                    }
                } else {
                    sb2Var = this;
                    if (z4 && z2) {
                        sb2Var.m21199h(vj1Var, constraintWidget$DimensionBehaviour3, c0467b.f5338g, ConstraintWidget$DimensionBehaviour.FIXED, c0467b2.f5338g);
                        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour6 = ConstraintWidget$DimensionBehaviour.MATCH_CONSTRAINT;
                        C0470e c0470e = vj1Var.f65464d;
                        if (constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour6) {
                            c0470e.f5354e.f5344m = vj1Var.m23326r();
                        } else {
                            c0470e.f5354e.mo1914d(vj1Var.m23326r());
                            vj1Var.f65458a = true;
                        }
                    }
                }
                if (vj1Var.f65458a && (na0Var = vj1Var.f65466e.f5349l) != null) {
                    na0Var.mo1914d(vj1Var.f65461b0);
                }
                this = sb2Var;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m21201j(bk8 bk8Var) throws Exception {
        lq2 lq2Var = (lq2) this.f60615e;
        bk8Var.getClass();
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (ik8VarMo2873e0.mo2876a0() && ik8VarMo2873e0.getLong(0) == 0) {
                z = true;
            }
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            lq2Var.mo16444a(bk8Var);
            if (!z) {
                mc0 mc0VarMo16464v = lq2Var.mo16464v(bk8Var);
                if (!mc0VarMo16464v.f51053b) {
                    ij6.m13967y(mc0VarMo16464v.f51054c, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            m21204m(bk8Var);
            lq2Var.mo16460r(bk8Var);
            Iterator it = ((List) this.f60616f).iterator();
            while (it.hasNext()) {
                ((ai8) it.next()).getClass();
                if (bk8Var instanceof C0763a) {
                    ((C0763a) bk8Var).f7069a.getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX INFO: renamed from: k */
    public void m21202k(bk8 bk8Var, int i, int i2) {
        boolean z;
        lq2 lq2Var = (lq2) this.f60615e;
        bk8Var.getClass();
        s02 s02Var = (s02) this.f60614d;
        List listM11138s = eh0.m11138s(s02Var.f60115d, i, i2);
        if (listM11138s != null) {
            lq2Var.mo16463u(bk8Var);
            Iterator it = listM11138s.iterator();
            while (it.hasNext()) {
                ((ry5) it.next()).mo16783b(bk8Var);
            }
            mc0 mc0VarMo16464v = lq2Var.mo16464v(bk8Var);
            if (!mc0VarMo16464v.f51053b) {
                ij6.m13967y(mc0VarMo16464v.f51054c, "Migration didn't properly handle: ");
                return;
            } else {
                lq2Var.mo16462t(bk8Var);
                m21204m(bk8Var);
                return;
            }
        }
        s02Var.getClass();
        if (i <= i2 || !s02Var.f60122k) {
            Set set = s02Var.f60123l;
            if (!s02Var.f60121j || (set != null && set.contains(Integer.valueOf(i)))) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        if (z) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (s02Var.f60126o) {
            ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                ListBuilder listBuilderM23650t = vz1.m23650t();
                while (ik8VarMo2873e0.mo2876a0()) {
                    String strMo2875L = ik8VarMo2873e0.mo2875L(0);
                    if (!cl9.m4842Y(strMo2875L, "sqlite_", false) && !strMo2875L.equals("android_metadata")) {
                        listBuilderM23650t.add(new Pair(strMo2875L, Boolean.valueOf(fa4.m11650l(ik8VarMo2873e0.mo2875L(1), "view"))));
                    }
                }
                ListBuilder listBuilderM23635i = vz1.m23635i(listBuilderM23650t);
                AbstractC3352my.m17126j(ik8VarMo2873e0, null);
                ListIterator listIterator = listBuilderM23635i.listIterator(0);
                while (true) {
                    au3 au3Var = (au3) listIterator;
                    if (!au3Var.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) au3Var.next();
                    String str = (String) pair.f47623a;
                    if (((Boolean) pair.f47624b).booleanValue()) {
                        AbstractC3695vr.m23496g(bk8Var, "DROP VIEW IF EXISTS `" + str + '`');
                    } else {
                        AbstractC3695vr.m23496g(bk8Var, "DROP TABLE IF EXISTS `" + str + '`');
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                    throw th2;
                }
            }
        } else {
            lq2Var.mo16445c(bk8Var);
        }
        Iterator it2 = ((List) this.f60616f).iterator();
        while (it2.hasNext()) {
            ((ai8) it2.next()).getClass();
            if (bk8Var instanceof C0763a) {
                ((C0763a) bk8Var).f7069a.getClass();
            }
        }
        lq2Var.mo16444a(bk8Var);
    }

    /* JADX INFO: renamed from: l */
    public void m21203l(bk8 bk8Var) throws Exception {
        Object failure;
        bk8Var.getClass();
        lq2 lq2Var = (lq2) this.f60615e;
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = ik8VarMo2873e0.mo2876a0() && ik8VarMo2873e0.getLong(0) != 0;
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            if (z) {
                ik8 ik8VarMo2873e1 = bk8Var.mo2873e0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strMo2875L = ik8VarMo2873e1.mo2876a0() ? ik8VarMo2873e1.mo2875L(0) : null;
                    AbstractC3352my.m17126j(ik8VarMo2873e1, null);
                    if (!((String) lq2Var.f49998b).equals(strMo2875L) && !((String) lq2Var.f49999c).equals(strMo2875L)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) lq2Var.f49998b) + ", found: " + strMo2875L).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        AbstractC3352my.m17126j(ik8VarMo2873e1, th);
                        throw th2;
                    }
                }
            } else {
                AbstractC3695vr.m23496g(bk8Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    mc0 mc0VarMo16464v = lq2Var.mo16464v(bk8Var);
                    if (!mc0VarMo16464v.f51053b) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + mc0VarMo16464v.f51054c).toString());
                    }
                    lq2Var.mo16462t(bk8Var);
                    m21204m(bk8Var);
                    failure = xfa.f68157a;
                    if (!(failure instanceof Result.Failure)) {
                        AbstractC3695vr.m23496g(bk8Var, "END TRANSACTION");
                    }
                    Throwable thM15355a = Result.m15355a(failure);
                    if (thM15355a != null) {
                        AbstractC3695vr.m23496g(bk8Var, "ROLLBACK TRANSACTION");
                        throw thM15355a;
                    }
                } catch (Throwable th3) {
                    failure = new Result.Failure(th3);
                }
            }
            lq2Var.mo16461s(bk8Var);
            for (ai8 ai8Var : (List) this.f60616f) {
                ai8Var.getClass();
                if (bk8Var instanceof C0763a) {
                    ai8Var.mo443a(((C0763a) bk8Var).f7069a);
                }
            }
            this.f60612b = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th4);
                throw th5;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m21204m(bk8 bk8Var) {
        AbstractC3695vr.m23496g(bk8Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        AbstractC3695vr.m23496g(bk8Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((lq2) this.f60615e).f49998b) + "')");
    }

    public String toString() {
        switch (this.f60611a) {
            case 1:
                Map map = (Map) this.f60619i;
                Long l = (Long) this.f60618h;
                Long l2 = (Long) this.f60617g;
                Long l3 = (Long) this.f60616f;
                Long l4 = (Long) this.f60615e;
                ArrayList arrayList = new ArrayList();
                if (this.f60612b) {
                    arrayList.add("isRegularFile");
                }
                if (this.f60613c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return u91.m22596N0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ sb2() {
        this.f60611a = 0;
    }

    public sb2(s02 s02Var, vp6 vp6Var, zi3 zi3Var) {
        this.f60611a = 2;
        this.f60614d = s02Var;
        this.f60615e = new yh8();
        List list = s02Var.f60116e;
        EmptyList emptyList = EmptyList.f47638a;
        this.f60616f = list == null ? emptyList : list;
        u91.m22604V0(list == null ? emptyList : list, new zh8(new cg7(this, 12)));
        Context context = s02Var.f60112a;
        d54 d54Var = s02Var.f60115d;
        RoomDatabase$JournalMode roomDatabase$JournalMode = s02Var.f60118g;
        Executor executor = s02Var.f60119h;
        Executor executor2 = s02Var.f60120i;
        List list2 = s02Var.f60124m;
        List list3 = s02Var.f60125n;
        context.getClass();
        d54Var.getClass();
        roomDatabase$JournalMode.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        throw new NotImplementedError(0);
    }

    public sb2(boolean z, boolean z2, d57 d57Var, Long l, Long l2, Long l3, Long l4, Map map) {
        this.f60611a = 1;
        map.getClass();
        this.f60612b = z;
        this.f60613c = z2;
        this.f60614d = d57Var;
        this.f60615e = l;
        this.f60616f = l2;
        this.f60617g = l3;
        this.f60618h = l4;
        this.f60619i = AbstractC3194a.m15371X(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sb2(boolean z, boolean z2, d57 d57Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, d57Var, l, l2, l3, l4, AbstractC3194a.m15360M());
        this.f60611a = 1;
    }
}
