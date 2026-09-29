package p000;

import android.net.ConnectivityManager;
import androidx.activity.compose.C0033a;
import androidx.compose.foundation.C0125l;
import androidx.compose.material3.C0253l;
import androidx.compose.material3.DrawerValue;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.constraints.AbstractC0776b;
import com.lingq.core.achievements.StreakChallengeType;
import com.lingq.core.domain.model.library.LibraryTab;
import com.lingq.core.domain.model.server.ServerEnvironment;
import com.lingq.core.token.C1909e;
import com.lingq.feature.reader.reader.C2493a;
import com.lingq.feature.review.views.unscrambler.SentenceBuilderView;
import com.lingq.feature.search.search.C2779e;
import java.util.HashSet;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a45 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f217a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f218b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f219c;

    public /* synthetic */ a45(int i, Object obj, Object obj2) {
        this.f217a = i;
        this.f218b = obj;
        this.f219c = obj2;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() {
        pf1 pf1Var;
        int i = 0;
        switch (this.f217a) {
            case 0:
                ((vi3) this.f218b).invoke(new n35(((v35) this.f219c).f64785c.f36645a));
                return xfa.f68157a;
            case 1:
                ((vi3) this.f218b).invoke(((s75) this.f219c).f60464a);
                return xfa.f68157a;
            case 2:
                vi3 vi3Var = (vi3) this.f218b;
                ui3 ui3Var = (ui3) this.f219c;
                vi3Var.invoke(null);
                ui3Var.mo0a();
                return xfa.f68157a;
            case 3:
                lq5 lq5Var = (lq5) this.f218b;
                C0125l c0125l = (C0125l) this.f219c;
                fb2 fb2Var = te1.m21979L(c0125l).f4327T;
                c0125l.f2411L.m21222h();
                int iM21222h = c0125l.f2412M.m21222h();
                ((fg2) lq5Var).getClass();
                return Integer.valueOf(ss5.m21693T(0.33333334f * iM21222h));
            case 4:
                ((vi3) this.f218b).invoke(((bm9) this.f219c).f8692a);
                return xfa.f68157a;
            case 5:
                ((vi3) this.f218b).invoke(((v36) this.f219c).f64790a);
                return xfa.f68157a;
            case 6:
                return new C0253l((DrawerValue) this.f219c, (vi3) this.f218b);
            case 7:
                C0253l c0253l = (C0253l) this.f218b;
                float fM19861h = ((qc9) this.f219c).m19861h();
                return Float.valueOf(l70.m15944g((c0253l.f3552b.m852f() - fM19861h) / (0.0f - fM19861h), 0.0f, 1.0f));
            case 8:
                sq5 sq5Var = (sq5) this.f218b;
                y18 y18Var = (y18) this.f219c;
                if (((AtomicInt) sq5Var.f61248b).get() == 0) {
                    y18Var.mo0a();
                }
                return xfa.f68157a;
            case 9:
                ((vi3) this.f218b).invoke((om6) this.f219c);
                return xfa.f68157a;
            case 10:
                return "Only found " + ((Ref$IntRef) this.f218b).f47716a + " digits in a row, but need to parse " + ((zo6) this.f219c).m25725b();
            case 11:
                ((vi3) this.f218b).invoke(new q75((r75) this.f219c));
                return xfa.f68157a;
            case 12:
                ((vi3) this.f218b).invoke(((pw6) this.f219c).f56906a);
                return xfa.f68157a;
            case 13:
                ((vi3) this.f218b).invoke(new o7a(((m7a) this.f219c).f50736a));
                return xfa.f68157a;
            case 14:
                ((vi3) this.f218b).invoke(new l55((ud7) this.f219c, null));
                return xfa.f68157a;
            case 15:
                ((C0033a) this.f218b).f1003d = (zi3) this.f219c;
                return xfa.f68157a;
            case 16:
                vi3 vi3Var2 = (vi3) this.f218b;
                String str = ((fm7) this.f219c).f39292f;
                if (str == null) {
                    str = "";
                }
                vi3Var2.invoke(str);
                return xfa.f68157a;
            case 17:
                C1909e c1909e = (C1909e) this.f218b;
                C2493a c2493a = (C2493a) this.f219c;
                c1909e.m8760d3(n2a.f52243a);
                c2493a.m9389V2(ur7.f64248a);
                return xfa.f68157a;
            case 18:
                ((vi3) this.f218b).invoke(new y98((rc8) this.f219c));
                return xfa.f68157a;
            case 19:
                return pb1.m19041k((String) this.f218b, ug7.f63891y, new SerialDescriptor[0], new ko8((lo8) this.f219c, i));
            case 20:
                mo8 mo8Var = (mo8) this.f219c;
                vi3 vi3Var3 = (vi3) this.f218b;
                hs8 hs8Var = mo8Var.f51648b;
                if ((hs8Var instanceof fs8) || (hs8Var instanceof gs8)) {
                    vi3Var3.invoke(hs8Var);
                }
                return xfa.f68157a;
            case 21:
                ((vi3) this.f218b).invoke(new qs8((pq8) this.f219c));
                return xfa.f68157a;
            case 22:
                C2779e c2779e = (C2779e) this.f218b;
                ij7 ij7Var = (ij7) this.f219c;
                c2779e.m9706W2(new tr8(ij7Var.f44189a, ij7Var.f44191c));
                return xfa.f68157a;
            case DescriptorProtos.FileOptions.DEPRECATED_FIELD_NUMBER /* 23 */:
                ((vi3) this.f218b).invoke((LibraryTab) this.f219c);
                return xfa.f68157a;
            case 24:
                SentenceBuilderView sentenceBuilderView = (SentenceBuilderView) this.f218b;
                sx8 sx8Var = (sx8) this.f219c;
                HashSet hashSet = sentenceBuilderView.f32809h;
                hashSet.remove(sx8Var);
                if (!hashSet.isEmpty()) {
                    sentenceBuilderView.m9663b(true);
                }
                return xfa.f68157a;
            case 25:
                ((t66) this.f219c).setValue(((ServerEnvironment) this.f218b).name());
                return xfa.f68157a;
            case 26:
                h85 h85Var = (h85) this.f218b;
                ConnectivityManager connectivityManager = (ConnectivityManager) this.f219c;
                synchronized (d59.f35018b) {
                    LinkedHashMap linkedHashMap = d59.f35019c;
                    linkedHashMap.remove(h85Var);
                    if (linkedHashMap.isEmpty()) {
                        oj5.m18040f().m18042a(AbstractC0776b.f7235a, "NetworkRequestConstraintController unregister shared callback");
                        connectivityManager.unregisterNetworkCallback(d59.f35017a);
                        d59.f35022f = null;
                        d59.f35020d = null;
                        d59.f35021e = false;
                    }
                    break;
                }
                return xfa.f68157a;
            case DescriptorProtos.FileOptions.JAVA_STRING_CHECK_UTF8_FIELD_NUMBER /* 27 */:
                sb9 sb9Var = (sb9) this.f218b;
                cz2 cz2Var = (cz2) this.f219c;
                if (!fa4.m11650l(sb9Var, cz2Var.f34731a)) {
                    u91.m22606X0(new cg7(sb9Var, 21), cz2Var.f34732b);
                    x18 x18Var = cz2Var.f34733c;
                    if (x18Var != null && (pf1Var = x18Var.f67639a) != null) {
                        pf1Var.m19103s(x18Var, null);
                    }
                }
                return xfa.f68157a;
            case 28:
                return ((ql4) this.f218b).invoke((WorkDatabase) this.f219c);
            default:
                ((vi3) this.f218b).invoke(Integer.valueOf(((StreakChallengeType) this.f219c).getDays()));
                return xfa.f68157a;
        }
    }

    public /* synthetic */ a45(Object obj, vi3 vi3Var, int i) {
        this.f217a = i;
        this.f219c = obj;
        this.f218b = vi3Var;
    }
}
