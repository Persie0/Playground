package p000;

import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.work.impl.C0773b;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.constraints.controllers.AbstractC0777a;
import com.lingq.core.analytics.embedded.EmbeddedMessage;
import com.lingq.core.analytics.embedded.EmbeddedMessageElements;
import com.lingq.core.data.repository.C1285a;
import com.lingq.core.data.repository.C1288d;
import com.lingq.core.data.repository.C1292h;
import com.lingq.core.data.repository.C1293i;
import com.lingq.core.domain.dictionaries.C1375a;
import com.lingq.core.domain.model.challenge.Challenge;
import com.lingq.core.domain.model.language.DictionaryLocale;
import com.lingq.core.domain.model.language.Language;
import com.lingq.core.domain.model.language.LanguageProgressMetric;
import com.lingq.core.domain.model.language.LanguageProgressPeriod;
import com.lingq.core.domain.playlist.C1523f;
import com.lingq.core.token.C1909e;
import com.lingq.core.token.domain.C1906c;
import com.lingq.feature.challenges.ChallengesFragment;
import com.lingq.feature.reader.stats.C2535j;
import com.lingq.feature.statistics.domain.C2814a;
import com.lingq.feature.statistics.domain.C2815b;
import java.util.UUID;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.AbstractC3224d;

/* JADX INFO: renamed from: sk */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C3577sk implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f60945a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f60946b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f60947c;

    public /* synthetic */ C3577sk(int i, Object obj, Object obj2) {
        this.f60945a = i;
        this.f60946b = obj;
        this.f60947c = obj2;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        int i = 29;
        switch (this.f60945a) {
            case 0:
                ((Ref$ObjectRef) this.f60946b).f47718a = ((ui3) this.f60947c).mo0a();
                return xfa.f68157a;
            case 1:
                AbstractC0777a abstractC0777a = (AbstractC0777a) this.f60946b;
                u80 u80Var = (u80) this.f60947c;
                yb0 yb0Var = abstractC0777a.f7239a;
                yb0Var.getClass();
                synchronized (yb0Var.f69589c) {
                    if (yb0Var.f69590d.remove(u80Var) && yb0Var.f69590d.isEmpty()) {
                        oj5.m18040f().m18042a(ti0.f62334a, yb0Var.getClass().getSimpleName().concat(": unregistering receiver"));
                        yb0Var.f69588b.unregisterReceiver(yb0Var.f69592f);
                    }
                    break;
                }
                return xfa.f68157a;
            case 2:
                ((vi3) this.f60946b).invoke(((Language) this.f60947c).f19024a);
                return xfa.f68157a;
            case 3:
                String str = (String) this.f60946b;
                C0773b c0773b = (C0773b) this.f60947c;
                WorkDatabase workDatabase = c0773b.f7206c;
                workDatabase.getClass();
                workDatabase.m2845r(new hz4(new RunnableC3725wk(workDatabase, str, c0773b, 4), i));
                um8.m22795b(c0773b.f7205b, workDatabase, c0773b.f7208e);
                return xfa.f68157a;
            case 4:
                C0773b c0773b2 = (C0773b) this.f60946b;
                UUID uuid = (UUID) this.f60947c;
                WorkDatabase workDatabase2 = c0773b2.f7206c;
                workDatabase2.getClass();
                workDatabase2.m2845r(new hz4(new RunnableC0806bd(13, c0773b2, uuid), i));
                um8.m22795b(c0773b2.f7205b, c0773b2.f7206c, c0773b2.f7208e);
                return xfa.f68157a;
            case 5:
                ((vi3) this.f60946b).invoke((Challenge) this.f60947c);
                return xfa.f68157a;
            case 6:
                ChallengesFragment challengesFragment = (ChallengesFragment) this.f60946b;
                t66 t66Var = (t66) this.f60947c;
                bh4[] bh4VarArr = ChallengesFragment.f24437G0;
                ws1 ws1Var = ((et0) t66Var.getValue()).f37791e;
                if (ws1Var == null || ws1Var.f67228d || ws1Var.f67227c || !ws1Var.f67235k) {
                    w41 w41Var = challengesFragment.f24441F0;
                    if (w41Var == null) {
                        fa4.m11636J("navGraphController");
                        throw null;
                    }
                    w41Var.m23737z(new u96(false));
                } else {
                    challengesFragment.m8807R0().m8841V2(uu1.f64360a);
                }
                return xfa.f68157a;
            case 7:
                ((jv0) this.f60946b).mo8882i(((tz0) this.f60947c).f63116d.f63041f);
                return xfa.f68157a;
            case 8:
                ((vi3) this.f60946b).invoke(Integer.valueOf(((hw0) this.f60947c).f43028a));
                return xfa.f68157a;
            case 9:
                ((vi3) this.f60946b).invoke((oz0) this.f60947c);
                return xfa.f68157a;
            case 10:
                ((vi3) this.f60946b).invoke(new cv1(!((vv1) this.f60947c).f65964c));
                return xfa.f68157a;
            case 11:
                ((vi3) this.f60946b).invoke(new dv1(((wv1) this.f60947c).f67329a));
                return xfa.f68157a;
            case 12:
                return new f84(pvc.m19495C(((dt9) this.f60946b).mo10628l((aq4) ((ui3) this.f60947c).mo0a())));
            case 13:
                ((jt9) this.f60946b).f46135d.invoke((nt9) this.f60947c);
                return xfa.f68157a;
            case 14:
                ((vi3) this.f60946b).invoke(((DictionaryLocale) this.f60947c).f19021a);
                return xfa.f68157a;
            case 15:
                EmbeddedMessage embeddedMessage = (EmbeddedMessage) this.f60946b;
                vi3 vi3Var = (vi3) this.f60947c;
                EmbeddedMessageElements embeddedMessageElements = embeddedMessage.f14318b;
                if (!embeddedMessageElements.f14330f.isEmpty()) {
                    vi3Var.invoke(u91.m22589G0(embeddedMessageElements.f14330f));
                }
                return xfa.f68157a;
            case 16:
                ((vi3) this.f60946b).invoke(new u03(((yz2) this.f60947c).f70666a));
                return xfa.f68157a;
            case 17:
                ((vi3) this.f60946b).invoke(new v03(((a03) this.f60947c).f17a, false));
                return xfa.f68157a;
            case 18:
                d03 d03Var = (d03) this.f60946b;
                vi3 vi3Var2 = (vi3) this.f60947c;
                z03 z03Var = d03Var.f34775b;
                if (z03Var != null) {
                    vi3Var2.invoke(z03Var);
                }
                return xfa.f68157a;
            case 19:
                return ((C1292h) ((C1375a) this.f60946b).f18633a).m7201g((String) this.f60947c);
            case 20:
                return ((C1293i) ((lm4) ((C1906c) this.f60946b).f23860a)).m7206c((String) this.f60947c);
            case 21:
                return ((C1285a) ((b80) ((C2814a) this.f60946b).f33431a)).m7098b((String) this.f60947c);
            case 22:
                C2815b c2815b = (C2815b) this.f60946b;
                String str2 = (String) this.f60947c;
                C1288d c1288d = (C1288d) c2815b.f33432a;
                c1288d.getClass();
                str2.getClass();
                yp0 yp0Var = c1288d.f16464a;
                yp0Var.getClass();
                return AbstractC3224d.m15536o(AbstractC3584sr.m21590A(yp0Var.f70233K, true, new String[]{"ChallengeEntity"}, new t70(str2, 7)));
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                return xd7.m24465a(((C1523f) this.f60946b).f19947a, (String) this.f60947c);
            case 24:
                ((vi3) this.f60946b).invoke(new gs3(((ns3) this.f60947c).f53182c));
                return xfa.f68157a;
            case 25:
                bh9 bh9Var = (bh9) this.f60946b;
                vi3 vi3Var3 = (vi3) this.f60947c;
                LanguageProgressMetric languageProgressMetric = bh9Var.f8547a;
                if (languageProgressMetric != null) {
                    vi3Var3.invoke(languageProgressMetric);
                }
                return xfa.f68157a;
            case 26:
                ((zi3) this.f60946b).invoke(LanguageProgressPeriod.Last7Days, (LanguageProgressMetric) this.f60947c);
                return xfa.f68157a;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                ((vi3) this.f60946b).invoke((il4) this.f60947c);
                return xfa.f68157a;
            case 28:
                C1909e c1909e = (C1909e) this.f60946b;
                C2535j c2535j = (C2535j) this.f60947c;
                c1909e.m8760d3(n2a.f52243a);
                c2535j.f30816Z.m15571i(null);
                return xfa.f68157a;
            default:
                dh9 dh9Var = (dh9) this.f60946b;
                cy4 cy4Var = (cy4) this.f60947c;
                if (!((Boolean) dh9Var.getValue()).booleanValue()) {
                    cy4Var.mo9448n();
                }
                return xfa.f68157a;
        }
    }
}
