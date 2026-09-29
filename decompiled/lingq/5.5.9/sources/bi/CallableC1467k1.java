package bi;

import android.database.Cursor;
import com.lingq.shared.uimodel.language.UserLanguageProgress;
import java.util.concurrent.Callable;
import p213k4.C6595o;
import p338qd.C8573r0;

/* JADX INFO: renamed from: bi.k1 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1467k1 implements Callable<UserLanguageProgress> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C6595o f8569a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C1422e1 f8570b;

    public CallableC1467k1(C1422e1 c1422e1, C6595o c6595o) {
        this.f8570b = c1422e1;
        this.f8569a = c6595o;
    }

    @Override // java.util.concurrent.Callable
    public final UserLanguageProgress call() throws Exception {
        C1422e1 c1422e1 = this.f8570b;
        Cursor cursorM16698S0 = C8573r0.m16698S0(c1422e1.f8402a, this.f8569a);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "interval");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "languageCode");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "writtenWordsGoal");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "speakingTimeGoal");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "totalWordsKnown");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "readWords");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "totalCards");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "activityIndex");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "knownWordsGoal");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "listeningTimeGoal");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "speakingTime");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "cardsCreatedGoal");
            int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "knownWords");
            int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "intervals");
            int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "cardsCreated");
            int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "readWordsGoal");
            int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "listeningTime");
            int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "cardsLearned");
            int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "writtenWords");
            int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "cardsLearnedGoal");
            UserLanguageProgress userLanguageProgress = null;
            if (cursorM16698S0.moveToFirst()) {
                String string = cursorM16698S0.isNull(iM16742n0) ? null : cursorM16698S0.getString(iM16742n0);
                String string2 = cursorM16698S0.isNull(iM16742n1) ? null : cursorM16698S0.getString(iM16742n1);
                int i10 = cursorM16698S0.getInt(iM16742n2);
                double d10 = cursorM16698S0.getDouble(iM16742n3);
                int i11 = cursorM16698S0.getInt(iM16742n4);
                double d11 = cursorM16698S0.getDouble(iM16742n5);
                int i12 = cursorM16698S0.getInt(iM16742n6);
                int i13 = cursorM16698S0.getInt(iM16742n7);
                int i14 = cursorM16698S0.getInt(iM16742n8);
                double d12 = cursorM16698S0.getDouble(iM16742n9);
                double d13 = cursorM16698S0.getDouble(iM16742n10);
                int i15 = cursorM16698S0.getInt(iM16742n11);
                int i16 = cursorM16698S0.getInt(iM16742n12);
                String string3 = cursorM16698S0.isNull(iM16742n13) ? null : cursorM16698S0.getString(iM16742n13);
                c1422e1.f8410i.getClass();
                userLanguageProgress = new UserLanguageProgress(string, string2, i10, d10, i11, d11, i12, i13, i14, d12, d13, i15, i16, C1405c0.m4992l(string3), cursorM16698S0.getInt(iM16742n14), cursorM16698S0.getInt(iM16742n15), cursorM16698S0.getDouble(iM16742n16), cursorM16698S0.getInt(iM16742n17), cursorM16698S0.getInt(iM16742n18), cursorM16698S0.getInt(iM16742n19));
            }
            return userLanguageProgress;
        } finally {
            cursorM16698S0.close();
        }
    }

    public final void finalize() {
        this.f8569a.m13198q();
    }
}
