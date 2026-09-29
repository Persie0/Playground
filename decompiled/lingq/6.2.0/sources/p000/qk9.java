package p000;

import android.app.PendingIntent;
import android.content.Context;
import android.view.textclassifier.TextClassification;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.selection.C0205f;
import androidx.room.util.AbstractC0758a;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkInfo$State;
import androidx.work.WorkManager$UpdateResult;
import androidx.work.impl.C0773b;
import androidx.work.impl.WorkDatabase;
import com.lingq.core.domain.model.notification.InAppNotificationAction;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.domain.store.AudioUnderlineMode;
import com.lingq.core.p012ui.UpgradeReason;
import com.lingq.core.settings.theme.ThemeSettingsTab;
import com.lingq.core.token.C1909e;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.C3244l;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class qk9 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f57876a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f57877b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f57878c;

    public /* synthetic */ qk9(int i, Object obj, Object obj2) {
        this.f57876a = i;
        this.f57877b = obj;
        this.f57878c = obj2;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() throws PendingIntent.CanceledException {
        long j;
        sw9 sw9VarM25363d;
        yw4 yw4Var;
        C3419on c3419on;
        Object value;
        Object value2;
        final boolean z;
        switch (this.f57876a) {
            case 0:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.f57877b;
                C3329mb c3329mb = (C3329mb) this.f57878c;
                int i = ref$IntRef.f47716a;
                ref$IntRef.f47716a = i + 1;
                Integer numValueOf = Integer.valueOf(i);
                if (i <= vk9.m23384g0((String) c3329mb.f50861c)) {
                    return numValueOf;
                }
                return null;
            case 1:
                Context context = (Context) this.f57877b;
                TextClassification textClassification = (TextClassification) this.f57878c;
                String text = textClassification.getText();
                pvc.m19497E(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                return xfa.f68157a;
            case 2:
                C0205f c0205f = (C0205f) this.f57877b;
                long j2 = ((n84) ((t66) this.f57878c).getValue()).f52482a;
                gq6 gq6VarM1109j = c0205f.m1109j();
                long jFloatToRawIntBits = 9205357640488583168L;
                if (gq6VarM1109j != null) {
                    long j3 = gq6VarM1109j.f41189a;
                    C3419on c3419onM1113n = c0205f.m1113n();
                    if (c3419onM1113n != null && c3419onM1113n.f54604b.length() != 0) {
                        Handle handle = (Handle) ((xc9) c0205f.f3093r).getValue();
                        int i2 = handle == null ? -1 : rv9.f59883a[handle.ordinal()];
                        if (i2 != -1) {
                            if (i2 == 1 || i2 == 2) {
                                long j4 = c0205f.m1114o().f65991b;
                                int i3 = cx9.f34693c;
                                j = j4 >> 32;
                            } else {
                                if (i2 != 3) {
                                    gm5.m12750e();
                                    return null;
                                }
                                long j5 = c0205f.m1114o().f65991b;
                                int i4 = cx9.f34693c;
                                j = j5 & 4294967295L;
                            }
                            int i5 = (int) j;
                            yw4 yw4Var2 = c0205f.f3079d;
                            if (yw4Var2 != null && (sw9VarM25363d = yw4Var2.m25363d()) != null && (yw4Var = c0205f.f3079d) != null && (c3419on = yw4Var.f70569a.f64340a) != null) {
                                int iM15945h = l70.m15945h(c0205f.f3077b.mo13411t(i5), 0, c3419on.f54604b.length());
                                float fIntBitsToFloat = Float.intBitsToFloat((int) (sw9VarM25363d.m21756d(j3) >> 32));
                                rw9 rw9Var = sw9VarM25363d.f61519a;
                                w46 w46Var = rw9Var.f59976b;
                                int iM23743d = w46Var.m23743d(iM15945h);
                                float fM20958e = rw9Var.m20958e(iM23743d);
                                float fM20959f = rw9Var.m20959f(iM23743d);
                                float fM15944g = l70.m15944g(fIntBitsToFloat, Math.min(fM20958e, fM20959f), Math.max(fM20958e, fM20959f));
                                if (n84.m17279a(j2, 0L) || Math.abs(fIntBitsToFloat - fM15944g) <= ((int) (j2 >> 32)) / 2) {
                                    float fM23745f = w46Var.m23745f(iM23743d);
                                    jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fM15944g)) << 32) | (((long) Float.floatToRawIntBits(((w46Var.m23741b(iM23743d) - fM23745f) / 2.0f) + fM23745f)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new gq6(jFloatToRawIntBits);
            case 3:
                ((vi3) this.f57877b).invoke((yz7) this.f57878c);
                return xfa.f68157a;
            case 4:
                ((vi3) this.f57877b).invoke((AudioUnderlineMode) this.f57878c);
                return xfa.f68157a;
            case 5:
                ((vi3) this.f57877b).invoke((ThemeSettingsTab) this.f57878c);
                return xfa.f68157a;
            case 6:
                ((vi3) this.f57877b).invoke((InAppNotificationAction) this.f57878c);
                return xfa.f68157a;
            case 7:
                f5a f5aVar = (f5a) this.f57877b;
                l4a l4aVar = (l4a) this.f57878c;
                if (f5aVar.f38475g == null) {
                    l4aVar.f49055a = null;
                } else if (!f5aVar.f38472d && f5aVar.f38474f != null) {
                    l4aVar.f49055a = f5aVar;
                }
                return xfa.f68157a;
            case 8:
                ((vi3) this.f57877b).invoke(new b3a(((br9) this.f57878c).f8901a));
                return xfa.f68157a;
            case 9:
                ui3 ui3Var = (ui3) this.f57877b;
                C1909e c1909e = (C1909e) this.f57878c;
                if (ui3Var != null) {
                    ui3Var.mo0a();
                } else {
                    C3244l c3244l = c1909e.f23881S;
                    do {
                        value = c3244l.getValue();
                    } while (!c3244l.m15570h(value, null));
                    C3244l c3244l2 = c1909e.f23885W;
                    do {
                        value2 = c3244l2.getValue();
                    } while (!c3244l2.m15570h(value2, f5a.m11558a((f5a) value2, null, null, false, null, null, null, null, null, false, false, null, null, 0, null, null, null, null, null, null, null, null, null, false, false, null, null, false, 0, false, false, false, false, false, false, true, false, false, null, false, null, null, null, false, false, null, null, false, null, null, null, -1, 2097127)));
                }
                return xfa.f68157a;
            case 10:
                ((vi3) this.f57877b).invoke((UpgradeReason) this.f57878c);
                return xfa.f68157a;
            case 11:
                ((vi3) this.f57877b).invoke(new y14(!((e24) ((g24) this.f57878c)).f36615b));
                return xfa.f68157a;
            case 12:
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.f57877b;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) this.f57878c;
                int i6 = ref$IntRef2.f47716a;
                ref$IntRef2.f47716a = i6 + 1;
                Integer numValueOf2 = Integer.valueOf(i6);
                if (i6 <= ((VocabularySearchQuery) ref$ObjectRef.f47718a).f19860b) {
                    return numValueOf2;
                }
                return null;
            case 13:
                hp5 hp5Var = (hp5) this.f57877b;
                ((t66) this.f57878c).setValue(Boolean.FALSE);
                hp5Var.mo276a("android.permission.WRITE_EXTERNAL_STORAGE");
                return xfa.f68157a;
            default:
                C0773b c0773b = (C0773b) this.f57877b;
                l8b l8bVar = (l8b) this.f57878c;
                u8b u8bVarMo2909z = c0773b.f7206c.mo2909z();
                List listM22570f = u8bVarMo2909z.m22570f("streak_periodic_update");
                if (listM22570f.size() > 1) {
                    C3386nv.m17636w("Can't apply UPDATE policy to the chains of work.");
                    return null;
                }
                n8b n8bVar = (n8b) u91.m22591I0(listM22570f);
                if (n8bVar == null) {
                    os2.m18458a(new w7b(c0773b, "streak_periodic_update", ExistingWorkPolicy.KEEP, vz1.m23604J(l8bVar), 0));
                } else {
                    String str = n8bVar.f52497a;
                    p8b p8bVarM22569e = u8bVarMo2909z.m22569e(str);
                    if (p8bVarM22569e == null) {
                        C3386nv.m17633t(wq1.m24118n("WorkSpec with ", str, ", that matches a name \"streak_periodic_update\", wasn't found"));
                        return null;
                    }
                    if (!p8bVarM22569e.m18988k()) {
                        C3386nv.m17636w("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
                        return null;
                    }
                    if (n8bVar.f52498b == WorkInfo$State.CANCELLED) {
                        u8bVarMo2909z.m22567c(str);
                        os2.m18458a(new w7b(c0773b, "streak_periodic_update", ExistingWorkPolicy.KEEP, vz1.m23604J(l8bVar), 0));
                    } else {
                        final p8b p8bVarM18978b = p8b.m18978b(l8bVar.f49310b, n8bVar.f52497a, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
                        il7 il7Var = c0773b.f7209f;
                        il7Var.getClass();
                        final WorkDatabase workDatabase = c0773b.f7206c;
                        workDatabase.getClass();
                        hh1 hh1Var = c0773b.f7205b;
                        hh1Var.getClass();
                        final List list = c0773b.f7208e;
                        list.getClass();
                        final Set set = l8bVar.f49311c;
                        final String str2 = p8bVarM18978b.f55772a;
                        final p8b p8bVarM22569e2 = workDatabase.mo2909z().m22569e(str2);
                        if (p8bVarM22569e2 == null) {
                            C3386nv.m17626m(wq1.m24118n("Worker with ", str2, " doesn't exist"));
                            return null;
                        }
                        if (p8bVarM22569e2.f55773b.isFinished()) {
                            WorkManager$UpdateResult workManager$UpdateResult = WorkManager$UpdateResult.NOT_APPLIED;
                        } else {
                            if (p8bVarM22569e2.m18988k() ^ p8bVarM18978b.m18988k()) {
                                StringBuilder sb = new StringBuilder("Can't update ");
                                sb.append(p8bVarM22569e2.m18988k() ? "Periodic" : "OneTime");
                                sb.append(" Worker to ");
                                throw new UnsupportedOperationException(AbstractC3393o1.m17738m(sb, p8bVarM18978b.m18988k() ? "Periodic" : "OneTime", " Worker. Update operation must preserve worker's type."));
                            }
                            synchronized (il7Var.f44277k) {
                                z = il7Var.m14014c(str2) != null;
                                break;
                            }
                            if (!z) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    ((sm8) it.next()).mo21481d(str2);
                                }
                            }
                            workDatabase.m2845r(new hz4(new Runnable() { // from class: b9b
                                @Override // java.lang.Runnable
                                public final void run() {
                                    WorkDatabase workDatabase2 = workDatabase;
                                    u8b u8bVarMo2909z2 = workDatabase2.mo2909z();
                                    w8b w8bVarMo2903A = workDatabase2.mo2903A();
                                    p8b p8bVar = p8bVarM22569e2;
                                    WorkInfo$State workInfo$State = p8bVar.f55773b;
                                    int i7 = p8bVar.f55782k;
                                    long j6 = p8bVar.f55785n;
                                    int i8 = 1;
                                    int i9 = p8bVar.f55791t + 1;
                                    int i10 = p8bVar.f55790s;
                                    long j7 = p8bVar.f55792u;
                                    int i11 = p8bVar.f55793v;
                                    p8b p8bVar2 = p8bVarM18978b;
                                    p8b p8bVarM18978b2 = p8b.m18978b(p8bVar2, null, workInfo$State, null, i7, j6, i10, i9, j7, i11, 29613053);
                                    if (p8bVar2.f55793v == 1) {
                                        p8bVarM18978b2.f55792u = p8bVar2.f55792u;
                                        p8bVarM18978b2.f55793v++;
                                    }
                                    p8b p8bVarM15122b = kcd.m15122b(list, p8bVarM18978b2);
                                    u8bVarMo2909z2.getClass();
                                    AbstractC0758a.m2859b(u8bVarMo2909z2.f63598a, false, true, new s8b(u8bVarMo2909z2, p8bVarM15122b, i8));
                                    w8bVarMo2903A.getClass();
                                    String str3 = str2;
                                    str3.getClass();
                                    AbstractC0758a.m2859b(w8bVarMo2903A.f66537a, false, true, new xca(str3, 19));
                                    w8bVarMo2903A.m23814a(str3, set);
                                    if (z) {
                                        return;
                                    }
                                    u8bVarMo2909z2.m22571g(str3, -1L);
                                    h8b h8bVarMo2908y = workDatabase2.mo2908y();
                                    h8bVarMo2908y.getClass();
                                    AbstractC0758a.m2859b(h8bVarMo2908y.f42000a, false, true, new xca(str3, 7));
                                }
                            }, 29));
                            if (!z) {
                                um8.m22795b(hh1Var, workDatabase, list);
                            }
                            WorkManager$UpdateResult workManager$UpdateResult2 = WorkManager$UpdateResult.NOT_APPLIED;
                        }
                    }
                }
                return xfa.f68157a;
        }
    }
}
