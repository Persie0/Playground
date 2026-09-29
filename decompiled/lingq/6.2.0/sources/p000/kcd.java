package p000;

import androidx.room.util.AbstractC0758a;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class kcd {
    /* JADX INFO: renamed from: a */
    public static final void m15121a(WorkDatabase workDatabase, hh1 hh1Var, w7b w7bVar) {
        int i;
        workDatabase.getClass();
        hh1Var.getClass();
        ArrayList arrayListM23608N = vz1.m23608N(w7bVar);
        int i2 = 0;
        while (!arrayListM23608N.isEmpty()) {
            List list = ((w7b) u91.m22608Z0(arrayListM23608N)).f66499d;
            list.getClass();
            List list2 = list;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                i = 0;
            } else {
                Iterator it = list2.iterator();
                i = 0;
                while (it.hasNext()) {
                    if (((l8b) it.next()).f49310b.f55781j.m519g() && (i = i + 1) < 0) {
                        vz1.m23626d0();
                        throw null;
                    }
                }
            }
            i2 += i;
        }
        if (i2 == 0) {
            return;
        }
        int iIntValue = ((Number) AbstractC0758a.m2859b(workDatabase.mo2909z().f63598a, true, false, new e0b(10))).intValue();
        int i3 = hh1Var.f42356j;
        if (iIntValue + i2 <= i3) {
            return;
        }
        C3386nv.m17626m(wq1.m24123s(ux5.m22994q(i3, iIntValue, "Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: ", ";\nalready enqueued count: ", ";\ncurrent enqueue operation count: "), i2, ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed."));
    }

    /* JADX INFO: renamed from: b */
    public static final p8b m15122b(List list, p8b p8bVar) {
        list.getClass();
        p8bVar.getClass();
        boolean zM21789g = p8bVar.f55776e.m21789g("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
        boolean zM21789g2 = p8bVar.f55776e.m21789g("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
        boolean zM21789g3 = p8bVar.f55776e.m21789g("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
        if (zM21789g || !zM21789g2 || !zM21789g3) {
            return p8bVar;
        }
        String str = p8bVar.f55774c;
        hi8 hi8Var = new hi8(10);
        sz1 sz1Var = p8bVar.f55776e;
        sz1Var.getClass();
        hi8Var.m13288y(sz1Var.f61646a);
        ((LinkedHashMap) hi8Var.f42410b).put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str);
        return p8b.m18978b(p8bVar, null, null, hi8Var.m13282k(), 0, 0L, 0, 0, 0L, 0, 33554411);
    }

    /* JADX INFO: renamed from: c */
    public static String m15123c(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b : bArr) {
            if (b == 34) {
                sb.append("\\\"");
            } else if (b == 39) {
                sb.append("\\'");
            } else if (b != 92) {
                switch (b) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b < 32 || b > 126) {
                            sb.append('\\');
                            sb.append((char) (((b >>> 6) & 3) + 48));
                            sb.append((char) (((b >>> 3) & 7) + 48));
                            sb.append((char) ((b & 7) + 48));
                        } else {
                            sb.append((char) b);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
