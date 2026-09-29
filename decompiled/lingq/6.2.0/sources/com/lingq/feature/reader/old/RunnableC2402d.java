package com.lingq.feature.reader.old;

import androidx.lifecycle.Lifecycle$State;
import com.lingq.core.domain.model.milestones.DailyGoalMet;
import com.lingq.core.domain.model.milestones.GoalMetType;
import com.lingq.core.domain.model.milestones.Milestone;
import com.lingq.core.domain.model.notification.InAppNotificationType;
import kotlinx.coroutines.flow.C3244l;
import p000.bh4;
import p000.gm5;
import p000.go3;
import p000.h24;
import p000.lda;
import p000.mw7;
import p000.wfb;

/* JADX INFO: renamed from: com.lingq.feature.reader.old.d */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2402d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ReaderFragment f29180a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ go3 f29181b;

    public RunnableC2402d(ReaderFragment readerFragment, go3 go3Var) {
        this.f29180a = readerFragment;
        this.f29181b = go3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        ReaderFragment readerFragment = this.f29180a;
        if (readerFragment.f5709m0.f66586d == Lifecycle$State.RESUMED) {
            bh4[] bh4VarArr = ReaderFragment.f28218P0;
            boolean zBooleanValue = ((Boolean) readerFragment.m9290W0().f29357f0.getValue()).booleanValue();
            go3 go3Var = this.f29181b;
            if (!zBooleanValue) {
                Object obj = go3Var.f41067b;
                C2412n c2412nM9290W0 = readerFragment.m9290W0();
                if (obj instanceof DailyGoalMet) {
                    str = ((DailyGoalMet) obj).f19519f;
                } else {
                    str = obj instanceof Milestone ? ((Milestone) obj).f19533b : "";
                }
                c2412nM9290W0.getClass();
                str.getClass();
                wfb.m23926u(lda.m16103C(c2412nM9290W0), c2412nM9290W0.f29301O, null, new ReaderViewModel$meetMilestone$1(c2412nM9290W0, str, null), 2);
                return;
            }
            if (readerFragment.m9287T0().f58118b.getInt("lessonsOpened", 0) > 1) {
                GoalMetType goalMetType = go3Var.f41066a;
                Object obj2 = go3Var.f41067b;
                int i = mw7.f51971a[goalMetType.ordinal()];
                if (i == 1 || i == 2) {
                    C2412n c2412nM9290W1 = readerFragment.m9290W0();
                    obj2.getClass();
                    c2412nM9290W1.getClass();
                    wfb.m23926u(lda.m16103C(c2412nM9290W1), null, null, new ReaderViewModel$showDailyGoalNotification$1(c2412nM9290W1, (DailyGoalMet) obj2, null), 3);
                    return;
                }
                if (i == 3) {
                    C2412n c2412nM9290W2 = readerFragment.m9290W0();
                    InAppNotificationType inAppNotificationType = InAppNotificationType.Milestone;
                    obj2.getClass();
                    h24 h24Var = new h24(inAppNotificationType, null, (Milestone) obj2, 14);
                    c2412nM9290W2.getClass();
                    c2412nM9290W2.f29384m.mo7013g1(h24Var);
                    return;
                }
                if (i != 4) {
                    gm5.m12750e();
                    return;
                }
                C3244l c3244l = readerFragment.m9290W0().f29392o0;
                Boolean bool = Boolean.TRUE;
                c3244l.getClass();
                c3244l.m15572j(null, bool);
            }
        }
    }
}
