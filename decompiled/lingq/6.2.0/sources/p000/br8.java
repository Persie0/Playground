package p000;

import android.app.PendingIntent;
import android.app.RemoteAction;
import android.webkit.WebChromeClient;
import androidx.compose.material3.C0228e0;
import androidx.compose.runtime.AbstractC0278f;
import com.lingq.core.domain.model.server.ServerEnvironment;
import com.lingq.core.domain.model.status.CardStatus;
import com.lingq.core.domain.model.vocabulary.VocabularySearchQuery;
import com.lingq.core.premium.R$id;
import com.lingq.core.premium.UpgradeTestFragment;
import com.lingq.core.token.C1909e;
import com.lingq.core.web.WebViewFragment;
import com.lingq.feature.imports.UserImportTypeFragment;
import com.lingq.feature.library.yir.YearInReviewFragment;
import com.lingq.feature.statistics.StatsShareFragment;
import com.lingq.feature.vocabulary.C2824b;
import com.lingq.feature.vocabulary.filter.VocabularyFilterFragment;
import com.lingq.feature.vocabulary.filter.VocabularyFilterSelectionFragment;
import com.lingq.feature.vocabulary.filter.VocabularyParentFilterFragment;
import java.math.BigInteger;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class br8 implements ui3 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f8899a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8900b;

    public /* synthetic */ br8(Object obj, int i) {
        this.f8899a = i;
        this.f8900b = obj;
    }

    @Override // p000.ui3
    /* JADX INFO: renamed from: a */
    public final Object mo0a() throws PendingIntent.CanceledException {
        ui3 ui3Var;
        int i = this.f8899a;
        xfa xfaVar = xfa.f68157a;
        Object obj = this.f8900b;
        switch (i) {
            case 0:
                return AbstractC0278f.m1260j(((xq8) obj).f68545b);
            case 1:
                return AbstractC0278f.m1260j(((ServerEnvironment) obj).name());
            case 2:
                j39 j39Var = (j39) obj;
                t66 t66Var = j39Var.f45023c;
                if (((x89) ((xc9) t66Var).getValue()).f67935a == 9205357640488583168L || x89.m24408e(((x89) ((xc9) t66Var).getValue()).f67935a)) {
                    return null;
                }
                return j39Var.f45021a.mo11320c(((x89) ((xc9) t66Var).getValue()).f67935a);
            case 3:
                C0228e0 c0228e0 = (C0228e0) obj;
                if (!((Boolean) ((xc9) c0228e0.f3413n).getValue()).booleanValue() && (ui3Var = c0228e0.f3401b) != null) {
                    ui3Var.mo0a();
                }
                return xfaVar;
            case 4:
                yl4 yl4Var = (yl4) obj;
                bh4[] bh4VarArr = StatsShareFragment.f33326U0;
                return Float.valueOf(((float) yl4Var.f69989b) / ((float) yl4Var.f69990c));
            case 5:
                pvc.m19497E(((RemoteAction) obj).getActionIntent());
                return xfaVar;
            case 6:
                return ((eu9) obj).f37900k;
            case 7:
                return new xj2(AbstractC3423or.m18232Q(24.0f, 16.0f, ((su9) obj).mo169a()));
            case 8:
                UpgradeTestFragment upgradeTestFragment = (UpgradeTestFragment) obj;
                if (!b34.m3244j(upgradeTestFragment).f63760b.m13133l(R$id.nav_graph_free_trial, true)) {
                    b34.m3244j(upgradeTestFragment).m22689f();
                }
                return xfaVar;
            case 9:
                b34.m3244j((UserImportTypeFragment) obj).m22689f();
                return xfaVar;
            case 10:
                kpa kpaVar = (kpa) obj;
                return BigInteger.valueOf(kpaVar.f48301a).shiftLeft(32).or(BigInteger.valueOf(kpaVar.f48302b)).shiftLeft(32).or(BigInteger.valueOf(kpaVar.f48303c));
            case 11:
                return ((VocabularyFilterFragment) obj).m2091S().m2091S();
            case 12:
                return ((VocabularyFilterSelectionFragment) obj).m2091S().m2091S();
            case 13:
                return (VocabularyParentFilterFragment) obj;
            case 14:
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                VocabularySearchQuery vocabularySearchQuery = (VocabularySearchQuery) ref$ObjectRef.f47718a;
                int i2 = vocabularySearchQuery.f19859a;
                vocabularySearchQuery.f19859a = i2 + 1;
                Integer numValueOf = Integer.valueOf(i2);
                if (i2 < ((VocabularySearchQuery) ref$ObjectRef.f47718a).f19860b) {
                    return numValueOf;
                }
                return null;
            case 15:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj;
                int i3 = ref$IntRef.f47716a;
                ref$IntRef.f47716a = i3 + 1;
                Integer numValueOf2 = Integer.valueOf(i3);
                if (i3 <= CardStatus.Known.getValue()) {
                    return numValueOf2;
                }
                return null;
            case 16:
                ((C2824b) obj).m9744V2(uwa.f64479a);
                return xfaVar;
            case 17:
                ((C1909e) obj).m8760d3(n2a.f52243a);
                return xfaVar;
            case 18:
                WebViewFragment webViewFragment = (WebViewFragment) obj;
                bh4[] bh4VarArr2 = WebViewFragment.f24315V0;
                if (webViewFragment.m8805A0().f51281c.canGoBack()) {
                    webViewFragment.m8805A0().f51281c.goBack();
                } else {
                    b34.m3244j(webViewFragment).m22689f();
                }
                return Boolean.TRUE;
            case 19:
                ((WebChromeClient.CustomViewCallback) obj).onCustomViewHidden();
                return xfaVar;
            case 20:
                os2.m18458a((w7b) obj);
                return xfaVar;
            case 21:
                b34.m3244j((YearInReviewFragment) obj).m22689f();
                return xfaVar;
            default:
                return Float.valueOf(((sc9) obj).m21222h() / 100.0f);
        }
    }
}
