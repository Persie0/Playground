package p000;

import com.kochava.core.job.job.internal.JobAction;
import com.kochava.core.job.job.internal.JobState;
import com.kochava.core.job.job.internal.JobType;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yd4 {

    /* JADX INFO: renamed from: a */
    public final C3309ls f69681a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f69682b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final ArrayList f69683c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public final ArrayList f69684d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final Object f69685e = new Object();

    /* JADX INFO: renamed from: f */
    public volatile boolean f69686f = false;

    public yd4(ny8 ny8Var, ce4 ce4Var) {
        this.f69681a = new C3309ls(ny8Var, ce4Var, this, 25);
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m25080a(HashMap map, HashMap map2, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            vd4 vd4Var = (vd4) it.next();
            Iterator it2 = vd4Var.mo3637c().iterator();
            boolean z = true;
            while (true) {
                if (!it2.hasNext()) {
                    vd4Var.mo3636b(z);
                    map2.put(vd4Var.getId(), Boolean.valueOf(vd4Var.mo3639e()));
                    arrayList2.add(vd4Var);
                    break;
                }
                String str = (String) it2.next();
                if (map.containsKey(str) && !map2.containsKey(str)) {
                    break;
                }
                if (map.containsKey(str) && Boolean.FALSE.equals(map2.get(str))) {
                    z = false;
                }
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m25081e(List list, HashMap map, HashMap map2, HashMap map3) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Boolean bool = (Boolean) map.get(str);
            if (bool != null && !bool.booleanValue()) {
                return false;
            }
            Boolean bool2 = (Boolean) map2.get(str);
            if (bool2 != null && !bool2.booleanValue()) {
                return false;
            }
            Boolean bool3 = (Boolean) map3.get(str);
            if (bool3 != null && !bool3.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final HashMap m25082b() {
        HashMap map = new HashMap();
        for (mb2 mb2Var : this.f69684d) {
            map.put(mb2Var.f50871a, Boolean.valueOf(mb2Var.mo3639e()));
        }
        return map;
    }

    /* JADX INFO: renamed from: c */
    public final void m25083c(bd4 bd4Var) {
        int i = xd4.f68098a[bd4Var.f8371d.ordinal()];
        ArrayList arrayList = this.f69683c;
        if (i != 1) {
            if (i != 2) {
                return;
            }
            arrayList.add(bd4Var);
            return;
        }
        String str = bd4Var.f8368a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (str.equals(((bd4) arrayList.get(size)).f8368a)) {
                arrayList.remove(size);
            }
        }
        arrayList.add(bd4Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m25084d(ArrayList arrayList) {
        JobState jobState;
        boolean z;
        boolean z2;
        HashMap mapM25082b = m25082b();
        HashMap mapM25087h = m25087h();
        HashMap map = new HashMap();
        Iterator it = this.f69682b.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bd4 bd4Var = (bd4) it2.next();
            if (m25081e(bd4Var.f8370c, mapM25082b, mapM25087h, map)) {
                Object obj = bd4.f8367p;
                synchronized (obj) {
                    JobState jobState2 = bd4Var.f8378k;
                    jobState = JobState.RunningWaitForDependencies;
                    z = jobState2 == jobState;
                }
                if (z) {
                    bd4Var.m3640f(new ie4(JobAction.ResumeWaitForDependencies, null, -1L), jobState);
                } else {
                    synchronized (obj) {
                        z2 = bd4Var.f8378k == JobState.Pending;
                    }
                    if (z2) {
                        C3309ls c3309lsM3641j = bd4Var.m3641j();
                        ((ny8) c3309lsM3641j.f50064b).m17684L(new RunnableC3470pr(20, bd4Var, c3309lsM3641j));
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m25085f(String str) {
        ArrayList arrayList = this.f69684d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (str.equals(((mb2) arrayList.get(size)).f50871a)) {
                arrayList.remove(size);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m25086g(HashMap map, HashMap map2, ArrayList arrayList) {
        for (mb2 mb2Var : this.f69684d) {
            mb2Var.mo3636b(true);
            String str = mb2Var.f50871a;
            map.put(str, Boolean.TRUE);
            map2.put(str, Boolean.valueOf(mb2Var.mo3639e()));
        }
        Iterator it = this.f69682b.iterator();
        if (it.hasNext()) {
            throw wq1.m24110f(it);
        }
        for (bd4 bd4Var : this.f69683c) {
            map.put(bd4Var.f8368a, Boolean.TRUE);
            JobType jobType = bd4Var.f8371d;
            if (jobType == JobType.OneShot) {
                map2.put(bd4Var.f8368a, Boolean.FALSE);
            } else if (jobType == JobType.Persistent) {
                arrayList.add(bd4Var);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final HashMap m25087h() {
        HashMap map = new HashMap();
        for (bd4 bd4Var : this.f69683c) {
            if (bd4Var.f8371d == JobType.Persistent) {
                map.put(bd4Var.f8368a, Boolean.valueOf(bd4Var.mo3639e()));
            } else if (bd4Var.f8371d == JobType.OneShot) {
                map.put(bd4Var.f8368a, Boolean.FALSE);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: i */
    public final void m25088i() {
        synchronized (this.f69685e) {
            try {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                ArrayList arrayList = new ArrayList();
                for (bd4 bd4Var : this.f69683c) {
                    if (!bd4Var.mo3639e()) {
                        String str = bd4Var.f8368a;
                        String str2 = bd4Var.f8369b;
                        if (!map.containsKey(str) && !map2.containsKey(str2)) {
                            arrayList.add(bd4Var);
                            Boolean bool = Boolean.TRUE;
                            map.put(str, bool);
                            if (!str2.isEmpty()) {
                                map2.put(str2, bool);
                            }
                        }
                    }
                }
                m25084d(arrayList);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m25089j() {
        synchronized (this.f69685e) {
            try {
                HashMap map = new HashMap();
                HashMap map2 = new HashMap();
                ArrayList arrayList = new ArrayList();
                m25086g(map, map2, arrayList);
                for (int i = 0; arrayList.size() > 0 && i < 100; i++) {
                    arrayList.removeAll(m25080a(map, map2, arrayList));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m25090k(mb2 mb2Var) {
        synchronized (this.f69685e) {
            try {
                if (this.f69686f) {
                    ((ny8) this.f69681a.f50064b).m17684L(new RunnableC3470pr(22, this, mb2Var));
                } else {
                    m25085f(mb2Var.f50871a);
                    this.f69684d.add(mb2Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m25091l() {
        synchronized (this.f69685e) {
            try {
                if (this.f69686f) {
                    return;
                }
                this.f69686f = true;
                ((ny8) this.f69681a.f50064b).m17684L(new wd4(this, 0));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m25092m() {
        ((ny8) this.f69681a.f50064b).m17684L(new wd4(this, 1));
    }
}
